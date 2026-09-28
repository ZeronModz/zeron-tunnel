package defpackage;

import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class k9 implements ObjectEncoder {
    public static final k9 a = new k9();
    public static final t50 b = t50.a("requestTimeMs");
    public static final t50 c = t50.a("requestUptimeMs");
    public static final t50 d = t50.a("clientInfo");
    public static final t50 e = t50.a("logSource");
    public static final t50 f = t50.a("logSourceName");
    public static final t50 g = t50.a("logEvent");
    public static final t50 h = t50.a("qosTier");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        LogRequest logRequest = (LogRequest) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, logRequest.f());
        objectEncoderContext2.add(c, logRequest.g());
        objectEncoderContext2.add(d, logRequest.a());
        objectEncoderContext2.add(e, logRequest.c());
        objectEncoderContext2.add(f, logRequest.d());
        objectEncoderContext2.add(g, logRequest.b());
        objectEncoderContext2.add(h, logRequest.e());
    }
}
