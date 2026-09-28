package defpackage;

import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class j9 implements ObjectEncoder {
    public static final j9 a = new j9();
    public static final t50 b = t50.a("eventTimeMs");
    public static final t50 c = t50.a("eventCode");
    public static final t50 d = t50.a("complianceData");
    public static final t50 e = t50.a("eventUptimeMs");
    public static final t50 f = t50.a("sourceExtension");
    public static final t50 g = t50.a("sourceExtensionJsonProto3");
    public static final t50 h = t50.a("timezoneOffsetSeconds");
    public static final t50 i = t50.a("networkConnectionInfo");
    public static final t50 j = t50.a("experimentIds");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        LogEvent logEvent = (LogEvent) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, logEvent.c());
        objectEncoderContext2.add(c, logEvent.b());
        objectEncoderContext2.add(d, logEvent.a());
        objectEncoderContext2.add(e, logEvent.d());
        objectEncoderContext2.add(f, logEvent.g());
        objectEncoderContext2.add(g, logEvent.h());
        objectEncoderContext2.add(h, logEvent.i());
        objectEncoderContext2.add(i, logEvent.f());
        objectEncoderContext2.add(j, logEvent.e());
    }
}
