package com.sandok.tunnel.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ConnectivityReceiverBase {
    private static String TAG = "service.ConnectivityReceiver";
    private Object _refHandle;
    protected Context context;
    private ConnectivityManager manager = null;

    /* JADX INFO: renamed from: com.sandok.tunnel.connectivity.ConnectivityReceiverBase$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public class AnonymousClass2 extends BroadcastReceiver {
        public AnonymousClass2() {
        }

        private boolean isOnline() {
            NetworkInfo activeNetworkInfo = ConnectivityReceiverBase.this.getManager().getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            String action = intent.getAction();
            if (((action.hashCode() == -1172645946 && action.equals("android.net.conn.CONNECTIVITY_CHANGE")) ? null : -1) == null) {
                boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
                boolean booleanExtra2 = intent.getBooleanExtra("isFailover", false);
                boolean zIsOnline = isOnline();
                ConnectivityManager manager = ConnectivityReceiverBase.this.getManager();
                NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                NetworkInfo networkInfo2 = networkInfo != null ? manager.getNetworkInfo(networkInfo.getType()) : null;
                try {
                    str = networkInfo2.getTypeName() + networkInfo2.getSubtypeName();
                } catch (NullPointerException unused) {
                    str = "---" + networkInfo2.getSubtypeName();
                }
                StringBuilder sb = new StringBuilder("ConnectivityReceiver: CONNECTIVITY_ACTION conn=");
                sb.append(zIsOnline);
                sb.append(" fo=");
                sb.append(booleanExtra2);
                if (booleanExtra2) {
                    ConnectivityReceiverBase.this.onLosing(str);
                }
                if (booleanExtra && !zIsOnline) {
                    ConnectivityReceiverBase.this.onLost(str);
                }
                if (booleanExtra || !zIsOnline) {
                    return;
                }
                ConnectivityReceiverBase.this.onAvailable(str);
            }
        }
    }

    public ConnectivityReceiverBase(Context context) {
        this.context = context;
    }

    private void registerFor21AndUp() {
        ConnectivityManager manager = getManager();
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(15).build();
        ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.sandok.tunnel.connectivity.ConnectivityReceiverBase.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                ConnectivityReceiverBase.this.onAvailable(network);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLosing(Network network, int i) {
                ConnectivityReceiverBase.this.onLosing(network);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                ConnectivityReceiverBase.this.onLost(network);
            }
        };
        this._refHandle = networkCallback;
        manager.registerNetworkCallback(networkRequestBuild, networkCallback);
    }

    private void unregisterFor21AndUp() {
        getManager().unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this._refHandle);
    }

    public ConnectivityManager getManager() {
        ConnectivityManager connectivityManager = this.manager;
        if (connectivityManager != null) {
            return connectivityManager;
        }
        ConnectivityManager connectivityManager2 = (ConnectivityManager) this.context.getSystemService("connectivity");
        this.manager = connectivityManager2;
        return connectivityManager2;
    }

    public void register() {
        registerFor21AndUp();
        registerFor20AndDown();
    }

    public void unregister() {
        unregisterFor21AndUp();
        unregisterFor20AndDown();
    }

    private void registerFor20AndDown() {
    }

    private void unregisterFor20AndDown() {
    }

    public void onAvailable(Object obj) {
    }

    public void onLosing(Object obj) {
    }

    public void onLost(Object obj) {
    }
}
