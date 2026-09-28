package coil3.fetch;

import android.graphics.Bitmap;
import android.webkit.MimeTypeMap;
import coil3.ImageLoader;
import coil3.Uri;
import coil3.fetch.Fetcher;
import coil3.graphics.AssetMetadata;
import coil3.graphics.DataSource;
import coil3.graphics.SourceImageSource;
import coil3.request.Options;
import coil3.util.f;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import defpackage.n8;
import defpackage.rq0;
import defpackage.yg0;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.c;
import kotlin.coroutines.Continuation;
import kotlin.text.g;
import okio.RealBufferedSource;
import okio.e;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcoil3/fetch/AssetUriFetcher;", "Lcoil3/fetch/Fetcher;", "Lcoil3/Uri;", Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "Lcoil3/request/Options;", "options", "<init>", "(Lcoil3/Uri;Lcoil3/request/Options;)V", "Factory", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AssetUriFetcher implements Fetcher {
    public final Uri a;
    public final Options b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/fetch/AssetUriFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Lcoil3/Uri;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements Fetcher.Factory<Uri> {
        @Override // coil3.fetch.Fetcher.Factory
        public final Fetcher create(Uri uri, Options options, ImageLoader imageLoader) {
            Uri uri2 = uri;
            Bitmap.Config[] configArr = f.a;
            if (yg0.a(uri2.c, "file") && yg0.a(c.s(n8.r(uri2)), "android_asset")) {
                return new AssetUriFetcher(uri2, options);
            }
            return null;
        }
    }

    public AssetUriFetcher(Uri uri, Options options) {
        this.a = uri;
        this.b = options;
    }

    @Override // coil3.fetch.Fetcher
    public final Object fetch(Continuation continuation) {
        String strW = c.w(c.n(n8.r(this.a)), "/", null, null, null, 62);
        Options options = this.b;
        SourceImageSource sourceImageSource = new SourceImageSource(new RealBufferedSource(e.e(options.a.getAssets().open(strW))), options.f, new AssetMetadata(strW));
        String mimeTypeFromExtension = null;
        if (!g.B(strW)) {
            String strX = g.X(g.X(strW, '#'), '?');
            String strU = g.U('.', g.U('/', strX, strX), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            if (!g.B(strU)) {
                String lowerCase = strU.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                mimeTypeFromExtension = (String) rq0.a.get(lowerCase);
                if (mimeTypeFromExtension == null) {
                    mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                }
            }
        }
        return new SourceFetchResult(sourceImageSource, mimeTypeFromExtension, DataSource.DISK);
    }
}
