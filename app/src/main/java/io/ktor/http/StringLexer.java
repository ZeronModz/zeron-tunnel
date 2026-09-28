package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/http/StringLexer;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "source", "<init>", "(Ljava/lang/String;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StringLexer {
    public final String a;
    public int b;

    public StringLexer(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean a(Function1 function1) {
        function1.getClass();
        boolean zC = c(function1);
        if (zC) {
            this.b++;
        }
        return zC;
    }

    public final void b(Function1 function1) {
        function1.getClass();
        if (c(function1)) {
            while (c(function1)) {
                this.b++;
            }
        }
    }

    public final boolean c(Function1 function1) {
        function1.getClass();
        int i = this.b;
        String str = this.a;
        return i < str.length() && ((Boolean) function1.invoke(Character.valueOf(str.charAt(this.b)))).booleanValue();
    }
}
