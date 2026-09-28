package defpackage;

import kotlin.UShort$Companion;
import kotlin.h;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PrimitiveArraySerializer;
import kotlinx.serialization.internal.UShortArrayBuilder;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class hk1 extends PrimitiveArraySerializer {
    public static final hk1 c;

    static {
        gk1.b.getClass();
        c = new hk1(ik1.a);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int e(Object obj) {
        return ((h) obj).a.length;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void h(CompositeDecoder compositeDecoder, int i, Object obj) {
        UShortArrayBuilder uShortArrayBuilder = (UShortArrayBuilder) obj;
        uShortArrayBuilder.getClass();
        short sDecodeShort = compositeDecoder.decodeInlineElement(this.b, i).decodeShort();
        UShort$Companion uShort$Companion = gk1.b;
        uShortArrayBuilder.b(uShortArrayBuilder.getB() + 1);
        short[] sArr = uShortArrayBuilder.a;
        int i2 = uShortArrayBuilder.b;
        uShortArrayBuilder.b = i2 + 1;
        sArr[i2] = sDecodeShort;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object i(Object obj) {
        return new UShortArrayBuilder(((h) obj).a, null);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object l() {
        return new h(new short[0]);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void m(CompositeEncoder compositeEncoder, Object obj, int i) {
        short[] sArr = ((h) obj).a;
        compositeEncoder.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            Encoder encoderEncodeInlineElement = compositeEncoder.encodeInlineElement(this.b, i2);
            short s = sArr[i2];
            UShort$Companion uShort$Companion = gk1.b;
            encoderEncodeInlineElement.encodeShort(s);
        }
    }
}
