package com.blacksquircle.ui.editorkit.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

 
 
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/blacksquircle/ui/editorkit/model/StyleSpan;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, TypedValues.Custom.S_COLOR, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "bold", "italic", "underline", "strikethrough", "<init>", "(IZZZZ)V", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final   class StyleSpan {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

     
    public   StyleSpan(int r2, boolean r3, boolean r4, boolean r5, boolean r6, int r7, defpackage.xu r8) {
         
        throw new UnsupportedOperationException("Method not decompiled: com.blacksquircle.ui.editorkit.model.StyleSpan.<init>(int, boolean, boolean, boolean, boolean, int, xu):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StyleSpan)) {
            return false;
        }
        StyleSpan styleSpan = (StyleSpan) obj;
        return this.a == styleSpan.a && this.b == styleSpan.b && this.c == styleSpan.c && this.d == styleSpan.d && this.e == styleSpan.e;
    }

     
     
     
     
     
     
     
     
     
     
     
     
     
    public final int hashCode() {
        int i = this.a * 31;
        boolean z = this.b;
        int r2 = z ? 1 : 0;
        if (z) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z2 = this.c;
        int r22 = z2 ? 1 : 0;
        if (z2) {
            r22 = 1;
        }
        int i3 = (i2 + r22) * 31;
        boolean z3 = this.d;
        int r23 = z3 ? 1 : 0;
        if (z3) {
            r23 = 1;
        }
        int i4 = (i3 + r23) * 31;
        boolean z4 = this.e;
        return i4 + (z4 ? 1 : 0);
    }

    public final String toString() {
        return "StyleSpan(color=" + this.a + ", bold=" + this.b + ", italic=" + this.c + ", underline=" + this.d + ", strikethrough=" + this.e + ")";
    }

    public StyleSpan(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public StyleSpan() {
        this(0, false, false, false, false, 31, null);
    }
}
