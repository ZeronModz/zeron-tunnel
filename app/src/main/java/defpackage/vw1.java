package defpackage;

import com.google.android.gms.internal.ads.zzafj;
import com.google.android.gms.internal.ads.zzafw;
import com.google.android.gms.internal.ads.zzafy;
import com.google.android.gms.internal.ads.zzafz;
import com.google.android.gms.internal.ads.zzagf;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vw1 extends zzafj {
    public final /* synthetic */ zzafy b;
    public final /* synthetic */ zzagf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw1(zzagf zzagfVar, zzafy zzafyVar, zzafy zzafyVar2) {
        super(zzafyVar);
        this.b = zzafyVar2;
        this.c = zzagfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafj, com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j) {
        zzafw zzafwVarZzc = this.b.zzc(j);
        zzafz zzafzVar = zzafwVarZzc.a;
        long j2 = zzafzVar.a;
        long j3 = zzafzVar.b;
        zzagf zzagfVar = this.c;
        zzafz zzafzVar2 = new zzafz(j2, j3 + zzagfVar.a);
        zzafz zzafzVar3 = zzafwVarZzc.b;
        return new zzafw(zzafzVar2, new zzafz(zzafzVar3.a, zzafzVar3.b + zzagfVar.a));
    }
}
