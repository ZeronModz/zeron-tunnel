package com.github.mikephil.charting.jobs;

import android.view.View;
import com.github.mikephil.charting.utils.ObjectPool$Poolable;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ViewPortJob extends ObjectPool$Poolable implements Runnable {
    public final float[] b = new float[2];
    public ViewPortHandler c;
    public float d;
    public float e;
    public Transformer f;
    public View g;

    public ViewPortJob(ViewPortHandler viewPortHandler, float f, float f2, Transformer transformer, View view) {
        this.c = viewPortHandler;
        this.d = f;
        this.e = f2;
        this.f = transformer;
        this.g = view;
    }
}
