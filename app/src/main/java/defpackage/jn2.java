package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzbov;
import com.google.android.gms.internal.ads.zzbpb;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzcdu;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzcka;
import com.google.android.gms.internal.ads.zzckb;
import com.google.android.gms.internal.ads.zzclh;
import com.google.android.gms.internal.ads.zzclj;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jn2 implements zzr, zzclh {
    public final Context a;
    public final VersionInfoParcel b;
    public gn2 c;
    public zzcjl d;
    public boolean e;
    public boolean f;
    public long g;
    public zzdn h;
    public boolean i;

    public jn2(Context context, VersionInfoParcel versionInfoParcel) {
        this.a = context;
        this.b = versionInfoParcel;
    }

    public final synchronized void a(zzdn zzdnVar, zzbpc zzbpcVar, zzbov zzbovVar, zzboi zzboiVar) {
        if (c(zzdnVar)) {
            try {
                zzt.zzd();
                zzcjl zzcjlVarA = zzckb.a(this.a, new jc2(0, 0, 0), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false, false, null, null, this.b, null, null, new zzbgd(), null, null, null, null, null);
                this.d = zzcjlVarA;
                zzclj zzcljVarZzP = zzcjlVarA.zzP();
                if (zzcljVarZzP == null) {
                    zzo.zzi("Failed to obtain a web view for the ad inspector");
                    try {
                        zzt.zzh().f("InspectorUi.openInspector 2", new NullPointerException("Failed to obtain a web view for the ad inspector"));
                        zzdnVar.zze(xg0.P(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e) {
                        zzt.zzh().f("InspectorUi.openInspector 3", e);
                        return;
                    }
                }
                this.h = zzdnVar;
                Context context = this.a;
                zzcljVarZzP.zzab(null, null, null, null, null, false, null, null, null, null, null, null, null, zzbpcVar, null, new zzbpb(context), zzbovVar, zzboiVar, null, null, null, null);
                zzcljVarZzP.zzG(this);
                this.d.loadUrl((String) zzbd.zzc().a(p32.ra));
                zzt.zzb();
                zzn.zza(context, new AdOverlayInfoParcel(this, this.d, 1, this.b), true, null);
                this.g = zzt.zzk().currentTimeMillis();
            } catch (zzcka e2) {
                zzo.zzj("Failed to obtain a web view for the ad inspector", e2);
                try {
                    zzt.zzh().f("InspectorUi.openInspector 0", e2);
                    zzdnVar.zze(xg0.P(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e3) {
                    zzt.zzh().f("InspectorUi.openInspector 1", e3);
                }
            }
        }
    }

    public final synchronized void b() {
        if (this.e && this.f) {
            g3.f.execute(new kc2(this, 13));
        }
    }

    public final synchronized boolean c(zzdn zzdnVar) {
        if (!((Boolean) zzbd.zzc().a(p32.qa)).booleanValue()) {
            zzo.zzi("Ad inspector had an internal error.");
            try {
                zzdnVar.zze(xg0.P(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.c == null) {
            zzo.zzi("Ad inspector had an internal error.");
            try {
                zzt.zzh().f("InspectorUi.shouldOpenUi", new NullPointerException("InspectorManager null"));
                zzdnVar.zze(xg0.P(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.e && !this.f) {
            if (zzt.zzk().currentTimeMillis() >= this.g + ((long) ((Integer) zzbd.zzc().a(p32.ta)).intValue())) {
                return true;
            }
        }
        zzo.zzi("Ad inspector cannot be opened because it is already open.");
        try {
            zzdnVar.zze(xg0.P(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzclh
    public final synchronized void zza(boolean z, int i, String str, String str2) {
        if (z) {
            zze.zza("Ad inspector loaded.");
            this.e = true;
            b();
            return;
        }
        zzo.zzi("Ad inspector failed to load.");
        try {
            zzcdu zzcduVarZzh = zzt.zzh();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb.append("Failed to load UI. Error code: ");
            sb.append(i);
            sb.append(", Description: ");
            sb.append(str);
            sb.append(", Failing URL: ");
            sb.append(str2);
            zzcduVarZzh.f("InspectorUi.onAdWebViewFinishedLoading 0", new Exception(sb.toString()));
            zzdn zzdnVar = this.h;
            if (zzdnVar != null) {
                zzdnVar.zze(xg0.P(17, null, null));
            }
        } catch (RemoteException e) {
            zzt.zzh().f("InspectorUi.onAdWebViewFinishedLoading 1", e);
        }
        this.i = true;
        this.d.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdT(int i) {
        this.d.destroy();
        if (!this.i) {
            zze.zza("Inspector closed.");
            zzdn zzdnVar = this.h;
            if (zzdnVar != null) {
                try {
                    zzdnVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f = false;
        this.e = false;
        this.g = 0L;
        this.i = false;
        this.h = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzh() {
        this.f = true;
        b();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdS() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }
}
