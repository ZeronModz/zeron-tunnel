package io.github.g00fy2.quickie;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/github/g00fy2/quickie/ScanQRCode;", "Landroidx/activity/result/contract/ActivityResultContract;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/github/g00fy2/quickie/QRResult;", "<init>", "()V", "quickie-foss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanQRCode extends ActivityResultContract {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent a(Context context, Object obj) {
        return new Intent(context, (Class<?>) QRScannerActivity.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    @Override // androidx.activity.result.contract.ActivityResultContract
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r5, android.content.Intent r6) {
        /*
            r4 = this;
            r4 = -1
            r0 = 0
            if (r5 == r4) goto L50
            if (r5 == 0) goto L4d
            r4 = 2
            if (r5 == r4) goto L4a
            r4 = 3
            if (r5 == r4) goto L1d
            io.github.g00fy2.quickie.QRResult$QRError r4 = new io.github.g00fy2.quickie.QRResult$QRError
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unknown activity result code "
            java.lang.String r5 = defpackage.hz.o(r5, r0)
            r6.<init>(r5)
            r4.<init>(r6)
            return r4
        L1d:
            io.github.g00fy2.quickie.QRResult$QRError r4 = new io.github.g00fy2.quickie.QRResult$QRError
            if (r6 == 0) goto L3f
            int r5 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            java.lang.String r2 = "quickie-exception"
            java.lang.Class<java.lang.Exception> r3 = java.lang.Exception.class
            if (r5 < r1) goto L30
            java.lang.Object r0 = defpackage.v1.i(r6, r2, r3)
            goto L3b
        L30:
            android.os.Parcelable r5 = r6.getParcelableExtra(r2)
            boolean r6 = r3.isInstance(r5)
            if (r6 == 0) goto L3b
            r0 = r5
        L3b:
            java.lang.Exception r0 = (java.lang.Exception) r0
            if (r0 != 0) goto L46
        L3f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = "Could retrieve root exception"
            r0.<init>(r5)
        L46:
            r4.<init>(r0)
            return r4
        L4a:
            xz0 r4 = defpackage.xz0.a
            return r4
        L4d:
            yz0 r4 = defpackage.yz0.a
            return r4
        L50:
            io.github.g00fy2.quickie.QRResult$QRSuccess r4 = new io.github.g00fy2.quickie.QRResult$QRSuccess
            if (r6 == 0) goto L5b
            java.lang.String r5 = "quickie-bytes"
            byte[] r5 = r6.getByteArrayExtra(r5)
            goto L5c
        L5b:
            r5 = r0
        L5c:
            if (r6 == 0) goto L64
            java.lang.String r0 = "quickie-value"
            java.lang.String r0 = r6.getStringExtra(r0)
        L64:
            io.github.g00fy2.quickie.content.QRContent$Plain r6 = new io.github.g00fy2.quickie.content.QRContent$Plain
            r6.<init>(r5, r0)
            r4.<init>(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.g00fy2.quickie.ScanQRCode.c(int, android.content.Intent):java.lang.Object");
    }
}
