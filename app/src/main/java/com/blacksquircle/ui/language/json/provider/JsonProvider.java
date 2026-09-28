package com.blacksquircle.ui.language.json.provider;

import com.blacksquircle.ui.language.base.model.Suggestion;
import com.blacksquircle.ui.language.base.model.TextStructure;
import com.blacksquircle.ui.language.base.provider.SuggestionProvider;
import com.blacksquircle.ui.language.base.utils.WordsManager;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/blacksquircle/ui/language/json/provider/JsonProvider;", "Lcom/blacksquircle/ui/language/base/provider/SuggestionProvider;", "Companion", "language-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JsonProvider implements SuggestionProvider {
    public static final Companion b = new Companion(null);
    public static JsonProvider c;
    public final WordsManager a = new WordsManager();

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/language/json/provider/JsonProvider$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcom/blacksquircle/ui/language/json/provider/JsonProvider;", "jsonProvider", "Lcom/blacksquircle/ui/language/json/provider/JsonProvider;", "language-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    public JsonProvider(xu xuVar) {
    }

    @Override // com.blacksquircle.ui.language.base.provider.SuggestionProvider
    public final void clearLines() {
        this.a.b.clear();
    }

    @Override // com.blacksquircle.ui.language.base.provider.SuggestionProvider
    public final void deleteLine(int i) {
        this.a.b.remove(Integer.valueOf(i));
    }

    @Override // com.blacksquircle.ui.language.base.provider.SuggestionProvider
    public final Set getAll() {
        WordsManager wordsManager = this.a;
        wordsManager.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = wordsManager.b.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((LinkedList) it.next()).iterator();
            while (it2.hasNext()) {
                hashSet.add((Suggestion) it2.next());
            }
        }
        return hashSet;
    }

    @Override // com.blacksquircle.ui.language.base.provider.SuggestionProvider
    public final void processAllLines(TextStructure textStructure) {
        textStructure.getClass();
        WordsManager wordsManager = this.a;
        wordsManager.getClass();
        int size = textStructure.b.size();
        for (int i = 0; i < size; i++) {
            wordsManager.a(i, textStructure.a.subSequence(textStructure.b(i), textStructure.a(i)));
        }
    }

    @Override // com.blacksquircle.ui.language.base.provider.SuggestionProvider
    public final void processLine(int i, CharSequence charSequence) {
        charSequence.getClass();
        this.a.a(i, charSequence);
    }
}
