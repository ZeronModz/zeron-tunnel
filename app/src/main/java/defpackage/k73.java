package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k73 {
    public static final hc3 a = hc3.a(new byte[0]);

    public static final hc3 a(int i) {
        return hc3.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final hc3 b(int i) {
        return hc3.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
