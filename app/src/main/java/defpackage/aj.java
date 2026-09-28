package defpackage;

import android.content.Context;
import androidx.camera.camera2.internal.Camera2DeviceSurfaceManager;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aj implements CameraDeviceSurfaceManager.Provider {
    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider
    public final CameraDeviceSurfaceManager newInstance(Context context, Object obj, Set set) throws InitializationException {
        try {
            return new Camera2DeviceSurfaceManager(context, obj, set);
        } catch (CameraUnavailableException e) {
            throw new InitializationException(e);
        }
    }
}
