package com.vpn.sandok.ultrasshservice.util.securepreferences.model;

import defpackage.u7;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class SecurityConfig {
    private final int iPBKDF2_Iterations;
    private final int iSaltSize;
    private final int keySize;
    private final EncryptionAlgorithm mAlgorithm;
    private final DigestType mDigestType;
    private final char[] mPassword;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class Builder {
        private static final int DEFAULT_AES_KEY_SIZE = 128;
        private static final int DEFAULT_ITERATIONS = 1000;
        private static final int DEFAULT_SALT_SIZE = 32;
        private EncryptionAlgorithm algorithm;
        private char[] password;
        private static final DigestType DEFAULT_DIGEST = DigestType.SHA256;
        private static final EncryptionAlgorithm DEFAULT_ALGORITHM = EncryptionAlgorithm.AES;
        private int saltSize = -1;
        private int iterations = -1;
        private DigestType digest = null;
        private int aesKeySize = -1;

        public Builder(String str) {
            if (str != null) {
                this.password = str.toCharArray();
            } else {
                u7.r("Password cannot be null!");
                throw null;
            }
        }

        public SecurityConfig build() {
            int i = this.iterations;
            if (i == -1) {
                i = 1000;
            }
            int i2 = i;
            int i3 = this.saltSize;
            if (i3 == -1) {
                i3 = 32;
            }
            int i4 = i3;
            DigestType digestType = this.digest;
            if (digestType == null) {
                digestType = DEFAULT_DIGEST;
            }
            DigestType digestType2 = digestType;
            int i5 = this.aesKeySize;
            if (i5 == -1) {
                i5 = 128;
            }
            int i6 = i5;
            EncryptionAlgorithm encryptionAlgorithm = this.algorithm;
            if (encryptionAlgorithm == null) {
                encryptionAlgorithm = DEFAULT_ALGORITHM;
            }
            return new SecurityConfig(this.password, i6, i2, i4, digestType2, encryptionAlgorithm);
        }

        public Builder setDigestType(DigestType digestType) {
            this.digest = digestType;
            return this;
        }

        public Builder setEncryptionAlgorithm(EncryptionAlgorithm encryptionAlgorithm) {
            this.algorithm = encryptionAlgorithm;
            return this;
        }

        public Builder setKeySize(int i) {
            this.aesKeySize = i;
            return this;
        }

        public Builder setPbkdf2Iterations(int i) {
            if (i >= 0) {
                this.iterations = i;
                return this;
            }
            u7.r("Iterations cannot be less than zero!");
            return null;
        }

        public Builder setPbkdf2SaltSize(int i) {
            if (i < 8 || i % 8 != 0) {
                u7.r("Illegal salt size!");
                return null;
            }
            this.saltSize = i;
            return this;
        }
    }

    public SecurityConfig(char[] cArr, int i, int i2, int i3, DigestType digestType, EncryptionAlgorithm encryptionAlgorithm) {
        this.mPassword = Arrays.copyOf(cArr, cArr.length);
        this.iPBKDF2_Iterations = i2;
        this.mDigestType = digestType;
        this.iSaltSize = i3;
        this.mAlgorithm = encryptionAlgorithm;
        for (int i4 : encryptionAlgorithm.getKeySizes()) {
            if (i == i4) {
                this.keySize = i;
                return;
            }
        }
        u7.r("Key size is invalid for the selected algorithm");
        throw null;
    }

    public EncryptionAlgorithm getAlgorithm() {
        return this.mAlgorithm;
    }

    public DigestType getDigestType() {
        return this.mDigestType;
    }

    public int getKeySize() {
        return this.keySize;
    }

    public int getPBKDF2Iterations() {
        return this.iPBKDF2_Iterations;
    }

    public char[] getPassword() {
        return this.mPassword;
    }

    public int getSaltSize() {
        return this.iSaltSize;
    }
}
