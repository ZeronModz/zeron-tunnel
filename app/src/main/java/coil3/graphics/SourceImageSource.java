package coil3.graphics;

import coil3.graphics.ImageSource;
import kotlin.Metadata;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;
import okio.RealBufferedSource;
import okio.f;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcoil3/decode/SourceImageSource;", "Lcoil3/decode/ImageSource;", "Lokio/BufferedSource;", "source", "Lokio/FileSystem;", "fileSystem", "Lcoil3/decode/ImageSource$Metadata;", "metadata", "<init>", "(Lokio/BufferedSource;Lokio/FileSystem;Lcoil3/decode/ImageSource$Metadata;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SourceImageSource implements ImageSource {
    public final FileSystem a;
    public final ImageSource.Metadata b;
    public final Object c = new Object();
    public boolean d;
    public BufferedSource e;
    public Path f;

    public SourceImageSource(BufferedSource bufferedSource, FileSystem fileSystem, ImageSource.Metadata metadata) {
        this.a = fileSystem;
        this.b = metadata;
        this.e = bufferedSource;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            this.d = true;
            BufferedSource bufferedSource = this.e;
            if (bufferedSource != null) {
                try {
                    bufferedSource.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
            Path path = this.f;
            if (path != null) {
                FileSystem fileSystem = this.a;
                fileSystem.getClass();
                fileSystem.e(path);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
    
        throw r6;
     */
    @Override // coil3.graphics.ImageSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okio.Path file() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            monitor-enter(r0)
            boolean r1 = r6.d     // Catch: java.lang.Throwable -> L6f
            if (r1 != 0) goto L74
            okio.Path r1 = r6.f     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto Ld
            monitor-exit(r0)
            return r1
        Ld:
            okio.FileSystem r1 = r6.a     // Catch: java.lang.Throwable -> L6f
        Lf:
            okio.Path r2 = okio.FileSystem.b     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "tmp_"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L6f
            kotlin.random.Random$Default r4 = kotlin.random.Random.INSTANCE     // Catch: java.lang.Throwable -> L6f
            r4.getClass()     // Catch: java.lang.Throwable -> L6f
            long r4 = r4.nextLong()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = defpackage.ck1.a(r4)     // Catch: java.lang.Throwable -> L6f
            r3.append(r4)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L6f
            okio.Path r2 = r2.e(r3)     // Catch: java.lang.Throwable -> L6f
            boolean r3 = r1.g(r2)     // Catch: java.lang.Throwable -> L6f
            if (r3 != 0) goto Lf
            r3 = 1
            okio.Sink r1 = r1.n(r2, r3)     // Catch: java.lang.Throwable -> L6f
            r1.close()     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L6f java.lang.RuntimeException -> L72
        L3e:
            okio.FileSystem r1 = r6.a     // Catch: java.lang.Throwable -> L6f
            r3 = 0
            okio.Sink r1 = r1.n(r2, r3)     // Catch: java.lang.Throwable -> L6f
            r1.getClass()     // Catch: java.lang.Throwable -> L6f
            okio.RealBufferedSink r3 = new okio.RealBufferedSink     // Catch: java.lang.Throwable -> L6f
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L6f
            r1 = 0
            okio.BufferedSource r4 = r6.e     // Catch: java.lang.Throwable -> L5d
            r4.getClass()     // Catch: java.lang.Throwable -> L5d
            r3.writeAll(r4)     // Catch: java.lang.Throwable -> L5d
            r3.close()     // Catch: java.lang.Throwable -> L5b
            r3 = r1
            goto L67
        L5b:
            r3 = move-exception
            goto L67
        L5d:
            r4 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L62
            goto L66
        L62:
            r3 = move-exception
            kotlin.b.a(r4, r3)     // Catch: java.lang.Throwable -> L6f
        L66:
            r3 = r4
        L67:
            if (r3 != 0) goto L71
            r6.e = r1     // Catch: java.lang.Throwable -> L6f
            r6.f = r2     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r0)
            return r2
        L6f:
            r6 = move-exception
            goto L7c
        L71:
            throw r3     // Catch: java.lang.Throwable -> L6f
        L72:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L6f
        L74:
            java.lang.String r6 = "closed"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6f
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L6f
            throw r1     // Catch: java.lang.Throwable -> L6f
        L7c:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.graphics.SourceImageSource.file():okio.Path");
    }

    @Override // coil3.graphics.ImageSource
    public final Path fileOrNull() {
        Path path;
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("closed");
            }
            path = this.f;
        }
        return path;
    }

    @Override // coil3.graphics.ImageSource
    /* JADX INFO: renamed from: getFileSystem, reason: from getter */
    public final FileSystem getA() {
        return this.a;
    }

    @Override // coil3.graphics.ImageSource
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final ImageSource.Metadata getB() {
        return this.b;
    }

    @Override // coil3.graphics.ImageSource
    public final BufferedSource source() {
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("closed");
            }
            BufferedSource bufferedSource = this.e;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            FileSystem fileSystem = this.a;
            Path path = this.f;
            path.getClass();
            RealBufferedSource realBufferedSourceB = f.b(fileSystem.o(path));
            this.e = realBufferedSourceB;
            return realBufferedSourceB;
        }
    }

    @Override // coil3.graphics.ImageSource
    public final BufferedSource sourceOrNull() {
        return source();
    }
}
