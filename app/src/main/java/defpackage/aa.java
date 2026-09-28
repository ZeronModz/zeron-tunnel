package defpackage;

import com.google.firebase.crashlytics.internal.metadata.RolloutAssignment;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class aa implements ObjectEncoder {
    public static final aa a = new aa();
    public static final t50 b = t50.a("rolloutId");
    public static final t50 c = t50.a("parameterKey");
    public static final t50 d = t50.a("parameterValue");
    public static final t50 e = t50.a("variantId");
    public static final t50 f = t50.a("templateVersion");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, rolloutAssignment.c());
        objectEncoderContext2.add(c, rolloutAssignment.a());
        objectEncoderContext2.add(d, rolloutAssignment.b());
        objectEncoderContext2.add(e, rolloutAssignment.e());
        objectEncoderContext2.add(f, rolloutAssignment.d());
    }
}
