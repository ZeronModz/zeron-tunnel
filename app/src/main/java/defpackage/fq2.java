package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fq2 {
    public final String a;
    public final String b;
    public int c;
    public long d;
    public final Integer e;

    public fq2(String str, String str2, int i, long j, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = num;
    }

    public final String toString() {
        Integer num;
        int i = this.c;
        long j = this.d;
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(i).length() + 1 + String.valueOf(j).length());
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".");
        sb.append(j);
        String string = sb.toString();
        String str2 = this.b;
        if (!TextUtils.isEmpty(str2)) {
            string = vh.t(new StringBuilder(string.length() + 1 + String.valueOf(str2).length()), string, ".", str2);
        }
        if (!((Boolean) zzbd.zzc().a(p32.i2)).booleanValue() || (num = this.e) == null || TextUtils.isEmpty(str2)) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder(string.length() + 1 + num.toString().length());
        sb2.append(string);
        sb2.append(".");
        sb2.append(num);
        return sb2.toString();
    }
}
