package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vp implements Provider {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentRegistrar b;

    public /* synthetic */ vp(ComponentRegistrar componentRegistrar, int i) {
        this.a = i;
        this.b = componentRegistrar;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        int i = this.a;
        return this.b;
    }
}
