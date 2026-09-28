package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzcce;
import com.google.android.gms.internal.ads.zzchr;
import com.google.android.gms.internal.ads.zzcjw;
import com.google.android.gms.internal.ads.zzgoj;
import com.google.android.gms.internal.ads.zzgpt;
import com.google.android.gms.internal.ads.zzgpv;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zznt;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class kb2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kb2(zzcjw zzcjwVar, View view, zzcce zzcceVar, int i) {
        this.c = zzcjwVar;
        this.d = view;
        this.e = zzcceVar;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                HashMap map = new HashMap();
                map.put("event", "precacheComplete");
                map.put("src", (String) obj3);
                map.put("cachedSrc", (String) obj2);
                map.put("totalBytes", Integer.toString(i2));
                ((zzchr) obj).j(map);
                return;
            case 1:
                ((zzcjw) obj3).f((View) obj2, (zzcce) obj, i2 - 1);
                return;
            case 2:
                e13 e13Var = (e13) obj3;
                zzgpv zzgpvVar = (zzgpv) obj2;
                zzgpt zzgptVar = (zzgpt) obj;
                String str = e13Var.b;
                try {
                    lp2 lp2Var = e13Var.a;
                    if (lp2Var == null) {
                        throw null;
                    }
                    zzgoj zzgojVar = (zzgoj) lp2Var.i;
                    if (zzgojVar == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    bundle.putInt("displayMode", i2);
                    String strA = zzgpvVar.a();
                    if (!e13.b(strA)) {
                        strA.getClass();
                        bundle.putString("sessionToken", strA.trim());
                    }
                    String strB = zzgpvVar.b();
                    if (!e13.b(strB)) {
                        strB.getClass();
                        bundle.putString("appId", strB.trim());
                    }
                    zzgojVar.zzg(bundle, new d13(e13Var, zzgptVar));
                    return;
                } catch (RemoteException e) {
                    e13.c.d(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i2), str);
                    return;
                }
            default:
                m mVar = (m) obj2;
                Intent intent = (Intent) obj;
                Context context = ((zznt) obj3).a;
                zznp zznpVar = (zznp) context;
                if (zznpVar.zza(i2)) {
                    mVar.n.b(Integer.valueOf(i2), "Local AppMeasurementService processed last upload request. StartId");
                    m mVar2 = r.m(context, null, null).f;
                    r.h(mVar2);
                    mVar2.n.a("Completed wakeful intent.");
                    zznpVar.zzc(intent);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ kb2(zznt zzntVar, int i, m mVar, Intent intent) {
        this.c = zzntVar;
        this.b = i;
        this.d = mVar;
        this.e = intent;
    }

    public /* synthetic */ kb2(e13 e13Var, zzgpv zzgpvVar, int i, zzgpt zzgptVar) {
        this.c = e13Var;
        this.d = zzgpvVar;
        this.b = i;
        this.e = zzgptVar;
    }

    public kb2(zzchr zzchrVar, String str, String str2, int i) {
        this.c = str;
        this.d = str2;
        this.b = i;
        this.e = zzchrVar;
    }
}
