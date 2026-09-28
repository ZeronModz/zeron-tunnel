package defpackage;

import kotlin.UInt$Companion;
import kotlin.f;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PrimitiveArraySerializer;
import kotlinx.serialization.internal.UIntArrayBuilder;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ak1 extends PrimitiveArraySerializer {
    public static final ak1 c;

    static {
        zj1.b.getClass();
        c = new ak1(bk1.a);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int e(Object obj) {
        return ((f) obj).a.length;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void h(CompositeDecoder compositeDecoder, int i, Object obj) {
        UIntArrayBuilder uIntArrayBuilder = (UIntArrayBuilder) obj;
        uIntArrayBuilder.getClass();
        int iDecodeInt = compositeDecoder.decodeInlineElement(this.b, i).decodeInt();
        UInt$Companion uInt$Companion = zj1.b;
        uIntArrayBuilder.b(uIntArrayBuilder.getB() + 1);
        int[] iArr = uIntArrayBuilder.a;
        int i2 = uIntArrayBuilder.b;
        uIntArrayBuilder.b = i2 + 1;
        iArr[i2] = iDecodeInt;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object i(Object obj) {
        return new UIntArrayBuilder(((f) obj).a, null);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object l() {
        return new f(new int[0]);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void m(CompositeEncoder compositeEncoder, Object obj, int i) {
        int[] iArr = ((f) obj).a;
        compositeEncoder.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            Encoder encoderEncodeInlineElement = compositeEncoder.encodeInlineElement(this.b, i2);
            int i3 = iArr[i2];
            UInt$Companion uInt$Companion = zj1.b;
            encoderEncodeInlineElement.encodeInt(i3);
        }
    }
}
