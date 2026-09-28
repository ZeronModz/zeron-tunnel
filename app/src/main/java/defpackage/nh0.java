package defpackage;

import com.google.common.base.Function;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class nh0 extends dg1 {
    public final /* synthetic */ Function c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh0(Iterator it, Function function) {
        super(it, 0);
        this.c = function;
    }

    @Override // defpackage.dg1
    public final Object a(Object obj) {
        return this.c.apply(obj);
    }
}
