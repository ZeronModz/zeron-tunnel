package net.i2p.crypto.eddsa.spec;

import defpackage.u7;
import java.security.spec.KeySpec;
import net.i2p.crypto.eddsa.math.GroupElement;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class EdDSAPublicKeySpec implements KeySpec {
    public final GroupElement a;
    public final EdDSAParameterSpec b;

    public EdDSAPublicKeySpec(byte[] bArr, EdDSAParameterSpec edDSAParameterSpec) {
        if (bArr.length != edDSAParameterSpec.getCurve().getField().getb() / 8) {
            u7.r("public-key length is wrong");
            throw null;
        }
        this.a = new GroupElement(edDSAParameterSpec.getCurve(), bArr);
        this.b = edDSAParameterSpec;
    }

    public EdDSAPublicKeySpec(GroupElement groupElement, EdDSAParameterSpec edDSAParameterSpec) {
        this.a = groupElement;
        this.b = edDSAParameterSpec;
    }
}
