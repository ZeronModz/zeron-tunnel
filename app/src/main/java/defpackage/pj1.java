package defpackage;

import com.google.common.reflect.b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class pj1 extends gj1 {
    public final /* synthetic */ AtomicReference b;

    public pj1(AtomicReference atomicReference) {
        this.b = atomicReference;
    }

    @Override // defpackage.gj1
    public final void b(Class cls) {
        this.b.set(cls.getComponentType());
    }

    @Override // defpackage.gj1
    public final void c(GenericArrayType genericArrayType) {
        this.b.set(genericArrayType.getGenericComponentType());
    }

    @Override // defpackage.gj1
    public final void e(TypeVariable typeVariable) {
        this.b.set(b.f(typeVariable.getBounds()));
    }

    @Override // defpackage.gj1
    public final void f(WildcardType wildcardType) {
        this.b.set(b.f(wildcardType.getUpperBounds()));
    }
}
