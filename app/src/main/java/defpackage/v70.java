package defpackage;

import com.google.common.base.Optional;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v70 implements Iterable {
    public final Optional a;

    public v70() {
        this.a = Optional.absent();
    }

    public static v70 a(Iterable iterable) {
        return iterable instanceof v70 ? (v70) iterable : new u70(iterable, iterable);
    }

    public final String toString() {
        Iterator it = ((Iterable) this.a.or(this)).iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public v70(Iterable iterable) {
        this.a = Optional.of(iterable);
    }
}
