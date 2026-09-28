package com.trilead.ssh2.packets;

import defpackage.hz;
import defpackage.p60;
import defpackage.u7;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PacketKexDhGexGroup {
    BigInteger g;
    BigInteger p;
    byte[] payload;

    public PacketKexDhGexGroup(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = new byte[i2];
        this.payload = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        TypesReader typesReader = new TypesReader(bArr, i, i2);
        int i3 = typesReader.readByte();
        if (i3 != 31) {
            u7.r(hz.p(i3, "This is not a SSH_MSG_KEX_DH_GEX_GROUP! (", ")"));
            throw null;
        }
        this.p = typesReader.readMPINT();
        this.g = typesReader.readMPINT();
        if (typesReader.remain() == 0) {
            return;
        }
        p60.f("PADDING IN SSH_MSG_KEX_DH_GEX_GROUP!");
        throw null;
    }

    public BigInteger getG() {
        return this.g;
    }

    public BigInteger getP() {
        return this.p;
    }
}
