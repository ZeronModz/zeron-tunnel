package com.trilead.ssh2.packets;

import com.trilead.ssh2.DHGexParameters;
import defpackage.hz;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PacketKexDhGexRequest {
    int max;
    int min;
    int n;
    byte[] payload;

    public PacketKexDhGexRequest(DHGexParameters dHGexParameters) {
        this.min = dHGexParameters.getMin_group_len();
        this.n = dHGexParameters.getPref_group_len();
        this.max = dHGexParameters.getMax_group_len();
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        if (bArr != null) {
            return bArr;
        }
        TypesWriter typesWriterM = hz.m(34);
        typesWriterM.writeUINT32(this.min);
        typesWriterM.writeUINT32(this.n);
        typesWriterM.writeUINT32(this.max);
        byte[] bytes = typesWriterM.getBytes();
        this.payload = bytes;
        return bytes;
    }
}
