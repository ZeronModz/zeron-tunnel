package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.datatransport.runtime.dagger.Lazy;
import com.google.android.datatransport.runtime.dagger.internal.Factory;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class pg0 implements Factory, Lazy {
    public static pg0 b;
    public final Object a;

    public pg0() {
        this.a = new Object();
        new Handler(Looper.getMainLooper(), new m9(this, 2));
    }

    public void a() {
        synchronized (this.a) {
        }
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.a;
    }

    public pg0(Object obj) {
        this.a = obj;
    }
}
