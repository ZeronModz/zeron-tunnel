package net.i2p.crypto.eddsa;

import defpackage.q00;
import java.security.AccessController;
import java.security.Provider;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class EdDSASecurityProvider extends Provider {
    public static final String PROVIDER_NAME = "EdDSA";
    private static final long serialVersionUID = 1210027906682292307L;

    public EdDSASecurityProvider() {
        super("EdDSA", 0.3d, "str4d EdDSA security provider wrapper");
        AccessController.doPrivileged(new q00(this));
    }

    public void setup() {
        put("KeyFactory.EdDSA", "net.i2p.crypto.eddsa.KeyFactory");
        put("KeyPairGenerator.EdDSA", "net.i2p.crypto.eddsa.KeyPairGenerator");
        put("Signature.NONEwithEdDSA", "net.i2p.crypto.eddsa.EdDSAEngine");
        put("Alg.Alias.KeyFactory.1.3.101.112", "EdDSA");
        put("Alg.Alias.KeyFactory.OID.1.3.101.112", "EdDSA");
        put("Alg.Alias.KeyPairGenerator.1.3.101.112", "EdDSA");
        put("Alg.Alias.KeyPairGenerator.OID.1.3.101.112", "EdDSA");
        put("Alg.Alias.Signature.1.3.101.112", "NONEwithEdDSA");
        put("Alg.Alias.Signature.OID.1.3.101.112", "NONEwithEdDSA");
    }
}
