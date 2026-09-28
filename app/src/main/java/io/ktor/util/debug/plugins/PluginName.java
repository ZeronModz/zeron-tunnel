package io.ktor.util.debug.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.vh;
import defpackage.xu;
import defpackage.yg0;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lio/ktor/util/debug/plugins/PluginName;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "pluginName", "<init>", "(Ljava/lang/String;)V", "Key", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PluginName extends AbstractCoroutineContextElement {
    public static final Key c = new Key(null);
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lio/ktor/util/debug/plugins/PluginName$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lio/ktor/util/debug/plugins/PluginName;", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Key implements CoroutineContext.Key<PluginName> {
        public Key(xu xuVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginName(String str) {
        super(c);
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PluginName) && yg0.a(this.b, ((PluginName) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return vh.q(new StringBuilder("PluginName("), this.b, ')');
    }
}
