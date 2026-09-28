package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ji implements CameraCharacteristicsProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj b;

    public /* synthetic */ ji(rj rjVar, int i) {
        this.a = i;
        this.b = rjVar;
    }

    @Override // androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider
    public final Object get(CameraCharacteristics.Key key) {
        int i = this.a;
        return this.b.a(key);
    }
}
