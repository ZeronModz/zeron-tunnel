package defpackage;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.sessions.AndroidApplicationInfo;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ca implements ObjectEncoder {
    public static final ca a = new ca();
    public static final t50 b = t50.a("packageName");
    public static final t50 c = t50.a("versionName");
    public static final t50 d = t50.a("appBuildVersion");
    public static final t50 e = t50.a("deviceManufacturer");
    public static final t50 f = t50.a("currentProcessDetails");
    public static final t50 g = t50.a("appProcessDetails");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, androidApplicationInfo.a);
        objectEncoderContext2.add(c, androidApplicationInfo.b);
        objectEncoderContext2.add(d, androidApplicationInfo.c);
        objectEncoderContext2.add(e, androidApplicationInfo.d);
        objectEncoderContext2.add(f, androidApplicationInfo.e);
        objectEncoderContext2.add(g, androidApplicationInfo.f);
    }
}
