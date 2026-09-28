package defpackage;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.sessions.SessionInfo;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ha implements ObjectEncoder {
    public static final ha a = new ha();
    public static final t50 b = t50.a("sessionId");
    public static final t50 c = t50.a("firstSessionId");
    public static final t50 d = t50.a("sessionIndex");
    public static final t50 e = t50.a("eventTimestampUs");
    public static final t50 f = t50.a("dataCollectionStatus");
    public static final t50 g = t50.a("firebaseInstallationId");
    public static final t50 h = t50.a("firebaseAuthenticationToken");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        SessionInfo sessionInfo = (SessionInfo) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, sessionInfo.a);
        objectEncoderContext2.add(c, sessionInfo.b);
        objectEncoderContext2.add(d, sessionInfo.c);
        objectEncoderContext2.add(e, sessionInfo.d);
        objectEncoderContext2.add(f, sessionInfo.e);
        objectEncoderContext2.add(g, sessionInfo.f);
        objectEncoderContext2.add(h, sessionInfo.g);
    }
}
