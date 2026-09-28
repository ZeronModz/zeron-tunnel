package defpackage;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pn2 extends AdListener {
    public final /* synthetic */ qn2 a;

    public pn2(qn2 qn2Var) {
        Objects.requireNonNull(qn2Var);
        this.a = qn2Var;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.a.c(qn2.f(loadAdError));
    }
}
