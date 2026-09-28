package defpackage;

import com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vs1 implements BackgroundDetector$BackgroundStateChangeListener {
    public final /* synthetic */ b a;

    public vs1(b bVar) {
        this.a = bVar;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        zau zauVar = this.a.n;
        zauVar.sendMessage(zauVar.obtainMessage(1, Boolean.valueOf(z)));
    }
}
