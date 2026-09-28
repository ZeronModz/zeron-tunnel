package net.i2p.crypto.eddsa.spec;

import net.i2p.crypto.eddsa.math.Curve;
import net.i2p.crypto.eddsa.math.GroupElement;
import net.i2p.crypto.eddsa.math.ScalarOps;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class EdDSANamedCurveSpec extends EdDSAParameterSpec {
    private final String name;

    public EdDSANamedCurveSpec(String str, Curve curve, String str2, ScalarOps scalarOps, GroupElement groupElement) {
        super(curve, str2, scalarOps, groupElement);
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
