package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzcwe;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdce;
import com.google.android.gms.internal.ads.zzdiq;
import com.google.android.gms.internal.ads.zzdmb;
import com.google.android.gms.internal.ads.zzdmc;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfvr;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pf2 extends jg2 {
    public final zzcjl l;
    public final int m;
    public final Context n;
    public final i31 o;
    public final zzdmc p;
    public final zzdiq q;
    public final zzdbs r;
    public final boolean s;
    public final zzcdz t;
    public final zzdxz u;
    public boolean v;

    public pf2(zzcwe zzcweVar, Context context, zzcjl zzcjlVar, int i, i31 i31Var, zzdmc zzdmcVar, zzdiq zzdiqVar, zzdbs zzdbsVar, zzcdz zzcdzVar, zzdxz zzdxzVar) {
        super(zzcweVar);
        this.v = false;
        this.l = zzcjlVar;
        this.n = context;
        this.m = i;
        this.o = i31Var;
        this.p = zzdmcVar;
        this.q = zzdiqVar;
        this.r = zzdbsVar;
        this.s = ((Boolean) zzbd.zzc().a(p32.u6)).booleanValue();
        this.t = zzcdzVar;
        this.u = zzdxzVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c(Activity activity, boolean z) {
        zzcjl zzcjlVar;
        tt2 tt2VarZzC;
        int iD;
        zzdiq zzdiqVar = this.q;
        zzdbs zzdbsVar = this.r;
        Context context = activity;
        if (activity == null) {
            context = this.n;
        }
        boolean z2 = this.s;
        if (z2) {
            zzdiqVar.i(wh2.B);
        }
        zzt.zzc();
        zzdmc zzdmcVar = this.p;
        if (!zzs.zzT(zzdmcVar.mo79zzb())) {
            if (((Boolean) zzbd.zzc().a(p32.bf)).booleanValue()) {
                zzt.zzc();
                zzs.zzS(context, this.b, this.u);
            }
            if (((Boolean) zzbd.zzc().a(p32.i1)).booleanValue()) {
                zzt.zzc();
                if (zzs.zzL(context)) {
                    zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    zzdbsVar.zze();
                    if (((Boolean) zzbd.zzc().a(p32.j1)).booleanValue()) {
                        new zzfvr(context.getApplicationContext(), zzt.zzs().zza()).a(this.a.b.b.b);
                        return;
                    }
                    return;
                }
            }
        }
        if (((Boolean) zzbd.zzc().a(p32.qd)).booleanValue() && (zzcjlVar = this.l) != null && (tt2VarZzC = zzcjlVar.zzC()) != null && tt2VarZzC.r0) {
            int i = tt2VarZzC.s0;
            zzcdz zzcdzVar = this.t;
            synchronized (zzcdzVar.a) {
                iD = zzcdzVar.d.d();
            }
            if (i != iD) {
                zzo.zzi("The app open consent form has been shown.");
                zzdbsVar.zzc(xg0.P(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.v) {
            zzo.zzi("App open interstitial ad is already visible.");
            zzdbsVar.zzc(xg0.P(10, null, null));
        }
        if (this.v) {
            return;
        }
        try {
            zzdmcVar.zza(z, context, zzdbsVar);
            if (z2) {
                zzdiqVar.i(wh2.A);
            }
            this.v = true;
        } catch (zzdmb e) {
            zzdbsVar.zzd(e);
        }
    }

    public final void d() {
        zzdce zzdceVar = this.c;
        zzdceVar.getClass();
        zzdceVar.i(new f10(null, 2));
        zzcjl zzcjlVar = this.l;
        if (zzcjlVar != null) {
            zzcjlVar.destroy();
        }
    }

    public final void e(int i, long j) {
        i31 i31Var = this.o;
        i31 i31VarA = ((zzdxz) i31Var.b).a();
        i31VarA.c("gqi", ((zzfjc) i31Var.c).b.b.b);
        i31VarA.c("action", "ad_closed");
        i31VarA.c("show_time", String.valueOf(j));
        i31VarA.c("ad_format", "app_open_ad");
        int i2 = i - 1;
        i31VarA.c("acr", i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        i31VarA.d();
    }
}
