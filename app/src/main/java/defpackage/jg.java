package defpackage;

import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ByteArrayBuilder;
import kotlinx.serialization.internal.PrimitiveArraySerializer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class jg extends PrimitiveArraySerializer {
    public static final jg c = new jg(tg.a);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int e(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void h(CompositeDecoder compositeDecoder, int i, Object obj) {
        ByteArrayBuilder byteArrayBuilder = (ByteArrayBuilder) obj;
        byteArrayBuilder.getClass();
        byte bDecodeByteElement = compositeDecoder.decodeByteElement(this.b, i);
        byteArrayBuilder.b(byteArrayBuilder.getB() + 1);
        byte[] bArr = byteArrayBuilder.a;
        int i2 = byteArrayBuilder.b;
        byteArrayBuilder.b = i2 + 1;
        bArr[i2] = bDecodeByteElement;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object i(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return new ByteArrayBuilder(bArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object l() {
        return new byte[0];
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void m(CompositeEncoder compositeEncoder, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        compositeEncoder.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            compositeEncoder.encodeByteElement(this.b, i2, bArr[i2]);
        }
    }
}
