package defpackage;

import com.google.common.cache.b;
import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.TypeToken;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class wb1 extends b {
    @Override // com.google.common.cache.b
    public final Object load(Object obj) {
        return ImmutableSet.copyOf((Collection) TypeToken.of((Class) obj).getTypes().rawTypes());
    }
}
