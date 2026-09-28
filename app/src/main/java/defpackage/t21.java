package defpackage;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class t21 {
    public final String a;
    public final CharSequence b;
    public final CharSequence[] c;
    public final boolean d;
    public final int e;
    public final Bundle f;
    public final Set g;

    public t21(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set set) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequenceArr;
        this.d = z;
        this.e = i;
        this.f = bundle;
        this.g = set;
        if (i != 2 || z) {
            return;
        }
        u7.r("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        throw null;
    }

    public static RemoteInput[] a(t21[] t21VarArr) {
        Set set;
        if (t21VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[t21VarArr.length];
        for (int i = 0; i < t21VarArr.length; i++) {
            t21 t21Var = t21VarArr[i];
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(t21Var.a).setLabel(t21Var.b).setChoices(t21Var.c).setAllowFreeFormInput(t21Var.d).addExtras(t21Var.f);
            if (Build.VERSION.SDK_INT >= 26 && (set = t21Var.g) != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    i5.p(builderAddExtras, (String) it.next());
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                k5.G(builderAddExtras, t21Var.e);
            }
            remoteInputArr[i] = builderAddExtras.build();
        }
        return remoteInputArr;
    }
}
