package defpackage;

import com.google.android.gms.internal.ads.zzaip;
import com.google.android.gms.internal.ads.zzgrd;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rw1 implements zzgrd {
    public static final /* synthetic */ rw1 b = new rw1(0);
    public static final /* synthetic */ rw1 c = new rw1(1);
    public static final /* synthetic */ rw1 d = new rw1(2);
    public final /* synthetic */ int a;

    public /* synthetic */ rw1(int i) {
        this.a = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgrd
    public final /* synthetic */ boolean zza(Object obj) {
        switch (this.a) {
            case 0:
                zzaip zzaipVar = (zzaip) obj;
                if (zzaipVar.b.equals("com.apple.iTunes") && zzaipVar.c.equals("iTunSMPB")) {
                    break;
                }
                break;
            case 1:
                if (((Map.Entry) obj).getKey() != null) {
                }
                break;
            default:
                if (((String) obj) != null) {
                }
                break;
        }
        return true;
    }
}
