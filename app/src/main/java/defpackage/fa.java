package defpackage;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.sessions.ProcessDetails;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class fa implements ObjectEncoder {
    public static final fa a = new fa();
    public static final t50 b = t50.a("processName");
    public static final t50 c = t50.a("pid");
    public static final t50 d = t50.a("importance");
    public static final t50 e = t50.a("defaultProcess");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        ProcessDetails processDetails = (ProcessDetails) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, processDetails.a);
        objectEncoderContext2.add(c, processDetails.b);
        objectEncoderContext2.add(d, processDetails.c);
        objectEncoderContext2.add(e, processDetails.d);
    }
}
