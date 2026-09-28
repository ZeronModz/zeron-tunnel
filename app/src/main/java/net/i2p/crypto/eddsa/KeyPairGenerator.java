package net.i2p.crypto.eddsa;

import defpackage.zu0;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGeneratorSpi;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import java.util.Locale;
import net.i2p.crypto.eddsa.spec.EdDSAGenParameterSpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSAParameterSpec;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class KeyPairGenerator extends KeyPairGeneratorSpi {
    public static final Hashtable d;
    public EdDSAParameterSpec a;
    public SecureRandom b;
    public boolean c;

    static {
        Hashtable hashtable = new Hashtable();
        d = hashtable;
        hashtable.put(256, new EdDSAGenParameterSpec("Ed25519"));
    }

    @Override // java.security.KeyPairGeneratorSpi
    public final KeyPair generateKeyPair() {
        if (!this.c) {
            initialize(256, new SecureRandom());
        }
        byte[] bArr = new byte[this.a.getCurve().getField().getb() / 8];
        this.b.nextBytes(bArr);
        EdDSAPrivateKeySpec edDSAPrivateKeySpec = new EdDSAPrivateKeySpec(bArr, this.a);
        return new KeyPair(new EdDSAPublicKey(new EdDSAPublicKeySpec(edDSAPrivateKeySpec.d, this.a)), new EdDSAPrivateKey(edDSAPrivateKeySpec));
    }

    @Override // java.security.KeyPairGeneratorSpi
    public final void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof EdDSAParameterSpec) {
            this.a = (EdDSAParameterSpec) algorithmParameterSpec;
        } else {
            if (!(algorithmParameterSpec instanceof EdDSAGenParameterSpec)) {
                zu0.p("parameter object not a EdDSAParameterSpec");
                return;
            }
            String str = ((EdDSAGenParameterSpec) algorithmParameterSpec).a;
            EdDSANamedCurveSpec edDSANamedCurveSpec = (EdDSANamedCurveSpec) EdDSANamedCurveTable.b.get(str.toLowerCase(Locale.ENGLISH));
            if (edDSANamedCurveSpec == null) {
                throw new InvalidAlgorithmParameterException("unknown curve name: ".concat(str));
            }
            this.a = edDSANamedCurveSpec;
        }
        this.b = secureRandom;
        this.c = true;
    }

    @Override // java.security.KeyPairGeneratorSpi
    public final void initialize(int i, SecureRandom secureRandom) {
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) d.get(Integer.valueOf(i));
        if (algorithmParameterSpec != null) {
            try {
                initialize(algorithmParameterSpec, secureRandom);
                return;
            } catch (InvalidAlgorithmParameterException unused) {
                throw new InvalidParameterException("key type not configurable.");
            }
        }
        throw new InvalidParameterException("unknown key type.");
    }
}
