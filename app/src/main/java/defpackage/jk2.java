package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzcq;
import com.google.android.gms.internal.measurement.zzcr;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class jk2 extends sq2 {
    public final /* synthetic */ int e = 3;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk2(r50 r50Var, Activity activity, zzco zzcoVar) {
        super((ss2) r50Var.b, true);
        this.g = activity;
        this.h = zzcoVar;
        this.f = r50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.sq2
    public final void a() throws RemoteException {
        Boolean boolValueOf;
        Bundle bundle = null;
        zzcr zzcrVarAsInterface = null;
        switch (this.e) {
            case 0:
                try {
                    Context context = (Context) this.g;
                    yg0.m(context);
                    String strK = mc2.K(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strK)) {
                        strK = mc2.K(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strK);
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                            boolValueOf = null;
                        }
                    }
                    ss2 ss2Var = (ss2) this.f;
                    try {
                        zzcrVarAsInterface = zzcq.asInterface(a.c(context, (boolValueOf == null || !boolValueOf.booleanValue()) != false ? a.d : a.c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (DynamiteModule$LoadingException e) {
                        ss2Var.d(e, true, false);
                    }
                    ss2Var.f = zzcrVarAsInterface;
                    if (ss2Var.f != null) {
                        int iA = a.a(context, ModuleDescriptor.MODULE_ID);
                        zzdd zzddVar = new zzdd(133005L, Math.max(iA, r2), Boolean.TRUE.equals(boolValueOf) || a.d(context, ModuleDescriptor.MODULE_ID, false) < iA, (Bundle) this.h, mc2.K(context));
                        zzcr zzcrVar = ss2Var.f;
                        yg0.m(zzcrVar);
                        zzcrVar.initialize(new com.google.android.gms.dynamic.a(context), zzddVar, this.a);
                    }
                } catch (Exception e2) {
                    ((ss2) this.f).d(e2, true, false);
                    return;
                }
                break;
            case 1:
                zzcr zzcrVar2 = ((ss2) this.f).f;
                yg0.m(zzcrVar2);
                zzcrVar2.getMaxUserProperties((String) this.g, (zzco) this.h);
                break;
            case 2:
                Bundle bundle2 = (Bundle) this.h;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                }
                zzcr zzcrVar3 = ((ss2) ((r50) this.f).b).f;
                yg0.m(zzcrVar3);
                zzcrVar3.onActivityCreatedByScionActivityInfo(zzdf.a((Activity) this.g), bundle, this.b);
                break;
            default:
                zzcr zzcrVar4 = ((ss2) ((r50) this.f).b).f;
                yg0.m(zzcrVar4);
                zzcrVar4.onActivitySaveInstanceStateByScionActivityInfo(zzdf.a((Activity) this.g), (zzco) this.h, this.b);
                break;
        }
    }

    @Override // defpackage.sq2
    public void b() {
        switch (this.e) {
            case 1:
                ((zzco) this.h).zzb(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk2(r50 r50Var, Bundle bundle, Activity activity) {
        super((ss2) r50Var.b, true);
        this.h = bundle;
        this.g = activity;
        this.f = r50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk2(ss2 ss2Var, Context context, Bundle bundle) {
        super(ss2Var, true);
        this.g = context;
        this.h = bundle;
        this.f = ss2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk2(ss2 ss2Var, String str, zzco zzcoVar) {
        super(ss2Var, true);
        this.g = str;
        this.h = zzcoVar;
        Objects.requireNonNull(ss2Var);
        this.f = ss2Var;
    }
}
