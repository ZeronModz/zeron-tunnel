package net.openvpn.openvpn;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ExternalPKIImpl {
    public transient long a;
    public transient boolean b;

    public ExternalPKIImpl() {
        long jNew_ExternalPKIImpl = ovpncliJNI.new_ExternalPKIImpl();
        this.b = true;
        this.a = jNew_ExternalPKIImpl;
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        ovpncliJNI.delete_ExternalPKIImpl(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
