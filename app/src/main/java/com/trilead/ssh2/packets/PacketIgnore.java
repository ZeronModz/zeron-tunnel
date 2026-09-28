package com.trilead.ssh2.packets;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;
import defpackage.p60;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PacketIgnore {
    byte[] data;
    byte[] payload;

    public PacketIgnore(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = new byte[i2];
        this.payload = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        int i3 = new TypesReader(bArr, i, i2).readByte();
        if (i3 == 2) {
            return;
        }
        p60.f(hz.p(i3, "This is not a SSH_MSG_IGNORE packet! (", ")"));
        throw null;
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        if (bArr != null) {
            return bArr;
        }
        TypesWriter typesWriterM = hz.m(2);
        byte[] bArr2 = this.data;
        if (bArr2 != null) {
            typesWriterM.writeString(bArr2, 0, bArr2.length);
        } else {
            typesWriterM.writeString(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
        byte[] bytes = typesWriterM.getBytes();
        this.payload = bytes;
        return bytes;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
        this.payload = null;
    }

    public PacketIgnore() {
    }
}
