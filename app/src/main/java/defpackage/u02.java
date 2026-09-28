package defpackage;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class u02 implements AppOpsManager$OnOpActiveChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u02(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        switch (this.a) {
            case 0:
                v02 v02Var = (v02) this.b;
                if (z) {
                    v02Var.a = System.currentTimeMillis();
                    v02Var.d = true;
                    return;
                }
                long j = v02Var.b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (j > 0) {
                    long j2 = v02Var.b;
                    if (jCurrentTimeMillis >= j2) {
                        v02Var.c = jCurrentTimeMillis - j2;
                    }
                }
                v02Var.d = false;
                return;
            default:
                q03 q03Var = (q03) this.b;
                synchronized (q03Var) {
                    try {
                        if (z) {
                            q03Var.c = System.currentTimeMillis();
                            q03Var.f = true;
                        } else {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            long j3 = q03Var.d;
                            if (j3 > 0 && jCurrentTimeMillis2 >= j3) {
                                q03Var.e = jCurrentTimeMillis2 - j3;
                            }
                            q03Var.f = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
