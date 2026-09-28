package defpackage;

import com.google.common.io.FileBackedOutputStream;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x50 {
    public final /* synthetic */ FileBackedOutputStream a;

    public x50(FileBackedOutputStream fileBackedOutputStream) {
        this.a = fileBackedOutputStream;
    }

    public final void finalize() {
        try {
            this.a.a();
        } catch (Throwable th) {
            th.printStackTrace(System.err);
        }
    }
}
