package com.vpn.sandok.ultrasshservice.util.securepreferences.crypto;

import com.google.android.gms.stats.CodePackage;
import com.vpn.sandok.ultrasshservice.util.securepreferences.model.EncryptionAlgorithm;
import defpackage.u7;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CipherServiceImpl implements CipherService {
    private final int ivSize;
    private final Cipher mCipher;
    private final String mEncryptionAlgorithm;
    private final Logger mLogger;

    /* JADX INFO: renamed from: com.vpn.sandok.ultrasshservice.util.securepreferences.crypto.CipherServiceImpl$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$vpn$sandok$ultrasshservice$util$securepreferences$model$EncryptionAlgorithm;

        static {
            int[] iArr = new int[EncryptionAlgorithm.values().length];
            $SwitchMap$com$vpn$sandok$ultrasshservice$util$securepreferences$model$EncryptionAlgorithm = iArr;
            try {
                iArr[EncryptionAlgorithm.AES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$vpn$sandok$ultrasshservice$util$securepreferences$model$EncryptionAlgorithm[EncryptionAlgorithm.TripleDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private CipherServiceImpl(String str, String str2, String str3, int i) {
        this.mEncryptionAlgorithm = str;
        this.ivSize = i;
        Logger logger = Logger.getLogger(CipherService.class.getName());
        this.mLogger = logger;
        try {
            String str4 = str + "/" + str2 + "/" + str3;
            logger.info("Encryption-Mode: ".concat(str4));
            this.mCipher = Cipher.getInstance(str4);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            this.mLogger.log(Level.SEVERE, "method: constructor()", e);
            u7.p("Unable to initialize cipher, mode might not be supported");
            throw null;
        }
    }

    private IvParameterSpec generateIvParameterSpec(byte[] bArr) {
        return new IvParameterSpec(bArr);
    }

    private SecretKey generateSecretKeySpec(byte[] bArr) {
        return new SecretKeySpec(bArr, this.mEncryptionAlgorithm);
    }

    public static CipherService getInstance(EncryptionAlgorithm encryptionAlgorithm) {
        int i = AnonymousClass1.$SwitchMap$com$vpn$sandok$ultrasshservice$util$securepreferences$model$EncryptionAlgorithm[encryptionAlgorithm.ordinal()];
        if (i == 1) {
            return new CipherServiceImpl("AES", CodePackage.GCM, "NoPadding", 12);
        }
        if (i == 2) {
            return new CipherServiceImpl("DESede", "CBC", "PKCS5Padding", 8);
        }
        u7.r("Unknown Algorithm");
        return null;
    }

    @Override // com.vpn.sandok.ultrasshservice.util.securepreferences.crypto.CipherService
    public byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArrDoFinal;
        synchronized (this.mCipher) {
            try {
                try {
                    this.mCipher.init(2, generateSecretKeySpec(bArr), generateIvParameterSpec(bArr2));
                    bArrDoFinal = this.mCipher.doFinal(bArr3);
                } finally {
                }
            } catch (InvalidAlgorithmParameterException e) {
                e = e;
                this.mLogger.log(Level.SEVERE, "method: decrypt()", e);
                throw new IllegalStateException(e.getClass().getName() + ": " + e.getMessage());
            } catch (InvalidKeyException e2) {
                e = e2;
                this.mLogger.log(Level.SEVERE, "method: decrypt()", e);
                throw new IllegalStateException(e.getClass().getName() + ": " + e.getMessage());
            } catch (BadPaddingException e3) {
                e = e3;
                this.mLogger.log(Level.SEVERE, "method: decrypt()", e);
                throw new IllegalStateException(e.getClass().getName() + ": " + e.getMessage());
            } catch (IllegalBlockSizeException e4) {
                e = e4;
                this.mLogger.log(Level.SEVERE, "method: decrypt()", e);
                throw new IllegalStateException(e.getClass().getName() + ": " + e.getMessage());
            }
        }
        return bArrDoFinal;
    }

    @Override // com.vpn.sandok.ultrasshservice.util.securepreferences.crypto.CipherService
    public byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArrDoFinal;
        synchronized (this.mCipher) {
            try {
                try {
                    this.mCipher.init(1, generateSecretKeySpec(bArr), generateIvParameterSpec(bArr2));
                    bArrDoFinal = this.mCipher.doFinal(bArr3);
                } finally {
                }
            } catch (InvalidAlgorithmParameterException e) {
                e = e;
                this.mLogger.log(Level.SEVERE, "method: encrypt()", e);
                throw new IllegalStateException(e.getClass().getName() + ": " + e.getMessage());
            } catch (InvalidKeyException e2) {
                e = e2;
                this.mLogger.log(Level.SEVERE, "method: encrypt()", e);
                throw new IllegalStateException(e.getClass().getName() + ": " + e.getMessage());
            } catch (BadPaddingException e3) {
                e = e3;
                this.mLogger.log(Level.SEVERE, "method: encrypt()", e);
                throw new IllegalStateException(e.getClass().getName() + ": " + e.getMessage());
            } catch (IllegalBlockSizeException e4) {
                e = e4;
                this.mLogger.log(Level.SEVERE, "method: encrypt()", e);
                throw new IllegalStateException(e.getClass().getName() + ": " + e.getMessage());
            }
        }
        return bArrDoFinal;
    }

    @Override // com.vpn.sandok.ultrasshservice.util.securepreferences.crypto.CipherService
    public int getIVSize() {
        return this.ivSize;
    }
}
