package com.trilead.ssh2.packets;

import defpackage.hz;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PacketKexDHInit {
    BigInteger e;
    byte[] payload;

    public PacketKexDHInit(BigInteger bigInteger) {
        this.e = bigInteger;
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        if (bArr != null) {
            return bArr;
        }
        TypesWriter typesWriterM = hz.m(30);
        typesWriterM.writeMPInt(this.e);
        byte[] bytes = typesWriterM.getBytes();
        this.payload = bytes;
        return bytes;
    }
}
