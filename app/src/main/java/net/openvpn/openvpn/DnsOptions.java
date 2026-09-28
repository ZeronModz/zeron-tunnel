package net.openvpn.openvpn;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class DnsOptions {
    public transient long a;
    public transient boolean b;

    public DnsOptions() {
        this(ovpncliJNI.new_DnsOptions(), true);
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        ovpncliJNI.delete_DnsOptions(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public DnsOptions(long j, boolean z) {
        this.b = z;
        this.a = j;
    }
}
