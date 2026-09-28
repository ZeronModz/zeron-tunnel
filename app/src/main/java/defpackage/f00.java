package defpackage;

import kotlin.time.Duration$Companion;
import kotlin.time.DurationUnit;
import kotlin.time.a;
import kotlin.time.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f00 implements KSerializer {
    public static final f00 a = new f00();
    public static final PrimitiveSerialDescriptor b = new PrimitiveSerialDescriptor("kotlin.time.Duration", sy0.a);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        Duration$Companion duration$Companion = a.b;
        String strDecodeString = decoder.decodeString();
        duration$Companion.getClass();
        strDecodeString.getClass();
        try {
            return new a(b.e(strDecodeString));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(vh.m("Invalid ISO duration string format: '", strDecodeString, "'."), e);
        }
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        long j = ((a) obj).a;
        encoder.getClass();
        Duration$Companion duration$Companion = a.b;
        StringBuilder sb = new StringBuilder();
        if (a.f(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long jL = a.f(j) ? a.l(j) : j;
        long jI = a.i(jL, DurationUnit.HOURS);
        boolean z = false;
        int i = a.e(jL) ? 0 : (int) (a.i(jL, DurationUnit.MINUTES) % 60);
        int i2 = a.e(jL) ? 0 : (int) (a.i(jL, DurationUnit.SECONDS) % 60);
        int iD = a.d(jL);
        if (a.e(j)) {
            jI = 9999999999999L;
        }
        boolean z2 = jI != 0;
        boolean z3 = (i2 == 0 && iD == 0) ? false : true;
        if (i != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jI);
            sb.append('H');
        }
        if (z) {
            sb.append(i);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            a.b(sb, i2, iD, 9, "S", true);
        }
        encoder.encodeString(sb.toString());
    }
}
