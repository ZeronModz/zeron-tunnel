package defpackage;

import android.util.Size;
import com.sandok.tunnel.core.VpnProfile;
import java.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b01 {
    public static final ic a;
    public static final ic b;
    public static final ic c;
    public static final ic d;
    public static final ic e;
    public static final ic f;
    public static final ic g;
    public static final HashSet h;
    public static final List i;

    static {
        ic icVar = new ic("SD", 4, DesugarCollections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        a = icVar;
        ic icVar2 = new ic("HD", 5, Collections.singletonList(new Size(VpnProfile.DEFAULT_MSSFIX_SIZE, 720)));
        b = icVar2;
        ic icVar3 = new ic("FHD", 6, Collections.singletonList(new Size(1920, 1080)));
        c = icVar3;
        ic icVar4 = new ic("UHD", 8, Collections.singletonList(new Size(3840, 2160)));
        d = icVar4;
        List list = Collections.EMPTY_LIST;
        ic icVar5 = new ic("LOWEST", 0, list);
        e = icVar5;
        ic icVar6 = new ic("HIGHEST", 1, list);
        f = icVar6;
        g = new ic("NONE", -1, list);
        h = new HashSet(Arrays.asList(icVar5, icVar6, icVar, icVar2, icVar3, icVar4));
        i = Arrays.asList(icVar4, icVar3, icVar2, icVar);
    }
}
