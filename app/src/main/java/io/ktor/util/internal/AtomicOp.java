package io.ktor.util.internal;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.m8;
import defpackage.u7;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/util/internal/AtomicOp;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lio/ktor/util/internal/OpDescriptor;", "<init>", "()V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AtomicOp<T> extends OpDescriptor {
    public static final /* synthetic */ long a = m8.a.objectFieldOffset(AtomicOp.class.getDeclaredField("consensus"));
    private volatile /* synthetic */ Object consensus = a.c;

    @Override // io.ktor.util.internal.OpDescriptor
    public final Object a(LockFreeLinkedListNode lockFreeLinkedListNode) {
        AtomicOp<T> atomicOp;
        Object obj = this.consensus;
        if (obj == a.c) {
            Object objD = d(lockFreeLinkedListNode);
            Object obj2 = a.c;
            boolean z = false;
            if (objD != obj2) {
                while (true) {
                    atomicOp = this;
                    if (m8.a.compareAndSwapObject(atomicOp, a, obj2, objD)) {
                        z = true;
                        break;
                    }
                    if (m8.a.getObjectVolatile(atomicOp, a) != obj2) {
                        break;
                    }
                    this = atomicOp;
                }
            } else {
                atomicOp = this;
                u7.p("Check failed.");
            }
            obj = z ? objD : atomicOp.consensus;
        } else {
            atomicOp = this;
        }
        atomicOp.b(lockFreeLinkedListNode, obj);
        return obj;
    }

    public abstract void b(LockFreeLinkedListNode lockFreeLinkedListNode, Object obj);

    public final boolean c() {
        return this.consensus != a.c;
    }

    public abstract Object d(LockFreeLinkedListNode lockFreeLinkedListNode);
}
