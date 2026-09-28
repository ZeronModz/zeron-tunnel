package defpackage;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yv implements ViewModelProvider.Factory {
    public static final yv a = new yv();

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(KClass kClass, CreationExtras creationExtras) {
        kClass.getClass();
        creationExtras.getClass();
        return l02.f(k02.l(kClass));
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class cls, CreationExtras creationExtras) {
        cls.getClass();
        creationExtras.getClass();
        create(cls);
        throw null;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class cls) {
        cls.getClass();
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
