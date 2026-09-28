package defpackage;

import android.view.View;
import android.webkit.WebView;
import androidx.webkit.internal.WebMessageListenerAdapter;
import com.google.android.gms.internal.ads.zzfsj;
import com.google.android.gms.internal.ads.zzfsm;
import com.google.android.gms.internal.ads.zzfso;
import com.google.android.gms.internal.ads.zzfsr;
import com.google.android.gms.internal.ads.zzfsw;
import com.google.android.gms.internal.ads.zzftk;
import com.google.android.gms.internal.ads.zzftl;
import com.google.android.gms.internal.ads.zzfuy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;
import org.chromium.support_lib_boundary.util.Features;
import org.slf4j.Marker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class aw2 {
    public final kx a;
    public final WebView b;
    public final zzfuy c;
    public final HashMap d;
    public final zzftl e;

    /* JADX WARN: Multi-variable type inference failed */
    public aw2(kx kxVar, WebView webView) {
        HashMap map = new HashMap();
        this.d = map;
        this.e = new zzftl();
        if (!yv2.a.a) {
            u7.p("Method called before OM SDK activation");
            throw null;
        }
        this.a = kxVar;
        this.b = webView;
        zzfuy zzfuyVar = this.c;
        if ((zzfuyVar == null ? null : (View) zzfuyVar.get()) != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzfsj) it.next()).b(webView);
            }
            this.c = new zzfuy(webView);
        }
        if (!vp1.b(Features.WEB_MESSAGE_LISTENER)) {
            u7.s("The JavaScriptSessionService cannot be supported in this WebView version.");
            throw null;
        }
        WebView webView2 = this.b;
        int i = sp1.a;
        p5 p5Var = vp1.i;
        if (!p5Var.b()) {
            throw vp1.a();
        }
        sp1.b(webView2).a.removeWebMessageListener("omidJsSessionService");
        ci2 ci2Var = new ci2(this, 13);
        WebView webView3 = this.b;
        HashSet hashSet = new HashSet(Arrays.asList(Marker.ANY_MARKER));
        if (!p5Var.b()) {
            throw vp1.a();
        }
        sp1.b(webView3).a.addWebMessageListener("omidJsSessionService", (String[]) hashSet.toArray(new String[0]), BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebMessageListenerAdapter(ci2Var)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str) {
        zzfso zzfsoVar = zzfso.DEFINED_BY_JAVASCRIPT;
        zzfsr zzfsrVar = zzfsr.DEFINED_BY_JAVASCRIPT;
        zzfsw zzfswVar = zzfsw.JAVASCRIPT;
        zv2 zv2Var = new zv2(to2.a(zzfsoVar, zzfsrVar, zzfswVar, zzfswVar, false), new z41(this.a, this.b, null, null, zzfsm.HTML), str);
        this.d.put(str, zv2Var);
        zzfuy zzfuyVar = this.c;
        zv2Var.b(zzfuyVar == null ? null : (View) zzfuyVar.get());
        for (zzftk zzftkVar : this.e.a) {
            zv2Var.d((View) zzftkVar.a.get(), zzftkVar.c);
        }
        zv2Var.a();
    }
}
