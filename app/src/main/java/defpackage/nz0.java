package defpackage;

import com.google.firebase.encoders.proto.ProtobufEncoder$Builder;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class nz0 {
    public static final tj1 a;

    static {
        ProtobufEncoder$Builder protobufEncoder$Builder = new ProtobufEncoder$Builder();
        protobufEncoder$Builder.registerEncoder(nz0.class, v9.a);
        protobufEncoder$Builder.registerEncoder(xp0.class, u9.a);
        protobufEncoder$Builder.registerEncoder(wp0.class, t9.a);
        a = new tj1(new HashMap(protobufEncoder$Builder.a), 12, new HashMap(protobufEncoder$Builder.b), protobufEncoder$Builder.c);
    }
}
