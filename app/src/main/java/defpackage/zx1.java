package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zx1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public zx1(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static zx1 a(String str) {
        n8.S(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                if (i3 == -1 || i4 == -1 || i6 == -1) {
                    return null;
                }
                return new zx1(i2, i3, i4, i5, i6, length);
            }
            String strB = ay2.B(strArrSplit[i].trim());
            switch (strB.hashCode()) {
                case 100571:
                    if (strB.equals("end")) {
                        i4 = i;
                    }
                    break;
                case 3556653:
                    if (strB.equals("text")) {
                        i6 = i;
                    }
                    break;
                case 102749521:
                    if (strB.equals("layer")) {
                        i2 = i;
                    }
                    break;
                case 109757538:
                    if (strB.equals("start")) {
                        i3 = i;
                    }
                    break;
                case 109780401:
                    if (strB.equals("style")) {
                        i5 = i;
                    }
                    break;
            }
            i++;
        }
    }
}
