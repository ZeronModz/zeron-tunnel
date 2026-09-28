package com.trilead.ssh2.signature;

import com.trilead.ssh2.crypto.CertificateDecoder;
import com.trilead.ssh2.packets.TypesReader;
import com.trilead.ssh2.packets.TypesWriter;
import defpackage.p60;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.EdDSASecurityProvider;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ED25519KeyAlgorithm extends KeyAlgorithm<EdDSAPublicKey, EdDSAPrivateKey> {
    private static final String ED25519_CURVE_NAME = "Ed25519";
    private static final String ED25519_KEY_NAME = "ssh-ed25519";

    public ED25519KeyAlgorithm() {
        super("NoneWithEdDSA", ED25519_KEY_NAME, EdDSAPrivateKey.class, new EdDSASecurityProvider());
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public EdDSAPublicKey decodePublicKey(byte[] bArr) throws IOException {
        TypesReader typesReader = new TypesReader(bArr);
        if (!typesReader.readString().equals(ED25519_KEY_NAME)) {
            p60.f("Invalid key type");
            return null;
        }
        byte[] byteString = typesReader.readByteString();
        if (typesReader.remain() == 0) {
            return new EdDSAPublicKey(new EdDSAPublicKeySpec(byteString, (EdDSANamedCurveSpec) EdDSANamedCurveTable.b.get(ED25519_CURVE_NAME.toLowerCase(Locale.ENGLISH))));
        }
        p60.f("Unexpected padding in public key");
        return null;
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] decodeSignature(byte[] bArr) throws IOException {
        TypesReader typesReader = new TypesReader(bArr);
        if (!typesReader.readString().equals(ED25519_KEY_NAME)) {
            p60.f("Invalid signature format");
            return null;
        }
        byte[] byteString = typesReader.readByteString();
        if (typesReader.remain() == 0) {
            return byteString;
        }
        p60.f("Unexpected padding in signature");
        return null;
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] encodePublicKey(EdDSAPublicKey edDSAPublicKey) throws IOException {
        byte[] abyte = edDSAPublicKey.getAbyte();
        TypesWriter typesWriter = new TypesWriter();
        typesWriter.writeString(ED25519_KEY_NAME);
        typesWriter.writeString(abyte, 0, abyte.length);
        return typesWriter.getBytes();
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] encodeSignature(byte[] bArr) throws IOException {
        TypesWriter typesWriter = new TypesWriter();
        typesWriter.writeString(ED25519_KEY_NAME);
        typesWriter.writeString(bArr, 0, bArr.length);
        return typesWriter.getBytes();
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public List<CertificateDecoder> getCertificateDecoders() {
        return Collections.singletonList(new OpenSshCertificateDecoder(ED25519_KEY_NAME) { // from class: com.trilead.ssh2.signature.ED25519KeyAlgorithm.1
            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder
            public KeyPair generateKeyPair(TypesReader typesReader) throws GeneralSecurityException, IOException {
                EdDSANamedCurveSpec edDSANamedCurveSpec = (EdDSANamedCurveSpec) EdDSANamedCurveTable.b.get(ED25519KeyAlgorithm.ED25519_CURVE_NAME.toLowerCase(Locale.ENGLISH));
                byte[] byteString = typesReader.readByteString();
                byte[] byteString2 = typesReader.readByteString();
                EdDSAPublicKeySpec edDSAPublicKeySpec = new EdDSAPublicKeySpec(byteString, edDSANamedCurveSpec);
                EdDSAPrivateKeySpec edDSAPrivateKeySpec = new EdDSAPrivateKeySpec(Arrays.copyOfRange(byteString2, 0, 32), edDSANamedCurveSpec);
                KeyFactory keyFactory = KeyFactory.getInstance("EdDSA", new EdDSASecurityProvider());
                return new KeyPair(keyFactory.generatePublic(edDSAPublicKeySpec), keyFactory.generatePrivate(edDSAPrivateKeySpec));
            }
        });
    }
}
