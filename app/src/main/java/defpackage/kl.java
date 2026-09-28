package defpackage;

import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.camera.core.k;
import androidx.camera.core.streamsharing.VirtualCameraCaptureResult;
import androidx.camera.core.streamsharing.c;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class kl extends CameraCaptureCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kl(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public void b(int i, CameraCaptureResult cameraCaptureResult) {
        switch (this.a) {
            case 1:
                MetadataImageReader metadataImageReader = (MetadataImageReader) this.b;
                synchronized (metadataImageReader.a) {
                    try {
                        if (metadataImageReader.e) {
                            return;
                        }
                        metadataImageReader.i.put(cameraCaptureResult.getTimestamp(), new CameraCaptureResultImageInfo(cameraCaptureResult));
                        metadataImageReader.d();
                        return;
                    } finally {
                    }
                }
            case 2:
                Iterator it = ((c) this.b).a.iterator();
                while (it.hasNext()) {
                    v61 v61Var = ((k) it.next()).m;
                    Iterator it2 = v61Var.g.e.iterator();
                    while (it2.hasNext()) {
                        ((CameraCaptureCallback) it2.next()).b(i, new VirtualCameraCaptureResult(v61Var.g.g, cameraCaptureResult));
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public void d(int i, int i2) {
        switch (this.a) {
            case 0:
                ((jc0) dn0.r()).execute(new wf(this, i2, 2));
                break;
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public void e(int i) {
        switch (this.a) {
            case 0:
                ((jc0) dn0.r()).execute(new w2(this, 13));
                break;
        }
    }
}
