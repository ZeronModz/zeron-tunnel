package defpackage;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ra0 {
    public int a;
    public Fragment b;
    public boolean c = true;
    public int d;
    public int e;
    public int f;
    public int g;
    public Lifecycle.State h;
    public Lifecycle.State i;

    public ra0(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
        Lifecycle.State state = Lifecycle.State.RESUMED;
        this.h = state;
        this.i = state;
    }

    public ra0(int i, Fragment fragment, int i2) {
        this.a = i;
        this.b = fragment;
        Lifecycle.State state = Lifecycle.State.RESUMED;
        this.h = state;
        this.i = state;
    }
}
