package defpackage;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.internal.ads.zzejh;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yo2 extends zzejh {
    public final Activity a;
    public final zzm b;
    public final String c;
    public final String d;

    public /* synthetic */ yo2(Activity activity, zzm zzmVar, String str, String str2) {
        this.a = activity;
        this.b = zzmVar;
        this.c = str;
        this.d = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final Activity a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final zzm b() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final String c() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzejh)) {
            return false;
        }
        zzejh zzejhVar = (zzejh) obj;
        if (!this.a.equals(zzejhVar.a())) {
            return false;
        }
        zzm zzmVar = this.b;
        if (zzmVar == null) {
            if (zzejhVar.b() != null) {
                return false;
            }
        } else if (!zzmVar.equals(zzejhVar.b())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (zzejhVar.c() != null) {
                return false;
            }
        } else if (!str.equals(zzejhVar.c())) {
            return false;
        }
        String str2 = this.d;
        return str2 == null ? zzejhVar.d() == null : str2.equals(zzejhVar.d());
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        zzm zzmVar = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (zzmVar == null ? 0 : zzmVar.hashCode())) * 1000003;
        String str = this.c;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.b);
        int length2 = strValueOf.length();
        String str = this.c;
        int length3 = String.valueOf(str).length();
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        hz.H(sb, "OfflineUtilsParams{activity=", string, ", adOverlay=", strValueOf);
        hz.H(sb, ", gwsQueryId=", str, ", uri=", str2);
        sb.append("}");
        return sb.toString();
    }
}
