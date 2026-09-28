package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mg {
    public static final ThreadLocal a = new ThreadLocal();
    public static final Class b;
    public static final long c;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    static {
        /*
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            defpackage.mg.a = r0
            java.lang.String r0 = "java.io.FileOutputStream"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            defpackage.mg.b = r0
            if (r0 == 0) goto L26
            boolean r1 = defpackage.dl1.e     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L26
            java.lang.String r1 = "channel"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L26
            cl1 r1 = defpackage.dl1.c     // Catch: java.lang.Throwable -> L26
            sun.misc.Unsafe r1 = r1.a     // Catch: java.lang.Throwable -> L26
            long r0 = r1.objectFieldOffset(r0)     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r0 = -1
        L28:
            defpackage.mg.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mg.<clinit>():void");
    }
}
