package defpackage;

import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.TransportContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nc extends a61 {
    public final TransportContext a;
    public final String b;
    public final Event c;
    public final Transformer d;
    public final n20 e;

    public nc(TransportContext transportContext, String str, Event event, Transformer transformer, n20 n20Var) {
        this.a = transportContext;
        this.b = str;
        this.c = event;
        this.d = transformer;
        this.e = n20Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a61) {
            nc ncVar = (nc) ((a61) obj);
            if (this.a.equals(ncVar.a) && this.b.equals(ncVar.b) && this.c.equals(ncVar.c) && this.d.equals(ncVar.d) && this.e.equals(ncVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }
}
