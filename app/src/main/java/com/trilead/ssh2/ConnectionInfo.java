package com.trilead.ssh2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ConnectionInfo {
    public String clientToServerCryptoAlgorithm;
    public String clientToServerMACAlgorithm;
    public String keyExchangeAlgorithm;
    public int keyExchangeCounter = 0;
    public byte[] serverHostKey;
    public String serverHostKeyAlgorithm;
    public String serverToClientCryptoAlgorithm;
    public String serverToClientMACAlgorithm;
}
