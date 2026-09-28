package defpackage;

import com.google.android.play.core.appupdate.internal.zzn;
import com.google.android.play.core.appupdate.internal.zzx;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class yj3 extends zzn {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yj3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzn
    public final void a() {
        switch (this.b) {
            case 0:
                synchronized (((zzx) this.c).f) {
                    try {
                        if (((zzx) this.c).k.get() > 0 && ((zzx) this.c).k.decrementAndGet() > 0) {
                            ((zzx) this.c).b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        zzx zzxVar = (zzx) this.c;
                        if (zzxVar.m != null) {
                            zzxVar.b.c("Unbind from service.", new Object[0]);
                            zzx zzxVar2 = (zzx) this.c;
                            zzxVar2.a.unbindService(zzxVar2.l);
                            zzxVar = (zzx) this.c;
                            zzxVar.g = false;
                            zzxVar.m = null;
                            zzxVar.l = null;
                        }
                        zzxVar.d();
                        return;
                    } finally {
                    }
                }
            default:
                zzx zzxVar3 = (zzx) ((f13) this.c).b;
                zzxVar3.b.c("unlinkToDeath", new Object[0]);
                zzxVar3.m.asBinder().unlinkToDeath(zzxVar3.j, 0);
                zzxVar3.m = null;
                zzxVar3.g = false;
                return;
        }
    }
}
