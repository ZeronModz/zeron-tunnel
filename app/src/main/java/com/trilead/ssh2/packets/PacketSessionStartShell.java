package com.trilead.ssh2.packets;

import defpackage.hz;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PacketSessionStartShell {
    byte[] payload;
    public int recipientChannelID;
    public boolean wantReply;

    public PacketSessionStartShell(int i, boolean z) {
        this.recipientChannelID = i;
        this.wantReply = z;
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        if (bArr != null) {
            return bArr;
        }
        TypesWriter typesWriterM = hz.m(98);
        typesWriterM.writeUINT32(this.recipientChannelID);
        typesWriterM.writeString("shell");
        typesWriterM.writeBoolean(this.wantReply);
        byte[] bytes = typesWriterM.getBytes();
        this.payload = bytes;
        return bytes;
    }
}
