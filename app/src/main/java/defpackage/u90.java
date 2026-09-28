package defpackage;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class u90 implements ActivityResultCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ FragmentManager b;

    public /* synthetic */ u90(FragmentManager fragmentManager, int i) {
        this.a = i;
        this.b = fragmentManager;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        int i = this.a;
        FragmentManager fragmentManager = this.b;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                ba0 ba0Var = (ba0) fragmentManager.E.pollFirst();
                if (ba0Var != null) {
                    fragmentManager.c.c(ba0Var.a);
                    break;
                }
                break;
            case 1:
                ActivityResult activityResult = (ActivityResult) obj;
                ba0 ba0Var2 = (ba0) fragmentManager.E.pollFirst();
                if (ba0Var2 != null) {
                    String str = ba0Var2.a;
                    int i3 = ba0Var2.b;
                    Fragment fragmentC = fragmentManager.c.c(str);
                    if (fragmentC != null) {
                        fragmentC.s(i3, activityResult.a, activityResult.b);
                        break;
                    }
                }
                break;
            default:
                ActivityResult activityResult2 = (ActivityResult) obj;
                ba0 ba0Var3 = (ba0) fragmentManager.E.pollFirst();
                if (ba0Var3 != null) {
                    String str2 = ba0Var3.a;
                    int i4 = ba0Var3.b;
                    Fragment fragmentC2 = fragmentManager.c.c(str2);
                    if (fragmentC2 != null) {
                        fragmentC2.s(i4, activityResult2.a, activityResult2.b);
                        break;
                    }
                }
                break;
        }
    }
}
