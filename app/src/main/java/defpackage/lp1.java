package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.dto.EConfigType;
import com.v2ray.ang.dto.NetworkType;
import com.v2ray.ang.dto.ProfileItem;
import com.v2ray.ang.dto.VmessQRCode;
import com.v2ray.ang.fmt.FmtBase;
import java.net.URI;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.text.Regex;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class lp1 extends FmtBase {
    public static final lp1 a = new lp1();

    public final ProfileItem e(String str) {
        str.getClass();
        int iY = g.y(str, '?', 0, 6);
        String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (iY > 0 && g.y(str, '&', 0, 6) > 0) {
            Lazy lazy = zq0.a;
            boolean zB = zq0.z().b("pref_allow_insecure", false);
            ProfileItem profileItemCreate = ProfileItem.INSTANCE.create(EConfigType.VMESS);
            Regex regex = ul1.a;
            URI uri = new URI(ul1.e(str));
            String rawQuery = uri.getRawQuery();
            if (rawQuery == null || rawQuery.length() == 0) {
                return null;
            }
            LinkedHashMap linkedHashMapC = FmtBase.c(uri);
            String fragment = uri.getFragment();
            if (fragment != null) {
                str2 = fragment;
            }
            String strC = ul1.C(str2);
            if (strC.length() == 0) {
                strC = "none";
            }
            profileItemCreate.setRemarks(strC);
            profileItemCreate.setServer(qf3.n(uri));
            profileItemCreate.setServerPort(String.valueOf(uri.getPort()));
            profileItemCreate.setPassword(uri.getUserInfo());
            profileItemCreate.setMethod("auto");
            FmtBase.a(profileItemCreate, linkedHashMapC, zB);
            return profileItemCreate;
        }
        Lazy lazy2 = zq0.a;
        boolean zB2 = zq0.z().b("pref_allow_insecure", false);
        ProfileItem.Companion companion = ProfileItem.INSTANCE;
        EConfigType eConfigType = EConfigType.VMESS;
        ProfileItem profileItemCreate2 = companion.create(eConfigType);
        String strM = g.M(str, eConfigType.getProtocolScheme(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        Regex regex2 = ul1.a;
        String strB = ul1.b(strM);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        VmessQRCode vmessQRCode = (VmessQRCode) aj0.a(VmessQRCode.class, strB);
        if (TextUtils.isEmpty(vmessQRCode.getAdd()) || TextUtils.isEmpty(vmessQRCode.getPort()) || TextUtils.isEmpty(vmessQRCode.getId()) || TextUtils.isEmpty(vmessQRCode.getNet())) {
            return null;
        }
        profileItemCreate2.setRemarks(vmessQRCode.getPs());
        profileItemCreate2.setServer(vmessQRCode.getAdd());
        profileItemCreate2.setServerPort(vmessQRCode.getPort());
        profileItemCreate2.setPassword(vmessQRCode.getId());
        profileItemCreate2.setMethod(TextUtils.isEmpty(vmessQRCode.getScy()) ? "auto" : vmessQRCode.getScy());
        String net2 = vmessQRCode.getNet();
        if (net2 == null) {
            net2 = NetworkType.TCP.getType();
        }
        profileItemCreate2.setNetwork(net2);
        profileItemCreate2.setHeaderType(vmessQRCode.getType());
        profileItemCreate2.setHost(vmessQRCode.getHost());
        profileItemCreate2.setPath(vmessQRCode.getPath());
        int i = kp1.a[NetworkType.INSTANCE.fromString(profileItemCreate2.getNetwork()).ordinal()];
        if (i == 1) {
            profileItemCreate2.setSeed(vmessQRCode.getPath());
        } else if (i == 2) {
            profileItemCreate2.setMode(vmessQRCode.getType());
            profileItemCreate2.setServiceName(vmessQRCode.getPath());
            profileItemCreate2.setAuthority(vmessQRCode.getHost());
        }
        profileItemCreate2.setSecurity(vmessQRCode.getTls());
        profileItemCreate2.setInsecure(Boolean.valueOf(zB2));
        profileItemCreate2.setSni(vmessQRCode.getSni());
        profileItemCreate2.setFingerPrint(vmessQRCode.getFp());
        profileItemCreate2.setAlpn(vmessQRCode.getAlpn());
        return profileItemCreate2;
    }

    public final String f(ProfileItem profileItem) {
        VmessQRCode vmessQRCode = new VmessQRCode(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        vmessQRCode.setV("2");
        vmessQRCode.setPs(profileItem.getRemarks());
        String server = profileItem.getServer();
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (server == null) {
            server = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        vmessQRCode.setAdd(server);
        String serverPort = profileItem.getServerPort();
        if (serverPort == null) {
            serverPort = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        vmessQRCode.setPort(serverPort);
        String password = profileItem.getPassword();
        if (password == null) {
            password = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        vmessQRCode.setId(password);
        String method = profileItem.getMethod();
        if (method == null) {
            method = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        vmessQRCode.setScy(method);
        vmessQRCode.setAid("0");
        String network = profileItem.getNetwork();
        if (network == null) {
            network = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        vmessQRCode.setNet(network);
        String headerType = profileItem.getHeaderType();
        if (headerType == null) {
            headerType = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        vmessQRCode.setType(headerType);
        int i = kp1.a[NetworkType.INSTANCE.fromString(profileItem.getNetwork()).ordinal()];
        if (i == 1) {
            String seed = profileItem.getSeed();
            if (seed == null) {
                seed = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            vmessQRCode.setPath(seed);
        } else if (i == 2) {
            String mode = profileItem.getMode();
            if (mode == null) {
                mode = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            vmessQRCode.setType(mode);
            String serviceName = profileItem.getServiceName();
            if (serviceName == null) {
                serviceName = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            vmessQRCode.setPath(serviceName);
            String authority = profileItem.getAuthority();
            if (authority == null) {
                authority = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            vmessQRCode.setHost(authority);
        }
        String host = profileItem.getHost();
        if (qf3.C(host)) {
            if (host == null) {
                host = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            vmessQRCode.setHost(host);
        }
        String path = profileItem.getPath();
        if (qf3.C(path)) {
            if (path == null) {
                path = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            vmessQRCode.setPath(path);
        }
        String security = profileItem.getSecurity();
        if (security == null) {
            security = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        vmessQRCode.setTls(security);
        String sni = profileItem.getSni();
        if (sni == null) {
            sni = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        vmessQRCode.setSni(sni);
        String fingerPrint = profileItem.getFingerPrint();
        if (fingerPrint == null) {
            fingerPrint = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        vmessQRCode.setFp(fingerPrint);
        String alpn = profileItem.getAlpn();
        if (alpn != null) {
            str = alpn;
        }
        vmessQRCode.setAlpn(str);
        String strG = aj0.a.g(vmessQRCode);
        Regex regex = ul1.a;
        return ul1.c(strG);
    }
}
