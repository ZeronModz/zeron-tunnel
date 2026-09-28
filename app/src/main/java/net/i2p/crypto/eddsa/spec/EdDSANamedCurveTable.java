package net.i2p.crypto.eddsa.spec;

import java.util.HashMap;
import java.util.Locale;
import net.i2p.crypto.eddsa.Utils;
import net.i2p.crypto.eddsa.math.Curve;
import net.i2p.crypto.eddsa.math.Field;
import net.i2p.crypto.eddsa.math.ed25519.Ed25519LittleEndianEncoding;
import net.i2p.crypto.eddsa.math.ed25519.Ed25519ScalarOps;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class EdDSANamedCurveTable {
    public static final EdDSANamedCurveSpec a;
    public static volatile HashMap b;

    static {
        Field field = new Field(256, Utils.b("edffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff7f"), new Ed25519LittleEndianEncoding());
        Curve curve = new Curve(field, Utils.b("a3785913ca4deb75abd841414d0a700098e879777940c78c73fe6f2bee6c0352"), field.fromByteArray(Utils.b("b0a00e4a271beec478e42fad0618432fa7d7fb3d99004d2b0bdfc14f8024832b")));
        EdDSANamedCurveSpec edDSANamedCurveSpec = new EdDSANamedCurveSpec("Ed25519", curve, "SHA-512", new Ed25519ScalarOps(), curve.createPoint(Utils.b("5866666666666666666666666666666666666666666666666666666666666666"), true));
        a = edDSANamedCurveSpec;
        b = new HashMap();
        String lowerCase = edDSANamedCurveSpec.getName().toLowerCase(Locale.ENGLISH);
        synchronized (EdDSANamedCurveTable.class) {
            HashMap map = new HashMap(b);
            map.put(lowerCase, edDSANamedCurveSpec);
            b = map;
        }
    }
}
