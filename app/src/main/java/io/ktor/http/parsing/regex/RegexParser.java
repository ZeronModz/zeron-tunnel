package io.ktor.http.parsing.regex;

import com.google.android.gms.ads.RequestConfiguration;
import io.ktor.http.parsing.ParseResult;
import io.ktor.http.parsing.Parser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/http/parsing/regex/RegexParser;", "Lio/ktor/http/parsing/Parser;", "Lkotlin/text/Regex;", "expression", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "indexes", "<init>", "(Lkotlin/text/Regex;Ljava/util/Map;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RegexParser implements Parser {
    public final Regex a;
    public final Map b;

    public RegexParser(Regex regex, Map<String, ? extends List<Integer>> map) {
        regex.getClass();
        map.getClass();
        this.a = regex;
        this.b = map;
    }

    @Override // io.ktor.http.parsing.Parser
    public final boolean match(String str) {
        str.getClass();
        return this.a.matches(str);
    }

    @Override // io.ktor.http.parsing.Parser
    public final ParseResult parse(String str) {
        str.getClass();
        MatchResult matchResultMatchEntire = this.a.matchEntire(str);
        if (matchResultMatchEntire == null || matchResultMatchEntire.getValue().length() != str.length()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            String str2 = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                ArrayList arrayList = new ArrayList();
                MatchGroup matchGroup = matchResultMatchEntire.getGroups().get(iIntValue);
                if (matchGroup != null) {
                    arrayList.add(matchGroup.a);
                }
                if (!arrayList.isEmpty()) {
                    linkedHashMap.put(str2, arrayList);
                }
            }
        }
        return new ParseResult(linkedHashMap);
    }
}
