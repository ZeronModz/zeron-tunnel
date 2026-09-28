package defpackage;

import com.google.android.datatransport.cct.internal.ExperimentIds;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fb extends ExperimentIds {
    public final byte[] a;
    public final byte[] b;

    public fb(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    public final byte[] a() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExperimentIds)) {
            return false;
        }
        ExperimentIds experimentIds = (ExperimentIds) obj;
        boolean z = experimentIds instanceof fb;
        if (Arrays.equals(this.a, z ? ((fb) experimentIds).a : experimentIds.a())) {
            return Arrays.equals(this.b, z ? ((fb) experimentIds).b : experimentIds.b());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((Arrays.hashCode(this.a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
