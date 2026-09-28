package coil3.graphics;

import coil3.graphics.ImageSource;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;
import okio.RealBufferedSource;
import okio.f;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcoil3/decode/FileImageSource;", "Lcoil3/decode/ImageSource;", "Lokio/Path;", "file", "Lokio/FileSystem;", "fileSystem", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "diskCacheKey", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "Lcoil3/decode/ImageSource$Metadata;", "metadata", "<init>", "(Lokio/Path;Lokio/FileSystem;Ljava/lang/String;Ljava/lang/AutoCloseable;Lcoil3/decode/ImageSource$Metadata;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileImageSource implements ImageSource {
    public final Path a;
    public final FileSystem b;
    public final String c;
    public final AutoCloseable d;
    public final ImageSource.Metadata e;
    public final Object f = new Object();
    public boolean g;
    public RealBufferedSource h;

    public FileImageSource(Path path, FileSystem fileSystem, String str, AutoCloseable autoCloseable, ImageSource.Metadata metadata) {
        this.a = path;
        this.b = fileSystem;
        this.c = str;
        this.d = autoCloseable;
        this.e = metadata;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f
            monitor-enter(r0)
            r1 = 1
            r2.g = r1     // Catch: java.lang.Throwable -> L1c
            okio.RealBufferedSource r1 = r2.h     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L10
            r1.close()     // Catch: java.lang.RuntimeException -> Le java.lang.Exception -> L10 java.lang.Throwable -> L1c
            goto L10
        Le:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L1c
        L10:
            java.lang.AutoCloseable r2 = r2.d     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1a
            defpackage.ec1.Q(r2)     // Catch: java.lang.RuntimeException -> L18 java.lang.Exception -> L1a java.lang.Throwable -> L1c
            goto L1a
        L18:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L1c
        L1a:
            monitor-exit(r0)
            return
        L1c:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.graphics.FileImageSource.close():void");
    }

    @Override // coil3.graphics.ImageSource
    public final Path file() {
        Path path;
        synchronized (this.f) {
            if (this.g) {
                throw new IllegalStateException("closed");
            }
            path = this.a;
        }
        return path;
    }

    @Override // coil3.graphics.ImageSource
    public final Path fileOrNull() {
        return file();
    }

    @Override // coil3.graphics.ImageSource
    /* JADX INFO: renamed from: getFileSystem, reason: from getter */
    public final FileSystem getB() {
        return this.b;
    }

    @Override // coil3.graphics.ImageSource
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final ImageSource.Metadata getE() {
        return this.e;
    }

    @Override // coil3.graphics.ImageSource
    public final BufferedSource source() {
        synchronized (this.f) {
            if (this.g) {
                throw new IllegalStateException("closed");
            }
            RealBufferedSource realBufferedSource = this.h;
            if (realBufferedSource != null) {
                return realBufferedSource;
            }
            RealBufferedSource realBufferedSourceB = f.b(this.b.o(this.a));
            this.h = realBufferedSourceB;
            return realBufferedSourceB;
        }
    }

    @Override // coil3.graphics.ImageSource
    public final BufferedSource sourceOrNull() {
        RealBufferedSource realBufferedSource;
        synchronized (this.f) {
            if (this.g) {
                throw new IllegalStateException("closed");
            }
            realBufferedSource = this.h;
        }
        return realBufferedSource;
    }
}
