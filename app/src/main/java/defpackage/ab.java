package defpackage;

import androidx.concurrent.futures.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ab {
    public final int a;
    public final int b;
    public final b c;

    public ab(int i, int i2, b bVar) {
        this.a = i;
        this.b = i2;
        if (bVar != null) {
            this.c = bVar;
        } else {
            io0.e("Null completer");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ab) {
            ab abVar = (ab) obj;
            if (this.a == abVar.a && this.b == abVar.b && this.c.equals(abVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.a + ", rotationDegrees=" + this.b + ", completer=" + this.c + "}";
    }
}
