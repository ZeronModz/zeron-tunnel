package defpackage;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Size;
import androidx.camera.core.impl.SessionConfig$OutputConfig;
import androidx.camera.core.internal.compat.workaround.SurfaceSorter;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rc1 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rc1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                SessionConfig$OutputConfig sessionConfig$OutputConfig = (SessionConfig$OutputConfig) obj2;
                ((SurfaceSorter) obj3).getClass();
                Class cls = ((SessionConfig$OutputConfig) obj).f().j;
                int i2 = 1;
                int i3 = cls == MediaCodec.class ? 2 : cls == ey0.class ? 0 : 1;
                Class cls2 = sessionConfig$OutputConfig.f().j;
                if (cls2 == MediaCodec.class) {
                    i2 = 2;
                } else if (cls2 == ey0.class) {
                    i2 = 0;
                }
                return i3 - i2;
            default:
                Rect rect = (Rect) obj3;
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return (Math.abs(size.getHeight() - rect.height()) + Math.abs(size.getWidth() - rect.width())) - (Math.abs(size2.getHeight() - rect.height()) + Math.abs(size2.getWidth() - rect.width()));
        }
    }
}
