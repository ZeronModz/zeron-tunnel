package defpackage;

import io.ktor.client.content.ProgressListener;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.a;
import io.ktor.client.plugins.c;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ye {
    public static final AttributeKey a;
    public static final AttributeKey b;
    public static final ClientPlugin c;

    static {
        TypeReference typeReferenceB;
        ClassReference classReferenceA = Reflection.a(ProgressListener.class);
        TypeReference typeReferenceB2 = null;
        try {
            typeReferenceB = Reflection.b(ProgressListener.class);
        } catch (Throwable unused) {
            typeReferenceB = null;
        }
        a = new AttributeKey("UploadProgressListenerAttributeKey", new TypeInfo(classReferenceA, typeReferenceB));
        ClassReference classReferenceA2 = Reflection.a(ProgressListener.class);
        try {
            typeReferenceB2 = Reflection.b(ProgressListener.class);
        } catch (Throwable unused2) {
        }
        b = new AttributeKey("DownloadProgressListenerAttributeKey", new TypeInfo(classReferenceA2, typeReferenceB2));
        c = a.b("BodyProgress", new c(0));
    }
}
