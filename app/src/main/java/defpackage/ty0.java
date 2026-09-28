package defpackage;

import java.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ty0 {
    public static final Map a;
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        Class cls = Boolean.TYPE;
        linkedHashMap.put(cls, Boolean.class);
        linkedHashMap2.put(Boolean.class, cls);
        Class cls2 = Byte.TYPE;
        linkedHashMap.put(cls2, Byte.class);
        linkedHashMap2.put(Byte.class, cls2);
        Class cls3 = Character.TYPE;
        linkedHashMap.put(cls3, Character.class);
        linkedHashMap2.put(Character.class, cls3);
        Class cls4 = Double.TYPE;
        linkedHashMap.put(cls4, Double.class);
        linkedHashMap2.put(Double.class, cls4);
        Class cls5 = Float.TYPE;
        linkedHashMap.put(cls5, Float.class);
        linkedHashMap2.put(Float.class, cls5);
        Class cls6 = Integer.TYPE;
        linkedHashMap.put(cls6, Integer.class);
        linkedHashMap2.put(Integer.class, cls6);
        Class cls7 = Long.TYPE;
        linkedHashMap.put(cls7, Long.class);
        linkedHashMap2.put(Long.class, cls7);
        Class cls8 = Short.TYPE;
        linkedHashMap.put(cls8, Short.class);
        linkedHashMap2.put(Short.class, cls8);
        Class cls9 = Void.TYPE;
        linkedHashMap.put(cls9, Void.class);
        linkedHashMap2.put(Void.class, cls9);
        a = DesugarCollections.unmodifiableMap(linkedHashMap);
        b = DesugarCollections.unmodifiableMap(linkedHashMap2);
    }

    public static Class a(Class cls) {
        cls.getClass();
        Class cls2 = (Class) a.get(cls);
        return cls2 == null ? cls : cls2;
    }
}
