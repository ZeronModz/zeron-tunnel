package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.dto.EConfigType;
import com.v2ray.ang.dto.NetworkType;
import com.v2ray.ang.dto.ProfileItem;
import com.v2ray.ang.fmt.FmtBase;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m71 extends FmtBase {
    public static final m71 a = new m71();

    public final ProfileItem e(String str) {
        String userInfo;
        List listO;
        String strB;
        str.getClass();
        ProfileItem profileItemCreate = ProfileItem.INSTANCE.create(EConfigType.SHADOWSOCKS);
        Regex regex = ul1.a;
        URI uri = new URI(ul1.e(str));
        if (qf3.n(uri).length() == 0 || uri.getPort() <= 0 || (userInfo = uri.getUserInfo()) == null || userInfo.length() == 0) {
            profileItemCreate = null;
        } else {
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
            String userInfo2 = uri.getUserInfo();
            userInfo2.getClass();
            if (g.o(userInfo2, ":", false)) {
                String userInfo3 = uri.getUserInfo();
                userInfo3.getClass();
                listO = g.O(userInfo3, new String[]{":"}, 2);
            } else {
                listO = g.O(ul1.b(uri.getUserInfo()), new String[]{":"}, 2);
            }
            if (listO.size() == 2) {
                profileItemCreate.setMethod((String) c.r(listO));
                profileItemCreate.setPassword((String) c.x(listO));
            }
            String rawQuery = uri.getRawQuery();
            if (rawQuery != null && rawQuery.length() != 0) {
                LinkedHashMap linkedHashMapC = FmtBase.c(uri);
                String str2 = (String) linkedHashMapC.get("plugin");
                if (str2 != null && g.o(str2, "obfs=http", false)) {
                    HashMap map = new HashMap();
                    String str3 = (String) linkedHashMapC.get("plugin");
                    Iterator it = (str3 != null ? g.O(str3, new String[]{";"}, 6) : EmptyList.INSTANCE).iterator();
                    while (it.hasNext()) {
                        List listO2 = g.O((String) it.next(), new String[]{"="}, 6);
                        if (listO2.size() == 2) {
                            map.put(c.r(listO2), c.x(listO2));
                        }
                    }
                    profileItemCreate.setNetwork(NetworkType.TCP.getType());
                    profileItemCreate.setHeaderType("http");
                    profileItemCreate.setHost((String) map.get("obfs-host"));
                    profileItemCreate.setPath((String) map.get("path"));
                }
            }
        }
        if (profileItemCreate != null) {
            return profileItemCreate;
        }
        ProfileItem.Companion companion = ProfileItem.INSTANCE;
        EConfigType eConfigType = EConfigType.SHADOWSOCKS;
        ProfileItem profileItemCreate2 = companion.create(eConfigType);
        String strM = g.M(str, eConfigType.getProtocolScheme(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        int iZ = g.z(strM, "#", 0, false, 6);
        if (iZ > 0) {
            try {
                Regex regex2 = ul1.a;
                profileItemCreate2.setRemarks(ul1.C(strM.substring(iZ + 1, strM.length())));
            } catch (Exception unused) {
            }
            strM = strM.substring(0, iZ);
        }
        int iZ2 = g.z(strM, "@", 0, false, 6);
        if (iZ2 > 0) {
            Regex regex3 = ul1.a;
            strB = ul1.b(strM.substring(0, iZ2)).concat(strM.substring(iZ2, strM.length()));
        } else {
            Regex regex4 = ul1.a;
            strB = ul1.b(strM);
        }
        MatchResult matchResultMatchEntire = new Regex("^(.+?):(.*)@(.+?):(\\d+?)/?$").matchEntire(strB);
        if (matchResultMatchEntire == null) {
            return null;
        }
        profileItemCreate2.setServer(g.K(matchResultMatchEntire.getGroupValues().get(3), "[", "]"));
        profileItemCreate2.setServerPort(matchResultMatchEntire.getGroupValues().get(4));
        profileItemCreate2.setPassword(matchResultMatchEntire.getGroupValues().get(2));
        String lowerCase = matchResultMatchEntire.getGroupValues().get(1).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        profileItemCreate2.setMethod(lowerCase);
        return profileItemCreate2;
    }
}
