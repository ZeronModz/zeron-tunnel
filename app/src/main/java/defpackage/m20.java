package defpackage;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.e;
import androidx.camera.video.internal.config.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m20 {
    public static e a(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, Size size, Range range) {
        return new e(videoProfileProxy.d(), videoProfileProxy.h(), c.c(videoProfileProxy.b(), videoProfileProxy.a(), videoProfileProxy.a(), videoProfileProxy.e(), videoProfileProxy.e(), size.getWidth(), videoProfileProxy.j(), size.getHeight(), videoProfileProxy.g(), range), videoProfileProxy.e(), size.getWidth(), size.getHeight(), videoProfileProxy.i(), videoProfileProxy.a(), videoProfileProxy.c(), videoProfileProxy.f());
    }
}
