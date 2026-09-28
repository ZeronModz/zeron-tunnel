package defpackage;

import com.google.firebase.encoders.proto.ProtobufEncoder$Builder;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oz0 {
    public static final tj1 a;

    static {
        ProtobufEncoder$Builder protobufEncoder$Builder = new ProtobufEncoder$Builder();
        protobufEncoder$Builder.registerEncoder(oz0.class, w9.a);
        protobufEncoder$Builder.registerEncoder(sn.class, p9.a);
        protobufEncoder$Builder.registerEncoder(ye1.class, y9.a);
        protobufEncoder$Builder.registerEncoder(gm0.class, s9.a);
        protobufEncoder$Builder.registerEncoder(fm0.class, r9.a);
        protobufEncoder$Builder.registerEncoder(sb0.class, q9.a);
        protobufEncoder$Builder.registerEncoder(na1.class, x9.a);
        a = new tj1(new HashMap(protobufEncoder$Builder.a), 12, new HashMap(protobufEncoder$Builder.b), protobufEncoder$Builder.c);
    }
}
