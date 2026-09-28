package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import kotlin.collections.builders.MapBuilderValues;
import kotlin.jvm.internal.markers.KMutableCollection;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v0 extends AbstractCollection implements Collection, KMutableCollection {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return ((MapBuilderValues) this).a.size();
    }
}
