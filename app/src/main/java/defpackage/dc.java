package defpackage;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dc extends PersistedEvent {
    public final long a;
    public final TransportContext b;
    public final EventInternal c;

    public dc(long j, TransportContext transportContext, EventInternal eventInternal) {
        this.a = j;
        if (transportContext == null) {
            io0.e("Null transportContext");
            throw null;
        }
        this.b = transportContext;
        if (eventInternal != null) {
            this.c = eventInternal;
        } else {
            io0.e("Null event");
            throw null;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public final EventInternal a() {
        return this.c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public final long b() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public final TransportContext c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedEvent)) {
            return false;
        }
        PersistedEvent persistedEvent = (PersistedEvent) obj;
        return this.a == persistedEvent.b() && this.b.equals(persistedEvent.c()) && this.c.equals(persistedEvent.a());
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
