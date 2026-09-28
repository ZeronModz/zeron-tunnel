package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsCallback;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzbid;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ot extends CustomTabsCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ot(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public void a(String str, Bundle bundle) {
        switch (this.a) {
            case 0:
                try {
                    ((pt) this.b).a.extraCallback(str, bundle);
                } catch (RemoteException unused) {
                    return;
                }
                break;
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public Bundle b(String str, Bundle bundle) {
        switch (this.a) {
            case 0:
                try {
                    return ((pt) this.b).a.extraCallbackWithResult(str, bundle);
                } catch (RemoteException unused) {
                    return null;
                }
            default:
                return super.b(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public void c(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        switch (this.a) {
            case 0:
                try {
                    ((pt) this.b).a.onActivityLayout(i, i2, i3, i4, i5, bundle);
                } catch (RemoteException unused) {
                    return;
                }
                break;
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public void d(int i, int i2, Bundle bundle) {
        switch (this.a) {
            case 0:
                try {
                    ((pt) this.b).a.onActivityResized(i, i2, bundle);
                } catch (RemoteException unused) {
                    return;
                }
                break;
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public void e(Bundle bundle) {
        switch (this.a) {
            case 0:
                try {
                    ((pt) this.b).a.onMessageChannelReady(bundle);
                } catch (RemoteException unused) {
                    return;
                }
                break;
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public void f(Bundle bundle) {
        switch (this.a) {
            case 0:
                try {
                    ((pt) this.b).a.onMinimized(bundle);
                } catch (RemoteException unused) {
                    return;
                }
                break;
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void g(int i, Bundle bundle) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                try {
                    ((pt) obj).a.onNavigationEvent(i, bundle);
                } catch (RemoteException unused) {
                    return;
                }
                break;
            default:
                zzbid zzbidVar = (zzbid) obj;
                zzbidVar.getClass();
                if (((Boolean) zzbd.zzc().a(p32.y5)).booleanValue() && zzbidVar.d != null) {
                    g3.a.execute(new ph(zzbidVar, i, 7));
                    break;
                }
                break;
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public void h(String str, Bundle bundle) {
        switch (this.a) {
            case 0:
                try {
                    ((pt) this.b).a.onPostMessage(str, bundle);
                } catch (RemoteException unused) {
                    return;
                }
                break;
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public void i(int i, Uri uri, boolean z, Bundle bundle) {
        switch (this.a) {
            case 0:
                try {
                    ((pt) this.b).a.onRelationshipValidationResult(i, uri, z, bundle);
                } catch (RemoteException unused) {
                    return;
                }
                break;
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public void j(Bundle bundle) {
        switch (this.a) {
            case 0:
                try {
                    ((pt) this.b).a.onUnminimized(bundle);
                } catch (RemoteException unused) {
                    return;
                }
                break;
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public void k(Bundle bundle) {
        switch (this.a) {
            case 0:
                try {
                    ((pt) this.b).a.onWarmupCompleted(bundle);
                } catch (RemoteException unused) {
                    return;
                }
                break;
        }
    }
}
