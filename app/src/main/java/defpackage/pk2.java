package defpackage;

import android.graphics.Rect;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzcjl;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pk2 implements zzbde {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcjl b;

    public /* synthetic */ pk2(zzcjl zzcjlVar, int i) {
        this.a = i;
        this.b = zzcjlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final /* synthetic */ void zzdj(zzbdd zzbddVar) {
        int i = this.a;
        zzcjl zzcjlVar = this.b;
        switch (i) {
            case 0:
                HashMap map = new HashMap();
                map.put("isVisible", true != zzbddVar.j ? "0" : "1");
                zzcjlVar.zze("onAdVisibilityChanged", map);
                break;
            case 1:
                Rect rect = zzbddVar.d;
                zzcjlVar.zzP().zza(rect.left, rect.top, false);
                break;
            default:
                Rect rect2 = zzbddVar.d;
                zzcjlVar.zzP().zza(rect2.left, rect2.top, false);
                break;
        }
    }
}
