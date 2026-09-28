package net.i2p.crypto.eddsa.spec;

import defpackage.u7;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import net.i2p.crypto.eddsa.math.Curve;
import net.i2p.crypto.eddsa.math.GroupElement;
import net.i2p.crypto.eddsa.math.ScalarOps;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class EdDSAParameterSpec implements AlgorithmParameterSpec, Serializable {
    private static final long serialVersionUID = 8274987108472012L;
    private final GroupElement B;
    private final Curve curve;
    private final String hashAlgo;
    private final ScalarOps sc;

    public EdDSAParameterSpec(Curve curve, String str, ScalarOps scalarOps, GroupElement groupElement) {
        try {
            if (curve.getField().getb() / 4 != MessageDigest.getInstance(str).getDigestLength()) {
                throw new IllegalArgumentException("Hash output is not 2b-bit");
            }
            this.curve = curve;
            this.hashAlgo = str;
            this.sc = scalarOps;
            this.B = groupElement;
        } catch (NoSuchAlgorithmException unused) {
            u7.r("Unsupported hash algorithm");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EdDSAParameterSpec)) {
            return false;
        }
        EdDSAParameterSpec edDSAParameterSpec = (EdDSAParameterSpec) obj;
        return this.hashAlgo.equals(edDSAParameterSpec.getHashAlgorithm()) && this.curve.equals(edDSAParameterSpec.getCurve()) && this.B.equals(edDSAParameterSpec.getB());
    }

    public GroupElement getB() {
        return this.B;
    }

    public Curve getCurve() {
        return this.curve;
    }

    public String getHashAlgorithm() {
        return this.hashAlgo;
    }

    public ScalarOps getScalarOps() {
        return this.sc;
    }

    public int hashCode() {
        return this.B.hashCode() ^ (this.hashAlgo.hashCode() ^ this.curve.hashCode());
    }
}
