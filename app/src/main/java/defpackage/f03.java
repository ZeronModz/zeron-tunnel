package defpackage;

import com.google.android.gms.internal.ads.e6;
import com.google.android.gms.internal.ads.l7;
import com.google.android.gms.internal.ads.r5;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f03 implements zzgyw {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;
    public final /* synthetic */ r5 c;

    public /* synthetic */ f03(e6 e6Var, r5 r5Var, int i) {
        this.a = i;
        this.b = e6Var;
        this.c = r5Var;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final ListenableFuture zza(Object obj) {
        int i = this.a;
        r5 r5Var = this.c;
        e6 e6Var = this.b;
        switch (i) {
            case 0:
                l7 l7VarB = e6Var.a.b(r5Var);
                e6Var.d.e(20303, l7VarB);
                return l7VarB;
            default:
                l7 l7VarB2 = e6Var.a.b(r5Var);
                e6Var.d.e(20303, l7VarB2);
                return l7VarB2;
        }
    }
}
