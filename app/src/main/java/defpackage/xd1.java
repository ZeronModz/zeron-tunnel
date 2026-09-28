package defpackage;

import com.google.common.io.d;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class xd1 extends d {
    public final /* synthetic */ int b;

    @Override // com.google.common.io.d
    public final File a() throws IOException {
        switch (this.b) {
            case 0:
                return File.createTempFile("FileBackedOutputStream", null, null);
            default:
                throw new IOException("Guava cannot securely create temporary files or directories under SDK versions before Jelly Bean. You can create one yourself, either in the insecure default directory or in a more secure directory, such as context.getCacheDir(). For more information, see the Javadoc for Files.createTempDir().");
        }
    }
}
