package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ c6(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.a
            android.content.Context r10 = r10.b
            switch(r0) {
                case 0: goto L2d;
                case 1: goto L13;
                default: goto L7;
            }
        L7:
            s3 r0 = new s3
            r1 = 0
            r0.<init>(r1)
            ww r2 = defpackage.hz0.a
            defpackage.hz0.b(r10, r0, r2, r1)
            return
        L13:
            java.util.concurrent.ThreadPoolExecutor r3 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingQueue r9 = new java.util.concurrent.LinkedBlockingQueue
            r9.<init>()
            r4 = 0
            r5 = 1
            r6 = 0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3.<init>(r4, r5, r6, r8, r9)
            c6 r0 = new c6
            r1 = 2
            r0.<init>(r10, r1)
            r3.execute(r0)
            return
        L2d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto La8
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r10, r4)
            android.content.pm.PackageManager r4 = r10.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto La8
            java.lang.String r4 = "locale"
            if (r0 < r2) goto L83
            androidx.collection.ArraySet r0 = androidx.appcompat.app.h.g
            java.util.Iterator r0 = r0.iterator()
        L4f:
            r2 = r0
            androidx.collection.IndexBasedArrayIterator r2 = (androidx.collection.IndexBasedArrayIterator) r2
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L71
            java.lang.Object r2 = r2.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            androidx.appcompat.app.h r2 = (androidx.appcompat.app.h) r2
            if (r2 == 0) goto L4f
            androidx.appcompat.app.k r2 = (androidx.appcompat.app.k) r2
            android.content.Context r2 = r2.k
            if (r2 == 0) goto L4f
            java.lang.Object r0 = r2.getSystemService(r4)
            goto L72
        L71:
            r0 = 0
        L72:
            if (r0 == 0) goto L88
            android.os.LocaleList r0 = defpackage.e6.a(r0)
            androidx.core.os.a r2 = new androidx.core.os.a
            androidx.core.os.c r5 = new androidx.core.os.c
            r5.<init>(r0)
            r2.<init>(r5)
            goto L8a
        L83:
            androidx.core.os.a r2 = androidx.appcompat.app.h.c
            if (r2 == 0) goto L88
            goto L8a
        L88:
            androidx.core.os.a r2 = androidx.core.os.a.b
        L8a:
            boolean r0 = r2.e()
            if (r0 == 0) goto La1
            java.lang.String r0 = defpackage.t7.b(r10)
            java.lang.Object r2 = r10.getSystemService(r4)
            if (r2 == 0) goto La1
            android.os.LocaleList r0 = defpackage.d6.a(r0)
            defpackage.e6.b(r2, r0)
        La1:
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            r10.setComponentEnabledSetting(r3, r1, r1)
        La8:
            androidx.appcompat.app.h.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6.run():void");
    }
}
