package io.ktor.util;

import defpackage.zu0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/util/AttributesJvmBase;", "Lio/ktor/util/Attributes;", "<init>", "()V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
abstract class AttributesJvmBase implements Attributes {
    public abstract Map a();

    @Override // io.ktor.util.Attributes
    public final boolean contains(AttributeKey attributeKey) {
        attributeKey.getClass();
        return a().containsKey(attributeKey);
    }

    @Override // io.ktor.util.Attributes
    public final Object get(AttributeKey attributeKey) {
        attributeKey.getClass();
        Object orNull = getOrNull(attributeKey);
        if (orNull != null) {
            return orNull;
        }
        zu0.g(attributeKey, "No instance for key ");
        return null;
    }

    @Override // io.ktor.util.Attributes
    public final List getAllKeys() {
        return kotlin.collections.c.R(a().keySet());
    }

    @Override // io.ktor.util.Attributes
    public final Object getOrNull(AttributeKey attributeKey) {
        attributeKey.getClass();
        return a().get(attributeKey);
    }

    @Override // io.ktor.util.Attributes
    public final void put(AttributeKey attributeKey, Object obj) {
        attributeKey.getClass();
        obj.getClass();
        a().put(attributeKey, obj);
    }

    @Override // io.ktor.util.Attributes
    public final void remove(AttributeKey attributeKey) {
        attributeKey.getClass();
        a().remove(attributeKey);
    }

    @Override // io.ktor.util.Attributes
    public final Object take(AttributeKey attributeKey) {
        attributeKey.getClass();
        Object obj = get(attributeKey);
        remove(attributeKey);
        return obj;
    }

    @Override // io.ktor.util.Attributes
    public final Object takeOrNull(AttributeKey attributeKey) {
        attributeKey.getClass();
        Object orNull = getOrNull(attributeKey);
        remove(attributeKey);
        return orNull;
    }
}
