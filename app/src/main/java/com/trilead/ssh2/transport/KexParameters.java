package com.trilead.ssh2.transport;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class KexParameters {
    public String[] compression_algorithms_client_to_server;
    public String[] compression_algorithms_server_to_client;
    public byte[] cookie;
    public String[] encryption_algorithms_client_to_server;
    public String[] encryption_algorithms_server_to_client;
    public boolean first_kex_packet_follows;
    public String[] kex_algorithms;
    public String[] languages_client_to_server;
    public String[] languages_server_to_client;
    public String[] mac_algorithms_client_to_server;
    public String[] mac_algorithms_server_to_client;
    public int reserved_field1;
    public String[] server_host_key_algorithms;
}
