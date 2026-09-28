package defpackage;

import android.os.Bundle;
import androidx.navigation.NavDestination;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qs0 implements Comparable {
    public final NavDestination a;
    public final Bundle b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public qs0(NavDestination navDestination, Bundle bundle, boolean z, boolean z2, int i) {
        this.a = navDestination;
        this.b = bundle;
        this.c = z;
        this.d = z2;
        this.e = i;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(qs0 qs0Var) {
        boolean z = this.c;
        if (z && !qs0Var.c) {
            return 1;
        }
        if (!z && qs0Var.c) {
            return -1;
        }
        Bundle bundle = this.b;
        if (bundle != null && qs0Var.b == null) {
            return 1;
        }
        if (bundle == null && qs0Var.b != null) {
            return -1;
        }
        if (bundle != null) {
            int size = bundle.size() - qs0Var.b.size();
            if (size > 0) {
                return 1;
            }
            if (size < 0) {
                return -1;
            }
        }
        boolean z2 = this.d;
        if (z2 && !qs0Var.d) {
            return 1;
        }
        if (z2 || !qs0Var.d) {
            return this.e - qs0Var.e;
        }
        return -1;
    }
}
