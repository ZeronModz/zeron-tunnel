package org.uproxy.tun2socks;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class Tun2SocksJni {
    static {
        System.loadLibrary("tun2socks");
    }

    public static void logTun2Socks(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(str2);
        sb.append("): ");
        sb.append(str3);
    }

    public static native int runTun2Socks(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, int i4);

    public static native int terminateTun2Socks();
}
