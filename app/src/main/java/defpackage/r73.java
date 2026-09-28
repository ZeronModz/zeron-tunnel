package defpackage;

import com.google.android.gms.internal.ads.zzhaz;
import com.google.android.gms.internal.ads.zzhjj;
import com.google.android.gms.internal.ads.zzhla;
import com.trilead.ssh2.sftp.Packet;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class r73 {
    public final HashMap a;
    public final HashMap b;

    public /* synthetic */ r73(mo2 mo2Var) {
        this.a = new HashMap((HashMap) mo2Var.b);
        this.b = new HashMap((HashMap) mo2Var.c);
    }

    public final Object a(zzhaz zzhazVar, Class cls) throws GeneralSecurityException {
        q73 q73Var = new q73(zzhazVar.getClass(), cls);
        HashMap map = this.a;
        if (map.containsKey(q73Var)) {
            return ((p73) map.get(q73Var)).c.zza(zzhazVar);
        }
        String string = q73Var.toString();
        throw new GeneralSecurityException(vh.t(new StringBuilder(string.length() + Packet.SSH_FXP_HANDLE), "No PrimitiveConstructor for ", string, " available, see https://developers.google.com/tink/faq/registration_errors"));
    }

    public final Object b(zzhjj zzhjjVar, f73 f73Var, Class cls) throws GeneralSecurityException {
        HashMap map = this.b;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        zzhla zzhlaVar = (zzhla) map.get(cls);
        return zzhlaVar.zze(zzhjjVar, f73Var, new mo2(14, this, zzhlaVar));
    }
}
