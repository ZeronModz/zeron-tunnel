package defpackage;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class po1 extends ViewTimeCycle {
    public boolean k = false;

    @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
    public final boolean e(float f, long j, View view, KeyCache keyCache) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).setProgress(d(f, j, view, keyCache));
        } else {
            if (this.k) {
                return false;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.k = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(d(f, j, view, keyCache)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
        return this.h;
    }
}
