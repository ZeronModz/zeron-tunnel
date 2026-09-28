package defpackage;

import com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener;
import com.google.firebase.FirebaseApp$BackgroundStateChangeListener;
import com.google.firebase.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h60 implements BackgroundDetector$BackgroundStateChangeListener {
    public static final AtomicReference a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        synchronized (a.k) {
            try {
                for (a aVar : new ArrayList(a.l.values())) {
                    if (aVar.e.get()) {
                        Iterator it = aVar.i.iterator();
                        while (it.hasNext()) {
                            ((FirebaseApp$BackgroundStateChangeListener) it.next()).onBackgroundStateChanged(z);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
