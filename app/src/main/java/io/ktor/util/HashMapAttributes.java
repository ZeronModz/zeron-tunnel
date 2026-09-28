package io.ktor.util;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/util/HashMapAttributes;", "Lio/ktor/util/AttributesJvmBase;", "<init>", "()V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class HashMapAttributes extends AttributesJvmBase {
    public final HashMap a = new HashMap();

    @Override // io.ktor.util.AttributesJvmBase
    public final Map a() {
        return this.a;
    }

    @Override // io.ktor.util.Attributes
    public final Object computeIfAbsent(AttributeKey attributeKey, Function0 function0) {
        attributeKey.getClass();
        function0.getClass();
        HashMap map = this.a;
        Object obj = map.get(attributeKey);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = function0.invoke();
        Object objPut = map.put(attributeKey, objInvoke);
        if (objPut != null) {
            objInvoke = objPut;
        }
        objInvoke.getClass();
        return objInvoke;
    }
}
