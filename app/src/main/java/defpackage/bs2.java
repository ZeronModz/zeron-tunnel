package defpackage;

import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzezb;
import com.google.android.gms.internal.ads.zzfck;
import com.google.android.gms.internal.ads.zzfer;
import com.google.android.gms.internal.ads.zzfgn;
import com.google.android.gms.internal.ads.zzfhv;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfkv;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bs2 implements zzikg {
    public final /* synthetic */ int a;
    public final zzikp b;

    public /* synthetic */ bs2(zzikp zzikpVar, int i) {
        this.a = i;
        this.b = zzikpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        zzikp zzikpVar = this.b;
        switch (i) {
            case 0:
                ta2 ta2Var = g3.a;
                k02.J(ta2Var);
                return new nr2(ta2Var, ((sc2) zzikpVar).a(), 2);
            case 1:
                ta2 ta2Var2 = g3.a;
                k02.J(ta2Var2);
                return new pr2(4, ta2Var2, (gn2) zzikpVar.zzb());
            case 2:
                return new er2((zzfiq) zzikpVar.zzb(), 5);
            case 3:
                ta2 ta2Var3 = g3.a;
                k02.J(ta2Var3);
                return new zzezb(ta2Var3, ((sc2) zzikpVar).a());
            case 4:
                ta2 ta2Var4 = g3.a;
                k02.J(ta2Var4);
                return new pr2(5, ta2Var4, (jm2) zzikpVar.zzb());
            case 5:
                return new qs2((zzfgn) zzikpVar.zzb());
            case 6:
                ta2 ta2Var5 = g3.a;
                k02.J(ta2Var5);
                return new nr2(ta2Var5, ((sc2) zzikpVar).a(), 3);
            case 7:
                zzbfs zzbfsVar = new zzbfs();
                ta2 ta2Var6 = g3.a;
                k02.J(ta2Var6);
                return new zzfck(zzbfsVar, ta2Var6, ((sc2) zzikpVar).a());
            case 8:
                return new zzfer((zzfkv) zzikpVar.zzb());
            case 9:
                return new zzfhv((zzfkv) zzikpVar.zzb());
            case 10:
                return new bv2((zzfor) zzikpVar.zzb());
            case 11:
                return new bv2((zzfor) zzikpVar.zzb());
            case 12:
                return new File(new File((File) zzikpVar.zzb(), "drgd"), "pmtd.d");
            case 13:
                return new File(new File((File) zzikpVar.zzb(), "drgd"), "pcbc.d");
            case 14:
                return new File(new File((File) zzikpVar.zzb(), "drgd"), "pcam.jar.d");
            case 15:
                return new File(new File((File) zzikpVar.zzb(), "drgd"), "pmtd");
            case 16:
                return new File(new File(new File((File) zzikpVar.zzb(), "drgd"), "v"), "pcopt");
            case 17:
                return new File(new File((File) zzikpVar.zzb(), "drgd"), "pcbc");
            case 18:
                return new File(new File((File) zzikpVar.zzb(), "drgd"), "pcam.jar.tmp");
            case 19:
                return new File(new File(new File((File) zzikpVar.zzb(), "drgd"), "v"), "pcam.jar");
            case 20:
                return new File(new File((File) zzikpVar.zzb(), "ocs"), "pmtd");
            case 21:
                return new File(new File((File) zzikpVar.zzb(), "ocs"), "pcbc");
            default:
                return new File(new File((File) zzikpVar.zzb(), "ocs"), "pcam.jar");
        }
    }
}
