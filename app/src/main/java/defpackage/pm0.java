package defpackage;

import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongArrayBuilder;
import kotlinx.serialization.internal.PrimitiveArraySerializer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class pm0 extends PrimitiveArraySerializer {
    public static final pm0 c = new pm0(sm0.a);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int e(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void h(CompositeDecoder compositeDecoder, int i, Object obj) {
        LongArrayBuilder longArrayBuilder = (LongArrayBuilder) obj;
        longArrayBuilder.getClass();
        long jDecodeLongElement = compositeDecoder.decodeLongElement(this.b, i);
        longArrayBuilder.b(longArrayBuilder.getB() + 1);
        long[] jArr = longArrayBuilder.a;
        int i2 = longArrayBuilder.b;
        longArrayBuilder.b = i2 + 1;
        jArr[i2] = jDecodeLongElement;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object i(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return new LongArrayBuilder(jArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object l() {
        return new long[0];
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void m(CompositeEncoder compositeEncoder, Object obj, int i) {
        long[] jArr = (long[]) obj;
        compositeEncoder.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            compositeEncoder.encodeLongElement(this.b, i2, jArr[i2]);
        }
    }
}
