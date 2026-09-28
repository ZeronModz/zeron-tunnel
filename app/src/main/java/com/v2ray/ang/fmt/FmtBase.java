package com.v2ray.ang.fmt;

import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.dto.NetworkType;
import com.v2ray.ang.dto.ProfileItem;
import defpackage.hz;
import defpackage.p60;
import defpackage.qf3;
import defpackage.ul1;
import defpackage.w70;
import defpackage.yg0;
import defpackage.z3;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.c;
import kotlin.collections.d;
import kotlin.text.Regex;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/fmt/FmtBase;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class FmtBase {
    public static void a(ProfileItem profileItem, LinkedHashMap linkedHashMap, boolean z) {
        Boolean boolValueOf;
        String type = (String) linkedHashMap.get("type");
        if (type == null) {
            type = NetworkType.TCP.getType();
        }
        profileItem.setNetwork(type);
        profileItem.setHeaderType((String) linkedHashMap.get("headerType"));
        profileItem.setHost((String) linkedHashMap.get("host"));
        profileItem.setPath((String) linkedHashMap.get("path"));
        profileItem.setSeed((String) linkedHashMap.get("seed"));
        profileItem.setQuicSecurity((String) linkedHashMap.get("quicSecurity"));
        profileItem.setQuicKey((String) linkedHashMap.get("key"));
        profileItem.setMode((String) linkedHashMap.get("mode"));
        profileItem.setServiceName((String) linkedHashMap.get("serviceName"));
        profileItem.setAuthority((String) linkedHashMap.get("authority"));
        profileItem.setXhttpMode((String) linkedHashMap.get("mode"));
        profileItem.setXhttpExtra((String) linkedHashMap.get("extra"));
        profileItem.setSecurity((String) linkedHashMap.get("security"));
        if (!yg0.a(profileItem.getSecurity(), "tls") && !yg0.a(profileItem.getSecurity(), "reality")) {
            profileItem.setSecurity(null);
        }
        CharSequence charSequence = (CharSequence) linkedHashMap.get("allowInsecure");
        if (charSequence == null || charSequence.length() == 0) {
            boolValueOf = Boolean.valueOf(z);
        } else {
            String str = (String) linkedHashMap.get("allowInsecure");
            if (str == null) {
                str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            boolValueOf = Boolean.valueOf(str.equals("1"));
        }
        profileItem.setInsecure(boolValueOf);
        profileItem.setSni((String) linkedHashMap.get("sni"));
        profileItem.setFingerPrint((String) linkedHashMap.get("fp"));
        profileItem.setAlpn((String) linkedHashMap.get("alpn"));
        profileItem.setPublicKey((String) linkedHashMap.get("pbk"));
        profileItem.setShortId((String) linkedHashMap.get("sid"));
        profileItem.setSpiderX((String) linkedHashMap.get("spx"));
        profileItem.setFlow((String) linkedHashMap.get("flow"));
    }

    public static HashMap b(ProfileItem profileItem) {
        String str;
        HashMap map = new HashMap();
        String security = profileItem.getSecurity();
        if (security == null) {
            security = null;
        } else if (security.length() == 0) {
            security = "none";
        }
        String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (security == null) {
            security = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        map.put("security", security);
        String sni = profileItem.getSni();
        if (qf3.C(sni)) {
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
        String fingerPrint = profileItem.getFingerPrint();
        if (qf3.C(fingerPrint)) {
            if (fingerPrint == null) {
                fingerPrint = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            map.put("fp", fingerPrint);
        }
        String publicKey = profileItem.getPublicKey();
        if (qf3.C(publicKey)) {
            if (publicKey == null) {
                publicKey = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            map.put("pbk", publicKey);
        }
        String shortId = profileItem.getShortId();
        if (qf3.C(shortId)) {
            if (shortId == null) {
                shortId = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            map.put("sid", shortId);
        }
        String spiderX = profileItem.getSpiderX();
        if (qf3.C(spiderX)) {
            if (spiderX == null) {
                spiderX = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            map.put("spx", spiderX);
        }
        String flow = profileItem.getFlow();
        if (qf3.C(flow)) {
            if (flow == null) {
                flow = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            map.put("flow", flow);
        }
        NetworkType networkTypeFromString = NetworkType.INSTANCE.fromString(profileItem.getNetwork());
        map.put("type", networkTypeFromString.getType());
        switch (w70.a[networkTypeFromString.ordinal()]) {
            case 1:
                String headerType = profileItem.getHeaderType();
                str = headerType != null ? headerType.length() == 0 ? "none" : headerType : null;
                if (str == null) {
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                map.put("headerType", str);
                String host = profileItem.getHost();
                if (qf3.C(host)) {
                    if (host != null) {
                        str2 = host;
                    }
                    map.put("host", str2);
                }
                return map;
            case 2:
                String headerType2 = profileItem.getHeaderType();
                str = headerType2 != null ? headerType2.length() == 0 ? "none" : headerType2 : null;
                if (str == null) {
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                map.put("headerType", str);
                String seed = profileItem.getSeed();
                if (qf3.C(seed)) {
                    if (seed != null) {
                        str2 = seed;
                    }
                    map.put("seed", str2);
                    return map;
                }
                return map;
            case 3:
            case 4:
                String host2 = profileItem.getHost();
                if (qf3.C(host2)) {
                    if (host2 == null) {
                        host2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    map.put("host", host2);
                }
                String path = profileItem.getPath();
                if (qf3.C(path)) {
                    if (path != null) {
                        str2 = path;
                    }
                    map.put("path", str2);
                    return map;
                }
                return map;
            case 5:
                String host3 = profileItem.getHost();
                if (qf3.C(host3)) {
                    if (host3 == null) {
                        host3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    map.put("host", host3);
                }
                String path2 = profileItem.getPath();
                if (qf3.C(path2)) {
                    if (path2 == null) {
                        path2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    map.put("path", path2);
                }
                String xhttpMode = profileItem.getXhttpMode();
                if (qf3.C(xhttpMode)) {
                    if (xhttpMode == null) {
                        xhttpMode = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    map.put("mode", xhttpMode);
                }
                String xhttpExtra = profileItem.getXhttpExtra();
                if (qf3.C(xhttpExtra)) {
                    if (xhttpExtra != null) {
                        str2 = xhttpExtra;
                    }
                    map.put("extra", str2);
                    return map;
                }
                return map;
            case 6:
            case 7:
                map.put("type", "http");
                String host4 = profileItem.getHost();
                if (qf3.C(host4)) {
                    if (host4 == null) {
                        host4 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    map.put("host", host4);
                }
                String path3 = profileItem.getPath();
                if (qf3.C(path3)) {
                    if (path3 != null) {
                        str2 = path3;
                    }
                    map.put("path", str2);
                    return map;
                }
                return map;
            case 8:
                String mode = profileItem.getMode();
                if (qf3.C(mode)) {
                    if (mode == null) {
                        mode = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    map.put("mode", mode);
                }
                String authority = profileItem.getAuthority();
                if (qf3.C(authority)) {
                    if (authority == null) {
                        authority = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    map.put("authority", authority);
                }
                String serviceName = profileItem.getServiceName();
                if (qf3.C(serviceName)) {
                    if (serviceName != null) {
                        str2 = serviceName;
                    }
                    map.put("serviceName", str2);
                    return map;
                }
                return map;
            default:
                p60.b();
                return null;
        }
    }

    public static LinkedHashMap c(URI uri) {
        String rawQuery = uri.getRawQuery();
        rawQuery.getClass();
        List listO = g.O(rawQuery, new String[]{"&"}, 6);
        int iC = d.c(c.l(listO, 10));
        if (iC < 16) {
            iC = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iC);
        Iterator it = listO.iterator();
        while (it.hasNext()) {
            List listO2 = g.O((String) it.next(), new String[]{"="}, 6);
            String str = (String) listO2.get(0);
            String str2 = (String) listO2.get(1);
            Regex regex = ul1.a;
            Pair pair = new Pair(str, ul1.C(str2));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public static String d(ProfileItem profileItem, String str, HashMap map) {
        String strConcat = map != null ? "?".concat(c.w(d.g(map), "&", null, null, new z3(16), 30)) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        Regex regex = ul1.a;
        if (str == null) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return hz.v(String.format("%s@%s:%s", Arrays.copyOf(new Object[]{ul1.D(str), ul1.l(profileItem.getServer()), profileItem.getServerPort()}, 3)), strConcat, "#", ul1.D(profileItem.getRemarks()));
    }
}
