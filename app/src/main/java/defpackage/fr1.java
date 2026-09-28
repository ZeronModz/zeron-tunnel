package defpackage;

import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.model.WorkSpec;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fr1 implements FlowCollector {
    public final /* synthetic */ OnConstraintsStateChangedListener a;
    public final /* synthetic */ WorkSpec b;

    public fr1(OnConstraintsStateChangedListener onConstraintsStateChangedListener, WorkSpec workSpec) {
        this.a = onConstraintsStateChangedListener;
        this.b = workSpec;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        this.a.onConstraintsStateChanged(this.b, (ConstraintsState) obj);
        return mk1.a;
    }
}
