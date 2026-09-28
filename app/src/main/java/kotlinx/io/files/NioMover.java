package kotlinx.io.files;

import defpackage.io0;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/io/files/NioMover;", "Lkotlinx/io/files/Mover;", "<init>", "()V", "kotlinx-io-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class NioMover implements Mover {
    @Override // kotlinx.io.files.Mover
    public final void move(Path path, Path path2) throws IOException {
        path.getClass();
        path2.getClass();
        File file = path.a;
        if (!file.exists()) {
            io0.p(file, "Source file does not exist: ");
            return;
        }
        try {
            Files.move(file.toPath(), path2.a.toPath(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (Throwable th) {
            if (!(th instanceof IOException)) {
                throw new IOException("Move failed", th);
            }
            throw th;
        }
    }
}
