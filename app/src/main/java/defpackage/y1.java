package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;
import com.google.firebase.sessions.dagger.Lazy;
import com.google.firebase.sessions.dagger.internal.Factory;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y1 implements Factory, Lazy {
    public final Object a;

    public /* synthetic */ y1(Object obj) {
        this.a = obj;
    }

    public static y1 a(Object obj) {
        if (obj != null) {
            return new y1(obj);
        }
        io0.e("instance cannot be null");
        return null;
    }

    public static y1 b(int i, int i2, int i3, boolean z, boolean z2, int i4) {
        return new y1(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.a;
    }
}
