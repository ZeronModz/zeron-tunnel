package defpackage;

import com.google.common.graph.AbstractGraph;
import com.google.common.graph.AbstractNetwork;
import com.google.common.graph.AbstractValueGraph;
import com.google.common.graph.ElementOrder$Type;
import com.google.common.graph.a;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends AbstractGraph {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.graph.BaseGraph
    public final Set adjacentNodes(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((AbstractNetwork) obj2).adjacentNodes(obj);
            default:
                return ((AbstractValueGraph) obj2).adjacentNodes(obj);
        }
    }

    @Override // com.google.common.graph.BaseGraph
    public final boolean allowsSelfLoops() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((AbstractNetwork) obj).allowsSelfLoops();
            default:
                return ((AbstractValueGraph) obj).allowsSelfLoops();
        }
    }

    @Override // com.google.common.graph.c, com.google.common.graph.BaseGraph
    public int degree(Object obj) {
        switch (this.a) {
            case 1:
                return ((AbstractValueGraph) this.b).degree(obj);
            default:
                return super.degree(obj);
        }
    }

    @Override // com.google.common.graph.c, com.google.common.graph.BaseGraph
    public final Set edges() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((AbstractNetwork) obj).allowsParallelEdges() ? new a(this) : new c1(this, 0);
            default:
                return ((AbstractValueGraph) obj).edges();
        }
    }

    @Override // com.google.common.graph.c, com.google.common.graph.BaseGraph
    public int inDegree(Object obj) {
        switch (this.a) {
            case 1:
                return ((AbstractValueGraph) this.b).inDegree(obj);
            default:
                return super.inDegree(obj);
        }
    }

    @Override // com.google.common.graph.c, com.google.common.graph.BaseGraph
    public final v00 incidentEdgeOrder() {
        switch (this.a) {
            case 0:
                return new v00(ElementOrder$Type.UNORDERED);
            default:
                return ((AbstractValueGraph) this.b).incidentEdgeOrder();
        }
    }

    @Override // com.google.common.graph.BaseGraph
    public final boolean isDirected() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((AbstractNetwork) obj).isDirected();
            default:
                return ((AbstractValueGraph) obj).isDirected();
        }
    }

    @Override // com.google.common.graph.BaseGraph
    public final v00 nodeOrder() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((AbstractNetwork) obj).nodeOrder();
            default:
                return ((AbstractValueGraph) obj).nodeOrder();
        }
    }

    @Override // com.google.common.graph.BaseGraph
    public final Set nodes() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((AbstractNetwork) obj).nodes();
            default:
                return ((AbstractValueGraph) obj).nodes();
        }
    }

    @Override // com.google.common.graph.c, com.google.common.graph.BaseGraph
    public int outDegree(Object obj) {
        switch (this.a) {
            case 1:
                return ((AbstractValueGraph) this.b).outDegree(obj);
            default:
                return super.outDegree(obj);
        }
    }

    @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public final Iterable predecessors(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((AbstractNetwork) obj2).predecessors(obj);
            default:
                return ((AbstractValueGraph) obj2).predecessors(obj);
        }
    }

    @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public final Iterable successors(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((AbstractNetwork) obj2).successors(obj);
            default:
                return ((AbstractValueGraph) obj2).successors(obj);
        }
    }

    @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public final Set predecessors(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((AbstractNetwork) obj2).predecessors(obj);
            default:
                return ((AbstractValueGraph) obj2).predecessors(obj);
        }
    }

    @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public final Set successors(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((AbstractNetwork) obj2).successors(obj);
            default:
                return ((AbstractValueGraph) obj2).successors(obj);
        }
    }
}
