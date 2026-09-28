package coil3.graphics;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import coil3.graphics.ImageSource;
import coil3.request.Options;
import defpackage.k60;
import defpackage.yg0;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final ImageDecoder.Source a(ImageSource imageSource, Options options) {
        Path pathFileOrNull;
        Context context = options.a;
        if (imageSource.getA() == FileSystem.a && (pathFileOrNull = imageSource.fileOrNull()) != null) {
            return ImageDecoder.createSource(pathFileOrNull.toFile());
        }
        ImageSource.Metadata b = imageSource.getB();
        if (b instanceof AssetMetadata) {
            return ImageDecoder.createSource(context.getAssets(), ((AssetMetadata) b).a);
        }
        if ((b instanceof ContentMetadata) && Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptor = ((ContentMetadata) b).a;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource(new k60(assetFileDescriptor, 3));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (b instanceof ResourceMetadata) {
            ResourceMetadata resourceMetadata = (ResourceMetadata) b;
            if (yg0.a(resourceMetadata.a, context.getPackageName())) {
                return ImageDecoder.createSource(context.getResources(), resourceMetadata.b);
            }
        }
        if (b instanceof ByteBufferMetadata) {
            return ImageDecoder.createSource(((ByteBufferMetadata) b).a);
        }
        return null;
    }
}
