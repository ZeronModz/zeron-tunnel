package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzcdu;
import com.google.android.gms.internal.ads.zzevl;
import com.google.android.gms.internal.ads.zzfax;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class kr2 implements zzfax {
    public final zzevl a;
    public final cu2 b;
    public final Context c;
    public final zzcdu d;

    public kr2(zzevl zzevlVar, cu2 cu2Var, Context context, zzcdu zzcduVar) {
        this.a = zzevlVar;
        this.b = cu2Var;
        this.c = context;
        this.d = zzcduVar;
    }

    public static final int b(int i, float f) {
        if (f == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i / f);
    }

    public static final og0 c(og0 og0Var, float f) {
        return f == 0.0f ? og0.e : og0.c((int) Math.ceil(og0Var.a / f), (int) Math.ceil(og0Var.b / f), (int) Math.ceil(og0Var.c / f), (int) Math.ceil(og0Var.d / f));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 com.google.android.gms.internal.ads.zzetj, still in use, count: 4, list:
          (r3v1 com.google.android.gms.internal.ads.zzetj) from 0x030d: MOVE (r21v0 com.google.android.gms.internal.ads.zzetj) = (r3v1 com.google.android.gms.internal.ads.zzetj) (LINE:782)
          (r3v1 com.google.android.gms.internal.ads.zzetj) from 0x01a7: MOVE (r21v3 com.google.android.gms.internal.ads.zzetj) = (r3v1 com.google.android.gms.internal.ads.zzetj) (LINE:424)
          (r3v1 com.google.android.gms.internal.ads.zzetj) from 0x01ce: MOVE (r21v5 com.google.android.gms.internal.ads.zzetj) = (r3v1 com.google.android.gms.internal.ads.zzetj) (LINE:463)
          (r3v1 com.google.android.gms.internal.ads.zzetj) from 0x017e: MOVE (r21v7 com.google.android.gms.internal.ads.zzetj) = (r3v1 com.google.android.gms.internal.ads.zzetj) (LINE:383)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final com.google.android.gms.internal.ads.zzetj a() {
        /*
            Method dump skipped, instruction units count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr2.a():com.google.android.gms.internal.ads.zzetj");
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return z.b0(this.a.zza(), new ny1(this, 4), g3.g);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 7;
    }
}
