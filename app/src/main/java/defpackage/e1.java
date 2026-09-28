package defpackage;

import com.google.common.base.Predicate;
import com.google.common.graph.AbstractNetwork;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e1 implements Predicate {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ AbstractNetwork c;

    public e1(AbstractNetwork abstractNetwork, Object obj, Object obj2) {
        this.c = abstractNetwork;
        this.a = obj;
        this.b = obj2;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        t20 t20VarIncidentNodes = this.c.incidentNodes(obj);
        Object obj2 = t20VarIncidentNodes.a;
        Object obj3 = this.a;
        boolean zEquals = obj3.equals(obj2);
        Object obj4 = t20VarIncidentNodes.b;
        if (zEquals) {
            obj2 = obj4;
        } else if (!obj3.equals(obj4)) {
            oq.h("EndpointPair ", t20VarIncidentNodes, " does not contain node ", obj3);
            return false;
        }
        return obj2.equals(this.b);
    }
}
