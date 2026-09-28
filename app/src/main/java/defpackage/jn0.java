package defpackage;

import com.google.common.collect.MutableClassToInstanceMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class jn0 extends dg1 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jn0(Iterator it, int i) {
        super(it, 0);
        this.c = i;
    }

    @Override // defpackage.dg1
    public final Object a(Object obj) {
        switch (this.c) {
            case 0:
                return ((Map.Entry) obj).getValue();
            default:
                return MutableClassToInstanceMap.checkedEntry((Map.Entry) obj);
        }
    }
}
