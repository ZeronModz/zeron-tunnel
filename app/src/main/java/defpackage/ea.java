package defpackage;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.sessions.DataCollectionStatus;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ea implements ObjectEncoder {
    public static final ea a = new ea();
    public static final t50 b = t50.a("performance");
    public static final t50 c = t50.a("crashlytics");
    public static final t50 d = t50.a("sessionSamplingRate");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        DataCollectionStatus dataCollectionStatus = (DataCollectionStatus) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, dataCollectionStatus.a);
        objectEncoderContext2.add(c, dataCollectionStatus.b);
        objectEncoderContext2.add(d, dataCollectionStatus.c);
    }
}
