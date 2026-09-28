package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.dto.EConfigType;
import com.v2ray.ang.dto.ProfileItem;
import com.v2ray.ang.fmt.FmtBase;
import java.net.URI;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class jp1 extends FmtBase {
    public static final jp1 a = new jp1();

    public final ProfileItem e(String str) {
        str.getClass();
        Lazy lazy = zq0.a;
        boolean zB = zq0.z().b("pref_allow_insecure", false);
        ProfileItem profileItemCreate = ProfileItem.INSTANCE.create(EConfigType.VLESS);
        Regex regex = ul1.a;
        URI uri = new URI(ul1.e(str));
        String rawQuery = uri.getRawQuery();
        if (rawQuery == null || rawQuery.length() == 0) {
            return null;
        }
        LinkedHashMap linkedHashMapC = FmtBase.c(uri);
        String fragment = uri.getFragment();
        if (fragment == null) {
            fragment = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        String strC = ul1.C(fragment);
        if (strC.length() == 0) {
            strC = "none";
        }
        profileItemCreate.setRemarks(strC);
        profileItemCreate.setServer(qf3.n(uri));
        profileItemCreate.setServerPort(String.valueOf(uri.getPort()));
        profileItemCreate.setPassword(uri.getUserInfo());
        String str2 = (String) linkedHashMapC.get("encryption");
        profileItemCreate.setMethod(str2 != null ? str2 : "none");
        FmtBase.a(profileItemCreate, linkedHashMapC, zB);
        return profileItemCreate;
    }
}
