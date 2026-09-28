package com.trilead.ssh2.packets;

import defpackage.hz;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PacketSessionSubsystemRequest {
    byte[] payload;
    public int recipientChannelID;
    public String subsystem;
    public boolean wantReply;

    public PacketSessionSubsystemRequest(int i, boolean z, String str) {
        this.recipientChannelID = i;
        this.wantReply = z;
        this.subsystem = str;
    }

    public byte[] getPayload() {
        if (this.payload == null) {
            TypesWriter typesWriterM = hz.m(98);
            typesWriterM.writeUINT32(this.recipientChannelID);
            typesWriterM.writeString("subsystem");
            typesWriterM.writeBoolean(this.wantReply);
            typesWriterM.writeString(this.subsystem);
            byte[] bytes = typesWriterM.getBytes();
            this.payload = bytes;
            typesWriterM.getBytes(bytes);
        }
        return this.payload;
    }
}
