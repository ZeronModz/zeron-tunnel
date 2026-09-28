package com.blacksquircle.ui.editorkit.plugin.autocomplete;

import android.graphics.Rect;
import android.text.Layout;
import com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin;
import com.blacksquircle.ui.editorkit.widget.TextProcessor;
import com.blacksquircle.ui.language.base.Language;
import com.blacksquircle.ui.language.base.provider.SuggestionProvider;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/editorkit/plugin/autocomplete/AutoCompletePlugin;", "Lcom/blacksquircle/ui/editorkit/plugin/base/EditorPlugin;", "<init>", "()V", "Companion", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AutoCompletePlugin extends EditorPlugin {

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/editorkit/plugin/autocomplete/AutoCompletePlugin$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "PLUGIN_ID", "Ljava/lang/String;", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public AutoCompletePlugin() {
        super("autocomplete-6743");
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void d(TextProcessor textProcessor) {
        super.d(textProcessor);
        textProcessor.setTokenizer(new SymbolsTokenizer());
        textProcessor.setAdapter(null);
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void f(TextProcessor textProcessor) {
        textProcessor.setTokenizer(null);
        textProcessor.setAdapter(null);
        this.b = null;
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void h(Language language) {
        if (language != null) {
            language.getProvider();
        }
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void j(int i, int i2) {
        TextProcessor textProcessor = this.b;
        textProcessor.getClass();
        textProcessor.setDropDownWidth(i / 2);
        TextProcessor textProcessor2 = this.b;
        textProcessor2.getClass();
        textProcessor2.setDropDownHeight(i2 / 2);
        s();
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void k(int i, int i2, CharSequence charSequence) {
        s();
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void m(int i, int i2, int i3) {
        SuggestionProvider provider;
        TextProcessor textProcessor = this.b;
        textProcessor.getClass();
        Language language = textProcessor.getLanguage();
        if (language == null || (provider = language.getProvider()) == null) {
            return;
        }
        TextProcessor textProcessor2 = this.b;
        textProcessor2.getClass();
        provider.processLine(i, textProcessor2.getText().subSequence(i2, i3));
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void n(int i) {
        SuggestionProvider provider;
        TextProcessor textProcessor = this.b;
        textProcessor.getClass();
        Language language = textProcessor.getLanguage();
        if (language == null || (provider = language.getProvider()) == null) {
            return;
        }
        provider.deleteLine(i);
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void o(CharSequence charSequence) {
        SuggestionProvider provider;
        SuggestionProvider provider2;
        TextProcessor textProcessor = this.b;
        textProcessor.getClass();
        Language language = textProcessor.getLanguage();
        if (language != null && (provider2 = language.getProvider()) != null) {
            provider2.clearLines();
        }
        TextProcessor textProcessor2 = this.b;
        textProcessor2.getClass();
        Language language2 = textProcessor2.getLanguage();
        if (language2 == null || (provider = language2.getProvider()) == null) {
            return;
        }
        provider.processAllLines(c());
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void r() {
        TextProcessor textProcessor = this.b;
        textProcessor.getClass();
        if (textProcessor.isPopupShowing()) {
            return;
        }
        TextProcessor textProcessor2 = this.b;
        textProcessor2.getClass();
        textProcessor2.hasFocus();
    }

    public final void s() {
        TextProcessor textProcessor = this.b;
        textProcessor.getClass();
        Layout layout = textProcessor.getLayout();
        if (layout == null) {
            return;
        }
        TextProcessor textProcessor2 = this.b;
        textProcessor2.getClass();
        int lineForOffset = layout.getLineForOffset(textProcessor2.getSelectionStart());
        TextProcessor textProcessor3 = this.b;
        textProcessor3.getClass();
        float primaryHorizontal = layout.getPrimaryHorizontal(textProcessor3.getSelectionStart());
        int lineBaseline = layout.getLineBaseline(lineForOffset);
        this.b.getClass();
        float paddingStart = primaryHorizontal + r1.getPaddingStart();
        TextProcessor textProcessor4 = this.b;
        textProcessor4.getClass();
        textProcessor4.setDropDownHorizontalOffset((int) paddingStart);
        TextProcessor textProcessor5 = this.b;
        textProcessor5.getClass();
        int scrollY = lineBaseline - textProcessor5.getScrollY();
        TextProcessor textProcessor6 = this.b;
        textProcessor6.getClass();
        int dropDownHeight = textProcessor6.getDropDownHeight() + scrollY;
        TextProcessor textProcessor7 = this.b;
        textProcessor7.getClass();
        Rect rect = new Rect();
        TextProcessor textProcessor8 = this.b;
        textProcessor8.getClass();
        textProcessor8.getWindowVisibleDisplayFrame(rect);
        if (dropDownHeight > rect.bottom - rect.top) {
            TextProcessor textProcessor9 = this.b;
            textProcessor9.getClass();
            scrollY -= textProcessor9.getDropDownHeight();
        }
        textProcessor7.setDropDownVerticalOffset(scrollY);
    }
}
