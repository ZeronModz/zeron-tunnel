package defpackage;

import com.google.android.datatransport.cct.internal.LogResponse;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vb extends LogResponse {
    public final long a;

    public vb(long j) {
        this.a = j;
    }

    @Override // com.google.android.datatransport.cct.internal.LogResponse
    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof LogResponse) && this.a == ((LogResponse) obj).b();
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return vh.p(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
