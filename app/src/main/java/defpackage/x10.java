package defpackage;

import io.ktor.http.Headers;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x10 implements Headers {
    public static final x10 a = new x10();

    @Override // io.ktor.util.StringValues
    public final boolean contains(String str, String str2) {
        str.getClass();
        str2.getClass();
        return false;
    }

    @Override // io.ktor.util.StringValues
    public final Set entries() {
        return EmptySet.INSTANCE;
    }

    @Override // io.ktor.util.StringValues
    public final void forEach(Function2 function2) {
        function2.getClass();
        ii2.h(this, function2);
    }

    @Override // io.ktor.util.StringValues
    public final String get(String str) {
        str.getClass();
        return null;
    }

    @Override // io.ktor.util.StringValues
    public final List getAll(String str) {
        str.getClass();
        return null;
    }

    @Override // io.ktor.util.StringValues
    /* JADX INFO: renamed from: getCaseInsensitiveName */
    public final boolean getA() {
        return true;
    }

    @Override // io.ktor.util.StringValues
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.ktor.util.StringValues
    public final Set names() {
        return EmptySet.INSTANCE;
    }

    public final String toString() {
        return "Headers " + EmptySet.INSTANCE;
    }

    @Override // io.ktor.util.StringValues
    public final boolean contains(String str) {
        str.getClass();
        return false;
    }
}
