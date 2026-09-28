package com.trilead.ssh2.crypto.cipher;

import defpackage.u7;
import defpackage.vh;
import java.util.Vector;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class BlockCipherFactory {
    static Vector ciphers;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class CipherEntry {
        int blocksize;
        String cipherClass;
        int keysize;
        String type;

        public CipherEntry(String str, int i, int i2, String str2) {
            this.type = str;
            this.blocksize = i;
            this.keysize = i2;
            this.cipherClass = str2;
        }
    }

    static {
        Vector vector = new Vector();
        ciphers = vector;
        vector.addElement(new CipherEntry("aes256-ctr", 16, 32, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new CipherEntry("aes192-ctr", 16, 24, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new CipherEntry("aes128-ctr", 16, 16, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new CipherEntry("blowfish-ctr", 8, 16, "com.trilead.ssh2.crypto.cipher.BlowFish"));
        ciphers.addElement(new CipherEntry("aes256-cbc", 16, 32, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new CipherEntry("aes192-cbc", 16, 24, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new CipherEntry("aes128-cbc", 16, 16, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new CipherEntry("blowfish-cbc", 8, 16, "com.trilead.ssh2.crypto.cipher.BlowFish"));
        ciphers.addElement(new CipherEntry("3des-ctr", 8, 24, "com.trilead.ssh2.crypto.cipher.DESede"));
        ciphers.addElement(new CipherEntry("3des-cbc", 8, 24, "com.trilead.ssh2.crypto.cipher.DESede"));
    }

    public static void checkCipherList(String[] strArr) {
        for (String str : strArr) {
            getEntry(str);
        }
    }

    public static BlockCipher createCipher(String str, boolean z, byte[] bArr, byte[] bArr2) {
        try {
            BlockCipher blockCipher = (BlockCipher) Class.forName(getEntry(str).cipherClass).newInstance();
            if (str.endsWith("-cbc")) {
                blockCipher.init(z, bArr);
                return new CBCMode(blockCipher, bArr2, z);
            }
            if (!str.endsWith("-ctr")) {
                throw new IllegalArgumentException("Cannot instantiate ".concat(str));
            }
            blockCipher.init(true, bArr);
            return new CTRMode(blockCipher, bArr2, z);
        } catch (Exception unused) {
            u7.r(vh.l("Cannot instantiate ", str));
            return null;
        }
    }

    public static int getBlockSize(String str) {
        return getEntry(str).blocksize;
    }

    public static String[] getDefaultCipherList() {
        String[] strArr = new String[ciphers.size()];
        for (int i = 0; i < ciphers.size(); i++) {
            strArr[i] = new String(((CipherEntry) ciphers.elementAt(i)).type);
        }
        return strArr;
    }

    private static CipherEntry getEntry(String str) {
        for (int i = 0; i < ciphers.size(); i++) {
            CipherEntry cipherEntry = (CipherEntry) ciphers.elementAt(i);
            if (cipherEntry.type.equals(str)) {
                return cipherEntry;
            }
        }
        u7.r(vh.l("Unkown algorithm ", str));
        return null;
    }

    public static int getKeySize(String str) {
        return getEntry(str).keysize;
    }
}
