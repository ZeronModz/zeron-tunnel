package com.trilead.ssh2.packets;

import defpackage.hz;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PacketSessionX11Request {
    byte[] payload;
    public int recipientChannelID;
    public boolean singleConnection;
    public boolean wantReply;
    String x11AuthenticationCookie;
    String x11AuthenticationProtocol;
    int x11ScreenNumber;

    public PacketSessionX11Request(int i, boolean z, boolean z2, String str, String str2, int i2) {
        this.recipientChannelID = i;
        this.wantReply = z;
        this.singleConnection = z2;
        this.x11AuthenticationProtocol = str;
        this.x11AuthenticationCookie = str2;
        this.x11ScreenNumber = i2;
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        if (bArr != null) {
            return bArr;
        }
        TypesWriter typesWriterM = hz.m(98);
        typesWriterM.writeUINT32(this.recipientChannelID);
        typesWriterM.writeString("x11-req");
        typesWriterM.writeBoolean(this.wantReply);
        typesWriterM.writeBoolean(this.singleConnection);
        typesWriterM.writeString(this.x11AuthenticationProtocol);
        typesWriterM.writeString(this.x11AuthenticationCookie);
        typesWriterM.writeUINT32(this.x11ScreenNumber);
        byte[] bytes = typesWriterM.getBytes();
        this.payload = bytes;
        return bytes;
    }
}
