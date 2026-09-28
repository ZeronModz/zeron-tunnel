package com.blacksquircle.ui.editorkit.model;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import defpackage.yg0;
import kotlin.Metadata;

 
 
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/blacksquircle/ui/editorkit/model/FindParams;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "query", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "regex", "matchCase", "wordsOnly", "<init>", "(Ljava/lang/String;ZZZ)V", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final   class FindParams {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public   FindParams(String str, boolean z, boolean z2, boolean z3, int i, xu xuVar) {
        this((i & 1) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindParams)) {
            return false;
        }
        FindParams findParams = (FindParams) obj;
        return yg0.a(this.a, findParams.a) && this.b == findParams.b && this.c == findParams.c && this.d == findParams.d;
    }

     
     
     
     
     
     
     
     
     
     
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int r2 = z ? 1 : 0;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        boolean z2 = this.c;
        int r22 = z2 ? 1 : 0;
        if (z2) {
            r22 = 1;
        }
        int i2 = (i + r22) * 31;
        boolean z3 = this.d;
        return i2 + (z3 ? 1 : 0);
    }

    public final String toString() {
        return "FindParams(query=" + this.a + ", regex=" + this.b + ", matchCase=" + this.c + ", wordsOnly=" + this.d + ")";
    }

    public FindParams(String str, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public FindParams() {
        this(null, false, false, false, 15, null);
    }
}
