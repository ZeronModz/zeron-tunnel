package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzgdd;
import com.google.android.gms.internal.ads.zzgnb;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class p03 extends BroadcastReceiver implements zzgnb, zzgdd {
    public final Context a;
    public final ExecutorService b;
    public boolean c = true;

    public p03(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }

    public final synchronized void a(boolean z) {
        this.c = z;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            synchronized (this) {
                this.c = true;
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            a(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final ListenableFuture zza() {
        return z.y(new us2(this, 11), this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzb(Map map) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        map.put("up", Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzc(Map map, Context context, View view) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        map.put("up", Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzd(Map map) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        map.put("up", Boolean.valueOf(z));
    }
}
