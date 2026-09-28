package defpackage;

import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.reflect.TypeInfo;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ie0 {
    public static final AttributeKey a;

    static {
        TypeReference typeReferenceB;
        ClassReference classReferenceA = Reflection.a(Attributes.class);
        try {
            typeReferenceB = Reflection.b(Attributes.class);
        } catch (Throwable unused) {
            typeReferenceB = null;
        }
        a = new AttributeKey("ApplicationPluginRegistry", new TypeInfo(classReferenceA, typeReferenceB));
    }

    public static final Object a(HttpClient httpClient, HttpClientPlugin httpClientPlugin) {
        httpClient.getClass();
        httpClientPlugin.getClass();
        Object objB = b(httpClient, httpClientPlugin);
        if (objB != null) {
            return objB;
        }
        StringBuilder sb = new StringBuilder("Plugin ");
        sb.append(httpClientPlugin);
        AttributeKey c = httpClientPlugin.getC();
        sb.append(" is not installed. Consider using `install(");
        sb.append(c);
        sb.append(")` in client config first.");
        throw new IllegalStateException(sb.toString());
    }

    public static final Object b(HttpClient httpClient, HttpClientPlugin httpClientPlugin) {
        httpClient.getClass();
        httpClientPlugin.getClass();
        Attributes attributes = (Attributes) httpClient.i.getOrNull(a);
        if (attributes != null) {
            return attributes.getOrNull(httpClientPlugin.getC());
        }
        return null;
    }
}
