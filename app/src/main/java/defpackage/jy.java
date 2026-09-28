package defpackage;

import okio.ForwardingFileSystem;
import okio.Path;
import okio.Sink;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jy extends ForwardingFileSystem {
    @Override // okio.ForwardingFileSystem, okio.FileSystem
    public final Sink n(Path path, boolean z) {
        Path pathC = path.c();
        if (pathC != null) {
            c(pathC);
        }
        return this.c.n(path, z);
    }
}
