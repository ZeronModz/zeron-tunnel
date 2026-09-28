package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.d4;
import com.google.android.gms.internal.ads.td;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbz;
import com.google.android.gms.internal.ads.zzdx;
import com.google.android.gms.internal.ads.zzftr;
import com.google.android.gms.internal.ads.zzpx;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.appupdate.zzc;
import com.google.zxing.client.android.InactivityTimer;
import com.v2ray.ang.ui.HomeFragment;
import java.util.Objects;
import kotlin.Lazy;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class r6 extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ r6(zzbz zzbzVar, zzdx zzdxVar) {
        this.a = 6;
        this.b = zzdxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.a;
        int i2 = 4;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((s6) obj).d();
                break;
            case 1:
                context.getClass();
                intent.getClass();
                ((BroadcastReceiverConstraintTracker) obj).f(intent);
                break;
            case 2:
                HomeFragment homeFragment = (HomeFragment) obj;
                String action = intent != null ? intent.getAction() : null;
                if (action != null) {
                    int iHashCode = action.hashCode();
                    if (iHashCode != 185619073) {
                        if (iHashCode == 621215415 && action.equals("COUNTDOWN_UPDATE")) {
                            long longExtra = intent.getLongExtra("millisLeft", 0L);
                            String strW0 = HomeFragment.w0(longExtra);
                            TextView textView = homeFragment.b1;
                            if (textView != null) {
                                textView.setText(strW0);
                            }
                            Lazy lazy = zq0.a;
                            zq0.u().h(longExtra, "TimeLeft");
                        }
                        break;
                    } else if (action.equals("COUNTDOWN_FINISH")) {
                        qf3.L(homeFragment.M(), "Please Add Time");
                        homeFragment.J0();
                        break;
                    }
                }
                break;
            case 3:
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    ((InactivityTimer) obj).d.post(new n4(i2, this, intent.getIntExtra("plugged", -1) <= 0));
                }
                break;
            case 4:
                ((zzbar) obj).c();
                break;
            case 5:
                ((zzbdg) obj).d(3);
                break;
            case 6:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    ((zzdx) obj).zzn(new g10(i2));
                }
                break;
            case 7:
                ((zzcg) obj).zzd(context, intent);
                break;
            case 8:
                ((d4) obj).a.execute(new wn2(i2, this, context));
                break;
            case 9:
                zzftr zzftrVar = (zzftr) obj;
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    zzftrVar.a(true, zzftrVar.c);
                    zzftrVar.b = true;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    zzftrVar.a(false, zzftrVar.c);
                    zzftrVar.b = false;
                }
                break;
            case 10:
                zzc zzcVar = (zzc) ((kg3) obj);
                boolean zEquals = context.getPackageName().equals(intent.getStringExtra("package.name"));
                zzm zzmVar = zzcVar.a;
                if (zEquals) {
                    zzmVar.a("List of extras in received intent:", new Object[0]);
                    for (String str : intent.getExtras().keySet()) {
                        zzmVar.a("Key: %s; value: %s", str, intent.getExtras().get(str));
                    }
                    zzmVar.a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
                    zzmVar.a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
                    zzmVar.a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
                    su1 su1Var = new su1(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
                    zzmVar.a("ListenerRegistryBroadcastReceiver.onReceive: %s", su1Var);
                    zzcVar.c(su1Var);
                } else {
                    zzmVar.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
                }
                break;
            case 11:
                if (!isInitialStickyBroadcast()) {
                    zzpx zzpxVar = (zzpx) obj;
                    zzpxVar.a(td.b(context, intent, zzpxVar.i, zzpxVar.h));
                }
                break;
            default:
                zzs zzsVar = (zzs) obj;
                if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
                    zzsVar.zzo(true);
                } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    zzsVar.zzo(false);
                }
                break;
        }
    }

    public /* synthetic */ r6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
