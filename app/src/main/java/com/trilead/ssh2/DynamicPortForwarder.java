package com.trilead.ssh2;

import com.trilead.ssh2.channel.ChannelManager;
import com.trilead.ssh2.channel.DynamicAcceptThread;
import java.io.IOException;
import java.net.InetSocketAddress;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class DynamicPortForwarder {
    ChannelManager cm;
    DynamicAcceptThread dat;

    public DynamicPortForwarder(ChannelManager channelManager, InetSocketAddress inetSocketAddress, int i) throws IOException {
        this.cm = channelManager;
        DynamicAcceptThread dynamicAcceptThread = new DynamicAcceptThread(channelManager, inetSocketAddress, i);
        this.dat = dynamicAcceptThread;
        dynamicAcceptThread.setDaemon(true);
        this.dat.start();
    }

    public void close() throws IOException {
        this.dat.stopWorking();
    }

    public DynamicPortForwarder(ChannelManager channelManager, int i, int i2) throws IOException {
        this.cm = channelManager;
        DynamicAcceptThread dynamicAcceptThread = new DynamicAcceptThread(channelManager, i, i2);
        this.dat = dynamicAcceptThread;
        dynamicAcceptThread.setDaemon(true);
        this.dat.start();
    }
}
