package defpackage;

import io.ktor.http.parsing.AtLeastOne;
import io.ktor.http.parsing.RangeGrammar;
import io.ktor.http.parsing.RawGrammar;
import io.ktor.http.parsing.StringGrammar;
import io.ktor.http.parsing.regex.RegexParser;
import io.ktor.http.parsing.regex.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class bh0 {
    public static final RegexParser a = a.a(kf2.p(kf2.x(kf2.x(kf2.x(kf2.x(kf2.x(kf2.x(new AtLeastOne(new RawGrammar("\\d")), new StringGrammar(".")), new AtLeastOne(new RawGrammar("\\d"))), new StringGrammar(".")), new AtLeastOne(new RawGrammar("\\d"))), new StringGrammar(".")), new AtLeastOne(new RawGrammar("\\d"))), kf2.x(kf2.x(new StringGrammar("["), new AtLeastOne(kf2.p(kf2.p(kf2.p(new RawGrammar("\\d"), new RangeGrammar('A', 'F')), new RangeGrammar('a', 'f')), new StringGrammar(":")))), new StringGrammar("]"))));
}
