package coil3.fetch;

import coil3.ImageLoader;
import coil3.Uri;
import coil3.fetch.Fetcher;
import coil3.graphics.DataSource;
import coil3.graphics.SourceImageSource;
import coil3.request.Options;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import defpackage.io0;
import defpackage.u7;
import defpackage.xm;
import defpackage.xu;
import defpackage.yg0;
import kotlin.Metadata;
import kotlin.collections.AbstractList$Companion;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.io.encoding.Base64;
import kotlin.text.g;
import okio.Buffer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcoil3/fetch/DataUriFetcher;", "Lcoil3/fetch/Fetcher;", "Lcoil3/Uri;", "uri", "Lcoil3/request/Options;", "options", "<init>", "(Lcoil3/Uri;Lcoil3/request/Options;)V", "Factory", "Companion", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DataUriFetcher implements Fetcher {
    public final Uri a;
    public final Options b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/fetch/DataUriFetcher$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "BASE64_TAG", "Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/fetch/DataUriFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Lcoil3/Uri;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements Fetcher.Factory<Uri> {
        @Override // coil3.fetch.Fetcher.Factory
        public final Fetcher create(Uri uri, Options options, ImageLoader imageLoader) {
            Uri uri2 = uri;
            if (yg0.a(uri2.c, Constants$ScionAnalytics$MessageType.DATA_MESSAGE)) {
                return new DataUriFetcher(uri2, options);
            }
            return null;
        }
    }

    static {
        new Companion(null);
    }

    public DataUriFetcher(Uri uri, Options options) {
        this.a = uri;
        this.b = options;
    }

    @Override // coil3.fetch.Fetcher
    public final Object fetch(Continuation continuation) {
        Uri uri = this.a;
        String str = uri.a;
        String str2 = uri.a;
        int iZ = g.z(str, ";base64,", 0, false, 6);
        if (iZ == -1) {
            io0.r(uri, "invalid data uri: ");
            return null;
        }
        int iY = g.y(str2, ':', 0, 6);
        if (iY == -1) {
            io0.r(uri, "invalid data uri: ");
            return null;
        }
        String strSubstring = str2.substring(iY + 1, iZ);
        Base64.Default r4 = Base64.f;
        int i = iZ + 8;
        int length = str2.length();
        r4.getClass();
        int length2 = str2.length();
        AbstractList$Companion abstractList$Companion = a.Companion;
        abstractList$Companion.getClass();
        AbstractList$Companion.a(i, length, length2);
        byte[] bytes = str2.substring(i, length).getBytes(xm.b);
        bytes.getClass();
        int length3 = bytes.length;
        int length4 = bytes.length;
        abstractList$Companion.getClass();
        AbstractList$Companion.a(0, length3, length4);
        int iC = r4.c(length3, bytes);
        byte[] bArr = new byte[iC];
        if (r4.b(bytes, 0, bArr, length3) != iC) {
            u7.p("Check failed.");
            return null;
        }
        Buffer buffer = new Buffer();
        buffer.m68write(bArr, 0, iC);
        return new SourceFetchResult(new SourceImageSource(buffer, this.b.f, null), strSubstring, DataSource.MEMORY);
    }
}
