package defpackage;

import androidx.camera.video.h;
import androidx.camera.video.j;
import com.blacksquircle.ui.editorkit.widget.TextScroller;
import com.iphunt.sandoki.ui.TransparentActivity;
import com.v2ray.ang.service.V2RayVpnService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class he1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ he1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = TextScroller.j;
                ((TextScroller) obj).setState(TextScroller.State.EXITING);
                return;
            case 1:
                TransparentActivity transparentActivity = (TransparentActivity) obj;
                int i3 = TransparentActivity.c;
                try {
                    transparentActivity.finishAndRemoveTask();
                    return;
                } catch (Throwable unused) {
                    transparentActivity.finish();
                    return;
                }
            case 2:
                V2RayVpnService v2RayVpnService = (V2RayVpnService) obj;
                Process process = v2RayVpnService.c;
                if (process == null) {
                    yg0.N("process");
                    throw null;
                }
                process.waitFor();
                if (v2RayVpnService.b) {
                    v2RayVpnService.a();
                    return;
                }
                return;
            case 3:
                ((h) obj).o();
                return;
            case 4:
                ((j) obj).k.b(null);
                return;
            case 5:
                dr1 dr1Var = (dr1) obj;
                dr1Var.a.getAction();
                dr1Var.b.d(null);
                return;
            default:
                kr1 kr1Var = (kr1) obj;
                kr1Var.d.runCriticalSection(new q21(kr1Var, 12));
                return;
        }
    }
}
