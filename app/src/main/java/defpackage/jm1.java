package defpackage;

import com.sandok.tunnel.core.Connection;
import com.trilead.ssh2.sftp.Packet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class jm1 {
    public static final int[] e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public static final jm1[] f = a();
    public final int a;
    public final int[] b;
    public final y60[] c;
    public final int d;

    public jm1(int i, int[] iArr, y60... y60VarArr) {
        this.a = i;
        this.b = iArr;
        this.c = y60VarArr;
        y60 y60Var = y60VarArr[0];
        int i2 = y60Var.a;
        int i3 = 0;
        for (l01 l01Var : (l01[]) y60Var.b) {
            i3 += (l01Var.c + i2) * l01Var.b;
        }
        this.d = i3;
    }

    public static jm1[] a() {
        int i = 1;
        int i2 = 2;
        int i3 = 16;
        int i4 = 4;
        jm1 jm1Var = new jm1(1, new int[0], new y60(7, new l01(i, 19, i2)), new y60(10, new l01(i, i3, i2)), new y60(13, new l01(i, 13, i2)), new y60(17, new l01(i, 9, i2)));
        jm1 jm1Var2 = new jm1(2, new int[]{6, 18}, new y60(10, new l01(i, 34, i2)), new y60(16, new l01(i, 28, i2)), new y60(22, new l01(i, 22, i2)), new y60(28, new l01(i, i3, i2)));
        jm1 jm1Var3 = new jm1(3, new int[]{6, 22}, new y60(15, new l01(i, 55, i2)), new y60(26, new l01(i, 44, i2)), new y60(18, new l01(i2, 17, i2)), new y60(22, new l01(i2, 13, i2)));
        jm1 jm1Var4 = new jm1(4, new int[]{6, 26}, new y60(20, new l01(i, 80, i2)), new y60(18, new l01(i2, 32, i2)), new y60(26, new l01(i2, 24, i2)), new y60(16, new l01(i4, 9, i2)));
        jm1 jm1Var5 = new jm1(5, new int[]{6, 30}, new y60(26, new l01(i, 108, i2)), new y60(24, new l01(i2, 43, i2)), new y60(18, new l01(i2, 15, i2), new l01(i2, 16, i2)), new y60(22, new l01(i2, 11, i2), new l01(i2, 12, i2)));
        jm1 jm1Var6 = new jm1(6, new int[]{6, 34}, new y60(18, new l01(i2, 68, i2)), new y60(16, new l01(i4, 27, i2)), new y60(24, new l01(i4, 19, i2)), new y60(28, new l01(i4, 15, i2)));
        jm1 jm1Var7 = new jm1(7, new int[]{6, 22, 38}, new y60(20, new l01(i2, 78, i2)), new y60(18, new l01(i4, 31, i2)), new y60(18, new l01(i2, 14, i2), new l01(i4, 15, i2)), new y60(26, new l01(i4, 13, i2), new l01(i, 14, i2)));
        jm1 jm1Var8 = new jm1(8, new int[]{6, 24, 42}, new y60(24, new l01(i2, 97, i2)), new y60(22, new l01(i2, 38, i2), new l01(i2, 39, i2)), new y60(22, new l01(4, 18, i2), new l01(i2, 19, i2)), new y60(26, new l01(4, 14, i2), new l01(i2, 15, i2)));
        int i5 = 4;
        jm1 jm1Var9 = new jm1(9, new int[]{6, 26, 46}, new y60(30, new l01(i2, 116, i2)), new y60(22, new l01(3, 36, i2), new l01(i2, 37, i2)), new y60(20, new l01(i5, 16, i2), new l01(i5, 17, i2)), new y60(24, new l01(i5, 12, i2), new l01(i5, 13, i2)));
        int i6 = 1;
        int i7 = 6;
        jm1 jm1Var10 = new jm1(10, new int[]{6, 28, 50}, new y60(18, new l01(i2, 68, i2), new l01(i2, 69, i2)), new y60(26, new l01(4, 43, i2), new l01(i6, 44, i2)), new y60(24, new l01(i7, 19, i2), new l01(i2, 20, i2)), new y60(28, new l01(i7, 15, i2), new l01(i2, 16, i2)));
        int i8 = 4;
        jm1 jm1Var11 = new jm1(11, new int[]{6, 30, 54}, new y60(20, new l01(i8, 81, i2)), new y60(30, new l01(i6, 50, i2), new l01(i8, 51, i2)), new y60(28, new l01(i8, 22, i2), new l01(i8, 23, i2)), new y60(24, new l01(3, 12, i2), new l01(8, 13, i2)));
        jm1 jm1Var12 = new jm1(12, new int[]{6, 32, 58}, new y60(24, new l01(i2, 92, i2), new l01(i2, 93, i2)), new y60(22, new l01(6, 36, i2), new l01(i2, 37, i2)), new y60(26, new l01(4, 20, i2), new l01(6, 21, i2)), new y60(28, new l01(7, 14, i2), new l01(4, 15, i2)));
        int i9 = 8;
        int i10 = 12;
        jm1 jm1Var13 = new jm1(13, new int[]{6, 34, 62}, new y60(26, new l01(4, 107, i2)), new y60(22, new l01(i9, 37, i2), new l01(1, 38, i2)), new y60(24, new l01(i9, 20, i2), new l01(4, 21, i2)), new y60(22, new l01(i10, 11, i2), new l01(4, i10, i2)));
        int i11 = 5;
        jm1 jm1Var14 = new jm1(14, new int[]{6, 26, 46, 66}, new y60(30, new l01(3, 115, i2), new l01(1, 116, i2)), new y60(24, new l01(4, 40, i2), new l01(i11, 41, i2)), new y60(20, new l01(11, 16, i2), new l01(i11, 17, i2)), new y60(24, new l01(11, 12, i2), new l01(5, 13, i2)));
        int i12 = 5;
        jm1 jm1Var15 = new jm1(15, new int[]{6, 26, 48, 70}, new y60(22, new l01(i12, 87, i2), new l01(1, 88, i2)), new y60(24, new l01(i12, 41, i2), new l01(i12, 42, i2)), new y60(30, new l01(i12, 24, i2), new l01(7, 25, i2)), new y60(24, new l01(11, 12, i2), new l01(7, 13, i2)));
        int i13 = 1;
        int i14 = 15;
        jm1 jm1Var16 = new jm1(16, new int[]{6, 26, 50, 74}, new y60(24, new l01(5, 98, i2), new l01(i13, 99, i2)), new y60(28, new l01(7, 45, i2), new l01(3, 46, i2)), new y60(24, new l01(i14, 19, i2), new l01(i2, 20, i2)), new y60(30, new l01(3, i14, i2), new l01(13, 16, i2)));
        y60 y60Var = new y60(28, new l01(i13, 107, i2), new l01(5, 108, i2));
        y60 y60Var2 = new y60(28, new l01(10, 46, i2), new l01(i13, 47, i2));
        l01 l01Var = new l01(i13, 22, i2);
        int i15 = 15;
        jm1 jm1Var17 = new jm1(17, new int[]{6, 30, 54, 78}, y60Var, y60Var2, new y60(28, l01Var, new l01(i15, 23, i2)), new y60(28, new l01(i2, 14, i2), new l01(17, i15, i2)));
        int i16 = 3;
        jm1 jm1Var18 = new jm1(18, new int[]{6, 30, 56, 82}, new y60(30, new l01(5, Connection.CONNECTION_DEFAULT_TIMEOUT, i2), new l01(1, 121, i2)), new y60(26, new l01(9, 43, i2), new l01(4, 44, i2)), new y60(28, new l01(17, 22, i2), new l01(1, 23, i2)), new y60(28, new l01(i2, 14, i2), new l01(19, 15, i2)));
        int i17 = 3;
        jm1 jm1Var19 = new jm1(19, new int[]{6, 30, 58, 86}, new y60(28, new l01(i16, 113, i2), new l01(4, 114, i2)), new y60(26, new l01(i16, 44, i2), new l01(11, 45, i2)), new y60(26, new l01(17, 21, i2), new l01(4, 22, i2)), new y60(26, new l01(9, 13, i2), new l01(16, 14, i2)));
        int i18 = 15;
        jm1 jm1Var20 = new jm1(20, new int[]{6, 34, 62, 90}, new y60(28, new l01(i17, 107, i2), new l01(5, 108, i2)), new y60(26, new l01(i17, 41, i2), new l01(13, 42, i2)), new y60(30, new l01(15, 24, i2), new l01(5, 25, i2)), new y60(28, new l01(i18, i18, i2), new l01(10, 16, i2)));
        int i19 = 4;
        int i20 = 17;
        jm1 jm1Var21 = new jm1(21, new int[]{6, 28, 50, 72, 94}, new y60(28, new l01(i19, 116, i2), new l01(i19, 117, i2)), new y60(26, new l01(i20, 42, i2)), new y60(28, new l01(i20, 22, i2), new l01(6, 23, i2)), new y60(30, new l01(19, 16, i2), new l01(6, 17, i2)));
        jm1 jm1Var22 = new jm1(22, new int[]{6, 26, 50, 74, 98}, new y60(28, new l01(i2, 111, i2), new l01(7, 112, i2)), new y60(28, new l01(17, 46, i2)), new y60(30, new l01(7, 24, i2), new l01(16, 25, i2)), new y60(24, new l01(34, 13, i2)));
        int i21 = 16;
        jm1 jm1Var23 = new jm1(23, new int[]{6, 30, 54, 78, Packet.SSH_FXP_HANDLE}, new y60(30, new l01(4, 121, i2), new l01(5, 122, i2)), new y60(28, new l01(4, 47, i2), new l01(14, 48, i2)), new y60(30, new l01(11, 24, i2), new l01(14, 25, i2)), new y60(30, new l01(i21, 15, i2), new l01(14, i21, i2)));
        int i22 = 6;
        int i23 = 16;
        jm1 jm1Var24 = new jm1(24, new int[]{6, 28, 54, 80, 106}, new y60(30, new l01(i22, 117, i2), new l01(4, 118, i2)), new y60(28, new l01(i22, 45, i2), new l01(14, 46, i2)), new y60(30, new l01(11, 24, i2), new l01(i23, 25, i2)), new y60(30, new l01(30, i23, i2), new l01(i2, 17, i2)));
        int i24 = 8;
        int i25 = 22;
        jm1 jm1Var25 = new jm1(25, new int[]{6, 32, 58, 84, 110}, new y60(26, new l01(i24, 106, i2), new l01(4, 107, i2)), new y60(28, new l01(i24, 47, i2), new l01(13, 48, i2)), new y60(30, new l01(7, 24, i2), new l01(i25, 25, i2)), new y60(30, new l01(i25, 15, i2), new l01(13, 16, i2)));
        jm1 jm1Var26 = new jm1(26, new int[]{6, 30, 58, 86, 114}, new y60(28, new l01(10, 114, i2), new l01(i2, 115, i2)), new y60(28, new l01(19, 46, i2), new l01(4, 47, i2)), new y60(28, new l01(28, 22, i2), new l01(6, 23, i2)), new y60(30, new l01(33, 16, i2), new l01(4, 17, i2)));
        int i26 = 3;
        jm1 jm1Var27 = new jm1(27, new int[]{6, 34, 62, 90, 118}, new y60(30, new l01(8, 122, i2), new l01(4, 123, i2)), new y60(28, new l01(22, 45, i2), new l01(3, 46, i2)), new y60(30, new l01(8, 23, i2), new l01(26, 24, i2)), new y60(30, new l01(12, 15, i2), new l01(28, 16, i2)));
        jm1 jm1Var28 = new jm1(28, new int[]{6, 26, 50, 74, 98, 122}, new y60(30, new l01(i26, 117, i2), new l01(10, 118, i2)), new y60(28, new l01(i26, 45, i2), new l01(23, 46, i2)), new y60(30, new l01(4, 24, i2), new l01(31, 25, i2)), new y60(30, new l01(11, 15, i2), new l01(31, 16, i2)));
        int i27 = 7;
        jm1 jm1Var29 = new jm1(29, new int[]{6, 30, 54, 78, Packet.SSH_FXP_HANDLE, 126}, new y60(30, new l01(i27, 116, i2), new l01(i27, 117, i2)), new y60(28, new l01(21, 45, i2), new l01(i27, 46, i2)), new y60(30, new l01(1, 23, i2), new l01(37, 24, i2)), new y60(30, new l01(19, 15, i2), new l01(26, 16, i2)));
        int i28 = 10;
        int i29 = 15;
        int i30 = 25;
        int i31 = 10;
        int i32 = 12;
        int i33 = 6;
        int i34 = 34;
        return new jm1[]{jm1Var, jm1Var2, jm1Var3, jm1Var4, jm1Var5, jm1Var6, jm1Var7, jm1Var8, jm1Var9, jm1Var10, jm1Var11, jm1Var12, jm1Var13, jm1Var14, jm1Var15, jm1Var16, jm1Var17, jm1Var18, jm1Var19, jm1Var20, jm1Var21, jm1Var22, jm1Var23, jm1Var24, jm1Var25, jm1Var26, jm1Var27, jm1Var28, jm1Var29, new jm1(30, new int[]{6, 26, 52, 78, Packet.SSH_FXP_NAME, 130}, new y60(30, new l01(5, 115, i2), new l01(i28, 116, i2)), new y60(28, new l01(19, 47, i2), new l01(i28, 48, i2)), new y60(30, new l01(i29, 24, i2), new l01(i30, i30, i2)), new y60(30, new l01(23, i29, i2), new l01(25, 16, i2))), new jm1(31, new int[]{6, 30, 56, 82, 108, 134}, new y60(30, new l01(13, 115, i2), new l01(3, 116, i2)), new y60(28, new l01(i2, 46, i2), new l01(29, 47, i2)), new y60(30, new l01(42, 24, i2), new l01(1, 25, i2)), new y60(30, new l01(23, 15, i2), new l01(28, 16, i2))), new jm1(32, new int[]{6, 34, 60, 86, 112, 138}, new y60(30, new l01(17, 115, i2)), new y60(28, new l01(i31, 46, i2), new l01(23, 47, i2)), new y60(30, new l01(i31, 24, i2), new l01(35, 25, i2)), new y60(30, new l01(19, 15, i2), new l01(35, 16, i2))), new jm1(33, new int[]{6, 30, 58, 86, 114, 142}, new y60(30, new l01(17, 115, i2), new l01(1, 116, i2)), new y60(28, new l01(14, 46, i2), new l01(21, 47, i2)), new y60(30, new l01(29, 24, i2), new l01(19, 25, i2)), new y60(30, new l01(11, 15, i2), new l01(46, 16, i2))), new jm1(34, new int[]{6, 34, 62, 90, 118, 146}, new y60(30, new l01(13, 115, i2), new l01(6, 116, i2)), new y60(28, new l01(14, 46, i2), new l01(23, 47, i2)), new y60(30, new l01(44, 24, i2), new l01(7, 25, i2)), new y60(30, new l01(59, 16, i2), new l01(1, 17, i2))), new jm1(35, new int[]{6, 30, 54, 78, Packet.SSH_FXP_HANDLE, 126, 150}, new y60(30, new l01(i32, 121, i2), new l01(7, 122, i2)), new y60(28, new l01(i32, 47, i2), new l01(26, 48, i2)), new y60(30, new l01(39, 24, i2), new l01(14, 25, i2)), new y60(30, new l01(22, 15, i2), new l01(41, 16, i2))), new jm1(36, new int[]{6, 24, 50, 76, Packet.SSH_FXP_HANDLE, 128, 154}, new y60(30, new l01(i33, 121, i2), new l01(14, 122, i2)), new y60(28, new l01(i33, 47, i2), new l01(34, 48, i2)), new y60(30, new l01(46, 24, i2), new l01(10, 25, i2)), new y60(30, new l01(i2, 15, i2), new l01(64, 16, i2))), new jm1(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new y60(30, new l01(17, 122, i2), new l01(4, 123, i2)), new y60(28, new l01(29, 46, i2), new l01(14, 47, i2)), new y60(30, new l01(49, 24, i2), new l01(10, 25, i2)), new y60(30, new l01(24, 15, i2), new l01(46, 16, i2))), new jm1(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new y60(30, new l01(4, 122, i2), new l01(18, 123, i2)), new y60(28, new l01(13, 46, i2), new l01(32, 47, i2)), new y60(30, new l01(48, 24, i2), new l01(14, 25, i2)), new y60(30, new l01(42, 15, i2), new l01(32, 16, i2))), new jm1(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new y60(30, new l01(20, 117, i2), new l01(4, 118, i2)), new y60(28, new l01(40, 47, i2), new l01(7, 48, i2)), new y60(30, new l01(43, 24, i2), new l01(22, 25, i2)), new y60(30, new l01(10, 15, i2), new l01(67, 16, i2))), new jm1(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new y60(30, new l01(19, 118, i2), new l01(6, 119, i2)), new y60(28, new l01(18, 47, i2), new l01(31, 48, i2)), new y60(30, new l01(i34, 24, i2), new l01(i34, 25, i2)), new y60(30, new l01(20, 15, i2), new l01(61, 16, i2)))};
    }

    public static jm1 b(int i) {
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        for (int i4 = 0; i4 < 34; i4++) {
            int i5 = e[i4];
            if (i5 == i) {
                return c(i4 + 7);
            }
            int iBitCount = Integer.bitCount(i5 ^ i);
            if (iBitCount < i2) {
                i3 = i4 + 7;
                i2 = iBitCount;
            }
        }
        if (i2 <= 3) {
            return c(i3);
        }
        return null;
    }

    public static jm1 c(int i) {
        if (i >= 1 && i <= 40) {
            return f[i - 1];
        }
        s31.c();
        return null;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
