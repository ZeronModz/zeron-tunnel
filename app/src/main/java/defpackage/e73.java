package defpackage;

import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhqy;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class e73 extends zzhbp {
    public final String a;
    public final zzhqy b;

    public /* synthetic */ e73(String str, zzhqy zzhqyVar) {
        this.a = str;
        this.b = zzhqyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean a() {
        return this.b != zzhqy.RAW;
    }

    public final String toString() {
        int iOrdinal = this.b.ordinal();
        return ec1.L("(typeUrl=", this.a, ", outputPrefixType=", iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}
