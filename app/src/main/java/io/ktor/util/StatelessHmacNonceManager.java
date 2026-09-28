package io.ktor.util;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.os;
import defpackage.xm;
import defpackage.xu;
import defpackage.yq0;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bB5\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/util/StatelessHmacNonceManager;", "Lio/ktor/util/NonceManager;", "Ljavax/crypto/spec/SecretKeySpec;", "keySpec", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "algorithm", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "timeoutMillis", "Lkotlin/Function0;", "nonceGenerator", "<init>", "(Ljavax/crypto/spec/SecretKeySpec;Ljava/lang/String;JLkotlin/jvm/functions/Function0;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "key", "([BLjava/lang/String;JLkotlin/jvm/functions/Function0;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StatelessHmacNonceManager implements NonceManager {
    public final SecretKeySpec a;
    public final String b;
    public final long c;
    public final Function0 d;
    public final int e;

    public StatelessHmacNonceManager(SecretKeySpec secretKeySpec, String str, long j, Function0<String> function0) throws NoSuchAlgorithmException, InvalidKeyException {
        secretKeySpec.getClass();
        str.getClass();
        function0.getClass();
        this.a = secretKeySpec;
        this.b = str;
        this.c = j;
        this.d = function0;
        Mac mac = Mac.getInstance(str);
        mac.init(secretKeySpec);
        this.e = mac.getMacLength();
    }

    @Override // io.ktor.util.NonceManager
    public final Object newNonce(Continuation continuation) throws NoSuchAlgorithmException, InvalidKeyException {
        String str = (String) this.d.invoke();
        long jNanoTime = System.nanoTime();
        kotlin.text.a.b(16);
        String string = Long.toString(jNanoTime, 16);
        string.getClass();
        String strG = g.G(16, string);
        Mac mac = Mac.getInstance(this.b);
        mac.init(this.a);
        byte[] bytes = (str + ':' + strG).getBytes(xm.b);
        bytes.getClass();
        mac.update(bytes);
        byte[] bArrDoFinal = mac.doFinal();
        bArrDoFinal.getClass();
        return str + '+' + strG + '+' + os.a(bArrDoFinal);
    }

    @Override // io.ktor.util.NonceManager
    public final Object verifyNonce(String str, Continuation continuation) throws NoSuchAlgorithmException, InvalidKeyException {
        List listP = g.P(new char[]{'+'}, str);
        if (listP.size() != 3) {
            return Boolean.FALSE;
        }
        String str2 = (String) listP.get(0);
        String str3 = (String) listP.get(1);
        String str4 = (String) listP.get(2);
        if (str2.length() < 8) {
            return Boolean.FALSE;
        }
        int length = str4.length();
        int i = this.e * 2;
        if (length != i) {
            return Boolean.FALSE;
        }
        if (str3.length() != 16) {
            return Boolean.FALSE;
        }
        kotlin.text.a.b(16);
        if (TimeUnit.MILLISECONDS.toNanos(this.c) + Long.parseLong(str3, 16) < System.nanoTime()) {
            return Boolean.FALSE;
        }
        Mac mac = Mac.getInstance(this.b);
        mac.init(this.a);
        byte[] bytes = (str2 + ':' + str3).getBytes(xm.b);
        bytes.getClass();
        mac.update(bytes);
        byte[] bArrDoFinal = mac.doFinal();
        bArrDoFinal.getClass();
        String strA = os.a(bArrDoFinal);
        int iMin = Math.min(strA.length(), str4.length());
        int i2 = 0;
        for (int i3 = 0; i3 < iMin; i3++) {
            if (strA.charAt(i3) == str4.charAt(i3)) {
                i2++;
            }
        }
        return Boolean.valueOf(i2 == i);
    }

    public /* synthetic */ StatelessHmacNonceManager(SecretKeySpec secretKeySpec, String str, long j, Function0 function0, int i, xu xuVar) {
        this(secretKeySpec, (i & 2) != 0 ? "HmacSHA256" : str, (i & 4) != 0 ? 60000L : j, (Function0<String>) ((i & 8) != 0 ? new yq0(18) : function0));
    }

    public /* synthetic */ StatelessHmacNonceManager(byte[] bArr, String str, long j, Function0 function0, int i, xu xuVar) {
        this(bArr, (i & 2) != 0 ? "HmacSHA256" : str, (i & 4) != 0 ? 60000L : j, (Function0<String>) ((i & 8) != 0 ? new yq0(17) : function0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatelessHmacNonceManager(byte[] bArr, String str, long j, Function0<String> function0) {
        this(new SecretKeySpec(bArr, str), str, j, function0);
        bArr.getClass();
        str.getClass();
        function0.getClass();
    }
}
