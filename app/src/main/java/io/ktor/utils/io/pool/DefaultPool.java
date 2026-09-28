package io.ktor.utils.io.pool;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;
import defpackage.m8;
import defpackage.u7;
import defpackage.zu0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/utils/io/pool/DefaultPool;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lio/ktor/utils/io/pool/ObjectPool;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "capacity", "<init>", "(I)V", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DefaultPool<T> implements ObjectPool<T> {
    public static final /* synthetic */ long f = m8.a.objectFieldOffset(DefaultPool.class.getDeclaredField("top"));
    public final int a;
    public final int b;
    public final int c;
    public final AtomicReferenceArray d;
    public final int[] e;
    private volatile /* synthetic */ long top;

    public DefaultPool(int i) {
        this.a = i;
        if (i <= 0) {
            zu0.e(hz.o(i, "capacity should be positive but it is "));
            throw null;
        }
        if (i > 536870911) {
            zu0.e(hz.o(i, "capacity should be less or equal to 536870911 but it is "));
            throw null;
        }
        this.top = 0L;
        int iHighestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
        this.b = iHighestOneBit;
        this.c = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        this.d = new AtomicReferenceArray(iHighestOneBit + 1);
        this.e = new int[iHighestOneBit + 1];
    }

    public abstract Object b();

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final Object borrow() {
        Object objC = c();
        return objC != null ? a(objC) : b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        r8 = 0;
        r1 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c() {
        /*
            r10 = this;
        L0:
            long r4 = r10.top
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto Lc
        L9:
            r8 = r1
            r1 = r10
            goto L31
        Lc:
            r0 = 32
            long r2 = r4 >> r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            r8 = 1
            long r2 = r2 + r8
            long r6 = r6 & r4
            int r8 = (int) r6
            if (r8 != 0) goto L1e
            goto L9
        L1e:
            int[] r1 = r10.e
            r1 = r1[r8]
            long r2 = r2 << r0
            long r0 = (long) r1
            long r6 = r2 | r0
            sun.misc.Unsafe r0 = defpackage.m8.a
            long r2 = io.ktor.utils.io.pool.DefaultPool.f
            r1 = r10
            boolean r10 = r0.compareAndSwapLong(r1, r2, r4, r6)
            if (r10 == 0) goto L3c
        L31:
            r10 = 0
            if (r8 != 0) goto L35
            return r10
        L35:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.d
            java.lang.Object r10 = r0.getAndSet(r8, r10)
            return r10
        L3c:
            r10 = r1
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.pool.DefaultPool.c():java.lang.Object");
    }

    @Override // io.ktor.utils.io.pool.ObjectPool, java.lang.AutoCloseable
    public final void close() {
        dispose();
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final void dispose() {
        while (c() != null) {
        }
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    /* JADX INFO: renamed from: getCapacity, reason: from getter */
    public final int getA() {
        return this.a;
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final void recycle(Object obj) {
        obj.getClass();
        d(obj);
        int iIdentityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.c) + 1;
        int i = 0;
        while (i < 8) {
            AtomicReferenceArray atomicReferenceArray = this.d;
            while (!atomicReferenceArray.compareAndSet(iIdentityHashCode, null, obj)) {
                DefaultPool<T> defaultPool = this;
                if (atomicReferenceArray.get(iIdentityHashCode) != null) {
                    iIdentityHashCode--;
                    if (iIdentityHashCode == 0) {
                        iIdentityHashCode = defaultPool.b;
                    }
                    i++;
                    this = defaultPool;
                } else {
                    this = defaultPool;
                }
            }
            if (iIdentityHashCode <= 0) {
                u7.r("index should be positive");
                return;
            }
            while (true) {
                long j = this.top;
                long j2 = ((((j >> 32) & 4294967295L) + 1) << 32) | ((long) iIdentityHashCode);
                this.e[iIdentityHashCode] = (int) (4294967295L & j);
                DefaultPool<T> defaultPool2 = this;
                if (m8.a.compareAndSwapLong(defaultPool2, f, j, j2)) {
                    return;
                } else {
                    this = defaultPool2;
                }
            }
        }
    }

    public Object a(Object obj) {
        return obj;
    }

    public void d(Object obj) {
    }
}
