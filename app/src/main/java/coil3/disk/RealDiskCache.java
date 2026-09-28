package coil3.disk;

import coil3.disk.DiskCache;
import coil3.disk.DiskLruCache;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ec1;
import defpackage.u7;
import defpackage.xu;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import okio.ByteString;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcoil3/disk/RealDiskCache;", "Lcoil3/disk/DiskCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "maxSize", "Lokio/Path;", "directory", "Lokio/FileSystem;", "fileSystem", "Lkotlin/coroutines/CoroutineContext;", "cleanupCoroutineContext", "<init>", "(JLokio/Path;Lokio/FileSystem;Lkotlin/coroutines/CoroutineContext;)V", "RealSnapshot", "RealEditor", "Companion", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealDiskCache implements DiskCache {
    public final long a;
    public final Path b;
    public final FileSystem c;
    public final DiskLruCache d;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcoil3/disk/RealDiskCache$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ENTRY_METADATA", "I", "ENTRY_DATA", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil3/disk/RealDiskCache$RealEditor;", "Lcoil3/disk/DiskCache$Editor;", "Lcoil3/disk/DiskLruCache$Editor;", "Lcoil3/disk/DiskLruCache;", "editor", "<init>", "(Lcoil3/disk/DiskLruCache$Editor;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RealEditor implements DiskCache.Editor {
        public final DiskLruCache.Editor a;

        public RealEditor(DiskLruCache.Editor editor) {
            this.a = editor;
        }

        @Override // coil3.disk.DiskCache.Editor
        public final void abort() {
            this.a.a(false);
        }

        @Override // coil3.disk.DiskCache.Editor
        public final void commit() {
            this.a.a(true);
        }

        @Override // coil3.disk.DiskCache.Editor
        public final DiskCache.Snapshot commitAndOpenSnapshot() {
            DiskLruCache.Snapshot snapshotC;
            DiskLruCache.Editor editor = this.a;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache.j) {
                editor.a(true);
                snapshotC = diskLruCache.c(editor.a.a);
            }
            if (snapshotC != null) {
                return new RealSnapshot(snapshotC);
            }
            return null;
        }

        @Override // coil3.disk.DiskCache.Editor
        public final Path getData() {
            return this.a.b(1);
        }

        @Override // coil3.disk.DiskCache.Editor
        public final Path getMetadata() {
            return this.a.b(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil3/disk/RealDiskCache$RealSnapshot;", "Lcoil3/disk/DiskCache$Snapshot;", "Lcoil3/disk/DiskLruCache$Snapshot;", "Lcoil3/disk/DiskLruCache;", "snapshot", "<init>", "(Lcoil3/disk/DiskLruCache$Snapshot;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RealSnapshot implements DiskCache.Snapshot {
        public final DiskLruCache.Snapshot a;

        public RealSnapshot(DiskLruCache.Snapshot snapshot) {
            this.a = snapshot;
        }

        @Override // coil3.disk.DiskCache.Snapshot, java.lang.AutoCloseable
        public final void close() {
            this.a.close();
        }

        @Override // coil3.disk.DiskCache.Snapshot
        public final DiskCache.Editor closeAndOpenEditor() {
            DiskLruCache.Editor editorB;
            DiskLruCache.Snapshot snapshot = this.a;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache.j) {
                snapshot.close();
                editorB = diskLruCache.b(snapshot.a.a);
            }
            if (editorB != null) {
                return new RealEditor(editorB);
            }
            return null;
        }

        @Override // coil3.disk.DiskCache.Snapshot
        public final Path getData() {
            DiskLruCache.Snapshot snapshot = this.a;
            if (!snapshot.b) {
                return (Path) snapshot.a.c.get(1);
            }
            u7.p("snapshot is closed");
            return null;
        }

        @Override // coil3.disk.DiskCache.Snapshot
        public final Path getMetadata() {
            DiskLruCache.Snapshot snapshot = this.a;
            if (!snapshot.b) {
                return (Path) snapshot.a.c.get(0);
            }
            u7.p("snapshot is closed");
            return null;
        }
    }

    static {
        new Companion(null);
    }

    public RealDiskCache(long j, Path path, FileSystem fileSystem, CoroutineContext coroutineContext) {
        this.a = j;
        this.b = path;
        this.c = fileSystem;
        this.d = new DiskLruCache(fileSystem, path, coroutineContext, j, 3, 2);
    }

    @Override // coil3.disk.DiskCache
    public final void clear() {
        DiskLruCache diskLruCache = this.d;
        synchronized (diskLruCache.j) {
            try {
                diskLruCache.d();
                for (DiskLruCache.Entry entry : (DiskLruCache.Entry[]) diskLruCache.h.values().toArray(new DiskLruCache.Entry[0])) {
                    diskLruCache.j(entry);
                }
                diskLruCache.q = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // coil3.disk.DiskCache
    /* JADX INFO: renamed from: getDirectory, reason: from getter */
    public final Path getB() {
        return this.b;
    }

    @Override // coil3.disk.DiskCache
    /* JADX INFO: renamed from: getFileSystem, reason: from getter */
    public final FileSystem getC() {
        return this.c;
    }

    @Override // coil3.disk.DiskCache
    /* JADX INFO: renamed from: getMaxSize, reason: from getter */
    public final long getA() {
        return this.a;
    }

    @Override // coil3.disk.DiskCache
    public final long getSize() {
        long j;
        DiskLruCache diskLruCache = this.d;
        synchronized (diskLruCache.j) {
            diskLruCache.d();
            j = diskLruCache.k;
        }
        return j;
    }

    @Override // coil3.disk.DiskCache
    public final DiskCache.Editor openEditor(String str) {
        ByteString.INSTANCE.getClass();
        DiskLruCache.Editor editorB = this.d.b(ByteString.Companion.c(str).sha256().hex());
        if (editorB != null) {
            return new RealEditor(editorB);
        }
        return null;
    }

    @Override // coil3.disk.DiskCache
    public final DiskCache.Snapshot openSnapshot(String str) {
        ByteString.INSTANCE.getClass();
        DiskLruCache.Snapshot snapshotC = this.d.c(ByteString.Companion.c(str).sha256().hex());
        if (snapshotC != null) {
            return new RealSnapshot(snapshotC);
        }
        return null;
    }

    @Override // coil3.disk.DiskCache
    public final boolean remove(String str) {
        DiskLruCache diskLruCache = this.d;
        ByteString.INSTANCE.getClass();
        String strHex = ByteString.Companion.c(str).sha256().hex();
        synchronized (diskLruCache.j) {
            if (diskLruCache.p) {
                throw new IllegalStateException("cache is closed");
            }
            DiskLruCache.l(strHex);
            diskLruCache.d();
            DiskLruCache.Entry entry = (DiskLruCache.Entry) diskLruCache.h.get(strHex);
            if (entry == null) {
                return false;
            }
            diskLruCache.j(entry);
            if (diskLruCache.k <= diskLruCache.b) {
                diskLruCache.q = false;
            }
            return true;
        }
    }

    @Override // coil3.disk.DiskCache
    public final void shutdown() {
        try {
            ec1.Q(this.d);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }
}
