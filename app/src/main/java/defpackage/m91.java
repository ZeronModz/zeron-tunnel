package defpackage;

import java.net.Socket;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m91 {
    public static final m91 a = new m91();
    public static final ArrayList b = new ArrayList();

    public final void a() {
        synchronized (this) {
            try {
                for (Socket socket : b) {
                    if (socket != null) {
                        socket.close();
                    }
                }
                b.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
