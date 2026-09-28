package com.blacksquircle.ui.editorkit.plugin.autocomplete;

import android.widget.MultiAutoCompleteTextView;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import kotlin.Metadata;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/editorkit/plugin/autocomplete/SymbolsTokenizer;", "Landroid/widget/MultiAutoCompleteTextView$Tokenizer;", "<init>", "()V", "Companion", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SymbolsTokenizer implements MultiAutoCompleteTextView.Tokenizer {

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/editorkit/plugin/autocomplete/SymbolsTokenizer$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "TOKEN", "Ljava/lang/String;", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public final int findTokenEnd(CharSequence charSequence, int i) {
        charSequence.getClass();
        while (i < charSequence.length()) {
            if (g.p("!@#$%^&*()_+-={}|[]:;'<>/<.? \r\n\t", charSequence.charAt(i - 1))) {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public final int findTokenStart(CharSequence charSequence, int i) {
        charSequence.getClass();
        int i2 = i;
        while (i2 > 0 && !g.p("!@#$%^&*()_+-={}|[]:;'<>/<.? \r\n\t", charSequence.charAt(i2 - 1))) {
            i2--;
        }
        while (i2 < i && charSequence.charAt(i2) == ' ') {
            i2++;
        }
        return i2;
    }

    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public final CharSequence terminateToken(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence;
    }
}
