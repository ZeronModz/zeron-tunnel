package me.ibrahimsn.lib;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;
import defpackage.xu;
import defpackage.yg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lme/ibrahimsn/lib/BottomBarItem;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "title", "contentDescription", "Landroid/graphics/drawable/Drawable;", "icon", "Landroid/graphics/RectF;", "rect", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "alpha", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/graphics/RectF;I)V", "lib_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class BottomBarItem {
    public String a;
    public final String b;
    public final Drawable c;
    public RectF d;
    public int e;

    public BottomBarItem(String str, String str2, Drawable drawable, RectF rectF, int i) {
        str.getClass();
        str2.getClass();
        drawable.getClass();
        rectF.getClass();
        this.a = str;
        this.b = str2;
        this.c = drawable;
        this.d = rectF;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomBarItem)) {
            return false;
        }
        BottomBarItem bottomBarItem = (BottomBarItem) obj;
        return yg0.a(this.a, bottomBarItem.a) && yg0.a(this.b, bottomBarItem.b) && yg0.a(this.c, bottomBarItem.c) && yg0.a(this.d, bottomBarItem.d) && this.e == bottomBarItem.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Drawable drawable = this.c;
        int iHashCode3 = (iHashCode2 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        RectF rectF = this.d;
        return ((iHashCode3 + (rectF != null ? rectF.hashCode() : 0)) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomBarItem(title=");
        sb.append(this.a);
        sb.append(", contentDescription=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", rect=");
        sb.append(this.d);
        sb.append(", alpha=");
        return hz.q(this.e, ")", sb);
    }

    public /* synthetic */ BottomBarItem(String str, String str2, Drawable drawable, RectF rectF, int i, int i2, xu xuVar) {
        this(str, str2, drawable, (i2 & 8) != 0 ? new RectF() : rectF, i);
    }
}
