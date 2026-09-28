package com.blacksquircle.ui.editorkit.model;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ec1;
import defpackage.hz;
import defpackage.vh;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/blacksquircle/ui/editorkit/model/ColorScheme;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "textColor", "cursorColor", "backgroundColor", "gutterColor", "gutterDividerColor", "gutterCurrentLineNumberColor", "gutterTextColor", "selectedLineColor", "selectionColor", "suggestionQueryColor", "findResultBackgroundColor", "delimiterBackgroundColor", "numberColor", "operatorColor", "keywordColor", "typeColor", "langConstColor", "preprocessorColor", "variableColor", "methodColor", "stringColor", "commentColor", "tagColor", "tagNameColor", "attrNameColor", "attrValueColor", "entityRefColor", "<init>", "(IIIIIIIIIIIIIIIIIIIIIIIIIII)V", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ColorScheme {
    public final int A;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public ColorScheme(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
        this.l = i12;
        this.m = i13;
        this.n = i14;
        this.o = i15;
        this.p = i16;
        this.q = i17;
        this.r = i18;
        this.s = i19;
        this.t = i20;
        this.u = i21;
        this.v = i22;
        this.w = i23;
        this.x = i24;
        this.y = i25;
        this.z = i26;
        this.A = i27;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorScheme)) {
            return false;
        }
        ColorScheme colorScheme = (ColorScheme) obj;
        return this.a == colorScheme.a && this.b == colorScheme.b && this.c == colorScheme.c && this.d == colorScheme.d && this.e == colorScheme.e && this.f == colorScheme.f && this.g == colorScheme.g && this.h == colorScheme.h && this.i == colorScheme.i && this.j == colorScheme.j && this.k == colorScheme.k && this.l == colorScheme.l && this.m == colorScheme.m && this.n == colorScheme.n && this.o == colorScheme.o && this.p == colorScheme.p && this.q == colorScheme.q && this.r == colorScheme.r && this.s == colorScheme.s && this.t == colorScheme.t && this.u == colorScheme.u && this.v == colorScheme.v && this.w == colorScheme.w && this.x == colorScheme.x && this.y == colorScheme.y && this.z == colorScheme.z && this.A == colorScheme.A;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31) + this.t) * 31) + this.u) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + this.z) * 31) + this.A;
    }

    public final String toString() {
        StringBuilder sbU = vh.u(this.a, "ColorScheme(textColor=", this.b, ", cursorColor=", ", backgroundColor=");
        ec1.M(this.c, this.d, ", gutterColor=", ", gutterDividerColor=", sbU);
        ec1.M(this.e, this.f, ", gutterCurrentLineNumberColor=", ", gutterTextColor=", sbU);
        ec1.M(this.g, this.h, ", selectedLineColor=", ", selectionColor=", sbU);
        ec1.M(this.i, this.j, ", suggestionQueryColor=", ", findResultBackgroundColor=", sbU);
        ec1.M(this.k, this.l, ", delimiterBackgroundColor=", ", numberColor=", sbU);
        ec1.M(this.m, this.n, ", operatorColor=", ", keywordColor=", sbU);
        ec1.M(this.o, this.p, ", typeColor=", ", langConstColor=", sbU);
        ec1.M(this.q, this.r, ", preprocessorColor=", ", variableColor=", sbU);
        ec1.M(this.s, this.t, ", methodColor=", ", stringColor=", sbU);
        ec1.M(this.u, this.v, ", commentColor=", ", tagColor=", sbU);
        ec1.M(this.w, this.x, ", tagNameColor=", ", attrNameColor=", sbU);
        ec1.M(this.y, this.z, ", attrValueColor=", ", entityRefColor=", sbU);
        return hz.q(this.A, ")", sbU);
    }
}
