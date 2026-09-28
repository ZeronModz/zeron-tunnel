package net.i2p.crypto.eddsa;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class Utils {
    public static int a(int i, int i2) {
        int i3 = i ^ i2;
        int i4 = 0;
        for (int i5 = 0; i5 < 8; i5++) {
            i4 |= i3 >> i5;
        }
        return (i4 ^ 1) & 1;
    }

    public static byte[] b(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
        }
        return bArr;
    }
}
