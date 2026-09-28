package defpackage;

import com.google.firebase.crashlytics.internal.metadata.RolloutAssignment;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class lc extends RolloutAssignment {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public lc(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            io0.e("Null rolloutId");
            throw null;
        }
        this.b = str;
        if (str2 == null) {
            io0.e("Null parameterKey");
            throw null;
        }
        this.c = str2;
        this.d = str3;
        if (str4 == null) {
            io0.e("Null variantId");
            throw null;
        }
        this.e = str4;
        this.f = j;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final String a() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final String b() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final String c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final long d() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RolloutAssignment)) {
            return false;
        }
        RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
        return this.b.equals(rolloutAssignment.c()) && this.c.equals(rolloutAssignment.a()) && this.d.equals(rolloutAssignment.b()) && this.e.equals(rolloutAssignment.e()) && this.f == rolloutAssignment.d();
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return ((int) (j ^ (j >>> 32))) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return vh.p(sb, this.f, "}");
    }
}
