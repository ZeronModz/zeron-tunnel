package io.ktor.util.debug.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.vh;
import defpackage.xu;
import defpackage.yg0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.c;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lio/ktor/util/debug/plugins/PluginsTrace;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/util/debug/plugins/PluginTraceElement;", "eventOrder", "<init>", "(Ljava/util/List;)V", "Key", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PluginsTrace extends AbstractCoroutineContextElement {
    public static final Key c = new Key(null);
    public final List b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lio/ktor/util/debug/plugins/PluginsTrace$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lio/ktor/util/debug/plugins/PluginsTrace;", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Key implements CoroutineContext.Key<PluginsTrace> {
        public Key(xu xuVar) {
        }
    }

    public /* synthetic */ PluginsTrace(List list, int i, xu xuVar) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PluginsTrace) && yg0.a(this.b, ((PluginsTrace) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return vh.q(new StringBuilder("PluginsTrace("), c.w(this.b, null, null, null, null, 63), ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PluginsTrace() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginsTrace(List<PluginTraceElement> list) {
        super(c);
        list.getClass();
        this.b = list;
    }
}
