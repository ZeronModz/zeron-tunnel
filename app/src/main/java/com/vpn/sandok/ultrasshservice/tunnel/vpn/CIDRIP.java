package com.vpn.sandok.ultrasshservice.tunnel.vpn;

import defpackage.hz;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class CIDRIP {
    int len;
    String mIp;

    public CIDRIP(String str, String str2) {
        this.mIp = str;
        this.len = calculateLenFromMask(str2);
    }

    public static int calculateLenFromMask(String str) {
        long j = getInt(str) + 4294967296L;
        int i = 0;
        while ((1 & j) == 0) {
            i++;
            j >>= 1;
        }
        if (j != (8589934591L >> i)) {
            return 32;
        }
        return 32 - i;
    }

    public static long getInt(String str) {
        String[] strArrSplit = str.split("\\.");
        return (Long.parseLong(strArrSplit[0]) << 24) + ((long) (Integer.parseInt(strArrSplit[1]) << 16)) + ((long) (Integer.parseInt(strArrSplit[2]) << 8)) + ((long) Integer.parseInt(strArrSplit[3]));
    }

    public boolean normalise() {
        long j = getInt(this.mIp);
        long j2 = (4294967295L << (32 - this.len)) & j;
        if (j2 == j) {
            return false;
        }
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder();
        sb.append(((-16777216) & j2) >> 24);
        sb.append(".");
        sb.append((16711680 & j2) >> 16);
        hz.G(sb, ".", (65280 & j2) >> 8, ".");
        sb.append(j2 & 255);
        this.mIp = sb.toString();
        return true;
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        return this.mIp + "/" + this.len;
    }

    public CIDRIP(String str, int i) {
        this.len = i;
        this.mIp = str;
    }

    public long getInt() {
        return getInt(this.mIp);
    }
}
