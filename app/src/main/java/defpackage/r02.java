package defpackage;

import android.view.View;
import com.google.android.gms.internal.ads.zzbac;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzfvj;
import com.google.android.gms.internal.ads.zzfxb;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class r02 implements zzfxb {
    public final zzfvj a;
    public final t61 b;
    public final zzbar c;
    public final q02 d;
    public final h02 e;
    public final v02 f;
    public final zzbal g;
    public final zzbac h;

    public r02(zzfvj zzfvjVar, t61 t61Var, zzbar zzbarVar, q02 q02Var, h02 h02Var, v02 v02Var, zzbal zzbalVar, zzbac zzbacVar) {
        this.a = zzfvjVar;
        this.b = t61Var;
        this.c = zzbarVar;
        this.d = q02Var;
        this.e = h02Var;
        this.f = v02Var;
        this.g = zzbalVar;
        this.h = zzbacVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x011b A[Catch: all -> 0x00ff, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x00ff, blocks: (B:12:0x00f0, B:14:0x00f4, B:16:0x00fb, B:20:0x0101, B:22:0x010a, B:24:0x010e, B:26:0x0117, B:28:0x011b), top: B:41:0x00f0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap a() {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r02.a():java.util.HashMap");
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzb() {
        return a();
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzc() {
        HashMap mapA = a();
        zzbac zzbacVar = this.h;
        if (zzbacVar != null) {
            List list = zzbacVar.a;
            zzbacVar.a = Collections.EMPTY_LIST;
            mapA.put("vst", list);
        }
        return mapA;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzd() {
        HashMap mapA = a();
        zzbar zzbarVar = this.c;
        if (zzbarVar.l <= -2) {
            WeakReference weakReference = zzbarVar.h;
            if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                zzbarVar.l = -3L;
            }
        }
        mapA.put("lts", Long.valueOf(zzbarVar.l));
        return mapA;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zze() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }
}
