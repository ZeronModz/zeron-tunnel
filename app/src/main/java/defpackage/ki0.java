package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ki0 implements KSerializer {
    public static final ki0 a = new ki0();
    public static final SerialDescriptorImpl b = qj1.h("kotlinx.serialization.json.JsonElement", ex0.a, new SerialDescriptor[0], new z3(22));

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return w91.a(decoder).decodeJsonElement();
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        JsonElement jsonElement = (JsonElement) obj;
        encoder.getClass();
        jsonElement.getClass();
        w91.b(encoder);
        if (jsonElement instanceof JsonPrimitive) {
            encoder.encodeSerializableValue(ti0.a, jsonElement);
            return;
        }
        if (jsonElement instanceof JsonObject) {
            encoder.encodeSerializableValue(si0.a, jsonElement);
        } else if (jsonElement instanceof JsonArray) {
            encoder.encodeSerializableValue(fi0.a, jsonElement);
        } else {
            p60.b();
        }
    }
}
