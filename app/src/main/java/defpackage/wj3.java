package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class wj3 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<wj3> CREATOR = new zzs();
    public final long A;
    public final String B;
    public final String C;
    public final long D;
    public final int E;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    public final long l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final Boolean p;
    public final long q;
    public final List r;
    public final String s;
    public final String t;
    public final String u;
    public final boolean v;
    public final long w;
    public final int x;
    public final String y;
    public final int z;

    public wj3(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4) {
        yg0.j(str);
        this.a = str;
        this.b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.c = str3;
        this.j = j;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = i;
        this.n = z3;
        this.o = z4;
        this.p = bool;
        this.q = j5;
        this.r = list;
        this.s = str7;
        this.t = str8;
        this.u = str9;
        this.v = z5;
        this.w = j6;
        this.x = i2;
        this.y = str10;
        this.z = i3;
        this.A = j7;
        this.B = str11;
        this.C = str12;
        this.D = j8;
        this.E = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = n8.V(20293, parcel);
        n8.G(parcel, 2, this.a);
        n8.G(parcel, 3, this.b);
        n8.G(parcel, 4, this.c);
        n8.G(parcel, 5, this.d);
        n8.P(parcel, 6, 8);
        parcel.writeLong(this.e);
        n8.P(parcel, 7, 8);
        parcel.writeLong(this.f);
        n8.G(parcel, 8, this.g);
        n8.P(parcel, 9, 4);
        parcel.writeInt(this.h ? 1 : 0);
        n8.P(parcel, 10, 4);
        parcel.writeInt(this.i ? 1 : 0);
        n8.P(parcel, 11, 8);
        parcel.writeLong(this.j);
        n8.G(parcel, 12, this.k);
        n8.P(parcel, 14, 8);
        parcel.writeLong(this.l);
        n8.P(parcel, 15, 4);
        parcel.writeInt(this.m);
        n8.P(parcel, 16, 4);
        parcel.writeInt(this.n ? 1 : 0);
        n8.P(parcel, 18, 4);
        parcel.writeInt(this.o ? 1 : 0);
        Boolean bool = this.p;
        if (bool != null) {
            n8.P(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        n8.P(parcel, 22, 8);
        parcel.writeLong(this.q);
        n8.I(parcel, 23, this.r);
        n8.G(parcel, 25, this.s);
        n8.G(parcel, 26, this.t);
        n8.G(parcel, 27, this.u);
        n8.P(parcel, 28, 4);
        parcel.writeInt(this.v ? 1 : 0);
        n8.P(parcel, 29, 8);
        parcel.writeLong(this.w);
        n8.P(parcel, 30, 4);
        parcel.writeInt(this.x);
        n8.G(parcel, 31, this.y);
        n8.P(parcel, 32, 4);
        parcel.writeInt(this.z);
        n8.P(parcel, 34, 8);
        parcel.writeLong(this.A);
        n8.G(parcel, 35, this.B);
        n8.G(parcel, 36, this.C);
        n8.P(parcel, 37, 8);
        parcel.writeLong(this.D);
        n8.P(parcel, 38, 4);
        parcel.writeInt(this.E);
        n8.e0(iV, parcel);
    }

    public wj3(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, ArrayList arrayList, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.j = j3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = i;
        this.n = z3;
        this.o = z4;
        this.p = bool;
        this.q = j5;
        this.r = arrayList;
        this.s = str7;
        this.t = str8;
        this.u = str9;
        this.v = z5;
        this.w = j6;
        this.x = i2;
        this.y = str10;
        this.z = i3;
        this.A = j7;
        this.B = str11;
        this.C = str12;
        this.D = j8;
        this.E = i4;
    }
}
