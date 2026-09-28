package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.provider.Settings;
import androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener;
import androidx.camera.camera2.internal.d0;
import androidx.camera.core.CameraControl;
import androidx.concurrent.futures.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i4(yf1 yf1Var, b bVar, boolean z) {
        this.a = 2;
        this.c = yf1Var;
        this.d = bVar;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener, z70] */
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
        switch (this.a) {
            case 0:
                Context context = (Context) this.c;
                boolean z = this.b;
                ContentResolver contentResolver = (ContentResolver) this.d;
                if (ii2.m(context) != z && Settings.Global.putInt(contentResolver, "airplane_mode_on", z ? 1 : 0)) {
                    ii2.t(context, z);
                    break;
                }
                break;
            case 1:
                final d0 d0Var = (d0) this.c;
                boolean z2 = this.b;
                final b bVar = (b) this.d;
                d0Var.a.i(d0Var.w);
                d0Var.v = z2;
                if (d0Var.d) {
                    final long jK = d0Var.a.k();
                    ?? r3 = new Camera2CameraControlImpl$CaptureResultListener() { // from class: z70
                        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener
                        public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                            boolean z3 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
                            km0.a("FocusMeteringControl");
                            if (z3 != d0Var.v || !androidx.camera.camera2.internal.b.h(totalCaptureResult, jK)) {
                                return false;
                            }
                            km0.a("FocusMeteringControl");
                            b bVar2 = bVar;
                            if (bVar2 != null) {
                                bVar2.b(null);
                            }
                            return true;
                        }
                    };
                    d0Var.w = r3;
                    d0Var.a.a(r3);
                } else if (bVar != null) {
                    bVar.d(new CameraControl.OperationCanceledException("Camera is not active."));
                }
                break;
            default:
                ((yf1) this.c).a((b) this.d, this.b);
                break;
        }
    }

    public /* synthetic */ i4(Object obj, int i, Object obj2, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}
