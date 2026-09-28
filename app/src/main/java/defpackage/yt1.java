package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.api.internal.zabx;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yt1 extends k5 {
    public static void N(Context context, zabx zabxVar, IntentFilter intentFilter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            context.registerReceiver(zabxVar, intentFilter, i >= 33 ? 2 : 0);
        } else {
            context.registerReceiver(zabxVar, intentFilter);
        }
    }
}
