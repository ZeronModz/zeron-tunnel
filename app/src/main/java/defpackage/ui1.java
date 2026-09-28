package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ui1 extends vi1 {
    public final /* synthetic */ TypeVariable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui1(AtomicInteger atomicInteger, TypeVariable typeVariable) {
        super(atomicInteger);
        this.c = typeVariable;
    }

    @Override // defpackage.vi1
    public final TypeVariable b(Type[] typeArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
        linkedHashSet.addAll(Arrays.asList(this.c.getBounds()));
        if (linkedHashSet.size() > 1) {
            linkedHashSet.remove(Object.class);
        }
        return super.b((Type[]) linkedHashSet.toArray(new Type[0]));
    }
}
