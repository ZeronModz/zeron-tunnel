package io.ktor.events;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import defpackage.t;
import defpackage.z3;
import io.ktor.util.collections.CopyOnWriteHashMap;
import io.ktor.util.internal.LockFreeLinkedListHead;
import io.ktor.util.internal.LockFreeLinkedListNode;
import io.ktor.util.internal.a;
import kotlin.Metadata;
import kotlin.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.DisposableHandle;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lio/ktor/events/Events;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "HandlerRegistration", "ktor-events"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Events {
    public final CopyOnWriteHashMap a = new CopyOnWriteHashMap();

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u0003j\u0006\u0012\u0002\b\u0003`\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/events/Events$HandlerRegistration;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlin/Function1;", "Lmk1;", "Lio/ktor/events/EventHandler;", "handler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ktor-events"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HandlerRegistration extends LockFreeLinkedListNode implements DisposableHandle {
        public final Function1 f;

        public HandlerRegistration(Function1<?, mk1> function1) {
            function1.getClass();
            this.f = function1;
        }
    }

    public final void a(EventDefinition eventDefinition, Object obj) {
        eventDefinition.getClass();
        LockFreeLinkedListHead lockFreeLinkedListHead = (LockFreeLinkedListHead) this.a.b(eventDefinition);
        Throwable th = null;
        if (lockFreeLinkedListHead != null) {
            Object objC = lockFreeLinkedListHead.c();
            objC.getClass();
            for (LockFreeLinkedListNode lockFreeLinkedListNodeA = (LockFreeLinkedListNode) objC; !lockFreeLinkedListNodeA.equals(lockFreeLinkedListHead); lockFreeLinkedListNodeA = a.a(lockFreeLinkedListNodeA.c())) {
                if (lockFreeLinkedListNodeA instanceof HandlerRegistration) {
                    try {
                        Function1 function1 = ((HandlerRegistration) lockFreeLinkedListNodeA).f;
                        function1.getClass();
                        TypeIntrinsics.c(1, function1);
                        function1.invoke(obj);
                    } catch (Throwable th2) {
                        if (th != null) {
                            b.a(th, th2);
                        } else {
                            th = th2;
                        }
                    }
                }
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final void b(EventDefinition eventDefinition, t tVar) {
        ((LockFreeLinkedListHead) this.a.a(eventDefinition, new z3(11))).a(new HandlerRegistration(tVar));
    }
}
