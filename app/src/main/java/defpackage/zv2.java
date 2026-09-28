package defpackage;

import android.app.ActivityManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzfsj;
import com.google.android.gms.internal.ads.zzfsm;
import com.google.android.gms.internal.ads.zzfso;
import com.google.android.gms.internal.ads.zzfsq;
import com.google.android.gms.internal.ads.zzfsr;
import com.google.android.gms.internal.ads.zzfsw;
import com.google.android.gms.internal.ads.zzftd;
import com.google.android.gms.internal.ads.zzftl;
import com.google.android.gms.internal.ads.zzftp;
import com.google.android.gms.internal.ads.zzftx;
import com.google.android.gms.internal.ads.zzfty;
import com.google.android.gms.internal.ads.zzfub;
import com.google.android.gms.internal.ads.zzfuy;
import java.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zv2 extends zzfsj {
    public final z41 a;
    public zzftx d;
    public final String g;
    public final zzftl b = new zzftl();
    public boolean e = false;
    public boolean f = false;
    public zzfuy c = new zzfuy(null);

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public zv2(to2 to2Var, z41 z41Var, String str) {
        zzftx zzftyVar;
        this.a = z41Var;
        this.g = str;
        zzfsm zzfsmVar = (zzfsm) z41Var.h;
        if (zzfsmVar == zzfsm.HTML || zzfsmVar == zzfsm.JAVASCRIPT) {
            zzftyVar = new zzfty(str, (WebView) z41Var.e);
            this.d = zzftyVar;
        } else {
            zzftyVar = new zzfub(str, DesugarCollections.unmodifiableMap((HashMap) z41Var.g), null);
            this.d = zzftyVar;
        }
        zzftyVar.a();
        dw2.c.a.add(this);
        zzftx zzftxVar = this.d;
        i60 i60Var = i60.m;
        WebView webViewC = zzftxVar.c();
        String str2 = zzftxVar.a;
        JSONObject jSONObject = new JSONObject();
        fw2.b(jSONObject, "impressionOwner", (zzfsw) to2Var.c);
        fw2.b(jSONObject, "mediaEventsOwner", (zzfsw) to2Var.d);
        fw2.b(jSONObject, "creativeType", (zzfso) to2Var.e);
        fw2.b(jSONObject, "impressionType", (zzfsr) to2Var.f);
        fw2.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(to2Var.b));
        i60Var.d(webViewC, "init", jSONObject, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzfsj
    public final void a() {
        if (this.e || this.d == null) {
            return;
        }
        this.e = true;
        ArrayList arrayList = dw2.c.b;
        boolean z = arrayList.size() > 0;
        arrayList.add(this);
        if (!z) {
            zzftp zzftpVarA = zzftp.a();
            zzftpVarA.getClass();
            cw2 cw2Var = cw2.d;
            cw2Var.c = zzftpVarA;
            cw2Var.a = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z2 = runningAppProcessInfo.importance == 100 || cw2Var.a();
            cw2Var.b = z2;
            cw2Var.b(z2);
            hw2.f.getClass();
            hw2.a();
            zzftd zzftdVar = zzftpVarA.b;
            zzftdVar.getClass();
            zzftdVar.f.submit(new pt2(zzftdVar, 7));
            zzftdVar.b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, zzftdVar);
        }
        float f = zzftp.a().a;
        zzftx zzftxVar = this.d;
        i60.m.d(zzftxVar.c(), "setDeviceVolume", Float.valueOf(f), zzftxVar.a);
        zzftx zzftxVar2 = this.d;
        Date date = bw2.e.a;
        zzftxVar2.f(date != null ? (Date) date.clone() : null);
        this.d.d(this, this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfsj
    public final void b(View view) {
        if (this.f || ((View) this.c.get()) == view) {
            return;
        }
        this.c = new zzfuy(view);
        zzftx zzftxVar = this.d;
        zzftxVar.getClass();
        zzftxVar.c = System.nanoTime();
        zzftxVar.d = 1;
        Collection<zv2> collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(dw2.c.a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (zv2 zv2Var : collectionUnmodifiableCollection) {
            if (zv2Var != this && ((View) zv2Var.c.get()) == view) {
                zv2Var.c.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfsj
    public final void c() {
        if (this.f) {
            return;
        }
        this.c.clear();
        if (!this.f) {
            this.b.a.clear();
        }
        this.f = true;
        zzftx zzftxVar = this.d;
        i60.m.d(zzftxVar.c(), "finishSession", zzftxVar.a);
        dw2 dw2Var = dw2.c;
        ArrayList arrayList = dw2Var.a;
        ArrayList arrayList2 = dw2Var.b;
        boolean z = arrayList2.size() > 0;
        arrayList.remove(this);
        arrayList2.remove(this);
        if (z && arrayList2.size() <= 0) {
            zzftp zzftpVarA = zzftp.a();
            zzftpVarA.getClass();
            hw2 hw2Var = hw2.f;
            hw2Var.getClass();
            Handler handler = hw2.h;
            if (handler != null) {
                handler.removeCallbacks(hw2.j);
                hw2.h = null;
            }
            hw2Var.a.clear();
            hw2.g.post(new pt2(hw2Var, 9));
            cw2 cw2Var = cw2.d;
            cw2Var.a = false;
            cw2Var.c = null;
            zzftd zzftdVar = zzftpVarA.b;
            zzftdVar.b.getContentResolver().unregisterContentObserver(zzftdVar);
        }
        this.d.b();
        this.d = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsj
    public final void d(View view, zzfsq zzfsqVar) {
        if (this.f) {
            return;
        }
        this.b.a(view, zzfsqVar);
    }
}
