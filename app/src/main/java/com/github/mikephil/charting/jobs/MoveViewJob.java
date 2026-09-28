package com.github.mikephil.charting.jobs;

import android.view.View;
import com.github.mikephil.charting.utils.ObjectPool$Poolable;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import defpackage.ou0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class MoveViewJob extends ViewPortJob {
    public static final ou0 h;

    static {
        ou0 ou0VarA = ou0.a(2, new MoveViewJob(null, 0.0f, 0.0f, null, null));
        h = ou0VarA;
        ou0VarA.f = 0.5f;
    }

    public MoveViewJob(ViewPortHandler viewPortHandler, float f, float f2, Transformer transformer, View view) {
        super(viewPortHandler, f, f2, transformer, view);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool$Poolable
    public final ObjectPool$Poolable a() {
        return new MoveViewJob(this.c, this.d, this.e, this.f, this.g);
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f = this.d;
        float[] fArr = this.b;
        fArr[0] = f;
        fArr[1] = this.e;
        this.f.g(fArr);
        this.c.a(this.g, fArr);
        h.c(this);
    }
}
