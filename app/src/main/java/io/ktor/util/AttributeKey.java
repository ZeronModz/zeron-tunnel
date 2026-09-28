package io.ktor.util;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.u7;
import defpackage.xu;
import defpackage.yg0;
import io.ktor.util.reflect.TypeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/util/AttributeKey;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_T, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "name", "Lio/ktor/util/reflect/TypeInfo;", "type", "<init>", "(Ljava/lang/String;Lio/ktor/util/reflect/TypeInfo;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AttributeKey<T> {
    public final String a;
    public final TypeInfo b;

    public AttributeKey(String str, TypeInfo typeInfo) {
        str.getClass();
        typeInfo.getClass();
        this.a = str;
        this.b = typeInfo;
        if (g.B(str)) {
            u7.r("Name can't be blank");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributeKey)) {
            return false;
        }
        AttributeKey attributeKey = (AttributeKey) obj;
        return yg0.a(this.a, attributeKey.a) && yg0.a(this.b, attributeKey.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AttributeKey: " + this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AttributeKey(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        str.getClass();
    }

    public /* synthetic */ AttributeKey(String str, TypeInfo typeInfo, int i, xu xuVar) {
        TypeReference typeReferenceB;
        if ((i & 2) != 0) {
            ClassReference classReferenceA = Reflection.a(Object.class);
            try {
                typeReferenceB = Reflection.b(Object.class);
            } catch (Throwable unused) {
                typeReferenceB = null;
            }
            typeInfo = new TypeInfo(classReferenceA, typeReferenceB);
        }
        this(str, typeInfo);
    }
}
