package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.b1;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzgcc;
import com.google.android.gms.internal.ads.zzgdv;
import com.google.android.gms.internal.ads.zzger;
import com.google.android.gms.internal.ads.zzges;
import com.google.android.gms.internal.ads.zzgfb;
import com.google.android.gms.internal.ads.zzika;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class oy2 implements zzgdv {
    public final ExecutorService a;
    public final zzika b;
    public final zzika c;
    public final i03 d;
    public final zzika e;
    public final tx2 f;
    public final k5 g;

    public oy2(ExecutorService executorService, zzika zzikaVar, zzika zzikaVar2, i03 i03Var, zzika zzikaVar3, tx2 tx2Var, k5 k5Var) {
        this.a = executorService;
        this.b = zzikaVar;
        this.c = zzikaVar2;
        this.d = i03Var;
        this.e = zzikaVar3;
        this.f = tx2Var;
        this.g = k5Var;
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final String zza() {
        return "1.825731049";
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final ListenableFuture zzb() {
        return z.y(new us2(this, 6), this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final ListenableFuture zzc(Context context) {
        zzgfb zzgfbVarZzh = ((zzgfb) this.f.zzb()).zzh(context);
        zzgfbVarZzh.zzd(this.d.a());
        zzgfbVarZzh.zzc(b1.u0());
        zzgfbVarZzh.zzb(zzgcc.QUERY);
        return zzgfbVarZzh.zza().zza().a();
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final ListenableFuture zzd(Context context, String str, View view, Activity activity) {
        zzgfb zzgfbVarZzh = ((zzgfb) this.f.zzb()).zzh(context);
        zzgfbVarZzh.zzg(view);
        zzgfbVarZzh.zzf(activity);
        zzgfbVarZzh.zze(true != this.g.zze() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : null);
        zzgfbVarZzh.zzd(this.d.b(context, view));
        zzgfbVarZzh.zzc(b1.u0());
        zzgfbVarZzh.zzb(zzgcc.VIEW);
        return zzgfbVarZzh.zza().zza().a();
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final ListenableFuture zze(Context context, String str, View view, Activity activity) {
        zzika zzikaVar = this.e;
        HashMap mapC = this.d.c();
        qy2 qy2Var = (qy2) zzikaVar.zzb();
        synchronized (qy2Var) {
            try {
                MotionEvent motionEvent = qy2Var.b;
                if (motionEvent != null) {
                    mapC.put("nv", motionEvent);
                }
                mapC.put("oe", qy2Var.c);
                ArrayDeque arrayDeque = qy2Var.a;
                mapC.put("ro", arrayDeque.toArray(new zzges[arrayDeque.size()]));
                qy2Var.c = new zzger();
                arrayDeque.clear();
                MotionEvent motionEvent2 = qy2Var.b;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                    qy2Var.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzgfb zzgfbVarZzh = ((zzgfb) this.f.zzb()).zzh(context);
        zzgfbVarZzh.zzg(view);
        zzgfbVarZzh.zzf(null);
        zzgfbVarZzh.zze(str);
        zzgfbVarZzh.zzd(mapC);
        zzgfbVarZzh.zzb(zzgcc.CLICK);
        zzgfbVarZzh.zzc(b1.u0());
        return zzgfbVarZzh.zza().zza().a();
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final void zzf(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            qy2 qy2Var = (qy2) this.e.zzb();
            MotionEvent motionEvent = (MotionEvent) inputEvent;
            synchronized (qy2Var) {
                try {
                    if (motionEvent.getAction() == 1) {
                        qy2Var.b = MotionEvent.obtain(motionEvent);
                    }
                    qy2Var.c.a(motionEvent);
                    ArrayDeque arrayDeque = qy2Var.a;
                    if (arrayDeque.size() >= 6) {
                        arrayDeque.remove();
                    }
                    arrayDeque.add(new zzges(motionEvent));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final int zzg() {
        return 2;
    }
}
