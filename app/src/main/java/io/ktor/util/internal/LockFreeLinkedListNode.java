package io.ktor.util.internal;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.m8;
import defpackage.u7;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "CondAddOp", "AddLastDesc", "RemoveFirstDesc", "AbstractAtomicDesc", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class LockFreeLinkedListNode {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object removedRef = null;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "Lio/ktor/util/internal/AtomicDesc;", "<init>", "()V", "PrepareOp", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AbstractAtomicDesc extends AtomicDesc {

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc$PrepareOp;", "Lio/ktor/util/internal/OpDescriptor;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "next", "Lio/ktor/util/internal/AtomicOp;", "op", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "desc", "<init>", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/AtomicOp;Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class PrepareOp extends OpDescriptor {
            public final LockFreeLinkedListNode a;
            public final AtomicOp b;
            public final AbstractAtomicDesc c;

            public PrepareOp(LockFreeLinkedListNode lockFreeLinkedListNode, AtomicOp<? super LockFreeLinkedListNode> atomicOp, AbstractAtomicDesc abstractAtomicDesc) {
                lockFreeLinkedListNode.getClass();
                atomicOp.getClass();
                abstractAtomicDesc.getClass();
                this.a = lockFreeLinkedListNode;
                this.b = atomicOp;
                this.c = abstractAtomicDesc;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // io.ktor.util.internal.OpDescriptor
            public final Object a(LockFreeLinkedListNode lockFreeLinkedListNode) {
                AbstractAtomicDesc abstractAtomicDesc = this.c;
                LockFreeLinkedListNode lockFreeLinkedListNode2 = this.a;
                abstractAtomicDesc.a(lockFreeLinkedListNode, lockFreeLinkedListNode2);
                AtomicOp atomicOp = this.b;
                Object obj = lockFreeLinkedListNode2;
                if (!atomicOp.c()) {
                    obj = atomicOp;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.a;
                while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, this, obj) && atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) == this) {
                }
                return null;
            }
        }

        public abstract void a(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2);
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020\u0004B\u001b\u0012\n\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AddLastDesc;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "queue", "node", "<init>", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class AddLastDesc<T extends LockFreeLinkedListNode> extends AbstractAtomicDesc {
        public static final /* synthetic */ long a = m8.a.objectFieldOffset(AddLastDesc.class.getDeclaredField("_affectedNode"));
        private volatile /* synthetic */ Object _affectedNode;

        public AddLastDesc(LockFreeLinkedListNode lockFreeLinkedListNode, T t) {
            lockFreeLinkedListNode.getClass();
            t.getClass();
            if (t._next == t && t._prev == t) {
                this._affectedNode = null;
            } else {
                u7.p("Check failed.");
                throw null;
            }
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final void a(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2) {
            lockFreeLinkedListNode2.getClass();
            while (true) {
                Unsafe unsafe = m8.a;
                long j = a;
                AddLastDesc<T> addLastDesc = this;
                LockFreeLinkedListNode lockFreeLinkedListNode3 = lockFreeLinkedListNode;
                if (unsafe.compareAndSwapObject(addLastDesc, j, (Object) null, lockFreeLinkedListNode3) || unsafe.getObjectVolatile(addLastDesc, j) != null) {
                    return;
                }
                this = addLastDesc;
                lockFreeLinkedListNode = lockFreeLinkedListNode3;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "Lio/ktor/util/internal/AtomicOp;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "newNode", "<init>", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class CondAddOp extends AtomicOp<LockFreeLinkedListNode> {
        public final LockFreeLinkedListNode b;

        public CondAddOp(LockFreeLinkedListNode lockFreeLinkedListNode) {
            lockFreeLinkedListNode.getClass();
            this.b = lockFreeLinkedListNode;
        }

        @Override // io.ktor.util.internal.AtomicOp
        public final void b(LockFreeLinkedListNode lockFreeLinkedListNode, Object obj) {
            boolean z = obj == null;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = z ? this.b : null;
            if (lockFreeLinkedListNode2 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.a;
                while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, this, lockFreeLinkedListNode2)) {
                    if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) != this) {
                        return;
                    }
                }
                if (z) {
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$RemoveFirstDesc;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "queue", "<init>", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class RemoveFirstDesc<T> extends AbstractAtomicDesc {
        public static final /* synthetic */ long a;
        public static final /* synthetic */ long b;
        private volatile /* synthetic */ Object _affectedNode;
        private volatile /* synthetic */ Object _originalNext;

        static {
            Unsafe unsafe = m8.a;
            a = unsafe.objectFieldOffset(RemoveFirstDesc.class.getDeclaredField("_affectedNode"));
            b = unsafe.objectFieldOffset(RemoveFirstDesc.class.getDeclaredField("_originalNext"));
        }

        public RemoveFirstDesc(LockFreeLinkedListNode lockFreeLinkedListNode) {
            lockFreeLinkedListNode.getClass();
            this._affectedNode = null;
            this._originalNext = null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final void a(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2) {
            RemoveFirstDesc<T> removeFirstDesc;
            lockFreeLinkedListNode2.getClass();
            if (lockFreeLinkedListNode instanceof LockFreeLinkedListHead) {
                u7.p("Check failed.");
                return;
            }
            while (true) {
                Unsafe unsafe = m8.a;
                long j = a;
                removeFirstDesc = this;
                LockFreeLinkedListNode lockFreeLinkedListNode3 = lockFreeLinkedListNode;
                if (unsafe.compareAndSwapObject(removeFirstDesc, j, (Object) null, lockFreeLinkedListNode3) || unsafe.getObjectVolatile(removeFirstDesc, j) != null) {
                    break;
                }
                this = removeFirstDesc;
                lockFreeLinkedListNode = lockFreeLinkedListNode3;
            }
            while (true) {
                Unsafe unsafe2 = m8.a;
                long j2 = b;
                LockFreeLinkedListNode lockFreeLinkedListNode4 = lockFreeLinkedListNode2;
                if (unsafe2.compareAndSwapObject(removeFirstDesc, j2, (Object) null, lockFreeLinkedListNode4) || unsafe2.getObjectVolatile(removeFirstDesc, j2) != null) {
                    return;
                } else {
                    lockFreeLinkedListNode2 = lockFreeLinkedListNode4;
                }
            }
        }
    }

    static {
        Unsafe unsafe = m8.a;
        d = unsafe.objectFieldOffset(LockFreeLinkedListNode.class.getDeclaredField("_next"));
        b = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev");
        e = unsafe.objectFieldOffset(LockFreeLinkedListNode.class.getDeclaredField("_prev"));
        c = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "removedRef");
    }

    public final void a(LockFreeLinkedListNode lockFreeLinkedListNode) {
        LockFreeLinkedListNode lockFreeLinkedListNode2;
        LockFreeLinkedListNode lockFreeLinkedListNode3;
        Unsafe unsafe;
        long j;
        loop0: while (true) {
            Object obj = this._prev;
            if (!(obj instanceof Removed)) {
                obj.getClass();
                LockFreeLinkedListNode lockFreeLinkedListNode4 = (LockFreeLinkedListNode) obj;
                if (lockFreeLinkedListNode4.c() != this) {
                    this.b(lockFreeLinkedListNode4);
                }
            }
            LockFreeLinkedListNode lockFreeLinkedListNode5 = (LockFreeLinkedListNode) obj;
            b.lazySet(lockFreeLinkedListNode, lockFreeLinkedListNode5);
            a.lazySet(lockFreeLinkedListNode, this);
            while (true) {
                Unsafe unsafe2 = m8.a;
                long j2 = d;
                lockFreeLinkedListNode2 = this;
                lockFreeLinkedListNode3 = lockFreeLinkedListNode;
                if (unsafe2.compareAndSwapObject(lockFreeLinkedListNode5, j2, lockFreeLinkedListNode2, lockFreeLinkedListNode3)) {
                    break loop0;
                }
                lockFreeLinkedListNode = lockFreeLinkedListNode3;
                if (unsafe2.getObjectVolatile(lockFreeLinkedListNode5, j2) != lockFreeLinkedListNode2) {
                    this = lockFreeLinkedListNode2;
                    break;
                }
                this = lockFreeLinkedListNode2;
            }
        }
        LockFreeLinkedListHead lockFreeLinkedListHead = (LockFreeLinkedListHead) lockFreeLinkedListNode2;
        while (true) {
            Object obj2 = lockFreeLinkedListHead._prev;
            if ((obj2 instanceof Removed) || lockFreeLinkedListNode3.c() != lockFreeLinkedListHead) {
                return;
            }
            do {
                unsafe = m8.a;
                j = e;
                if (unsafe.compareAndSwapObject(lockFreeLinkedListHead, j, obj2, lockFreeLinkedListNode3)) {
                    if (lockFreeLinkedListNode3.c() instanceof Removed) {
                        obj2.getClass();
                        lockFreeLinkedListHead.b((LockFreeLinkedListNode) obj2);
                        return;
                    }
                    return;
                }
            } while (unsafe.getObjectVolatile(lockFreeLinkedListHead, j) == obj2);
        }
    }

    public final void b(LockFreeLinkedListNode lockFreeLinkedListNode) {
        LockFreeLinkedListNode lockFreeLinkedListNode2;
        LockFreeLinkedListNode lockFreeLinkedListNode3;
        LockFreeLinkedListNode lockFreeLinkedListNode4;
        LockFreeLinkedListNode lockFreeLinkedListNodeA = lockFreeLinkedListNode;
        LockFreeLinkedListNode lockFreeLinkedListNode5 = null;
        while (true) {
            Object obj = lockFreeLinkedListNodeA._next;
            if (obj == null) {
                return;
            }
            if (obj instanceof OpDescriptor) {
                ((OpDescriptor) obj).a(lockFreeLinkedListNodeA);
                lockFreeLinkedListNode2 = lockFreeLinkedListNode5;
                lockFreeLinkedListNode3 = this;
            } else if (!(obj instanceof Removed)) {
                lockFreeLinkedListNode2 = lockFreeLinkedListNode5;
                LockFreeLinkedListNode lockFreeLinkedListNode6 = lockFreeLinkedListNodeA;
                Object obj2 = this._prev;
                if (obj2 instanceof Removed) {
                    return;
                }
                if (obj != this) {
                    obj.getClass();
                    lockFreeLinkedListNodeA = (LockFreeLinkedListNode) obj;
                    lockFreeLinkedListNode5 = lockFreeLinkedListNode6;
                } else {
                    if (obj2 == lockFreeLinkedListNode6) {
                        return;
                    }
                    while (true) {
                        Unsafe unsafe = m8.a;
                        long j = e;
                        lockFreeLinkedListNode3 = this;
                        boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(lockFreeLinkedListNode3, j, obj2, lockFreeLinkedListNode6);
                        Object obj3 = obj2;
                        lockFreeLinkedListNodeA = lockFreeLinkedListNode6;
                        if (zCompareAndSwapObject) {
                            if (!(lockFreeLinkedListNodeA._prev instanceof Removed)) {
                                return;
                            }
                        } else {
                            if (unsafe.getObjectVolatile(lockFreeLinkedListNode3, j) != obj3) {
                                break;
                            }
                            this = lockFreeLinkedListNode3;
                            lockFreeLinkedListNode6 = lockFreeLinkedListNodeA;
                            obj2 = obj3;
                        }
                    }
                }
            } else if (lockFreeLinkedListNode5 != null) {
                lockFreeLinkedListNodeA.d();
                LockFreeLinkedListNode lockFreeLinkedListNode7 = ((Removed) obj).a;
                while (true) {
                    Unsafe unsafe2 = m8.a;
                    long j2 = d;
                    lockFreeLinkedListNode4 = lockFreeLinkedListNode5;
                    if (unsafe2.compareAndSwapObject(lockFreeLinkedListNode5, j2, lockFreeLinkedListNodeA, lockFreeLinkedListNode7) || unsafe2.getObjectVolatile(lockFreeLinkedListNode4, j2) != lockFreeLinkedListNodeA) {
                        break;
                    } else {
                        lockFreeLinkedListNode5 = lockFreeLinkedListNode4;
                    }
                }
                lockFreeLinkedListNode5 = null;
                lockFreeLinkedListNodeA = lockFreeLinkedListNode4;
            } else {
                lockFreeLinkedListNodeA = a.a(lockFreeLinkedListNodeA._prev);
            }
            this = lockFreeLinkedListNode3;
            lockFreeLinkedListNode5 = lockFreeLinkedListNode2;
        }
    }

    public final Object c() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof OpDescriptor)) {
                return obj;
            }
            ((OpDescriptor) obj).a(this);
        }
    }

    public final LockFreeLinkedListNode d() {
        LockFreeLinkedListNode lockFreeLinkedListNodeA;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        while (true) {
            Object obj = this._prev;
            if (obj instanceof Removed) {
                return ((Removed) obj).a;
            }
            if (obj == this) {
                lockFreeLinkedListNodeA = this;
                while (!(lockFreeLinkedListNodeA instanceof LockFreeLinkedListHead)) {
                    lockFreeLinkedListNodeA = a.a(lockFreeLinkedListNodeA.c());
                    if (lockFreeLinkedListNodeA == this) {
                        u7.p("Cannot loop to this while looking for list head");
                        return null;
                    }
                }
            } else {
                obj.getClass();
                lockFreeLinkedListNodeA = (LockFreeLinkedListNode) obj;
            }
            Removed removedE = lockFreeLinkedListNodeA.e();
            while (true) {
                Unsafe unsafe = m8.a;
                long j = e;
                lockFreeLinkedListNode = this;
                if (unsafe.compareAndSwapObject(lockFreeLinkedListNode, j, obj, removedE)) {
                    return (LockFreeLinkedListNode) obj;
                }
                if (unsafe.getObjectVolatile(lockFreeLinkedListNode, j) != obj) {
                    break;
                }
                this = lockFreeLinkedListNode;
            }
            this = lockFreeLinkedListNode;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        r12.d();
        r13 = ((io.ktor.util.internal.Removed) r0).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        r8 = defpackage.m8.a;
        r10 = io.ktor.util.internal.LockFreeLinkedListNode.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r8.compareAndSwapObject(r9, r10, r12, r13) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r8.getObjectVolatile(r9, r10) == r12) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dispose() {
        /*
            r14 = this;
        L0:
            java.lang.Object r4 = r14.c()
            boolean r0 = r4 instanceof io.ktor.util.internal.Removed
            if (r0 == 0) goto La
            goto L92
        La:
            if (r4 != r14) goto Le
            goto L92
        Le:
            r4.getClass()
            r6 = r4
            io.ktor.util.internal.LockFreeLinkedListNode r6 = (io.ktor.util.internal.LockFreeLinkedListNode) r6
            io.ktor.util.internal.Removed r5 = r6.e()
        L18:
            sun.misc.Unsafe r0 = defpackage.m8.a
            long r2 = io.ktor.util.internal.LockFreeLinkedListNode.d
            r1 = r14
            boolean r7 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r7 == 0) goto L9b
            io.ktor.util.internal.LockFreeLinkedListNode r0 = r14.d()
            java.lang.Object r2 = r14._next
            r2.getClass()
            io.ktor.util.internal.Removed r2 = (io.ktor.util.internal.Removed) r2
            io.ktor.util.internal.LockFreeLinkedListNode r2 = r2.a
            r7 = 0
            r12 = r0
            r5 = r2
        L33:
            r9 = r7
        L34:
            java.lang.Object r0 = r5.c()
            boolean r2 = r0 instanceof io.ktor.util.internal.Removed
            if (r2 == 0) goto L44
            r5.d()
            io.ktor.util.internal.Removed r0 = (io.ktor.util.internal.Removed) r0
            io.ktor.util.internal.LockFreeLinkedListNode r5 = r0.a
            goto L34
        L44:
            java.lang.Object r0 = r12.c()
            boolean r2 = r0 instanceof io.ktor.util.internal.Removed
            if (r2 == 0) goto L6f
            if (r9 == 0) goto L68
            r12.d()
            io.ktor.util.internal.Removed r0 = (io.ktor.util.internal.Removed) r0
            io.ktor.util.internal.LockFreeLinkedListNode r13 = r0.a
        L55:
            sun.misc.Unsafe r8 = defpackage.m8.a
            long r10 = io.ktor.util.internal.LockFreeLinkedListNode.d
            boolean r0 = r8.compareAndSwapObject(r9, r10, r12, r13)
            if (r0 == 0) goto L60
            goto L66
        L60:
            java.lang.Object r0 = r8.getObjectVolatile(r9, r10)
            if (r0 == r12) goto L55
        L66:
            r12 = r9
            goto L33
        L68:
            java.lang.Object r0 = r12._prev
            io.ktor.util.internal.LockFreeLinkedListNode r0 = io.ktor.util.internal.a.a(r0)
            goto L7a
        L6f:
            if (r0 == r14) goto L7c
            r0.getClass()
            io.ktor.util.internal.LockFreeLinkedListNode r0 = (io.ktor.util.internal.LockFreeLinkedListNode) r0
            if (r0 != r5) goto L79
            goto L89
        L79:
            r9 = r12
        L7a:
            r12 = r0
            goto L34
        L7c:
            sun.misc.Unsafe r0 = defpackage.m8.a
            long r2 = io.ktor.util.internal.LockFreeLinkedListNode.d
            r4 = r14
            r1 = r12
            boolean r8 = r0.compareAndSwapObject(r1, r2, r4, r5)
            r1 = r5
            if (r8 == 0) goto L93
        L89:
            java.lang.Object r0 = r14._prev
            io.ktor.util.internal.LockFreeLinkedListNode r0 = io.ktor.util.internal.a.a(r0)
            r6.b(r0)
        L92:
            return
        L93:
            java.lang.Object r0 = r0.getObjectVolatile(r12, r2)
            r5 = r1
            if (r0 == r14) goto L7c
            goto L34
        L9b:
            java.lang.Object r0 = r0.getObjectVolatile(r14, r2)
            if (r0 == r4) goto L18
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.internal.LockFreeLinkedListNode.dispose():void");
    }

    public final Removed e() {
        Removed removed = (Removed) this.removedRef;
        if (removed != null) {
            return removed;
        }
        Removed removed2 = new Removed(this);
        c.lazySet(this, removed2);
        return removed2;
    }

    public final String toString() {
        return Reflection.a(getClass()).getSimpleName() + '@' + hashCode();
    }
}
