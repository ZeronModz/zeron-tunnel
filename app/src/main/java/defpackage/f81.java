package defpackage;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetCallback;
import com.google.android.material.sidesheet.SideSheetDialog;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f81 extends SideSheetCallback {
    public final /* synthetic */ SideSheetDialog a;

    public f81(SideSheetDialog sideSheetDialog) {
        this.a = sideSheetDialog;
    }

    @Override // com.google.android.material.sidesheet.SheetCallback
    public final void onStateChanged(View view, int i) {
        if (i == 5) {
            this.a.cancel();
        }
    }

    @Override // com.google.android.material.sidesheet.SheetCallback
    public final void onSlide(View view, float f) {
    }
}
