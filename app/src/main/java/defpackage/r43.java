package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzeiu;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzfmu;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class r43 implements zzfmu {
    public static final r43 c;
    public static final r43 d;
    public static final r43 e;
    public static final r43 f;
    public static final r43 g;
    public static final r43 h;
    public static final r43 i;
    public static final r43 j;
    public static final r43 k;
    public static final r43 l;
    public static final r43 m;
    public static final r43 n;
    public static final r43 o;
    public static final r43 p;
    public static final r43 q;
    public static final r43 r;
    public static final r43 s;
    public final /* synthetic */ int a;
    public final String b;

    static {
        int i2 = 0;
        c = new r43("TINK", i2);
        d = new r43("CRUNCHY", i2);
        e = new r43("NO_PREFIX", i2);
        int i3 = 1;
        f = new r43("TINK", i3);
        g = new r43("CRUNCHY", i3);
        h = new r43("NO_PREFIX", i3);
        int i4 = 2;
        i = new r43("ASSUME_AES_GCM", i4);
        j = new r43("ASSUME_XCHACHA20POLY1305", i4);
        k = new r43("ASSUME_CHACHA20POLY1305", i4);
        l = new r43("ASSUME_AES_CTR_HMAC", i4);
        m = new r43("ASSUME_AES_EAX", i4);
        n = new r43("ASSUME_AES_GCM_SIV", i4);
        int i5 = 3;
        o = new r43("TINK", i5);
        p = new r43("CRUNCHY", i5);
        q = new r43("NO_PREFIX", i5);
        int i6 = 4;
        r = new r43("IEEE_P1363", i6);
        s = new r43("DER", i6);
    }

    public /* synthetic */ r43(String str, int i2) {
        this.a = i2;
        this.b = str;
    }

    public static r43 a(zzer zzerVar) {
        String str;
        zzerVar.E(2);
        int I = zzerVar.I();
        int i2 = I >> 1;
        int i3 = I & 1;
        int I2 = zzerVar.I() >> 3;
        if (i2 == 4 || i2 == 5 || i2 == 7 || i2 == 8) {
            str = "dvhe";
        } else if (i2 == 9) {
            str = "dvav";
        } else {
            if (i2 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i4 = I2 | (i3 << 5);
        String str2 = i2 < 10 ? ".0" : ".";
        int length = str2.length() + 4;
        int length2 = String.valueOf(i2).length();
        int length3 = String.valueOf(i4).length();
        String str3 = i4 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(ec1.H(length + length2, length3, str3));
        sb.append(str);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        sb.append(i4);
        return new r43(sb.toString(), 6);
    }

    public String toString() {
        int i2 = this.a;
        String str = this.b;
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return str;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    public Object zza(Object obj) {
        int i2 = zzeiu.c;
        ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{this.b, Integer.toString(0)});
        return null;
    }
}
