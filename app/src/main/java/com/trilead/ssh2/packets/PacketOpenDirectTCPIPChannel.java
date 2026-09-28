package com.trilead.ssh2.packets;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PacketOpenDirectTCPIPChannel {
    int channelID;
    String host_to_connect;
    int initialWindowSize;
    int maxPacketSize;
    String originator_IP_address;
    int originator_port;
    byte[] payload;
    int port_to_connect;

    public PacketOpenDirectTCPIPChannel(int i, int i2, int i3, String str, int i4, String str2, int i5) {
        this.channelID = i;
        this.initialWindowSize = i2;
        this.maxPacketSize = i3;
        this.host_to_connect = str;
        this.port_to_connect = i4;
        this.originator_IP_address = str2;
        this.originator_port = i5;
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        if (bArr != null) {
            return bArr;
        }
        TypesWriter typesWriter = new TypesWriter();
        typesWriter.writeByte(90);
        typesWriter.writeString("direct-tcpip");
        typesWriter.writeUINT32(this.channelID);
        typesWriter.writeUINT32(this.initialWindowSize);
        typesWriter.writeUINT32(this.maxPacketSize);
        typesWriter.writeString(this.host_to_connect);
        typesWriter.writeUINT32(this.port_to_connect);
        typesWriter.writeString(this.originator_IP_address);
        typesWriter.writeUINT32(this.originator_port);
        byte[] bytes = typesWriter.getBytes();
        this.payload = bytes;
        return bytes;
    }
}
