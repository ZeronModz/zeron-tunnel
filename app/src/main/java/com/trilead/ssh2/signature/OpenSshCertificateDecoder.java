package com.trilead.ssh2.signature;

import com.trilead.ssh2.crypto.CertificateDecoder;
import com.trilead.ssh2.crypto.PEMStructure;
import com.trilead.ssh2.crypto.cipher.BlockCipher;
import com.trilead.ssh2.crypto.cipher.BlockCipherFactory;
import com.trilead.ssh2.crypto.cipher.CBCMode;
import com.trilead.ssh2.crypto.cipher.DES;
import com.trilead.ssh2.packets.TypesReader;
import defpackage.p60;
import defpackage.u7;
import defpackage.vh;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import org.mindrot.jbcrypt.BCrypt;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class OpenSshCertificateDecoder extends CertificateDecoder {
    private final String keyAlgorithm;

    public OpenSshCertificateDecoder(String str) {
        this.keyAlgorithm = str;
    }

    private static byte[] decryptData(byte[] bArr, byte[] bArr2, SshCipher sshCipher) {
        int keyLength = sshCipher.getKeyLength();
        byte[] bArr3 = new byte[keyLength];
        int blockSize = sshCipher.getBlockSize();
        byte[] bArr4 = new byte[blockSize];
        System.arraycopy(bArr2, 0, bArr3, 0, keyLength);
        System.arraycopy(bArr2, keyLength, bArr4, 0, blockSize);
        BlockCipher blockCipherCreateBlockCipher = sshCipher.createBlockCipher(bArr3, bArr4, false);
        byte[] bArr5 = new byte[bArr.length];
        for (int i = 0; i < bArr.length / blockCipherCreateBlockCipher.getBlockSize(); i++) {
            blockCipherCreateBlockCipher.transformBlock(bArr, blockCipherCreateBlockCipher.getBlockSize() * i, bArr5, blockCipherCreateBlockCipher.getBlockSize() * i);
        }
        return bArr5;
    }

    private static byte[] generateKayAndIvPbkdf2(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        byte[] bArr3 = new byte[i2 + i3];
        new BCrypt().pbkdf(bArr, bArr2, i, bArr3);
        return bArr3;
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public KeyPair createKeyPair(PEMStructure pEMStructure, String str) throws IOException {
        TypesReader typesReader = new TypesReader(pEMStructure.getData());
        byte[] bytes = typesReader.readBytes(15);
        Charset charset = StandardCharsets.UTF_8;
        if (!"openssh-key-v1".equals(new String(bytes, charset).trim())) {
            p60.f("Could not find openssh header in key");
            return null;
        }
        String string = typesReader.readString();
        String string2 = typesReader.readString();
        byte[] byteString = typesReader.readByteString();
        if (typesReader.readUINT32() != 1) {
            p60.f("Only single OpenSSH keys are supported");
            return null;
        }
        typesReader.readByteString();
        byte[] byteString2 = typesReader.readByteString();
        if ("bcrypt".equals(string2)) {
            if (str == null) {
                p60.f("PEM is encrypted but password has not been specified");
                return null;
            }
            TypesReader typesReader2 = new TypesReader(byteString);
            byte[] byteString3 = typesReader2.readByteString();
            int uint32 = typesReader2.readUINT32();
            SshCipher sshCipher = SshCipher.getInstance(string);
            byteString2 = decryptData(byteString2, generateKayAndIvPbkdf2(str.getBytes(charset), byteString3, uint32, sshCipher.getKeyLength(), sshCipher.getBlockSize()), sshCipher);
        } else if (!"none".equals(string) || !"none".equals(string2)) {
            p60.f("Unexpected encryption method for key");
            return null;
        }
        TypesReader typesReader3 = new TypesReader(byteString2);
        if (typesReader3.readUINT32() != typesReader3.readUINT32()) {
            p60.f("Check integers didn't match");
            return null;
        }
        String string3 = typesReader3.readString();
        if (!string3.equals(this.keyAlgorithm)) {
            p60.f("Invalid key type: ".concat(string3));
            return null;
        }
        try {
            KeyPair keyPairGenerateKeyPair = generateKeyPair(typesReader3);
            typesReader3.readByteString();
            int i = 0;
            while (i < typesReader.remain()) {
                i++;
                if (i != typesReader.readByte()) {
                    throw new IOException("Incorrect padding on private keys");
                }
            }
            return keyPairGenerateKeyPair;
        } catch (GeneralSecurityException e) {
            throw new IOException("Could not create key pair", e);
        }
    }

    public abstract KeyPair generateKeyPair(TypesReader typesReader) throws GeneralSecurityException, IOException;

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public String getEndLine() {
        return "-----END OPENSSH PRIVATE KEY-----";
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public String getStartLine() {
        return "-----BEGIN OPENSSH PRIVATE KEY-----";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static abstract class SshCipher {
        private final int blockSize;
        private final int keyLength;
        private final String[] sshCipherNames;
        public static final SshCipher DESEDE_CBC = new AnonymousClass1(new String[0]);
        public static final SshCipher DES_CBC = new AnonymousClass2(new String[0]);
        public static final SshCipher AES128_CBC = new AnonymousClass3(new String[]{"aes128-cbc"});
        public static final SshCipher AES192_CBC = new AnonymousClass4(new String[]{"aes192-cbc"});
        public static final SshCipher AES256_CBC = new AnonymousClass5(new String[]{"aes256-cbc"});
        public static final SshCipher AES256_CTR = new AnonymousClass6(new String[]{"aes256-ctr"});
        private static final /* synthetic */ SshCipher[] $VALUES = $values();

        private static /* synthetic */ SshCipher[] $values() {
            return new SshCipher[]{DESEDE_CBC, DES_CBC, AES128_CBC, AES192_CBC, AES256_CBC, AES256_CTR};
        }

        private SshCipher(String str, int i, int i2, int i3, String str2, String... strArr) {
            this.keyLength = i2;
            this.blockSize = i3;
            String[] strArr2 = new String[(strArr == null ? 0 : strArr.length) + 1];
            strArr2[0] = str2;
            if (strArr != null) {
                System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
            }
            this.sshCipherNames = strArr2;
        }

        public static SshCipher getInstance(String str) {
            for (SshCipher sshCipher : values()) {
                for (String str2 : sshCipher.sshCipherNames) {
                    if (str2.equalsIgnoreCase(str)) {
                        return sshCipher;
                    }
                }
            }
            u7.r(vh.l("Unknown Cipher: ", str));
            return null;
        }

        public static SshCipher valueOf(String str) {
            return (SshCipher) Enum.valueOf(SshCipher.class, str);
        }

        public static SshCipher[] values() {
            return (SshCipher[]) $VALUES.clone();
        }

        public abstract BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z);

        public int getBlockSize() {
            return this.blockSize;
        }

        public int getKeyLength() {
            return this.keyLength;
        }

        /* JADX INFO: renamed from: com.trilead.ssh2.signature.OpenSshCertificateDecoder$SshCipher$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        public enum AnonymousClass1 extends SshCipher {
            public /* synthetic */ AnonymousClass1(String[] strArr) {
                this("DESEDE_CBC", 0, 24, 8, "des-ede3-cbc", strArr);
            }

            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher
            public BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z) {
                return BlockCipherFactory.createCipher("3des-cbc", z, bArr, bArr2);
            }

            private AnonymousClass1(String str, int i, int i2, int i3, String str2, String... strArr) {
                super(str, i, i2, i3, str2, strArr, 0);
            }
        }

        /* JADX INFO: renamed from: com.trilead.ssh2.signature.OpenSshCertificateDecoder$SshCipher$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        public enum AnonymousClass2 extends SshCipher {
            public /* synthetic */ AnonymousClass2(String[] strArr) {
                this("DES_CBC", 1, 8, 8, "des-cbc", strArr);
            }

            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher
            public BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z) {
                DES des = new DES();
                des.init(z, bArr);
                return new CBCMode(des, bArr2, z);
            }

            private AnonymousClass2(String str, int i, int i2, int i3, String str2, String... strArr) {
                super(str, i, i2, i3, str2, strArr, 0);
            }
        }

        /* JADX INFO: renamed from: com.trilead.ssh2.signature.OpenSshCertificateDecoder$SshCipher$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        public enum AnonymousClass3 extends SshCipher {
            public /* synthetic */ AnonymousClass3(String[] strArr) {
                this("AES128_CBC", 2, 16, 16, "aes-128-cbc", strArr);
            }

            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher
            public BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z) {
                return BlockCipherFactory.createCipher("aes128-cbc", z, bArr, bArr2);
            }

            private AnonymousClass3(String str, int i, int i2, int i3, String str2, String... strArr) {
                super(str, i, i2, i3, str2, strArr, 0);
            }
        }

        /* JADX INFO: renamed from: com.trilead.ssh2.signature.OpenSshCertificateDecoder$SshCipher$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        public enum AnonymousClass4 extends SshCipher {
            public /* synthetic */ AnonymousClass4(String[] strArr) {
                this("AES192_CBC", 3, 24, 16, "aes-192-cbc", strArr);
            }

            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher
            public BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z) {
                return BlockCipherFactory.createCipher("aes192-cbc", z, bArr, bArr2);
            }

            private AnonymousClass4(String str, int i, int i2, int i3, String str2, String... strArr) {
                super(str, i, i2, i3, str2, strArr, 0);
            }
        }

        /* JADX INFO: renamed from: com.trilead.ssh2.signature.OpenSshCertificateDecoder$SshCipher$5, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        public enum AnonymousClass5 extends SshCipher {
            public /* synthetic */ AnonymousClass5(String[] strArr) {
                this("AES256_CBC", 4, 32, 16, "aes-256-cbc", strArr);
            }

            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher
            public BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z) {
                return BlockCipherFactory.createCipher("aes256-cbc", z, bArr, bArr2);
            }

            private AnonymousClass5(String str, int i, int i2, int i3, String str2, String... strArr) {
                super(str, i, i2, i3, str2, strArr, 0);
            }
        }

        /* JADX INFO: renamed from: com.trilead.ssh2.signature.OpenSshCertificateDecoder$SshCipher$6, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        public enum AnonymousClass6 extends SshCipher {
            public /* synthetic */ AnonymousClass6(String[] strArr) {
                this("AES256_CTR", 5, 32, 16, "aes-256-ctr", strArr);
            }

            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher
            public BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z) {
                return BlockCipherFactory.createCipher("aes256-ctr", z, bArr, bArr2);
            }

            private AnonymousClass6(String str, int i, int i2, int i3, String str2, String... strArr) {
                super(str, i, i2, i3, str2, strArr, 0);
            }
        }

        public /* synthetic */ SshCipher(String str, int i, int i2, int i3, String str2, String[] strArr, int i4) {
            this(str, i, i2, i3, str2, strArr);
        }
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public KeyPair createKeyPair(PEMStructure pEMStructure) {
        return null;
    }
}
