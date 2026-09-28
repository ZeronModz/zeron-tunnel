package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.cache.CacheRequest;
import okio.Buffer;
import okio.BufferedSource;
import okio.RealBufferedSink;
import okio.Source;
import okio.Timeout;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class gh implements Source {
    public boolean a;
    public final /* synthetic */ BufferedSource b;
    public final /* synthetic */ CacheRequest c;
    public final /* synthetic */ RealBufferedSink d;

    public gh(BufferedSource bufferedSource, CacheRequest cacheRequest, RealBufferedSink realBufferedSink) {
        this.b = bufferedSource;
        this.c = cacheRequest;
        this.d = realBufferedSink;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zU;
        if (!this.a) {
            byte[] bArr = sl1.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zU = sl1.u(this, 100);
            } catch (IOException unused) {
                zU = false;
            }
            if (!zU) {
                this.a = true;
                this.c.abort();
            }
        }
        this.b.close();
    }

    @Override // okio.Source
    public final long read(Buffer buffer, long j) throws IOException {
        buffer.getClass();
        try {
            long j2 = this.b.read(buffer, j);
            RealBufferedSink realBufferedSink = this.d;
            if (j2 == -1) {
                if (!this.a) {
                    this.a = true;
                    realBufferedSink.close();
                }
                return -1L;
            }
            buffer.d(buffer.b - j2, j2, realBufferedSink.b);
            realBufferedSink.emitCompleteSegments();
            return j2;
        } catch (IOException e) {
            if (this.a) {
                throw e;
            }
            this.a = true;
            this.c.abort();
            throw e;
        }
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: timeout */
    public final Timeout getB() {
        return this.b.getB();
    }
}
