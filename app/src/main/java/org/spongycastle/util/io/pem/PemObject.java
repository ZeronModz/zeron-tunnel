package org.spongycastle.util.io.pem;

import java.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PemObject implements PemObjectGenerator {
    private static final List EMPTY_LIST = DesugarCollections.unmodifiableList(new ArrayList());
    private byte[] content;
    private List headers;
    private String type;

    public PemObject(String str, List list, byte[] bArr) {
        this.type = str;
        this.headers = DesugarCollections.unmodifiableList(list);
        this.content = bArr;
    }

    public byte[] getContent() {
        return this.content;
    }

    public List getHeaders() {
        return this.headers;
    }

    public String getType() {
        return this.type;
    }

    public PemObject(String str, byte[] bArr) {
        this(str, EMPTY_LIST, bArr);
    }

    @Override // org.spongycastle.util.io.pem.PemObjectGenerator
    public PemObject generate() throws PemGenerationException {
        return this;
    }
}
