package defpackage;

import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zl1 implements KSerializer {
    public static final zl1 a = new zl1();
    public static final PrimitiveSerialDescriptor b = new PrimitiveSerialDescriptor("kotlin.uuid.Uuid", sy0.a);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        Uuid.Companion companion = Uuid.INSTANCE;
        String strDecodeString = decoder.decodeString();
        companion.getClass();
        return Uuid.Companion.b(strDecodeString);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        Uuid uuid = (Uuid) obj;
        encoder.getClass();
        uuid.getClass();
        encoder.encodeString(uuid.toString());
    }
}
