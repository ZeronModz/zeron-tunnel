package defpackage;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class hv0 implements Provider, Deferred {
    public static final zu0 c = new zu0();
    public static final wp d = new wp(6);
    public Deferred.DeferredHandler a;
    public volatile Provider b;

    public hv0(zu0 zu0Var, Provider provider) {
        this.a = zu0Var;
        this.b = provider;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        return this.b.get();
    }

    @Override // com.google.firebase.inject.Deferred
    public final void whenAvailable(Deferred.DeferredHandler deferredHandler) {
        Provider provider;
        Provider provider2;
        Provider provider3 = this.b;
        wp wpVar = d;
        if (provider3 != wpVar) {
            deferredHandler.handle(provider3);
            return;
        }
        synchronized (this) {
            provider = this.b;
            if (provider != wpVar) {
                provider2 = provider;
            } else {
                this.a = new di(9, this.a, deferredHandler);
                provider2 = null;
            }
        }
        if (provider2 != null) {
            deferredHandler.handle(provider);
        }
    }
}
