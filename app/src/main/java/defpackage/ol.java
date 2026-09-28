package defpackage;

import android.content.ClipData;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.view.ContentInfo;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ol {
    public static /* synthetic */ MultiResolutionStreamInfo a(int i, int i2, String str) {
        return new MultiResolutionStreamInfo(i, i2, str);
    }

    public static /* synthetic */ ContentInfo.Builder b(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* synthetic */ ContentInfo.Builder c(ContentInfo contentInfo) {
        return new ContentInfo.Builder(contentInfo);
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void e() {
    }
}
