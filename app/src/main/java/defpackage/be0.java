package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import okio.ByteString;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class be0 {
    public static final ByteString a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;

    static {
        ByteString.INSTANCE.getClass();
        a = ByteString.Companion.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            binaryString.getClass();
            String strReplace = sl1.h("%8s", binaryString).replace(' ', '0');
            strReplace.getClass();
            strArr[i] = strReplace;
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = vh.s(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = vh.s(sb, strArr3[i4], "|PADDED");
        }
        int length = c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = c;
            if (strArr4[i7] == null) {
                strArr4[i7] = d[i7];
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(int r10, boolean r11, int r12, int r13, int r14) {
        /*
            java.lang.String[] r0 = defpackage.be0.b
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r13 >= r1) goto La
            r0 = r0[r13]
            goto L18
        La:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r0
            java.lang.String r0 = "0x%02x"
            java.lang.String r0 = defpackage.sl1.h(r0, r1)
        L18:
            r1 = 5
            r4 = 3
            r5 = 2
            r6 = 4
            if (r14 != 0) goto L21
            java.lang.String r13 = ""
            goto L6a
        L21:
            java.lang.String[] r7 = defpackage.be0.d
            if (r13 == r5) goto L68
            if (r13 == r4) goto L68
            if (r13 == r6) goto L60
            r8 = 6
            if (r13 == r8) goto L60
            r8 = 7
            if (r13 == r8) goto L68
            r8 = 8
            if (r13 == r8) goto L68
            java.lang.String[] r8 = defpackage.be0.c
            int r9 = r8.length
            if (r14 >= r9) goto L3e
            r7 = r8[r14]
            r7.getClass()
            goto L40
        L3e:
            r7 = r7[r14]
        L40:
            if (r13 != r1) goto L4f
            r8 = r14 & 4
            if (r8 == 0) goto L4f
            java.lang.String r13 = "HEADERS"
            java.lang.String r14 = "PUSH_PROMISE"
            java.lang.String r13 = kotlin.text.g.M(r7, r13, r14)
            goto L6a
        L4f:
            if (r13 != 0) goto L5e
            r13 = r14 & 32
            if (r13 == 0) goto L5e
            java.lang.String r13 = "PRIORITY"
            java.lang.String r14 = "COMPRESSED"
            java.lang.String r13 = kotlin.text.g.M(r7, r13, r14)
            goto L6a
        L5e:
            r13 = r7
            goto L6a
        L60:
            if (r14 != r3) goto L65
            java.lang.String r13 = "ACK"
            goto L6a
        L65:
            r13 = r7[r14]
            goto L6a
        L68:
            r13 = r7[r14]
        L6a:
            if (r11 == 0) goto L6f
            java.lang.String r11 = "<<"
            goto L71
        L6f:
            java.lang.String r11 = ">>"
        L71:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r14 = new java.lang.Object[r1]
            r14[r2] = r11
            r14[r3] = r10
            r14[r5] = r12
            r14[r4] = r0
            r14[r6] = r13
            java.lang.String r10 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r10 = defpackage.sl1.h(r10, r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be0.a(int, boolean, int, int, int):java.lang.String");
    }
}
