package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.view.InputEvent;
import android.view.View;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzcbz;
import com.google.android.gms.internal.ads.zzcce;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzcka;
import com.google.android.gms.internal.ads.zzckb;
import com.google.android.gms.internal.ads.zzdrp;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzekg;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfkz;
import com.google.android.gms.internal.ads.zzfli;
import com.google.android.gms.internal.ads.zzflr;
import com.google.android.gms.internal.ads.zzfls;
import com.google.android.gms.internal.ads.zzflt;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzgdv;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ue2 implements zzgyw {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ue2(zzdrp zzdrpVar, String str, zzcbz zzcbzVar, zzb zzbVar) {
        this.a = 2;
        this.b = zzdrpVar;
        this.d = str;
        this.c = zzcbzVar;
        this.e = zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final ListenableFuture zza(Object obj) throws zzcka {
        ListenableFuture listenableFutureV;
        u33 u33VarJ;
        switch (this.a) {
            case 0:
                ve2 ve2Var = (ve2) this.b;
                Uri.Builder builder = (Uri.Builder) this.c;
                String str = (String) this.d;
                InputEvent inputEvent = (InputEvent) this.e;
                if (((Integer) obj).intValue() != 1) {
                    builder.appendQueryParameter((String) zzbd.zzc().a(p32.Hb), "10");
                    return z.j(builder.toString());
                }
                Uri.Builder builderBuildUpon = builder.build().buildUpon();
                builderBuildUpon.appendQueryParameter((String) zzbd.zzc().a(p32.Ib), "1");
                builderBuildUpon.appendQueryParameter((String) zzbd.zzc().a(p32.Hb), "12");
                if (str.contains((CharSequence) zzbd.zzc().a(p32.Jb))) {
                    builderBuildUpon.authority((String) zzbd.zzc().a(p32.Kb));
                }
                hp2 hp2Var = ve2Var.c;
                Uri uriBuild = builderBuildUpon.build();
                hp2Var.getClass();
                try {
                    MeasurementManagerFutures measurementManagerFutures = hp2Var.a;
                    Objects.requireNonNull(measurementManagerFutures);
                    listenableFutureV = measurementManagerFutures.c(uriBuild, inputEvent);
                    break;
                } catch (Exception e) {
                    listenableFutureV = z.v(e);
                }
                return z.Z(q33.q(listenableFutureV), new t62(builder, 2), ve2Var.f);
            case 1:
                return zzf.zzd((Long) this.b, (zzdxz) this.c, (zzfoe) this.d, (zzfor) this.e, (JSONObject) obj);
            case 2:
                zzdrp zzdrpVar = (zzdrp) this.b;
                String str2 = (String) this.d;
                zzcce zzcceVar = (zzcce) this.c;
                zzb zzbVar = (zzb) this.e;
                zzt.zzd();
                zzcjl zzcjlVarA = zzckb.a(zzdrpVar.a, new jc2(0, 0, 0), "native-omid", false, false, zzdrpVar.c, null, zzdrpVar.d, null, zzdrpVar.e, zzdrpVar.f, null, null, zzdrpVar.p, zzdrpVar.q, zzdrpVar.m);
                w12 w12Var = new w12(zzcjlVarA);
                zzcjlVarA.zzP().zzG(new ca2(w12Var, 14));
                zzcjlVarA.loadData(Base64.encodeToString(str2.getBytes(), 1), "text/html", "base64");
                if (((Boolean) zzbd.zzc().a(p32.ff)).booleanValue()) {
                    if (zzcceVar != null) {
                        zzcjlVarA.zzP().zzj(zzcceVar);
                    }
                    zzcjlVarA.zzP().zzi(zzbVar);
                }
                return w12Var;
            case 3:
                hq2 hq2Var = (hq2) this.b;
                tt2 tt2Var = (tt2) this.c;
                zzfjc zzfjcVar = (zzfjc) this.d;
                zzekg zzekgVar = (zzekg) this.e;
                zzfoe zzfoeVarX = ec1.X(hq2Var.j, 12);
                zzfoeVarX.zzi(tt2Var.E);
                zzfoeVarX.zza();
                ListenableFuture listenableFutureT = z.T(zzekgVar.zzb(zzfjcVar, tt2Var), tt2Var.R, TimeUnit.MILLISECONDS, hq2Var.f);
                hq2Var.h.d(zzfjcVar, tt2Var, listenableFutureT, hq2Var.c);
                yg0.e0(listenableFutureT, hq2Var.k, zzfoeVarX, false);
                return listenableFutureT;
            case 4:
                zzfmb zzfmbVar = (zzfmb) this.b;
                zzfls zzflsVar = (zzfls) this.c;
                zzfkz zzfkzVar = (zzfkz) this.d;
                zzflt zzfltVar = (zzflt) this.e;
                zzfli zzfliVar = (zzfli) obj;
                synchronized (zzfmbVar) {
                    try {
                        zzfmbVar.d = true;
                        zzflsVar.zzb(zzfliVar);
                        if (zzfmbVar.c) {
                            u33VarJ = z.j(new zzflr(zzfliVar, zzfltVar));
                        } else {
                            zzfkzVar.zzb(zzfltVar.zzb(), zzfliVar);
                            u33VarJ = u33.b;
                        }
                    } finally {
                    }
                }
                return u33VarJ;
            case 5:
                return ((zzgdv) ((rx2) this.b).b.f.get()).zzd((Context) this.c, null, (View) this.d, (Activity) this.e);
            default:
                return ((zzgdv) ((rx2) this.b).b.f.get()).zze((Context) this.c, (String) this.d, (View) this.e, null);
        }
    }

    public /* synthetic */ ue2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
