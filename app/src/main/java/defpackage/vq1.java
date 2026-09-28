package defpackage;

import android.view.Window;
import androidx.core.view.s;
import com.trilead.ssh2.sftp.AttribFlags;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class vq1 extends s {
    @Override // androidx.core.view.u
    public final boolean b() {
        return (this.a.getDecorView().getSystemUiVisibility() & AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT) != 0;
    }

    @Override // androidx.core.view.u
    public final void d(boolean z) {
        if (!z) {
            g(AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT);
            return;
        }
        Window window = this.a;
        window.clearFlags(67108864);
        window.addFlags(AttribFlags.SSH_FILEXFER_ATTR_EXTENDED);
        f(AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT);
    }
}
