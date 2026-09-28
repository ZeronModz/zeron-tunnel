package defpackage;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.internal.ads.z;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ip2 {
    public final Context a;

    public ip2(Context context) {
        this.a = context;
    }

    public final ListenableFuture a(boolean z) {
        try {
            new GetTopicsRequest.Builder();
            GetTopicsRequest getTopicsRequest = new GetTopicsRequest(MobileAds.ERROR_DOMAIN, z);
            TopicsManagerFutures topicsManagerFuturesA = TopicsManagerFutures.a(this.a);
            return topicsManagerFuturesA != null ? topicsManagerFuturesA.b(getTopicsRequest) : z.v(new IllegalStateException());
        } catch (Exception e) {
            return z.v(e);
        }
    }
}
