package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nt {
    public final Object a = new Object();
    public final ICustomTabsService b;
    public final dt c;
    public final ComponentName d;

    public nt(ICustomTabsService iCustomTabsService, dt dtVar, ComponentName componentName) {
        this.b = iCustomTabsService;
        this.c = dtVar;
        this.d = componentName;
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.a) {
            try {
                try {
                    this.b.postMessage(this.c, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
