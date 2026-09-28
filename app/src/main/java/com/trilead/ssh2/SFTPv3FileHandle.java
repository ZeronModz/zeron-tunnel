package com.trilead.ssh2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class SFTPv3FileHandle {
    final SFTPv3Client client;
    final byte[] fileHandle;
    boolean isClosed = false;

    public SFTPv3FileHandle(SFTPv3Client sFTPv3Client, byte[] bArr) {
        this.client = sFTPv3Client;
        this.fileHandle = bArr;
    }

    public SFTPv3Client getClient() {
        return this.client;
    }

    public boolean isClosed() {
        return this.isClosed;
    }
}
