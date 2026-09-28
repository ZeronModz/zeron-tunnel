package io.ktor.util;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/util/CaseInsensitiveString;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "content", "<init>", "(Ljava/lang/String;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CaseInsensitiveString {
    public final String a;
    public final int b;

    public CaseInsensitiveString(String str) {
        str.getClass();
        this.a = str;
        int length = str.length();
        int lowerCase = 0;
        for (int i = 0; i < length; i++) {
            lowerCase = (lowerCase * 31) + Character.toLowerCase(str.charAt(i));
        }
        this.b = lowerCase;
    }

    public final boolean equals(Object obj) {
        CaseInsensitiveString caseInsensitiveString = obj instanceof CaseInsensitiveString ? (CaseInsensitiveString) obj : null;
        return caseInsensitiveString != null && caseInsensitiveString.a.equalsIgnoreCase(this.a);
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getA() {
        return this.a;
    }
}
