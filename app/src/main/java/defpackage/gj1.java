package defpackage;

import com.google.android.gms.internal.ads.zzagh;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdje;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class gj1 {
    public Object a;

    public gj1(Set set) {
        this.a = new HashMap();
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                g((zzdje) it.next());
            }
        }
    }

    public void a(Type... typeArr) {
        HashSet hashSet = (HashSet) this.a;
        for (Type type : typeArr) {
            if (type != null && hashSet.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        e((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        f((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        d((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        b((Class) type);
                    } else {
                        if (!(type instanceof GenericArrayType)) {
                            throw new AssertionError("Unknown type: " + type);
                        }
                        c((GenericArrayType) type);
                    }
                } catch (Throwable th) {
                    hashSet.remove(type);
                    throw th;
                }
            }
        }
    }

    public abstract void e(TypeVariable typeVariable);

    public abstract void f(WildcardType wildcardType);

    public synchronized void g(zzdje zzdjeVar) {
        h(zzdjeVar.a, zzdjeVar.b);
    }

    public synchronized void h(Object obj, Executor executor) {
        ((HashMap) this.a).put(obj, executor);
    }

    public synchronized void i(zzdhc zzdhcVar) {
        for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
            ((Executor) entry.getValue()).execute(new s33(24, zzdhcVar, entry.getKey()));
        }
    }

    public void b(Class cls) {
    }

    public void c(GenericArrayType genericArrayType) {
    }

    public void d(ParameterizedType parameterizedType) {
    }

    public gj1(zzagh zzaghVar) {
        this.a = zzaghVar;
    }

    public gj1() {
        this.a = new HashSet();
    }
}
