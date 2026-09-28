package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import java.nio.file.Path;
import java.nio.file.Paths;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class jw0 {
    public static final Path a = Paths.get(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new String[0]);
    public static final Path b = Paths.get("..", new String[0]);

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.nio.file.Path a(java.nio.file.Path r6, java.nio.file.Path r7) {
        /*
            r7.getClass()
            java.nio.file.Path r7 = r7.normalize()
            java.nio.file.Path r6 = r6.normalize()
            java.nio.file.Path r0 = r7.relativize(r6)
            int r1 = r7.getNameCount()
            int r2 = r6.getNameCount()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            r3 = r2
        L1d:
            if (r3 >= r1) goto L3f
            java.nio.file.Path r4 = r7.getName(r3)
            java.nio.file.Path r5 = defpackage.jw0.b
            boolean r4 = defpackage.yg0.a(r4, r5)
            if (r4 == 0) goto L3f
            java.nio.file.Path r4 = r6.getName(r3)
            boolean r4 = defpackage.yg0.a(r4, r5)
            if (r4 == 0) goto L38
            int r3 = r3 + 1
            goto L1d
        L38:
            java.lang.String r6 = "Unable to compute relative path"
            defpackage.u7.r(r6)
            r6 = 0
            return r6
        L3f:
            boolean r1 = r6.equals(r7)
            if (r1 != 0) goto L4e
            java.nio.file.Path r1 = defpackage.jw0.a
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L4e
            goto L7f
        L4e:
            java.lang.String r6 = r0.toString()
            java.nio.file.FileSystem r7 = r0.getFileSystem()
            java.lang.String r7 = r7.getSeparator()
            r7.getClass()
            boolean r7 = kotlin.text.g.u(r6, r7, r2)
            if (r7 == 0) goto L7e
            java.nio.file.FileSystem r7 = r0.getFileSystem()
            java.nio.file.FileSystem r0 = r0.getFileSystem()
            java.lang.String r0 = r0.getSeparator()
            int r0 = r0.length()
            java.lang.String r6 = kotlin.text.g.t(r0, r6)
            java.lang.String[] r0 = new java.lang.String[r2]
            java.nio.file.Path r6 = r7.getPath(r6, r0)
            goto L7f
        L7e:
            r6 = r0
        L7f:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw0.a(java.nio.file.Path, java.nio.file.Path):java.nio.file.Path");
    }
}
