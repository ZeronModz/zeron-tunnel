package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzfjn;
import com.google.android.gms.internal.ads.zzgui;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fp2 {
    public final Context a;
    public final VersionInfoParcel b;
    public final tt2 c;
    public final zzcjl d;
    public final zzdxz e;
    public aw2 f;

    public fp2(Context context, VersionInfoParcel versionInfoParcel, tt2 tt2Var, zzcjl zzcjlVar, zzdxz zzdxzVar) {
        this.a = context;
        this.b = versionInfoParcel;
        this.c = tt2Var;
        this.d = zzcjlVar;
        this.e = zzdxzVar;
    }

    public final synchronized boolean a() {
        zzcjl zzcjlVar;
        tt2 tt2Var = this.c;
        if (tt2Var.T) {
            if (((Boolean) zzbd.zzc().a(p32.j6)).booleanValue()) {
                if (((Boolean) zzbd.zzc().a(p32.m6)).booleanValue() && (zzcjlVar = this.d) != null) {
                    if (this.f != null) {
                        zzo.zzi("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!zzt.zzu().zza(this.a)) {
                        zzo.zzi("Unable to initialize omid.");
                        return false;
                    }
                    zzfjn zzfjnVar = tt2Var.V;
                    zzfjnVar.getClass();
                    if (zzfjnVar.a.optBoolean((String) zzbd.zzc().a(p32.o6), true)) {
                        aw2 aw2VarZzi = zzt.zzu().zzi(this.b, zzcjlVar.zzD(), true);
                        if (((Boolean) zzbd.zzc().a(p32.n6)).booleanValue()) {
                            zzdxz zzdxzVar = this.e;
                            String str = aw2VarZzi != null ? "1" : "0";
                            i31 i31VarA = zzdxzVar.a();
                            i31VarA.c("omid_js_session_success", str);
                            i31VarA.d();
                        }
                        if (aw2VarZzi == null) {
                            zzo.zzi("Unable to create javascript session service.");
                            return false;
                        }
                        zzo.zzh("Created omid javascript session service.");
                        this.f = aw2VarZzi;
                        zzcjlVar.zzal(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void b() {
        zzcjl zzcjlVar;
        try {
            aw2 aw2Var = this.f;
            if (aw2Var == null || (zzcjlVar = this.d) == null) {
                return;
            }
            Iterator it = zzcjlVar.zzF().iterator();
            while (it.hasNext()) {
                zzt.zzu().zzk(aw2Var, (View) it.next());
            }
            zzcjlVar.zze("onSdkLoaded", zzgui.zza());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        zzcjl zzcjlVar;
        if (this.f == null || (zzcjlVar = this.d) == null) {
            return;
        }
        zzcjlVar.zze("onSdkImpression", zzgui.zza());
    }
}
