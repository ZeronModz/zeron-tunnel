package io.ktor.client.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import io.ktor.client.HttpClient;
import io.ktor.util.AttributeKey;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001J*\u0010\b\u001a\u00028\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00012\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lio/ktor/client/plugins/HttpClientPlugin;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "TConfig", "TPlugin", "Lkotlin/Function1;", "Lmk1;", "Lkotlin/ExtensionFunctionType;", "block", "prepare", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "plugin", "Lio/ktor/client/HttpClient;", "scope", "install", "(Ljava/lang/Object;Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "key", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HttpClientPlugin<TConfig, TPlugin> {
    AttributeKey<TPlugin> getKey();

    void install(TPlugin plugin, HttpClient scope);

    TPlugin prepare(Function1<? super TConfig, mk1> block);
}
