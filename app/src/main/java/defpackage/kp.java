package defpackage;

import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.internal.SavedStateRegistryImpl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kp implements LifecycleEventObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Window window;
        View viewPeekDecorView;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                int i2 = ComponentActivity.a;
                lifecycleOwner.getClass();
                event.getClass();
                if (event == Lifecycle.Event.ON_STOP && (window = componentActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                ComponentActivity.a((ComponentActivity) obj, lifecycleOwner, event);
                break;
            default:
                SavedStateRegistryImpl savedStateRegistryImpl = (SavedStateRegistryImpl) obj;
                int i3 = SavedStateRegistryImpl.i;
                lifecycleOwner.getClass();
                event.getClass();
                if (event == Lifecycle.Event.ON_START) {
                    savedStateRegistryImpl.h = true;
                } else if (event == Lifecycle.Event.ON_STOP) {
                    savedStateRegistryImpl.h = false;
                }
                break;
        }
    }
}
