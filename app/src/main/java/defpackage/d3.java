package defpackage;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 extends ActivityResultLauncher {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityResultRegistry b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ActivityResultContract d;

    public /* synthetic */ d3(ActivityResultRegistry activityResultRegistry, String str, ActivityResultContract activityResultContract, int i) {
        this.a = i;
        this.b = activityResultRegistry;
        this.c = str;
        this.d = activityResultContract;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void a(Object obj) {
        int i = this.a;
        ActivityResultContract activityResultContract = this.d;
        String str = this.c;
        ActivityResultRegistry activityResultRegistry = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = activityResultRegistry.d;
                Object obj2 = activityResultRegistry.b.get(str);
                if (obj2 == null) {
                    io0.h("Attempting to launch an unregistered ActivityResultLauncher with contract ", activityResultContract, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    activityResultRegistry.c(iIntValue, activityResultContract, obj);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                ArrayList arrayList2 = activityResultRegistry.d;
                Object obj3 = activityResultRegistry.b.get(str);
                if (obj3 == null) {
                    io0.h("Attempting to launch an unregistered ActivityResultLauncher with contract ", activityResultContract, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str);
                try {
                    activityResultRegistry.c(iIntValue2, activityResultContract, obj);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str);
                    throw e2;
                }
        }
    }

    public void b() {
        this.b.g(this.c);
    }
}
