package io.ktor.utils.io.pool;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.m8;
import defpackage.u7;
import kotlin.Metadata;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/utils/io/pool/SingleInstancePool;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lio/ktor/utils/io/pool/ObjectPool;", "<init>", "()V", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SingleInstancePool<T> implements ObjectPool<T> {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    private volatile /* synthetic */ int borrowed = 0;
    private volatile /* synthetic */ int disposed = 0;
    private volatile /* synthetic */ Object instance = null;

    static {
        Unsafe unsafe = m8.a;
        a = unsafe.objectFieldOffset(SingleInstancePool.class.getDeclaredField("borrowed"));
        b = unsafe.objectFieldOffset(SingleInstancePool.class.getDeclaredField("disposed"));
    }

    public abstract void a();

    public abstract Object b();

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final Object borrow() {
        while (true) {
            int i = this.borrowed;
            if (i != 0) {
                u7.p("Instance is already consumed");
                return null;
            }
            SingleInstancePool<T> singleInstancePool = this;
            if (m8.a.compareAndSwapInt(singleInstancePool, a, i, 1)) {
                Object objB = singleInstancePool.b();
                singleInstancePool.instance = objB;
                return objB;
            }
            this = singleInstancePool;
        }
    }

    @Override // io.ktor.utils.io.pool.ObjectPool, java.lang.AutoCloseable
    public final void close() {
        dispose();
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final void dispose() {
        if (!m8.a.compareAndSwapInt(this, b, 0, 1) || this.instance == null) {
            return;
        }
        this.instance = null;
        a();
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    /* JADX INFO: renamed from: getCapacity */
    public final int getA() {
        return 1;
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final void recycle(Object obj) {
        obj.getClass();
        if (this.instance != obj) {
            if (this.instance != null || this.borrowed == 0) {
                u7.p("Unable to recycle irrelevant instance");
                return;
            } else {
                u7.p("Already recycled or an irrelevant instance tried to be recycled");
                return;
            }
        }
        this.instance = null;
        if (m8.a.compareAndSwapInt(this, b, 0, 1)) {
            a();
        } else {
            u7.p("An instance is already disposed");
        }
    }
}
