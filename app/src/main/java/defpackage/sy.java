package defpackage;

import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.DoubleArrayBuilder;
import kotlinx.serialization.internal.PrimitiveArraySerializer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class sy extends PrimitiveArraySerializer {
    public static final sy c = new sy(xy.a);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int e(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void h(CompositeDecoder compositeDecoder, int i, Object obj) {
        DoubleArrayBuilder doubleArrayBuilder = (DoubleArrayBuilder) obj;
        doubleArrayBuilder.getClass();
        double dDecodeDoubleElement = compositeDecoder.decodeDoubleElement(this.b, i);
        doubleArrayBuilder.b(doubleArrayBuilder.getB() + 1);
        double[] dArr = doubleArrayBuilder.a;
        int i2 = doubleArrayBuilder.b;
        doubleArrayBuilder.b = i2 + 1;
        dArr[i2] = dDecodeDoubleElement;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object i(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return new DoubleArrayBuilder(dArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object l() {
        return new double[0];
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void m(CompositeEncoder compositeEncoder, Object obj, int i) {
        double[] dArr = (double[]) obj;
        compositeEncoder.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            compositeEncoder.encodeDoubleElement(this.b, i2, dArr[i2]);
        }
    }
}
