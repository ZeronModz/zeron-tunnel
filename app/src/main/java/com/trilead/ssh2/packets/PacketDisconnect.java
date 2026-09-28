package com.trilead.ssh2.packets;

import defpackage.hz;
import defpackage.p60;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PacketDisconnect {
    String desc;
    String lang;
    byte[] payload;
    int reason;

    public PacketDisconnect(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = new byte[i2];
        this.payload = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        TypesReader typesReader = new TypesReader(bArr, i, i2);
        int i3 = typesReader.readByte();
        if (i3 != 1) {
            p60.f(hz.p(i3, "This is not a Disconnect Packet! (", ")"));
            throw null;
        }
        this.reason = typesReader.readUINT32();
        this.desc = typesReader.readString();
        this.lang = typesReader.readString();
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        if (bArr != null) {
            return bArr;
        }
        TypesWriter typesWriterM = hz.m(1);
        typesWriterM.writeUINT32(this.reason);
        typesWriterM.writeString(this.desc);
        typesWriterM.writeString(this.lang);
        byte[] bytes = typesWriterM.getBytes();
        this.payload = bytes;
        return bytes;
    }

    public PacketDisconnect(int i, String str, String str2) {
        this.reason = i;
        this.desc = str;
        this.lang = str2;
    }
}
