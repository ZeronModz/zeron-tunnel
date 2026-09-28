package com.blacksquircle.ui.editorkit.plugin.linenumbers;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.TypedValue;
import com.blacksquircle.ui.editorkit.model.ColorScheme;
import com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin;
import com.blacksquircle.ui.editorkit.widget.TextProcessor;
import com.blacksquircle.ui.language.base.model.TextStructure;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.n8;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/editorkit/plugin/linenumbers/LineNumbersPlugin;", "Lcom/blacksquircle/ui/editorkit/plugin/base/EditorPlugin;", "<init>", "()V", "Companion", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LineNumbersPlugin extends EditorPlugin {
    public final boolean c;
    public final boolean d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public int j;
    public int k;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/editorkit/plugin/linenumbers/LineNumbersPlugin$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "PLUGIN_ID", "Ljava/lang/String;", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public LineNumbersPlugin() {
        super("line-numbers-1141");
        this.c = true;
        this.d = true;
        this.e = new Paint();
        this.f = new Paint();
        this.g = new Paint();
        this.h = new Paint();
        this.i = new Paint();
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void a() {
        t();
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void b(Canvas canvas) {
        if (this.d) {
            TextStructure textStructureC = c();
            TextProcessor textProcessor = this.b;
            textProcessor.getClass();
            int iC = textStructureC.c(textProcessor.getSelectionStart());
            TextStructure textStructureC2 = c();
            TextProcessor textProcessor2 = this.b;
            textProcessor2.getClass();
            if (iC == textStructureC2.c(textProcessor2.getSelectionEnd())) {
                TextProcessor textProcessor3 = this.b;
                textProcessor3.getClass();
                if (textProcessor3.getLayout() == null) {
                    return;
                }
                int iB = c().b(iC);
                int iA = c().a(iC);
                TextProcessor textProcessor4 = this.b;
                textProcessor4.getClass();
                int lineForOffset = textProcessor4.getLayout().getLineForOffset(iB);
                TextProcessor textProcessor5 = this.b;
                textProcessor5.getClass();
                int lineForOffset2 = textProcessor5.getLayout().getLineForOffset(iA);
                TextProcessor textProcessor6 = this.b;
                textProcessor6.getClass();
                int lineTop = textProcessor6.getLayout().getLineTop(lineForOffset);
                TextProcessor textProcessor7 = this.b;
                textProcessor7.getClass();
                int paddingTop = textProcessor7.getPaddingTop() + lineTop;
                TextProcessor textProcessor8 = this.b;
                textProcessor8.getClass();
                int lineBottom = textProcessor8.getLayout().getLineBottom(lineForOffset2);
                TextProcessor textProcessor9 = this.b;
                textProcessor9.getClass();
                int paddingTop2 = textProcessor9.getPaddingTop() + lineBottom;
                TextProcessor textProcessor10 = this.b;
                textProcessor10.getClass();
                int width = textProcessor10.getLayout().getWidth();
                TextProcessor textProcessor11 = this.b;
                textProcessor11.getClass();
                int paddingLeft = textProcessor11.getPaddingLeft() + width;
                this.b.getClass();
                canvas.drawRect(this.j, paddingTop, r0.getPaddingRight() + paddingLeft, paddingTop2, this.e);
            }
        }
        t();
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void d(TextProcessor textProcessor) {
        super.d(textProcessor);
        float textSize = textProcessor.getTextSize();
        Paint paint = this.h;
        paint.setTextSize(textSize);
        float textSize2 = textProcessor.getTextSize();
        Paint paint2 = this.i;
        paint2.setTextSize(textSize2);
        paint.setTypeface(textProcessor.getTypeface());
        paint2.setTypeface(textProcessor.getTypeface());
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void e(ColorScheme colorScheme) {
        colorScheme.getClass();
        int i = colorScheme.h;
        Paint paint = this.e;
        paint.setColor(i);
        paint.setAntiAlias(false);
        paint.setDither(false);
        int i2 = colorScheme.d;
        Paint paint2 = this.f;
        paint2.setColor(i2);
        paint2.setAntiAlias(false);
        paint2.setDither(false);
        int i3 = colorScheme.e;
        Paint paint3 = this.g;
        paint3.setColor(i3);
        paint3.setAntiAlias(false);
        paint3.setDither(false);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(2.6f);
        int i4 = colorScheme.f;
        Paint paint4 = this.h;
        paint4.setColor(i4);
        paint4.setAntiAlias(true);
        paint4.setDither(false);
        Paint.Align align = Paint.Align.RIGHT;
        paint4.setTextAlign(align);
        int i5 = colorScheme.g;
        Paint paint5 = this.i;
        paint5.setColor(i5);
        paint5.setAntiAlias(true);
        paint5.setDither(false);
        paint5.setTextAlign(align);
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void g(Canvas canvas) {
        if (!this.c) {
            return;
        }
        TextStructure textStructureC = c();
        TextProcessor textProcessor = this.b;
        textProcessor.getClass();
        int iC = textStructureC.c(textProcessor.getSelectionStart());
        TextProcessor textProcessor2 = this.b;
        textProcessor2.getClass();
        float scrollX = textProcessor2.getScrollX();
        TextProcessor textProcessor3 = this.b;
        textProcessor3.getClass();
        float scrollY = textProcessor3.getScrollY();
        int i = this.j;
        TextProcessor textProcessor4 = this.b;
        textProcessor4.getClass();
        float scrollX2 = textProcessor4.getScrollX() + i;
        TextProcessor textProcessor5 = this.b;
        textProcessor5.getClass();
        int scrollY2 = textProcessor5.getScrollY();
        this.b.getClass();
        canvas.drawRect(scrollX, scrollY, scrollX2, r2.getHeight() + scrollY2, this.f);
        TextProcessor textProcessor6 = this.b;
        textProcessor6.getClass();
        int iS = n8.s(textProcessor6);
        int i2 = iS >= 2 ? iS - 2 : 0;
        int iS2 = this.j - (s() / 2);
        TextProcessor textProcessor7 = this.b;
        textProcessor7.getClass();
        int scrollX3 = textProcessor7.getScrollX() + iS2;
        int i3 = -1;
        while (true) {
            TextProcessor textProcessor8 = this.b;
            textProcessor8.getClass();
            if (i2 > n8.n(textProcessor8)) {
                int i4 = this.j;
                TextProcessor textProcessor9 = this.b;
                textProcessor9.getClass();
                float scrollX4 = textProcessor9.getScrollX() + i4;
                TextProcessor textProcessor10 = this.b;
                textProcessor10.getClass();
                float scrollY3 = textProcessor10.getScrollY();
                int i5 = this.j;
                TextProcessor textProcessor11 = this.b;
                textProcessor11.getClass();
                float scrollX5 = textProcessor11.getScrollX() + i5;
                TextProcessor textProcessor12 = this.b;
                textProcessor12.getClass();
                int scrollY4 = textProcessor12.getScrollY();
                this.b.getClass();
                canvas.drawLine(scrollX4, scrollY3, scrollX5, r0.getHeight() + scrollY4, this.g);
                return;
            }
            TextProcessor textProcessor13 = this.b;
            textProcessor13.getClass();
            if (textProcessor13.getLayout() == null) {
                return;
            }
            TextStructure textStructureC2 = c();
            TextProcessor textProcessor14 = this.b;
            textProcessor14.getClass();
            int iC2 = textStructureC2.c(textProcessor14.getLayout().getLineStart(i2));
            if (iC2 != i3) {
                String strValueOf = String.valueOf(iC2 + 1);
                float f = scrollX3;
                TextProcessor textProcessor15 = this.b;
                textProcessor15.getClass();
                float lineBaseline = textProcessor15.getLayout().getLineBaseline(i2);
                this.b.getClass();
                canvas.drawText(strValueOf, f, lineBaseline + r7.getPaddingTop(), (iC2 == iC && this.d) ? this.h : this.i);
            }
            i2++;
            i3 = iC2;
        }
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void p(float f) {
        TextProcessor textProcessor = this.b;
        textProcessor.getClass();
        float fApplyDimension = TypedValue.applyDimension(2, f, textProcessor.getResources().getDisplayMetrics());
        this.h.setTextSize(fApplyDimension);
        this.i.setTextSize(fApplyDimension);
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void q(Typeface typeface) {
        this.h.setTypeface(typeface);
        this.i.setTypeface(typeface);
    }

    public final int s() {
        TextProcessor textProcessor = this.b;
        textProcessor.getClass();
        return (int) (4.0f * textProcessor.getResources().getDisplayMetrics().density);
    }

    public final void t() {
        if (this.c) {
            this.k = String.valueOf(c().b.size()).length();
            float f = 0.0f;
            int i = 0;
            for (int i2 = 0; i2 < 10; i2++) {
                TextProcessor textProcessor = this.b;
                textProcessor.getClass();
                float fMeasureText = textProcessor.getPaint().measureText(String.valueOf(i2));
                if (fMeasureText > f) {
                    i = i2;
                    f = fMeasureText;
                }
            }
            int i3 = this.k;
            if (i3 < 3) {
                i3 = 3;
            }
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < i3; i4++) {
                sb.append(String.valueOf(i));
            }
            TextProcessor textProcessor2 = this.b;
            textProcessor2.getClass();
            int iMeasureText = (int) textProcessor2.getPaint().measureText(sb.toString());
            this.j = iMeasureText;
            this.j = s() + iMeasureText;
        }
        TextProcessor textProcessor3 = this.b;
        textProcessor3.getClass();
        if (textProcessor3.getPaddingStart() != s() + this.j) {
            TextProcessor textProcessor4 = this.b;
            textProcessor4.getClass();
            int iS = s() + this.j;
            int iS2 = s();
            TextProcessor textProcessor5 = this.b;
            textProcessor5.getClass();
            int paddingEnd = textProcessor5.getPaddingEnd();
            TextProcessor textProcessor6 = this.b;
            textProcessor6.getClass();
            textProcessor4.setPadding(iS, iS2, paddingEnd, textProcessor6.getPaddingBottom());
        }
    }
}
