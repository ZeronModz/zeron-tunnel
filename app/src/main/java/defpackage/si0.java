package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class si0 implements KSerializer {
    public static final si0 a = new si0();
    public static final ri0 b = ri0.b;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        w91.a(decoder);
        return new JsonObject((Map) new LinkedHashMapSerializer(bb1.a, ki0.a).deserialize(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        JsonObject jsonObject = (JsonObject) obj;
        encoder.getClass();
        jsonObject.getClass();
        w91.b(encoder);
        new LinkedHashMapSerializer(bb1.a, ki0.a).serialize(encoder, jsonObject);
    }
}
