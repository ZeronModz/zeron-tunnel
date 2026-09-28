package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.internal.ads.zzejf;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bp2 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzejf b;
    public final /* synthetic */ zzm c;

    public /* synthetic */ bp2(zzejf zzejfVar, zzm zzmVar, int i) {
        this.a = i;
        this.b = zzejfVar;
        this.c = zzmVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
        int i = this.a;
        zzm zzmVar = this.c;
        zzejf zzejfVar = this.b;
        switch (i) {
            case 0:
                zzejfVar.f.b(zzejfVar.g);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                zzejfVar.g(zzejfVar.g, map, "dialog_click");
                if (zzmVar != null) {
                    zzmVar.zzb();
                }
                break;
            default:
                zzejfVar.f.b(zzejfVar.g);
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "dismiss");
                zzejfVar.g(zzejfVar.g, map2, "rtsdc");
                if (zzmVar != null) {
                    zzmVar.zzb();
                }
                break;
        }
    }
}
