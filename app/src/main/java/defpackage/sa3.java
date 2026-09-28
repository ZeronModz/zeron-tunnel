package defpackage;

import java.security.spec.ECParameterSpec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class sa3 {
    public static final sa3 c = new sa3("NIST_P256", w63.a);
    public static final sa3 d = new sa3("NIST_P384", w63.b);
    public static final sa3 e = new sa3("NIST_P521", w63.c);
    public final String a;
    public final ECParameterSpec b;

    public sa3(String str, ECParameterSpec eCParameterSpec) {
        this.a = str;
        this.b = eCParameterSpec;
    }

    public final String toString() {
        return this.a;
    }
}
