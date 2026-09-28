package defpackage;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.c1;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.stateful.ExtendableSavedState;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return q.b;
                }
                u7.p("superState must be null");
                return null;
            case 1:
                return new ExtendableSavedState(parcel, null);
            case 2:
                return new o90(parcel, null);
            case 3:
                return new ParcelableSparseArray(parcel, null);
            case 4:
                return new c1(parcel, null);
            case 5:
                return new t81(parcel);
            case 6:
                return new ge1(parcel, null);
            default:
                if (Build.VERSION.SDK_INT >= 24) {
                    return new ho1(parcel, null);
                }
                ho1 ho1Var = new ho1(parcel);
                ho1Var.a = parcel.readInt();
                ho1Var.b = parcel.readInt();
                ho1Var.c = parcel.readParcelable(null);
                return ho1Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new q[i];
            case 1:
                return new ExtendableSavedState[i];
            case 2:
                return new o90[i];
            case 3:
                return new ParcelableSparseArray[i];
            case 4:
                return new c1[i];
            case 5:
                return new t81[i];
            case 6:
                return new ge1[i];
            default:
                return new ho1[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return q.b;
                }
                u7.p("superState must be null");
                return null;
            case 1:
                return new ExtendableSavedState(parcel, classLoader);
            case 2:
                return new o90(parcel, classLoader);
            case 3:
                return new ParcelableSparseArray(parcel, classLoader);
            case 4:
                return new c1(parcel, classLoader);
            case 5:
                return new t81(parcel);
            case 6:
                return new ge1(parcel, classLoader);
            default:
                if (Build.VERSION.SDK_INT >= 24) {
                    return new ho1(parcel, classLoader);
                }
                ho1 ho1Var = new ho1(parcel);
                ho1Var.a = parcel.readInt();
                ho1Var.b = parcel.readInt();
                ho1Var.c = parcel.readParcelable(null);
                return ho1Var;
        }
    }
}
