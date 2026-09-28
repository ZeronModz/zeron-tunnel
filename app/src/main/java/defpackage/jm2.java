package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jm2 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:3:0x0001, B:8:0x0019, B:10:0x0038, B:12:0x003e, B:14:0x0047, B:18:0x004f, B:25:0x0073, B:29:0x00a7, B:31:0x00b1, B:32:0x00b9, B:33:0x00c0, B:35:0x00c6, B:36:0x00ca, B:38:0x00df, B:39:0x00e8, B:41:0x00ee, B:43:0x00fc, B:45:0x0102, B:46:0x0114, B:48:0x011a, B:50:0x012c, B:52:0x0134, B:56:0x0145, B:58:0x014d, B:60:0x0153, B:62:0x015c, B:63:0x0165, B:26:0x0084, B:27:0x0095), top: B:70:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(int r8, long r9, long r11) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jm2.a(int, long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r8 = this;
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzt.zzk()
            long r0 = r0.currentTimeMillis()
            java.util.concurrent.ConcurrentHashMap r8 = r8.a
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L12:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto La4
            java.lang.Object r2 = r8.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.ads.zzdzf r3 = (com.google.android.gms.internal.ads.zzdzf) r3
            java.lang.Object r2 = r2.getValue()
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2
            int r3 = r3.b()
            r4 = 0
            if (r3 == 0) goto L3b
            r6 = 1
            if (r3 == r6) goto L5f
            r6 = 2
            if (r3 == r6) goto L4e
            r6 = 3
            if (r3 == r6) goto L3d
        L3b:
            r6 = r4
            goto L6f
        L3d:
            l32 r3 = defpackage.p32.U8
            com.google.android.gms.internal.ads.zzbhc r6 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r6.a(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r6 = r3.longValue()
            goto L6f
        L4e:
            l32 r3 = defpackage.p32.T8
            com.google.android.gms.internal.ads.zzbhc r6 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r6.a(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r6 = r3.longValue()
            goto L6f
        L5f:
            l32 r3 = defpackage.p32.S8
            com.google.android.gms.internal.ads.zzbhc r6 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r6.a(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r6 = r3.longValue()
        L6f:
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto L77
            r8.remove()
            r6 = r4
        L77:
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 <= 0) goto L12
            java.util.Iterator r3 = r2.iterator()
        L7f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L99
            java.lang.Object r4 = r3.next()
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            long r4 = r0 - r4
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L99
            r3.remove()
            goto L7f
        L99:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L12
            r8.remove()
            goto L12
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jm2.b():void");
    }
}
