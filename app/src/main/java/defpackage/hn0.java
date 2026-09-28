package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.c4;
import com.google.common.collect.r1;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class hn0 extends r0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Map.Entry b;
    public final /* synthetic */ Object c;

    public hn0(r1 r1Var, Map.Entry entry) {
        this.c = r1Var;
        this.b = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        int i = this.a;
        Map.Entry entry = this.b;
        switch (i) {
        }
        return entry.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        int i = this.a;
        Object obj = this.c;
        Map.Entry entry = this.b;
        switch (i) {
            case 0:
                entry.getKey();
                return ((Function) ((rb0) obj).b).apply(entry.getValue());
            default:
                return ((Map) entry.getValue()).get(((c4) ((r1) obj).e).d);
        }
    }

    @Override // defpackage.r0, java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.a) {
            case 1:
                Map map = (Map) this.b.getValue();
                Object obj2 = ((c4) ((r1) this.c).e).d;
                obj.getClass();
                return map.put(obj2, obj);
            default:
                return super.setValue(obj);
        }
    }

    public hn0(Map.Entry entry, rb0 rb0Var) {
        this.b = entry;
        this.c = rb0Var;
    }
}
