package defpackage;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbwu;
import com.google.android.gms.internal.ads.zzejf;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dp2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public dp2(zzbwu zzbwuVar, String str, String str2) {
        this.a = 2;
        this.b = str;
        this.c = str2;
        this.d = zzbwuVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i2) {
            case 0:
                zzejf zzejfVar = (zzejf) obj2;
                Activity activity = (Activity) obj;
                zzm zzmVar = (zzm) obj3;
                HashMap map = new HashMap();
                map.put("dialog_action", "confirm");
                zzejfVar.g(zzejfVar.g, map, "rtsdc");
                activity.startActivity(zzt.zzf().zzi(activity));
                zzejfVar.e();
                if (zzmVar != null) {
                    zzmVar.zzb();
                }
                break;
            case 1:
                zzejf zzejfVar2 = (zzejf) obj2;
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "confirm");
                zzejfVar2.g(zzejfVar2.g, map2, "dialog_click");
                zzejfVar2.d((Activity) obj, (zzm) obj3);
                break;
            default:
                zzbwu zzbwuVar = (zzbwu) obj3;
                DownloadManager downloadManager = (DownloadManager) zzbwuVar.d.getSystemService("download");
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse((String) obj2));
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, (String) obj);
                    zzt.zzc();
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                    downloadManager.enqueue(request);
                } catch (IllegalStateException unused) {
                    zzbwuVar.a("Could not store picture.");
                }
                break;
        }
    }

    public /* synthetic */ dp2(zzejf zzejfVar, Activity activity, zzm zzmVar, int i) {
        this.a = i;
        this.b = zzejfVar;
        this.c = activity;
        this.d = zzmVar;
    }
}
