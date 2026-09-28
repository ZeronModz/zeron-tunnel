package com.blacksquircle.ui.editorkit.model;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/blacksquircle/ui/editorkit/model/TabWidthSpan;", "Landroid/text/style/ReplacementSpan;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "width", "<init>", "(I)V", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TabWidthSpan extends ReplacementSpan {
    public final int a;

    public TabWidthSpan(int i) {
        this.a = i;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.getClass();
        paint.getClass();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getClass();
        return (int) paint.measureText(g.L(this.a, " "));
    }
}
