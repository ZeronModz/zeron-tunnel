package com.github.mikephil.charting.components;

import android.graphics.Color;
import android.graphics.Paint;
import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class LimitLine extends ComponentBase {
    public final float f;
    public final float g;
    public final int h;
    public final Paint.Style i;
    public final String j;
    public final LimitLabelPosition k;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public enum LimitLabelPosition {
        LEFT_TOP,
        LEFT_BOTTOM,
        RIGHT_TOP,
        RIGHT_BOTTOM
    }

    public LimitLine(float f, String str) {
        this.f = 0.0f;
        this.g = 2.0f;
        this.h = Color.rgb(237, 91, 91);
        this.i = Paint.Style.FILL_AND_STROKE;
        this.j = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.k = LimitLabelPosition.RIGHT_TOP;
        this.f = f;
        this.j = str;
    }

    public LimitLine(float f) {
        this.f = 0.0f;
        this.g = 2.0f;
        this.h = Color.rgb(237, 91, 91);
        this.i = Paint.Style.FILL_AND_STROKE;
        this.j = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.k = LimitLabelPosition.RIGHT_TOP;
        this.f = f;
    }
}
