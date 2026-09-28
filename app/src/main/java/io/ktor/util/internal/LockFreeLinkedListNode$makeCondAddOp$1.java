package io.ktor.util.internal;

import io.ktor.util.internal.LockFreeLinkedListNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"io/ktor/util/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 176)
public final class LockFreeLinkedListNode$makeCondAddOp$1 extends LockFreeLinkedListNode.CondAddOp {
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockFreeLinkedListNode$makeCondAddOp$1(LockFreeLinkedListNode lockFreeLinkedListNode, Function0<Boolean> function0) {
        super(lockFreeLinkedListNode);
        this.c = function0;
    }

    @Override // io.ktor.util.internal.AtomicOp
    public final Object d(LockFreeLinkedListNode lockFreeLinkedListNode) {
        if (((Boolean) this.c.invoke()).booleanValue()) {
            return null;
        }
        return a.a;
    }
}
