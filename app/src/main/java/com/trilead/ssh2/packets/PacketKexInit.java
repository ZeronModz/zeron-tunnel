package com.trilead.ssh2.packets;

import com.trilead.ssh2.crypto.CryptoWishList;
import com.trilead.ssh2.transport.KexParameters;
import defpackage.hz;
import defpackage.p60;
import java.io.IOException;
import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PacketKexInit {
    KexParameters kp;
    byte[] payload;

    public PacketKexInit(byte[] bArr, int i, int i2) throws IOException {
        this.kp = new KexParameters();
        byte[] bArr2 = new byte[i2];
        this.payload = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        TypesReader typesReader = new TypesReader(bArr, i, i2);
        int i3 = typesReader.readByte();
        if (i3 != 20) {
            p60.f(hz.p(i3, "This is not a KexInitPacket! (", ")"));
            throw null;
        }
        this.kp.cookie = typesReader.readBytes(16);
        this.kp.kex_algorithms = typesReader.readNameList();
        this.kp.server_host_key_algorithms = typesReader.readNameList();
        this.kp.encryption_algorithms_client_to_server = typesReader.readNameList();
        this.kp.encryption_algorithms_server_to_client = typesReader.readNameList();
        this.kp.mac_algorithms_client_to_server = typesReader.readNameList();
        this.kp.mac_algorithms_server_to_client = typesReader.readNameList();
        this.kp.compression_algorithms_client_to_server = typesReader.readNameList();
        this.kp.compression_algorithms_server_to_client = typesReader.readNameList();
        this.kp.languages_client_to_server = typesReader.readNameList();
        this.kp.languages_server_to_client = typesReader.readNameList();
        this.kp.first_kex_packet_follows = typesReader.readBoolean();
        this.kp.reserved_field1 = typesReader.readUINT32();
        if (typesReader.remain() == 0) {
            return;
        }
        p60.f("Padding in KexInitPacket!");
        throw null;
    }

    public String[] getCompression_algorithms_client_to_server() {
        return this.kp.compression_algorithms_client_to_server;
    }

    public String[] getCompression_algorithms_server_to_client() {
        return this.kp.compression_algorithms_server_to_client;
    }

    public byte[] getCookie() {
        return this.kp.cookie;
    }

    public String[] getEncryption_algorithms_client_to_server() {
        return this.kp.encryption_algorithms_client_to_server;
    }

    public String[] getEncryption_algorithms_server_to_client() {
        return this.kp.encryption_algorithms_server_to_client;
    }

    public KexParameters getKexParameters() {
        return this.kp;
    }

    public String[] getKex_algorithms() {
        return this.kp.kex_algorithms;
    }

    public String[] getLanguages_client_to_server() {
        return this.kp.languages_client_to_server;
    }

    public String[] getLanguages_server_to_client() {
        return this.kp.languages_server_to_client;
    }

    public String[] getMac_algorithms_client_to_server() {
        return this.kp.mac_algorithms_client_to_server;
    }

    public String[] getMac_algorithms_server_to_client() {
        return this.kp.mac_algorithms_server_to_client;
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        if (bArr != null) {
            return bArr;
        }
        TypesWriter typesWriterM = hz.m(20);
        typesWriterM.writeBytes(this.kp.cookie, 0, 16);
        typesWriterM.writeNameList(this.kp.kex_algorithms);
        typesWriterM.writeNameList(this.kp.server_host_key_algorithms);
        typesWriterM.writeNameList(this.kp.encryption_algorithms_client_to_server);
        typesWriterM.writeNameList(this.kp.encryption_algorithms_server_to_client);
        typesWriterM.writeNameList(this.kp.mac_algorithms_client_to_server);
        typesWriterM.writeNameList(this.kp.mac_algorithms_server_to_client);
        typesWriterM.writeNameList(this.kp.compression_algorithms_client_to_server);
        typesWriterM.writeNameList(this.kp.compression_algorithms_server_to_client);
        typesWriterM.writeNameList(this.kp.languages_client_to_server);
        typesWriterM.writeNameList(this.kp.languages_server_to_client);
        typesWriterM.writeBoolean(this.kp.first_kex_packet_follows);
        typesWriterM.writeUINT32(this.kp.reserved_field1);
        byte[] bytes = typesWriterM.getBytes();
        this.payload = bytes;
        return bytes;
    }

    public int getReserved_field1() {
        return this.kp.reserved_field1;
    }

    public String[] getServer_host_key_algorithms() {
        return this.kp.server_host_key_algorithms;
    }

    public boolean isFirst_kex_packet_follows() {
        return this.kp.first_kex_packet_follows;
    }

    public PacketKexInit(CryptoWishList cryptoWishList, SecureRandom secureRandom) {
        KexParameters kexParameters = new KexParameters();
        this.kp = kexParameters;
        byte[] bArr = new byte[16];
        kexParameters.cookie = bArr;
        secureRandom.nextBytes(bArr);
        KexParameters kexParameters2 = this.kp;
        kexParameters2.kex_algorithms = cryptoWishList.kexAlgorithms;
        kexParameters2.server_host_key_algorithms = cryptoWishList.serverHostKeyAlgorithms;
        kexParameters2.encryption_algorithms_client_to_server = cryptoWishList.c2s_enc_algos;
        kexParameters2.encryption_algorithms_server_to_client = cryptoWishList.s2c_enc_algos;
        kexParameters2.mac_algorithms_client_to_server = cryptoWishList.c2s_mac_algos;
        kexParameters2.mac_algorithms_server_to_client = cryptoWishList.s2c_mac_algos;
        kexParameters2.compression_algorithms_client_to_server = new String[]{"none"};
        kexParameters2.compression_algorithms_server_to_client = new String[]{"none"};
        kexParameters2.languages_client_to_server = new String[0];
        kexParameters2.languages_server_to_client = new String[0];
        kexParameters2.first_kex_packet_follows = false;
        kexParameters2.reserved_field1 = 0;
    }
}
