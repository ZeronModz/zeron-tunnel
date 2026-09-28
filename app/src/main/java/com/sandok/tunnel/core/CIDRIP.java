package com.sandok.tunnel.core;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class CIDRIP {
    int len;
    String mIp;

    public CIDRIP(String str, String str2) {
        this.mIp = str;
        long j = getInt(str2) + 4294967296L;
        int i = 0;
        while ((1 & j) == 0) {
            i++;
            j >>= 1;
        }
        if (j != (8589934591L >> i)) {
            this.len = 32;
        } else {
            this.len = 32 - i;
        }
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
        this.mIp = String.format("%d.%d.%d.%d", Long.valueOf(((-16777216) & j2) >> 24), Long.valueOf((16711680 & j2) >> 16), Long.valueOf((65280 & j2) >> 8), Long.valueOf(j2 & 255));
        return true;
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        return this.mIp + "/" + this.len;
    }

    public long getInt() {
        return getInt(this.mIp);
    }

    public CIDRIP(String str, int i) {
        this.len = i;
        this.mIp = str;
    }
}
