package defpackage;

import defpackage.tb0;
import io.ktor.client.call.UnsupportedContentTypeException;
import io.ktor.client.engine.okhttp.StreamRequestBody;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.d;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class su0 {
    public static final RequestBody a(final OutgoingContent outgoingContent, final CoroutineContext coroutineContext) {
        outgoingContent.getClass();
        coroutineContext.getClass();
        MediaType mediaTypeA = null;
        if (!(outgoingContent instanceof OutgoingContent.ByteArrayContent)) {
            if (outgoingContent instanceof OutgoingContent.ReadChannelContent) {
                return new StreamRequestBody(outgoingContent.getC(), new l8(outgoingContent, 10));
            }
            if (outgoingContent instanceof OutgoingContent.WriteChannelContent) {
                return new StreamRequestBody(outgoingContent.getC(), new Function0() { // from class: io.ktor.client.engine.okhttp.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d.j(tb0.a, coroutineContext, new OkHttpEngineKt$convertToOkHttpBody$3$1(outgoingContent, null), 2).a;
                    }
                });
            }
            if (outgoingContent instanceof OutgoingContent.NoContent) {
                RequestBody.a.getClass();
                byte[] bArr = sl1.a;
                return new okhttp3.d(null, 0, new byte[0]);
            }
            if (outgoingContent instanceof OutgoingContent.ContentWrapper) {
                return a(((OutgoingContent.ContentWrapper) outgoingContent).a, coroutineContext);
            }
            if (outgoingContent instanceof OutgoingContent.ProtocolUpgrade) {
                throw new UnsupportedContentTypeException(outgoingContent);
            }
            p60.b();
            return null;
        }
        byte[] a = ((OutgoingContent.ByteArrayContent) outgoingContent).getA();
        RequestBody.Companion companion = RequestBody.a;
        MediaType.Companion companion2 = MediaType.e;
        String strValueOf = String.valueOf(outgoingContent.getB());
        companion2.getClass();
        try {
            mediaTypeA = MediaType.Companion.a(strValueOf);
        } catch (IllegalArgumentException unused) {
        }
        int length = a.length;
        companion.getClass();
        long length2 = a.length;
        long j = length;
        byte[] bArr2 = sl1.a;
        if (j < 0 || 0 > length2 || length2 < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return new okhttp3.d(mediaTypeA, length, a);
    }
}
