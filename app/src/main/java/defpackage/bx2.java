package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzgh;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class bx2 extends cs1 implements zzgb {
    public bx2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 2);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzA(wj3 wj3Var) {
        Parcel parcelE = e();
        x52.b(parcelE, wj3Var);
        f(27, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzB(wj3 wj3Var, ki3 ki3Var, zzgh zzghVar) {
        Parcel parcelE = e();
        x52.b(parcelE, wj3Var);
        x52.b(parcelE, ki3Var);
        x52.c(parcelE, zzghVar);
        f(29, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzC(wj3 wj3Var, qw1 qw1Var) {
        Parcel parcelE = e();
        x52.b(parcelE, wj3Var);
        x52.b(parcelE, qw1Var);
        f(30, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzD(wj3 wj3Var, Bundle bundle, zzge zzgeVar) {
        Parcel parcelE = e();
        x52.b(parcelE, wj3Var);
        x52.b(parcelE, bundle);
        x52.c(parcelE, zzgeVar);
        f(31, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zze(zzbg zzbgVar, wj3 wj3Var) {
        Parcel parcelE = e();
        x52.b(parcelE, zzbgVar);
        x52.b(parcelE, wj3Var);
        f(1, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzf(dj3 dj3Var, wj3 wj3Var) {
        Parcel parcelE = e();
        x52.b(parcelE, dj3Var);
        x52.b(parcelE, wj3Var);
        f(2, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzg(wj3 wj3Var) {
        Parcel parcelE = e();
        x52.b(parcelE, wj3Var);
        f(4, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzh(zzbg zzbgVar, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzi(wj3 wj3Var) {
        Parcel parcelE = e();
        x52.b(parcelE, wj3Var);
        f(6, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzj(wj3 wj3Var, boolean z) {
        Parcel parcelE = e();
        x52.b(parcelE, wj3Var);
        parcelE.writeInt(z ? 1 : 0);
        Parcel parcelD = d(7, parcelE);
        ArrayList arrayListCreateTypedArrayList = parcelD.createTypedArrayList(dj3.CREATOR);
        parcelD.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final byte[] zzk(zzbg zzbgVar, String str) {
        Parcel parcelE = e();
        x52.b(parcelE, zzbgVar);
        parcelE.writeString(str);
        Parcel parcelD = d(9, parcelE);
        byte[] bArrCreateByteArray = parcelD.createByteArray();
        parcelD.recycle();
        return bArrCreateByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzl(long j, String str, String str2, String str3) {
        Parcel parcelE = e();
        parcelE.writeLong(j);
        parcelE.writeString(str);
        parcelE.writeString(str2);
        parcelE.writeString(str3);
        f(10, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final String zzm(wj3 wj3Var) {
        Parcel parcelE = e();
        x52.b(parcelE, wj3Var);
        Parcel parcelD = d(11, parcelE);
        String string = parcelD.readString();
        parcelD.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzn(zw1 zw1Var, wj3 wj3Var) {
        Parcel parcelE = e();
        x52.b(parcelE, zw1Var);
        x52.b(parcelE, wj3Var);
        f(12, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzo(zw1 zw1Var) {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzp(String str, String str2, boolean z, wj3 wj3Var) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        ClassLoader classLoader = x52.a;
        parcelE.writeInt(z ? 1 : 0);
        x52.b(parcelE, wj3Var);
        Parcel parcelD = d(14, parcelE);
        ArrayList arrayListCreateTypedArrayList = parcelD.createTypedArrayList(dj3.CREATOR);
        parcelD.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzq(String str, String str2, String str3, boolean z) {
        Parcel parcelE = e();
        parcelE.writeString(null);
        parcelE.writeString(str2);
        parcelE.writeString(str3);
        ClassLoader classLoader = x52.a;
        parcelE.writeInt(z ? 1 : 0);
        Parcel parcelD = d(15, parcelE);
        ArrayList arrayListCreateTypedArrayList = parcelD.createTypedArrayList(dj3.CREATOR);
        parcelD.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzr(String str, String str2, wj3 wj3Var) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        x52.b(parcelE, wj3Var);
        Parcel parcelD = d(16, parcelE);
        ArrayList arrayListCreateTypedArrayList = parcelD.createTypedArrayList(zw1.CREATOR);
        parcelD.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzs(String str, String str2, String str3) {
        Parcel parcelE = e();
        parcelE.writeString(null);
        parcelE.writeString(str2);
        parcelE.writeString(str3);
        Parcel parcelD = d(17, parcelE);
        ArrayList arrayListCreateTypedArrayList = parcelD.createTypedArrayList(zw1.CREATOR);
        parcelD.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzt(wj3 wj3Var) {
        Parcel parcelE = e();
        x52.b(parcelE, wj3Var);
        f(18, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzu(Bundle bundle, wj3 wj3Var) {
        Parcel parcelE = e();
        x52.b(parcelE, bundle);
        x52.b(parcelE, wj3Var);
        f(19, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzv(wj3 wj3Var) {
        Parcel parcelE = e();
        x52.b(parcelE, wj3Var);
        f(20, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final zzao zzw(wj3 wj3Var) {
        Parcel parcelE = e();
        x52.b(parcelE, wj3Var);
        Parcel parcelD = d(21, parcelE);
        zzao zzaoVar = (zzao) x52.a(parcelD, zzao.CREATOR);
        parcelD.recycle();
        return zzaoVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzx(wj3 wj3Var, Bundle bundle) {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzy(wj3 wj3Var) {
        Parcel parcelE = e();
        x52.b(parcelE, wj3Var);
        f(25, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzz(wj3 wj3Var) {
        Parcel parcelE = e();
        x52.b(parcelE, wj3Var);
        f(26, parcelE);
    }
}
