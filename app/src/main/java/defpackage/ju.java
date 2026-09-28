package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ju extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ ju(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.ThreadLocal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object initialValue() {
        /*
            r3 = this;
            int r3 = r3.a
            r0 = 0
            switch(r3) {
                case 0: goto L96;
                case 1: goto L90;
                case 2: goto L8d;
                case 3: goto L83;
                case 4: goto L79;
                case 5: goto L6f;
                case 6: goto L69;
                case 7: goto L45;
                case 8: goto L42;
                case 9: goto L3b;
                case 10: goto L34;
                default: goto L6;
            }
        L6:
            java.security.Provider r3 = defpackage.if3.R()
            java.lang.String r1 = "SHA1PRNG"
            if (r3 == 0) goto L13
            java.security.SecureRandom r3 = java.security.SecureRandom.getInstance(r1, r3)     // Catch: java.security.GeneralSecurityException -> L13
            goto L30
        L13:
            java.lang.Class<org.conscrypt.Conscrypt> r3 = org.conscrypt.Conscrypt.class
            int r2 = org.conscrypt.Conscrypt.a     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "newProvider"
            java.lang.reflect.Method r3 = r3.getMethod(r2, r0)     // Catch: java.lang.Throwable -> L24
            java.lang.Object r3 = r3.invoke(r0, r0)     // Catch: java.lang.Throwable -> L24
            java.security.Provider r3 = (java.security.Provider) r3     // Catch: java.lang.Throwable -> L24
            r0 = r3
        L24:
            if (r0 == 0) goto L2b
            java.security.SecureRandom r3 = java.security.SecureRandom.getInstance(r1, r0)     // Catch: java.security.GeneralSecurityException -> L2b
            goto L30
        L2b:
            java.security.SecureRandom r3 = new java.security.SecureRandom
            r3.<init>()
        L30:
            r3.nextLong()
            return r3
        L34:
            r0 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L3b:
            r3 = 32
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            return r3
        L42:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L45:
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r3 != r1) goto L54
            java.util.concurrent.ScheduledExecutorService r0 = defpackage.dn0.r()
            goto L68
        L54:
            android.os.Looper r3 = android.os.Looper.myLooper()
            if (r3 == 0) goto L68
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.myLooper()
            r3.<init>(r0)
            jc0 r0 = new jc0
            r0.<init>(r3)
        L68:
            return r0
        L69:
            java.util.Random r3 = new java.util.Random
            r3.<init>()
            return r3
        L6f:
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r0 = "yyyy:MM:dd HH:mm:ss"
            java.util.Locale r1 = java.util.Locale.US
            r3.<init>(r0, r1)
            return r3
        L79:
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r0 = "HH:mm:ss"
            java.util.Locale r1 = java.util.Locale.US
            r3.<init>(r0, r1)
            return r3
        L83:
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r0 = "yyyy:MM:dd"
            java.util.Locale r1 = java.util.Locale.US
            r3.<init>(r0, r1)
            return r3
        L8d:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L90:
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r3.<init>()
            return r3
        L96:
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r0 = "EEE, dd MMM yyyy HH:mm:ss 'GMT'"
            java.util.Locale r1 = java.util.Locale.US
            r3.<init>(r0, r1)
            r0 = 0
            r3.setLenient(r0)
            java.util.TimeZone r0 = defpackage.sl1.e
            r3.setTimeZone(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju.initialValue():java.lang.Object");
    }
}
