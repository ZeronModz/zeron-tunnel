package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzcjl;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class eg2 implements zzbde {
    public final zzcjl a;
    public final Executor b;
    public final AtomicReference c = new AtomicReference();

    public eg2(zzcjl zzcjlVar, Executor executor) {
        this.a = zzcjlVar;
        this.b = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final synchronized void zzdj(zzbdd zzbddVar) {
        zzcjl zzcjlVar = this.a;
        if (zzcjlVar != null) {
            if (((Boolean) zzbd.zzc().a(p32.be)).booleanValue()) {
                boolean z = zzbddVar.j;
                AtomicReference atomicReference = this.c;
                if (z) {
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.b.execute(new yb2(zzcjlVar, 3));
                    }
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference.getAndSet(bool2))) {
                        this.b.execute(new yb2(zzcjlVar, 2));
                    }
                }
            }
        }
    }
}
