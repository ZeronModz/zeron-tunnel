package coil3.graphics;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.n40;
import kotlin.Metadata;
import okio.BufferedSource;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bæ\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\nJ!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcoil3/decode/ExifOrientationStrategy;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "mimeType", "Lokio/BufferedSource;", "source", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "supports", "(Ljava/lang/String;Lokio/BufferedSource;)Z", "Companion", "n40", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ExifOrientationStrategy {
    public static final n40 Companion = n40.a;
    public static final ExifOrientationStrategy IGNORE;
    public static final ExifOrientationStrategy RESPECT_ALL;
    public static final ExifOrientationStrategy RESPECT_PERFORMANCE;

    static {
        final int i = 0;
        IGNORE = new ExifOrientationStrategy() { // from class: l40
            @Override // coil3.graphics.ExifOrientationStrategy
            public final boolean supports(String str, BufferedSource bufferedSource) {
                switch (i) {
                    case 0:
                        int i2 = m40.a;
                        break;
                    case 1:
                        int i3 = m40.a;
                        if (str != null) {
                            if (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif")) {
                            }
                        }
                        break;
                    default:
                        int i4 = m40.a;
                        break;
                }
                return true;
            }
        };
        final int i2 = 1;
        RESPECT_PERFORMANCE = new ExifOrientationStrategy() { // from class: l40
            @Override // coil3.graphics.ExifOrientationStrategy
            public final boolean supports(String str, BufferedSource bufferedSource) {
                switch (i2) {
                    case 0:
                        int i22 = m40.a;
                        break;
                    case 1:
                        int i3 = m40.a;
                        if (str != null) {
                            if (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif")) {
                            }
                        }
                        break;
                    default:
                        int i4 = m40.a;
                        break;
                }
                return true;
            }
        };
        final int i3 = 2;
        RESPECT_ALL = new ExifOrientationStrategy() { // from class: l40
            @Override // coil3.graphics.ExifOrientationStrategy
            public final boolean supports(String str, BufferedSource bufferedSource) {
                switch (i3) {
                    case 0:
                        int i22 = m40.a;
                        break;
                    case 1:
                        int i32 = m40.a;
                        if (str != null) {
                            if (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif")) {
                            }
                        }
                        break;
                    default:
                        int i4 = m40.a;
                        break;
                }
                return true;
            }
        };
    }

    boolean supports(String mimeType, BufferedSource source);
}
