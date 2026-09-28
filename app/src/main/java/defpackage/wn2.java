package defpackage;

import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzgoj;
import com.google.android.gms.internal.ads.zzgqg;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.w;
import com.google.android.gms.measurement.internal.z;
import com.google.android.gms.measurement.internal.zzgb;
import java.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wn2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public wn2(w wVar, zzcu zzcuVar) {
        this.a = 17;
        this.b = zzcuVar;
        Objects.requireNonNull(wVar);
        this.c = wVar;
    }

    private final /* synthetic */ void a() {
        lp2 lp2Var = (lp2) this.b;
        Runnable runnable = (Runnable) this.c;
        int i = 0;
        if (((zzgoj) lp2Var.i) != null || lp2Var.a) {
            if (!lp2Var.a) {
                runnable.run();
                return;
            }
            ((zzgqg) lp2Var.d).a("Waiting to bind to the service.", new Object[0]);
            ArrayList arrayList = (ArrayList) lp2Var.e;
            synchronized (arrayList) {
                arrayList.add(runnable);
            }
            return;
        }
        ((zzgqg) lp2Var.d).a("Initiate binding to the service.", new Object[0]);
        ArrayList arrayList2 = (ArrayList) lp2Var.e;
        synchronized (arrayList2) {
            arrayList2.add(runnable);
        }
        f13 f13Var = new f13(lp2Var, i);
        lp2Var.h = f13Var;
        lp2Var.a = true;
        if (((Context) lp2Var.c).bindService((Intent) lp2Var.f, f13Var, 1)) {
            return;
        }
        ((zzgqg) lp2Var.d).a("Failed to bind to the service.", new Object[0]);
        lp2Var.a = false;
        ArrayList arrayList3 = (ArrayList) lp2Var.e;
        synchronized (arrayList3) {
            arrayList3.clear();
        }
    }

    private final void b() {
        qh3 qh3Var = (qh3) this.c;
        synchronized (qh3Var) {
            try {
                qh3Var.a = false;
                z zVar = qh3Var.c;
                if (!zVar.r()) {
                    m mVar = zVar.a.f;
                    r.h(mVar);
                    mVar.n.a("Connected to service");
                    zzgb zzgbVar = (zzgb) this.b;
                    zVar.a();
                    zVar.d = zzgbVar;
                    zVar.n();
                    zVar.p();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0a73  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0ac6  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0b26  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0b2d  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0bb6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0584 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x01f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0861 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e9  */
    /* JADX WARN: Type inference failed for: r0v75, types: [og3] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 3348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn2.run():void");
    }

    public /* synthetic */ wn2(Object obj, int i, Object obj2, boolean z) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    public wn2(i60 i60Var, WebView webView, String str) {
        this.a = 10;
        this.b = webView;
        this.c = str;
    }

    public /* synthetic */ wn2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
