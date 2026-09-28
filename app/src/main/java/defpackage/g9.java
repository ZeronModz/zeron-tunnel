package defpackage;

import com.google.android.datatransport.cct.internal.ExperimentIds;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g9 implements ObjectEncoder {
    public static final g9 a = new g9();
    public static final t50 b = t50.a("clearBlob");
    public static final t50 c = t50.a("encryptedBlob");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        ExperimentIds experimentIds = (ExperimentIds) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, experimentIds.a());
        objectEncoderContext2.add(c, experimentIds.b());
    }
}
