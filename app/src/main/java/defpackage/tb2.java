package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class tb2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ JsResult b;

    public /* synthetic */ tb2(JsResult jsResult, int i) {
        this.a = i;
        this.b = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                this.b.cancel();
                break;
            default:
                this.b.confirm();
                break;
        }
    }
}
