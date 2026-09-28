package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultCallerLauncher;
import androidx.activity.result.contract.ActivityResultContract;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 extends ActivityResultContract {
    public final /* synthetic */ ActivityResultCallerLauncher a;

    public c3(ActivityResultCallerLauncher activityResultCallerLauncher) {
        this.a = activityResultCallerLauncher;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent a(Context context, Object obj) {
        ((mk1) obj).getClass();
        ActivityResultCallerLauncher activityResultCallerLauncher = this.a;
        return activityResultCallerLauncher.b.a(context, activityResultCallerLauncher.c);
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object c(int i, Intent intent) {
        return this.a.b.c(i, intent);
    }
}
