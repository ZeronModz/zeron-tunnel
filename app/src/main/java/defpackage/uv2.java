package defpackage;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzfrl;
import java.util.Objects;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class uv2 {
    public final String a;
    public final AdFormat b;
    public final String c;

    public /* synthetic */ uv2(zzfrl zzfrlVar) {
        this.a = zzfrlVar.a;
        this.b = zzfrlVar.b;
        this.c = zzfrlVar.c;
    }

    public final String a() {
        AdFormat adFormat = this.b;
        return adFormat == null ? "unknown" : adFormat.name().toLowerCase(Locale.ENGLISH);
    }

    public final boolean equals(Object obj) {
        AdFormat adFormat;
        AdFormat adFormat2;
        if (obj instanceof uv2) {
            uv2 uv2Var = (uv2) obj;
            if (this.a.equals(uv2Var.a) && (adFormat = this.b) != null && (adFormat2 = uv2Var.b) != null && adFormat.equals(adFormat2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
