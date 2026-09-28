package io.ktor.http.parsing;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/http/parsing/RangeGrammar;", "Lio/ktor/http/parsing/Grammar;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "<init>", "(CC)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RangeGrammar extends Grammar {
    public final char a;
    public final char b;

    public RangeGrammar(char c, char c2) {
        super(null);
        this.a = c;
        this.b = c2;
    }
}
