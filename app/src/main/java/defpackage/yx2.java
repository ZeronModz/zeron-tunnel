package defpackage;

import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzge;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class yx2 extends cs1 implements zzge {
    @Override // com.google.android.gms.measurement.internal.zzge
    public final void zze(List list) {
        Parcel parcelE = e();
        parcelE.writeTypedList(list);
        g(parcelE);
    }
}
