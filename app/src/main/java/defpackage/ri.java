package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import android.view.View;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.b;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ri implements AsyncFunction, CallbackToFutureAdapter$Resolver, AccessibilityViewCommand {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ri(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        ti tiVar = (ti) this.b;
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        if (xi.c(this.a, totalCaptureResult)) {
            tiVar.g = 5000000000L;
        }
        return tiVar.i.preCapture(totalCaptureResult);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(b bVar) {
        w40 w40Var = (w40) this.b;
        androidx.camera.core.impl.utils.executor.b bVar2 = w40Var.c;
        int i = this.a;
        bVar2.execute(new xh(w40Var, bVar, i, 7));
        return hz.q(i, "]", new StringBuilder("setExposureCompensationIndex["));
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        ((SideSheetBehavior) this.b).setState(this.a);
        return true;
    }
}
