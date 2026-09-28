package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gx0 extends IPostMessageService.Stub {
    @Override // android.support.customtabs.IPostMessageService
    public final void onMessageChannelReady(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
        iCustomTabsCallback.onMessageChannelReady(bundle);
    }

    @Override // android.support.customtabs.IPostMessageService
    public final void onPostMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException {
        iCustomTabsCallback.onPostMessage(str, bundle);
    }
}
