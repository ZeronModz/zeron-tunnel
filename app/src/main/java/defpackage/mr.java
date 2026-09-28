package defpackage;

import io.ktor.http.Cookie;
import io.ktor.http.CookieEncoding;
import io.ktor.util.date.GMTDate;
import java.util.Map;
import kotlin.collections.d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mr implements GeneratedSerializer {
    public static final mr a;
    private static final SerialDescriptor descriptor;

    static {
        mr mrVar = new mr();
        a = mrVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.ktor.http.Cookie", mrVar, 10);
        pluginGeneratedSerialDescriptor.a("name", false);
        pluginGeneratedSerialDescriptor.a("value", false);
        pluginGeneratedSerialDescriptor.a("encoding", true);
        pluginGeneratedSerialDescriptor.a("maxAge", true);
        pluginGeneratedSerialDescriptor.a("expires", true);
        pluginGeneratedSerialDescriptor.a("domain", true);
        pluginGeneratedSerialDescriptor.a("path", true);
        pluginGeneratedSerialDescriptor.a("secure", true);
        pluginGeneratedSerialDescriptor.a("httpOnly", true);
        pluginGeneratedSerialDescriptor.a("extensions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = Cookie.k;
        bb1 bb1Var = bb1.a;
        KSerializer kSerializer = kSerializerArr[2];
        KSerializer kSerializerA = eg.a(tg0.a);
        KSerializer kSerializerA2 = eg.a(ib0.a);
        KSerializer kSerializerA3 = eg.a(bb1Var);
        KSerializer kSerializerA4 = eg.a(bb1Var);
        KSerializer kSerializer2 = kSerializerArr[9];
        af afVar = af.a;
        return new KSerializer[]{bb1Var, bb1Var, kSerializer, kSerializerA, kSerializerA2, kSerializerA3, kSerializerA4, afVar, afVar, kSerializer2};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean z;
        Map map;
        String str;
        String str2;
        GMTDate gMTDate;
        Integer num;
        CookieEncoding cookieEncoding;
        boolean z2;
        int i;
        String str3;
        String str4;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = Cookie.k;
        int i2 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            CookieEncoding cookieEncoding2 = (CookieEncoding) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, tg0.a, null);
            GMTDate gMTDate2 = (GMTDate) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, ib0.a, null);
            bb1 bb1Var = bb1.a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, bb1Var, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, bb1Var, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], null);
            str3 = strDecodeStringElement;
            z = zDecodeBooleanElement;
            str2 = str6;
            str = str5;
            num = num2;
            z2 = zDecodeBooleanElement2;
            gMTDate = gMTDate2;
            i = 1023;
            cookieEncoding = cookieEncoding2;
            str4 = strDecodeStringElement2;
        } else {
            int i3 = 2;
            boolean z3 = true;
            boolean zDecodeBooleanElement3 = false;
            int i4 = 0;
            Map map2 = null;
            String str7 = null;
            String str8 = null;
            GMTDate gMTDate3 = null;
            Integer num3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            boolean zDecodeBooleanElement4 = false;
            CookieEncoding cookieEncoding3 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i2 = 7;
                        i3 = 2;
                        break;
                    case 0:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 2;
                        break;
                    case 1:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i2 = 7;
                        break;
                    case 2:
                        cookieEncoding3 = (CookieEncoding) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, kSerializerArr[i3], cookieEncoding3);
                        i4 |= 4;
                        i2 = 7;
                        break;
                    case 3:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, tg0.a, num3);
                        i4 |= 8;
                        i2 = 7;
                        break;
                    case 4:
                        gMTDate3 = (GMTDate) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, ib0.a, gMTDate3);
                        i4 |= 16;
                        i2 = 7;
                        break;
                    case 5:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, bb1.a, str7);
                        i4 |= 32;
                        i2 = 7;
                        break;
                    case 6:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, bb1.a, str8);
                        i4 |= 64;
                        i2 = 7;
                        break;
                    case 7:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i4 |= 128;
                        break;
                    case 8:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i4 |= 256;
                        break;
                    case 9:
                        map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], map2);
                        i4 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement3;
            map = map2;
            str = str7;
            str2 = str8;
            gMTDate = gMTDate3;
            num = num3;
            cookieEncoding = cookieEncoding3;
            z2 = zDecodeBooleanElement4;
            i = i4;
            str3 = strDecodeStringElement3;
            str4 = strDecodeStringElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Cookie(i, str3, str4, cookieEncoding, num, gMTDate, str, str2, z, z2, map, (f61) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        Cookie cookie = (Cookie) obj;
        encoder.getClass();
        cookie.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = Cookie.k;
        String str = cookie.a;
        Map map = cookie.j;
        boolean z = cookie.i;
        boolean z2 = cookie.h;
        String str2 = cookie.g;
        String str3 = cookie.f;
        GMTDate gMTDate = cookie.e;
        Integer num = cookie.d;
        CookieEncoding cookieEncoding = cookie.c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, cookie.b);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || cookieEncoding != CookieEncoding.URI_ENCODING) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], cookieEncoding);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, tg0.a, num);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || gMTDate != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, ib0.a, gMTDate);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, bb1.a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, bb1.a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 7, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 8, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || !yg0.a(map, d.a())) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], map);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return l02.d;
    }
}
