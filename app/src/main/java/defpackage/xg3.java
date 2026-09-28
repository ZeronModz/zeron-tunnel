package defpackage;

import com.google.android.gms.measurement.internal.zzmb;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class xg3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzmb b;

    public xg3(zzmb zzmbVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(zzmbVar);
                this.b = zzmbVar;
                break;
            default:
                Objects.requireNonNull(zzmbVar);
                this.b = zzmbVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzmb zzmbVar = this.b;
        switch (i) {
            case 0:
                zzmbVar.e = zzmbVar.j;
                break;
            default:
                zzmbVar.j = null;
                break;
        }
    }
}
