package defpackage;

import android.media.AudioDeviceInfo;
import com.google.android.gms.internal.ads.td;
import com.google.android.gms.internal.ads.zzdr;
import com.google.android.gms.internal.ads.zzpx;
import com.google.android.gms.internal.ads.zzrb;
import com.google.android.gms.internal.ads.zzwv;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rj3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rj3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpx zzpxVar;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zzrb zzrbVar = (zzrb) obj2;
                zzrbVar.getClass();
                String str = wt2.a;
                zzrbVar.b.zzy((ze3) obj);
                break;
            case 1:
                zzrb zzrbVar2 = (zzrb) obj2;
                zzrbVar2.getClass();
                String str2 = wt2.a;
                zzrbVar2.b.zzu((Exception) obj);
                break;
            case 2:
                bk3 bk3Var = (bk3) obj2;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                if (bk3Var.c != null && (zzpxVar = bk3Var.d.a.f) != null && !audioDeviceInfo.equals(zzpxVar.h)) {
                    zzpxVar.h = audioDeviceInfo;
                    zzpxVar.a(td.a(zzpxVar.a, zzpxVar.i, audioDeviceInfo));
                }
                break;
            default:
                ((zzdr) obj2).zza((zzwv) obj);
                break;
        }
    }
}
