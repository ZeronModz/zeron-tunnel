package coil3.graphics;

import android.content.res.AssetFileDescriptor;
import coil3.Uri;
import coil3.graphics.ImageSource;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcoil3/decode/ContentMetadata;", "Lcoil3/decode/ImageSource$Metadata;", "Lcoil3/Uri;", "uri", "Landroid/content/res/AssetFileDescriptor;", "assetFileDescriptor", "<init>", "(Lcoil3/Uri;Landroid/content/res/AssetFileDescriptor;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContentMetadata extends ImageSource.Metadata {
    public final AssetFileDescriptor a;

    public ContentMetadata(Uri uri, AssetFileDescriptor assetFileDescriptor) {
        this.a = assetFileDescriptor;
    }
}
