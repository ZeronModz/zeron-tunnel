package defpackage;

import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class e9 implements ObjectEncoder {
    public static final e9 a = new e9();
    public static final t50 b = t50.a("sdkVersion");
    public static final t50 c = t50.a("model");
    public static final t50 d = t50.a("hardware");
    public static final t50 e = t50.a("device");
    public static final t50 f = t50.a("product");
    public static final t50 g = t50.a("osBuild");
    public static final t50 h = t50.a("manufacturer");
    public static final t50 i = t50.a("fingerprint");
    public static final t50 j = t50.a("locale");
    public static final t50 k = t50.a("country");
    public static final t50 l = t50.a("mccMnc");
    public static final t50 m = t50.a("applicationBuild");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        AndroidClientInfo androidClientInfo = (AndroidClientInfo) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, androidClientInfo.l());
        objectEncoderContext2.add(c, androidClientInfo.i());
        objectEncoderContext2.add(d, androidClientInfo.e());
        objectEncoderContext2.add(e, androidClientInfo.c());
        objectEncoderContext2.add(f, androidClientInfo.k());
        objectEncoderContext2.add(g, androidClientInfo.j());
        objectEncoderContext2.add(h, androidClientInfo.g());
        objectEncoderContext2.add(i, androidClientInfo.d());
        objectEncoderContext2.add(j, androidClientInfo.f());
        objectEncoderContext2.add(k, androidClientInfo.b());
        objectEncoderContext2.add(l, androidClientInfo.h());
        objectEncoderContext2.add(m, androidClientInfo.a());
    }
}
