package coil3.graphics;

import coil3.ColorImage;
import coil3.Image;
import coil3.ImageLoader;
import coil3.fetch.SourceFetchResult;
import coil3.graphics.Decoder;
import coil3.request.Options;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.o0;
import defpackage.xu;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcoil3/decode/BlackholeDecoder;", "Lcoil3/decode/Decoder;", "Lkotlin/Function0;", "Lcoil3/Image;", "imageFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Factory", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlackholeDecoder implements Decoder {
    public final Function0 a;

    public BlackholeDecoder(Function0<? extends Image> function0) {
        this.a = function0;
    }

    @Override // coil3.graphics.Decoder
    public final Object decode(Continuation continuation) {
        return new DecodeResult((Image) this.a.invoke(), false);
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcoil3/decode/BlackholeDecoder$Factory;", "Lcoil3/decode/Decoder$Factory;", "Lkotlin/Function0;", "Lcoil3/Image;", "imageFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Companion", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements Decoder.Factory {
        public static final ColorImage b;
        public final Function0 a;

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/decode/BlackholeDecoder$Factory$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcoil3/Image;", "EMPTY_IMAGE", "Lcoil3/Image;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public Companion(xu xuVar) {
            }
        }

        static {
            new Companion(null);
            b = new ColorImage(0, 0, 0, 0L, false, 30, null);
        }

        public /* synthetic */ Factory(Function0 function0, int i, xu xuVar) {
            this((i & 1) != 0 ? new o0(2) : function0);
        }

        @Override // coil3.decode.Decoder.Factory
        public final Decoder create(SourceFetchResult sourceFetchResult, Options options, ImageLoader imageLoader) {
            return new BlackholeDecoder(this.a);
        }

        public Factory(Function0<? extends Image> function0) {
            this.a = function0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
