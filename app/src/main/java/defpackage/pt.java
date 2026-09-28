package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pt {
    public final ICustomTabsCallback a;
    public final PendingIntent b;

    public pt(ICustomTabsCallback iCustomTabsCallback, PendingIntent pendingIntent) {
        if (iCustomTabsCallback == null && pendingIntent == null) {
            u7.p("CustomTabsSessionToken must have either a session id or a callback (or both).");
            throw null;
        }
        this.a = iCustomTabsCallback;
        this.b = pendingIntent;
        if (iCustomTabsCallback == null) {
            return;
        }
        new ot(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pt) {
            pt ptVar = (pt) obj;
            PendingIntent pendingIntent = ptVar.b;
            PendingIntent pendingIntent2 = this.b;
            if ((pendingIntent2 == null) == (pendingIntent == null)) {
                if (pendingIntent2 != null) {
                    return pendingIntent2.equals(pendingIntent);
                }
                ICustomTabsCallback iCustomTabsCallback = this.a;
                if (iCustomTabsCallback == null) {
                    u7.p("CustomTabSessionToken must have valid binder or pending session");
                    return false;
                }
                IBinder iBinderAsBinder = iCustomTabsCallback.asBinder();
                ICustomTabsCallback iCustomTabsCallback2 = ptVar.a;
                if (iCustomTabsCallback2 != null) {
                    return iBinderAsBinder.equals(iCustomTabsCallback2.asBinder());
                }
                u7.p("CustomTabSessionToken must have valid binder or pending session");
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        ICustomTabsCallback iCustomTabsCallback = this.a;
        if (iCustomTabsCallback != null) {
            return iCustomTabsCallback.asBinder().hashCode();
        }
        u7.p("CustomTabSessionToken must have valid binder or pending session");
        return 0;
    }
}
