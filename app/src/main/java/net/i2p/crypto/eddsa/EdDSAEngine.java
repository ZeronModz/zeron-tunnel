package net.i2p.crypto.eddsa;

import defpackage.p00;
import defpackage.p60;
import defpackage.zu0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import net.i2p.crypto.eddsa.math.Curve;
import net.i2p.crypto.eddsa.math.ScalarOps;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class EdDSAEngine extends Signature {
    public static final p00 h = new p00();
    public MessageDigest a;
    public ByteArrayOutputStream b;
    public EdDSAKey c;
    public boolean d;
    public byte[] e;
    public int f;
    public int g;

    public EdDSAEngine() {
        super("NONEwithEdDSA");
    }

    public final void a(EdDSAPrivateKey edDSAPrivateKey) {
        int bVar = edDSAPrivateKey.getParams().getCurve().getField().getb();
        int i = bVar / 8;
        this.a.update(edDSAPrivateKey.getH(), i, (bVar / 4) - i);
    }

    public final void b() {
        MessageDigest messageDigest = this.a;
        if (messageDigest != null) {
            messageDigest.reset();
        }
        ByteArrayOutputStream byteArrayOutputStream = this.b;
        if (byteArrayOutputStream != null) {
            byteArrayOutputStream.reset();
        }
        this.d = false;
        this.e = null;
    }

    public final byte[] c() throws SignatureException {
        int i;
        byte[] byteArray;
        int length;
        Curve curve = this.c.getParams().getCurve();
        ScalarOps scalarOps = this.c.getParams().getScalarOps();
        byte[] aVar = ((EdDSAPrivateKey) this.c).geta();
        if (this.d) {
            byteArray = this.e;
            if (byteArray == null) {
                throw new SignatureException("update() not called first");
            }
            i = this.f;
            length = this.g;
        } else {
            ByteArrayOutputStream byteArrayOutputStream = this.b;
            i = 0;
            byteArray = byteArrayOutputStream == null ? new byte[0] : byteArrayOutputStream.toByteArray();
            length = byteArray.length;
        }
        this.a.update(byteArray, i, length);
        byte[] bArrReduce = scalarOps.reduce(this.a.digest());
        byte[] byteArray2 = this.c.getParams().getB().scalarMultiply(bArrReduce).toByteArray();
        this.a.update(byteArray2);
        this.a.update(((EdDSAPrivateKey) this.c).getAbyte());
        this.a.update(byteArray, i, length);
        byte[] bArrMultiplyAndAdd = scalarOps.multiplyAndAdd(scalarOps.reduce(this.a.digest()), aVar, bArrReduce);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(curve.getField().getb() / 4);
        byteBufferAllocate.put(byteArray2).put(bArrMultiplyAndAdd);
        return byteBufferAllocate.array();
    }

    public final boolean d(byte[] bArr) throws SignatureException {
        byte[] byteArray;
        int length;
        int i;
        int bVar = this.c.getParams().getCurve().getField().getb();
        int i2 = bVar / 4;
        if (bArr.length != i2) {
            throw new SignatureException("signature length is wrong");
        }
        int i3 = bVar / 8;
        this.a.update(bArr, 0, i3);
        this.a.update(((EdDSAPublicKey) this.c).getAbyte());
        if (this.d) {
            byteArray = this.e;
            if (byteArray == null) {
                throw new SignatureException("update() not called first");
            }
            i = this.f;
            length = this.g;
        } else {
            ByteArrayOutputStream byteArrayOutputStream = this.b;
            byteArray = byteArrayOutputStream == null ? new byte[0] : byteArrayOutputStream.toByteArray();
            length = byteArray.length;
            i = 0;
        }
        this.a.update(byteArray, i, length);
        byte[] byteArray2 = this.c.getParams().getB().doubleScalarMultiplyVariableTime(((EdDSAPublicKey) this.c).getNegativeA(), this.c.getParams().getScalarOps().reduce(this.a.digest()), Arrays.copyOfRange(bArr, i3, i2)).toByteArray();
        for (int i4 = 0; i4 < byteArray2.length; i4++) {
            if (byteArray2[i4] != bArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.security.SignatureSpi
    public final Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public final void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        b();
        if (!(privateKey instanceof EdDSAPrivateKey)) {
            throw new InvalidKeyException("cannot identify EdDSA private key: " + privateKey.getClass());
        }
        EdDSAPrivateKey edDSAPrivateKey = (EdDSAPrivateKey) privateKey;
        this.c = edDSAPrivateKey;
        if (this.a == null) {
            try {
                this.a = MessageDigest.getInstance(edDSAPrivateKey.getParams().getHashAlgorithm());
            } catch (NoSuchAlgorithmException unused) {
                throw new InvalidKeyException("cannot get required digest " + this.c.getParams().getHashAlgorithm() + " for private key.");
            }
        } else if (!edDSAPrivateKey.getParams().getHashAlgorithm().equals(this.a.getAlgorithm())) {
            p60.n("Key hash algorithm does not match chosen digest");
            return;
        }
        a(edDSAPrivateKey);
    }

    @Override // java.security.SignatureSpi
    public final void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        b();
        if (!(publicKey instanceof EdDSAPublicKey)) {
            try {
                engineInitVerify(new EdDSAPublicKey(new X509EncodedKeySpec(publicKey.getEncoded())));
                return;
            } catch (InvalidKeySpecException unused) {
                throw new InvalidKeyException("cannot handle X.509 EdDSA public key: " + publicKey.getAlgorithm());
            }
        }
        EdDSAPublicKey edDSAPublicKey = (EdDSAPublicKey) publicKey;
        this.c = edDSAPublicKey;
        if (this.a != null) {
            if (edDSAPublicKey.getParams().getHashAlgorithm().equals(this.a.getAlgorithm())) {
                return;
            }
            p60.n("Key hash algorithm does not match chosen digest");
        } else {
            try {
                this.a = MessageDigest.getInstance(edDSAPublicKey.getParams().getHashAlgorithm());
            } catch (NoSuchAlgorithmException unused2) {
                throw new InvalidKeyException("cannot get required digest " + this.c.getParams().getHashAlgorithm() + " for private key.");
            }
        }
    }

    @Override // java.security.SignatureSpi
    public final void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        ByteArrayOutputStream byteArrayOutputStream;
        if (!algorithmParameterSpec.equals(h)) {
            super.engineSetParameter(algorithmParameterSpec);
        } else if (this.e != null || ((byteArrayOutputStream = this.b) != null && byteArrayOutputStream.size() > 0)) {
            zu0.p("update() already called");
        } else {
            this.d = true;
        }
    }

    @Override // java.security.SignatureSpi
    public final byte[] engineSign() {
        try {
            return c();
        } finally {
            b();
            a((EdDSAPrivateKey) this.c);
        }
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        if (this.d) {
            if (this.e != null) {
                throw new SignatureException("update() already called");
            }
            this.e = bArr;
            this.f = i;
            this.g = i2;
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = this.b;
        if (byteArrayOutputStream == null) {
            byteArrayOutputStream = new ByteArrayOutputStream(256);
            this.b = byteArrayOutputStream;
        }
        byteArrayOutputStream.write(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public final boolean engineVerify(byte[] bArr) {
        try {
            return d(bArr);
        } finally {
            b();
        }
    }

    public EdDSAEngine(MessageDigest messageDigest) {
        this();
        this.a = messageDigest;
    }

    @Override // java.security.SignatureSpi
    public final void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte b) throws SignatureException {
        if (!this.d) {
            ByteArrayOutputStream byteArrayOutputStream = this.b;
            if (byteArrayOutputStream == null) {
                byteArrayOutputStream = new ByteArrayOutputStream(256);
                this.b = byteArrayOutputStream;
            }
            byteArrayOutputStream.write(b);
            return;
        }
        throw new SignatureException("unsupported in one-shot mode");
    }
}
