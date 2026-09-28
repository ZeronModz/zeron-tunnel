package com.trilead.ssh2.packets;

import defpackage.hz;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PacketUserauthRequestPublicKey {
    String password;
    byte[] payload;
    byte[] pk;
    String pkAlgoName;
    String serviceName;
    byte[] sig;
    String userName;

    public PacketUserauthRequestPublicKey(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = new byte[i2];
        this.payload = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        int i3 = new TypesReader(bArr, i, i2).readByte();
        if (i3 == 50) {
            throw new IOException("Not implemented!");
        }
        throw new IOException(hz.p(i3, "This is not a SSH_MSG_USERAUTH_REQUEST! (", ")"));
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        if (bArr != null) {
            return bArr;
        }
        TypesWriter typesWriterM = hz.m(50);
        typesWriterM.writeString(this.userName);
        typesWriterM.writeString(this.serviceName);
        typesWriterM.writeString("publickey");
        typesWriterM.writeBoolean(true);
        typesWriterM.writeString(this.pkAlgoName);
        byte[] bArr2 = this.pk;
        typesWriterM.writeString(bArr2, 0, bArr2.length);
        byte[] bArr3 = this.sig;
        typesWriterM.writeString(bArr3, 0, bArr3.length);
        byte[] bytes = typesWriterM.getBytes();
        this.payload = bytes;
        return bytes;
    }

    public PacketUserauthRequestPublicKey(String str, String str2, String str3, byte[] bArr, byte[] bArr2) {
        this.serviceName = str;
        this.userName = str2;
        this.pkAlgoName = str3;
        this.pk = bArr;
        this.sig = bArr2;
    }
}
