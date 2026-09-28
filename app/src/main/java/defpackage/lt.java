package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.IEngagementSignalsCallback;
import androidx.browser.customtabs.CustomTabsService;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lt extends ICustomTabsService.Stub {
    public final /* synthetic */ CustomTabsService b;

    public lt(CustomTabsService customTabsService) {
        this.b = customTabsService;
    }

    public static PendingIntent a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
        bundle.remove("android.support.customtabs.extra.SESSION_ID");
        return pendingIntent;
    }

    public final boolean b(ICustomTabsCallback iCustomTabsCallback, PendingIntent pendingIntent) {
        final pt ptVar = new pt(iCustomTabsCallback, pendingIntent);
        try {
            IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: kt
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    lt ltVar = this.a;
                    pt ptVar2 = ptVar;
                    CustomTabsService customTabsService = ltVar.b;
                    try {
                        synchronized (customTabsService.a) {
                            try {
                                ICustomTabsCallback iCustomTabsCallback2 = ptVar2.a;
                                IBinder iBinderAsBinder = iCustomTabsCallback2 == null ? null : iCustomTabsCallback2.asBinder();
                                if (iBinderAsBinder == null) {
                                    return;
                                }
                                iBinderAsBinder.unlinkToDeath((IBinder.DeathRecipient) customTabsService.a.get(iBinderAsBinder), 0);
                                customTabsService.a.remove(iBinderAsBinder);
                            } finally {
                            }
                        }
                    } catch (NoSuchElementException unused) {
                    }
                }
            };
            synchronized (this.b.a) {
                iCustomTabsCallback.asBinder().linkToDeath(deathRecipient, 0);
                this.b.a.put(iCustomTabsCallback.asBinder(), deathRecipient);
            }
            return this.b.c();
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // android.support.customtabs.ICustomTabsService
    public final Bundle extraCommand(String str, Bundle bundle) {
        return this.b.a();
    }

    @Override // android.support.customtabs.ICustomTabsService
    public final boolean isEngagementSignalsApiAvailable(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        new pt(iCustomTabsCallback, a(bundle));
        return false;
    }

    @Override // android.support.customtabs.ICustomTabsService
    public final boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List list) {
        new pt(iCustomTabsCallback, a(bundle));
        return this.b.b();
    }

    @Override // android.support.customtabs.ICustomTabsService
    public final boolean newSession(ICustomTabsCallback iCustomTabsCallback) {
        return b(iCustomTabsCallback, null);
    }

    @Override // android.support.customtabs.ICustomTabsService
    public final boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        return b(iCustomTabsCallback, a(bundle));
    }

    @Override // android.support.customtabs.ICustomTabsService
    public final int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
        new pt(iCustomTabsCallback, a(bundle));
        return this.b.d();
    }

    @Override // android.support.customtabs.ICustomTabsService
    public final boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i, Bundle bundle) {
        new pt(iCustomTabsCallback, a(bundle));
        return this.b.e();
    }

    @Override // android.support.customtabs.ICustomTabsService
    public final boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
        new pt(iCustomTabsCallback, null);
        new Bundle();
        return this.b.f();
    }

    @Override // android.support.customtabs.ICustomTabsService
    public final boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
        new pt(iCustomTabsCallback, a(bundle));
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
            }
        }
        return this.b.f();
    }

    @Override // android.support.customtabs.ICustomTabsService
    public final boolean setEngagementSignalsCallback(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) {
        IInterface iInterfaceQueryLocalInterface;
        if (iBinder != null && (iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IEngagementSignalsCallback.DESCRIPTOR)) != null && (iInterfaceQueryLocalInterface instanceof IEngagementSignalsCallback)) {
        }
        new pt(iCustomTabsCallback, a(bundle));
        return false;
    }

    @Override // android.support.customtabs.ICustomTabsService
    public final boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        new pt(iCustomTabsCallback, a(bundle));
        return this.b.g();
    }

    @Override // android.support.customtabs.ICustomTabsService
    public final boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) {
        new pt(iCustomTabsCallback, a(bundle));
        return this.b.h();
    }

    @Override // android.support.customtabs.ICustomTabsService
    public final boolean warmup(long j) {
        return this.b.i();
    }
}
