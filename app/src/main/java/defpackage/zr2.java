package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzeuv;
import com.google.android.gms.internal.ads.zzevl;
import com.google.android.gms.internal.ads.zzezj;
import com.google.android.gms.internal.ads.zzfbm;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zr2 implements zzikg {
    public final /* synthetic */ int a;
    public final zzikp b;
    public final zzikp c;
    public final zzikp d;
    public final zzikp e;

    public /* synthetic */ zr2(zzikg zzikgVar, se3 se3Var, se3 se3Var2, se3 se3Var3, int i) {
        this.a = i;
        this.b = zzikgVar;
        this.c = se3Var;
        this.d = se3Var2;
        this.e = se3Var3;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        int i = this.a;
        zzikp zzikpVar = this.e;
        zzikp zzikpVar2 = this.d;
        zzikp zzikpVar3 = this.c;
        zzikp zzikpVar4 = this.b;
        switch (i) {
            case 0:
                pr2 pr2VarZzb = ((qr2) zzikpVar4).zzb();
                zzevl zzevlVar = (zzevl) zzikpVar3.zzb();
                List list = (List) zzikpVar2.zzb();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzikpVar.zzb();
                if (list.contains("10")) {
                    return new zzezj(zzevlVar, ((Integer) zzbd.zzc().a(p32.Dd)).intValue(), scheduledExecutorService);
                }
                return new zzezj(pr2VarZzb, ((Integer) zzbd.zzc().a(p32.Dd)).intValue(), scheduledExecutorService);
            case 1:
                pr2 pr2VarZzb2 = ((tr2) zzikpVar4).zzb();
                zzevl zzevlVar2 = (zzevl) zzikpVar3.zzb();
                List list2 = (List) zzikpVar2.zzb();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) zzikpVar.zzb();
                if (list2.contains("54")) {
                    return new zzezj(zzevlVar2, ((Integer) zzbd.zzc().a(p32.Nd)).intValue(), scheduledExecutorService2);
                }
                return new zzezj(pr2VarZzb2, ((Integer) zzbd.zzc().a(p32.Nd)).intValue(), scheduledExecutorService2);
            case 2:
                zzeuv zzeuvVarZzb = ((ur2) zzikpVar4).zzb();
                zzevl zzevlVar3 = (zzevl) zzikpVar3.zzb();
                List list3 = (List) zzikpVar2.zzb();
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) zzikpVar.zzb();
                if (list3.contains("13")) {
                    return new zzezj(zzevlVar3, ((Integer) zzbd.zzc().a(p32.Md)).intValue(), scheduledExecutorService3);
                }
                return new zzezj(zzeuvVarZzb, ((Integer) zzbd.zzc().a(p32.Md)).intValue(), scheduledExecutorService3);
            case 3:
                pr2 pr2VarZzb3 = ((cs2) zzikpVar4).zzb();
                zzevl zzevlVar4 = (zzevl) zzikpVar3.zzb();
                List list4 = (List) zzikpVar2.zzb();
                ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) zzikpVar.zzb();
                if (list4.contains("60")) {
                    return new zzezj(zzevlVar4, ((Integer) zzbd.zzc().a(p32.ne)).intValue(), scheduledExecutorService4);
                }
                return new zzezj(pr2VarZzb3, ((Integer) zzbd.zzc().a(p32.ne)).intValue(), scheduledExecutorService4);
            case 4:
                gs2 gs2VarZzb = ((os2) zzikpVar4).zzb();
                zzevl zzevlVar5 = (zzevl) zzikpVar3.zzb();
                List list5 = (List) zzikpVar2.zzb();
                ScheduledExecutorService scheduledExecutorService5 = (ScheduledExecutorService) zzikpVar.zzb();
                if (list5.contains("35")) {
                    return new zzezj(zzevlVar5, ((Integer) zzbd.zzc().a(p32.Ad)).intValue(), scheduledExecutorService5);
                }
                return new zzezj(gs2VarZzb, ((Integer) zzbd.zzc().a(p32.Ad)).intValue(), scheduledExecutorService5);
            default:
                zzfbm zzfbmVarZzb = ((ws2) zzikpVar4).zzb();
                zzevl zzevlVar6 = (zzevl) zzikpVar3.zzb();
                List list6 = (List) zzikpVar2.zzb();
                ScheduledExecutorService scheduledExecutorService6 = (ScheduledExecutorService) zzikpVar.zzb();
                if (list6.contains("39")) {
                    return new zzezj(zzevlVar6, ((Integer) zzbd.zzc().a(p32.xd)).intValue(), scheduledExecutorService6);
                }
                return new zzezj(zzfbmVarZzb, ((Integer) zzbd.zzc().a(p32.xd)).intValue(), scheduledExecutorService6);
        }
    }
}
