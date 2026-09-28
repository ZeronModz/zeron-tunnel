package defpackage;

import android.text.TextPaint;
import androidx.emoji2.text.EmojiCompat$GlyphChecker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fv implements EmojiCompat$GlyphChecker {
    public static final ThreadLocal b = new ThreadLocal();
    public final TextPaint a;

    public fv() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    @Override // androidx.emoji2.text.EmojiCompat$GlyphChecker
    public final boolean hasGlyph(CharSequence charSequence, int i, int i2, int i3) {
        ThreadLocal threadLocal = b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        StringBuilder sb = (StringBuilder) threadLocal.get();
        sb.setLength(0);
        while (i < i2) {
            sb.append(charSequence.charAt(i));
            i++;
        }
        String string = sb.toString();
        int i4 = yv0.a;
        return this.a.hasGlyph(string);
    }
}
