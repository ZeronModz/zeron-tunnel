package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.dto.EConfigType;
import com.v2ray.ang.dto.ProfileItem;
import com.v2ray.ang.fmt.FmtBase;
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class re0 extends FmtBase {
    public static final re0 a = new re0();

    public final ProfileItem e(String str) {
        Boolean boolValueOf;
        str.getClass();
        Lazy lazy = zq0.a;
        boolean zB = zq0.z().b("pref_allow_insecure", false);
        ProfileItem profileItemCreate = ProfileItem.INSTANCE.create(EConfigType.HYSTERIA2);
        Regex regex = ul1.a;
        URI uri = new URI(ul1.e(str));
        String fragment = uri.getFragment();
        String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
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
        profileItemCreate.setSecurity("tls");
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() != 0) {
            LinkedHashMap linkedHashMapC = FmtBase.c(uri);
            String str3 = (String) linkedHashMapC.get("security");
            profileItemCreate.setSecurity(str3 != null ? str3 : "tls");
            CharSequence charSequence = (CharSequence) linkedHashMapC.get("insecure");
            if (charSequence == null || charSequence.length() == 0) {
                boolValueOf = Boolean.valueOf(zB);
            } else {
                String str4 = (String) linkedHashMapC.get("insecure");
                if (str4 != null) {
                    str2 = str4;
                }
                boolValueOf = Boolean.valueOf(str2.equals("1"));
            }
            profileItemCreate.setInsecure(boolValueOf);
            profileItemCreate.setSni((String) linkedHashMapC.get("sni"));
            profileItemCreate.setAlpn((String) linkedHashMapC.get("alpn"));
            profileItemCreate.setObfsPassword((String) linkedHashMapC.get("obfs-password"));
            profileItemCreate.setPortHopping((String) linkedHashMapC.get("mport"));
            profileItemCreate.setPinSHA256((String) linkedHashMapC.get("pinSHA256"));
        }
        return profileItemCreate;
    }

    public final String f(ProfileItem profileItem) {
        HashMap map = new HashMap();
        String security = profileItem.getSecurity();
        if (security != null) {
            map.put("security", security);
        }
        String sni = profileItem.getSni();
        boolean zC = qf3.C(sni);
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (zC) {
            if (sni == null) {
                sni = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            map.put("sni", sni);
        }
        String alpn = profileItem.getAlpn();
        if (qf3.C(alpn)) {
            if (alpn == null) {
                alpn = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            map.put("alpn", alpn);
        }
        map.put("insecure", yg0.a(profileItem.getInsecure(), Boolean.TRUE) ? "1" : "0");
        if (qf3.C(profileItem.getObfsPassword())) {
            map.put("obfs", "salamander");
            String obfsPassword = profileItem.getObfsPassword();
            if (obfsPassword == null) {
                obfsPassword = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            map.put("obfs-password", obfsPassword);
        }
        if (qf3.C(profileItem.getPortHopping())) {
            String portHopping = profileItem.getPortHopping();
            if (portHopping == null) {
                portHopping = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            map.put("mport", portHopping);
        }
        if (qf3.C(profileItem.getPinSHA256())) {
            String pinSHA256 = profileItem.getPinSHA256();
            if (pinSHA256 != null) {
                str = pinSHA256;
            }
            map.put("pinSHA256", str);
        }
        return FmtBase.d(profileItem, profileItem.getPassword(), map);
    }
}
