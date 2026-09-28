package com.trilead.ssh2.packets;

import defpackage.hz;
import defpackage.p60;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PacketUserauthFailure {
    String[] authThatCanContinue;
    boolean partialSuccess;
    byte[] payload;

    public PacketUserauthFailure(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = new byte[i2];
        this.payload = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        TypesReader typesReader = new TypesReader(bArr, i, i2);
        int i3 = typesReader.readByte();
        if (i3 != 51) {
            p60.f(hz.p(i3, "This is not a SSH_MSG_USERAUTH_FAILURE! (", ")"));
            throw null;
        }
        this.authThatCanContinue = typesReader.readNameList();
        this.partialSuccess = typesReader.readBoolean();
        if (typesReader.remain() == 0) {
            return;
        }
        p60.f("Padding in SSH_MSG_USERAUTH_FAILURE packet!");
        throw null;
    }

    public String[] getAuthThatCanContinue() {
        return this.authThatCanContinue;
    }

    public boolean isPartialSuccess() {
        return this.partialSuccess;
    }

    public PacketUserauthFailure(String[] strArr, boolean z) {
        this.authThatCanContinue = strArr;
        this.partialSuccess = z;
    }
}
