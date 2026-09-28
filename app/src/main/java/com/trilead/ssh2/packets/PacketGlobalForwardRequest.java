package com.trilead.ssh2.packets;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PacketGlobalForwardRequest {
    public String bindAddress;
    public int bindPort;
    byte[] payload;
    public boolean wantReply;

    public PacketGlobalForwardRequest(boolean z, String str, int i) {
        this.wantReply = z;
        this.bindAddress = str;
        this.bindPort = i;
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        if (bArr != null) {
            return bArr;
        }
        TypesWriter typesWriter = new TypesWriter();
        typesWriter.writeByte(80);
        typesWriter.writeString("tcpip-forward");
        typesWriter.writeBoolean(this.wantReply);
        typesWriter.writeString(this.bindAddress);
        typesWriter.writeUINT32(this.bindPort);
        byte[] bytes = typesWriter.getBytes();
        this.payload = bytes;
        return bytes;
    }
}
