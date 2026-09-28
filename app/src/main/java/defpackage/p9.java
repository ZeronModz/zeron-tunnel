package defpackage;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class p9 implements ObjectEncoder {
    public static final p9 a = new p9();
    public static final t50 b;
    public static final t50 c;
    public static final t50 d;
    public static final t50 e;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.a = 1;
        b = new t50("window", vh.z(vh.y(Protobuf.class, atProtobuf.a())));
        AtProtobuf atProtobuf2 = new AtProtobuf();
        atProtobuf2.a = 2;
        c = new t50("logSourceMetrics", vh.z(vh.y(Protobuf.class, atProtobuf2.a())));
        AtProtobuf atProtobuf3 = new AtProtobuf();
        atProtobuf3.a = 3;
        d = new t50("globalMetrics", vh.z(vh.y(Protobuf.class, atProtobuf3.a())));
        AtProtobuf atProtobuf4 = new AtProtobuf();
        atProtobuf4.a = 4;
        e = new t50("appNamespace", vh.z(vh.y(Protobuf.class, atProtobuf4.a())));
    }

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        sn snVar = (sn) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, snVar.a);
        objectEncoderContext2.add(c, snVar.b);
        objectEncoderContext2.add(d, snVar.c);
        objectEncoderContext2.add(e, snVar.d);
    }
}
