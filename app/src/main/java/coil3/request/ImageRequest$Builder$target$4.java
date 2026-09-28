package coil3.request;

import coil3.Image;
import coil3.target.Target;
import defpackage.mk1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"coil3/request/ImageRequest$Builder$target$4", "Lcoil3/target/Target;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 176)
public final class ImageRequest$Builder$target$4 implements Target {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;

    public ImageRequest$Builder$target$4(Function1<? super Image, mk1> function1, Function1<? super Image, mk1> function12, Function1<? super Image, mk1> function13) {
        this.a = function1;
        this.b = function12;
        this.c = function13;
    }

    @Override // coil3.target.Target
    public final void onError(Image image) {
        this.b.invoke(image);
    }

    @Override // coil3.target.Target
    public final void onStart(Image image) {
        this.a.invoke(image);
    }

    @Override // coil3.target.Target
    public final void onSuccess(Image image) {
        this.c.invoke(image);
    }
}
