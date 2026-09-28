package defpackage;

import kotlin.ULong$Companion;
import kotlin.g;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PrimitiveArraySerializer;
import kotlinx.serialization.internal.ULongArrayBuilder;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class dk1 extends PrimitiveArraySerializer {
    public static final dk1 c;

    static {
        ck1.b.getClass();
        c = new dk1(ek1.a);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int e(Object obj) {
        return ((g) obj).a.length;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void h(CompositeDecoder compositeDecoder, int i, Object obj) {
        ULongArrayBuilder uLongArrayBuilder = (ULongArrayBuilder) obj;
        uLongArrayBuilder.getClass();
        long jDecodeLong = compositeDecoder.decodeInlineElement(this.b, i).decodeLong();
        ULong$Companion uLong$Companion = ck1.b;
        uLongArrayBuilder.b(uLongArrayBuilder.getB() + 1);
        long[] jArr = uLongArrayBuilder.a;
        int i2 = uLongArrayBuilder.b;
        uLongArrayBuilder.b = i2 + 1;
        jArr[i2] = jDecodeLong;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object i(Object obj) {
        return new ULongArrayBuilder(((g) obj).a, null);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object l() {
        return new g(new long[0]);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void m(CompositeEncoder compositeEncoder, Object obj, int i) {
        long[] jArr = ((g) obj).a;
        compositeEncoder.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            Encoder encoderEncodeInlineElement = compositeEncoder.encodeInlineElement(this.b, i2);
            long j = jArr[i2];
            ULong$Companion uLong$Companion = ck1.b;
            encoderEncodeInlineElement.encodeLong(j);
        }
    }
}
