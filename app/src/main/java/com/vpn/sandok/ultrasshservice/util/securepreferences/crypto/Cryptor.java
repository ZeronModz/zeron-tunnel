package com.vpn.sandok.ultrasshservice.util.securepreferences.crypto;

import android.util.Base64;
import com.vpn.sandok.ultrasshservice.util.securepreferences.model.DigestType;
import com.vpn.sandok.ultrasshservice.util.securepreferences.model.SecurityConfig;
import defpackage.u7;
import java.security.SecureRandom;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.spongycastle.crypto.params.KeyParameter;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class Cryptor {
    private static final int INDEX_CIPHER_TEXT = 2;
    private static final int INDEX_IV = 1;
    private static final int INDEX_SALT = 0;
    private static final String SPLITTER = "\\.";
    private final CipherService mCipherService;
    private final byte[] mPassword;
    private final byte[] mSalt;
    private final SecurityConfig mSecurityConfig;

    /* JADX INFO: renamed from: com.vpn.sandok.ultrasshservice.util.securepreferences.crypto.Cryptor$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$vpn$sandok$ultrasshservice$util$securepreferences$model$DigestType;

        static {
            int[] iArr = new int[DigestType.values().length];
            $SwitchMap$com$vpn$sandok$ultrasshservice$util$securepreferences$model$DigestType = iArr;
            try {
                iArr[DigestType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$vpn$sandok$ultrasshservice$util$securepreferences$model$DigestType[DigestType.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$vpn$sandok$ultrasshservice$util$securepreferences$model$DigestType[DigestType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private Cryptor(SecurityConfig securityConfig) {
        this.mSecurityConfig = securityConfig;
        this.mCipherService = CipherServiceImpl.getInstance(securityConfig.getAlgorithm());
        byte[] bArr = new byte[securityConfig.getSaltSize()];
        this.mSalt = bArr;
        new SecureRandom().nextBytes(bArr);
        this.mPassword = pbkdf2(bArr);
    }

    private byte[] fromBase64(String str) {
        return Base64.decode(str, 2);
    }

    public static Cryptor initWithSecurityConfig(SecurityConfig securityConfig) {
        return new Cryptor(securityConfig);
    }

    private byte[] pbkdf2(byte[] bArr) {
        PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator;
        byte[] bArrPKCS5PasswordToUTF8Bytes = PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(this.mSecurityConfig.getPassword());
        int i = AnonymousClass1.$SwitchMap$com$vpn$sandok$ultrasshservice$util$securepreferences$model$DigestType[this.mSecurityConfig.getDigestType().ordinal()];
        if (i == 1) {
            pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(new SHA1Digest());
        } else if (i == 2) {
            pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(new SHA256Digest());
        } else {
            if (i != 3) {
                u7.p("Unknown Digest!");
                return null;
            }
            pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(new SHA512Digest());
        }
        pKCS5S2ParametersGenerator.init(bArrPKCS5PasswordToUTF8Bytes, bArr, this.mSecurityConfig.getPBKDF2Iterations());
        return ((KeyParameter) pKCS5S2ParametersGenerator.generateDerivedParameters(this.mSecurityConfig.getKeySize())).getKey();
    }

    private String toBase64(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    public byte[] decryptFromBase64(String str) {
        String[] strArrSplit = str.split(SPLITTER);
        if (strArrSplit.length != 3) {
            u7.r("Malformed data string");
            return null;
        }
        byte[] bArrFromBase64 = fromBase64(strArrSplit[0]);
        return this.mCipherService.decrypt(pbkdf2(bArrFromBase64), fromBase64(strArrSplit[1]), fromBase64(strArrSplit[2]));
    }

    public String encryptToBase64(byte[] bArr) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr2 = new byte[this.mCipherService.getIVSize()];
        secureRandom.nextBytes(bArr2);
        byte[] bArrEncrypt = this.mCipherService.encrypt(this.mPassword, bArr2, bArr);
        return toBase64(this.mSalt) + "." + toBase64(bArr2) + "." + toBase64(bArrEncrypt);
    }
}
