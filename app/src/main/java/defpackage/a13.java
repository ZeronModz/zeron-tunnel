package defpackage;

import com.google.android.gms.internal.ads.zzgps;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class a13 extends zzgps {
    public final int a;
    public final String b;
    public final int c;

    public /* synthetic */ a13(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgps
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgps
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzgps
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgps)) {
            return false;
        }
        zzgps zzgpsVar = (zzgps) obj;
        if (this.a != zzgpsVar.a()) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (zzgpsVar.b() != null) {
                return false;
            }
        } else if (!str.equals(zzgpsVar.b())) {
            return false;
        }
        return this.c == zzgpsVar.c();
    }

    public final int hashCode() {
        String str = this.b;
        return this.c ^ (((str == null ? 0 : str.hashCode()) ^ ((this.a ^ 1000003) * 1000003)) * 1000003);
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        String str = this.b;
        int length2 = String.valueOf(str).length();
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 9 + String.valueOf(i2).length() + 1);
        sb.append("OverlayDisplayState{statusCode=");
        sb.append(i);
        sb.append(", sessionToken=");
        sb.append(str);
        return vh.r(sb, ", uiMode=", i2, "}");
    }
}
