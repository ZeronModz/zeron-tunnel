package coil3.graphics;

import okio.FileSystem;
import okio.Path;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static FileImageSource a(Path path, FileSystem fileSystem) {
        return new FileImageSource(path, fileSystem, null, null, null);
    }
}
