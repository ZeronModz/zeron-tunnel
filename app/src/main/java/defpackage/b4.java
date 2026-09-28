package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.iphunt.sandoki.ui.AirplaneModeActivity;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AirplaneModeActivity b;

    public /* synthetic */ b4(AirplaneModeActivity airplaneModeActivity, int i) {
        this.a = i;
        this.b = airplaneModeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AirplaneModeActivity airplaneModeActivity = this.b;
        switch (i) {
            case 0:
                int i2 = AirplaneModeActivity.A;
                airplaneModeActivity.b.a();
                break;
            case 1:
                int i3 = AirplaneModeActivity.A;
                if (!airplaneModeActivity.x) {
                    airplaneModeActivity.g();
                    d4 d4Var = new d4(airplaneModeActivity);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Handler handler = new Handler(Looper.getMainLooper());
                    handler.post(new h4(d4Var, jCurrentTimeMillis, handler));
                    break;
                }
                break;
            default:
                int i4 = AirplaneModeActivity.A;
                airplaneModeActivity.h();
                break;
        }
    }
}
