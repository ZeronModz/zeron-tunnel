package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wo2 {
    public final String a;
    public final String b;
    public final Drawable c;

    public wo2(String str, String str2, Drawable drawable) {
        this.a = str;
        if (str2 == null) {
            io0.e("Null imageUrl");
            throw null;
        }
        this.b = str2;
        this.c = drawable;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wo2) {
            wo2 wo2Var = (wo2) obj;
            String str = wo2Var.a;
            String str2 = this.a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.b.equals(wo2Var.b)) {
                    Drawable drawable = wo2Var.c;
                    Drawable drawable2 = this.c;
                    if (drawable2 != null ? drawable2.equals(drawable) : drawable == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
        Drawable drawable = this.c;
        return (iHashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String str = this.a;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str2.length() + length + 42 + 7 + length2 + 1);
        hz.H(sb, "OfflineAdAssets{advertiserName=", str, ", imageUrl=", str2);
        return vh.t(sb, ", icon=", strValueOf, "}");
    }
}
