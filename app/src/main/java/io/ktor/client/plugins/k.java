package io.ktor.client.plugins;

import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.events.EventDefinition;
import io.ktor.http.HttpMethod;
import io.ktor.http.HttpStatusCode;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k {
    public static final Set a;
    public static final Logger b;
    public static final EventDefinition c;
    public static final ClientPlugin d;

    static {
        HttpMethod.Companion companion = HttpMethod.b;
        companion.getClass();
        companion.getClass();
        a = kotlin.collections.b.y(new HttpMethod[]{HttpMethod.c, HttpMethod.e});
        Logger logger = LoggerFactory.getLogger("io.ktor.client.plugins.HttpRedirect");
        logger.getClass();
        b = logger;
        c = new EventDefinition();
        d = io.ktor.client.plugins.api.a.a("HttpRedirect", HttpRedirectKt$HttpRedirect$1.INSTANCE, new c(5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v7, types: [io.ktor.client.plugins.Sender] */
    /* JADX WARN: Type inference failed for: r12v12, types: [T, io.ktor.client.request.HttpRequestBuilder] */
    /* JADX WARN: Type inference failed for: r19v0, types: [T, io.ktor.client.call.HttpClientCall, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [T] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [T] */
    /* JADX WARN: Type inference failed for: r7v1, types: [io.ktor.client.request.HttpRequestBuilder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01d5 -> B:55:0x01dd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(io.ktor.client.plugins.api.Send$Sender r17, io.ktor.client.request.HttpRequestBuilder r18, io.ktor.client.call.HttpClientCall r19, boolean r20, io.ktor.client.HttpClient r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.k.a(io.ktor.client.plugins.api.Send$Sender, io.ktor.client.request.HttpRequestBuilder, io.ktor.client.call.HttpClientCall, boolean, io.ktor.client.HttpClient, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final boolean b(HttpStatusCode httpStatusCode) {
        int i = httpStatusCode.a;
        HttpStatusCode.Companion companion = HttpStatusCode.c;
        companion.getClass();
        if (i == HttpStatusCode.f.a) {
            return true;
        }
        companion.getClass();
        if (i == HttpStatusCode.g.a) {
            return true;
        }
        companion.getClass();
        if (i == HttpStatusCode.j.a) {
            return true;
        }
        companion.getClass();
        if (i == HttpStatusCode.k.a) {
            return true;
        }
        companion.getClass();
        return i == HttpStatusCode.h.a;
    }
}
