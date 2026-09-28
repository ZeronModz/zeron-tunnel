package defpackage;

import com.google.firebase.sessions.UuidGenerator;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class yl1 implements UuidGenerator {
    public static final yl1 a = new yl1();

    @Override // com.google.firebase.sessions.UuidGenerator
    public final UUID next() {
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        return uuidRandomUUID;
    }
}
