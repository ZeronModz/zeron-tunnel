package defpackage;

import androidx.camera.camera2.internal.o;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.p;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ei implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ei(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                o oVar = (o) obj6;
                String str = (String) obj5;
                oVar.f("Use case " + str + " UPDATED");
                oVar.a.e(str, (v61) obj4, (UseCaseConfig) obj3, (StreamSpec) obj2, (List) obj);
                oVar.x();
                break;
            case 1:
                o oVar2 = (o) obj6;
                String str2 = (String) obj5;
                v61 v61Var = (v61) obj4;
                UseCaseConfig useCaseConfig = (UseCaseConfig) obj3;
                StreamSpec streamSpec = (StreamSpec) obj2;
                List list = (List) obj;
                oVar2.f("Use case " + str2 + " ACTIVE");
                LinkedHashMap linkedHashMap = oVar2.a.a;
                p pVar = (p) linkedHashMap.get(str2);
                if (pVar == null) {
                    pVar = new p(v61Var, useCaseConfig, streamSpec, list);
                    linkedHashMap.put(str2, pVar);
                }
                pVar.f = true;
                oVar2.a.e(str2, v61Var, useCaseConfig, streamSpec, list);
                oVar2.x();
                break;
            default:
                ((DualSurfaceProcessorNode) obj6).a((CameraInternal) obj5, (CameraInternal) obj4, (SurfaceEdge) obj3, (SurfaceEdge) obj2, (Map.Entry) obj);
                break;
        }
    }
}
