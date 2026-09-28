package defpackage;

import com.google.common.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zg0 implements AnnotatedElement, Member {
    public final AccessibleObject a;
    public final Member b;

    static {
        try {
            Class.forName("java.lang.reflect.AnnotatedType");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zg0(AccessibleObject accessibleObject) {
        this.a = accessibleObject;
        this.b = (Member) accessibleObject;
    }

    public abstract TypeToken a();

    public final boolean equals(Object obj) {
        if (!(obj instanceof zg0)) {
            return false;
        }
        zg0 zg0Var = (zg0) obj;
        return a().equals(zg0Var.a()) && this.b.equals(zg0Var.b);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation getAnnotation(Class cls) {
        return this.a.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return this.a.getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.Member
    public final Class getDeclaringClass() {
        return this.b.getDeclaringClass();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.b.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.b.getName();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class cls) {
        return this.a.isAnnotationPresent(cls);
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.b.isSynthetic();
    }
}
