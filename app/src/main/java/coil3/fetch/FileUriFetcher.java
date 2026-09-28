package coil3.fetch;

import android.graphics.Bitmap;
import android.webkit.MimeTypeMap;
import coil3.ImageLoader;
import coil3.Uri;
import coil3.fetch.Fetcher;
import coil3.graphics.DataSource;
import coil3.graphics.FileImageSource;
import coil3.graphics.a;
import coil3.request.Options;
import coil3.util.f;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.n8;
import defpackage.rq0;
import defpackage.u7;
import defpackage.yg0;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.c;
import kotlin.coroutines.Continuation;
import kotlin.text.g;
import okio.Path;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcoil3/fetch/FileUriFetcher;", "Lcoil3/fetch/Fetcher;", "Lcoil3/Uri;", "uri", "Lcoil3/request/Options;", "options", "<init>", "(Lcoil3/Uri;Lcoil3/request/Options;)V", "Factory", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileUriFetcher implements Fetcher {
    public final Uri a;
    public final Options b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/fetch/FileUriFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Lcoil3/Uri;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements Fetcher.Factory<Uri> {
        @Override // coil3.fetch.Fetcher.Factory
        public final Fetcher create(Uri uri, Options options, ImageLoader imageLoader) {
            Uri uri2 = uri;
            String str = uri2.c;
            if ((str != null && !str.equals("file")) || uri2.e == null) {
                return null;
            }
            Bitmap.Config[] configArr = f.a;
            if (yg0.a(uri2.c, "file") && yg0.a(c.s(n8.r(uri2)), "android_asset")) {
                return null;
            }
            return new FileUriFetcher(uri2, options);
        }
    }

    public FileUriFetcher(Uri uri, Options options) {
        this.a = uri;
        this.b = options;
    }

    @Override // coil3.fetch.Fetcher
    public final Object fetch(Continuation continuation) {
        Path.Companion companion = Path.b;
        String strQ = n8.q(this.a);
        String mimeTypeFromExtension = null;
        if (strQ == null) {
            u7.p("filePath == null");
            return null;
        }
        companion.getClass();
        Path pathA = Path.Companion.a(strQ, false);
        FileImageSource fileImageSourceA = a.a(pathA, this.b.f);
        String strU = g.U('.', pathA.b(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        if (!g.B(strU)) {
            String lowerCase = strU.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            mimeTypeFromExtension = (String) rq0.a.get(lowerCase);
            if (mimeTypeFromExtension == null) {
                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
            }
        }
        return new SourceFetchResult(fileImageSourceA, mimeTypeFromExtension, DataSource.DISK);
    }
}
