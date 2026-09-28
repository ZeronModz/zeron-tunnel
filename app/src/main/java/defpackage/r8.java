package defpackage;

import androidx.recyclerview.widget.DiffUtil$Callback;
import androidx.recyclerview.widget.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class r8 extends DiffUtil$Callback {
    public final /* synthetic */ b a;

    public r8(b bVar) {
        this.a = bVar;
    }

    public final boolean a(int i, int i2) {
        b bVar = this.a;
        Object obj = bVar.a.get(i);
        Object obj2 = bVar.b.get(i2);
        if (obj != null && obj2 != null) {
            return bVar.d.b.b.a(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        zu0.a();
        return false;
    }

    public final boolean b(int i, int i2) {
        b bVar = this.a;
        Object obj = bVar.a.get(i);
        Object obj2 = bVar.b.get(i2);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : bVar.d.b.b.b(obj, obj2);
    }

    public final Object c(int i, int i2) {
        b bVar = this.a;
        Object obj = bVar.a.get(i);
        Object obj2 = bVar.b.get(i2);
        if (obj != null && obj2 != null) {
            return bVar.d.b.b.c(obj, obj2);
        }
        zu0.a();
        return null;
    }

    public final int d() {
        return this.a.b.size();
    }

    public final int e() {
        return this.a.a.size();
    }
}
