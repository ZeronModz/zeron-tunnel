package defpackage;

import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.FloatArrayBuilder;
import kotlinx.serialization.internal.PrimitiveArraySerializer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e70 extends PrimitiveArraySerializer {
    public static final e70 c = new e70(f70.a);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int e(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void h(CompositeDecoder compositeDecoder, int i, Object obj) {
        FloatArrayBuilder floatArrayBuilder = (FloatArrayBuilder) obj;
        floatArrayBuilder.getClass();
        float fDecodeFloatElement = compositeDecoder.decodeFloatElement(this.b, i);
        floatArrayBuilder.b(floatArrayBuilder.getB() + 1);
        float[] fArr = floatArrayBuilder.a;
        int i2 = floatArrayBuilder.b;
        floatArrayBuilder.b = i2 + 1;
        fArr[i2] = fDecodeFloatElement;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object i(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return new FloatArrayBuilder(fArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object l() {
        return new float[0];
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void m(CompositeEncoder compositeEncoder, Object obj, int i) {
        float[] fArr = (float[]) obj;
        compositeEncoder.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            compositeEncoder.encodeFloatElement(this.b, i2, fArr[i2]);
        }
    }
}
