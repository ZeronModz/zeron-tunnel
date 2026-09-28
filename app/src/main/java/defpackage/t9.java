package defpackage;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t9 implements ObjectEncoder {
    public static final t9 a = new t9();
    public static final t50 b;
    public static final t50 c;
    public static final t50 d;
    public static final t50 e;
    public static final t50 f;
    public static final t50 g;
    public static final t50 h;
    public static final t50 i;
    public static final t50 j;
    public static final t50 k;
    public static final t50 l;
    public static final t50 m;
    public static final t50 n;
    public static final t50 o;
    public static final t50 p;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.a = 1;
        b = new t50("projectNumber", vh.z(vh.y(Protobuf.class, atProtobuf.a())));
        AtProtobuf atProtobuf2 = new AtProtobuf();
        atProtobuf2.a = 2;
        c = new t50("messageId", vh.z(vh.y(Protobuf.class, atProtobuf2.a())));
        AtProtobuf atProtobuf3 = new AtProtobuf();
        atProtobuf3.a = 3;
        d = new t50("instanceId", vh.z(vh.y(Protobuf.class, atProtobuf3.a())));
        AtProtobuf atProtobuf4 = new AtProtobuf();
        atProtobuf4.a = 4;
        e = new t50("messageType", vh.z(vh.y(Protobuf.class, atProtobuf4.a())));
        AtProtobuf atProtobuf5 = new AtProtobuf();
        atProtobuf5.a = 5;
        f = new t50("sdkPlatform", vh.z(vh.y(Protobuf.class, atProtobuf5.a())));
        AtProtobuf atProtobuf6 = new AtProtobuf();
        atProtobuf6.a = 6;
        g = new t50("packageName", vh.z(vh.y(Protobuf.class, atProtobuf6.a())));
        AtProtobuf atProtobuf7 = new AtProtobuf();
        atProtobuf7.a = 7;
        h = new t50("collapseKey", vh.z(vh.y(Protobuf.class, atProtobuf7.a())));
        AtProtobuf atProtobuf8 = new AtProtobuf();
        atProtobuf8.a = 8;
        i = new t50("priority", vh.z(vh.y(Protobuf.class, atProtobuf8.a())));
        AtProtobuf atProtobuf9 = new AtProtobuf();
        atProtobuf9.a = 9;
        j = new t50("ttl", vh.z(vh.y(Protobuf.class, atProtobuf9.a())));
        AtProtobuf atProtobuf10 = new AtProtobuf();
        atProtobuf10.a = 10;
        k = new t50("topic", vh.z(vh.y(Protobuf.class, atProtobuf10.a())));
        AtProtobuf atProtobuf11 = new AtProtobuf();
        atProtobuf11.a = 11;
        l = new t50("bulkId", vh.z(vh.y(Protobuf.class, atProtobuf11.a())));
        AtProtobuf atProtobuf12 = new AtProtobuf();
        atProtobuf12.a = 12;
        m = new t50("event", vh.z(vh.y(Protobuf.class, atProtobuf12.a())));
        AtProtobuf atProtobuf13 = new AtProtobuf();
        atProtobuf13.a = 13;
        n = new t50("analyticsLabel", vh.z(vh.y(Protobuf.class, atProtobuf13.a())));
        AtProtobuf atProtobuf14 = new AtProtobuf();
        atProtobuf14.a = 14;
        o = new t50("campaignId", vh.z(vh.y(Protobuf.class, atProtobuf14.a())));
        AtProtobuf atProtobuf15 = new AtProtobuf();
        atProtobuf15.a = 15;
        p = new t50("composerLabel", vh.z(vh.y(Protobuf.class, atProtobuf15.a())));
    }

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        wp0 wp0Var = (wp0) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, wp0Var.a);
        objectEncoderContext2.add(c, wp0Var.b);
        objectEncoderContext2.add(d, wp0Var.c);
        objectEncoderContext2.add(e, wp0Var.d);
        objectEncoderContext2.add(f, wp0Var.e);
        objectEncoderContext2.add(g, wp0Var.f);
        objectEncoderContext2.add(h, wp0Var.g);
        objectEncoderContext2.add(i, wp0Var.h);
        objectEncoderContext2.add(j, wp0Var.i);
        objectEncoderContext2.add(k, wp0Var.j);
        objectEncoderContext2.add(l, 0L);
        objectEncoderContext2.add(m, wp0Var.k);
        objectEncoderContext2.add(n, wp0Var.l);
        objectEncoderContext2.add(o, 0L);
        objectEncoderContext2.add(p, wp0Var.m);
    }
}
