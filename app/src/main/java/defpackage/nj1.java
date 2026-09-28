package defpackage;

import androidx.emoji2.text.flatbuffer.MetadataItem;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nj1 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final cq0 b;
    public volatile int c = 0;

    public nj1(cq0 cq0Var, int i) {
        this.b = cq0Var;
        this.a = i;
    }

    public final int a(int i) {
        MetadataItem metadataItemB = b();
        int iA = metadataItemB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = metadataItemB.b;
        int i2 = iA + metadataItemB.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final MetadataItem b() {
        ThreadLocal threadLocal = d;
        MetadataItem metadataItem = (MetadataItem) threadLocal.get();
        if (metadataItem == null) {
            metadataItem = new MetadataItem();
            threadLocal.set(metadataItem);
        }
        MetadataList metadataList = this.b.a;
        int iA = metadataList.a(6);
        if (iA != 0) {
            int i = iA + metadataList.a;
            int i2 = (this.a * 4) + metadataList.b.getInt(i) + i + 4;
            int i3 = metadataList.b.getInt(i2) + i2;
            ByteBuffer byteBuffer = metadataList.b;
            metadataItem.b = byteBuffer;
            if (byteBuffer != null) {
                metadataItem.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                metadataItem.c = i4;
                metadataItem.d = metadataItem.b.getShort(i4);
                return metadataItem;
            }
            metadataItem.a = 0;
            metadataItem.c = 0;
            metadataItem.d = 0;
        }
        return metadataItem;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        MetadataItem metadataItemB = b();
        int iA = metadataItemB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? metadataItemB.b.getInt(iA + metadataItemB.a) : 0));
        sb.append(", codepoints:");
        MetadataItem metadataItemB2 = b();
        int iA2 = metadataItemB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + metadataItemB2.a;
            i = metadataItemB2.b.getInt(metadataItemB2.b.getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
