package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.a;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.NavHostFragment;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class js0 implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {
    public final Context a;
    public final NavDestination b;
    public Bundle c;
    public final LifecycleRegistry d;
    public final SavedStateRegistryController e;
    public final UUID f;
    public Lifecycle.State g;
    public Lifecycle.State h;
    public final ns0 i;
    public SavedStateViewModelFactory j;

    public js0(Context context, NavDestination navDestination, Bundle bundle, LifecycleOwner lifecycleOwner, ns0 ns0Var, UUID uuid, Bundle bundle2) {
        this.d = new LifecycleRegistry(this);
        SavedStateRegistryController.c.getClass();
        SavedStateRegistryController savedStateRegistryControllerA = SavedStateRegistryController.Companion.a(this);
        this.e = savedStateRegistryControllerA;
        this.g = Lifecycle.State.CREATED;
        this.h = Lifecycle.State.RESUMED;
        this.a = context;
        this.f = uuid;
        this.b = navDestination;
        this.c = bundle;
        this.i = ns0Var;
        savedStateRegistryControllerA.a(bundle2);
        if (lifecycleOwner != null) {
            this.g = lifecycleOwner.getLifecycle().getD();
        }
    }

    public final void a() {
        int iOrdinal = this.g.ordinal();
        int iOrdinal2 = this.h.ordinal();
        LifecycleRegistry lifecycleRegistry = this.d;
        if (iOrdinal < iOrdinal2) {
            lifecycleRegistry.h(this.g);
        } else {
            lifecycleRegistry.h(this.h);
        }
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final CreationExtras getDefaultViewModelCreationExtras() {
        return a.c;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        SavedStateViewModelFactory savedStateViewModelFactory = this.j;
        if (savedStateViewModelFactory != null) {
            return savedStateViewModelFactory;
        }
        SavedStateViewModelFactory savedStateViewModelFactory2 = new SavedStateViewModelFactory((Application) this.a.getApplicationContext(), this, this.c);
        this.j = savedStateViewModelFactory2;
        return savedStateViewModelFactory2;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.d;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.e.b;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        ns0 ns0Var = this.i;
        if (ns0Var == null) {
            u7.p("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        HashMap map = ns0Var.a;
        UUID uuid = this.f;
        ViewModelStore viewModelStore = (ViewModelStore) map.get(uuid);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        map.put(uuid, viewModelStore2);
        return viewModelStore2;
    }

    public js0(Context context, NavDestination navDestination, Bundle bundle, NavHostFragment navHostFragment, ns0 ns0Var) {
        this(context, navDestination, bundle, navHostFragment, ns0Var, UUID.randomUUID(), null);
    }
}
