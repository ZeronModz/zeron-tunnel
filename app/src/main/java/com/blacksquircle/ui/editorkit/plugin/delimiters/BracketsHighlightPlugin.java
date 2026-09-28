package com.blacksquircle.ui.editorkit.plugin.delimiters;

import android.text.style.BackgroundColorSpan;
import com.blacksquircle.ui.editorkit.model.ColorScheme;
import com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin;
import com.blacksquircle.ui.editorkit.widget.TextProcessor;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/editorkit/plugin/delimiters/BracketsHighlightPlugin;", "Lcom/blacksquircle/ui/editorkit/plugin/base/EditorPlugin;", "<init>", "()V", "Companion", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BracketsHighlightPlugin extends EditorPlugin {
    public final char[] c;
    public BackgroundColorSpan d;
    public BackgroundColorSpan e;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/editorkit/plugin/delimiters/BracketsHighlightPlugin$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "PLUGIN_ID", "Ljava/lang/String;", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public BracketsHighlightPlugin() {
        super("brackets-highlight-1180");
        this.c = new char[]{'{', '[', '(', '<', '}', ']', ')', '>'};
        this.d = new BackgroundColorSpan(-7829368);
        this.e = new BackgroundColorSpan(-7829368);
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void e(ColorScheme colorScheme) {
        colorScheme.getClass();
        int i = colorScheme.l;
        this.d = new BackgroundColorSpan(i);
        this.e = new BackgroundColorSpan(i);
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void i(int i, int i2) {
        if (i == i2) {
            TextProcessor textProcessor = this.b;
            textProcessor.getClass();
            if (textProcessor.getLayout() == null) {
                return;
            }
            TextProcessor textProcessor2 = this.b;
            textProcessor2.getClass();
            textProcessor2.getText().removeSpan(this.d);
            TextProcessor textProcessor3 = this.b;
            textProcessor3.getClass();
            textProcessor3.getText().removeSpan(this.e);
            if (i > 0) {
                TextProcessor textProcessor4 = this.b;
                textProcessor4.getClass();
                if (i <= textProcessor4.getText().length()) {
                    TextProcessor textProcessor5 = this.b;
                    textProcessor5.getClass();
                    int i3 = i - 1;
                    char cCharAt = textProcessor5.getText().charAt(i3);
                    char[] cArr = this.c;
                    int length = cArr.length;
                    int i4 = 0;
                    while (i4 < length) {
                        if (cArr[i4] == cCharAt) {
                            int length2 = cArr.length / 2;
                            int i5 = 1;
                            boolean z = i4 <= length2 + (-1);
                            char c = cArr[(length2 + i4) % cArr.length];
                            if (z) {
                                int i6 = i;
                                while (true) {
                                    TextProcessor textProcessor6 = this.b;
                                    textProcessor6.getClass();
                                    if (i6 < textProcessor6.getText().length()) {
                                        TextProcessor textProcessor7 = this.b;
                                        textProcessor7.getClass();
                                        if (textProcessor7.getText().charAt(i6) == c) {
                                            i5--;
                                        }
                                        TextProcessor textProcessor8 = this.b;
                                        textProcessor8.getClass();
                                        if (textProcessor8.getText().charAt(i6) == cCharAt) {
                                            i5++;
                                        }
                                        if (i5 == 0) {
                                            s(i3, i6);
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            } else {
                                int i7 = i - 2;
                                while (true) {
                                    if (i7 >= 0) {
                                        TextProcessor textProcessor9 = this.b;
                                        textProcessor9.getClass();
                                        if (textProcessor9.getText().charAt(i7) == c) {
                                            i5--;
                                        }
                                        TextProcessor textProcessor10 = this.b;
                                        textProcessor10.getClass();
                                        if (textProcessor10.getText().charAt(i7) == cCharAt) {
                                            i5++;
                                        }
                                        if (i5 == 0) {
                                            s(i7, i3);
                                            break;
                                        }
                                        i7--;
                                    }
                                }
                            }
                        }
                        i4++;
                    }
                }
            }
        }
    }

    public final void s(int i, int i2) {
        TextProcessor textProcessor = this.b;
        textProcessor.getClass();
        textProcessor.getText().setSpan(this.d, i, i + 1, 33);
        TextProcessor textProcessor2 = this.b;
        textProcessor2.getClass();
        textProcessor2.getText().setSpan(this.e, i2, i2 + 1, 33);
    }
}
