package io.github.g00fy2.quickie.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/github/g00fy2/quickie/config/ParcelableScannerConfig;", "Landroid/os/Parcelable;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "formats", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "stringRes", "drawableRes", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "hapticFeedback", "showTorchToggle", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "horizontalFrameRatio", "useFrontCamera", "showCloseButton", "keepScreenOn", "<init>", "([IILjava/lang/Integer;ZZFZZZ)V", "quickie-foss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ParcelableScannerConfig implements Parcelable {
    public static final Parcelable.Creator<ParcelableScannerConfig> CREATOR = new Creator();
    public final int[] a;
    public final int b;
    public final Integer c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ParcelableScannerConfig> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableScannerConfig createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            float f;
            boolean z4;
            boolean z5;
            parcel.getClass();
            int[] iArrCreateIntArray = parcel.createIntArray();
            int i = parcel.readInt();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z6 = false;
            boolean z7 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z7 = z;
            }
            float f2 = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z3 = z2;
                f = f2;
                z4 = z3;
            } else {
                z3 = z2;
                f = f2;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                z5 = z3;
            } else {
                z5 = z3;
                z3 = z;
            }
            if (parcel.readInt() == 0) {
                z5 = z;
            }
            return new ParcelableScannerConfig(iArrCreateIntArray, i, numValueOf, z6, z7, f, z4, z3, z5);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableScannerConfig[] newArray(int i) {
            return new ParcelableScannerConfig[i];
        }
    }

    public ParcelableScannerConfig(int[] iArr, int i, Integer num, boolean z, boolean z2, float f, boolean z3, boolean z4, boolean z5) {
        iArr.getClass();
        this.a = iArr;
        this.b = i;
        this.c = num;
        this.d = z;
        this.e = z2;
        this.f = f;
        this.g = z3;
        this.h = z4;
        this.i = z5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.getClass();
        parcel.writeIntArray(this.a);
        parcel.writeInt(this.b);
        Integer num = this.c;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeFloat(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
