package com.trilead.ssh2;

import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.u7;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class DHGexParameters {
    private static final int MAX_ALLOWED = 8192;
    private static final int MIN_ALLOWED = 1024;
    private final int max_group_len;
    private final int min_group_len;
    private final int pref_group_len;

    public DHGexParameters(int i, int i2, int i3) {
        if (i < 1024 || i > 8192) {
            u7.r("min_group_len out of range!");
            throw null;
        }
        if (i2 < 1024 || i2 > 8192) {
            u7.r("pref_group_len out of range!");
            throw null;
        }
        if (i3 < 1024 || i3 > 8192) {
            u7.r("max_group_len out of range!");
            throw null;
        }
        if (i2 < i || i2 > i3) {
            u7.r("pref_group_len is incompatible with min and max!");
            throw null;
        }
        if (i3 < i) {
            u7.r("max_group_len must not be smaller than min_group_len!");
            throw null;
        }
        this.min_group_len = i;
        this.pref_group_len = i2;
        this.max_group_len = i3;
    }

    public int getMax_group_len() {
        return this.max_group_len;
    }

    public int getMin_group_len() {
        return this.min_group_len;
    }

    public int getPref_group_len() {
        return this.pref_group_len;
    }

    public DHGexParameters(int i) {
        if (i >= 1024 && i <= 8192) {
            this.pref_group_len = i;
            this.min_group_len = 0;
            this.max_group_len = 0;
            return;
        }
        u7.r("pref_group_len out of range!");
        throw null;
    }

    public DHGexParameters() {
        this(1024, 2048, AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE);
    }
}
