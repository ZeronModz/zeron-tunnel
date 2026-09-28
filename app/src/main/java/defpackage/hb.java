package defpackage;

import com.google.android.datatransport.cct.internal.ExternalPRequestContext;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hb extends ExternalPrivacyContext {
    public final gb a;

    public hb(gb gbVar) {
        this.a = gbVar;
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext
    public final ExternalPRequestContext a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalPrivacyContext)) {
            return false;
        }
        ExternalPrivacyContext externalPrivacyContext = (ExternalPrivacyContext) obj;
        gb gbVar = this.a;
        return gbVar == null ? externalPrivacyContext.a() == null : gbVar.equals(externalPrivacyContext.a());
    }

    public final int hashCode() {
        gb gbVar = this.a;
        return (gbVar == null ? 0 : gbVar.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.a + "}";
    }
}
