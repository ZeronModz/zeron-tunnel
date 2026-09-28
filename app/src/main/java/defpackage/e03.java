package defpackage;

import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.l7;
import com.google.android.gms.internal.ads.r5;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzgky;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class e03 implements zzgky {
    public final rz2 a;
    public final ExecutorService b;
    public final f6 c;

    public e03(rz2 rz2Var, ExecutorService executorService, f6 f6Var) {
        this.a = rz2Var;
        this.b = executorService;
        this.c = f6Var;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final ListenableFuture zza() {
        return z.j(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final ListenableFuture zzb() {
        l7 l7VarY = z.y(new d03(this, 1), this.b);
        this.c.e(15302, l7VarY);
        return l7VarY;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final ListenableFuture zzc(r5 r5Var, byte[] bArr, byte[] bArr2) {
        l7 l7VarY = z.y(new ik2(this, r5Var, bArr, bArr2, 6), this.b);
        this.c.e(15321, l7VarY);
        return l7VarY;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final ListenableFuture zzd(r5 r5Var, byte[] bArr) {
        l7 l7VarY = z.y(new ax1(this, 5, r5Var, bArr), this.b);
        this.c.e(15305, l7VarY);
        return l7VarY;
    }

    @Override // com.google.android.gms.internal.ads.zzgky
    public final ListenableFuture zze() {
        l7 l7VarY = z.y(new d03(this, 0), this.b);
        this.c.e(15314, l7VarY);
        return l7VarY;
    }
}
