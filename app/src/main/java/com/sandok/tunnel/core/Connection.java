package com.sandok.tunnel.core;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class Connection implements Serializable, Cloneable {
    public static final int CONNECTION_DEFAULT_TIMEOUT = 120;
    private static final long serialVersionUID = 92031902903829089L;
    public String mServerName = "openvpn.example.com";
    public String mServerPort = "1194";
    public boolean mUseUdp = true;
    public String mCustomConfiguration = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public boolean mUseCustomConfig = false;
    public boolean mEnabled = true;
    public int mConnectTimeout = 0;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Connection m15clone() throws CloneNotSupportedException {
        return (Connection) super.clone();
    }

    public String getConnectionBlock() {
        StringBuilder sb = new StringBuilder(("remote " + this.mServerName).concat(" "));
        sb.append(this.mServerPort);
        String string = sb.toString();
        String strConcat = this.mUseUdp ? string.concat(" udp\n") : string.concat(" tcp-client\n");
        int i = this.mConnectTimeout;
        if (i != 0) {
            strConcat = strConcat.concat(String.format(" connect-timeout  %d\n", Integer.valueOf(i)));
        }
        if (TextUtils.isEmpty(this.mCustomConfiguration) || !this.mUseCustomConfig) {
            return strConcat;
        }
        return (strConcat + this.mCustomConfiguration).concat("\n");
    }

    public int getTimeout() {
        int i = this.mConnectTimeout;
        return i <= 0 ? CONNECTION_DEFAULT_TIMEOUT : i;
    }

    public boolean isOnlyRemote() {
        return TextUtils.isEmpty(this.mCustomConfiguration) || !this.mUseCustomConfig;
    }
}
