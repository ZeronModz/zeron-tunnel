package defpackage;

import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.controllers.BaseConstraintController;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wd implements ConstraintListener {
    public final /* synthetic */ BaseConstraintController a;
    public final /* synthetic */ ProducerScope b;

    public wd(BaseConstraintController baseConstraintController, ProducerScope producerScope) {
        this.a = baseConstraintController;
        this.b = producerScope;
    }

    @Override // androidx.work.impl.constraints.ConstraintListener
    public final void onConstraintChanged(Object obj) {
        BaseConstraintController baseConstraintController = this.a;
        this.b.getChannel().mo56trySendJP2dKIU(baseConstraintController.b(obj) ? new ConstraintsState.ConstraintsNotMet(baseConstraintController.a()) : ar.a);
    }
}
