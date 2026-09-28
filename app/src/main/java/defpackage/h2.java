package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.preference.a;
import androidx.preference.c;
import androidx.preference.e;
import androidx.versionedparcelable.ParcelImpl;
import androidx.work.multiprocess.parcelable.ParcelableConstraints;
import androidx.work.multiprocess.parcelable.ParcelableData;
import androidx.work.multiprocess.parcelable.ParcelableForegroundRequestInfo;
import androidx.work.multiprocess.parcelable.ParcelableInterruptRequest;
import androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest;
import com.github.mikephil.charting.data.Entry;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.datepicker.CalendarConstraints$DateValidator;
import com.google.android.material.internal.ParcelableSparseArray;
import com.tencent.mmkv.ParcelableMMKV;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ h2(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                i2 i2Var = new i2();
                i2Var.a = parcel.readInt();
                return i2Var;
            case 1:
                parcel.getClass();
                return new ActivityResult(parcel);
            case 2:
                c7 c7Var = new c7(parcel);
                c7Var.a = parcel.readByte() != 0;
                return c7Var;
            case 3:
                return new id(parcel);
            case 4:
                return new jd(parcel);
            case 5:
                BadgeState$State badgeState$State = new BadgeState$State();
                badgeState$State.i = 255;
                badgeState$State.k = -2;
                badgeState$State.l = -2;
                badgeState$State.m = -2;
                badgeState$State.t = Boolean.TRUE;
                badgeState$State.a = parcel.readInt();
                badgeState$State.b = (Integer) parcel.readSerializable();
                badgeState$State.c = (Integer) parcel.readSerializable();
                badgeState$State.d = (Integer) parcel.readSerializable();
                badgeState$State.e = (Integer) parcel.readSerializable();
                badgeState$State.f = (Integer) parcel.readSerializable();
                badgeState$State.g = (Integer) parcel.readSerializable();
                badgeState$State.h = (Integer) parcel.readSerializable();
                badgeState$State.i = parcel.readInt();
                badgeState$State.j = parcel.readString();
                badgeState$State.k = parcel.readInt();
                badgeState$State.l = parcel.readInt();
                badgeState$State.m = parcel.readInt();
                badgeState$State.o = parcel.readString();
                badgeState$State.p = parcel.readString();
                badgeState$State.q = parcel.readInt();
                badgeState$State.s = (Integer) parcel.readSerializable();
                badgeState$State.u = (Integer) parcel.readSerializable();
                badgeState$State.v = (Integer) parcel.readSerializable();
                badgeState$State.w = (Integer) parcel.readSerializable();
                badgeState$State.x = (Integer) parcel.readSerializable();
                badgeState$State.y = (Integer) parcel.readSerializable();
                badgeState$State.z = (Integer) parcel.readSerializable();
                badgeState$State.C = (Integer) parcel.readSerializable();
                badgeState$State.A = (Integer) parcel.readSerializable();
                badgeState$State.B = (Integer) parcel.readSerializable();
                badgeState$State.t = (Boolean) parcel.readSerializable();
                badgeState$State.n = (Locale) parcel.readSerializable();
                badgeState$State.D = (Boolean) parcel.readSerializable();
                return badgeState$State;
            case 6:
                fe feVar = new fe(parcel);
                feVar.a = parcel.readFloat();
                feVar.b = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                feVar.c = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                feVar.d = parcel.readFloat();
                feVar.e = parcel.createBooleanArray()[0];
                return feVar;
            case 7:
                return new kh((er0) parcel.readParcelable(er0.class.getClassLoader()), (er0) parcel.readParcelable(er0.class.getClassLoader()), (CalendarConstraints$DateValidator) parcel.readParcelable(CalendarConstraints$DateValidator.class.getClassLoader()), (er0) parcel.readParcelable(er0.class.getClassLoader()), parcel.readInt());
            case 8:
                return new iu(parcel.readLong());
            case 9:
                a aVar = new a(parcel);
                aVar.a = parcel.readString();
                return aVar;
            case 10:
                Entry entry = new Entry();
                entry.d = 0.0f;
                entry.d = parcel.readFloat();
                entry.a = parcel.readFloat();
                if (parcel.readInt() == 1) {
                    entry.b = parcel.readParcelable(Object.class.getClassLoader());
                }
                return entry;
            case 11:
                c70 c70Var = new c70();
                c70Var.a = parcel.readInt();
                c70Var.b = parcel.readInt();
                return c70Var;
            case 12:
                ba0 ba0Var = new ba0();
                ba0Var.a = parcel.readString();
                ba0Var.b = parcel.readInt();
                return ba0Var;
            case 13:
                return new ga0(parcel);
            case 14:
                qa0 qa0Var = new qa0(parcel);
                qa0Var.a = parcel.readString();
                return qa0Var;
            case 15:
                parcel.getClass();
                return new IntentSenderRequest(parcel);
            case 16:
                c cVar = new c(parcel);
                cVar.a = parcel.readString();
                return cVar;
            case 17:
                ko0 ko0Var = new ko0(parcel);
                ko0Var.a = ((Integer) parcel.readValue(ko0.class.getClassLoader())).intValue();
                return ko0Var;
            case 18:
                return er0.a(parcel.readInt(), parcel.readInt());
            case 19:
                e eVar = new e(parcel);
                int i = parcel.readInt();
                eVar.a = new HashSet();
                String[] strArr = new String[i];
                parcel.readStringArray(strArr);
                Collections.addAll(eVar.a, strArr);
                return eVar;
            case 20:
                return new ks0(parcel);
            case 21:
                ys0 ys0Var = new ys0();
                ys0Var.a = parcel.readInt();
                ys0Var.b = (ParcelableSparseArray) parcel.readParcelable(ys0.class.getClassLoader());
                return ys0Var;
            case 22:
                et0 et0Var = new et0(parcel);
                et0Var.a = parcel.readInt();
                return et0Var;
            case 23:
                return new ParcelImpl(parcel);
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                return new ParcelableConstraints(parcel);
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                parcel.getClass();
                return new ParcelableData(parcel);
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                return new ParcelableForegroundRequestInfo(parcel);
            case 27:
                parcel.getClass();
                return new ParcelableInterruptRequest(parcel);
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                String string = parcel.readString();
                Parcelable.Creator creator = ParcelFileDescriptor.CREATOR;
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) creator.createFromParcel(parcel);
                ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) creator.createFromParcel(parcel);
                String string2 = parcel.readString();
                if (parcelFileDescriptor == null || parcelFileDescriptor2 == null) {
                    return null;
                }
                return new ParcelableMMKV(string, parcelFileDescriptor.detachFd(), parcelFileDescriptor2.detachFd(), string2);
            default:
                return new ParcelableRemoteWorkRequest(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new i2[i];
            case 1:
                return new ActivityResult[i];
            case 2:
                return new c7[i];
            case 3:
                return new id[i];
            case 4:
                return new jd[i];
            case 5:
                return new BadgeState$State[i];
            case 6:
                return new fe[i];
            case 7:
                return new kh[i];
            case 8:
                return new iu[i];
            case 9:
                return new a[i];
            case 10:
                return new Entry[i];
            case 11:
                return new c70[i];
            case 12:
                return new ba0[i];
            case 13:
                return new ga0[i];
            case 14:
                return new qa0[i];
            case 15:
                return new IntentSenderRequest[i];
            case 16:
                return new c[i];
            case 17:
                return new ko0[i];
            case 18:
                return new er0[i];
            case 19:
                return new e[i];
            case 20:
                return new ks0[i];
            case 21:
                return new ys0[i];
            case 22:
                return new et0[i];
            case 23:
                return new ParcelImpl[i];
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                return new ParcelableConstraints[i];
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                return new ParcelableData[i];
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                return new ParcelableForegroundRequestInfo[i];
            case 27:
                return new ParcelableInterruptRequest[i];
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                return new ParcelableMMKV[i];
            default:
                return new ParcelableRemoteWorkRequest[i];
        }
    }
}
