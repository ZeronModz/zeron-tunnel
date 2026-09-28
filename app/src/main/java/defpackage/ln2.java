package defpackage;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ln2 extends AdListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ BaseAdView b;
    public final /* synthetic */ qn2 c;

    public ln2(qn2 qn2Var, String str, BaseAdView baseAdView) {
        this.a = str;
        this.b = baseAdView;
        Objects.requireNonNull(qn2Var);
        this.c = qn2Var;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.c.c(qn2.f(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        String str = this.a;
        this.c.b(this.b, str);
    }
}
