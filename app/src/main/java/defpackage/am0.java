package defpackage;

import com.google.common.cache.b;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class am0 extends b {
    public final /* synthetic */ Callable a;

    public am0(Callable callable) {
        this.a = callable;
    }

    @Override // com.google.common.cache.b
    public final Object load(Object obj) {
        return this.a.call();
    }
}
