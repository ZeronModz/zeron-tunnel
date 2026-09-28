package net.openvpn.openvpn;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class DnsDomain {
    public transient long a;
    public transient boolean b;

    public DnsDomain() {
        this(ovpncliJNI.new_DnsDomain__SWIG_0(), true);
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        ovpncliJNI.delete_DnsDomain(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public DnsDomain(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public DnsDomain(String str) {
        this(ovpncliJNI.new_DnsDomain__SWIG_1(str), true);
    }
}
