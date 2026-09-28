package defpackage;

import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Preconditions;
import com.google.firebase.components.Qualified;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ip {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public int d;
    public int e;
    public ComponentFactory f;
    public final HashSet g;

    public ip(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(Qualified.a(cls));
        for (Class cls2 : clsArr) {
            Preconditions.a(cls2, "Null interface");
            this.b.add(Qualified.a(cls2));
        }
    }

    public final void a(kw kwVar) {
        if (this.b.contains(kwVar.a)) {
            u7.r("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.c.add(kwVar);
        }
    }

    public final jp b() {
        if (this.f != null) {
            return new jp(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
        }
        u7.p("Missing required property: factory.");
        return null;
    }

    public final void c(int i) {
        if (this.d == 0) {
            this.d = i;
        } else {
            u7.p("Instantiation type has already been set.");
        }
    }

    public ip(Qualified qualified, Qualified... qualifiedArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(qualified);
        for (Qualified qualified2 : qualifiedArr) {
            Preconditions.a(qualified2, "Null interface");
        }
        Collections.addAll(this.b, qualifiedArr);
    }
}
