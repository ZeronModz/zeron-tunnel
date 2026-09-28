package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbqj;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzeak;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfor;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wm2 extends zzbqj {
    public final /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ zzfoe d;
    public final /* synthetic */ zzcen e;
    public final /* synthetic */ zzeak f;

    public wm2(long j, zzcen zzcenVar, zzeak zzeakVar, zzfoe zzfoeVar, Object obj, String str) {
        this.a = obj;
        this.b = str;
        this.c = j;
        this.d = zzfoeVar;
        this.e = zzcenVar;
        Objects.requireNonNull(zzeakVar);
        this.f = zzeakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zze() {
        synchronized (this.a) {
            zzeak zzeakVar = this.f;
            String str = this.b;
            zzeakVar.d(str, (int) (zzt.zzk().elapsedRealtime() - this.c), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, true);
            zzeakVar.l.b(str);
            zzeakVar.o.zzb(str);
            zzfor zzforVar = zzeakVar.p;
            zzfoe zzfoeVar = this.d;
            zzfoeVar.zzd(true);
            zzforVar.b(zzfoeVar.zzm());
            this.e.a(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zzf(String str) {
        synchronized (this.a) {
            zzeak zzeakVar = this.f;
            String str2 = this.b;
            zzeakVar.d(str2, (int) (zzt.zzk().elapsedRealtime() - this.c), str, false);
            zzeakVar.l.c(str2, "error");
            zzeakVar.o.zzc(str2, "error");
            zzfor zzforVar = zzeakVar.p;
            zzfoe zzfoeVar = this.d;
            zzfoeVar.zzk(str);
            zzfoeVar.zzd(false);
            zzforVar.b(zzfoeVar.zzm());
            this.e.a(Boolean.FALSE);
        }
    }
}
