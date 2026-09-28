package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.util.zzax;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class sz1 implements Runnable {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public sz1(zzax zzaxVar, Activity activity, String str, boolean z, boolean z2) {
        this.a = activity;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzt.zzc();
        Activity activity = this.a;
        AlertDialog.Builder builderZzP = zzs.zzP(activity);
        builderZzP.setMessage(this.b);
        if (this.c) {
            builderZzP.setTitle("Error");
        } else {
            builderZzP.setTitle("Info");
        }
        if (this.d) {
            builderZzP.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderZzP.setPositiveButton("Learn More", new fl0(this, activity));
            builderZzP.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderZzP.create().show();
    }
}
