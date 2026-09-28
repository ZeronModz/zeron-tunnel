package defpackage;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzbsl;
import com.google.android.gms.internal.ads.zzcep;
import com.google.android.gms.internal.ads.zzcer;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class d72 implements zzcer, zzcep {
    public final /* synthetic */ zzbsk a;
    public final /* synthetic */ zzfoe b;
    public final /* synthetic */ zzbsl c;

    public /* synthetic */ d72(zzbsl zzbslVar, zzbsk zzbskVar, zzfoe zzfoeVar) {
        this.a = zzbskVar;
        this.b = zzfoeVar;
        this.c = zzbslVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcer, com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo3zza(Object obj) {
        zzfor zzforVar;
        zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        zzbsl zzbslVar = this.c;
        synchronized (zzbslVar.a) {
            try {
                zze.zza("loadNewJavascriptEngine (success): Lock acquired");
                zzbslVar.i = 0;
                zzbsk zzbskVar = zzbslVar.h;
                if (zzbskVar != null && this.a != zzbskVar) {
                    zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    zzbslVar.h.f();
                }
                zzbslVar.h = this.a;
                if (((Boolean) d42.d.g()).booleanValue() && (zzforVar = zzbslVar.e) != null) {
                    zzfoe zzfoeVar = this.b;
                    zzfoeVar.zzd(true);
                    zzforVar.b(zzfoeVar.zzm());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze.zza("loadNewJavascriptEngine (success): Lock released");
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    /* JADX INFO: renamed from: zza */
    public void mo21zza() {
        zzfor zzforVar;
        zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        zzbsl zzbslVar = this.c;
        synchronized (zzbslVar.a) {
            try {
                zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
                zzbslVar.i = 1;
                zze.zza("Failed loading new engine. Marking new engine destroyable.");
                this.a.f();
                if (((Boolean) d42.d.g()).booleanValue() && (zzforVar = zzbslVar.e) != null) {
                    zzfoe zzfoeVar = this.b;
                    zzfoeVar.zzk("Failed loading new engine");
                    zzfoeVar.zzd(false);
                    zzforVar.b(zzfoeVar.zzm());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}
