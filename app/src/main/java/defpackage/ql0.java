package defpackage;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ql0 {
    public final Observer a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ LiveData d;

    public ql0(LiveData liveData, Observer observer) {
        this.d = liveData;
        this.a = observer;
    }

    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        LiveData liveData = this.d;
        int i2 = liveData.c;
        liveData.c = i + i2;
        if (!liveData.d) {
            liveData.d = true;
            while (true) {
                try {
                    int i3 = liveData.c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        liveData.g();
                    } else if (z3) {
                        liveData.h();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    liveData.d = false;
                    throw th;
                }
            }
            liveData.d = false;
        }
        if (this.b) {
            liveData.c(this);
        }
    }

    public boolean c(LifecycleOwner lifecycleOwner) {
        return false;
    }

    public abstract boolean d();

    public void b() {
    }
}
