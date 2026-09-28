package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzbyh;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w82 extends d12 implements zzbyh {
    public static zzbyh a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterfaceQueryLocalInterface instanceof zzbyh ? (zzbyh) iInterfaceQueryLocalInterface : new v82(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }
}
