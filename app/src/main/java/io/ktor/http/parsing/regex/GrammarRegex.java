package io.ktor.http.parsing.regex;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.vh;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/http/parsing/regex/GrammarRegex;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "regexRaw", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "groupsCountRaw", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "group", "<init>", "(Ljava/lang/String;IZ)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class GrammarRegex {
    public final String a;
    public final int b;

    public GrammarRegex(String str, int i, boolean z) {
        str.getClass();
        this.a = z ? vh.f(')', "(", str) : str;
        this.b = z ? i + 1 : i;
    }

    public /* synthetic */ GrammarRegex(String str, int i, boolean z, int i2, xu xuVar) {
        this(str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z);
    }
}
