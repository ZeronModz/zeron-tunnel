package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CameraCaptureResult;
import androidx.camera.camera2.internal.b;
import androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture;
import androidx.camera.camera2.internal.compat.workaround.UseFlashModeTorchFor3aUpdate;
import androidx.camera.camera2.internal.compat.workaround.UseTorchAsFlash;
import androidx.camera.camera2.internal.p;
import androidx.camera.camera2.internal.q;
import androidx.camera.camera2.internal.u;
import androidx.camera.camera2.internal.v;
import androidx.camera.core.impl.CameraCaptureMetaData$AeMode;
import androidx.camera.core.impl.CameraCaptureMetaData$AfMode;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbMode;
import androidx.camera.core.impl.Quirks;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xi {
    public final b a;
    public final UseTorchAsFlash b;
    public final boolean c;
    public final Quirks d;
    public final androidx.camera.core.impl.utils.executor.b e;
    public final jc0 f;
    public final boolean g;
    public int h = 1;

    public xi(b bVar, rj rjVar, Quirks quirks, androidx.camera.core.impl.utils.executor.b bVar2, jc0 jc0Var) {
        this.a = bVar;
        Integer num = (Integer) rjVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.g = num != null && num.intValue() == 2;
        this.e = bVar2;
        this.f = jc0Var;
        this.d = quirks;
        this.b = new UseTorchAsFlash(quirks);
        this.c = xg0.n(new ji(rjVar, 1));
    }

    public static boolean b(TotalCaptureResult totalCaptureResult, boolean z) {
        if (totalCaptureResult != null) {
            Camera2CameraCaptureResult camera2CameraCaptureResult = new Camera2CameraCaptureResult(totalCaptureResult);
            Set set = jr.a;
            boolean z2 = camera2CameraCaptureResult.getAfMode() == CameraCaptureMetaData$AfMode.OFF || camera2CameraCaptureResult.getAfMode() == CameraCaptureMetaData$AfMode.UNKNOWN || jr.a.contains(camera2CameraCaptureResult.getAfState());
            boolean z3 = camera2CameraCaptureResult.getAeMode() == CameraCaptureMetaData$AeMode.OFF;
            boolean z4 = !z ? !(z3 || jr.c.contains(camera2CameraCaptureResult.getAeState())) : !(z3 || jr.d.contains(camera2CameraCaptureResult.getAeState()));
            boolean z5 = camera2CameraCaptureResult.getAwbMode() == CameraCaptureMetaData$AwbMode.OFF || jr.b.contains(camera2CameraCaptureResult.getAwbState());
            Objects.toString(camera2CameraCaptureResult.getAeState());
            Objects.toString(camera2CameraCaptureResult.getAfState());
            Objects.toString(camera2CameraCaptureResult.getAwbState());
            km0.a("ConvergenceUtils");
            if (z2 && z4 && z5) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(int i, TotalCaptureResult totalCaptureResult) {
        km0.a("Camera2CapturePipeline");
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            km0.a("Camera2CapturePipeline");
            if (num == null || num.intValue() != 4) {
                return false;
            }
        } else if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new AssertionError(i);
            }
        }
        return true;
    }

    public final ti a(int i, int i2, int i3) {
        Quirks quirks = this.d;
        OverrideAeModeForStillCapture overrideAeModeForStillCapture = new OverrideAeModeForStillCapture(quirks);
        int i4 = this.h;
        boolean z = this.g;
        androidx.camera.core.impl.utils.executor.b bVar = this.e;
        jc0 jc0Var = this.f;
        b bVar2 = this.a;
        ti tiVar = new ti(i4, bVar, jc0Var, bVar2, z, overrideAeModeForStillCapture);
        ArrayList arrayList = tiVar.h;
        if (i == 0) {
            arrayList.add(new q(bVar2));
        }
        if (i2 == 3) {
            arrayList.add(new u(bVar2, bVar, jc0Var, new UseFlashModeTorchFor3aUpdate(quirks)));
        } else if (this.c) {
            boolean z2 = this.b.a;
            if (z2 || this.h == 3 || i3 == 1) {
                arrayList.add(new v(bVar2, i2, bVar, jc0Var, (z2 || bVar2.isInVideoUsage()) ? false : true));
            } else {
                arrayList.add(new p(bVar2, i2, overrideAeModeForStillCapture));
            }
        }
        arrayList.toString();
        km0.a("Camera2CapturePipeline");
        return tiVar;
    }
}
