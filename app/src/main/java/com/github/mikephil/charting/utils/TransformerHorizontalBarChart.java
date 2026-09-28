package com.github.mikephil.charting.utils;

import android.graphics.Matrix;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class TransformerHorizontalBarChart extends Transformer {
    public TransformerHorizontalBarChart(ViewPortHandler viewPortHandler) {
        super(viewPortHandler);
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public final void h() {
        Matrix matrix = this.b;
        matrix.reset();
        ViewPortHandler viewPortHandler = this.c;
        matrix.postTranslate(viewPortHandler.b.left, viewPortHandler.d - viewPortHandler.k());
    }
}
