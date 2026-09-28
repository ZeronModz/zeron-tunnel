package defpackage;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class js implements Deferred.DeferredHandler, SynchronizationGuard.CriticalSection {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ js(Uploader uploader, Iterable iterable, TransportContext transportContext, long j) {
        this.b = uploader;
        this.c = iterable;
        this.d = transportContext;
        this.a = j;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        Uploader uploader = (Uploader) this.b;
        Iterable<PersistedEvent> iterable = (Iterable) this.c;
        TransportContext transportContext = (TransportContext) this.d;
        EventStore eventStore = uploader.c;
        eventStore.recordFailure(iterable);
        eventStore.recordNextCallTime(transportContext, uploader.g.getTime() + this.a);
        return null;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        ((CrashlyticsNativeComponent) provider.get()).prepareNativeSession((String) this.b, (String) this.c, this.a, (StaticSessionData) this.d);
    }

    public /* synthetic */ js(String str, String str2, long j, StaticSessionData staticSessionData) {
        this.b = str;
        this.c = str2;
        this.a = j;
        this.d = staticSessionData;
    }
}
