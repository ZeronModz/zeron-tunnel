package defpackage;

import kotlin.UByte$Companion;
import kotlin.e;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PrimitiveArraySerializer;
import kotlinx.serialization.internal.UByteArrayBuilder;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class xj1 extends PrimitiveArraySerializer {
    public static final xj1 c;

    static {
        wj1.b.getClass();
        c = new xj1(yj1.a);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int e(Object obj) {
        return ((e) obj).a.length;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void h(CompositeDecoder compositeDecoder, int i, Object obj) {
        UByteArrayBuilder uByteArrayBuilder = (UByteArrayBuilder) obj;
        uByteArrayBuilder.getClass();
        byte bDecodeByte = compositeDecoder.decodeInlineElement(this.b, i).decodeByte();
        UByte$Companion uByte$Companion = wj1.b;
        uByteArrayBuilder.b(uByteArrayBuilder.getB() + 1);
        byte[] bArr = uByteArrayBuilder.a;
        int i2 = uByteArrayBuilder.b;
        uByteArrayBuilder.b = i2 + 1;
        bArr[i2] = bDecodeByte;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object i(Object obj) {
        return new UByteArrayBuilder(((e) obj).a, null);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object l() {
        return new e(new byte[0]);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void m(CompositeEncoder compositeEncoder, Object obj, int i) {
        byte[] bArr = ((e) obj).a;
        compositeEncoder.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            Encoder encoderEncodeInlineElement = compositeEncoder.encodeInlineElement(this.b, i2);
            byte b = bArr[i2];
            UByte$Companion uByte$Companion = wj1.b;
            encoderEncodeInlineElement.encodeByte(b);
        }
    }
}
