package defpackage;

import com.google.firebase.sessions.SessionData;
import com.google.firebase.sessions.SessionDetails;
import com.google.firebase.sessions.Time;
import java.util.Map;
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
public final /* synthetic */ class x61 implements GeneratedSerializer {
    public static final x61 a;
    private static final SerialDescriptor descriptor;

    static {
        x61 x61Var = new x61();
        a = x61Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.google.firebase.sessions.SessionData", x61Var, 3);
        pluginGeneratedSerialDescriptor.a("sessionDetails", false);
        pluginGeneratedSerialDescriptor.a("backgroundTime", true);
        pluginGeneratedSerialDescriptor.a("processDataMap", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{y61.a, eg.a(se1.a), eg.a(SessionData.d[2])};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        SessionDetails sessionDetails;
        Time time;
        Map map;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SessionData.d;
        SessionDetails sessionDetails2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            SessionDetails sessionDetails3 = (SessionDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, y61.a, null);
            Time time2 = (Time) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, se1.a, null);
            map = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            sessionDetails = sessionDetails3;
            i = 7;
            time = time2;
        } else {
            boolean z = true;
            int i2 = 0;
            Time time3 = null;
            Map map2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    sessionDetails2 = (SessionDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, y61.a, sessionDetails2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    time3 = (Time) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, se1.a, time3);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], map2);
                    i2 |= 4;
                }
            }
            i = i2;
            sessionDetails = sessionDetails2;
            time = time3;
            map = map2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SessionData(i, sessionDetails, time, map, (f61) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SessionData sessionData = (SessionData) obj;
        encoder.getClass();
        sessionData.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SessionData.d;
        y61 y61Var = y61.a;
        SessionDetails sessionDetails = sessionData.a;
        Map map = sessionData.c;
        Time time = sessionData.b;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, y61Var, sessionDetails);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || time != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, se1.a, time);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || map != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], map);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return l02.d;
    }
}
