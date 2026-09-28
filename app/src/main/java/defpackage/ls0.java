package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavController;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ls0 implements LifecycleEventObserver {
    public final /* synthetic */ NavController a;

    public ls0(NavController navController) {
        this.a = navController;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Lifecycle.State state;
        NavController navController = this.a;
        if (navController.d != null) {
            for (js0 js0Var : navController.h) {
                js0Var.getClass();
                switch (is0.a[event.ordinal()]) {
                    case 1:
                    case 2:
                        state = Lifecycle.State.CREATED;
                        break;
                    case 3:
                    case 4:
                        state = Lifecycle.State.STARTED;
                        break;
                    case 5:
                        state = Lifecycle.State.RESUMED;
                        break;
                    case 6:
                        state = Lifecycle.State.DESTROYED;
                        break;
                    default:
                        p60.e(event, "Unexpected event value ");
                        return;
                }
                js0Var.g = state;
                js0Var.a();
            }
        }
    }
}
