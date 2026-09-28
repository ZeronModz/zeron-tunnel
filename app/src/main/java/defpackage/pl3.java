package defpackage;

import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzeak;
import com.google.android.gms.tasks.g;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pl3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pl3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                g gVar = (g) obj2;
                try {
                    gVar.r(((Callable) obj).call());
                } catch (Exception e) {
                    gVar.q(e);
                    return;
                } catch (Throwable th) {
                    gVar.q(new RuntimeException(th));
                    return;
                }
                break;
            default:
                ((zzeak) obj2).i.execute(new kc2((zzcen) obj, 12));
                break;
        }
    }
}
