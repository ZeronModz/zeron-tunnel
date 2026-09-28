package kotlinx.io.files;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collection;
import kotlin.Metadata;
import kotlinx.io.RawSink;
import kotlinx.io.RawSource;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\r\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0012J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0004H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H&¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0001\u0001 ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Lkotlinx/io/files/FileSystem;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlinx/io/files/Path;", "path", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "exists", "(Lkotlinx/io/files/Path;)Z", "mustExist", "Lmk1;", "delete", "(Lkotlinx/io/files/Path;Z)V", "mustCreate", "createDirectories", "source", "destination", "atomicMove", "(Lkotlinx/io/files/Path;Lkotlinx/io/files/Path;)V", "Lkotlinx/io/RawSource;", "(Lkotlinx/io/files/Path;)Lkotlinx/io/RawSource;", "append", "Lkotlinx/io/RawSink;", "sink", "(Lkotlinx/io/files/Path;Z)Lkotlinx/io/RawSink;", "Lkotlinx/io/files/FileMetadata;", "metadataOrNull", "(Lkotlinx/io/files/Path;)Lkotlinx/io/files/FileMetadata;", "resolve", "(Lkotlinx/io/files/Path;)Lkotlinx/io/files/Path;", "directory", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "list", "(Lkotlinx/io/files/Path;)Ljava/util/Collection;", "Lkotlinx/io/files/SystemFileSystemImpl;", "kotlinx-io-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FileSystem {
    void atomicMove(Path source, Path destination);

    void createDirectories(Path path, boolean mustCreate);

    void delete(Path path, boolean mustExist);

    boolean exists(Path path);

    Collection<Path> list(Path directory);

    FileMetadata metadataOrNull(Path path);

    Path resolve(Path path);

    RawSink sink(Path path, boolean append);

    RawSource source(Path path);
}
