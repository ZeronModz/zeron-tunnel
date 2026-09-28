package com.trilead.ssh2.packets;

import defpackage.hz;
import defpackage.p60;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PacketUserauthBanner {
    String language;
    String message;
    byte[] payload;

    public PacketUserauthBanner(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = new byte[i2];
        this.payload = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        TypesReader typesReader = new TypesReader(bArr, i, i2);
        int i3 = typesReader.readByte();
        if (i3 != 53) {
            p60.f(hz.p(i3, "This is not a SSH_MSG_USERAUTH_BANNER! (", ")"));
            throw null;
        }
        this.message = typesReader.readString("UTF-8");
        this.language = typesReader.readString();
        if (typesReader.remain() == 0) {
            return;
        }
        p60.f("Padding in SSH_MSG_USERAUTH_REQUEST packet!");
        throw null;
    }

    public String getBanner() {
        return this.message;
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        if (bArr != null) {
            return bArr;
        }
        TypesWriter typesWriterM = hz.m(53);
        typesWriterM.writeString(this.message);
        typesWriterM.writeString(this.language);
        byte[] bytes = typesWriterM.getBytes();
        this.payload = bytes;
        return bytes;
    }

    public PacketUserauthBanner(String str, String str2) {
        this.message = str;
        this.language = str2;
    }
}
