package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.sandok.tunnel.core.Connection;
import com.trilead.ssh2.sftp.Packet;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class km1 {
    public static final km1[] h;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final y60 f;
    public final int g;

    static {
        km1 km1Var = new km1(1, 10, 10, 8, 8, new y60(5, new l01(1, 3, 3)));
        km1 km1Var2 = new km1(2, 12, 12, 10, 10, new y60(7, new l01(1, 5, 3)));
        km1 km1Var3 = new km1(3, 14, 14, 12, 12, new y60(10, new l01(1, 8, 3)));
        km1 km1Var4 = new km1(4, 16, 16, 14, 14, new y60(12, new l01(1, 12, 3)));
        km1 km1Var5 = new km1(5, 18, 18, 16, 16, new y60(14, new l01(1, 18, 3)));
        km1 km1Var6 = new km1(6, 20, 20, 18, 18, new y60(18, new l01(1, 22, 3)));
        km1 km1Var7 = new km1(7, 22, 22, 20, 20, new y60(20, new l01(1, 30, 3)));
        km1 km1Var8 = new km1(8, 24, 24, 22, 22, new y60(24, new l01(1, 36, 3)));
        km1 km1Var9 = new km1(9, 26, 26, 24, 24, new y60(28, new l01(1, 44, 3)));
        km1 km1Var10 = new km1(10, 32, 32, 14, 14, new y60(36, new l01(1, 62, 3)));
        km1 km1Var11 = new km1(11, 36, 36, 16, 16, new y60(42, new l01(1, 86, 3)));
        km1 km1Var12 = new km1(12, 40, 40, 18, 18, new y60(48, new l01(1, 114, 3)));
        km1 km1Var13 = new km1(13, 44, 44, 20, 20, new y60(56, new l01(1, 144, 3)));
        km1 km1Var14 = new km1(14, 48, 48, 22, 22, new y60(68, new l01(1, 174, 3)));
        km1 km1Var15 = new km1(15, 52, 52, 24, 24, new y60(42, new l01(2, Packet.SSH_FXP_HANDLE, 3)));
        km1 km1Var16 = new km1(16, 64, 64, 14, 14, new y60(56, new l01(2, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA, 3)));
        km1 km1Var17 = new km1(17, 72, 72, 16, 16, new y60(36, new l01(4, 92, 3)));
        km1 km1Var18 = new km1(18, 80, 80, 18, 18, new y60(48, new l01(4, 114, 3)));
        km1 km1Var19 = new km1(19, 88, 88, 20, 20, new y60(56, new l01(4, 144, 3)));
        km1 km1Var20 = new km1(20, 96, 96, 22, 22, new y60(68, new l01(4, 174, 3)));
        km1 km1Var21 = new km1(21, Packet.SSH_FXP_NAME, Packet.SSH_FXP_NAME, 24, 24, new y60(56, new l01(6, 136, 3)));
        km1 km1Var22 = new km1(22, Connection.CONNECTION_DEFAULT_TIMEOUT, Connection.CONNECTION_DEFAULT_TIMEOUT, 18, 18, new y60(68, new l01(6, 175, 3)));
        km1 km1Var23 = new km1(23, 132, 132, 20, 20, new y60(62, new l01(8, 163, 3)));
        l01 l01Var = new l01(8, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_GCM_SHA256, 3);
        l01 l01Var2 = new l01(2, ModuleDescriptor.MODULE_VERSION, 3);
        y60 y60Var = new y60();
        y60Var.a = 62;
        y60Var.b = new l01[]{l01Var, l01Var2};
        h = new km1[]{km1Var, km1Var2, km1Var3, km1Var4, km1Var5, km1Var6, km1Var7, km1Var8, km1Var9, km1Var10, km1Var11, km1Var12, km1Var13, km1Var14, km1Var15, km1Var16, km1Var17, km1Var18, km1Var19, km1Var20, km1Var21, km1Var22, km1Var23, new km1(24, 144, 144, 22, 22, y60Var), new km1(25, 8, 18, 6, 16, new y60(7, new l01(1, 5, 3))), new km1(26, 8, 32, 6, 14, new y60(11, new l01(1, 10, 3))), new km1(27, 12, 26, 10, 24, new y60(14, new l01(1, 16, 3))), new km1(28, 12, 36, 10, 16, new y60(18, new l01(1, 22, 3))), new km1(29, 16, 36, 14, 16, new y60(24, new l01(1, 32, 3))), new km1(30, 16, 48, 14, 22, new y60(28, new l01(1, 49, 3))), new km1(31, 8, 48, 6, 22, new y60(15, new l01(1, 18, 3))), new km1(32, 8, 64, 6, 14, new y60(18, new l01(1, 24, 3))), new km1(33, 8, 80, 6, 18, new y60(22, new l01(1, 32, 3))), new km1(34, 8, 96, 6, 22, new y60(28, new l01(1, 38, 3))), new km1(35, 8, Connection.CONNECTION_DEFAULT_TIMEOUT, 6, 18, new y60(32, new l01(1, 49, 3))), new km1(36, 8, 144, 6, 22, new y60(36, new l01(1, 63, 3))), new km1(37, 12, 64, 10, 14, new y60(27, new l01(1, 43, 3))), new km1(38, 12, 88, 10, 20, new y60(36, new l01(1, 64, 3))), new km1(39, 16, 64, 14, 14, new y60(36, new l01(1, 62, 3))), new km1(40, 20, 36, 18, 16, new y60(28, new l01(1, 44, 3))), new km1(41, 20, 44, 18, 20, new y60(34, new l01(1, 56, 3))), new km1(42, 20, 64, 18, 14, new y60(42, new l01(1, 84, 3))), new km1(43, 22, 48, 20, 22, new y60(38, new l01(1, 72, 3))), new km1(44, 24, 48, 22, 22, new y60(41, new l01(1, 80, 3))), new km1(45, 24, 64, 22, 14, new y60(46, new l01(1, 108, 3))), new km1(46, 26, 40, 24, 18, new y60(38, new l01(1, 70, 3))), new km1(47, 26, 48, 24, 22, new y60(42, new l01(1, 90, 3))), new km1(48, 26, 64, 24, 14, new y60(50, new l01(1, 118, 3)))};
    }

    public km1(int i, int i2, int i3, int i4, int i5, y60 y60Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = y60Var;
        int i6 = y60Var.a;
        int i7 = 0;
        for (l01 l01Var : (l01[]) y60Var.b) {
            i7 += (l01Var.c + i6) * l01Var.b;
        }
        this.g = i7;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
