package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.zzat;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class sx implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sx(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                DialogFragment dialogFragment = (DialogFragment) obj;
                Dialog dialog = dialogFragment.j0;
                if (dialog != null) {
                    dialogFragment.onCancel(dialog);
                }
                break;
            case 1:
                ((zzat) obj).zzb();
                break;
            case 2:
                ((JsResult) obj).cancel();
                break;
            case 3:
                ((JsPromptResult) obj).cancel();
                break;
            default:
                zzm zzmVar = (zzm) obj;
                if (zzmVar != null) {
                    zzmVar.zzb();
                }
                break;
        }
    }
}
