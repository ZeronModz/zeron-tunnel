package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b60 {
    public static final void a(Path path, FileSystem fileSystem) throws IOException {
        try {
            IOException iOException = null;
            for (Path path2 : fileSystem.h(path)) {
                try {
                    if (fileSystem.j(path2).b) {
                        a(path2, fileSystem);
                    }
                    fileSystem.e(path2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
