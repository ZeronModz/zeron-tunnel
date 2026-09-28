package defpackage;

import com.google.android.gms.internal.ads.zzfsa;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vv2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzfsa b;

    public /* synthetic */ vv2(zzfsa zzfsaVar, int i) {
        this.a = i;
        this.b = zzfsaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.a
            switch(r0) {
                case 0: goto L60;
                case 1: goto L37;
                case 2: goto L17;
                case 3: goto L11;
                case 4: goto Lb;
                default: goto L5;
            }
        L5:
            com.google.android.gms.internal.ads.zzfsa r10 = r10.b
            r10.w()
            return
        Lb:
            com.google.android.gms.internal.ads.zzfsa r10 = r10.b
            r10.d()
            return
        L11:
            com.google.android.gms.internal.ads.zzfsa r10 = r10.b
            r10.d()
            return
        L17:
            com.google.android.gms.internal.ads.zzfsa r10 = r10.b
            sv2 r0 = r10.r
            if (r0 == 0) goto L36
            com.google.android.gms.common.util.Clock r1 = r10.s
            uv2 r8 = r10.t
            long r3 = r1.currentTimeMillis()
            com.google.android.gms.ads.internal.client.zzft r1 = r10.e
            int r5 = r1.zzd
            java.lang.String r9 = r10.f()
            java.lang.String r1 = "pae"
            java.lang.String r2 = "paeo_ts"
            r6 = 0
            r7 = 0
            r0.g(r1, r2, r3, r5, r6, r7, r8, r9)
        L36:
            return
        L37:
            com.google.android.gms.internal.ads.zzfsa r1 = r10.b
            monitor-enter(r1)
            com.google.android.gms.ads.internal.client.zzce r10 = r1.h     // Catch: java.lang.Throwable -> L44
            if (r10 == 0) goto L4c
            com.google.android.gms.ads.internal.client.zzft r0 = r1.e     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L47
            r10.zzf(r0)     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L47
            goto L4c
        L44:
            r0 = move-exception
            r10 = r0
            goto L5e
        L47:
            java.lang.String r10 = "Failed to call onAdsExhausted"
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r10)     // Catch: java.lang.Throwable -> L44
        L4c:
            com.google.android.gms.ads.internal.client.zzch r10 = r1.i     // Catch: java.lang.Throwable -> L44
            if (r10 == 0) goto L55
            java.lang.String r0 = r1.l     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L57
            r10.zzf(r0)     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L57
        L55:
            monitor-exit(r1)
            goto L5d
        L57:
            java.lang.String r10 = "Failed to call onAdsExhausted"
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r10)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r1)
        L5d:
            return
        L5e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            throw r10
        L60:
            com.google.android.gms.internal.ads.zzfsa r10 = r10.b
            r10.v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vv2.run():void");
    }
}
