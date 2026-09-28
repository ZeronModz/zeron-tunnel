package defpackage;

import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PrimitiveArraySerializer;
import kotlinx.serialization.internal.ShortArrayBuilder;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b81 extends PrimitiveArraySerializer {
    public static final b81 c = new b81(c81.a);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int e(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void h(CompositeDecoder compositeDecoder, int i, Object obj) {
        ShortArrayBuilder shortArrayBuilder = (ShortArrayBuilder) obj;
        shortArrayBuilder.getClass();
        short sDecodeShortElement = compositeDecoder.decodeShortElement(this.b, i);
        shortArrayBuilder.b(shortArrayBuilder.getB() + 1);
        short[] sArr = shortArrayBuilder.a;
        int i2 = shortArrayBuilder.b;
        shortArrayBuilder.b = i2 + 1;
        sArr[i2] = sDecodeShortElement;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object i(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return new ShortArrayBuilder(sArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object l() {
        return new short[0];
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void m(CompositeEncoder compositeEncoder, Object obj, int i) {
        short[] sArr = (short[]) obj;
        compositeEncoder.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            compositeEncoder.encodeShortElement(this.b, i2, sArr[i2]);
        }
    }
}
