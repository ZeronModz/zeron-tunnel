package defpackage;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u9 implements ObjectEncoder {
    public static final u9 a = new u9();
    public static final t50 b;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.a = 1;
        b = new t50("messagingClientEvent", vh.z(vh.y(Protobuf.class, atProtobuf.a())));
    }

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(b, ((xp0) obj).a);
    }
}
