package defpackage;

import androidx.camera.core.FocusMeteringAction$Builder;
import java.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class x70 {
    public final List a;
    public final List b;
    public final List c;
    public final long d;

    public x70(FocusMeteringAction$Builder focusMeteringAction$Builder) {
        this.a = DesugarCollections.unmodifiableList(focusMeteringAction$Builder.a);
        this.b = DesugarCollections.unmodifiableList(focusMeteringAction$Builder.b);
        this.c = DesugarCollections.unmodifiableList(focusMeteringAction$Builder.c);
        this.d = focusMeteringAction$Builder.d;
    }
}
