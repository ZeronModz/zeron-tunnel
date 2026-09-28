package defpackage;

import androidx.camera.core.CameraState;
import androidx.camera.core.c;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.camera.core.impl.g;
import androidx.lifecycle.MutableLiveData;
import java.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class sk {
    public final CameraStateRegistry a;
    public final MutableLiveData b;

    public sk(CameraStateRegistry cameraStateRegistry) {
        this.a = cameraStateRegistry;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.b = mutableLiveData;
        mutableLiveData.i(new c(CameraState.Type.CLOSED, null));
    }

    public final void a(CameraInternal.State state, CameraState.StateError stateError) {
        c cVar;
        switch (rk.a[state.ordinal()]) {
            case 1:
                CameraStateRegistry cameraStateRegistry = this.a;
                synchronized (cameraStateRegistry.b) {
                    Iterator it = cameraStateRegistry.e.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            cVar = new c(CameraState.Type.PENDING_OPEN, null);
                        } else if (((g) ((Map.Entry) it.next()).getValue()).a == CameraInternal.State.CLOSING) {
                            cVar = new c(CameraState.Type.OPENING, null);
                        }
                    }
                }
                break;
            case 2:
                cVar = new c(CameraState.Type.OPENING, stateError);
                break;
            case 3:
            case 4:
                cVar = new c(CameraState.Type.OPEN, stateError);
                break;
            case 5:
            case 6:
                cVar = new c(CameraState.Type.CLOSING, stateError);
                break;
            case 7:
            case 8:
                cVar = new c(CameraState.Type.CLOSED, stateError);
                break;
            default:
                zu0.g(state, "Unknown internal camera state: ");
                return;
        }
        cVar.toString();
        state.toString();
        Objects.toString(stateError);
        km0.a("CameraStateMachine");
        if (Objects.equals((CameraState) this.b.d(), cVar)) {
            return;
        }
        cVar.toString();
        km0.a("CameraStateMachine");
        this.b.i(cVar);
    }
}
