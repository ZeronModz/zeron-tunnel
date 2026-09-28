package defpackage;

import com.google.android.datatransport.Event;
import com.google.android.datatransport.EventContext;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.ProductData;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cb extends Event {
    public final Object a;
    public final Priority b;
    public final ProductData c;

    public cb(Object obj, Priority priority, gc gcVar) {
        if (obj == null) {
            io0.e("Null payload");
            throw null;
        }
        this.a = obj;
        if (priority == null) {
            io0.e("Null priority");
            throw null;
        }
        this.b = priority;
        this.c = gcVar;
    }

    @Override // com.google.android.datatransport.Event
    public final Integer a() {
        return null;
    }

    @Override // com.google.android.datatransport.Event
    public final EventContext b() {
        return null;
    }

    @Override // com.google.android.datatransport.Event
    public final Object c() {
        return this.a;
    }

    @Override // com.google.android.datatransport.Event
    public final Priority d() {
        return this.b;
    }

    @Override // com.google.android.datatransport.Event
    public final ProductData e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        if (event.a() != null || !this.a.equals(event.c()) || !this.b.equals(event.d())) {
            return false;
        }
        ProductData productData = this.c;
        if (productData == null) {
            if (event.e() != null) {
                return false;
            }
        } else if (!productData.equals(event.e())) {
            return false;
        }
        return event.b() == null;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        ProductData productData = this.c;
        return ((productData == null ? 0 : productData.hashCode()) ^ iHashCode) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + ", productData=" + this.c + ", eventContext=null}";
    }
}
