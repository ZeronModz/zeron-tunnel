package io.ktor.client.plugins.api;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import defpackage.zu0;
import io.ktor.client.HttpClient;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.TypeParameterReference;
import kotlin.jvm.internal.TypeReference;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B<\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u001d\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/client/plugins/api/ClientPluginImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "PluginConfigT", "Lio/ktor/client/plugins/api/ClientPlugin;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "name", "Lkotlin/Function0;", "createConfiguration", "Lkotlin/Function1;", "Lio/ktor/client/plugins/api/ClientPluginBuilder;", "Lmk1;", "Lkotlin/ExtensionFunctionType;", "body", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ClientPluginImpl<PluginConfigT> implements ClientPlugin<PluginConfigT> {
    public final Function0 a;
    public final Function1 b;
    public final AttributeKey c;

    public ClientPluginImpl(String str, Function0<? extends PluginConfigT> function0, Function1<? super ClientPluginBuilder<PluginConfigT>, mk1> function1) {
        TypeReference typeReferenceC;
        str.getClass();
        function0.getClass();
        function1.getClass();
        this.a = function0;
        this.b = function1;
        ClassReference classReferenceA = Reflection.a(ClientPluginInstance.class);
        try {
            KTypeProjection.Companion companion = KTypeProjection.c;
            ClassReference classReferenceA2 = Reflection.a(ClientPluginImpl.class);
            KVariance kVariance = KVariance.INVARIANT;
            Reflection.a.getClass();
            TypeParameterReference typeParameterReference = new TypeParameterReference(classReferenceA2, "PluginConfigT", kVariance, false);
            TypeReference typeReferenceB = Reflection.b(Object.class);
            ReflectionFactory reflectionFactory = Reflection.a;
            List listSingletonList = Collections.singletonList(typeReferenceB);
            reflectionFactory.getClass();
            listSingletonList.getClass();
            if (typeParameterReference.e == null) {
                typeParameterReference.e = listSingletonList;
            } else {
                zu0.q("Upper bounds of type parameter '", typeParameterReference, "' have already been initialized.");
            }
            TypeReference typeReference = new TypeReference(typeParameterReference, Collections.EMPTY_LIST, false);
            companion.getClass();
            typeReferenceC = Reflection.c(ClientPluginInstance.class, KTypeProjection.Companion.a(typeReference));
        } catch (Throwable unused) {
            typeReferenceC = null;
        }
        this.c = new AttributeKey(str, new TypeInfo(classReferenceA, typeReferenceC));
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    /* JADX INFO: renamed from: getKey, reason: from getter */
    public final AttributeKey getC() {
        return this.c;
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public final void install(Object obj, HttpClient httpClient) {
        ClientPluginInstance clientPluginInstance = (ClientPluginInstance) obj;
        clientPluginInstance.getClass();
        httpClient.getClass();
        ClientPluginBuilder clientPluginBuilder = new ClientPluginBuilder(clientPluginInstance.a, httpClient, clientPluginInstance.b);
        clientPluginInstance.c.invoke(clientPluginBuilder);
        clientPluginInstance.d = clientPluginBuilder.d;
        for (HookHandler hookHandler : clientPluginBuilder.c) {
            hookHandler.getClass();
            hookHandler.a.install(httpClient, hookHandler.b);
        }
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public final Object prepare(Function1 function1) {
        function1.getClass();
        Object objInvoke = this.a.invoke();
        function1.invoke(objInvoke);
        return new ClientPluginInstance(this.c, objInvoke, this.b);
    }
}
