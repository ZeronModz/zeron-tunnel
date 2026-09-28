package com.trilead.ssh2.transport;

import com.trilead.ssh2.DHGexParameters;
import com.trilead.ssh2.crypto.dh.DhExchange;
import com.trilead.ssh2.crypto.dh.DhGroupExchange;
import com.trilead.ssh2.packets.PacketKexInit;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class KexState {
    public byte[] H;
    public BigInteger K;
    public DHGexParameters dhgexParameters;
    public DhGroupExchange dhgx;
    public DhExchange dhx;
    private String hashAlgorithm;
    public byte[] hostkey;
    public PacketKexInit localKEX;
    public NegotiatedParameters np;
    public PacketKexInit remoteKEX;
    public int state = 0;

    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public void setHashAlgorithm(String str) {
        this.hashAlgorithm = str;
    }
}
