package com.tencent.mmkv;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import defpackage.h2;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ParcelableMMKV implements Parcelable {
    public static final Parcelable.Creator<ParcelableMMKV> CREATOR = new h2(28);
    public final String a;
    public final int b;
    public final int c;
    public final String d;

    public ParcelableMMKV(MMKV mmkv) {
        this.b = -1;
        this.c = -1;
        this.d = null;
        this.a = mmkv.mmapID();
        this.b = mmkv.ashmemFD();
        this.c = mmkv.ashmemMetaFD();
        this.d = mmkv.cryptKey();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeString(this.a);
            ParcelFileDescriptor parcelFileDescriptorFromFd = ParcelFileDescriptor.fromFd(this.b);
            ParcelFileDescriptor parcelFileDescriptorFromFd2 = ParcelFileDescriptor.fromFd(this.c);
            int i2 = i | 1;
            parcelFileDescriptorFromFd.writeToParcel(parcel, i2);
            parcelFileDescriptorFromFd2.writeToParcel(parcel, i2);
            String str = this.d;
            if (str != null) {
                parcel.writeString(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ParcelableMMKV(String str, int i, int i2, String str2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }
}
