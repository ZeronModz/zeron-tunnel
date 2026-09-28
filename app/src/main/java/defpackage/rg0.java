package defpackage;

import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntArrayBuilder;
import kotlinx.serialization.internal.PrimitiveArraySerializer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class rg0 extends PrimitiveArraySerializer {
    public static final rg0 c = new rg0(tg0.a);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int e(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void h(CompositeDecoder compositeDecoder, int i, Object obj) {
        IntArrayBuilder intArrayBuilder = (IntArrayBuilder) obj;
        intArrayBuilder.getClass();
        int iDecodeIntElement = compositeDecoder.decodeIntElement(this.b, i);
        intArrayBuilder.b(intArrayBuilder.getB() + 1);
        int[] iArr = intArrayBuilder.a;
        int i2 = intArrayBuilder.b;
        intArrayBuilder.b = i2 + 1;
        iArr[i2] = iDecodeIntElement;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object i(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return new IntArrayBuilder(iArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object l() {
        return new int[0];
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void m(CompositeEncoder compositeEncoder, Object obj, int i) {
        int[] iArr = (int[]) obj;
        compositeEncoder.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            compositeEncoder.encodeIntElement(this.b, i2, iArr[i2]);
        }
    }
}
