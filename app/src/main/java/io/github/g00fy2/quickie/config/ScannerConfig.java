package io.github.g00fy2.quickie.config;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u0011\u0012BS\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lio/github/g00fy2/quickie/config/ScannerConfig;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "formats", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "stringRes", "drawableRes", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "hapticFeedback", "showTorchToggle", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "horizontalFrameRatio", "useFrontCamera", "showCloseButton", "keepScreenOn", "<init>", "([IILjava/lang/Integer;ZZFZZZ)V", "Builder", "Companion", "quickie-foss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScannerConfig {
    public static final Companion j = new Companion(null);
    public final int[] a;
    public final int b;
    public final Integer c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/github/g00fy2/quickie/config/ScannerConfig$Builder;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "quickie-foss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public boolean d;
        public boolean f;
        public final List a = c.z(BarcodeFormat.QR_CODE);
        public final Integer b = 0;
        public boolean c = true;
        public final float e = 1.0f;
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/github/g00fy2/quickie/config/ScannerConfig$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "quickie-foss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    public ScannerConfig(int[] iArr, int i, Integer num, boolean z, boolean z2, float f, boolean z3, boolean z4, boolean z5) {
        iArr.getClass();
        this.a = iArr;
        this.b = i;
        this.c = num;
        this.d = z;
        this.e = z2;
        this.f = f;
        this.g = z3;
        this.h = z4;
        this.i = z5;
    }
}
