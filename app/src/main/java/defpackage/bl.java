package defpackage;

import androidx.camera.core.impl.CaptureBundle;
import java.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bl implements CaptureBundle {
    public final List a;

    public bl(List list) {
        if (list == null || list.isEmpty()) {
            u7.r("Cannot set an empty CaptureStage list.");
            throw null;
        }
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override // androidx.camera.core.impl.CaptureBundle
    public final List getCaptureStages() {
        return this.a;
    }
}
