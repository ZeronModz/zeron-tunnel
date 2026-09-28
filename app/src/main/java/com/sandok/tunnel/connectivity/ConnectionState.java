package com.sandok.tunnel.connectivity;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ConnectionState {
    public static ConnectionState getInstance(ConnectivityManager connectivityManager) {
        return new ConnectionStateV21AndHigher(connectivityManager);
    }

    public abstract boolean hasChanged(ConnectionState connectionState);

    public abstract boolean isConnected();

    public abstract boolean isDisconnected();

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class ConnectionStateV20AndLower extends ConnectionState {
        private boolean hasLte;
        private boolean hasWifi;

        public ConnectionStateV20AndLower(ConnectivityManager connectivityManager) {
            this.hasLte = false;
            this.hasWifi = false;
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
            if (networkInfo != null) {
                this.hasWifi = networkInfo.isConnectedOrConnecting();
            }
            if (networkInfo2 != null) {
                this.hasLte = networkInfo2.isConnectedOrConnecting();
            }
        }

        public boolean hasChanged(ConnectionStateV20AndLower connectionStateV20AndLower) {
            boolean z = this.hasWifi;
            if (z && connectionStateV20AndLower.hasWifi) {
                return false;
            }
            return (z == connectionStateV20AndLower.hasWifi && this.hasLte == connectionStateV20AndLower.hasLte) ? false : true;
        }

        @Override // com.sandok.tunnel.connectivity.ConnectionState
        public boolean isConnected() {
            return this.hasWifi || this.hasLte;
        }

        @Override // com.sandok.tunnel.connectivity.ConnectionState
        public boolean isDisconnected() {
            return !isConnected();
        }

        @Override // com.sandok.tunnel.connectivity.ConnectionState
        public boolean hasChanged(ConnectionState connectionState) {
            return hasChanged((ConnectionStateV20AndLower) connectionState);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class ConnectionStateV21AndHigher extends ConnectionState {
        private int mLteActiveNetworks = 0;
        private int mWifiActiveNetworks = 0;

        public ConnectionStateV21AndHigher(ConnectivityManager connectivityManager) {
            for (Network network : connectivityManager.getAllNetworks()) {
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                    this.mWifiActiveNetworks += networkInfo.getType() == 1 ? 1 : 0;
                    this.mLteActiveNetworks += networkInfo.getType() != 0 ? 0 : 1;
                }
            }
        }

        public boolean hasChanged(ConnectionStateV21AndHigher connectionStateV21AndHigher) {
            int i = this.mWifiActiveNetworks;
            if (i <= 0 || connectionStateV21AndHigher.mWifiActiveNetworks <= 0) {
                return (i == connectionStateV21AndHigher.mWifiActiveNetworks && this.mLteActiveNetworks == connectionStateV21AndHigher.mLteActiveNetworks) ? false : true;
            }
            return false;
        }

        @Override // com.sandok.tunnel.connectivity.ConnectionState
        public boolean isConnected() {
            return this.mWifiActiveNetworks > 0 || this.mLteActiveNetworks > 0;
        }

        @Override // com.sandok.tunnel.connectivity.ConnectionState
        public boolean isDisconnected() {
            return !isConnected();
        }

        @Override // com.sandok.tunnel.connectivity.ConnectionState
        public boolean hasChanged(ConnectionState connectionState) {
            return hasChanged((ConnectionStateV21AndHigher) connectionState);
        }
    }
}
