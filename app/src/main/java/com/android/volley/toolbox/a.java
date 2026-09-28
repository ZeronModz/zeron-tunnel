package com.android.volley.toolbox;

import com.android.volley.toolbox.DiskBasedCache;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements DiskBasedCache.FileSupplier {
    public final /* synthetic */ File a;

    public a(File file) {
        this.a = file;
    }

    @Override // com.android.volley.toolbox.DiskBasedCache.FileSupplier
    public final File get() {
        return this.a;
    }
}
