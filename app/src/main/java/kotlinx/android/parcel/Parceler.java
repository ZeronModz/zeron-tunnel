package kotlinx.android.parcel;

import android.os.Parcel;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J#\u0010\b\u001a\u00020\u0007*\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlinx/android/parcel/Parceler;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Landroid/os/Parcel;", "parcel", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "flags", "Lmk1;", "write", "(Ljava/lang/Object;Landroid/os/Parcel;I)V", "create", "(Landroid/os/Parcel;)Ljava/lang/Object;", "size", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "newArray", "(I)[Ljava/lang/Object;", "kotlin-android-extensions-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Parceler<T> {
    T create(Parcel parcel);

    T[] newArray(int size);

    void write(T t, Parcel parcel, int i);
}
