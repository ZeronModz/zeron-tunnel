package defpackage;

import com.google.common.reflect.TypeToken;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zi1 {
    public final Type[] a;
    public final boolean b;

    public zi1(Type[] typeArr, boolean z) {
        this.a = typeArr;
        this.b = z;
    }

    public final boolean a(Type type) {
        Type[] typeArr = this.a;
        int length = typeArr.length;
        int i = 0;
        while (true) {
            boolean z = this.b;
            if (i >= length) {
                return !z;
            }
            if (TypeToken.of(typeArr[i]).isSubtypeOf(type) == z) {
                return z;
            }
            i++;
        }
    }
}
