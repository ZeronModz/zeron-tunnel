package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class o73 {
    public static final hc3 b = hc3.a(new byte[0]);
    public final Map a;

    public final Iterable a(byte[] bArr) {
        List list;
        hc3 hc3Var = b;
        Map map = this.a;
        List list2 = (List) map.get(hc3Var);
        if (bArr.length >= 5) {
            int length = bArr.length;
            list = (List) map.get(new hc3(bArr, 5 > length ? length : 5));
        } else {
            list = null;
        }
        return (list2 == null && list == null) ? new ArrayList() : list2 == null ? list : list == null ? list2 : new n73(this, list, list2);
    }
}
