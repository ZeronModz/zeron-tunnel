package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdnb;
import com.google.android.gms.internal.ads.zzeiu;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jj2 implements zzboh {
    public final /* synthetic */ int a = 2;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ jj2(zzdnb zzdnbVar, mv2 mv2Var, zzv zzvVar, bv2 bv2Var) {
        this.b = new WeakReference(zzdnbVar);
        this.c = mv2Var;
        this.d = zzvVar;
        this.e = bv2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.e;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                zzdnb zzdnbVar = (zzdnb) ((WeakReference) obj5).get();
                String str = (String) map.get("u");
                if (zzdnbVar != null && !TextUtils.isEmpty(str)) {
                    ((mv2) obj3).b(str, (zzv) obj2, (bv2) obj4, zzdnbVar.D);
                    break;
                }
                break;
            case 1:
                Object obj6 = ((WeakReference) obj5).get();
                if (obj6 != null) {
                    ((zzboh) obj2).zza(obj6, map);
                } else {
                    ((yk2) obj4).c((String) obj3, this);
                }
                break;
            default:
                zzcjl zzcjlVar = (zzcjl) obj;
                f62.b(map, (zzdjm) obj5);
                String str2 = (String) map.get("u");
                if (str2 != null) {
                    ve2 ve2Var = (ve2) obj2;
                    ListenableFuture listenableFutureA = f62.a(zzcjlVar, str2);
                    t61 t61Var = new t61(zzcjlVar, ve2Var, (mv2) obj3, (zzeiu) obj4, 15);
                    listenableFutureA.addListener(new s33(0, listenableFutureA, t61Var), g3.a);
                } else {
                    zzo.zzi("URL missing from click GMSG.");
                }
                break;
        }
    }

    public /* synthetic */ jj2(zzdjm zzdjmVar, ve2 ve2Var, mv2 mv2Var, zzeiu zzeiuVar) {
        this.b = zzdjmVar;
        this.d = ve2Var;
        this.c = mv2Var;
        this.e = zzeiuVar;
    }

    public /* synthetic */ jj2(yk2 yk2Var, WeakReference weakReference, String str, zzboh zzbohVar) {
        this.e = yk2Var;
        this.b = weakReference;
        this.c = str;
        this.d = zzbohVar;
    }
}
