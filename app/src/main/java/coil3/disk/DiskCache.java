package coil3.disk;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import okio.FileSystem;
import okio.JvmSystemFileSystem;
import okio.Path;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003\u001f !J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, d2 = {"Lcoil3/disk/DiskCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "key", "Lcoil3/disk/DiskCache$Snapshot;", "openSnapshot", "(Ljava/lang/String;)Lcoil3/disk/DiskCache$Snapshot;", "Lcoil3/disk/DiskCache$Editor;", "openEditor", "(Ljava/lang/String;)Lcoil3/disk/DiskCache$Editor;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "remove", "(Ljava/lang/String;)Z", "Lmk1;", "clear", "()V", "shutdown", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "getSize", "()J", "size", "getMaxSize", "maxSize", "Lokio/Path;", "getDirectory", "()Lokio/Path;", "directory", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "fileSystem", "Snapshot", "Editor", "Builder", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DiskCache {

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcoil3/disk/DiskCache$Builder;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public final JvmSystemFileSystem a = FileSystem.a;
        public final double b = 0.02d;
        public final long c = 10485760;
        public final long d = 262144000;
        public final EmptyCoroutineContext e = EmptyCoroutineContext.INSTANCE;
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcoil3/disk/DiskCache$Editor;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lmk1;", "commit", "()V", "Lcoil3/disk/DiskCache$Snapshot;", "commitAndOpenSnapshot", "()Lcoil3/disk/DiskCache$Snapshot;", "abort", "Lokio/Path;", "getMetadata", "()Lokio/Path;", "metadata", "getData", Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Editor {
        void abort();

        void commit();

        Snapshot commitAndOpenSnapshot();

        Path getData();

        Path getMetadata();
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcoil3/disk/DiskCache$Snapshot;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lmk1;", "close", "()V", "Lcoil3/disk/DiskCache$Editor;", "closeAndOpenEditor", "()Lcoil3/disk/DiskCache$Editor;", "Lokio/Path;", "getMetadata", "()Lokio/Path;", "metadata", "getData", Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Snapshot extends AutoCloseable {
        @Override // java.lang.AutoCloseable
        void close();

        Editor closeAndOpenEditor();

        Path getData();

        Path getMetadata();
    }

    void clear();

    Path getDirectory();

    FileSystem getFileSystem();

    long getMaxSize();

    long getSize();

    Editor openEditor(String key);

    Snapshot openSnapshot(String key);

    boolean remove(String key);

    void shutdown();
}
