package io.ktor.utils.io.pool;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/utils/io/pool/NoPoolImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lio/ktor/utils/io/pool/ObjectPool;", "<init>", "()V", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NoPoolImpl<T> implements ObjectPool<T> {
    @Override // io.ktor.utils.io.pool.ObjectPool, java.lang.AutoCloseable
    public final void close() {
        dispose();
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    /* JADX INFO: renamed from: getCapacity */
    public final int getA() {
        return 0;
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final void recycle(Object obj) {
        obj.getClass();
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final void dispose() {
    }
}
