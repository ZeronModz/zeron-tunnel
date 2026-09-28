package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import android.webkit.JsPromptResult;
import androidx.preference.ListPreferenceDialogFragment;
import androidx.preference.ListPreferenceDialogFragmentCompat;
import com.google.android.gms.ads.internal.util.zzat;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbwu;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fl0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public fl0(sz1 sz1Var, Activity activity) {
        this.a = 4;
        this.b = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ListPreferenceDialogFragment listPreferenceDialogFragment = (ListPreferenceDialogFragment) obj;
                listPreferenceDialogFragment.i = i;
                listPreferenceDialogFragment.h = -1;
                dialogInterface.dismiss();
                break;
            case 1:
                ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = (ListPreferenceDialogFragmentCompat) obj;
                listPreferenceDialogFragmentCompat.w0 = i;
                listPreferenceDialogFragmentCompat.v0 = -1;
                dialogInterface.dismiss();
                break;
            case 2:
                ((AtomicInteger) obj).set(i);
                break;
            case 3:
                ((zzat) obj).zzb();
                break;
            case 4:
                zzt.zzc();
                zzs.zzab((Activity) obj, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                break;
            case 5:
                ((zzbwu) obj).a("User canceled the download.");
                break;
            default:
                ((JsPromptResult) obj).cancel();
                break;
        }
    }

    public /* synthetic */ fl0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
