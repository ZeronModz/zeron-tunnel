package com.trilead.ssh2.signature;

import com.trilead.ssh2.IOWarningException;
import com.trilead.ssh2.crypto.CertificateDecoder;
import com.trilead.ssh2.crypto.PEMStructure;
import com.trilead.ssh2.crypto.SimpleDERReader;
import com.trilead.ssh2.packets.TypesReader;
import com.trilead.ssh2.packets.TypesWriter;
import defpackage.p60;
import defpackage.vh;
import defpackage.zu0;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.spec.KeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class RSAKeyAlgorithm extends KeyAlgorithm<java.security.interfaces.RSAPublicKey, java.security.interfaces.RSAPrivateKey> {
    public RSAKeyAlgorithm() {
        super("SHA1WithRSA", "ssh-rsa", java.security.interfaces.RSAPrivateKey.class);
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public java.security.interfaces.RSAPublicKey decodePublicKey(byte[] bArr) throws IOException {
        TypesReader typesReader = new TypesReader(bArr);
        String string = typesReader.readString();
        if (!string.equals(getKeyFormat())) {
            StringBuilder sbX = vh.x("Unsupported key format found '", string, "' while expecting ");
            sbX.append(getKeyFormat());
            throw new IOWarningException(sbX.toString());
        }
        BigInteger mpint = typesReader.readMPINT();
        BigInteger mpint2 = typesReader.readMPINT();
        if (typesReader.remain() != 0) {
            p60.f("Padding in RSA public key!");
            return null;
        }
        try {
            return (java.security.interfaces.RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(mpint2, mpint));
        } catch (GeneralSecurityException e) {
            throw new IOException("Could not generate RSA key", e);
        }
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] decodeSignature(byte[] bArr) throws IOException {
        TypesReader typesReader = new TypesReader(bArr);
        if (!typesReader.readString().equals(getKeyFormat())) {
            p60.f("Peer sent wrong signature format");
            return null;
        }
        byte[] byteString = typesReader.readByteString();
        if (byteString.length == 0) {
            p60.f("Error in RSA signature, S is empty.");
            return null;
        }
        if (typesReader.remain() == 0) {
            return byteString;
        }
        p60.f("Padding in RSA signature!");
        return null;
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] encodePublicKey(java.security.interfaces.RSAPublicKey rSAPublicKey) throws IOException {
        TypesWriter typesWriter = new TypesWriter();
        typesWriter.writeString(getKeyFormat());
        typesWriter.writeMPInt(rSAPublicKey.getPublicExponent());
        typesWriter.writeMPInt(rSAPublicKey.getModulus());
        return typesWriter.getBytes();
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] encodeSignature(byte[] bArr) throws IOException {
        TypesWriter typesWriter = new TypesWriter();
        typesWriter.writeString(getKeyFormat());
        if (bArr.length <= 1 || bArr[0] != 0) {
            typesWriter.writeString(bArr, 0, bArr.length);
        } else {
            typesWriter.writeString(bArr, 1, bArr.length - 1);
        }
        return typesWriter.getBytes();
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public List<CertificateDecoder> getCertificateDecoders() {
        return Arrays.asList(new RSACertificateDecoder(0), new OpenSshCertificateDecoder("ssh-rsa") { // from class: com.trilead.ssh2.signature.RSAKeyAlgorithm.1
            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder
            public KeyPair generateKeyPair(TypesReader typesReader) throws GeneralSecurityException, IOException {
                KeySpec rSAPrivateKeySpec;
                BigInteger mpint = typesReader.readMPINT();
                BigInteger mpint2 = typesReader.readMPINT();
                BigInteger mpint3 = typesReader.readMPINT();
                BigInteger mpint4 = typesReader.readMPINT();
                BigInteger mpint5 = typesReader.readMPINT();
                RSAPublicKeySpec rSAPublicKeySpec = new RSAPublicKeySpec(mpint, mpint2);
                if (mpint5 == null || mpint4 == null) {
                    rSAPrivateKeySpec = new RSAPrivateKeySpec(mpint, mpint3);
                } else {
                    BigInteger bigIntegerModInverse = mpint4.modInverse(mpint5);
                    BigInteger bigInteger = BigInteger.ONE;
                    rSAPrivateKeySpec = new RSAPrivateCrtKeySpec(mpint, mpint2, mpint3, mpint5, bigIntegerModInverse, mpint3.mod(mpint5.subtract(bigInteger)), mpint3.mod(bigIntegerModInverse.subtract(bigInteger)), mpint4);
                }
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                return new KeyPair(keyFactory.generatePublic(rSAPublicKeySpec), keyFactory.generatePrivate(rSAPrivateKeySpec));
            }
        });
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class RSACertificateDecoder extends CertificateDecoder {
        public /* synthetic */ RSACertificateDecoder(int i) {
            this();
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public KeyPair createKeyPair(PEMStructure pEMStructure) throws IOException {
            SimpleDERReader simpleDERReader = new SimpleDERReader(pEMStructure.getData());
            byte[] sequenceAsByteArray = simpleDERReader.readSequenceAsByteArray();
            if (simpleDERReader.available() != 0) {
                p60.f("Padding in RSA PRIVATE KEY DER stream.");
                return null;
            }
            simpleDERReader.resetInput(sequenceAsByteArray);
            BigInteger bigInteger = simpleDERReader.readInt();
            if (bigInteger.compareTo(BigInteger.ZERO) != 0 && bigInteger.compareTo(BigInteger.ONE) != 0) {
                zu0.j("Wrong version (", bigInteger, ") in RSA PRIVATE KEY DER stream.");
                return null;
            }
            BigInteger bigInteger2 = simpleDERReader.readInt();
            BigInteger bigInteger3 = simpleDERReader.readInt();
            try {
                RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec = new RSAPrivateCrtKeySpec(bigInteger2, bigInteger3, simpleDERReader.readInt(), simpleDERReader.readInt(), simpleDERReader.readInt(), simpleDERReader.readInt(), simpleDERReader.readInt(), simpleDERReader.readInt());
                RSAPublicKeySpec rSAPublicKeySpec = new RSAPublicKeySpec(bigInteger2, bigInteger3);
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                return new KeyPair(keyFactory.generatePublic(rSAPublicKeySpec), keyFactory.generatePrivate(rSAPrivateCrtKeySpec));
            } catch (GeneralSecurityException unused) {
                p60.f("Could not decode RSA Key Pair");
                return null;
            }
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public String getEndLine() {
            return "-----END RSA PRIVATE KEY-----";
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public String getStartLine() {
            return "-----BEGIN RSA PRIVATE KEY-----";
        }

        private RSACertificateDecoder() {
        }
    }
}
