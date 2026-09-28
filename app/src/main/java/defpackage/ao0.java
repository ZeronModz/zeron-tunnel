package defpackage;

import android.window.OnBackInvokedCallback;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ao0 extends a {
    @Override // com.google.android.material.motion.a
    public final OnBackInvokedCallback a(MaterialBackHandler materialBackHandler) {
        return new zn0(this, materialBackHandler);
    }
}
