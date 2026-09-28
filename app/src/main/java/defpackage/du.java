package defpackage;

import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.Final;
import androidx.lifecycle.LiveDataScope;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class du implements FlowCollector {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ du(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object objF;
        int i = this.a;
        mk1 mk1Var = mk1.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                DataStoreImpl dataStoreImpl = (DataStoreImpl) obj2;
                return ((dataStoreImpl.h.a() instanceof Final) || (objF = dataStoreImpl.f(true, continuation)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? mk1Var : objF;
            case 1:
                Object objSend = ((ProducerScope) obj2).send(obj, continuation);
                return objSend == CoroutineSingletons.COROUTINE_SUSPENDED ? objSend : mk1Var;
            default:
                Object objEmit = ((LiveDataScope) obj2).emit(obj, continuation);
                return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : mk1Var;
        }
    }
}
