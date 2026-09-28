package defpackage;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class tt extends ut {
    @Override // com.google.android.material.shape.MaterialShapeDrawable
    public final void e(Canvas canvas) {
        if (this.y.r.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        int i = Build.VERSION.SDK_INT;
        st stVar = this.y;
        if (i >= 26) {
            canvas.clipOutRect(stVar.r);
        } else {
            canvas.clipRect(stVar.r, Region.Op.DIFFERENCE);
        }
        super.e(canvas);
        canvas.restore();
    }
}
