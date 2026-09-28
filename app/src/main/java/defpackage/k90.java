package defpackage;

import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.arch.core.util.Function;
import androidx.fragment.app.Fragment;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class k90 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k90(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Fragment fragment = (Fragment) obj2;
                Object obj3 = fragment.t;
                return obj3 instanceof ActivityResultRegistryOwner ? ((ActivityResultRegistryOwner) obj3).getActivityResultRegistry() : fragment.L().getActivityResultRegistry();
            default:
                return (ActivityResultRegistry) obj2;
        }
    }
}
