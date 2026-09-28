package defpackage;

import com.google.android.gms.internal.ads.q7;
import com.google.android.gms.internal.ads.zzhas;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o63 implements zzhas {
    public static final q7 a = new q7(1);

    public static c63 a(a53 a53Var) throws GeneralSecurityException {
        byte[] bArr = c63.c;
        try {
            Cipher cipher = (Cipher) a.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            if (c63.a(cipher)) {
                return new c63(((hc3) a53Var.b.b).b(), a53Var.c.b());
            }
            u7.p("Cipher does not implement AES GCM SIV.");
            return null;
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e);
        }
    }
}
