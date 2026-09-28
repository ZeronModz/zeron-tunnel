package defpackage;

import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Preconditions;
import com.google.firebase.components.Qualified;
import java.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class jp {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final ComponentFactory f;
    public final Set g;

    public jp(String str, Set set, Set set2, int i, int i2, ComponentFactory componentFactory, Set set3) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableSet(set);
        this.c = DesugarCollections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = componentFactory;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }

    public static ip a(Qualified qualified) {
        return new ip(qualified, new Qualified[0]);
    }

    public static ip b(Class cls) {
        return new ip(cls, new Class[0]);
    }

    public static jp c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(Qualified.a(cls));
        for (Class cls2 : clsArr) {
            Preconditions.a(cls2, "Null interface");
            hashSet.add(Qualified.a(cls2));
        }
        return new jp(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new hp(obj, 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
