package defpackage;

import java.security.PrivilegedAction;
import net.i2p.crypto.eddsa.EdDSASecurityProvider;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q00 implements PrivilegedAction {
    public final /* synthetic */ EdDSASecurityProvider a;

    public q00(EdDSASecurityProvider edDSASecurityProvider) {
        this.a = edDSASecurityProvider;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        this.a.setup();
        return null;
    }
}
