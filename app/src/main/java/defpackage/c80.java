package defpackage;

import androidx.camera.camera2.internal.d0;
import androidx.concurrent.futures.b;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;

    public /* synthetic */ c80(Object obj, long j, int i) {
        this.a = i;
        this.b = obj;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                d0 d0Var = (d0) obj;
                d0Var.b.execute(new c80(d0Var, j, 3));
                break;
            case 1:
                d0 d0Var2 = (d0) obj;
                d0Var2.b.execute(new c80(d0Var2, j, 2));
                break;
            case 2:
                d0 d0Var3 = (d0) obj;
                if (j == d0Var3.k) {
                    d0Var3.b(null);
                }
                break;
            case 3:
                d0 d0Var4 = (d0) obj;
                if (j == d0Var4.k) {
                    d0Var4.m = false;
                    ScheduledFuture scheduledFuture = d0Var4.j;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                        d0Var4.j = null;
                    }
                    b bVar = d0Var4.t;
                    if (bVar != null) {
                        bVar.b(new f80(false));
                        d0Var4.t = null;
                    }
                }
                break;
            default:
                gu guVar = (gu) obj;
                guVar.a.setError(String.format(guVar.e, qf3.l(j).replace(' ', (char) 160)));
                guVar.a();
                break;
        }
    }
}
