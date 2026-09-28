package com.trilead.ssh2.packets;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PacketUserauthRequestInteractive {
    byte[] payload;
    String serviceName;
    String[] submethods;
    String userName;

    public PacketUserauthRequestInteractive(String str, String str2, String[] strArr) {
        this.serviceName = str;
        this.userName = str2;
        this.submethods = strArr;
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        if (bArr != null) {
            return bArr;
        }
        TypesWriter typesWriterM = hz.m(50);
        typesWriterM.writeString(this.userName);
        typesWriterM.writeString(this.serviceName);
        typesWriterM.writeString("keyboard-interactive");
        typesWriterM.writeString(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        typesWriterM.writeNameList(this.submethods);
        byte[] bytes = typesWriterM.getBytes();
        this.payload = bytes;
        return bytes;
    }
}
