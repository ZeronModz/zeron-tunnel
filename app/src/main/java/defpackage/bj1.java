package defpackage;

import com.google.common.reflect.TypeToken;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class bj1 extends fj1 {
    public final /* synthetic */ int c;

    public /* synthetic */ bj1(int i) {
        this.c = i;
    }

    @Override // defpackage.fj1
    public final Iterable c(Object obj) {
        switch (this.c) {
            case 0:
                return ((TypeToken) obj).getGenericInterfaces();
            default:
                return Arrays.asList(((Class) obj).getInterfaces());
        }
    }

    @Override // defpackage.fj1
    public final Class d(Object obj) {
        switch (this.c) {
            case 0:
                return ((TypeToken) obj).getRawType();
            default:
                return (Class) obj;
        }
    }

    @Override // defpackage.fj1
    public final Object e(Object obj) {
        switch (this.c) {
            case 0:
                return ((TypeToken) obj).getGenericSuperclass();
            default:
                return ((Class) obj).getSuperclass();
        }
    }
}
