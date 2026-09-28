package defpackage;

import io.ktor.util.date.GMTDate;
import io.ktor.util.date.Month;
import io.ktor.util.date.WeekDay;
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
public final /* synthetic */ class ib0 implements GeneratedSerializer {
    public static final ib0 a;
    private static final SerialDescriptor descriptor;

    static {
        ib0 ib0Var = new ib0();
        a = ib0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.ktor.util.date.GMTDate", ib0Var, 9);
        pluginGeneratedSerialDescriptor.a("seconds", false);
        pluginGeneratedSerialDescriptor.a("minutes", false);
        pluginGeneratedSerialDescriptor.a("hours", false);
        pluginGeneratedSerialDescriptor.a("dayOfWeek", false);
        pluginGeneratedSerialDescriptor.a("dayOfMonth", false);
        pluginGeneratedSerialDescriptor.a("dayOfYear", false);
        pluginGeneratedSerialDescriptor.a("month", false);
        pluginGeneratedSerialDescriptor.a("year", false);
        pluginGeneratedSerialDescriptor.a("timestamp", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = GMTDate.j;
        KSerializer kSerializer = kSerializerArr[3];
        KSerializer kSerializer2 = kSerializerArr[6];
        tg0 tg0Var = tg0.a;
        return new KSerializer[]{tg0Var, tg0Var, tg0Var, kSerializer, tg0Var, tg0Var, kSerializer2, tg0Var, sm0.a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iDecodeIntElement;
        Month month;
        WeekDay weekDay;
        int iDecodeIntElement2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long jDecodeLongElement;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = GMTDate.j;
        int i6 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            WeekDay weekDay2 = (WeekDay) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            int iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            month = (Month) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            i = iDecodeIntElement6;
            i2 = 511;
            i3 = iDecodeIntElement5;
            i4 = iDecodeIntElement4;
            weekDay = weekDay2;
            i5 = iDecodeIntElement3;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
        } else {
            boolean z = true;
            iDecodeIntElement = 0;
            int iDecodeIntElement7 = 0;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            Month month2 = null;
            long jDecodeLongElement2 = 0;
            int iDecodeIntElement10 = 0;
            int iDecodeIntElement11 = 0;
            int i7 = 0;
            WeekDay weekDay3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i7 |= 1;
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i6 = 7;
                        break;
                    case 1:
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i7 |= 2;
                        i6 = 7;
                        break;
                    case 2:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i7 |= 4;
                        break;
                    case 3:
                        weekDay3 = (WeekDay) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], weekDay3);
                        i7 |= 8;
                        break;
                    case 4:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i7 |= 16;
                        break;
                    case 5:
                        iDecodeIntElement11 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i7 |= 32;
                        break;
                    case 6:
                        month2 = (Month) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], month2);
                        i7 |= 64;
                        break;
                    case 7:
                        iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i6);
                        i7 |= 128;
                        break;
                    case 8:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
                        i7 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            month = month2;
            weekDay = weekDay3;
            iDecodeIntElement2 = iDecodeIntElement10;
            i = iDecodeIntElement11;
            i2 = i7;
            i3 = iDecodeIntElement7;
            i4 = iDecodeIntElement8;
            i5 = iDecodeIntElement9;
            jDecodeLongElement = jDecodeLongElement2;
        }
        int i8 = iDecodeIntElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GMTDate(i2, i8, i5, i4, weekDay, i3, i, month, iDecodeIntElement2, jDecodeLongElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        GMTDate gMTDate = (GMTDate) obj;
        encoder.getClass();
        gMTDate.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = GMTDate.j;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, gMTDate.a);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, gMTDate.b);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, gMTDate.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], gMTDate.d);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 4, gMTDate.e);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 5, gMTDate.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], gMTDate.g);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 7, gMTDate.h);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 8, gMTDate.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return l02.d;
    }
}
