package defpackage;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.v2ray.ang.adapter.ServerAdapter;
import com.v2ray.ang.ui.HomeFragment;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class td0 extends FullScreenContentCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ td0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                HomeFragment homeFragment = (HomeFragment) obj;
                homeFragment.o1 = null;
                homeFragment.o0();
                break;
            default:
                ((ServerAdapter) obj).j = null;
                break;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        int i = this.a;
        Object obj = this.b;
        adError.getClass();
        switch (i) {
            case 0:
                HomeFragment homeFragment = (HomeFragment) obj;
                homeFragment.o1 = null;
                homeFragment.o0();
                break;
            default:
                ((ServerAdapter) obj).j = null;
                adError.getMessage();
                break;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        int i = this.a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
