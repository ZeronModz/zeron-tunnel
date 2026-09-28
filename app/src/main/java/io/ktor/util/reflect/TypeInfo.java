package io.ktor.util.reflect;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import defpackage.yg0;
import java.lang.reflect.Type;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0017\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/util/reflect/TypeInfo;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlin/reflect/KClass;", "type", "Lkotlin/reflect/KType;", "kotlinType", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V", "Ljava/lang/reflect/Type;", "Lio/ktor/util/reflect/Type;", "reifiedType", "(Lkotlin/reflect/KClass;Ljava/lang/reflect/Type;Lkotlin/reflect/KType;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TypeInfo {
    public final KClass a;
    public final KType b;

    public TypeInfo(KClass<?> kClass, KType kType) {
        kClass.getClass();
        this.a = kClass;
        this.b = kType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeInfo)) {
            return false;
        }
        KType kType = this.b;
        if (kType == null) {
            TypeInfo typeInfo = (TypeInfo) obj;
            if (typeInfo.b == null) {
                return yg0.a(this.a, typeInfo.a);
            }
        }
        return yg0.a(kType, ((TypeInfo) obj).b);
    }

    public final int hashCode() {
        KType kType = this.b;
        return kType != null ? kType.hashCode() : this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeInfo(");
        Object obj = this.b;
        if (obj == null) {
            obj = this.a;
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ TypeInfo(KClass kClass, KType kType, int i, xu xuVar) {
        this(kClass, (i & 2) != 0 ? null : kType);
    }

    public /* synthetic */ TypeInfo(KClass kClass, Type type, KType kType, int i, xu xuVar) {
        this(kClass, type, (i & 4) != 0 ? null : kType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Use constructor without reifiedType parameter.", replaceWith = @ReplaceWith(expression = "TypeInfo(type, kotlinType)", imports = {}))
    public TypeInfo(KClass<?> kClass, Type type, KType kType) {
        this(kClass, kType);
        kClass.getClass();
        type.getClass();
    }
}
