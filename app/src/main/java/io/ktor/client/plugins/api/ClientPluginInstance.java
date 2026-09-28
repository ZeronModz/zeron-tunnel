package io.ktor.client.plugins.api;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import defpackage.o0;
import io.ktor.util.AttributeKey;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00060\u0003j\u0002`\u0004BD\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u001d\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/client/plugins/api/ClientPluginInstance;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "PluginConfig", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/util/AttributeKey;", "key", "config", "Lkotlin/Function1;", "Lio/ktor/client/plugins/api/ClientPluginBuilder;", "Lmk1;", "Lkotlin/ExtensionFunctionType;", "body", "<init>", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClientPluginInstance<PluginConfig> implements Closeable {
    public final AttributeKey a;
    public final Object b;
    public final Function1 c;
    public Function0 d;

    public ClientPluginInstance(AttributeKey<ClientPluginInstance<PluginConfig>> attributeKey, PluginConfig pluginconfig, Function1<? super ClientPluginBuilder<PluginConfig>, mk1> function1) {
        attributeKey.getClass();
        pluginconfig.getClass();
        function1.getClass();
        this.a = attributeKey;
        this.b = pluginconfig;
        this.c = function1;
        this.d = new o0(7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.invoke();
    }
}
