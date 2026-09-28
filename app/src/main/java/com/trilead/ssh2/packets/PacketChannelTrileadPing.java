package com.trilead.ssh2.packets;

import defpackage.hz;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PacketChannelTrileadPing {
    byte[] payload;
    public int recipientChannelID;

    public PacketChannelTrileadPing(int i) {
        this.recipientChannelID = i;
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        if (bArr != null) {
            return bArr;
        }
        TypesWriter typesWriterM = hz.m(98);
        typesWriterM.writeUINT32(this.recipientChannelID);
        typesWriterM.writeString("trilead-ping");
        typesWriterM.writeBoolean(true);
        byte[] bytes = typesWriterM.getBytes();
        this.payload = bytes;
        return bytes;
    }
}
