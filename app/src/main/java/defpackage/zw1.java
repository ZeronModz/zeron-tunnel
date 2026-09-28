package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zw1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zw1> CREATOR = new zzai();
    public String a;
    public String b;
    public dj3 c;
    public long d;
    public boolean e;
    public String f;
    public final zzbg g;
    public long h;
    public zzbg i;
    public final long j;
    public final zzbg k;

    public zw1(zw1 zw1Var) {
        this.a = zw1Var.a;
        this.b = zw1Var.b;
        this.c = zw1Var.c;
        this.d = zw1Var.d;
        this.e = zw1Var.e;
        this.f = zw1Var.f;
        this.g = zw1Var.g;
        this.h = zw1Var.h;
        this.i = zw1Var.i;
        this.j = zw1Var.j;
        this.k = zw1Var.k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = n8.V(20293, parcel);
        n8.G(parcel, 2, this.a);
        n8.G(parcel, 3, this.b);
        n8.F(parcel, 4, this.c, i);
        long j = this.d;
        n8.P(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.e;
        n8.P(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        n8.G(parcel, 7, this.f);
        n8.F(parcel, 8, this.g, i);
        long j2 = this.h;
        n8.P(parcel, 9, 8);
        parcel.writeLong(j2);
        n8.F(parcel, 10, this.i, i);
        n8.P(parcel, 11, 8);
        parcel.writeLong(this.j);
        n8.F(parcel, 12, this.k, i);
        n8.e0(iV, parcel);
    }

    public zw1(String str, String str2, dj3 dj3Var, long j, boolean z, String str3, zzbg zzbgVar, long j2, zzbg zzbgVar2, long j3, zzbg zzbgVar3) {
        this.a = str;
        this.b = str2;
        this.c = dj3Var;
        this.d = j;
        this.e = z;
        this.f = str3;
        this.g = zzbgVar;
        this.h = j2;
        this.i = zzbgVar2;
        this.j = j3;
        this.k = zzbgVar3;
    }
}
