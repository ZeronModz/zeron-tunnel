package com.blacksquircle.ui.language.base.utils;

import com.blacksquircle.ui.language.base.model.Suggestion;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/language/base/utils/WordsManager;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "Companion", "language-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WordsManager {
    public final Pattern a = Pattern.compile("\\w((\\w|-)*(\\w))?");
    public final HashMap b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/language/base/utils/WordsManager$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "WORDS_REGEX", "Ljava/lang/String;", "language-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public final void a(int i, CharSequence charSequence) {
        charSequence.getClass();
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.b;
        LinkedList linkedList = (LinkedList) map.get(numValueOf);
        if (linkedList != null) {
            linkedList.clear();
        }
        Matcher matcher = this.a.matcher(charSequence);
        while (matcher.find()) {
            Suggestion suggestion = new Suggestion(Suggestion.Type.WORD, charSequence.subSequence(matcher.start(), matcher.end()).toString(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            if (map.containsKey(Integer.valueOf(i))) {
                LinkedList linkedList2 = (LinkedList) map.get(Integer.valueOf(i));
                if (linkedList2 != null) {
                    linkedList2.add(suggestion);
                }
            } else {
                Integer numValueOf2 = Integer.valueOf(i);
                LinkedList linkedList3 = new LinkedList();
                linkedList3.add(suggestion);
                map.put(numValueOf2, linkedList3);
            }
        }
    }
}
