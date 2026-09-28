package com.trilead.ssh2;

import java.io.IOException;
import java.net.Socket;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public interface ProxyData {
    void close();

    Socket openConnection(String str, int i, int i2, int i3) throws IOException;
}
