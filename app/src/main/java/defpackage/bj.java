package defpackage;

import android.content.Context;
import androidx.camera.camera2.internal.Camera2UseCaseConfigFactory;
import androidx.camera.core.impl.UseCaseConfigFactory;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bj implements UseCaseConfigFactory.Provider {
    @Override // androidx.camera.core.impl.UseCaseConfigFactory.Provider
    public final UseCaseConfigFactory newInstance(Context context) {
        return new Camera2UseCaseConfigFactory(context);
    }
}
