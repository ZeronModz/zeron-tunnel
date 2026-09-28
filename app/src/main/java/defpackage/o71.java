package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o71 extends p71 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public o71(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.p71
    public final void a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((p71) it.next()).a(this.d, shadowRenderer, i, canvas);
        }
    }
}
