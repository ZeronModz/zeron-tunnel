package io.ktor.http.parsing.regex;

import defpackage.oq;
import defpackage.vh;
import io.ktor.http.parsing.AnyOfGrammar;
import io.ktor.http.parsing.AtLeastOne;
import io.ktor.http.parsing.ComplexGrammar;
import io.ktor.http.parsing.Grammar;
import io.ktor.http.parsing.ManyGrammar;
import io.ktor.http.parsing.MaybeGrammar;
import io.ktor.http.parsing.NamedGrammar;
import io.ktor.http.parsing.OrGrammar;
import io.ktor.http.parsing.RangeGrammar;
import io.ktor.http.parsing.RawGrammar;
import io.ktor.http.parsing.SimpleGrammar;
import io.ktor.http.parsing.StringGrammar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import kotlin.collections.c;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final RegexParser a(OrGrammar orGrammar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        return new RegexParser(new Regex(c(orGrammar, linkedHashMap, 0, 6).a), linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final GrammarRegex b(Grammar grammar, LinkedHashMap linkedHashMap, int i, boolean z) {
        char c;
        if (grammar instanceof StringGrammar) {
            Regex.Companion companion = Regex.INSTANCE;
            String str = ((StringGrammar) grammar).a;
            companion.getClass();
            str.getClass();
            String strQuote = Pattern.quote(str);
            strQuote.getClass();
            return new GrammarRegex(strQuote, 0, false, 6, null);
        }
        if (grammar instanceof RawGrammar) {
            return new GrammarRegex(((RawGrammar) grammar).a, 0, false, 6, null);
        }
        if (grammar instanceof NamedGrammar) {
            NamedGrammar namedGrammar = (NamedGrammar) grammar;
            GrammarRegex grammarRegexC = c(namedGrammar.b, linkedHashMap, i + 1, 4);
            String str2 = namedGrammar.a;
            if (!linkedHashMap.containsKey(str2)) {
                linkedHashMap.put(str2, new ArrayList());
            }
            Integer numValueOf = Integer.valueOf(i);
            Object obj = linkedHashMap.get(str2);
            obj.getClass();
            ((Collection) obj).add(numValueOf);
            return new GrammarRegex(grammarRegexC.a, grammarRegexC.b, true);
        }
        if (grammar instanceof ComplexGrammar) {
            StringBuilder sb = new StringBuilder();
            int i2 = z ? i + 1 : i;
            int i3 = 0;
            for (Object obj2 : ((ComplexGrammar) grammar).getGrammars()) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    c.O();
                    throw null;
                }
                GrammarRegex grammarRegexB = b((Grammar) obj2, linkedHashMap, i2, true);
                if (i3 != 0 && (grammar instanceof OrGrammar)) {
                    sb.append("|");
                }
                sb.append(grammarRegexB.a);
                i2 += grammarRegexB.b;
                i3 = i4;
            }
            int i5 = i2 - i;
            if (z) {
                i5--;
            }
            return new GrammarRegex(sb.toString(), i5, z);
        }
        if (grammar instanceof SimpleGrammar) {
            if (grammar instanceof MaybeGrammar) {
                c = '?';
            } else if (grammar instanceof ManyGrammar) {
                c = '*';
            } else {
                if (!(grammar instanceof AtLeastOne)) {
                    oq.m(grammar, "Unsupported simple grammar element: ");
                    return null;
                }
                c = '+';
            }
            GrammarRegex grammarRegexB2 = b(((SimpleGrammar) grammar).getA(), linkedHashMap, i, true);
            return new GrammarRegex(vh.q(new StringBuilder(), grammarRegexB2.a, c), grammarRegexB2.b, false, 4, null);
        }
        if (grammar instanceof AnyOfGrammar) {
            StringBuilder sb2 = new StringBuilder("[");
            Regex.Companion companion2 = Regex.INSTANCE;
            String str3 = ((AnyOfGrammar) grammar).a;
            companion2.getClass();
            str3.getClass();
            String strQuote2 = Pattern.quote(str3);
            strQuote2.getClass();
            sb2.append(strQuote2);
            sb2.append(']');
            return new GrammarRegex(sb2.toString(), 0, false, 6, null);
        }
        if (!(grammar instanceof RangeGrammar)) {
            oq.m(grammar, "Unsupported grammar element: ");
            return null;
        }
        StringBuilder sb3 = new StringBuilder("[");
        RangeGrammar rangeGrammar = (RangeGrammar) grammar;
        sb3.append(rangeGrammar.a);
        sb3.append('-');
        sb3.append(rangeGrammar.b);
        sb3.append(']');
        return new GrammarRegex(sb3.toString(), 0, false, 6, null);
    }

    public static /* synthetic */ GrammarRegex c(Grammar grammar, LinkedHashMap linkedHashMap, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return b(grammar, linkedHashMap, i, false);
    }
}
