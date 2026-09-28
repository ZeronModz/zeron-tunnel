package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.camera.core.DynamicRange;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k00 {
    public static final HashMap a;
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        a = map;
        HashMap map2 = new HashMap();
        b = map2;
        DynamicRange dynamicRange = DynamicRange.d;
        map.put(1L, dynamicRange);
        map2.put(dynamicRange, Collections.singletonList(1L));
        map.put(2L, DynamicRange.e);
        map2.put((DynamicRange) map.get(2L), Collections.singletonList(2L));
        DynamicRange dynamicRange2 = DynamicRange.f;
        map.put(4L, dynamicRange2);
        map2.put(dynamicRange2, Collections.singletonList(4L));
        DynamicRange dynamicRange3 = DynamicRange.g;
        map.put(8L, dynamicRange3);
        map2.put(dynamicRange3, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            a.put((Long) it.next(), DynamicRange.h);
        }
        b.put(DynamicRange.h, listAsList);
        List listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (it2.hasNext()) {
            a.put((Long) it2.next(), DynamicRange.i);
        }
        b.put(DynamicRange.i, listAsList2);
    }

    public static Long a(DynamicRange dynamicRange, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) b.get(dynamicRange);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l : list) {
            if (supportedProfiles.contains(l)) {
                return l;
            }
        }
        return null;
    }
}
