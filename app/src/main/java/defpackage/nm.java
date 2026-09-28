package defpackage;

import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.CharArrayBuilder;
import kotlinx.serialization.internal.PrimitiveArraySerializer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class nm extends PrimitiveArraySerializer {
    public static final nm c = new nm(wm.a);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int e(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void h(CompositeDecoder compositeDecoder, int i, Object obj) {
        CharArrayBuilder charArrayBuilder = (CharArrayBuilder) obj;
        charArrayBuilder.getClass();
        char cDecodeCharElement = compositeDecoder.decodeCharElement(this.b, i);
        charArrayBuilder.b(charArrayBuilder.getB() + 1);
        char[] cArr = charArrayBuilder.a;
        int i2 = charArrayBuilder.b;
        charArrayBuilder.b = i2 + 1;
        cArr[i2] = cDecodeCharElement;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object i(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return new CharArrayBuilder(cArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object l() {
        return new char[0];
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void m(CompositeEncoder compositeEncoder, Object obj, int i) {
        char[] cArr = (char[]) obj;
        compositeEncoder.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            compositeEncoder.encodeCharElement(this.b, i2, cArr[i2]);
        }
    }
}
