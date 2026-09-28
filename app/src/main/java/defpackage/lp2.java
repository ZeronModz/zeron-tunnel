package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzdmc;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzejf;
import com.google.android.gms.internal.ads.zzgqg;
import com.google.android.gms.internal.ads.zzgru;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lp2 implements zzdmc {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public Object i;

    public lp2(Context context, zzgqg zzgqgVar, Intent intent) {
        this.e = new ArrayList();
        this.c = context;
        this.d = zzgqgVar;
        this.f = intent;
        this.b = z.f(new ot2(7));
        this.g = new s21(this, 1);
    }

    public void a(Runnable runnable) {
        ((Handler) ((zzgru) this.b).mo10zza()).post(new qj2(17, this, runnable));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    @Override // com.google.android.gms.internal.ads.zzdmc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zza(boolean r21, android.content.Context r22, com.google.android.gms.internal.ads.zzdbs r23) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = r0.f
            cu2 r1 = (defpackage.cu2) r1
            java.lang.Object r2 = r0.g
            com.google.android.gms.internal.ads.zzbok r2 = (com.google.android.gms.internal.ads.zzbok) r2
            java.lang.Object r3 = r0.c
            com.google.android.gms.internal.ads.zzcen r3 = (com.google.android.gms.internal.ads.zzcen) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.z.o0(r3)
            com.google.android.gms.internal.ads.zzcti r3 = (com.google.android.gms.internal.ads.zzcti) r3
            java.lang.Object r4 = r0.e
            r9 = r4
            com.google.android.gms.internal.ads.zzcjl r9 = (com.google.android.gms.internal.ads.zzcjl) r9
            r4 = 1
            r9.zzag(r4)
            com.google.android.gms.ads.internal.zzl r13 = new com.google.android.gms.ads.internal.zzl
            boolean r5 = r0.a
            if (r5 == 0) goto L29
            boolean r6 = r2.b(r4)
            r11 = r6
            goto L2a
        L29:
            r11 = r4
        L2a:
            r6 = 0
            if (r5 == 0) goto L38
            monitor-enter(r2)
            boolean r7 = r2.b     // Catch: java.lang.Throwable -> L35
            monitor-exit(r2)
            if (r7 == 0) goto L38
            r6 = r4
            goto L38
        L35:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            throw r0
        L38:
            if (r5 == 0) goto L40
            float r2 = r2.c()
        L3e:
            r14 = r2
            goto L42
        L40:
            r2 = 0
            goto L3e
        L42:
            java.lang.Object r2 = r0.d
            tt2 r2 = (defpackage.tt2) r2
            boolean r5 = r2.O
            r18 = 0
            r12 = 1
            r15 = -1
            r16 = r21
            r17 = r5
            r10 = r13
            r13 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r13 = r10
            if (r23 == 0) goto L5b
            r23.j()
        L5b:
            com.google.android.gms.ads.internal.zzt.zzb()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r5 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.zzdlr r7 = r3.e()
            int r3 = r2.Q
            r6 = -1
            if (r3 == r6) goto L6a
            goto L73
        L6a:
            com.google.android.gms.ads.internal.client.zzx r6 = r1.k
            if (r6 == 0) goto L7a
            int r6 = r6.zza
            if (r6 != r4) goto L75
            r3 = 7
        L73:
            r10 = r3
            goto L80
        L75:
            r8 = 2
            if (r6 != r8) goto L7a
            r3 = 6
            goto L73
        L7a:
            java.lang.String r6 = "Error setting app open orientation; no targeting orientation available."
            com.google.android.gms.ads.internal.util.client.zzo.zzd(r6)
            goto L73
        L80:
            java.lang.Object r3 = r0.b
            r11 = r3
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r11 = (com.google.android.gms.ads.internal.util.client.VersionInfoParcel) r11
            java.lang.String r12 = r2.B
            vt2 r3 = r2.s
            java.lang.String r14 = r3.b
            java.lang.String r15 = r3.a
            boolean r2 = r2.b()
            if (r2 == 0) goto L9a
            java.lang.Object r2 = r0.h
            com.google.android.gms.internal.ads.zzejf r2 = (com.google.android.gms.internal.ads.zzejf) r2
        L97:
            r18 = r2
            goto L9c
        L9a:
            r2 = 0
            goto L97
        L9c:
            java.lang.String r1 = r1.g
            java.lang.String r19 = r9.zzn()
            r6 = 0
            r8 = 0
            r17 = r23
            r16 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r0 = r0.i
            com.google.android.gms.internal.ads.zzdxz r0 = (com.google.android.gms.internal.ads.zzdxz) r0
            r1 = r22
            com.google.android.gms.ads.internal.overlay.zzn.zza(r1, r5, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp2.zza(boolean, android.content.Context, com.google.android.gms.internal.ads.zzdbs):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    /* JADX INFO: renamed from: zzb */
    public tt2 mo79zzb() {
        return (tt2) this.d;
    }

    public lp2(VersionInfoParcel versionInfoParcel, zzcen zzcenVar, tt2 tt2Var, zzcjl zzcjlVar, cu2 cu2Var, boolean z, zzbok zzbokVar, zzejf zzejfVar, zzdxz zzdxzVar) {
        this.b = versionInfoParcel;
        this.c = zzcenVar;
        this.d = tt2Var;
        this.e = zzcjlVar;
        this.f = cu2Var;
        this.a = z;
        this.g = zzbokVar;
        this.h = zzejfVar;
        this.i = zzdxzVar;
    }
}
