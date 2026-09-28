package com.trilead.ssh2.transport;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public interface MessageHandler {
    void handleEndMessage(Throwable th) throws IOException;

    void handleMessage(byte[] bArr, int i) throws IOException;
}
