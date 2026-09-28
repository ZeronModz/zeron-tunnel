package com.trilead.ssh2.crypto;

import java.io.IOException;
import java.security.KeyPair;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class CertificateDecoder {
    public abstract KeyPair createKeyPair(PEMStructure pEMStructure) throws IOException;

    public KeyPair createKeyPair(PEMStructure pEMStructure, String str) throws IOException {
        return createKeyPair(pEMStructure);
    }

    public abstract String getEndLine();

    public abstract String getStartLine();
}
