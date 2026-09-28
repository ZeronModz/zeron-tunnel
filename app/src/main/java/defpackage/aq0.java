package defpackage;

import androidx.emoji2.text.b;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class aq0 {
    public static MetadataList a(MappedByteBuffer mappedByteBuffer) throws IOException {
        long unsignedInt;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        b bVar = new b(byteBufferDuplicate);
        ByteBuffer byteBuffer = (ByteBuffer) bVar.a;
        bVar.skip(4);
        int unsignedShort = bVar.readUnsignedShort();
        if (unsignedShort > 100) {
            p60.f("Cannot read metadata.");
            return null;
        }
        bVar.skip(6);
        int i = 0;
        while (true) {
            if (i >= unsignedShort) {
                unsignedInt = -1;
                break;
            }
            int i2 = byteBuffer.getInt();
            bVar.skip(4);
            unsignedInt = bVar.readUnsignedInt();
            bVar.skip(4);
            if (1835365473 == i2) {
                break;
            }
            i++;
        }
        if (unsignedInt != -1) {
            bVar.skip((int) (unsignedInt - bVar.getPosition()));
            bVar.skip(12);
            long unsignedInt2 = bVar.readUnsignedInt();
            for (int i3 = 0; i3 < unsignedInt2; i3++) {
                int i4 = byteBuffer.getInt();
                long unsignedInt3 = bVar.readUnsignedInt();
                bVar.readUnsignedInt();
                if (1164798569 == i4 || 1701669481 == i4) {
                    byteBufferDuplicate.position((int) (unsignedInt3 + unsignedInt));
                    MetadataList metadataList = new MetadataList();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    metadataList.b = byteBufferDuplicate;
                    metadataList.a = iPosition;
                    int i5 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    metadataList.c = i5;
                    metadataList.d = metadataList.b.getShort(i5);
                    return metadataList;
                }
            }
        }
        p60.f("Cannot read metadata.");
        return null;
    }
}
