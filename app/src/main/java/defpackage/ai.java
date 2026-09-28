package defpackage;

import androidx.camera.camera2.internal.Camera2CameraInfoImpl;
import androidx.camera.camera2.internal.Camera2PhysicalCameraInfoImpl;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.Identifier;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ai implements CameraFilter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ai(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.camera.core.CameraFilter
    public final List filter(List list) {
        Camera2CameraInfo camera2CameraInfo;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    CameraInfo cameraInfo = (CameraInfo) it.next();
                    if (cameraInfo instanceof Camera2PhysicalCameraInfoImpl) {
                        camera2CameraInfo = ((Camera2PhysicalCameraInfoImpl) cameraInfo).c;
                    } else {
                        CameraInfoInternal implementation = ((CameraInfoInternal) cameraInfo).getImplementation();
                        jx0.b(implementation instanceof Camera2CameraInfoImpl, "CameraInfo doesn't contain Camera2 implementation.");
                        camera2CameraInfo = ((Camera2CameraInfoImpl) implementation).c;
                    }
                    Camera2PhysicalCameraInfoImpl camera2PhysicalCameraInfoImpl = camera2CameraInfo.b;
                    if (str.equals(camera2PhysicalCameraInfoImpl != null ? camera2PhysicalCameraInfoImpl.a : camera2CameraInfo.a.a)) {
                        break;
                    }
                }
                u7.r(vh.l("No camera can be find for id: ", str));
                break;
            default:
                String str2 = ((Camera2CameraInfoImpl) obj).a;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    CameraInfo cameraInfo2 = (CameraInfo) it2.next();
                    jx0.a(cameraInfo2 instanceof CameraInfoInternal);
                    if (((CameraInfoInternal) cameraInfo2).getCameraId().equals(str2)) {
                        break;
                    }
                }
                u7.p(vh.m("Unable to find camera with id ", str2, " from list of available cameras."));
                break;
        }
        return null;
    }

    @Override // androidx.camera.core.CameraFilter
    public final Identifier getIdentifier() {
        switch (this.a) {
        }
        return CameraFilter.DEFAULT_ID;
    }
}
