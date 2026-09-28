package defpackage;

import android.os.Build;
import android.os.Environment;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzch;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzevo;
import com.google.android.gms.internal.ads.zzexu;
import com.google.android.gms.internal.ads.zzfcl;
import com.google.android.gms.internal.ads.zzfds;
import com.google.android.gms.internal.measurement.zzy;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k32 implements Callable {
    public static final /* synthetic */ k32 b = new k32(0);
    public static final /* synthetic */ k32 c = new k32(1);
    public static final /* synthetic */ k32 d = new k32(3);
    public static final /* synthetic */ k32 e = new k32(5);
    public static final /* synthetic */ k32 f = new k32(6);
    public final /* synthetic */ int a;

    public /* synthetic */ k32(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            case 1:
                return new zzy();
            case 2:
                return new zzevo(zzt.zzk().currentTimeMillis() - zzt.zzh().i().zzi().f);
            case 3:
                return new zzexu(zzt.zzo().zzi(), zzt.zzo().zzm());
            case 4:
                return new zzfcl(new JSONObject());
            case 5:
                HashMap map = new HashMap();
                String str = (String) zzbd.zzc().a(p32.t0);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) zzbd.zzc().a(p32.u0)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            map.put(str2, zzch.zza(str2));
                        }
                    }
                }
                return new zzfds(map);
            default:
                return null;
        }
    }
}
