package com.trilead.ssh2.crypto;

import com.trilead.ssh2.crypto.cipher.BlockCipherFactory;
import com.trilead.ssh2.crypto.digest.MessageMac;
import com.trilead.ssh2.transport.KexManager;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class CryptoWishList {
    public String[] kexAlgorithms = KexManager.getDefaultKexAlgorithmList();
    public String[] serverHostKeyAlgorithms = KexManager.getDefaultServerHostkeyAlgorithmList();
    public String[] c2s_enc_algos = BlockCipherFactory.getDefaultCipherList();
    public String[] s2c_enc_algos = BlockCipherFactory.getDefaultCipherList();
    public String[] c2s_mac_algos = MessageMac.getMacs();
    public String[] s2c_mac_algos = MessageMac.getMacs();
}
