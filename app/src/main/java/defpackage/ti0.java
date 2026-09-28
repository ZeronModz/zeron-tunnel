package defpackage;

import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ti0 implements KSerializer {
    public static final ti0 a = new ti0();
    public static final SerialDescriptorImpl b = qj1.i("kotlinx.serialization.json.JsonPrimitive", sy0.a, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        JsonElement jsonElementDecodeJsonElement = w91.a(decoder).decodeJsonElement();
        if (jsonElementDecodeJsonElement instanceof JsonPrimitive) {
            return (JsonPrimitive) jsonElementDecodeJsonElement;
        }
        throw qj1.c(-1, jsonElementDecodeJsonElement.toString(), "Unexpected JSON element, expected JsonPrimitive, had " + Reflection.a(jsonElementDecodeJsonElement.getClass()));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor getD() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        encoder.getClass();
        jsonPrimitive.getClass();
        w91.b(encoder);
        if (jsonPrimitive instanceof a) {
            encoder.encodeSerializableValue(qi0.a, a.INSTANCE);
        } else {
            encoder.encodeSerializableValue(oi0.a, (JsonLiteral) jsonPrimitive);
        }
    }
}
