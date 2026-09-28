package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class rk0 extends eg1 {
    public final /* synthetic */ vk0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk0(vk0 vk0Var, vk0 vk0Var2) {
        super(vk0Var, 0);
        this.c = vk0Var2;
    }

    @Override // defpackage.dg1
    public final Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    @Override // defpackage.eg1, java.util.ListIterator
    public final void set(Object obj) {
        vk0 vk0Var = this.c;
        cn0.t(vk0Var.c != null);
        vk0Var.c.b = obj;
    }
}
