package coil3.fetch;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import coil3.ImageLoader;
import coil3.fetch.Fetcher;
import coil3.graphics.DataSource;
import coil3.request.Options;
import coil3.request.b;
import coil3.size.Precision;
import coil3.util.f;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import defpackage.j03;
import defpackage.k02;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcoil3/fetch/DrawableFetcher;", "Lcoil3/fetch/Fetcher;", "Landroid/graphics/drawable/Drawable;", Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "Lcoil3/request/Options;", "options", "<init>", "(Landroid/graphics/drawable/Drawable;Lcoil3/request/Options;)V", "Factory", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DrawableFetcher implements Fetcher {
    public final Drawable a;
    public final Options b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/fetch/DrawableFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements Fetcher.Factory<Drawable> {
        @Override // coil3.fetch.Fetcher.Factory
        public final Fetcher create(Drawable drawable, Options options, ImageLoader imageLoader) {
            return new DrawableFetcher(drawable, options);
        }
    }

    public DrawableFetcher(Drawable drawable, Options options) {
        this.a = drawable;
        this.b = options;
    }

    @Override // coil3.fetch.Fetcher
    public final Object fetch(Continuation continuation) {
        Bitmap.Config[] configArr = f.a;
        Drawable bitmapDrawable = this.a;
        boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof androidx.vectordrawable.graphics.drawable.f);
        if (z) {
            Options options = this.b;
            bitmapDrawable = new BitmapDrawable(options.a.getResources(), k02.f(bitmapDrawable, b.a(options), options.b, options.c, options.d == Precision.INEXACT));
        }
        return new ImageFetchResult(j03.c(bitmapDrawable), z, DataSource.MEMORY);
    }
}
