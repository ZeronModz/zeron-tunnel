package defpackage;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.emoji2.text.flatbuffer.MetadataItem;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o10 extends ReplacementSpan {
    public final nj1 b;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    public short c = -1;
    public float d = 1.0f;

    public o10(nj1 nj1Var) {
        jx0.f(nj1Var, "rasterizer cannot be null");
        this.b = nj1Var;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        nj1 nj1Var = this.b;
        this.d = fAbs / (nj1Var.b().a(14) != 0 ? r8.b.getShort(r1 + r8.a) : (short) 0);
        MetadataItem metadataItemB = nj1Var.b();
        int iA = metadataItemB.a(14);
        if (iA != 0) {
            metadataItemB.b.getShort(iA + metadataItemB.a);
        }
        short s = (short) ((nj1Var.b().a(12) != 0 ? r5.b.getShort(r7 + r5.a) : (short) 0) * this.d);
        this.c = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
