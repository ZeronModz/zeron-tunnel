package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xf implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, final Object obj3) {
        int i = this.a;
        mk1 mk1Var = mk1.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                final BufferedChannel bufferedChannel = (BufferedChannel) obj4;
                final SelectInstance selectInstance = (SelectInstance) obj;
                AtomicLongFieldUpdater atomicLongFieldUpdater = BufferedChannel.d;
                return new Function3() { // from class: zf
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = BufferedChannel.d;
                        Symbol symbol = ag.l;
                        Object obj8 = obj3;
                        if (obj8 != symbol) {
                            qj1.j(bufferedChannel.b, obj8, selectInstance.getContext());
                        }
                        return mk1.a;
                    }
                };
            case 1:
                int i2 = CancellableContinuationImpl.i;
                ((Function1) obj4).invoke((Throwable) obj);
                return mk1Var;
            case 2:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MutexImpl.j;
                return new yf(1, (MutexImpl) obj4, obj2);
            default:
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = SemaphoreAndMutexImpl.c;
                ((SemaphoreAndMutexImpl) obj4).release();
                return mk1Var;
        }
    }
}
