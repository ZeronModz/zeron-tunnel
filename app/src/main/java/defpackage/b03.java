package defpackage;

import com.google.android.gms.internal.ads.d6;
import com.google.android.gms.internal.ads.l7;
import com.google.android.gms.internal.ads.r5;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b03 implements zzgyw {
    public final /* synthetic */ int a;
    public final /* synthetic */ d6 b;
    public final /* synthetic */ r5 c;

    public /* synthetic */ b03(d6 d6Var, r5 r5Var, int i) {
        this.a = i;
        this.b = d6Var;
        this.c = r5Var;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final ListenableFuture zza(Object obj) {
        int i = this.a;
        r5 r5Var = this.c;
        d6 d6Var = this.b;
        switch (i) {
            case 0:
                l7 l7VarB = d6Var.b.b(r5Var);
                d6Var.i.e(15303, l7VarB);
                return l7VarB;
            default:
                l7 l7VarB2 = d6Var.b.b(r5Var);
                d6Var.i.e(15303, l7VarB2);
                return l7VarB2;
        }
    }
}
