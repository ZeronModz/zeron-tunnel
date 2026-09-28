package defpackage;

import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.DispatchQueue;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleController;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class np implements LifecycleEventObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ np(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                OnBackPressedDispatcher onBackPressedDispatcher = (OnBackPressedDispatcher) obj2;
                ComponentActivity componentActivity = (ComponentActivity) obj;
                int i2 = ComponentActivity.a;
                lifecycleOwner.getClass();
                event.getClass();
                if (event == Lifecycle.Event.ON_CREATE) {
                    onBackPressedDispatcher.f = v1.d(componentActivity);
                    onBackPressedDispatcher.d(onBackPressedDispatcher.h);
                }
                break;
            case 1:
                LifecycleController lifecycleController = (LifecycleController) obj2;
                Job job = (Job) obj;
                lifecycleOwner.getClass();
                event.getClass();
                if (lifecycleOwner.getLifecycle().getD() == Lifecycle.State.DESTROYED) {
                    job.cancel((CancellationException) null);
                    lifecycleController.a();
                    break;
                } else {
                    int iCompareTo = lifecycleOwner.getLifecycle().getD().compareTo(lifecycleController.b);
                    DispatchQueue dispatchQueue = lifecycleController.c;
                    if (iCompareTo < 0) {
                        dispatchQueue.a = true;
                        break;
                    } else if (dispatchQueue.a) {
                        if (!dispatchQueue.b) {
                            dispatchQueue.a = false;
                            dispatchQueue.a();
                        } else {
                            u7.p("Cannot resume a finished dispatcher");
                        }
                        break;
                    }
                }
                break;
            default:
                MenuHostHelper menuHostHelper = (MenuHostHelper) obj2;
                MenuProvider menuProvider = (MenuProvider) obj;
                menuHostHelper.getClass();
                if (event == Lifecycle.Event.ON_DESTROY) {
                    menuHostHelper.c(menuProvider);
                }
                break;
        }
    }
}
