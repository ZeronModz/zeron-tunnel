package defpackage;

import com.google.android.gms.internal.measurement.zzca;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q72 extends zzca {
    public final String b;
    public final int c;
    public final int d;

    public /* synthetic */ q72(String str, int i, int i2) {
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final String a() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final int b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final int c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof zzca)) {
                return false;
            }
            zzca zzcaVar = (zzca) obj;
            if (!this.b.equals(zzcaVar.a())) {
                return false;
            }
            int iB = zzcaVar.b();
            int i = this.c;
            if (i == 0) {
                throw null;
            }
            if (i != iB) {
                return false;
            }
            int iC = zzcaVar.c();
            if (this.d == 0) {
                throw null;
            }
            if (iC != 1) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() ^ 1000003;
        int i = this.c;
        if (i == 0) {
            throw null;
        }
        int i2 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i;
        if (this.d != 0) {
            return (i2 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i = this.c;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.d == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.b;
        StringBuilder sb = new StringBuilder(str2.length() + ec1.H(String.valueOf(str3).length() + 73, 91, str) + 1);
        hz.H(sb, "FileComplianceOptions{fileOwner=", str3, ", hasDifferentDmaOwner=false, fileChecks=", str);
        return vh.t(sb, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", str2, "}");
    }
}
