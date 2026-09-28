package defpackage;

import com.google.firebase.sessions.settings.SessionConfigs;
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
public final /* synthetic */ class w61 implements GeneratedSerializer {
    public static final w61 a;
    private static final SerialDescriptor descriptor;

    static {
        w61 w61Var = new w61();
        a = w61Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.google.firebase.sessions.settings.SessionConfigs", w61Var, 5);
        pluginGeneratedSerialDescriptor.a("sessionsEnabled", false);
        pluginGeneratedSerialDescriptor.a("sessionSamplingRate", false);
        pluginGeneratedSerialDescriptor.a("sessionTimeoutSeconds", false);
        pluginGeneratedSerialDescriptor.a("cacheDurationSeconds", false);
        pluginGeneratedSerialDescriptor.a("cacheUpdatedTimeSeconds", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerA = eg.a(af.a);
        KSerializer kSerializerA2 = eg.a(xy.a);
        tg0 tg0Var = tg0.a;
        return new KSerializer[]{kSerializerA, kSerializerA2, eg.a(tg0Var), eg.a(tg0Var), eg.a(sm0.a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Boolean bool;
        Double d;
        Integer num;
        Integer num2;
        Long l;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Boolean bool2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, af.a, null);
            Double d2 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, xy.a, null);
            tg0 tg0Var = tg0.a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, tg0Var, null);
            bool = bool3;
            num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, tg0Var, null);
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, sm0.a, null);
            num = num3;
            d = d2;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            Double d3 = null;
            Integer num4 = null;
            Integer num5 = null;
            Long l2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, af.a, bool2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    d3 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, xy.a, d3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, tg0.a, num4);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, tg0.a, num5);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, sm0.a, l2);
                    i2 |= 16;
                }
            }
            i = i2;
            bool = bool2;
            d = d3;
            num = num4;
            num2 = num5;
            l = l2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SessionConfigs(i, bool, d, num, num2, l, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SessionConfigs sessionConfigs = (SessionConfigs) obj;
        encoder.getClass();
        sessionConfigs.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, af.a, sessionConfigs.a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, xy.a, sessionConfigs.b);
        tg0 tg0Var = tg0.a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, tg0Var, sessionConfigs.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, tg0Var, sessionConfigs.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, sm0.a, sessionConfigs.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return l02.d;
    }
}
