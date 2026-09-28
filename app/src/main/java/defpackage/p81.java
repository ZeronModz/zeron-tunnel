package defpackage;

import android.util.Size;
import com.sandok.tunnel.core.VpnProfile;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p81 {
    public static final Size a = new Size(0, 0);
    public static final Size b = new Size(320, 240);
    public static final Size c = new Size(640, 480);
    public static final Size d = new Size(720, 480);
    public static final Size e = new Size(VpnProfile.DEFAULT_MSSFIX_SIZE, 720);
    public static final Size f = new Size(1920, 1080);
    public static final Size g = new Size(1920, 1440);

    public static int a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
