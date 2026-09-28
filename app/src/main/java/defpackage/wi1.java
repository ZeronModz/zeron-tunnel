package defpackage;

import com.google.common.reflect.TypeToken;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class wi1 extends zg0 {
    public final /* synthetic */ TypeToken c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi1(TypeToken typeToken, Method method) {
        super(method);
        this.c = typeToken;
    }

    @Override // defpackage.zg0
    public final TypeToken a() {
        return this.c;
    }

    public final String toString() {
        return this.c + "." + this.b.toString();
    }
}
