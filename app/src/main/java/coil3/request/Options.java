package coil3.request;

import android.content.Context;
import coil3.Extras;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.size.Size;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import defpackage.yg0;
import kotlin.Metadata;
import okio.FileSystem;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001Bo\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcoil3/request/Options;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "Lcoil3/size/Size;", "size", "Lcoil3/size/Scale;", "scale", "Lcoil3/size/Precision;", "precision", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "diskCacheKey", "Lokio/FileSystem;", "fileSystem", "Lcoil3/request/CachePolicy;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lcoil3/Extras;", "extras", "<init>", "(Landroid/content/Context;Lcoil3/size/Size;Lcoil3/size/Scale;Lcoil3/size/Precision;Ljava/lang/String;Lokio/FileSystem;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/Extras;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Options {
    public final Context a;
    public final Size b;
    public final Scale c;
    public final Precision d;
    public final String e;
    public final FileSystem f;
    public final CachePolicy g;
    public final CachePolicy h;
    public final CachePolicy i;
    public final Extras j;

    public Options(Context context, Size size, Scale scale, Precision precision, String str, FileSystem fileSystem, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Extras extras, int i, xu xuVar) {
        this(context, (i & 2) != 0 ? Size.c : size, (i & 4) != 0 ? Scale.FIT : scale, (i & 8) != 0 ? Precision.EXACT : precision, (i & 16) != 0 ? null : str, (i & 32) != 0 ? FileSystem.a : fileSystem, (i & 64) != 0 ? CachePolicy.ENABLED : cachePolicy, (i & 128) != 0 ? CachePolicy.ENABLED : cachePolicy2, (i & 256) != 0 ? CachePolicy.ENABLED : cachePolicy3, (i & 512) != 0 ? Extras.b : extras);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Options)) {
            return false;
        }
        Options options = (Options) obj;
        return yg0.a(this.a, options.a) && yg0.a(this.b, options.b) && this.c == options.c && this.d == options.d && yg0.a(this.e, options.e) && yg0.a(this.f, options.f) && this.g == options.g && this.h == options.h && this.i == options.i && yg0.a(this.j, options.j);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return this.j.a.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.a + ", size=" + this.b + ", scale=" + this.c + ", precision=" + this.d + ", diskCacheKey=" + this.e + ", fileSystem=" + this.f + ", memoryCachePolicy=" + this.g + ", diskCachePolicy=" + this.h + ", networkCachePolicy=" + this.i + ", extras=" + this.j + ')';
    }

    public Options(Context context, Size size, Scale scale, Precision precision, String str, FileSystem fileSystem, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Extras extras) {
        this.a = context;
        this.b = size;
        this.c = scale;
        this.d = precision;
        this.e = str;
        this.f = fileSystem;
        this.g = cachePolicy;
        this.h = cachePolicy2;
        this.i = cachePolicy3;
        this.j = extras;
    }
}
