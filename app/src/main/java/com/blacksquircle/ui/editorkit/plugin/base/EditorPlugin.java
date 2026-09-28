package com.blacksquircle.ui.editorkit.plugin.base;

import android.graphics.Canvas;
import android.graphics.Typeface;
import android.view.MotionEvent;
import com.blacksquircle.ui.editorkit.model.ColorScheme;
import com.blacksquircle.ui.editorkit.widget.TextProcessor;
import com.blacksquircle.ui.language.base.Language;
import com.blacksquircle.ui.language.base.model.TextStructure;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/blacksquircle/ui/editorkit/plugin/base/EditorPlugin;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "pluginId", "<init>", "(Ljava/lang/String;)V", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class EditorPlugin {
    public final String a;
    public TextProcessor b;

    public EditorPlugin(String str) {
        str.getClass();
        this.a = str;
    }

    public final TextStructure c() {
        TextProcessor textProcessor = this.b;
        textProcessor.getClass();
        return textProcessor.getStructure();
    }

    public void d(TextProcessor textProcessor) {
        this.b = textProcessor;
        e(textProcessor.getColorScheme());
        TextProcessor textProcessor2 = this.b;
        textProcessor2.getClass();
        h(textProcessor2.getLanguage());
    }

    public void e(ColorScheme colorScheme) {
        colorScheme.getClass();
    }

    public void f(TextProcessor textProcessor) {
        this.b = null;
    }

    public boolean l(MotionEvent motionEvent) {
        return false;
    }

    public void a() {
    }

    public void r() {
    }

    public void b(Canvas canvas) {
    }

    public void g(Canvas canvas) {
    }

    public void h(Language language) {
    }

    public void n(int i) {
    }

    public void o(CharSequence charSequence) {
    }

    public void p(float f) {
    }

    public void q(Typeface typeface) {
    }

    public void i(int i, int i2) {
    }

    public void j(int i, int i2) {
    }

    public void k(int i, int i2, CharSequence charSequence) {
    }

    public void m(int i, int i2, int i3) {
    }
}
