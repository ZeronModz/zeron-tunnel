package defpackage;

import android.hardware.camera2.CaptureRequest;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xa extends jq {
    public final String a;
    public final Class b;
    public final Object c;

    public xa(String str, Class cls, CaptureRequest.Key key) {
        if (str == null) {
            io0.e("Null id");
            throw null;
        }
        this.a = str;
        if (cls == null) {
            io0.e("Null valueClass");
            throw null;
        }
        this.b = cls;
        this.c = key;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jq) {
            xa xaVar = (xa) ((jq) obj);
            if (this.a.equals(xaVar.a) && this.b.equals(xaVar.b)) {
                Object obj2 = xaVar.c;
                Object obj3 = this.c;
                if (obj3 != null ? obj3.equals(obj2) : obj2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Object obj = this.c;
        return (obj == null ? 0 : obj.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Option{id=");
        sb.append(this.a);
        sb.append(", valueClass=");
        sb.append(this.b);
        sb.append(", token=");
        return vh.k(this.c, "}", sb);
    }
}
