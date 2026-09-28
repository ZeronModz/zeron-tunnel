package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import androidx.preference.g;
import androidx.preference.i;
import androidx.preference.j;
import androidx.work.ExistingWorkPolicy;
import androidx.work.impl.WorkRequestHolder;
import androidx.work.multiprocess.parcelable.ParcelableResult;
import androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras;
import androidx.work.multiprocess.parcelable.ParcelableUpdateRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl;
import androidx.work.multiprocess.parcelable.ParcelableWorkInfo;
import androidx.work.multiprocess.parcelable.ParcelableWorkInfos;
import androidx.work.multiprocess.parcelable.ParcelableWorkQuery;
import androidx.work.multiprocess.parcelable.ParcelableWorkRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkRequests;
import androidx.work.multiprocess.parcelable.ParcelableWorkerParameters;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.internal.ads.zzp;
import com.google.android.gms.internal.ads.zzq;
import com.google.android.material.datepicker.RangeDateSelector;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.internal.ParcelableSparseBooleanArray;
import com.google.android.material.internal.ParcelableSparseIntArray;
import com.google.firebase.Timestamp;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ew0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ ew0(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new ParcelableResult(parcel);
            case 1:
                return new ParcelableRuntimeExtras(parcel);
            case 2:
                int i = parcel.readInt();
                ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(i);
                int[] iArr = new int[i];
                boolean[] zArr = new boolean[i];
                parcel.readIntArray(iArr);
                parcel.readBooleanArray(zArr);
                for (int i2 = 0; i2 < i; i2++) {
                    parcelableSparseBooleanArray.put(iArr[i2], zArr[i2]);
                }
                return parcelableSparseBooleanArray;
            case 3:
                int i3 = parcel.readInt();
                ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(i3);
                int[] iArr2 = new int[i3];
                int[] iArr3 = new int[i3];
                parcel.readIntArray(iArr2);
                parcel.readIntArray(iArr3);
                for (int i4 = 0; i4 < i3; i4++) {
                    parcelableSparseIntArray.put(iArr2[i4], iArr3[i4]);
                }
                return parcelableSparseIntArray;
            case 4:
                return new ParcelableUpdateRequest(parcel);
            case 5:
                ParcelableWorkContinuationImpl parcelableWorkContinuationImpl = new ParcelableWorkContinuationImpl();
                ArrayList arrayList = null;
                String string = parcel.readInt() == 1 ? parcel.readString() : null;
                ExistingWorkPolicy existingWorkPolicy = ParcelableWorkContinuationImpl.b[parcel.readInt()];
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                ClassLoader classLoader = ParcelableWorkContinuationImpl.class.getClassLoader();
                for (int i6 = 0; i6 < i5; i6++) {
                    arrayList2.add((WorkRequestHolder) ((ParcelableWorkRequest) parcel.readParcelable(classLoader)).a);
                }
                if (parcel.readInt() == 1) {
                    int i7 = parcel.readInt();
                    arrayList = new ArrayList(i7);
                    for (int i8 = 0; i8 < i7; i8++) {
                        arrayList.add(((ParcelableWorkContinuationImpl) parcel.readParcelable(classLoader)).a);
                    }
                }
                parcelableWorkContinuationImpl.a = new ParcelableWorkContinuationImpl.WorkContinuationImplInfo(string, existingWorkPolicy, arrayList2, arrayList);
                return parcelableWorkContinuationImpl;
            case 6:
                return new ParcelableWorkInfo(parcel);
            case 7:
                return new ParcelableWorkInfos(parcel);
            case 8:
                return new ParcelableWorkQuery(parcel);
            case 9:
                return new ParcelableWorkRequest(parcel);
            case 10:
                return new ParcelableWorkRequests(parcel);
            case 11:
                return new ParcelableWorkerParameters(parcel);
            case 12:
                g gVar = new g(parcel);
                gVar.a = parcel.readInt();
                return gVar;
            case 13:
                RangeDateSelector rangeDateSelector = new RangeDateSelector();
                rangeDateSelector.c = (Long) parcel.readValue(Long.class.getClassLoader());
                rangeDateSelector.d = (Long) parcel.readValue(Long.class.getClassLoader());
                return rangeDateSelector;
            case 14:
                return new p11(parcel);
            case 15:
                return new ResultReceiver(parcel);
            case 16:
                i iVar = new i(parcel);
                iVar.a = parcel.readInt();
                iVar.b = parcel.readInt();
                iVar.c = parcel.readInt();
                return iVar;
            case 17:
                SingleDateSelector singleDateSelector = new SingleDateSelector();
                singleDateSelector.b = (Long) parcel.readValue(Long.class.getClassLoader());
                return singleDateSelector;
            case 18:
                z91 z91Var = new z91();
                z91Var.a = parcel.readInt();
                z91Var.b = parcel.readInt();
                z91Var.d = parcel.readInt() == 1;
                int i9 = parcel.readInt();
                if (i9 > 0) {
                    int[] iArr4 = new int[i9];
                    z91Var.c = iArr4;
                    parcel.readIntArray(iArr4);
                }
                return z91Var;
            case 19:
                return new zc1(parcel);
            case 20:
                parcel.getClass();
                return new Timestamp(parcel.readLong(), parcel.readInt());
            case 21:
                j jVar = new j(parcel);
                jVar.a = parcel.readInt() == 1;
                return jVar;
            case 22:
                return new zzd(parcel.readStrongBinder());
            case 23:
                return new BinderWrapper(parcel);
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                return new zzq(parcel);
            default:
                return new zzp(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ParcelableResult[i];
            case 1:
                return new ParcelableRuntimeExtras[i];
            case 2:
                return new ParcelableSparseBooleanArray[i];
            case 3:
                return new ParcelableSparseIntArray[i];
            case 4:
                return new ParcelableUpdateRequest[i];
            case 5:
                return new ParcelableWorkContinuationImpl[i];
            case 6:
                return new ParcelableWorkInfo[i];
            case 7:
                return new ParcelableWorkInfos[i];
            case 8:
                return new ParcelableWorkQuery[i];
            case 9:
                return new ParcelableWorkRequest[i];
            case 10:
                return new ParcelableWorkRequests[i];
            case 11:
                return new ParcelableWorkerParameters[i];
            case 12:
                return new g[i];
            case 13:
                return new RangeDateSelector[i];
            case 14:
                return new p11[i];
            case 15:
                return new ResultReceiver[i];
            case 16:
                return new i[i];
            case 17:
                return new SingleDateSelector[i];
            case 18:
                return new z91[i];
            case 19:
                return new zc1[i];
            case 20:
                return new Timestamp[i];
            case 21:
                return new j[i];
            case 22:
                return new zzd[i];
            case 23:
                return new BinderWrapper[i];
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                return new zzq[i];
            default:
                return new zzp[i];
        }
    }
}
