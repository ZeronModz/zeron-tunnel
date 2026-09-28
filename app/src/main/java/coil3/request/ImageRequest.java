package coil3.request;

import android.content.Context;
import coil3.Extras;
import coil3.Image;
import coil3.graphics.Decoder;
import coil3.memory.MemoryCache;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.size.SizeResolver;
import coil3.target.Target;
import com.google.android.gms.ads.RequestConfiguration;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.fu0;
import defpackage.hv;
import defpackage.hz;
import defpackage.lv;
import defpackage.oy;
import defpackage.wl1;
import defpackage.xg0;
import defpackage.xu;
import defpackage.yg0;
import defpackage.zu0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeIntrinsics;
import okio.FileSystem;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcoil3/request/ImageRequest;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Listener", "Defined", "Defaults", "Builder", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageRequest {
    public final Context a;
    public final Object b;
    public final Target c;
    public final Listener d;
    public final String e;
    public final Map f;
    public final String g;
    public final FileSystem h;
    public final Pair i;
    public final Decoder.Factory j;
    public final CoroutineContext k;
    public final CoroutineContext l;
    public final CoroutineContext m;
    public final CachePolicy n;
    public final CachePolicy o;
    public final CachePolicy p;
    public final MemoryCache.Key q;
    public final Function1 r;
    public final Function1 s;
    public final Function1 t;
    public final SizeResolver u;
    public final Scale v;
    public final Precision w;
    public final Extras x;
    public final Defined y;
    public final Defaults z;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B³\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcoil3/request/ImageRequest$Defined;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lokio/FileSystem;", "fileSystem", "Lkotlin/coroutines/CoroutineContext;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lcoil3/request/CachePolicy;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lkotlin/Function1;", "Lcoil3/request/ImageRequest;", "Lcoil3/Image;", "placeholderFactory", "errorFactory", "fallbackFactory", "Lcoil3/size/SizeResolver;", "sizeResolver", "Lcoil3/size/Scale;", "scale", "Lcoil3/size/Precision;", "precision", "<init>", "(Lokio/FileSystem;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcoil3/size/SizeResolver;Lcoil3/size/Scale;Lcoil3/size/Precision;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Defined {
        public final FileSystem a;
        public final CoroutineContext b;
        public final CoroutineContext c;
        public final CoroutineContext d;
        public final CachePolicy e;
        public final CachePolicy f;
        public final CachePolicy g;
        public final Function1 h;
        public final Function1 i;
        public final Function1 j;
        public final SizeResolver k;
        public final Scale l;
        public final Precision m;

        public Defined(FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Function1<? super ImageRequest, ? extends Image> function1, Function1<? super ImageRequest, ? extends Image> function12, Function1<? super ImageRequest, ? extends Image> function13, SizeResolver sizeResolver, Scale scale, Precision precision) {
            this.a = fileSystem;
            this.b = coroutineContext;
            this.c = coroutineContext2;
            this.d = coroutineContext3;
            this.e = cachePolicy;
            this.f = cachePolicy2;
            this.g = cachePolicy3;
            this.h = function1;
            this.i = function12;
            this.j = function13;
            this.k = sizeResolver;
            this.l = scale;
            this.m = precision;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Defined)) {
                return false;
            }
            Defined defined = (Defined) obj;
            return yg0.a(this.a, defined.a) && yg0.a(this.b, defined.b) && yg0.a(this.c, defined.c) && yg0.a(this.d, defined.d) && this.e == defined.e && this.f == defined.f && this.g == defined.g && yg0.a(this.h, defined.h) && yg0.a(this.i, defined.i) && yg0.a(this.j, defined.j) && yg0.a(this.k, defined.k) && this.l == defined.l && this.m == defined.m;
        }

        public final int hashCode() {
            FileSystem fileSystem = this.a;
            int iHashCode = (fileSystem == null ? 0 : fileSystem.hashCode()) * 31;
            CoroutineContext coroutineContext = this.b;
            int iHashCode2 = (iHashCode + (coroutineContext == null ? 0 : coroutineContext.hashCode())) * 31;
            CoroutineContext coroutineContext2 = this.c;
            int iHashCode3 = (iHashCode2 + (coroutineContext2 == null ? 0 : coroutineContext2.hashCode())) * 31;
            CoroutineContext coroutineContext3 = this.d;
            int iHashCode4 = (iHashCode3 + (coroutineContext3 == null ? 0 : coroutineContext3.hashCode())) * 31;
            CachePolicy cachePolicy = this.e;
            int iHashCode5 = (iHashCode4 + (cachePolicy == null ? 0 : cachePolicy.hashCode())) * 31;
            CachePolicy cachePolicy2 = this.f;
            int iHashCode6 = (iHashCode5 + (cachePolicy2 == null ? 0 : cachePolicy2.hashCode())) * 31;
            CachePolicy cachePolicy3 = this.g;
            int iHashCode7 = (iHashCode6 + (cachePolicy3 == null ? 0 : cachePolicy3.hashCode())) * 31;
            Function1 function1 = this.h;
            int iHashCode8 = (iHashCode7 + (function1 == null ? 0 : function1.hashCode())) * 31;
            Function1 function12 = this.i;
            int iHashCode9 = (iHashCode8 + (function12 == null ? 0 : function12.hashCode())) * 31;
            Function1 function13 = this.j;
            int iHashCode10 = (iHashCode9 + (function13 == null ? 0 : function13.hashCode())) * 31;
            SizeResolver sizeResolver = this.k;
            int iHashCode11 = (iHashCode10 + (sizeResolver == null ? 0 : sizeResolver.hashCode())) * 31;
            Scale scale = this.l;
            int iHashCode12 = (iHashCode11 + (scale == null ? 0 : scale.hashCode())) * 31;
            Precision precision = this.m;
            return iHashCode12 + (precision != null ? precision.hashCode() : 0);
        }

        public final String toString() {
            return "Defined(fileSystem=" + this.a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + this.m + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcoil3/request/ImageRequest$Listener;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcoil3/request/ImageRequest;", "request", "Lmk1;", "onStart", "(Lcoil3/request/ImageRequest;)V", "onCancel", "Lcoil3/request/ErrorResult;", "result", "onError", "(Lcoil3/request/ImageRequest;Lcoil3/request/ErrorResult;)V", "Lcoil3/request/SuccessResult;", "onSuccess", "(Lcoil3/request/ImageRequest;Lcoil3/request/SuccessResult;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Listener {
        void onCancel(ImageRequest request);

        void onError(ImageRequest request, ErrorResult result);

        void onStart(ImageRequest request);

        void onSuccess(ImageRequest request, SuccessResult result);
    }

    public ImageRequest(Context context, Object obj, Target target, Listener listener, String str, Map map, String str2, FileSystem fileSystem, Pair pair, Decoder.Factory factory, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, MemoryCache.Key key, Function1 function1, Function1 function12, Function1 function13, SizeResolver sizeResolver, Scale scale, Precision precision, Extras extras, Defined defined, Defaults defaults, xu xuVar) {
        this.a = context;
        this.b = obj;
        this.c = target;
        this.d = listener;
        this.e = str;
        this.f = map;
        this.g = str2;
        this.h = fileSystem;
        this.i = pair;
        this.j = factory;
        this.k = coroutineContext;
        this.l = coroutineContext2;
        this.m = coroutineContext3;
        this.n = cachePolicy;
        this.o = cachePolicy2;
        this.p = cachePolicy3;
        this.q = key;
        this.r = function1;
        this.s = function12;
        this.t = function13;
        this.u = sizeResolver;
        this.v = scale;
        this.w = precision;
        this.x = extras;
        this.y = defined;
        this.z = defaults;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        return yg0.a(this.a, imageRequest.a) && yg0.a(this.b, imageRequest.b) && yg0.a(this.c, imageRequest.c) && yg0.a(this.d, imageRequest.d) && yg0.a(this.e, imageRequest.e) && yg0.a(this.f, imageRequest.f) && yg0.a(this.g, imageRequest.g) && yg0.a(this.h, imageRequest.h) && yg0.a(this.i, imageRequest.i) && yg0.a(this.j, imageRequest.j) && yg0.a(this.k, imageRequest.k) && yg0.a(this.l, imageRequest.l) && yg0.a(this.m, imageRequest.m) && this.n == imageRequest.n && this.o == imageRequest.o && this.p == imageRequest.p && yg0.a(this.q, imageRequest.q) && yg0.a(this.r, imageRequest.r) && yg0.a(this.s, imageRequest.s) && yg0.a(this.t, imageRequest.t) && yg0.a(this.u, imageRequest.u) && this.v == imageRequest.v && this.w == imageRequest.w && yg0.a(this.x, imageRequest.x) && yg0.a(this.y, imageRequest.y) && yg0.a(this.z, imageRequest.z);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Target target = this.c;
        int iHashCode2 = (iHashCode + (target == null ? 0 : target.hashCode())) * 31;
        Listener listener = this.d;
        int iHashCode3 = (iHashCode2 + (listener == null ? 0 : listener.hashCode())) * 31;
        String str = this.e;
        int iHashCode4 = (this.f.hashCode() + ((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.g;
        int iHashCode5 = (this.h.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Pair pair = this.i;
        int iHashCode6 = (iHashCode5 + (pair == null ? 0 : pair.hashCode())) * 31;
        Decoder.Factory factory = this.j;
        int iHashCode7 = (this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((iHashCode6 + (factory == null ? 0 : factory.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        MemoryCache.Key key = this.q;
        return this.z.hashCode() + ((this.y.hashCode() + ((this.x.a.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((iHashCode7 + (key != null ? key.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.a + ", data=" + this.b + ", target=" + this.c + ", listener=" + this.d + ", memoryCacheKey=" + this.e + ", memoryCacheKeyExtras=" + this.f + ", diskCacheKey=" + this.g + ", fileSystem=" + this.h + ", fetcherFactory=" + this.i + ", decoderFactory=" + this.j + ", interceptorCoroutineContext=" + this.k + ", fetcherCoroutineContext=" + this.l + ", decoderCoroutineContext=" + this.m + ", memoryCachePolicy=" + this.n + ", diskCachePolicy=" + this.o + ", networkCachePolicy=" + this.p + ", placeholderMemoryCacheKey=" + this.q + ", placeholderFactory=" + this.r + ", errorFactory=" + this.s + ", fallbackFactory=" + this.t + ", sizeResolver=" + this.u + ", scale=" + this.v + ", precision=" + this.w + ", extras=" + this.x + ", defined=" + this.y + ", defaults=" + this.z + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001f\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lcoil3/request/ImageRequest$Builder;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "<init>", "(Landroid/content/Context;)V", "Lcoil3/request/ImageRequest;", "request", "(Lcoil3/request/ImageRequest;Landroid/content/Context;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public final Context a;
        public Defaults b;
        public Object c;
        public Target d;
        public final Listener e;
        public final String f;
        public final Map g;
        public final String h;
        public final FileSystem i;
        public final Pair j;
        public final Decoder.Factory k;
        public final CoroutineContext l;
        public final CoroutineContext m;
        public final CoroutineContext n;
        public final CachePolicy o;
        public final CachePolicy p;
        public final CachePolicy q;
        public final MemoryCache.Key r;
        public final Function1 s;
        public final Function1 t;
        public final Function1 u;
        public SizeResolver v;
        public Scale w;
        public Precision x;
        public Object y;

        public Builder(ImageRequest imageRequest, Context context) {
            this.a = context;
            this.b = imageRequest.z;
            this.c = imageRequest.b;
            this.d = imageRequest.c;
            this.e = imageRequest.d;
            this.f = imageRequest.e;
            this.g = imageRequest.f;
            this.h = imageRequest.g;
            Defined defined = imageRequest.y;
            this.i = defined.a;
            this.j = imageRequest.i;
            this.k = imageRequest.j;
            this.l = defined.b;
            this.m = defined.c;
            this.n = defined.d;
            this.o = defined.e;
            this.p = defined.f;
            this.q = defined.g;
            this.r = imageRequest.q;
            this.s = defined.h;
            this.t = defined.i;
            this.u = defined.j;
            this.v = defined.k;
            this.w = defined.l;
            this.x = defined.m;
            this.y = imageRequest.x;
        }

        public final ImageRequest a() {
            Extras extrasA;
            Object obj = this.c;
            if (obj == null) {
                obj = fu0.a;
            }
            Object obj2 = obj;
            Target target = this.d;
            Boolean bool = Boolean.FALSE;
            Map mapW = this.g;
            if (yg0.a(mapW, bool)) {
                mapW.getClass();
                mapW = xg0.w(TypeIntrinsics.b(mapW));
            } else if (!hz.J(mapW)) {
                zu0.a();
                return null;
            }
            Map map = mapW;
            map.getClass();
            FileSystem fileSystem = this.i;
            if (fileSystem == null) {
                fileSystem = this.b.a;
            }
            FileSystem fileSystem2 = fileSystem;
            CachePolicy cachePolicy = this.o;
            if (cachePolicy == null) {
                cachePolicy = this.b.e;
            }
            CachePolicy cachePolicy2 = cachePolicy;
            CachePolicy cachePolicy3 = this.p;
            if (cachePolicy3 == null) {
                cachePolicy3 = this.b.f;
            }
            CachePolicy cachePolicy4 = cachePolicy3;
            CachePolicy cachePolicy5 = this.q;
            if (cachePolicy5 == null) {
                cachePolicy5 = this.b.g;
            }
            CachePolicy cachePolicy6 = cachePolicy5;
            CoroutineContext coroutineContext = this.l;
            if (coroutineContext == null) {
                coroutineContext = this.b.b;
            }
            CoroutineContext coroutineContext2 = coroutineContext;
            CoroutineContext coroutineContext3 = this.m;
            if (coroutineContext3 == null) {
                coroutineContext3 = this.b.c;
            }
            CoroutineContext coroutineContext4 = coroutineContext3;
            CoroutineContext coroutineContext5 = this.n;
            if (coroutineContext5 == null) {
                coroutineContext5 = this.b.d;
            }
            CoroutineContext coroutineContext6 = coroutineContext5;
            Function1 function1 = this.s;
            if (function1 == null) {
                function1 = this.b.h;
            }
            Function1 function12 = function1;
            Function1 function13 = this.t;
            if (function13 == null) {
                function13 = this.b.i;
            }
            Function1 function14 = function13;
            Function1 function15 = this.u;
            if (function15 == null) {
                function15 = this.b.j;
            }
            Function1 function16 = function15;
            SizeResolver sizeResolver = this.v;
            if (sizeResolver == null) {
                sizeResolver = this.b.k;
            }
            SizeResolver sizeResolver2 = sizeResolver;
            Scale scale = this.w;
            if (scale == null) {
                scale = this.b.l;
            }
            Scale scale2 = scale;
            Precision precision = this.x;
            if (precision == null) {
                precision = this.b.m;
            }
            Precision precision2 = precision;
            Object obj3 = this.y;
            if (obj3 instanceof Extras.Builder) {
                extrasA = ((Extras.Builder) obj3).a();
            } else {
                if (!(obj3 instanceof Extras)) {
                    zu0.a();
                    return null;
                }
                extrasA = (Extras) obj3;
            }
            return new ImageRequest(this.a, obj2, target, this.e, this.f, map, this.h, fileSystem2, this.j, this.k, coroutineContext2, coroutineContext4, coroutineContext6, cachePolicy2, cachePolicy4, cachePolicy6, this.r, function12, function14, function16, sizeResolver2, scale2, precision2, extrasA, new Defined(this.i, this.l, this.m, this.n, this.o, this.p, this.q, this.s, this.t, this.u, this.v, this.w, this.x), this.b, null);
        }

        public Builder(ImageRequest imageRequest, Context context, int i, xu xuVar) {
            this(imageRequest, (i & 2) != 0 ? imageRequest.a : context);
        }

        public Builder(Context context) {
            this.a = context;
            this.b = Defaults.o;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = d.a();
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = null;
            this.r = null;
            wl1 wl1Var = wl1.a;
            this.s = wl1Var;
            this.t = wl1Var;
            this.u = wl1Var;
            this.v = null;
            this.w = null;
            this.x = null;
            this.y = Extras.b;
        }

        public Builder(ImageRequest imageRequest) {
            this(imageRequest, null, 2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001cB½\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcoil3/request/ImageRequest$Defaults;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lokio/FileSystem;", "fileSystem", "Lkotlin/coroutines/CoroutineContext;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lcoil3/request/CachePolicy;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lkotlin/Function1;", "Lcoil3/request/ImageRequest;", "Lcoil3/Image;", "placeholderFactory", "errorFactory", "fallbackFactory", "Lcoil3/size/SizeResolver;", "sizeResolver", "Lcoil3/size/Scale;", "scale", "Lcoil3/size/Precision;", "precision", "Lcoil3/Extras;", "extras", "<init>", "(Lokio/FileSystem;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcoil3/size/SizeResolver;Lcoil3/size/Scale;Lcoil3/size/Precision;Lcoil3/Extras;)V", "Companion", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Defaults {
        public static final Defaults o;
        public final FileSystem a;
        public final CoroutineContext b;
        public final CoroutineContext c;
        public final CoroutineContext d;
        public final CachePolicy e;
        public final CachePolicy f;
        public final CachePolicy g;
        public final Function1 h;
        public final Function1 i;
        public final Function1 j;
        public final SizeResolver k;
        public final Scale l;
        public final Precision m;
        public final Extras n;

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/request/ImageRequest$Defaults$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcoil3/request/ImageRequest$Defaults;", "DEFAULT", "Lcoil3/request/ImageRequest$Defaults;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public Companion(xu xuVar) {
            }
        }

        static {
            new Companion(null);
            o = new Defaults(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Defaults(FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Function1 function1, Function1 function12, Function1 function13, SizeResolver sizeResolver, Scale scale, Precision precision, Extras extras, int i, xu xuVar) {
            CoroutineContext coroutineContext4;
            CoroutineContext coroutineContext5;
            fileSystem = (i & 1) != 0 ? FileSystem.a : fileSystem;
            CoroutineContext coroutineContext6 = (i & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext;
            if ((i & 4) != 0) {
                lv lvVar = oy.a;
                coroutineContext4 = hv.c;
            } else {
                coroutineContext4 = coroutineContext2;
            }
            if ((i & 8) != 0) {
                lv lvVar2 = oy.a;
                coroutineContext5 = hv.c;
            } else {
                coroutineContext5 = coroutineContext3;
            }
            CachePolicy cachePolicy4 = (i & 16) != 0 ? CachePolicy.ENABLED : cachePolicy;
            CachePolicy cachePolicy5 = (i & 32) != 0 ? CachePolicy.ENABLED : cachePolicy2;
            CachePolicy cachePolicy6 = (i & 64) != 0 ? CachePolicy.ENABLED : cachePolicy3;
            int i2 = i & 128;
            Function1 function14 = wl1.a;
            this(fileSystem, coroutineContext6, coroutineContext4, coroutineContext5, cachePolicy4, cachePolicy5, cachePolicy6, i2 != 0 ? function14 : function1, (i & 256) != 0 ? function14 : function12, (i & 512) == 0 ? function13 : function14, (i & 1024) != 0 ? SizeResolver.ORIGINAL : sizeResolver, (i & 2048) != 0 ? Scale.FIT : scale, (i & AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE) != 0 ? Precision.EXACT : precision, (i & AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT) != 0 ? Extras.b : extras);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Defaults)) {
                return false;
            }
            Defaults defaults = (Defaults) obj;
            return yg0.a(this.a, defaults.a) && yg0.a(this.b, defaults.b) && yg0.a(this.c, defaults.c) && yg0.a(this.d, defaults.d) && this.e == defaults.e && this.f == defaults.f && this.g == defaults.g && yg0.a(this.h, defaults.h) && yg0.a(this.i, defaults.i) && yg0.a(this.j, defaults.j) && yg0.a(this.k, defaults.k) && this.l == defaults.l && this.m == defaults.m && yg0.a(this.n, defaults.n);
        }

        public final int hashCode() {
            return this.n.a.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Defaults(fileSystem=" + this.a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + this.m + ", extras=" + this.n + ')';
        }

        public Defaults() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }

        public Defaults(FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Function1<? super ImageRequest, ? extends Image> function1, Function1<? super ImageRequest, ? extends Image> function12, Function1<? super ImageRequest, ? extends Image> function13, SizeResolver sizeResolver, Scale scale, Precision precision, Extras extras) {
            this.a = fileSystem;
            this.b = coroutineContext;
            this.c = coroutineContext2;
            this.d = coroutineContext3;
            this.e = cachePolicy;
            this.f = cachePolicy2;
            this.g = cachePolicy3;
            this.h = function1;
            this.i = function12;
            this.j = function13;
            this.k = sizeResolver;
            this.l = scale;
            this.m = precision;
            this.n = extras;
        }
    }
}
