package coil3.fetch;

import coil3.graphics.DataSource;
import coil3.graphics.ImageSource;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.yg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcoil3/fetch/SourceFetchResult;", "Lcoil3/fetch/FetchResult;", "Lcoil3/decode/ImageSource;", "source", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "mimeType", "Lcoil3/decode/DataSource;", "dataSource", "<init>", "(Lcoil3/decode/ImageSource;Ljava/lang/String;Lcoil3/decode/DataSource;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SourceFetchResult implements FetchResult {
    public final ImageSource a;
    public final String b;
    public final DataSource c;

    public SourceFetchResult(ImageSource imageSource, String str, DataSource dataSource) {
        this.a = imageSource;
        this.b = str;
        this.c = dataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceFetchResult)) {
            return false;
        }
        SourceFetchResult sourceFetchResult = (SourceFetchResult) obj;
        return yg0.a(this.a, sourceFetchResult.a) && yg0.a(this.b, sourceFetchResult.b) && this.c == sourceFetchResult.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.a + ", mimeType=" + this.b + ", dataSource=" + this.c + ')';
    }
}
