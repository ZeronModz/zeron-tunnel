package defpackage;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportContext;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ad extends TransportContext {
    public final String a;
    public final byte[] b;
    public final Priority c;

    public ad(String str, byte[] bArr, Priority priority) {
        this.a = str;
        this.b = bArr;
        this.c = priority;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public final String b() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public final byte[] c() {
        return this.b;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public final Priority d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransportContext)) {
            return false;
        }
        TransportContext transportContext = (TransportContext) obj;
        if (this.a.equals(transportContext.b())) {
            return Arrays.equals(this.b, transportContext instanceof ad ? ((ad) transportContext).b : transportContext.c()) && this.c.equals(transportContext.d());
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }
}
