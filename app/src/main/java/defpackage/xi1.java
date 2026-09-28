package defpackage;

import com.google.common.reflect.TypeToken;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class xi1 extends zg0 {
    public final Constructor c;
    public final /* synthetic */ TypeToken d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi1(TypeToken typeToken, Constructor constructor) {
        super(constructor);
        this.d = typeToken;
        this.c = constructor;
    }

    @Override // defpackage.zg0
    public final TypeToken a() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.google.common.reflect.TypeToken r1 = r9.d
            r0.append(r1)
            java.lang.String r2 = "("
            r0.append(r2)
            q43 r2 = new q43
            java.lang.String r3 = ", "
            r2.<init>(r3)
            com.google.common.reflect.TypeResolver r1 = com.google.common.reflect.TypeToken.access$100(r1)
            java.lang.reflect.Constructor r3 = r9.c
            java.lang.reflect.Type[] r4 = r3.getGenericParameterTypes()
            int r5 = r4.length
            r6 = 0
            if (r5 <= 0) goto L73
            java.lang.Class r5 = r3.getDeclaringClass()
            java.lang.reflect.Constructor r7 = r5.getEnclosingConstructor()
            r8 = 1
            if (r7 == 0) goto L31
        L2f:
            r5 = r8
            goto L53
        L31:
            java.lang.reflect.Method r7 = r5.getEnclosingMethod()
            if (r7 == 0) goto L41
            int r5 = r7.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            r5 = r5 ^ r8
            goto L53
        L41:
            java.lang.Class r7 = r5.getEnclosingClass()
            if (r7 == 0) goto L52
            int r5 = r5.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 != 0) goto L52
            goto L2f
        L52:
            r5 = r6
        L53:
            if (r5 == 0) goto L73
            java.lang.Class[] r3 = r3.getParameterTypes()
            int r5 = r4.length
            int r7 = r3.length
            if (r5 != r7) goto L73
            r3 = r3[r6]
            java.lang.reflect.Member r9 = r9.b
            java.lang.Class r9 = r9.getDeclaringClass()
            java.lang.Class r9 = r9.getEnclosingClass()
            if (r3 != r9) goto L73
            int r9 = r4.length
            java.lang.Object[] r9 = java.util.Arrays.copyOfRange(r4, r8, r9)
            r4 = r9
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
        L73:
            r1.getClass()
        L76:
            int r9 = r4.length
            if (r6 >= r9) goto L84
            r9 = r4[r6]
            java.lang.reflect.Type r9 = r1.b(r9)
            r4[r6] = r9
            int r6 = r6 + 1
            goto L76
        L84:
            java.util.List r9 = java.util.Arrays.asList(r4)
            java.lang.String r9 = r2.a(r9)
            r0.append(r9)
            java.lang.String r9 = ")"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xi1.toString():java.lang.String");
    }
}
