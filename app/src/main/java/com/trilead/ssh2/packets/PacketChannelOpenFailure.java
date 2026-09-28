package com.trilead.ssh2.packets;

import defpackage.hz;
import defpackage.p60;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PacketChannelOpenFailure {
    public String description;
    public String languageTag;
    byte[] payload;
    public int reasonCode;
    public int recipientChannelID;

    public PacketChannelOpenFailure(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = new byte[i2];
        this.payload = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        TypesReader typesReader = new TypesReader(bArr, i, i2);
        int i3 = typesReader.readByte();
        if (i3 != 92) {
            p60.f(hz.p(i3, "This is not a SSH_MSG_CHANNEL_OPEN_FAILURE! (", ")"));
            throw null;
        }
        this.recipientChannelID = typesReader.readUINT32();
        this.reasonCode = typesReader.readUINT32();
        this.description = typesReader.readString();
        this.languageTag = typesReader.readString();
        if (typesReader.remain() == 0) {
            return;
        }
        p60.f("Padding in SSH_MSG_CHANNEL_OPEN_FAILURE packet!");
        throw null;
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        if (bArr != null) {
            return bArr;
        }
        TypesWriter typesWriterM = hz.m(92);
        typesWriterM.writeUINT32(this.recipientChannelID);
        typesWriterM.writeUINT32(this.reasonCode);
        typesWriterM.writeString(this.description);
        typesWriterM.writeString(this.languageTag);
        byte[] bytes = typesWriterM.getBytes();
        this.payload = bytes;
        return bytes;
    }

    public PacketChannelOpenFailure(int i, int i2, String str, String str2) {
        this.recipientChannelID = i;
        this.reasonCode = i2;
        this.description = str;
        this.languageTag = str2;
    }
}
