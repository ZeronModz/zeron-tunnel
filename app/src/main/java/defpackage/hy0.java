package defpackage;

import androidx.arch.core.util.Function;
import androidx.camera.lifecycle.b;
import androidx.camera.view.PreviewView;
import androidx.camera.view.c;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hy0 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hy0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((c) obj2).a(PreviewView.StreamState.STREAMING);
                return null;
            default:
                return (b) ((Function1) obj2).invoke(obj);
        }
    }
}
