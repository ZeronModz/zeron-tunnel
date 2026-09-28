package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.concurrent.futures.b;
import androidx.profileinstaller.DeviceProfileWriter;
import androidx.work.impl.WorkerStoppedException;
import androidx.work.multiprocess.IWorkManagerImplCallback;
import androidx.work.multiprocess.ListenableCallback;
import androidx.work.multiprocess.e;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xh(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = i;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener, v40] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        final int i2 = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((CameraCaptureCallback) obj2).c(i2, (CameraCaptureFailure) obj);
                break;
            case 1:
                ((CameraCaptureCallback) obj2).b(i2, (CameraCaptureResult) obj);
                break;
            case 2:
                ((CameraCaptureSession.CaptureCallback) ((zh) obj2).b).onCaptureSequenceAborted((CameraCaptureSession) obj, i2);
                break;
            case 3:
                ((CameraDevice.StateCallback) ((fi) obj2).b).onError((CameraDevice) obj, i2);
                break;
            case 4:
                ((pp) obj2).a(i2, ((ActivityResultContract.SynchronousResult) obj).a);
                break;
            case 5:
                ((pp) obj2).b(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 6:
                ((DeviceProfileWriter) obj2).c.onResultReceived(i2, obj);
                break;
            case 7:
                w40 w40Var = (w40) obj2;
                final b bVar = (b) obj;
                androidx.camera.camera2.internal.b bVar2 = w40Var.a;
                if (!w40Var.d) {
                    w40Var.b.a(0);
                    bVar.d(new CameraControl.OperationCanceledException("Camera is not active."));
                } else {
                    w40Var.a();
                    jx0.g("mRunningCompleter should be null when starting set a new exposure compensation value", w40Var.e == null);
                    jx0.g("mRunningCaptureResultListener should be null when starting set a new exposure compensation value", w40Var.f == null);
                    ?? r1 = new Camera2CameraControlImpl$CaptureResultListener() { // from class: v40
                        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener
                        public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                            Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
                            int i3 = i2;
                            b bVar3 = bVar;
                            if (num == null || num2 == null) {
                                if (num2 == null || num2.intValue() != i3) {
                                    return false;
                                }
                                bVar3.b(Integer.valueOf(i3));
                                return true;
                            }
                            int iIntValue = num.intValue();
                            if ((iIntValue != 2 && iIntValue != 3 && iIntValue != 4) || num2.intValue() != i3) {
                                return false;
                            }
                            bVar3.b(Integer.valueOf(i3));
                            return true;
                        }
                    };
                    w40Var.f = r1;
                    w40Var.e = bVar;
                    bVar2.a(r1);
                    bVar2.k();
                }
                break;
            default:
                ((Job) obj2).cancel((CancellationException) new WorkerStoppedException(i2));
                ListenableCallback.ListenableCallbackRunnable.b(e.i, (IWorkManagerImplCallback) obj);
                break;
        }
    }

    public /* synthetic */ xh(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.d = obj2;
        this.c = i;
    }
}
