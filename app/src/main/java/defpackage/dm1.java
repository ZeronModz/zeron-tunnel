package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.tencent.mmkv.MMKV;
import com.v2ray.ang.dto.ConfigResult;
import com.v2ray.ang.dto.EConfigType;
import com.v2ray.ang.dto.ProfileItem;
import com.v2ray.ang.dto.RulesetItem;
import com.v2ray.ang.dto.SubscriptionItem;
import com.v2ray.ang.dto.V2rayConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.collections.c;
import kotlin.text.Regex;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dm1 {
    public static String a;

    public static V2rayConfig.OutboundBean a(ProfileItem profileItem) {
        V2rayConfig.OutboundBean.StreamSettingsBean streamSettings;
        V2rayConfig.OutboundBean.StreamSettingsBean streamSettings2;
        V2rayConfig.OutboundBean.OutSettingsBean settings;
        List<V2rayConfig.OutboundBean.OutSettingsBean.VnextBean> vnext;
        V2rayConfig.OutboundBean.OutSettingsBean.VnextBean vnextBean;
        V2rayConfig.OutboundBean.StreamSettingsBean streamSettings3;
        V2rayConfig.OutboundBean.StreamSettingsBean streamSettings4;
        V2rayConfig.OutboundBean.OutSettingsBean settings2;
        List<V2rayConfig.OutboundBean.OutSettingsBean.ServersBean> servers;
        V2rayConfig.OutboundBean.OutSettingsBean.ServersBean serversBean;
        V2rayConfig.OutboundBean.OutSettingsBean settings3;
        List<V2rayConfig.OutboundBean.OutSettingsBean.ServersBean> servers2;
        V2rayConfig.OutboundBean.OutSettingsBean.ServersBean serversBean2;
        V2rayConfig.OutboundBean.StreamSettingsBean streamSettings5;
        V2rayConfig.OutboundBean.StreamSettingsBean streamSettings6;
        V2rayConfig.OutboundBean.OutSettingsBean settings4;
        List<V2rayConfig.OutboundBean.OutSettingsBean.VnextBean> vnext2;
        V2rayConfig.OutboundBean.OutSettingsBean.VnextBean vnextBean2;
        V2rayConfig.OutboundBean.StreamSettingsBean streamSettings7;
        V2rayConfig.OutboundBean.StreamSettingsBean streamSettings8;
        V2rayConfig.OutboundBean.OutSettingsBean settings5;
        List<V2rayConfig.OutboundBean.OutSettingsBean.ServersBean> servers3;
        V2rayConfig.OutboundBean.OutSettingsBean.ServersBean serversBean3;
        V2rayConfig.OutboundBean.OutSettingsBean settings6;
        V2rayConfig.OutboundBean.OutSettingsBean.WireGuardBean wireGuardBean;
        V2rayConfig.OutboundBean.OutSettingsBean settings7;
        List<V2rayConfig.OutboundBean.OutSettingsBean.ServersBean> servers4;
        V2rayConfig.OutboundBean.OutSettingsBean.ServersBean serversBean4;
        int i = cm1.a[profileItem.getConfigType().ordinal()];
        String strL = null;
        list = null;
        List<Integer> list = null;
        strL = null;
        String strL2 = null;
        strL = null;
        String strL3 = null;
        strL = null;
        String strL4 = null;
        strL = null;
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        switch (i) {
            case 1:
                lp1.a.getClass();
                V2rayConfig.OutboundBean outboundBeanB = b(EConfigType.VMESS);
                if (outboundBeanB != null && (settings = outboundBeanB.getSettings()) != null && (vnext = settings.getVnext()) != null && (vnextBean = (V2rayConfig.OutboundBean.OutSettingsBean.VnextBean) c.r(vnext)) != null) {
                    String server = profileItem.getServer();
                    if (server == null) {
                        server = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    vnextBean.setAddress(server);
                    String serverPort = profileItem.getServerPort();
                    if (serverPort == null) {
                        serverPort = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    vnextBean.setPort(Integer.parseInt(serverPort));
                    V2rayConfig.OutboundBean.OutSettingsBean.VnextBean.UsersBean usersBean = vnextBean.getUsers().get(0);
                    String password = profileItem.getPassword();
                    if (password != null) {
                        str = password;
                    }
                    usersBean.setId(str);
                    vnextBean.getUsers().get(0).setSecurity(profileItem.getMethod());
                }
                if (outboundBeanB != null && (streamSettings2 = outboundBeanB.getStreamSettings()) != null) {
                    strL = l(streamSettings2, profileItem);
                }
                if (outboundBeanB != null && (streamSettings = outboundBeanB.getStreamSettings()) != null) {
                    k(streamSettings, profileItem, strL);
                }
                return outboundBeanB;
            case 2:
            case 8:
                return null;
            case 3:
                m71.a.getClass();
                V2rayConfig.OutboundBean outboundBeanB2 = b(EConfigType.SHADOWSOCKS);
                if (outboundBeanB2 != null && (settings2 = outboundBeanB2.getSettings()) != null && (servers = settings2.getServers()) != null && (serversBean = (V2rayConfig.OutboundBean.OutSettingsBean.ServersBean) c.r(servers)) != null) {
                    String server2 = profileItem.getServer();
                    if (server2 == null) {
                        server2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    serversBean.setAddress(server2);
                    String serverPort2 = profileItem.getServerPort();
                    if (serverPort2 != null) {
                        str = serverPort2;
                    }
                    serversBean.setPort(Integer.parseInt(str));
                    serversBean.setPassword(profileItem.getPassword());
                    serversBean.setMethod(profileItem.getMethod());
                }
                if (outboundBeanB2 != null && (streamSettings4 = outboundBeanB2.getStreamSettings()) != null) {
                    strL4 = l(streamSettings4, profileItem);
                }
                if (outboundBeanB2 != null && (streamSettings3 = outboundBeanB2.getStreamSettings()) != null) {
                    k(streamSettings3, profileItem, strL4);
                }
                return outboundBeanB2;
            case 4:
                d91.a.getClass();
                V2rayConfig.OutboundBean outboundBeanB3 = b(EConfigType.SOCKS);
                if (outboundBeanB3 != null && (settings3 = outboundBeanB3.getSettings()) != null && (servers2 = settings3.getServers()) != null && (serversBean2 = (V2rayConfig.OutboundBean.OutSettingsBean.ServersBean) c.r(servers2)) != null) {
                    String server3 = profileItem.getServer();
                    if (server3 == null) {
                        server3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    serversBean2.setAddress(server3);
                    String serverPort3 = profileItem.getServerPort();
                    if (serverPort3 == null) {
                        serverPort3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    serversBean2.setPort(Integer.parseInt(serverPort3));
                    if (qf3.C(profileItem.getUsername())) {
                        V2rayConfig.OutboundBean.OutSettingsBean.ServersBean.SocksUsersBean socksUsersBean = new V2rayConfig.OutboundBean.OutSettingsBean.ServersBean.SocksUsersBean(null, null, 0, 7, null);
                        String username = profileItem.getUsername();
                        if (username == null) {
                            username = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        socksUsersBean.setUser(username);
                        String password2 = profileItem.getPassword();
                        if (password2 != null) {
                            str = password2;
                        }
                        socksUsersBean.setPass(str);
                        serversBean2.setUsers(c.z(socksUsersBean));
                    }
                }
                return outboundBeanB3;
            case 5:
                jp1.a.getClass();
                V2rayConfig.OutboundBean outboundBeanB4 = b(EConfigType.VLESS);
                if (outboundBeanB4 != null && (settings4 = outboundBeanB4.getSettings()) != null && (vnext2 = settings4.getVnext()) != null && (vnextBean2 = (V2rayConfig.OutboundBean.OutSettingsBean.VnextBean) c.r(vnext2)) != null) {
                    String server4 = profileItem.getServer();
                    if (server4 == null) {
                        server4 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    vnextBean2.setAddress(server4);
                    String serverPort4 = profileItem.getServerPort();
                    if (serverPort4 == null) {
                        serverPort4 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    vnextBean2.setPort(Integer.parseInt(serverPort4));
                    V2rayConfig.OutboundBean.OutSettingsBean.VnextBean.UsersBean usersBean2 = vnextBean2.getUsers().get(0);
                    String password3 = profileItem.getPassword();
                    if (password3 != null) {
                        str = password3;
                    }
                    usersBean2.setId(str);
                    vnextBean2.getUsers().get(0).setEncryption(profileItem.getMethod());
                    vnextBean2.getUsers().get(0).setFlow(profileItem.getFlow());
                }
                if (outboundBeanB4 != null && (streamSettings6 = outboundBeanB4.getStreamSettings()) != null) {
                    strL3 = l(streamSettings6, profileItem);
                }
                if (outboundBeanB4 != null && (streamSettings5 = outboundBeanB4.getStreamSettings()) != null) {
                    k(streamSettings5, profileItem, strL3);
                }
                return outboundBeanB4;
            case 6:
                yg1.a.getClass();
                V2rayConfig.OutboundBean outboundBeanB5 = b(EConfigType.TROJAN);
                if (outboundBeanB5 != null && (settings5 = outboundBeanB5.getSettings()) != null && (servers3 = settings5.getServers()) != null && (serversBean3 = (V2rayConfig.OutboundBean.OutSettingsBean.ServersBean) c.r(servers3)) != null) {
                    String server5 = profileItem.getServer();
                    if (server5 == null) {
                        server5 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    serversBean3.setAddress(server5);
                    String serverPort5 = profileItem.getServerPort();
                    if (serverPort5 != null) {
                        str = serverPort5;
                    }
                    serversBean3.setPort(Integer.parseInt(str));
                    serversBean3.setPassword(profileItem.getPassword());
                    serversBean3.setFlow(profileItem.getFlow());
                }
                if (outboundBeanB5 != null && (streamSettings8 = outboundBeanB5.getStreamSettings()) != null) {
                    strL2 = l(streamSettings8, profileItem);
                }
                if (outboundBeanB5 != null && (streamSettings7 = outboundBeanB5.getStreamSettings()) != null) {
                    k(streamSettings7, profileItem, strL2);
                }
                return outboundBeanB5;
            case 7:
                br1.a.getClass();
                V2rayConfig.OutboundBean outboundBeanB6 = b(EConfigType.WIREGUARD);
                if (outboundBeanB6 != null && (settings6 = outboundBeanB6.getSettings()) != null) {
                    settings6.setSecretKey(profileItem.getSecretKey());
                    String localAddress = profileItem.getLocalAddress();
                    if (localAddress == null) {
                        localAddress = "172.16.0.2/32";
                    }
                    settings6.setAddress(g.O(localAddress, new String[]{","}, 6));
                    List<V2rayConfig.OutboundBean.OutSettingsBean.WireGuardBean> peers = settings6.getPeers();
                    if (peers != null && (wireGuardBean = (V2rayConfig.OutboundBean.OutSettingsBean.WireGuardBean) c.s(peers)) != null) {
                        String publicKey = profileItem.getPublicKey();
                        if (publicKey != null) {
                            str = publicKey;
                        }
                        wireGuardBean.setPublicKey(str);
                        String preSharedKey = profileItem.getPreSharedKey();
                        if (preSharedKey == null || preSharedKey.length() <= 0) {
                            preSharedKey = null;
                        }
                        wireGuardBean.setPreSharedKey(preSharedKey);
                        Regex regex = ul1.a;
                        wireGuardBean.setEndpoint(ul1.l(profileItem.getServer()) + ":" + profileItem.getServerPort());
                    }
                    settings6.setMtu(profileItem.getMtu());
                    String reserved = profileItem.getReserved();
                    if (reserved != null) {
                        if (g.B(reserved)) {
                            reserved = null;
                        }
                        if (reserved != null) {
                            List listO = g.O(reserved, new String[]{","}, 6);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : listO) {
                                if (!g.B((String) obj)) {
                                    arrayList.add(obj);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(c.l(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(Integer.valueOf(Integer.parseInt(g.c0((String) it.next()).toString())));
                            }
                            list = arrayList2;
                        }
                    }
                    settings6.setReserved(list);
                }
                return outboundBeanB6;
            case 9:
                je0.a.getClass();
                V2rayConfig.OutboundBean outboundBeanB7 = b(EConfigType.HTTP);
                if (outboundBeanB7 != null && (settings7 = outboundBeanB7.getSettings()) != null && (servers4 = settings7.getServers()) != null && (serversBean4 = (V2rayConfig.OutboundBean.OutSettingsBean.ServersBean) c.r(servers4)) != null) {
                    String server6 = profileItem.getServer();
                    if (server6 == null) {
                        server6 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    serversBean4.setAddress(server6);
                    String serverPort6 = profileItem.getServerPort();
                    if (serverPort6 == null) {
                        serverPort6 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    serversBean4.setPort(Integer.parseInt(serverPort6));
                    if (qf3.C(profileItem.getUsername())) {
                        V2rayConfig.OutboundBean.OutSettingsBean.ServersBean.SocksUsersBean socksUsersBean2 = new V2rayConfig.OutboundBean.OutSettingsBean.ServersBean.SocksUsersBean(null, null, 0, 7, null);
                        String username2 = profileItem.getUsername();
                        if (username2 == null) {
                            username2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        socksUsersBean2.setUser(username2);
                        String password4 = profileItem.getPassword();
                        if (password4 != null) {
                            str = password4;
                        }
                        socksUsersBean2.setPass(str);
                        serversBean4.setUsers(c.z(socksUsersBean2));
                    }
                }
                return outboundBeanB7;
            default:
                p60.b();
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static V2rayConfig.OutboundBean b(EConfigType eConfigType) {
        eConfigType.getClass();
        switch (cm1.a[eConfigType.ordinal()]) {
            case 1:
            case 5:
                String lowerCase = eConfigType.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String str = null;
                int i = 0;
                List list = null;
                List list2 = null;
                V2rayConfig.OutboundBean.OutSettingsBean.Response response = null;
                String str2 = null;
                Integer num = null;
                String str3 = null;
                String str4 = null;
                List list3 = null;
                List list4 = null;
                Integer num2 = null;
                String str5 = null;
                Object[] objArr = 0 == true ? 1 : 0;
                Object[] objArr2 = 0 == true ? 1 : 0;
                Object[] objArr3 = 0 == true ? 1 : 0;
                Object[] objArr4 = 0 == true ? 1 : 0;
                Object[] objArr5 = 0 == true ? 1 : 0;
                V2rayConfig.OutboundBean.OutSettingsBean outSettingsBean = new V2rayConfig.OutboundBean.OutSettingsBean(c.z(new V2rayConfig.OutboundBean.OutSettingsBean.VnextBean(str, i, c.z(new V2rayConfig.OutboundBean.OutSettingsBean.VnextBean.UsersBean(null, null, null, 0, null, null, 63, null)), 3, null)), objArr5, list, list2, response, objArr4, objArr2, objArr3, str2, objArr, num, str3, str4, list3, list4, num2, str5, 131070, null);
                Object[] objArr6 = 0 == true ? 1 : 0;
                Object[] objArr7 = 0 == true ? 1 : 0;
                Object[] objArr8 = 0 == true ? 1 : 0;
                Object[] objArr9 = 0 == true ? 1 : 0;
                Object[] objArr10 = 0 == true ? 1 : 0;
                Object[] objArr11 = 0 == true ? 1 : 0;
                Object[] objArr12 = 0 == true ? 1 : 0;
                Object[] objArr13 = 0 == true ? 1 : 0;
                Object[] objArr14 = 0 == true ? 1 : 0;
                Object[] objArr15 = 0 == true ? 1 : 0;
                Object[] objArr16 = 0 == true ? 1 : 0;
                Object[] objArr17 = 0 == true ? 1 : 0;
                Object[] objArr18 = 0 == true ? 1 : 0;
                Object[] objArr19 = 0 == true ? 1 : 0;
                String str6 = null;
                Object[] objArr20 = 0 == true ? 1 : 0;
                return new V2rayConfig.OutboundBean(str6, lowerCase, outSettingsBean, new V2rayConfig.OutboundBean.StreamSettingsBean(objArr10, objArr11, objArr12, objArr13, objArr9, objArr7, objArr8, objArr14, objArr6, objArr15, objArr16, objArr17, objArr18, list4, objArr19, 32767, null), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 113, objArr20);
            case 2:
                return null;
            case 3:
            case 4:
            case 6:
            case 8:
            case 9:
                String lowerCase2 = eConfigType.name().toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                List list5 = null;
                String str7 = null;
                V2rayConfig.OutboundBean.StreamSettingsBean.HttpupgradeSettingsBean httpupgradeSettingsBean = null;
                String str8 = null;
                List list6 = null;
                List list7 = null;
                Integer num3 = null;
                String str9 = null;
                Object[] objArr21 = 0 == true ? 1 : 0;
                Object[] objArr22 = 0 == true ? 1 : 0;
                Object[] objArr23 = 0 == true ? 1 : 0;
                Object[] objArr24 = 0 == true ? 1 : 0;
                Object[] objArr25 = 0 == true ? 1 : 0;
                Object[] objArr26 = 0 == true ? 1 : 0;
                Object[] objArr27 = 0 == true ? 1 : 0;
                Object[] objArr28 = 0 == true ? 1 : 0;
                V2rayConfig.OutboundBean.OutSettingsBean outSettingsBean2 = new V2rayConfig.OutboundBean.OutSettingsBean(list5, objArr22, objArr23, c.z(new V2rayConfig.OutboundBean.OutSettingsBean.ServersBean(null, null, false, null, 0, 0, null, null, null, null, 1023, null)), objArr24, str7, httpupgradeSettingsBean, objArr25, objArr26, objArr27, objArr28, str8, objArr21, list6, list7, num3, str9, 131063, null);
                V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean tcpSettingsBean = null;
                Object[] objArr29 = 0 == true ? 1 : 0;
                Object[] objArr30 = 0 == true ? 1 : 0;
                Object[] objArr31 = 0 == true ? 1 : 0;
                Object[] objArr32 = 0 == true ? 1 : 0;
                Object[] objArr33 = 0 == true ? 1 : 0;
                Object[] objArr34 = 0 == true ? 1 : 0;
                Object[] objArr35 = 0 == true ? 1 : 0;
                Object[] objArr36 = 0 == true ? 1 : 0;
                Object[] objArr37 = 0 == true ? 1 : 0;
                Object[] objArr38 = 0 == true ? 1 : 0;
                Object[] objArr39 = 0 == true ? 1 : 0;
                Object[] objArr40 = 0 == true ? 1 : 0;
                String str10 = null;
                Object[] objArr41 = 0 == true ? 1 : 0;
                Object[] objArr42 = 0 == true ? 1 : 0;
                Object[] objArr43 = 0 == true ? 1 : 0;
                return new V2rayConfig.OutboundBean(str10, lowerCase2, outSettingsBean2, new V2rayConfig.OutboundBean.StreamSettingsBean(objArr30, objArr31, tcpSettingsBean, objArr32, objArr37, httpupgradeSettingsBean, objArr33, objArr34, objArr35, objArr36, objArr38, objArr29, objArr39, list7, objArr40, 32767, null), objArr41, objArr42, 0 == true ? 1 : 0, 113, objArr43);
            case 7:
                String lowerCase3 = eConfigType.name().toLowerCase(Locale.ROOT);
                lowerCase3.getClass();
                String str11 = null;
                String str12 = null;
                String str13 = null;
                List list8 = null;
                V2rayConfig.OutboundBean.OutSettingsBean.Response response2 = null;
                Object obj = null;
                Integer num4 = null;
                String str14 = null;
                String str15 = null;
                Integer num5 = null;
                String str16 = null;
                String str17 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                List list9 = null;
                Integer num6 = null;
                String str18 = null;
                Object[] objArr44 = 0 == true ? 1 : 0;
                Object[] objArr45 = 0 == true ? 1 : 0;
                Object[] objArr46 = 0 == true ? 1 : 0;
                Object[] objArr47 = 0 == true ? 1 : 0;
                String str19 = null;
                Object[] objArr48 = 0 == true ? 1 : 0;
                Object[] objArr49 = 0 == true ? 1 : 0;
                Object[] objArr50 = 0 == true ? 1 : 0;
                Object[] objArr51 = 0 == true ? 1 : 0;
                return new V2rayConfig.OutboundBean(str19, lowerCase3, new V2rayConfig.OutboundBean.OutSettingsBean(list8, objArr45, objArr46, objArr47, response2, objArr44, obj, num4, str14, str15, num5, str16, str17, c.z(new V2rayConfig.OutboundBean.OutSettingsBean.WireGuardBean(str11, str12, str13, 7, null)), list9, num6, str18, 118783, null), 0 == true ? 1 : 0, objArr49, objArr50, objArr51, 121, objArr48);
            default:
                p60.b();
                return null;
        }
    }

    public static void c(V2rayConfig v2rayConfig, String str) {
        V2rayConfig.OutboundBean outboundBeanA;
        V2rayConfig.OutboundBean outboundBeanA2;
        Lazy lazy = zq0.a;
        if (zq0.z().b("pref_fragment_enabled", false) || str.length() == 0) {
            return;
        }
        try {
            SubscriptionItem subscriptionItemH = zq0.h(str);
            if (subscriptionItemH == null) {
                return;
            }
            V2rayConfig.OutboundBean outboundBean = v2rayConfig.getOutbounds().get(0);
            outboundBean.getClass();
            V2rayConfig.OutboundBean outboundBean2 = outboundBean;
            ProfileItem profileItemE = l71.e(subscriptionItemH.getPrevProfile());
            if (profileItemE != null && (outboundBeanA2 = a(profileItemE)) != null) {
                m(outboundBeanA2);
                outboundBeanA2.setTag("proxy2");
                v2rayConfig.getOutbounds().add(outboundBeanA2);
                outboundBean2.ensureSockopt().setDialerProxy(outboundBeanA2.getTag());
            }
            ProfileItem profileItemE2 = l71.e(subscriptionItemH.getNextProfile());
            if (profileItemE2 == null || (outboundBeanA = a(profileItemE2)) == null) {
                return;
            }
            m(outboundBeanA);
            outboundBeanA.setTag("proxy");
            v2rayConfig.getOutbounds().add(0, outboundBeanA);
            outboundBean2.setTag("proxy1");
            outboundBeanA.ensureSockopt().setDialerProxy(outboundBean2.getTag());
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0077 A[Catch: Exception -> 0x0196, TRY_LEAVE, TryCatch #0 {Exception -> 0x0196, blocks: (B:13:0x002b, B:16:0x003b, B:18:0x004b, B:20:0x0051, B:23:0x0059, B:25:0x0069, B:27:0x006f, B:30:0x0077, B:34:0x0097, B:36:0x00a7, B:38:0x00ad, B:40:0x00b3, B:52:0x00de, B:55:0x00f0, B:59:0x00ff, B:61:0x0183, B:43:0x00bc, B:45:0x00cc, B:46:0x00d0, B:48:0x00d6), top: B:65:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean d(com.v2ray.ang.dto.V2rayConfig r27, com.v2ray.ang.dto.ProfileItem r28) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dm1.d(com.v2ray.ang.dto.V2rayConfig, com.v2ray.ang.dto.ProfileItem):java.lang.Boolean");
    }

    public static Integer e(V2rayConfig v2rayConfig) {
        try {
            Regex regex = ul1.a;
            Lazy lazy = zq0.a;
            int iD = ul1.d(c.A(Integer.valueOf(ul1.y(Integer.parseInt("10808"), zq0.z().d("pref_socks_port")) + 100), 0));
            String lowerCase = "SOCKS".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            String str = null;
            V2rayConfig.OutboundBean.StreamSettingsBean streamSettingsBean = null;
            Object obj = null;
            String str2 = null;
            V2rayConfig.OutboundBean.MuxBean muxBean = null;
            V2rayConfig.OutboundBean outboundBean = new V2rayConfig.OutboundBean(str, lowerCase, new V2rayConfig.OutboundBean.OutSettingsBean(null, null, null, c.z(new V2rayConfig.OutboundBean.OutSettingsBean.ServersBean("127.0.0.1", null, false, null, iD, 0, null, null, null, null, 1006, null)), null, null, null, null, null, null, null, null, null, null, null, null, null, 131063, null), streamSettingsBean, obj, str2, muxBean, 57, null);
            if (v2rayConfig.getOutbounds().isEmpty()) {
                v2rayConfig.getOutbounds().add(outboundBean);
            } else {
                v2rayConfig.getOutbounds().set(0, outboundBean);
            }
            return Integer.valueOf(iD);
        } catch (Exception unused) {
            return null;
        }
    }

    public static ArrayList f(String str) {
        List<String> domain;
        List<String> domain2;
        ArrayList arrayList = new ArrayList();
        Lazy lazy = zq0.a;
        ArrayList<RulesetItem> arrayListC = zq0.c();
        if (arrayListC != null) {
            for (RulesetItem rulesetItem : arrayListC) {
                if (rulesetItem.getEnabled() && yg0.a(rulesetItem.getOutboundTag(), str) && (domain = rulesetItem.getDomain()) != null && !domain.isEmpty() && (domain2 = rulesetItem.getDomain()) != null) {
                    for (String str2 : domain2) {
                        if (!yg0.a(str2, "geosite:private") && (g.R(str2, "geosite:", false) || g.R(str2, "domain:", false))) {
                            arrayList.add(str2);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static ConfigResult g(String str) {
        Lazy lazy = zq0.a;
        str.getClass();
        String strD = ((MMKV) zq0.c.getValue()).d(str);
        if (strD != null) {
            return new ConfigResult(true, str, strD, null, 8, null);
        }
        return new ConfigResult(false, null, null, null, 14, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x026c A[Catch: Exception -> 0x01f9, TRY_LEAVE, TryCatch #5 {Exception -> 0x01f9, blocks: (B:83:0x01d3, B:84:0x01e9, B:86:0x01ef, B:88:0x01fd, B:90:0x0203, B:91:0x021f, B:93:0x023b, B:97:0x024a, B:98:0x025e, B:100:0x026c), top: B:271:0x01d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0369 A[PHI: r0
      0x0369: PHI (r0v36 java.lang.String) = (r0v35 java.lang.String), (r0v0 java.lang.String) binds: [B:260:0x0369, B:102:0x02b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0377 A[Catch: Exception -> 0x0435, TryCatch #7 {Exception -> 0x0435, blocks: (B:133:0x036b, B:135:0x0377, B:136:0x0386, B:138:0x038c, B:139:0x039b, B:140:0x039e, B:142:0x03f5), top: B:275:0x036b }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03f5 A[Catch: Exception -> 0x0435, TRY_LEAVE, TryCatch #7 {Exception -> 0x0435, blocks: (B:133:0x036b, B:135:0x0377, B:136:0x0386, B:138:0x038c, B:139:0x039b, B:140:0x039e, B:142:0x03f5), top: B:275:0x036b }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0443 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0676 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0177 A[Catch: Exception -> 0x01ad, TryCatch #0 {Exception -> 0x01ad, blocks: (B:60:0x015a, B:63:0x016e, B:65:0x0177, B:66:0x017b, B:68:0x0181), top: B:261:0x015a }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ef A[Catch: Exception -> 0x01f9, LOOP:2: B:84:0x01e9->B:86:0x01ef, LOOP_END, TryCatch #5 {Exception -> 0x01f9, blocks: (B:83:0x01d3, B:84:0x01e9, B:86:0x01ef, B:88:0x01fd, B:90:0x0203, B:91:0x021f, B:93:0x023b, B:97:0x024a, B:98:0x025e, B:100:0x026c), top: B:271:0x01d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0203 A[Catch: Exception -> 0x01f9, TryCatch #5 {Exception -> 0x01f9, blocks: (B:83:0x01d3, B:84:0x01e9, B:86:0x01ef, B:88:0x01fd, B:90:0x0203, B:91:0x021f, B:93:0x023b, B:97:0x024a, B:98:0x025e, B:100:0x026c), top: B:271:0x01d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023b A[Catch: Exception -> 0x01f9, TryCatch #5 {Exception -> 0x01f9, blocks: (B:83:0x01d3, B:84:0x01e9, B:86:0x01ef, B:88:0x01fd, B:90:0x0203, B:91:0x021f, B:93:0x023b, B:97:0x024a, B:98:0x025e, B:100:0x026c), top: B:271:0x01d3 }] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object[], java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object[], java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.v2ray.ang.dto.ConfigResult h(android.app.Service r41, java.lang.String r42, com.v2ray.ang.dto.ProfileItem r43) {
        /*
            Method dump skipped, instruction units count: 1714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dm1.h(android.app.Service, java.lang.String, com.v2ray.ang.dto.ProfileItem):com.v2ray.ang.dto.ConfigResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[LOOP:0: B:26:0x008a->B:28:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.v2ray.ang.dto.ConfigResult i(android.content.Context r7, java.lang.String r8, com.v2ray.ang.dto.ProfileItem r9) {
        /*
            com.v2ray.ang.dto.ConfigResult r0 = new com.v2ray.ang.dto.ConfigResult
            r5 = 14
            r6 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = r9.getServer()
            if (r1 != 0) goto L14
            goto Lac
        L14:
            kotlin.text.Regex r2 = defpackage.ul1.a
            boolean r2 = defpackage.ul1.r(r1)
            if (r2 != 0) goto L24
            boolean r1 = defpackage.ul1.w(r1)
            if (r1 != 0) goto L24
            goto Lac
        L24:
            com.v2ray.ang.dto.V2rayConfig r7 = j(r7)
            if (r7 != 0) goto L2c
            goto Lac
        L2c:
            com.v2ray.ang.dto.EConfigType r1 = r9.getConfigType()
            com.v2ray.ang.dto.EConfigType r2 = com.v2ray.ang.dto.EConfigType.HYSTERIA2
            if (r1 != r2) goto L3f
            java.lang.Integer r9 = e(r7)
            if (r9 != 0) goto L3b
            goto Lac
        L3b:
            r0.setSocksPort(r9)
            goto L4c
        L3f:
            java.lang.Boolean r1 = d(r7, r9)
            if (r1 == 0) goto Lac
            java.lang.String r9 = r9.getSubscriptionId()
            c(r7, r9)
        L4c:
            com.v2ray.ang.dto.V2rayConfig$LogBean r9 = r7.getLog()
            kotlin.Lazy r1 = defpackage.zq0.a
            java.lang.String r1 = "pref_core_loglevel"
            com.tencent.mmkv.MMKV r2 = defpackage.zq0.z()
            java.lang.String r1 = r2.d(r1)
            if (r1 != 0) goto L60
            java.lang.String r1 = "warning"
        L60:
            r9.setLoglevel(r1)
            java.util.ArrayList r9 = r7.getInbounds()
            r9.clear()
            com.v2ray.ang.dto.V2rayConfig$RoutingBean r9 = r7.getRouting()
            java.util.ArrayList r9 = r9.getRules()
            r9.clear()
            r9 = 0
            r7.setDns(r9)
            r7.setFakedns(r9)
            r7.setStats(r9)
            r7.setPolicy(r9)
            java.util.ArrayList r1 = r7.getOutbounds()
            java.util.Iterator r1 = r1.iterator()
        L8a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9a
            java.lang.Object r2 = r1.next()
            com.v2ray.ang.dto.V2rayConfig$OutboundBean r2 = (com.v2ray.ang.dto.V2rayConfig.OutboundBean) r2
            r2.setMux(r9)
            goto L8a
        L9a:
            r9 = 1
            r0.setStatus(r9)
            java.lang.String r7 = defpackage.aj0.b(r7)
            if (r7 != 0) goto La6
            java.lang.String r7 = ""
        La6:
            r0.setContent(r7)
            r0.setGuid(r8)
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dm1.i(android.content.Context, java.lang.String, com.v2ray.ang.dto.ProfileItem):com.v2ray.ang.dto.ConfigResult");
    }

    public static V2rayConfig j(Context context) {
        String strZ = a;
        if (strZ == null) {
            Regex regex = ul1.a;
            strZ = ul1.z(context, "v2ray_config.json");
        }
        if (TextUtils.isEmpty(strZ)) {
            return null;
        }
        a = strZ;
        return (V2rayConfig) aj0.a(V2rayConfig.class, strZ);
    }

    public static void k(V2rayConfig.OutboundBean.StreamSettingsBean streamSettingsBean, ProfileItem profileItem, String str) {
        ArrayList arrayList;
        String security = profileItem.getSecurity();
        if (security == null) {
            security = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        boolean zA = yg0.a(profileItem.getInsecure(), Boolean.TRUE);
        String sni = profileItem.getSni();
        String sni2 = (sni == null || sni.length() == 0) ? str : profileItem.getSni();
        String fingerPrint = profileItem.getFingerPrint();
        String alpn = profileItem.getAlpn();
        String publicKey = profileItem.getPublicKey();
        String shortId = profileItem.getShortId();
        String spiderX = profileItem.getSpiderX();
        if (security.length() == 0) {
            security = null;
        }
        streamSettingsBean.setSecurity(security);
        if (streamSettingsBean.getSecurity() == null) {
            return;
        }
        if (sni2 == null || sni2.length() == 0) {
            sni2 = null;
        }
        String str2 = (fingerPrint == null || fingerPrint.length() == 0) ? null : fingerPrint;
        if (alpn == null || alpn.length() == 0) {
            arrayList = null;
        } else {
            List listO = g.O(alpn, new String[]{","}, 6);
            ArrayList arrayList2 = new ArrayList(c.l(listO, 10));
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                arrayList2.add(g.c0((String) it.next()).toString());
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
        }
        String str3 = (publicKey == null || publicKey.length() == 0) ? null : publicKey;
        V2rayConfig.OutboundBean.StreamSettingsBean.TlsSettingsBean tlsSettingsBean = new V2rayConfig.OutboundBean.StreamSettingsBean.TlsSettingsBean(zA, sni2, arrayList, null, null, null, null, str2, null, null, null, false, str3, (shortId == null || shortId.length() == 0) ? null : shortId, (spiderX == null || spiderX.length() == 0) ? null : spiderX, 3960, null);
        if (yg0.a(streamSettingsBean.getSecurity(), "tls")) {
            streamSettingsBean.setTlsSettings(tlsSettingsBean);
            streamSettingsBean.setRealitySettings(null);
        } else if (yg0.a(streamSettingsBean.getSecurity(), "reality")) {
            streamSettingsBean.setTlsSettings(null);
            streamSettingsBean.setRealitySettings(tlsSettingsBean);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.v2ray.ang.dto.V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean, java.lang.Boolean, java.lang.String, java.util.List, xu] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String l(com.v2ray.ang.dto.V2rayConfig.OutboundBean.StreamSettingsBean r31, com.v2ray.ang.dto.ProfileItem r32) {
        /*
            Method dump skipped, instruction units count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dm1.l(com.v2ray.ang.dto.V2rayConfig$OutboundBean$StreamSettingsBean, com.v2ray.ang.dto.ProfileItem):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m(com.v2ray.ang.dto.V2rayConfig.OutboundBean r11) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dm1.m(com.v2ray.ang.dto.V2rayConfig$OutboundBean):boolean");
    }
}
