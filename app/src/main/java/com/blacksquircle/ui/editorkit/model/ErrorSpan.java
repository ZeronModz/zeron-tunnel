package com.blacksquircle.ui.editorkit.model;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/blacksquircle/ui/editorkit/model/ErrorSpan;", "Landroid/text/style/LineBackgroundSpan;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "lineWidth", "waveSize", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, TypedValues.Custom.S_COLOR, "<init>", "(FFI)V", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ErrorSpan implements LineBackgroundSpan {
    public final float a;
    public final float b;
    public final int c;

    public /* synthetic */ ErrorSpan(float f, float f2, int i, int i2, xu xuVar) {
        this((i2 & 1) != 0 ? (1.0f * Resources.getSystem().getDisplayMetrics().density) + 0.5f : f, (i2 & 2) != 0 ? (3.0f * Resources.getSystem().getDisplayMetrics().density) + 0.5f : f2, (i2 & 4) != 0 ? SupportMenu.CATEGORY_MASK : i);
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        canvas.getClass();
        paint.getClass();
        charSequence.getClass();
        float fMeasureText = paint.measureText(charSequence, i6, i7);
        Paint paint2 = new Paint(paint);
        paint2.setColor(this.c);
        paint2.setStrokeWidth(this.a);
        float f = this.b;
        float f2 = 2.0f * f;
        float f3 = i;
        float f4 = f3;
        while (f4 < f3 + fMeasureText) {
            float f5 = i5;
            canvas.drawLine(f4, f5, f4 + f, f5 - f, paint2);
            float f6 = f4 + f2;
            canvas.drawLine(f4 + f, f5 - f, f6, f5, paint2);
            f4 = f6;
        }
    }

    public ErrorSpan(float f, float f2, int i) {
        this.a = f;
        this.b = f2;
        this.c = i;
    }

    public ErrorSpan() {
        this(0.0f, 0.0f, 0, 7, null);
    }
}
