package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzcdm;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzfax;
import com.google.android.gms.internal.ads.zzgqt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class at2 implements zzfax {
    public final Context a;
    public final ScheduledExecutorService b;
    public final ta2 c;
    public final boolean d;
    public final boolean e;
    public final zzcdm f;

    public at2(zzcdm zzcdmVar, Context context, ScheduledExecutorService scheduledExecutorService, ta2 ta2Var, int i, boolean z, boolean z2) {
        this.f = zzcdmVar;
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = ta2Var;
        this.d = z;
        this.e = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        zzcen zzcenVar = new zzcen();
        zzbb.zza();
        Context context = this.a;
        if (zzf.zzy(context)) {
            g3.a.execute(new qa2(this.f, context, zzcenVar));
        }
        q33 q33VarQ = q33.q(zzcenVar);
        final int i = 1;
        zzgqt zzgqtVar = new zzgqt(this) { // from class: zs2
            public final /* synthetic */ at2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // com.google.android.gms.internal.ads.zzgqt
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r9) {
                /*
                    r8 = this;
                    int r0 = r2
                    r1 = 0
                    at2 r8 = r8.b
                    switch(r0) {
                        case 0: goto L87;
                        default: goto L8;
                    }
                L8:
                    com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r9 = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) r9
                    com.google.android.gms.internal.ads.zzgah r0 = new com.google.android.gms.internal.ads.zzgah
                    r0.<init>()
                    boolean r2 = r8.d
                    if (r2 != 0) goto L26
                    l32 r2 = defpackage.p32.W3
                    com.google.android.gms.internal.ads.zzbhc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
                    java.lang.Object r2 = r3.a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L39
                    goto L81
                L26:
                    l32 r2 = defpackage.p32.X3
                    com.google.android.gms.internal.ads.zzbhc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
                    java.lang.Object r2 = r3.a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L39
                    goto L81
                L39:
                    android.content.Context r0 = r8.a     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    lx2 r2 = defpackage.lx2.f(r0)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    java.util.Objects.requireNonNull(r9)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    java.lang.String r4 = r9.getId()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    java.util.Objects.requireNonNull(r4)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    java.lang.String r5 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    l32 r0 = defpackage.p32.c4     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    com.google.android.gms.internal.ads.zzbhc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    java.lang.Object r0 = r3.a(r0)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    long r6 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    boolean r3 = r8.e     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    java.lang.Class<lx2> r8 = defpackage.lx2.class
                    monitor-enter(r8)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    com.google.android.gms.internal.ads.zzgah r0 = r2.a(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6b
                    monitor-exit(r8)     // Catch: java.lang.Throwable -> L6b
                    goto L81
                L6b:
                    r0 = move-exception
                    monitor-exit(r8)     // Catch: java.lang.Throwable -> L6b
                    throw r0     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                L6e:
                    r0 = move-exception
                L6f:
                    r8 = r0
                    goto L73
                L71:
                    r0 = move-exception
                    goto L6f
                L73:
                    java.lang.String r0 = "AdIdInfoSignalSource.getPaidV1"
                    com.google.android.gms.internal.ads.zzcdu r2 = com.google.android.gms.ads.internal.zzt.zzh()
                    r2.f(r0, r8)
                    com.google.android.gms.internal.ads.zzgah r0 = new com.google.android.gms.internal.ads.zzgah
                    r0.<init>()
                L81:
                    com.google.android.gms.internal.ads.zzfbx r8 = new com.google.android.gms.internal.ads.zzfbx
                    r8.<init>(r9, r1, r0)
                    return r8
                L87:
                    java.lang.Throwable r9 = (java.lang.Throwable) r9
                    com.google.android.gms.ads.internal.client.zzbb.zza()
                    android.content.Context r8 = r8.a
                    android.content.ContentResolver r8 = r8.getContentResolver()
                    if (r8 != 0) goto L96
                    r8 = r1
                    goto L9c
                L96:
                    java.lang.String r9 = "android_id"
                    java.lang.String r8 = android.provider.Settings.Secure.getString(r8, r9)
                L9c:
                    com.google.android.gms.internal.ads.zzfbx r9 = new com.google.android.gms.internal.ads.zzfbx
                    com.google.android.gms.internal.ads.zzgah r0 = new com.google.android.gms.internal.ads.zzgah
                    r0.<init>()
                    r9.<init>(r1, r8, r0)
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.zs2.apply(java.lang.Object):java.lang.Object");
            }
        };
        ta2 ta2Var = this.c;
        final int i2 = 0;
        return z.N((q33) z.T(z.b0(q33VarQ, zzgqtVar, ta2Var), ((Long) zzbd.zzc().a(p32.C1)).longValue(), TimeUnit.MILLISECONDS, this.b), Throwable.class, new zzgqt(this) { // from class: zs2
            public final /* synthetic */ at2 b;

            {
                this.b = this;
            }

            @Override // com.google.android.gms.internal.ads.zzgqt
            public final Object apply(Object v) {
                /*
                    this = this;
                    int r0 = r2
                    r1 = 0
                    at2 r8 = r8.b
                    switch(r0) {
                        case 0: goto L87;
                        default: goto L8;
                    }
                L8:
                    com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r9 = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) r9
                    com.google.android.gms.internal.ads.zzgah r0 = new com.google.android.gms.internal.ads.zzgah
                    r0.<init>()
                    boolean r2 = r8.d
                    if (r2 != 0) goto L26
                    l32 r2 = defpackage.p32.W3
                    com.google.android.gms.internal.ads.zzbhc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
                    java.lang.Object r2 = r3.a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L39
                    goto L81
                L26:
                    l32 r2 = defpackage.p32.X3
                    com.google.android.gms.internal.ads.zzbhc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
                    java.lang.Object r2 = r3.a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L39
                    goto L81
                L39:
                    android.content.Context r0 = r8.a     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    lx2 r2 = defpackage.lx2.f(r0)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    java.util.Objects.requireNonNull(r9)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    java.lang.String r4 = r9.getId()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    java.util.Objects.requireNonNull(r4)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    java.lang.String r5 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    l32 r0 = defpackage.p32.c4     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    com.google.android.gms.internal.ads.zzbhc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    java.lang.Object r0 = r3.a(r0)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    long r6 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    boolean r3 = r8.e     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    java.lang.Class<lx2> r8 = defpackage.lx2.class
                    monitor-enter(r8)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                    com.google.android.gms.internal.ads.zzgah r0 = r2.a(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6b
                    monitor-exit(r8)     // Catch: java.lang.Throwable -> L6b
                    goto L81
                L6b:
                    r0 = move-exception
                    monitor-exit(r8)     // Catch: java.lang.Throwable -> L6b
                    throw r0     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L71
                L6e:
                    r0 = move-exception
                L6f:
                    r8 = r0
                    goto L73
                L71:
                    r0 = move-exception
                    goto L6f
                L73:
                    java.lang.String r0 = "AdIdInfoSignalSource.getPaidV1"
                    com.google.android.gms.internal.ads.zzcdu r2 = com.google.android.gms.ads.internal.zzt.zzh()
                    r2.f(r0, r8)
                    com.google.android.gms.internal.ads.zzgah r0 = new com.google.android.gms.internal.ads.zzgah
                    r0.<init>()
                L81:
                    com.google.android.gms.internal.ads.zzfbx r8 = new com.google.android.gms.internal.ads.zzfbx
                    r8.<init>(r9, r1, r0)
                    return r8
                L87:
                    java.lang.Throwable r9 = (java.lang.Throwable) r9
                    com.google.android.gms.ads.internal.client.zzbb.zza()
                    android.content.Context r8 = r8.a
                    android.content.ContentResolver r8 = r8.getContentResolver()
                    if (r8 != 0) goto L96
                    r8 = r1
                    goto L9c
                L96:
                    java.lang.String r9 = "android_id"
                    java.lang.String r8 = android.provider.Settings.Secure.getString(r8, r9)
                L9c:
                    com.google.android.gms.internal.ads.zzfbx r9 = new com.google.android.gms.internal.ads.zzfbx
                    com.google.android.gms.internal.ads.zzgah r0 = new com.google.android.gms.internal.ads.zzgah
                    r0.<init>()
                    r9.<init>(r1, r8, r0)
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.zs2.apply(java.lang.Object):java.lang.Object");
            }
        }, ta2Var);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 40;
    }
}
