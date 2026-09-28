package defpackage;

import com.google.android.gms.internal.ads.zzhbm;
import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h43 {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static zzhbm a(String str) throws GeneralSecurityException {
        for (zzhbm zzhbmVar : a) {
            if (zzhbmVar.zza()) {
                return zzhbmVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
