package defpackage;

import kotlin.jvm.internal.Reflection;
import kotlin.text.g;
import kotlin.text.i;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class oi0 implements KSerializer {
    public static final oi0 a = new oi0();
    public static final PrimitiveSerialDescriptor b = qj1.e("kotlinx.serialization.json.JsonLiteral", sy0.a);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        JsonElement jsonElementDecodeJsonElement = w91.a(decoder).decodeJsonElement();
        if (jsonElementDecodeJsonElement instanceof JsonLiteral) {
            return (JsonLiteral) jsonElementDecodeJsonElement;
        }
        throw qj1.c(-1, jsonElementDecodeJsonElement.toString(), "Unexpected JSON element, expected JsonLiteral, had " + Reflection.a(jsonElementDecodeJsonElement.getClass()));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor getD() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        JsonLiteral jsonLiteral = (JsonLiteral) obj;
        encoder.getClass();
        jsonLiteral.getClass();
        String str = jsonLiteral.c;
        w91.b(encoder);
        if (jsonLiteral.a) {
            encoder.encodeString(str);
            return;
        }
        SerialDescriptor serialDescriptor = jsonLiteral.b;
        if (serialDescriptor != null) {
            encoder.encodeInline(serialDescriptor).encodeString(str);
            return;
        }
        Long lB0 = g.b0(str);
        if (lB0 != null) {
            encoder.encodeLong(lB0.longValue());
            return;
        }
        ck1 ck1VarE = i.e(str);
        if (ck1VarE != null) {
            long j = ck1VarE.a;
            ck1.b.getClass();
            encoder.encodeInline(ek1.b).encodeLong(j);
            return;
        }
        Double dZ = g.Z(str);
        if (dZ != null) {
            encoder.encodeDouble(dZ.doubleValue());
            return;
        }
        Boolean bool = str.equals("true") ? Boolean.TRUE : str.equals("false") ? Boolean.FALSE : null;
        if (bool != null) {
            encoder.encodeBoolean(bool.booleanValue());
        } else {
            encoder.encodeString(str);
        }
    }
}
