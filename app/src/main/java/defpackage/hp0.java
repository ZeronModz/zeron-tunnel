package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hp0 {
    public final Lifecycle a;
    public LifecycleEventObserver b;

    public hp0(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        this.a = lifecycle;
        this.b = lifecycleEventObserver;
        lifecycle.a(lifecycleEventObserver);
    }
}
