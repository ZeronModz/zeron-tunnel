package defpackage;

import com.google.android.gms.common.util.Hex;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hg3 implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ sf3 c;

    public /* synthetic */ hg3(boolean z, String str, sf3 sf3Var) {
        this.a = z;
        this.b = str;
        this.c = sf3Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        int i = 0;
        boolean z = this.a;
        String str = this.b;
        sf3 sf3Var = this.c;
        String str2 = (z || !zh3.c(str, sf3Var, true, false).a) ? "not allowed" : "debug cert rejected";
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i++;
        }
        yg0.m(messageDigest);
        StringBuilder sbA = hz.A(str2, ": pkg=", str, ", sha256=", Hex.a(messageDigest.digest(sf3Var.d)));
        sbA.append(", atk=");
        sbA.append(z);
        sbA.append(", ver=12451000.false");
        return sbA.toString();
    }
}
