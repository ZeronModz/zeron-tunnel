package defpackage;

import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector$Builder;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.LensFacingCameraFilter;
import java.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qk {
    public static final qk b;
    public static final qk c;
    public final LinkedHashSet a;

    static {
        CameraSelector$Builder cameraSelector$Builder = new CameraSelector$Builder();
        cameraSelector$Builder.a(0);
        b = new qk(cameraSelector$Builder.a);
        CameraSelector$Builder cameraSelector$Builder2 = new CameraSelector$Builder();
        cameraSelector$Builder2.a(1);
        c = new qk(cameraSelector$Builder2.a);
    }

    public qk(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final List a(ArrayList arrayList) {
        List<CameraInfo> arrayList2 = new ArrayList<>(arrayList);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList2 = ((CameraFilter) it.next()).filter(DesugarCollections.unmodifiableList(arrayList2));
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Integer num = null;
        for (CameraFilter cameraFilter : this.a) {
            if (cameraFilter instanceof LensFacingCameraFilter) {
                Integer numValueOf = Integer.valueOf(((LensFacingCameraFilter) cameraFilter).a);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    u7.p("Multiple conflicting lens facing requirements exist.");
                    return null;
                }
            }
        }
        return num;
    }

    public final CameraInternal c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((CameraInternal) it.next()).getCameraInfo());
        }
        List listA = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            CameraInternal cameraInternal = (CameraInternal) it2.next();
            if (listA.contains(cameraInternal.getCameraInfo())) {
                linkedHashSet2.add(cameraInternal);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (CameraInternal) it3.next();
        }
        u7.r("No available camera can be found");
        return null;
    }
}
