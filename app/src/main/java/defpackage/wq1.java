package defpackage;

import android.view.Window;
import com.trilead.ssh2.sftp.AttribFlags;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wq1 extends vq1 {
    @Override // androidx.core.view.u
    public final void c(boolean z) {
        if (!z) {
            g(16);
            return;
        }
        Window window = this.a;
        window.clearFlags(134217728);
        window.addFlags(AttribFlags.SSH_FILEXFER_ATTR_EXTENDED);
        f(16);
    }
}
