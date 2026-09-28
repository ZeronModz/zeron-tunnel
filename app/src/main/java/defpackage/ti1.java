package defpackage;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ti1 {
    public final TypeVariable a;

    public ti1(TypeVariable typeVariable) {
        typeVariable.getClass();
        this.a = typeVariable;
    }

    public final boolean a(TypeVariable typeVariable) {
        TypeVariable typeVariable2 = this.a;
        return typeVariable2.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && typeVariable2.getName().equals(typeVariable.getName());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ti1) {
            return a(((ti1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        TypeVariable typeVariable = this.a;
        return Arrays.hashCode(new Object[]{typeVariable.getGenericDeclaration(), typeVariable.getName()});
    }

    public final String toString() {
        return this.a.toString();
    }
}
