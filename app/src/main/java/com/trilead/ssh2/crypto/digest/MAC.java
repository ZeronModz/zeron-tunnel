package com.trilead.ssh2.crypto.digest;

import defpackage.u7;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class MAC {

    @Deprecated
    Digest mac;

    @Deprecated
    int size;

    public MAC(String str, byte[] bArr) {
        HMAC hmac;
        if (str.equals("hmac-sha1")) {
            hmac = new HMAC(new SHA1(), bArr, 20);
            this.mac = hmac;
        } else if (str.equals("hmac-sha1-96")) {
            hmac = new HMAC(new SHA1(), bArr, 12);
            this.mac = hmac;
        } else if (str.equals("hmac-md5")) {
            hmac = new HMAC(new MD5(), bArr, 16);
            this.mac = hmac;
        } else {
            if (!str.equals("hmac-md5-96")) {
                return;
            }
            hmac = new HMAC(new MD5(), bArr, 12);
            this.mac = hmac;
        }
        this.size = hmac.getDigestLength();
    }

    @Deprecated
    public static void checkMacList(String[] strArr) {
        for (String str : strArr) {
            getKeyLen(str);
        }
    }

    @Deprecated
    public static int getKeyLen(String str) {
        if (str.equals("hmac-sha1") || str.equals("hmac-sha1-96")) {
            return 20;
        }
        if (str.equals("hmac-md5") || str.equals("hmac-md5-96")) {
            return 16;
        }
        u7.r("Unkown algorithm ".concat(str));
        return 0;
    }

    @Deprecated
    public static String[] getMacList() {
        return new String[]{"hmac-sha1-96", "hmac-sha1", "hmac-md5-96", "hmac-md5"};
    }

    public void getMac(byte[] bArr, int i) {
        this.mac.digest(bArr, i);
    }

    public void initMac(int i) {
        this.mac.reset();
        this.mac.update((byte) (i >> 24));
        this.mac.update((byte) (i >> 16));
        this.mac.update((byte) (i >> 8));
        this.mac.update((byte) i);
    }

    public int size() {
        return this.size;
    }

    public void update(byte[] bArr, int i, int i2) {
        this.mac.update(bArr, i, i2);
    }
}
