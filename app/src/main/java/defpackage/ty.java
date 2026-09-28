package defpackage;

import com.google.firebase.sessions.dagger.Lazy;
import com.google.firebase.sessions.dagger.internal.Provider;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ty implements Provider, Lazy {
    public static final Object c = new Object();
    public volatile Provider a;
    public volatile Object b;

    public static Provider a(Provider provider) {
        provider.getClass();
        if (provider instanceof ty) {
            return provider;
        }
        ty tyVar = new ty();
        tyVar.b = c;
        tyVar.a = provider;
        return tyVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.a.get();
                    Object obj4 = this.b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
