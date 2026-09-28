package kotlinx.io.files;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/io/files/Path;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "kotlinx-io-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Path {
    public final File a;

    public Path(File file) {
        file.getClass();
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Path) {
            return toString().equals(((Path) obj).toString());
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        String string = this.a.toString();
        string.getClass();
        return string;
    }
}
