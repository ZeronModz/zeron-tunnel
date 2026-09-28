package defpackage;

import io.ktor.util.converters.ConversionService;
import io.ktor.util.converters.DataConversionException;
import io.ktor.util.reflect.TypeInfo;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class yu implements ConversionService {
    public static final yu a = new yu();

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01bb, code lost:
    
        if (r1 != null) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(java.lang.String r6, kotlin.reflect.KClass r7) throws io.ktor.util.converters.DataConversionException {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yu.a(java.lang.String, kotlin.reflect.KClass):java.lang.Object");
    }

    @Override // io.ktor.util.converters.ConversionService
    public final Object fromValues(List list, TypeInfo typeInfo) throws DataConversionException {
        List<KTypeProjection> b;
        KTypeProjection kTypeProjection;
        KType kType;
        list.getClass();
        typeInfo.getClass();
        KClass kClass = typeInfo.a;
        if (list.isEmpty()) {
            return null;
        }
        if (yg0.a(kClass, Reflection.a(List.class)) || yg0.a(kClass, Reflection.a(List.class))) {
            KType kType2 = typeInfo.b;
            KClassifier a2 = (kType2 == null || (b = kType2.getB()) == null || (kTypeProjection = (KTypeProjection) c.L(b)) == null || (kType = kTypeProjection.b) == null) ? null : kType.getA();
            KClass kClass2 = a2 instanceof KClass ? (KClass) a2 : null;
            if (kClass2 != null) {
                ArrayList arrayList = new ArrayList(c.l(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(a((String) it.next(), kClass2));
                }
                return arrayList;
            }
        }
        if (list.isEmpty()) {
            throw new DataConversionException("There are no values when trying to construct single value " + typeInfo);
        }
        if (list.size() <= 1) {
            return a((String) c.L(list), kClass);
        }
        throw new DataConversionException("There are multiple values when trying to construct single value " + typeInfo);
    }

    @Override // io.ktor.util.converters.ConversionService
    public final List toValues(Object obj) throws DataConversionException {
        if (obj == null) {
            return EmptyList.INSTANCE;
        }
        List listZ = obj instanceof Enum ? c.z(((Enum) obj).name()) : obj instanceof Integer ? c.z(((Integer) obj).toString()) : obj instanceof Float ? c.z(((Float) obj).toString()) : obj instanceof Double ? c.z(((Double) obj).toString()) : obj instanceof Long ? c.z(((Long) obj).toString()) : obj instanceof Boolean ? c.z(((Boolean) obj).toString()) : obj instanceof Short ? c.z(((Short) obj).toString()) : obj instanceof String ? c.z(((String) obj).toString()) : obj instanceof Character ? c.z(((Character) obj).toString()) : obj instanceof BigDecimal ? c.z(((BigDecimal) obj).toString()) : obj instanceof BigInteger ? c.z(((BigInteger) obj).toString()) : obj instanceof UUID ? c.z(((UUID) obj).toString()) : null;
        if (listZ != null) {
            return listZ;
        }
        if (obj instanceof Iterable) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                c.i(arrayList, a.toValues(it.next()));
            }
            return arrayList;
        }
        ClassReference classReferenceA = Reflection.a(obj.getClass());
        if (classReferenceA.equals(Reflection.a(Integer.TYPE)) || classReferenceA.equals(Reflection.a(Float.TYPE)) || classReferenceA.equals(Reflection.a(Double.TYPE)) || classReferenceA.equals(Reflection.a(Long.TYPE)) || classReferenceA.equals(Reflection.a(Short.TYPE)) || classReferenceA.equals(Reflection.a(Character.TYPE)) || classReferenceA.equals(Reflection.a(Boolean.TYPE)) || classReferenceA.equals(Reflection.a(String.class))) {
            return c.z(obj.toString());
        }
        throw new DataConversionException("Class " + classReferenceA + " is not supported in default data conversion service");
    }
}
