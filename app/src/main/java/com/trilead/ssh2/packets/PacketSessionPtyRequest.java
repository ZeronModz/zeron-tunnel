package com.trilead.ssh2.packets;

import defpackage.hz;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PacketSessionPtyRequest {
    public int character_height;
    public int character_width;
    byte[] payload;
    public int pixel_height;
    public int pixel_width;
    public int recipientChannelID;
    public String term;
    public byte[] terminal_modes;
    public boolean wantReply;

    public PacketSessionPtyRequest(int i, boolean z, String str, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.recipientChannelID = i;
        this.wantReply = z;
        this.term = str;
        this.character_width = i2;
        this.character_height = i3;
        this.pixel_width = i4;
        this.pixel_height = i5;
        this.terminal_modes = bArr;
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        if (bArr != null) {
            return bArr;
        }
        TypesWriter typesWriterM = hz.m(98);
        typesWriterM.writeUINT32(this.recipientChannelID);
        typesWriterM.writeString("pty-req");
        typesWriterM.writeBoolean(this.wantReply);
        typesWriterM.writeString(this.term);
        typesWriterM.writeUINT32(this.character_width);
        typesWriterM.writeUINT32(this.character_height);
        typesWriterM.writeUINT32(this.pixel_width);
        typesWriterM.writeUINT32(this.pixel_height);
        byte[] bArr2 = this.terminal_modes;
        typesWriterM.writeString(bArr2, 0, bArr2.length);
        byte[] bytes = typesWriterM.getBytes();
        this.payload = bytes;
        return bytes;
    }
}
