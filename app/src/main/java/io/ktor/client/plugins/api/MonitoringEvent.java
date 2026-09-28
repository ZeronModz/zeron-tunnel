package io.ktor.client.plugins.api;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import defpackage.t;
import io.ktor.client.HttpClient;
import io.ktor.events.EventDefinition;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u0005B\u000f\u0012\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/client/plugins/api/MonitoringEvent;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Param", "Lio/ktor/events/EventDefinition;", "Event", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function1;", "Lmk1;", "event", "<init>", "(Lio/ktor/events/EventDefinition;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MonitoringEvent<Param, Event extends EventDefinition<Param>> implements ClientHook<Function1<? super Param, ? extends mk1>> {
    public final EventDefinition a;

    public MonitoringEvent(Event event) {
        event.getClass();
        this.a = event;
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public final void install(HttpClient httpClient, Object obj) {
        Function1 function1 = (Function1) obj;
        httpClient.getClass();
        function1.getClass();
        httpClient.j.b(this.a, new t(function1, 17));
    }
}
