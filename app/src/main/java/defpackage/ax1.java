package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import com.google.android.gms.ads.nonagon.signalgeneration.zzo;
import com.google.android.gms.ads.nonagon.signalgeneration.zzp;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.q3;
import com.google.android.gms.internal.ads.r5;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzdah;
import com.google.android.gms.internal.ads.zzdxh;
import com.google.android.gms.internal.ads.zzehc;
import com.google.android.gms.internal.ads.zzfae;
import com.google.android.gms.internal.ads.zzfnb;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ax1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ax1(Object obj, int i, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return ((zzau) obj3).zzo((List) obj2, (IObjectWrapper) obj);
            case 1:
                return ((zzau) obj3).zzq((Uri) obj2, (IObjectWrapper) obj);
            case 2:
                q3 q3Var = (q3) obj3;
                Bundle bundle2 = (Bundle) obj;
                zzdah zzdahVar = (zzdah) ((zzfnb) obj2).c.get();
                Bundle bundle3 = zzdahVar.a;
                String str = (String) ((ListenableFuture) q3Var.g.zzb()).get();
                boolean z = false;
                if (((Boolean) zzbd.zzc().a(p32.V7)).booleanValue() && q3Var.j.zzx()) {
                    z = true;
                }
                boolean z2 = z;
                String str2 = q3Var.h;
                PackageInfo packageInfo = q3Var.f;
                ArrayList arrayList = q3Var.e;
                String str3 = q3Var.d;
                ApplicationInfo applicationInfo = q3Var.c;
                return new zzbzu(bundle3, q3Var.b, applicationInfo, str3, arrayList, packageInfo, str, str2, null, null, z2, q3Var.k.g.matches((String) zzbd.zzc().a(p32.a4)), bundle2, zzdahVar.b, q3Var.l);
            case 3:
                zzbzw zzbzwVar = (zzbzw) ((zzfnb) obj3).c.get();
                if (((Boolean) zzbd.zzc().a(p32.K2)).booleanValue() && (bundle = ((zzbzu) obj2).m) != null) {
                    bundle.putLong(zzdxh.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbzwVar.j);
                    bundle.putLong(zzdxh.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbzwVar.k);
                }
                return new zzehc((JSONObject) ((zzfnb) obj).c.get(), zzbzwVar);
            case 4:
                zzfae zzfaeVar = ms2.k;
                JSONArray jSONArray = new JSONArray();
                for (ListenableFuture listenableFuture : (ArrayList) obj3) {
                    if (((JSONObject) listenableFuture.get()) != null) {
                        jSONArray.put(listenableFuture.get());
                    }
                }
                String str4 = (String) obj;
                Bundle bundle4 = (Bundle) obj2;
                if (jSONArray.length() != 0) {
                    return new zzfae(jSONArray.toString(), bundle4, str4);
                }
                if (((Boolean) zzbd.zzc().a(p32.c5)).booleanValue()) {
                    return new zzfae(new JSONArray().toString(), bundle4, str4);
                }
                return null;
            case 5:
                ((e03) obj3).a.a((r5) obj2, null, (byte[]) obj);
                return null;
            default:
                return ((zzo) obj3).zzg((AdRequest) obj2, (zzp) obj);
        }
    }
}
