package coil3.size;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.n81;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bæ\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcoil3/size/SizeResolver;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcoil3/size/Size;", "size", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "n81", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SizeResolver {
    public static final n81 Companion = n81.a;
    public static final SizeResolver ORIGINAL = new RealSizeResolver(Size.c);

    Object size(Continuation<? super Size> continuation);
}
