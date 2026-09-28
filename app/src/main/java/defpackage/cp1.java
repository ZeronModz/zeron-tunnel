package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class cp1 extends ii2 {
    public static boolean i = true;
    public static boolean j = true;
    public static boolean k = true;
    public static boolean l = true;
    public static boolean m = true;

    public void Z(View view, Matrix matrix) {
        if (i) {
            try {
                zo1.a(view, matrix);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }

    public void a0(View view, int i2, int i3, int i4, int i5) {
        if (l) {
            try {
                ap1.a(view, i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                l = false;
            }
        }
    }

    public void b0(View view, int i2) {
        if (Build.VERSION.SDK_INT != 28) {
            if (m) {
                try {
                    bp1.a(view, i2);
                    return;
                } catch (NoSuchMethodError unused) {
                    m = false;
                    return;
                }
            }
            return;
        }
        if (!ii2.h) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                ii2.g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            ii2.h = true;
        }
        Field field = ii2.g;
        if (field != null) {
            try {
                ii2.g.setInt(view, (field.getInt(view) & (-13)) | i2);
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void c0(View view, Matrix matrix) {
        if (j) {
            try {
                zo1.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }

    public void d0(View view, Matrix matrix) {
        if (k) {
            try {
                zo1.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                k = false;
            }
        }
    }
}
