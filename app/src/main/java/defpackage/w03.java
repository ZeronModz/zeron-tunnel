package defpackage;

import com.google.android.gms.internal.ads.zzgov;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class w03 extends zzgov {
    public final String a;
    public final String b;

    public /* synthetic */ w03(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzgov
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgov
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgov)) {
            return false;
        }
        zzgov zzgovVar = (zzgov) obj;
        String str = this.a;
        if (str == null) {
            if (zzgovVar.a() != null) {
                return false;
            }
        } else if (!str.equals(zzgovVar.a())) {
            return false;
        }
        String str2 = this.b;
        return str2 == null ? zzgovVar.b() == null : str2.equals(zzgovVar.b());
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 50 + String.valueOf(str2).length() + 1);
        hz.H(sb, "OverlayDisplayDismissRequest{sessionToken=", str, ", appId=", str2);
        sb.append("}");
        return sb.toString();
    }
}
