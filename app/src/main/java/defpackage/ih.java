package defpackage;

import com.google.common.cache.b;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ih extends b {
    public final /* synthetic */ b a;
    public final /* synthetic */ Executor b;

    public ih(b bVar, Executor executor) {
        this.a = bVar;
        this.b = executor;
    }

    @Override // com.google.common.cache.b
    public final Object load(Object obj) {
        return this.a.load(obj);
    }

    @Override // com.google.common.cache.b
    public final Map loadAll(Iterable iterable) {
        return this.a.loadAll(iterable);
    }

    @Override // com.google.common.cache.b
    public final ListenableFuture reload(Object obj, Object obj2) {
        kl0 kl0Var = new kl0(new hh(this.a, 0, obj, obj2));
        this.b.execute(kl0Var);
        return kl0Var;
    }
}
