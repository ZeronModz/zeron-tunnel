package coil3.util;

import coil3.Image;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.NullRequestDataException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final ErrorResult a(ImageRequest imageRequest, Throwable th) {
        Image image;
        if (th instanceof NullRequestDataException) {
            Function1 function1 = imageRequest.t;
            ImageRequest.Defaults defaults = imageRequest.z;
            image = (Image) function1.invoke(imageRequest);
            if (image == null) {
                image = (Image) defaults.j.invoke(imageRequest);
            }
            if (image == null && (image = (Image) imageRequest.s.invoke(imageRequest)) == null) {
                image = (Image) defaults.i.invoke(imageRequest);
            }
        } else {
            image = (Image) imageRequest.s.invoke(imageRequest);
            if (image == null) {
                image = (Image) imageRequest.z.i.invoke(imageRequest);
            }
        }
        return new ErrorResult(image, imageRequest, th);
    }
}
