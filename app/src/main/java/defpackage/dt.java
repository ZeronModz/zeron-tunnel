package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.customtabs.ICustomTabsCallback;
import androidx.browser.customtabs.CustomTabsCallback;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dt extends ICustomTabsCallback.Stub {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final /* synthetic */ CustomTabsCallback b;

    public dt(CustomTabsCallback customTabsCallback) {
        this.b = customTabsCallback;
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void extraCallback(String str, Bundle bundle) {
        if (this.b == null) {
            return;
        }
        this.a.post(new ys(this, str, bundle, 0));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.b;
        if (customTabsCallback == null) {
            return null;
        }
        return customTabsCallback.b(str, bundle);
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        if (this.b == null) {
            return;
        }
        this.a.post(new ct(this, i, i2, i3, i4, i5, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onActivityResized(int i, int i2, Bundle bundle) {
        if (this.b == null) {
            return;
        }
        this.a.post(new bt(this, i, i2, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onMessageChannelReady(Bundle bundle) {
        if (this.b == null) {
            return;
        }
        this.a.post(new zs(this, bundle, 0));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onMinimized(Bundle bundle) {
        if (this.b == null) {
            return;
        }
        this.a.post(new zs(this, bundle, 1));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        if (this.b == null) {
            return;
        }
        this.a.post(new f7(this, i, bundle, 2));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onPostMessage(String str, Bundle bundle) {
        if (this.b == null) {
            return;
        }
        this.a.post(new ys(this, str, bundle, 1));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        if (this.b == null) {
            return;
        }
        this.a.post(new at(this, i, uri, z, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onUnminimized(Bundle bundle) {
        if (this.b == null) {
            return;
        }
        this.a.post(new xs(this, bundle, 0));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onWarmupCompleted(Bundle bundle) {
        if (this.b == null) {
            return;
        }
        this.a.post(new xs(this, bundle, 1));
    }
}
