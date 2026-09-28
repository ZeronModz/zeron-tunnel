package defpackage;

import com.google.android.datatransport.runtime.backends.BackendRequest;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ra extends BackendRequest {
    public final Iterable a;
    public final byte[] b;

    public ra(Iterable iterable, byte[] bArr) {
        this.a = iterable;
        this.b = bArr;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public final Iterable a() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendRequest)) {
            return false;
        }
        BackendRequest backendRequest = (BackendRequest) obj;
        if (this.a.equals(backendRequest.a())) {
            return Arrays.equals(this.b, backendRequest instanceof ra ? ((ra) backendRequest).b : backendRequest.b());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }
}
