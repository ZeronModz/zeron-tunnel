package defpackage;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzeyr;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ds2 implements Callable {
    public static final /* synthetic */ ds2 a = new ds2();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        Runtime runtime = Runtime.getRuntime();
        bundle.putLong("runtime_free", runtime.freeMemory());
        bundle.putLong("runtime_max", runtime.maxMemory());
        bundle.putLong("runtime_total", runtime.totalMemory());
        bundle.putInt("web_view_count", zzt.zzh().k.get());
        if (((Boolean) zzbd.zzc().a(p32.Pf)).booleanValue()) {
            ActivityManager.MemoryInfo memoryInfoZze = zzf.zze(zzt.zzh().e);
            if (memoryInfoZze != null) {
                if (Build.VERSION.SDK_INT >= 34) {
                    bundle.putLong("a_ad_mem", memoryInfoZze.advertisedMem);
                }
                bundle.putLong("a_total", memoryInfoZze.totalMem);
                bundle.putLong("a_avai", memoryInfoZze.availMem);
                bundle.putLong("a_threshold", memoryInfoZze.threshold);
                bundle.putBoolean("a_is_low_mem", memoryInfoZze.lowMemory);
            }
            bundle.putLong("runtime_avai_processors", runtime.availableProcessors());
        }
        return new zzeyr(bundle);
    }
}
