package defpackage;

import java.io.IOException;
import java.net.Socket;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RealConnectionPool;
import okio.RealBufferedSink;
import okio.f;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class iy extends Task {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iy(String str, int i, Object obj) {
        super(str, false, 2, null);
        this.e = i;
        this.f = obj;
    }

    private final long b() {
        DiskLruCache diskLruCache = (DiskLruCache) this.f;
        synchronized (diskLruCache) {
            if (!diskLruCache.o || diskLruCache.p) {
                return -1L;
            }
            try {
                diskLruCache.l();
            } catch (IOException unused) {
                diskLruCache.q = true;
            }
            try {
                if (diskLruCache.f()) {
                    diskLruCache.j();
                    diskLruCache.l = 0;
                }
            } catch (IOException unused2) {
                diskLruCache.r = true;
                diskLruCache.j = new RealBufferedSink(f.a());
            }
            return -1L;
        }
    }

    @Override // okhttp3.internal.concurrent.Task
    public final long a() {
        switch (this.e) {
            case 0:
                return b();
            default:
                RealConnectionPool realConnectionPool = (RealConnectionPool) this.f;
                long jNanoTime = System.nanoTime();
                int i = 0;
                long j = Long.MIN_VALUE;
                RealConnection realConnection = null;
                int i2 = 0;
                for (RealConnection realConnection2 : realConnectionPool.e) {
                    realConnection2.getClass();
                    synchronized (realConnection2) {
                        if (realConnectionPool.b(realConnection2, jNanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = jNanoTime - realConnection2.q;
                            if (j2 > j) {
                                realConnection = realConnection2;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = realConnectionPool.b;
                if (j < j3 && i <= realConnectionPool.a) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                realConnection.getClass();
                synchronized (realConnection) {
                    if (!realConnection.p.isEmpty()) {
                        return 0L;
                    }
                    if (realConnection.q + j != jNanoTime) {
                        return 0L;
                    }
                    realConnection.j = true;
                    realConnectionPool.e.remove(realConnection);
                    Socket socket = realConnection.d;
                    socket.getClass();
                    sl1.d(socket);
                    if (!realConnectionPool.e.isEmpty()) {
                        return 0L;
                    }
                    realConnectionPool.c.a();
                    return 0L;
                }
        }
    }
}
