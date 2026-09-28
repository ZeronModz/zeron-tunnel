package com.vpn.sandok.ultrasshservice.util.securepreferences.model;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public enum EncryptionAlgorithm {
    AES(new int[]{128, 196, 256}),
    TripleDES(new int[]{128, 192});

    private int[] keySizesInBits;

    EncryptionAlgorithm(int[] iArr) {
        this.keySizesInBits = iArr;
    }

    public int[] getKeySizes() {
        return this.keySizesInBits;
    }
}
