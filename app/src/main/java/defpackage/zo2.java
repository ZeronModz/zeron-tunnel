package defpackage;

import android.app.AlertDialog;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.internal.ads.zzejf;
import com.google.android.gms.internal.ads.zzfsu;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zo2 extends TimerTask {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Timer b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public zo2(aw2 aw2Var, zzfsu zzfsuVar, Timer timer) {
        this.c = zzfsuVar;
        this.b = timer;
        Objects.requireNonNull(aw2Var);
        this.d = aw2Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i = this.a;
        Timer timer = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ((AlertDialog) obj).dismiss();
                timer.cancel();
                zzm zzmVar = (zzm) obj2;
                if (zzmVar != null) {
                    zzmVar.zzb();
                    return;
                }
                return;
            default:
                WebView webView = ((aw2) obj2).b;
                int i2 = sp1.a;
                if (!vp1.i.b()) {
                    throw vp1.a();
                }
                sp1.b(webView).a.removeWebMessageListener("omidJsSessionService");
                ((zzfsu) obj).zza(true);
                timer.cancel();
                return;
        }
    }

    public zo2(zzejf zzejfVar, AlertDialog alertDialog, Timer timer, zzm zzmVar) {
        this.c = alertDialog;
        this.b = timer;
        this.d = zzmVar;
    }
}
