package defpackage;

import com.trilead.ssh2.sftp.AttribFlags;
import io.ktor.utils.io.pool.DefaultPool;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class hg extends DefaultPool {
    @Override // io.ktor.utils.io.pool.DefaultPool
    public final Object b() {
        return new byte[AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE];
    }
}
