package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.dto.EConfigType;
import com.v2ray.ang.dto.ProfileItem;
import com.v2ray.ang.fmt.FmtBase;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.collections.c;
import kotlin.sequences.b;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class br1 extends FmtBase {
    public static final br1 a = new br1();

    public static ProfileItem f(String str) {
        str.getClass();
        ProfileItem profileItemCreate = ProfileItem.INSTANCE.create(EConfigType.WIREGUARD);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = b.f(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(str)).iterator();
        String str2 = null;
        Object obj = null;
        while (it.hasNext()) {
            String string = g.c0((String) it.next()).toString();
            if (string.length() != 0 && !g.R(string, "#", false)) {
                if (g.R(string, "[Interface]", true)) {
                    obj = "Interface";
                } else if (g.R(string, "[Peer]", true)) {
                    obj = "Peer";
                } else if (obj != null) {
                    List listO = g.O(string, new String[]{"="}, 2);
                    ArrayList arrayList = new ArrayList(c.l(listO, 10));
                    Iterator it2 = listO.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(g.c0((String) it2.next()).toString());
                    }
                    if (arrayList.size() == 2) {
                        String lowerCase = ((String) arrayList.get(0)).toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        String str3 = (String) arrayList.get(1);
                        if (obj.equals("Interface")) {
                            linkedHashMap.put(lowerCase, str3);
                        } else if (obj.equals("Peer")) {
                            linkedHashMap2.put(lowerCase, str3);
                        }
                    }
                }
            }
        }
        String str4 = (String) linkedHashMap.get("privatekey");
        if (str4 == null) {
            str4 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        profileItemCreate.setSecretKey(str4);
        profileItemCreate.setRemarks(String.valueOf(System.currentTimeMillis()));
        String str5 = (String) linkedHashMap.get("address");
        if (str5 == null) {
            str5 = "172.16.0.2/32";
        }
        profileItemCreate.setLocalAddress(str5);
        Regex regex = ul1.a;
        String str6 = (String) linkedHashMap.get("mtu");
        if (str6 == null) {
            str6 = "1420";
        }
        profileItemCreate.setMtu(Integer.valueOf(ul1.y(0, str6)));
        String str7 = (String) linkedHashMap2.get("publickey");
        if (str7 == null) {
            str7 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        profileItemCreate.setPublicKey(str7);
        String str8 = (String) linkedHashMap2.get("presharedkey");
        if (str8 != null && str8.length() > 0) {
            str2 = str8;
        }
        profileItemCreate.setPreSharedKey(str2);
        String str9 = (String) linkedHashMap2.get("endpoint");
        if (str9 == null) {
            str9 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        List listO2 = g.O(str9, new String[]{":"}, 2);
        if (listO2.size() == 2) {
            profileItemCreate.setServer((String) listO2.get(0));
            profileItemCreate.setServerPort((String) listO2.get(1));
        } else {
            profileItemCreate.setServer(str9);
            profileItemCreate.setServerPort(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
        String str10 = (String) linkedHashMap2.get("reserved");
        if (str10 == null) {
            str10 = "0,0,0";
        }
        profileItemCreate.setReserved(str10);
        return profileItemCreate;
    }

    public final ProfileItem e(String str) {
        str.getClass();
        ProfileItem profileItemCreate = ProfileItem.INSTANCE.create(EConfigType.WIREGUARD);
        Regex regex = ul1.a;
        URI uri = new URI(ul1.e(str));
        String rawQuery = uri.getRawQuery();
        String str2 = null;
        if (rawQuery == null || rawQuery.length() == 0) {
            return null;
        }
        LinkedHashMap linkedHashMapC = FmtBase.c(uri);
        String fragment = uri.getFragment();
        String str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
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
        String userInfo = uri.getUserInfo();
        if (userInfo == null) {
            userInfo = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        profileItemCreate.setSecretKey(userInfo);
        String str4 = (String) linkedHashMapC.get("address");
        if (str4 == null) {
            str4 = "172.16.0.2/32";
        }
        profileItemCreate.setLocalAddress(str4);
        String str5 = (String) linkedHashMapC.get("publickey");
        if (str5 != null) {
            str3 = str5;
        }
        profileItemCreate.setPublicKey(str3);
        String str6 = (String) linkedHashMapC.get("presharedkey");
        if (str6 != null && str6.length() > 0) {
            str2 = str6;
        }
        profileItemCreate.setPreSharedKey(str2);
        String str7 = (String) linkedHashMapC.get("mtu");
        if (str7 == null) {
            str7 = "1420";
        }
        profileItemCreate.setMtu(Integer.valueOf(ul1.y(0, str7)));
        String str8 = (String) linkedHashMapC.get("reserved");
        if (str8 == null) {
            str8 = "0,0,0";
        }
        profileItemCreate.setReserved(str8);
        return profileItemCreate;
    }

    public final String g(ProfileItem profileItem) {
        HashMap map = new HashMap();
        String publicKey = profileItem.getPublicKey();
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (publicKey == null) {
            publicKey = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        map.put("publickey", publicKey);
        if (profileItem.getReserved() != null) {
            String reserved = profileItem.getReserved();
            String strM = reserved != null ? g.M(reserved, " ", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) : null;
            if (strM == null) {
                strM = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            map.put("reserved", strM);
        }
        String localAddress = profileItem.getLocalAddress();
        String strM2 = localAddress != null ? g.M(localAddress, " ", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) : null;
        if (strM2 == null) {
            strM2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        map.put("address", strM2);
        if (profileItem.getMtu() != null) {
            map.put("mtu", String.valueOf(profileItem.getMtu()));
        }
        if (profileItem.getPreSharedKey() != null) {
            String preSharedKey = profileItem.getPreSharedKey();
            String strM3 = preSharedKey != null ? g.M(preSharedKey, " ", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) : null;
            if (strM3 != null) {
                str = strM3;
            }
            map.put("presharedkey", str);
        }
        return FmtBase.d(profileItem, profileItem.getSecretKey(), map);
    }
}
