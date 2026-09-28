package defpackage;

import java.net.Inet4Address;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class jg0 {
    public static final rm a = new rm('.');
    public static final rm b = new rm(':');
    public static final Inet4Address c;

    static {
        c = (Inet4Address) a("0.0.0.0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x014e, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x014f, code lost:
    
        r0 = r3.array();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0154, code lost:
    
        if (r2 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0156, code lost:
    
        if (r1 == (-1)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x015a, code lost:
    
        r0 = c(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if (r3 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r2 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        r2 = r14.lastIndexOf(58) + 1;
        r10 = r14.substring(0, r2);
        r2 = c(r14.substring(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (r2 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        r2 = defpackage.hz.v(r10, java.lang.Integer.toHexString(((r2[0] & 255) << 8) | (r2[1] & 255)), ":", java.lang.Integer.toHexString((r2[3] & 255) | ((r2[2] & 255) << 8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r2 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        if (r1 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        r2 = r2.substring(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        r1 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (r1 >= r2.length()) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        if (defpackage.jg0.b.a(r2.charAt(r1)) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0096, code lost:
    
        if (r10 < 2) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0098, code lost:
    
        if (r10 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
    
        r10 = r10 + 1;
        r1 = 8 - r10;
        r11 = 0;
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
    
        if (r11 >= (r2.length() - 1)) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        if (r2.charAt(r11) != ':') goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b3, code lost:
    
        if (r2.charAt(r11 + 1) != ':') goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
    
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b9, code lost:
    
        r12 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bb, code lost:
    
        if (r11 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bd, code lost:
    
        r12 = r1 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c4, code lost:
    
        if (r11 != (r2.length() - 2)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c8, code lost:
    
        r1 = r12;
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ca, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d1, code lost:
    
        if (r2.charAt(0) != ':') goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d7, code lost:
    
        if (r2.charAt(1) == ':') goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e4, code lost:
    
        if (r2.charAt(r2.length() - 1) != ':') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ef, code lost:
    
        if (r2.charAt(r2.length() - 2) == ':') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f3, code lost:
    
        if (r12 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f5, code lost:
    
        if (r1 > 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f9, code lost:
    
        if (r12 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00fb, code lost:
    
        if (r10 == 8) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ff, code lost:
    
        r3 = java.nio.ByteBuffer.allocate(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0107, code lost:
    
        if (r2.charAt(0) != ':') goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010a, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x010f, code lost:
    
        if (r7 >= r2.length()) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0111, code lost:
    
        r4 = r2.indexOf(58, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0115, code lost:
    
        if (r4 != (-1)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0117, code lost:
    
        r4 = r2.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x011f, code lost:
    
        if (r2.charAt(r7) != ':') goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0121, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0122, code lost:
    
        if (r7 >= r1) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0124, code lost:
    
        r3.putShort(0);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x012a, code lost:
    
        r10 = r4 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x012c, code lost:
    
        if (r10 <= 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x012f, code lost:
    
        if (r10 > 4) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0131, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0132, code lost:
    
        if (r7 >= r4) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0134, code lost:
    
        r10 = (r10 << 4) | java.lang.Character.digit(r2.charAt(r7), 16);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0142, code lost:
    
        r3.putShort((short) r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0146, code lost:
    
        r7 = r4 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.InetAddress a(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg0.a(java.lang.String):java.net.InetAddress");
    }

    public static byte b(int i, int i2, String str) {
        int i3 = i2 - i;
        if (i3 <= 0 || i3 > 3) {
            throw new NumberFormatException();
        }
        if (i3 > 1 && str.charAt(i) == '0') {
            throw new NumberFormatException();
        }
        int i4 = 0;
        while (i < i2) {
            int i5 = i4 * 10;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException();
            }
            i4 = i5 + iDigit;
            i++;
        }
        if (i4 <= 255) {
            return (byte) i4;
        }
        throw new NumberFormatException();
    }

    public static byte[] c(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (a.a(str.charAt(i2))) {
                i++;
            }
        }
        if (i + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i3 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            int iIndexOf = str.indexOf(46, i3);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            try {
                bArr[i4] = b(i3, iIndexOf, str);
                i3 = iIndexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }
}
