package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzcwe;
import com.google.android.gms.internal.ads.zzcxa;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdiq;
import com.google.android.gms.internal.ads.zzdmb;
import com.google.android.gms.internal.ads.zzdmc;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzfvr;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xi2 extends jg2 {
    public final Context l;
    public final WeakReference m;
    public final zzdiq n;
    public final zzdmc o;
    public final zzcxa p;
    public final zzfvr q;
    public final zzdbs r;
    public final zzcdz s;
    public final zzdxz t;
    public boolean u;

    public xi2(zzcwe zzcweVar, Context context, zzcjl zzcjlVar, zzdiq zzdiqVar, zzdmc zzdmcVar, zzcxa zzcxaVar, zzfvr zzfvrVar, zzdbs zzdbsVar, zzcdz zzcdzVar, zzdxz zzdxzVar) {
        super(zzcweVar);
        this.u = false;
        this.l = context;
        this.m = new WeakReference(zzcjlVar);
        this.n = zzdiqVar;
        this.o = zzdmcVar;
        this.p = zzcxaVar;
        this.q = zzfvrVar;
        this.r = zzdbsVar;
        this.s = zzcdzVar;
        this.t = zzdxzVar;
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
        tt2 tt2VarZzC;
        int iD;
        Context context = this.l;
        zzdbs zzdbsVar = this.r;
        zzdiq zzdiqVar = this.n;
        zzdiqVar.i(wh2.B);
        zzt.zzc();
        zzdmc zzdmcVar = this.o;
        if (!zzs.zzT(zzdmcVar.mo79zzb())) {
            if (((Boolean) zzbd.zzc().a(p32.bf)).booleanValue()) {
                zzt.zzc();
                zzs.zzS(context, this.b, this.t);
            }
            if (((Boolean) zzbd.zzc().a(p32.i1)).booleanValue()) {
                zzt.zzc();
                if (zzs.zzL(context)) {
                    zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                    zzdbsVar.zze();
                    if (((Boolean) zzbd.zzc().a(p32.j1)).booleanValue()) {
                        this.q.a(this.a.b.b.b);
                        return;
                    }
                    return;
                }
            }
        }
        zzcjl zzcjlVar = (zzcjl) this.m.get();
        if (((Boolean) zzbd.zzc().a(p32.qd)).booleanValue() && zzcjlVar != null && (tt2VarZzC = zzcjlVar.zzC()) != null && tt2VarZzC.r0) {
            int i = tt2VarZzC.s0;
            zzcdz zzcdzVar = this.s;
            synchronized (zzcdzVar.a) {
                iD = zzcdzVar.d.d();
            }
            if (i != iD) {
                zzo.zzi("The interstitial consent form has been shown.");
                zzdbsVar.zzc(xg0.P(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.u) {
            zzo.zzi("The interstitial ad has been shown.");
            zzdbsVar.zzc(xg0.P(10, null, null));
        }
        Context context2 = activity;
        if (this.u) {
            return;
        }
        if (activity == null) {
            context2 = context;
        }
        try {
            zzdmcVar.zza(z, context2, zzdbsVar);
            zzdiqVar.i(wh2.A);
            this.u = true;
        } catch (zzdmb e) {
            zzdbsVar.zzd(e);
        }
    }

    public final void finalize() throws Throwable {
        try {
            zzcjl zzcjlVar = (zzcjl) this.m.get();
            if (((Boolean) zzbd.zzc().a(p32.E7)).booleanValue()) {
                if (!this.u && zzcjlVar != null) {
                    g3.f.execute(new yb2(zzcjlVar, 4));
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
