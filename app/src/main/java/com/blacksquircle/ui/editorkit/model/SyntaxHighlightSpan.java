package com.blacksquircle.ui.editorkit.model;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/blacksquircle/ui/editorkit/model/SyntaxHighlightSpan;", "Landroid/text/style/CharacterStyle;", "Lcom/blacksquircle/ui/editorkit/model/StyleSpan;", "span", "<init>", "(Lcom/blacksquircle/ui/editorkit/model/StyleSpan;)V", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SyntaxHighlightSpan extends CharacterStyle {
    public final StyleSpan a;

    public SyntaxHighlightSpan(StyleSpan styleSpan) {
        styleSpan.getClass();
        this.a = styleSpan;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        StyleSpan styleSpan = this.a;
        if (textPaint != null) {
            textPaint.setColor(styleSpan.a);
        }
        if (textPaint != null) {
            textPaint.setFakeBoldText(styleSpan.b);
        }
        if (textPaint != null) {
            textPaint.setUnderlineText(styleSpan.d);
        }
        if (styleSpan.c && textPaint != null) {
            textPaint.setTextSkewX(-0.1f);
        }
        if (!styleSpan.e || textPaint == null) {
            return;
        }
        textPaint.setFlags(16);
    }
}
