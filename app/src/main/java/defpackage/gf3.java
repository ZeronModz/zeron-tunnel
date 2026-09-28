package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.measurement.zzjh;
import com.google.android.gms.internal.measurement.zzjl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class gf3 {
    public static final zzjh a;

    static {
        zzjl zzjlVar;
        Uri uri = hf3.a;
        synchronized (if3.class) {
            try {
                if (if3.a == null) {
                    if3.V(new zzjl());
                }
                zzjlVar = if3.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        a = zzjlVar;
    }
}
