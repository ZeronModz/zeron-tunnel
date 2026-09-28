package defpackage;

import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanArrayBuilder;
import kotlinx.serialization.internal.PrimitiveArraySerializer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ze extends PrimitiveArraySerializer {
    public static final ze c = new ze(af.a);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int e(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void h(CompositeDecoder compositeDecoder, int i, Object obj) {
        BooleanArrayBuilder booleanArrayBuilder = (BooleanArrayBuilder) obj;
        booleanArrayBuilder.getClass();
        boolean zDecodeBooleanElement = compositeDecoder.decodeBooleanElement(this.b, i);
        booleanArrayBuilder.b(booleanArrayBuilder.getB() + 1);
        boolean[] zArr = booleanArrayBuilder.a;
        int i2 = booleanArrayBuilder.b;
        booleanArrayBuilder.b = i2 + 1;
        zArr[i2] = zDecodeBooleanElement;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object i(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return new BooleanArrayBuilder(zArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object l() {
        return new boolean[0];
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void m(CompositeEncoder compositeEncoder, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        compositeEncoder.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            compositeEncoder.encodeBooleanElement(this.b, i2, zArr[i2]);
        }
    }
}
