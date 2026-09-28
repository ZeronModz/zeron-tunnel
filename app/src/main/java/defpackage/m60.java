package defpackage;

import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class m60 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TokenResult.ResponseCode.values().length];
        b = iArr;
        try {
            iArr[TokenResult.ResponseCode.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
        a = iArr2;
        try {
            iArr2[InstallationResponse.ResponseCode.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
