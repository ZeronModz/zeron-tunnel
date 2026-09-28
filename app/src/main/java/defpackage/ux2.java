package defpackage;

import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.zzghq;
import com.google.android.gms.internal.ads.zzghr;
import com.google.android.gms.internal.ads.zzghs;
import com.google.android.gms.internal.ads.zzght;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ux2 implements zzghq, zzghs {
    public final l5 a;

    public /* synthetic */ ux2(l5 l5Var) {
        this.a = l5Var;
    }

    @Override // com.google.android.gms.internal.ads.zzghq
    public zzghr zza() {
        return new vx2(this.a, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzghs
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public zzght mo81zza() {
        return new vx2(this.a, 1);
    }
}
