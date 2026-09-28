package com.trilead.ssh2.channel;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ChannelInputStream extends InputStream {
    Channel c;
    boolean extendedFlag;
    boolean isClosed = false;
    boolean isEOF = false;

    public ChannelInputStream(Channel channel, boolean z) {
        this.c = channel;
        this.extendedFlag = z;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.isEOF) {
            return 0;
        }
        Channel channel = this.c;
        int available = channel.cm.getAvailable(channel, this.extendedFlag);
        if (available > 0) {
            return available;
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.isClosed = true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        bArr.getClass();
        if (i < 0 || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0 || i > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.isEOF) {
            return -1;
        }
        Channel channel = this.c;
        int channelData = channel.cm.getChannelData(channel, this.extendedFlag, bArr, i, i2);
        if (channelData == -1) {
            this.isEOF = true;
        }
        return channelData;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) != 1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
