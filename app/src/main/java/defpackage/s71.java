package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s71 extends ViewOutlineProvider {
    public final /* synthetic */ t71 a;

    public s71(t71 t71Var) {
        this.a = t71Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Path path = this.a.e;
        if (path.isEmpty()) {
            return;
        }
        outline.setPath(path);
    }
}
