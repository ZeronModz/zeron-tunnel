package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ta0 implements HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ViewModelStoreOwner {
    public final Fragment a;
    public final ViewModelStore b;
    public ViewModelProvider.Factory c;
    public LifecycleRegistry d = null;
    public SavedStateRegistryController e = null;

    public ta0(Fragment fragment, ViewModelStore viewModelStore) {
        this.a = fragment;
        this.b = viewModelStore;
    }

    public final void a(Lifecycle.Event event) {
        this.d.f(event);
    }

    public final void b() {
        if (this.d == null) {
            this.d = new LifecycleRegistry(this);
            SavedStateRegistryController.c.getClass();
            SavedStateRegistryController savedStateRegistryControllerA = SavedStateRegistryController.Companion.a(this);
            this.e = savedStateRegistryControllerA;
            savedStateRegistryControllerA.a.a();
            v.b(this);
        }
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.a;
        Context applicationContext = fragment.M().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (application != null) {
            mutableCreationExtras.b(ViewModelProvider.AndroidViewModelFactory.g, application);
        }
        mutableCreationExtras.b(v.a, this);
        mutableCreationExtras.b(v.b, this);
        Bundle bundle = fragment.g;
        if (bundle != null) {
            mutableCreationExtras.b(v.c, bundle);
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.a;
        ViewModelProvider.Factory defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (defaultViewModelProviderFactory != fragment.R) {
            this.c = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        ViewModelProvider.Factory factory = this.c;
        if (factory != null) {
            return factory;
        }
        Context applicationContext = fragment.M().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        SavedStateViewModelFactory savedStateViewModelFactory = new SavedStateViewModelFactory(application, this, fragment.g);
        this.c = savedStateViewModelFactory;
        return savedStateViewModelFactory;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        b();
        return this.d;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        b();
        return this.e.b;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        b();
        return this.b;
    }
}
