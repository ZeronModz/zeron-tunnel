package defpackage;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class s9 implements ObjectEncoder {
    public static final s9 a = new s9();
    public static final t50 b;
    public static final t50 c;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.a = 1;
        b = new t50("logSource", vh.z(vh.y(Protobuf.class, atProtobuf.a())));
        AtProtobuf atProtobuf2 = new AtProtobuf();
        atProtobuf2.a = 2;
        c = new t50("logEventDropped", vh.z(vh.y(Protobuf.class, atProtobuf2.a())));
    }

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        gm0 gm0Var = (gm0) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, gm0Var.a);
        objectEncoderContext2.add(c, gm0Var.b);
    }
}
