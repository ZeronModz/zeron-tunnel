package io.ktor.client.engine.okhttp;

import com.google.android.gms.ads.RequestConfiguration;
import io.ktor.utils.io.ByteReadChannel;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Source;
import okio.e;

 
 
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/client/engine/okhttp/StreamRequestBody;", "Lokhttp3/RequestBody;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "contentLength", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "block", "<init>", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function0;)V", "ktor-client-okhttp"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StreamRequestBody extends RequestBody {
    public final Long b;
    public final Function0 c;

    public StreamRequestBody(Long l, Function0<? extends ByteReadChannel> function0) {
        function0.getClass();
        this.b = l;
        this.c = function0;
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        Long l = this.b;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    @Override // okhttp3.RequestBody
    public final MediaType b() {
        return null;
    }

     
     
     
     
     
    @Override // okhttp3.RequestBody
    public final void c(BufferedSink bufferedSink) throws IOException {
        Throwable r5;
        try {
            ByteReadChannel byteReadChannel = (ByteReadChannel) this.c.invoke();
            byteReadChannel.getClass();
            Source sourceE = e.e(new io.ktor.utils.io.jvm.javaio.a(byteReadChannel));
            Throwable err = null;
            Long result = null;
            try {
                Long lValueOf = Long.valueOf(bufferedSink.writeAll(sourceE));
                try {
                    sourceE.close();
                } catch (Throwable th2) {
                    err = th2;
                }
                Throwable l = err;
                result = lValueOf;
                r5 = l;
            } catch (Throwable th3) {
                try {
                    sourceE.close();
                    r5 = th3;
                } catch (Throwable th4) {
                    kotlin.b.a(th3, th4);
                    r5 = th3;
                }
            }
            if (r5 != null) {
                throw r5;
            }
            result.getClass();
        } catch (IOException e) {
            throw e;
        } catch (Throwable th5) {
            throw new StreamAdapterIOException(th5);
        }
    }
}
