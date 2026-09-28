package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.zxing.datamatrix.encoder.SymbolInfo;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class cu extends SymbolInfo {
    @Override // com.google.zxing.datamatrix.encoder.SymbolInfo
    public final int a(int i) {
        return i <= 8 ? ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_GCM_SHA256 : ModuleDescriptor.MODULE_VERSION;
    }

    @Override // com.google.zxing.datamatrix.encoder.SymbolInfo
    public final int c() {
        return 10;
    }
}
