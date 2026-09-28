package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import defpackage.h2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class Entry extends BaseEntry implements Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = new h2(10);
    public float d;

    public Entry() {
        this.d = 0.0f;
    }

    public float b() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Entry, x: " + this.d + " y: " + a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.d);
        parcel.writeFloat(a());
        Object obj = this.b;
        if (obj == null) {
            parcel.writeInt(0);
        } else {
            if (!(obj instanceof Parcelable)) {
                throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
            }
            parcel.writeInt(1);
            parcel.writeParcelable((Parcelable) this.b, i);
        }
    }

    public Entry(float f, float f2) {
        super(f2);
        this.d = f;
    }

    public Entry(float f, float f2, Object obj) {
        super(f2, obj);
        this.d = f;
    }

    public Entry(float f, float f2, Drawable drawable) {
        super(f2, drawable);
        this.d = f;
    }

    public Entry(float f, float f2, Drawable drawable, Object obj) {
        super(f2, drawable, obj);
        this.d = f;
    }
}
