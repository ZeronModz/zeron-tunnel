package com.trilead.ssh2.packets;

import defpackage.hz;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PacketSessionExecCommand {
    public String command;
    byte[] payload;
    public int recipientChannelID;
    public boolean wantReply;

    public PacketSessionExecCommand(int i, boolean z, String str) {
        this.recipientChannelID = i;
        this.wantReply = z;
        this.command = str;
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        if (bArr != null) {
            return bArr;
        }
        TypesWriter typesWriterM = hz.m(98);
        typesWriterM.writeUINT32(this.recipientChannelID);
        typesWriterM.writeString("exec");
        typesWriterM.writeBoolean(this.wantReply);
        typesWriterM.writeString(this.command);
        byte[] bytes = typesWriterM.getBytes();
        this.payload = bytes;
        return bytes;
    }
}
