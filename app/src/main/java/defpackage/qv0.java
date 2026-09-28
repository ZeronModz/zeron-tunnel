package defpackage;

import android.util.Size;
import android.view.Surface;
import java.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qv0 {
    public final List a;
    public final Size b;
    public final int c;
    public final int d;
    public String e;
    public boolean f = false;
    public long g = 1;

    public qv0(Surface surface) {
        Size size;
        int iIntValue;
        int iIntValue2 = 0;
        jx0.f(surface, "Surface must not be null");
        this.a = Collections.singletonList(surface);
        try {
            Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", Surface.class);
            declaredMethod.setAccessible(true);
            size = (Size) declaredMethod.invoke(null, surface);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            km0.c("OutputConfigCompat");
            size = null;
        }
        this.b = size;
        try {
            iIntValue2 = ((Integer) Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", Surface.class).invoke(null, surface)).intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            km0.c("OutputConfigCompat");
        }
        this.c = iIntValue2;
        try {
            iIntValue = ((Integer) Surface.class.getDeclaredMethod("getGenerationId", null).invoke(surface, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused3) {
            km0.c("OutputConfigCompat");
            iIntValue = -1;
        }
        this.d = iIntValue;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qv0) {
            qv0 qv0Var = (qv0) obj;
            List list = qv0Var.a;
            if (this.b.equals(qv0Var.b) && this.c == qv0Var.c && this.d == qv0Var.d && this.f == qv0Var.f && this.g == qv0Var.g && Objects.equals(this.e, qv0Var.e)) {
                List list2 = this.a;
                int iMin = Math.min(list2.size(), list.size());
                for (int i = 0; i < iMin; i++) {
                    if (list2.get(i) == list.get(i)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 31;
        int i = this.d ^ ((iHashCode << 5) - iHashCode);
        int iHashCode2 = this.b.hashCode() ^ ((i << 5) - i);
        int i2 = this.c ^ ((iHashCode2 << 5) - iHashCode2);
        int i3 = (this.f ? 1 : 0) ^ ((i2 << 5) - i2);
        int i4 = (i3 << 5) - i3;
        String str = this.e;
        int iHashCode3 = (str == null ? 0 : str.hashCode()) ^ i4;
        long j = this.g;
        return ((int) (j ^ (j >>> 32))) ^ ((iHashCode3 << 5) - iHashCode3);
    }
}
