package com.v2ray.ang.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.dto.ProfileItem;
import defpackage.k5;
import defpackage.ul1;
import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.text.Regex;
import libv2ray.CoreController;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/v2ray/ang/service/QSTileService;", "Landroid/service/quicksettings/TileService;", "<init>", "()V", "ReceiveMessageHandler", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QSTileService extends TileService {
    public BroadcastReceiver a;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/v2ray/ang/service/QSTileService$ReceiveMessageHandler;", "Landroid/content/BroadcastReceiver;", "Lcom/v2ray/ang/service/QSTileService;", "context", "<init>", "(Lcom/v2ray/ang/service/QSTileService;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ReceiveMessageHandler extends BroadcastReceiver {
        public final SoftReference a;

        public ReceiveMessageHandler(QSTileService qSTileService) {
            qSTileService.getClass();
            this.a = new SoftReference(qSTileService);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            QSTileService qSTileService = (QSTileService) this.a.get();
            Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("key", 0)) : null;
            if (numValueOf != null && numValueOf.intValue() == 11) {
                if (qSTileService != null) {
                    qSTileService.a(2);
                    return;
                }
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 12) {
                if (qSTileService != null) {
                    qSTileService.a(1);
                    return;
                }
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 31) {
                if (qSTileService != null) {
                    qSTileService.a(2);
                }
            } else if (numValueOf != null && numValueOf.intValue() == 32) {
                if (qSTileService != null) {
                    qSTileService.a(1);
                }
            } else {
                if (numValueOf == null || numValueOf.intValue() != 41 || qSTileService == null) {
                    return;
                }
                qSTileService.a(1);
            }
        }
    }

    public final void a(int i) {
        if (i == 1) {
            Tile qsTile = getQsTile();
            if (qsTile != null) {
                qsTile.setState(1);
            }
            Tile qsTile2 = getQsTile();
            if (qsTile2 != null) {
                qsTile2.setLabel(getString(R.string.app_name));
            }
            Tile qsTile3 = getQsTile();
            if (qsTile3 != null) {
                qsTile3.setIcon(Icon.createWithResource(getApplicationContext(), R.drawable.ic_stat_name));
            }
        } else if (i == 2) {
            Tile qsTile4 = getQsTile();
            if (qsTile4 != null) {
                qsTile4.setState(2);
            }
            Tile qsTile5 = getQsTile();
            if (qsTile5 != null) {
                CoreController coreController = b.a;
                ProfileItem profileItem = b.c;
                String remarks = profileItem != null ? profileItem.getRemarks() : null;
                if (remarks == null) {
                    remarks = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                qsTile5.setLabel(remarks);
            }
            Tile qsTile6 = getQsTile();
            if (qsTile6 != null) {
                qsTile6.setIcon(Icon.createWithResource(getApplicationContext(), R.drawable.ic_stat_name));
            }
        }
        Tile qsTile7 = getQsTile();
        if (qsTile7 != null) {
            qsTile7.updateTile();
        }
    }

    public final void onClick() {
        super.onClick();
        int state = getQsTile().getState();
        if (state == 1) {
            CoreController coreController = b.a;
            b.e(this);
        } else {
            if (state != 2) {
                return;
            }
            CoreController coreController2 = b.a;
            b.g(this);
        }
    }

    public final void onStartListening() {
        super.onStartListening();
        a(1);
        this.a = new ReceiveMessageHandler(this);
        IntentFilter intentFilter = new IntentFilter("com.v2ray.ang.action.activity");
        Context applicationContext = getApplicationContext();
        BroadcastReceiver broadcastReceiver = this.a;
        Regex regex = ul1.a;
        k5.B(applicationContext, broadcastReceiver, intentFilter, Build.VERSION.SDK_INT >= 33 ? 2 : 4);
        try {
            Intent intent = new Intent();
            intent.setAction("com.v2ray.ang.action.service");
            intent.setPackage("dev.zeron.tunnel");
            intent.putExtra("key", 1);
            intent.putExtra("content", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            sendBroadcast(intent);
        } catch (Exception unused) {
        }
    }

    public final void onStopListening() {
        super.onStopListening();
        try {
            getApplicationContext().unregisterReceiver(this.a);
            this.a = null;
        } catch (Exception unused) {
        }
    }
}
