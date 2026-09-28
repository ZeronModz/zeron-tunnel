package defpackage;

import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.e;
import kotlin.f;
import kotlin.g;
import kotlin.h;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.time.a;
import kotlin.uuid.Uuid;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class uy0 {
    public static final Map a;

    static {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(Reflection.a(String.class), bb1.a);
        mapBuilder.put(Reflection.a(Character.TYPE), wm.a);
        mapBuilder.put(Reflection.a(char[].class), nm.c);
        mapBuilder.put(Reflection.a(Double.TYPE), xy.a);
        mapBuilder.put(Reflection.a(double[].class), sy.c);
        mapBuilder.put(Reflection.a(Float.TYPE), f70.a);
        mapBuilder.put(Reflection.a(float[].class), e70.c);
        mapBuilder.put(Reflection.a(Long.TYPE), sm0.a);
        mapBuilder.put(Reflection.a(long[].class), pm0.c);
        ClassReference classReferenceA = Reflection.a(ck1.class);
        ck1.b.getClass();
        mapBuilder.put(classReferenceA, ek1.a);
        mapBuilder.put(Reflection.a(Integer.TYPE), tg0.a);
        mapBuilder.put(Reflection.a(int[].class), rg0.c);
        ClassReference classReferenceA2 = Reflection.a(zj1.class);
        zj1.b.getClass();
        mapBuilder.put(classReferenceA2, bk1.a);
        mapBuilder.put(Reflection.a(Short.TYPE), c81.a);
        mapBuilder.put(Reflection.a(short[].class), b81.c);
        ClassReference classReferenceA3 = Reflection.a(gk1.class);
        gk1.b.getClass();
        mapBuilder.put(classReferenceA3, ik1.a);
        mapBuilder.put(Reflection.a(Byte.TYPE), tg.a);
        mapBuilder.put(Reflection.a(byte[].class), jg.c);
        ClassReference classReferenceA4 = Reflection.a(wj1.class);
        wj1.b.getClass();
        mapBuilder.put(classReferenceA4, yj1.a);
        mapBuilder.put(Reflection.a(Boolean.TYPE), af.a);
        mapBuilder.put(Reflection.a(boolean[].class), ze.c);
        mapBuilder.put(Reflection.a(mk1.class), nk1.b);
        mapBuilder.put(Reflection.a(Void.class), ut0.a);
        try {
            ClassReference classReferenceA5 = Reflection.a(a.class);
            a.b.getClass();
            mapBuilder.put(classReferenceA5, f00.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapBuilder.put(Reflection.a(g.class), dk1.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapBuilder.put(Reflection.a(f.class), ak1.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapBuilder.put(Reflection.a(h.class), hk1.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapBuilder.put(Reflection.a(e.class), xj1.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            ClassReference classReferenceA6 = Reflection.a(Uuid.class);
            Uuid.INSTANCE.getClass();
            mapBuilder.put(classReferenceA6, zl1.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        a = mapBuilder.build();
    }
}
