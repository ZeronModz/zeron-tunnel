package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.ads.zzcbq;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzcwe;
import com.google.android.gms.internal.ads.zzcxa;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdiq;
import com.google.android.gms.internal.ads.zzdmb;
import com.google.android.gms.internal.ads.zzdmc;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzfje;
import com.google.android.gms.internal.ads.zzfvr;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dl2 extends jg2 {
    public final Context l;
    public final WeakReference m;
    public final zzdmc n;
    public final zzdiq o;
    public final zzdbs p;
    public final yh2 q;
    public final zzcxa r;
    public final zzcbq s;
    public final zzfvr t;
    public final zzfje u;
    public final zzdxz v;
    public boolean w;

    public dl2(zzcwe zzcweVar, Context context, zzcjl zzcjlVar, zzdmc zzdmcVar, zzdiq zzdiqVar, zzdbs zzdbsVar, yh2 yh2Var, zzcxa zzcxaVar, tt2 tt2Var, zzfvr zzfvrVar, zzfje zzfjeVar, zzdxz zzdxzVar) {
        super(zzcweVar);
        this.w = false;
        this.l = context;
        this.n = zzdmcVar;
        this.m = new WeakReference(zzcjlVar);
        this.o = zzdiqVar;
        this.p = zzdbsVar;
        this.q = yh2Var;
        this.r = zzcxaVar;
        this.t = zzfvrVar;
        zzcas zzcasVar = tt2Var.l;
        this.s = new zzcbq(zzcasVar != null ? zzcasVar.a : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzcasVar != null ? zzcasVar.b : 1);
        this.u = zzfjeVar;
        this.v = zzdxzVar;
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
        zzt.zzc();
        zzdmc zzdmcVar = this.n;
        boolean zZzT = zzs.zzT(zzdmcVar.mo79zzb());
        Context context = this.l;
        zzdbs zzdbsVar = this.p;
        if (!zZzT) {
            if (((Boolean) zzbd.zzc().a(p32.bf)).booleanValue()) {
                zzt.zzc();
                zzs.zzS(context, this.b, this.v);
            }
            if (((Boolean) zzbd.zzc().a(p32.i1)).booleanValue()) {
                zzt.zzc();
                if (zzs.zzL(context)) {
                    zzo.zzi("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    zzdbsVar.zze();
                    if (((Boolean) zzbd.zzc().a(p32.j1)).booleanValue()) {
                        this.t.a(this.a.b.b.b);
                        return;
                    }
                    return;
                }
            }
        }
        if (this.w) {
            zzo.zzi("The rewarded ad have been showed.");
            zzdbsVar.zzc(xg0.P(10, null, null));
            return;
        }
        this.w = true;
        wh2 wh2Var = wh2.B;
        zzdiq zzdiqVar = this.o;
        zzdiqVar.i(wh2Var);
        Context context2 = activity;
        if (activity == null) {
            context2 = context;
        }
        try {
            zzdmcVar.zza(z, context2, zzdbsVar);
            zzdiqVar.i(wh2.A);
        } catch (zzdmb e) {
            zzdbsVar.zzd(e);
        }
    }

    public final void finalize() throws Throwable {
        try {
            zzcjl zzcjlVar = (zzcjl) this.m.get();
            if (((Boolean) zzbd.zzc().a(p32.E7)).booleanValue()) {
                if (!this.w && zzcjlVar != null) {
                    g3.f.execute(new yb2(zzcjlVar, 6));
                }
            } else if (zzcjlVar != null) {
                zzcjlVar.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}
