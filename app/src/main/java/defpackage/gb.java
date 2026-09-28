package defpackage;

import com.google.android.datatransport.cct.internal.ExternalPRequestContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gb extends ExternalPRequestContext {
    public final Integer a;

    public gb(Integer num) {
        this.a = num;
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext
    public final Integer a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalPRequestContext)) {
            return false;
        }
        ExternalPRequestContext externalPRequestContext = (ExternalPRequestContext) obj;
        Integer num = this.a;
        return num == null ? externalPRequestContext.a() == null : num.equals(externalPRequestContext.a());
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.a + "}";
    }
}
