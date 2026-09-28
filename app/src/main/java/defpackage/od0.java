package defpackage;

import android.os.SystemClock;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.v2ray.ang.ui.HomeFragment;
import kotlin.Lazy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class od0 extends FullScreenContentCallback {
    public final /* synthetic */ HomeFragment a;
    public final /* synthetic */ FragmentActivity b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ JSONArray d;
    public final /* synthetic */ String e;

    public od0(HomeFragment homeFragment, FragmentActivity fragmentActivity, boolean z, JSONArray jSONArray, String str) {
        this.a = homeFragment;
        this.b = fragmentActivity;
        this.c = z;
        this.d = jSONArray;
        this.e = str;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        HomeFragment homeFragment = this.a;
        homeFragment.F1 = null;
        homeFragment.l0(this.b);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        adError.getClass();
        HomeFragment homeFragment = this.a;
        homeFragment.F1 = null;
        homeFragment.l0(this.b);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() throws JSONException {
        boolean z = this.c;
        HomeFragment homeFragment = this.a;
        if (z) {
            ImageView imageView = homeFragment.N1;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            JSONObject jSONObject = new JSONObject();
            Lazy lazy = zq0.a;
            jSONObject.put("name", zq0.D());
            jSONObject.put("dateCreated", this.e);
            JSONArray jSONArray = this.d;
            jSONArray.put(jSONObject);
            String string = jSONArray.toString();
            string.getClass();
            zq0.u().i("BoostedServer", string);
            qf3.L(homeFragment.M(), "Server Boosted!!!");
        }
        homeFragment.t1 = SystemClock.elapsedRealtime();
    }
}
