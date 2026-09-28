package defpackage;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.sessions.ApplicationInfo;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class da implements ObjectEncoder {
    public static final da a = new da();
    public static final t50 b = t50.a("appId");
    public static final t50 c = t50.a("deviceModel");
    public static final t50 d = t50.a("sessionSdkVersion");
    public static final t50 e = t50.a("osVersion");
    public static final t50 f = t50.a("logEnvironment");
    public static final t50 g = t50.a("androidAppInfo");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        ApplicationInfo applicationInfo = (ApplicationInfo) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, applicationInfo.a);
        objectEncoderContext2.add(c, applicationInfo.b);
        objectEncoderContext2.add(d, applicationInfo.c);
        objectEncoderContext2.add(e, applicationInfo.d);
        objectEncoderContext2.add(f, applicationInfo.e);
        objectEncoderContext2.add(g, applicationInfo.f);
    }
}
