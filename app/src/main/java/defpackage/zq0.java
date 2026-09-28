package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import com.tencent.mmkv.MMKV;
import com.v2ray.ang.dto.AssetUrlItem;
import com.v2ray.ang.dto.ProfileItem;
import com.v2ray.ang.dto.RulesetItem;
import com.v2ray.ang.dto.ServerAffiliationInfo;
import com.v2ray.ang.dto.SubscriptionItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.c;
import kotlin.collections.b;
import kotlin.text.Regex;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zq0 {
    public static final Lazy a = c.b(new yq0(0));
    public static final Lazy b = c.b(new yq0(1));
    public static final Lazy c = c.b(new yq0(2));
    public static final Lazy d = c.b(new yq0(3));
    public static final Lazy e = c.b(new yq0(4));
    public static final Lazy f = c.b(new yq0(5));
    public static final Lazy g = c.b(new yq0(6));
    public static final Lazy h = c.b(new yq0(7));

    public static MMKV A() {
        return (MMKV) e.getValue();
    }

    public static long B() {
        return u().c(3600000L, "TimeLeft");
    }

    public static String C() {
        return A().d("USER_SELECTED_NETWORK");
    }

    public static String D() {
        return A().d("USER_SELECTED_SERVER");
    }

    public static int E(String str) {
        str.getClass();
        if (str.length() > 0) {
            ServerAffiliationInfo serverAffiliationInfoD = d(str);
            if (serverAffiliationInfoD != null && serverAffiliationInfoD.getTestDelayMillis() < 0) {
                F(str);
                return 1;
            }
        } else {
            String[] strArrA = y().a();
            if (strArrA != null) {
                int i = 0;
                for (String str2 : strArrA) {
                    str2.getClass();
                    ServerAffiliationInfo serverAffiliationInfoD2 = d(str2);
                    if (serverAffiliationInfoD2 != null && serverAffiliationInfoD2.getTestDelayMillis() < 0) {
                        F(str2);
                        i++;
                    }
                }
                return i;
            }
        }
        return 0;
    }

    public static void F(String str) {
        str.getClass();
        if (g.B(str)) {
            return;
        }
        if (yg0.a(x(), str)) {
            v().o("SELECTED_SERVER");
        }
        ArrayList arrayListF = f();
        arrayListF.remove(str);
        m(arrayListF);
        w().o(str);
        y().o(str);
    }

    public static void G(String str) {
        String[] strArrA;
        str.getClass();
        if (g.B(str) || (strArrA = w().a()) == null) {
            return;
        }
        for (String str2 : strArrA) {
            str2.getClass();
            ProfileItem profileItemE = e(str2);
            if (profileItemE != null && yg0.a(profileItemE.getSubscriptionId(), str)) {
                F(str2);
            }
        }
    }

    public static void H(String str) {
        str.getClass();
        u().i("Proto", str);
    }

    public static void I(String str) {
        str.getClass();
        A().i("USER_SELECTED_NETWORK", str);
    }

    public static void J(String str) {
        str.getClass();
        A().i("USER_SELECTED_SERVER", str);
    }

    public static void a(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                ServerAffiliationInfo serverAffiliationInfoD = d(str);
                if (serverAffiliationInfoD != null) {
                    serverAffiliationInfoD.setTestDelayMillis(0L);
                    y().i(str, aj0.a.g(serverAffiliationInfoD));
                }
            }
        }
    }

    public static List b() {
        ArrayList arrayList = new ArrayList();
        String[] strArrA = r().a();
        if (strArrA != null) {
            for (String str : strArrA) {
                String strD = r().d(str);
                if (strD != null && !g.B(strD)) {
                    arrayList.add(new Pair(str, aj0.a(AssetUrlItem.class, strD)));
                }
            }
        }
        return kotlin.collections.c.N(arrayList, new Comparator() { // from class: com.v2ray.ang.handler.MmkvManager$decodeAssetUrls$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return kotlin.comparisons.a.a(Long.valueOf(((AssetUrlItem) ((Pair) obj).component2()).getAddedTime()), Long.valueOf(((AssetUrlItem) ((Pair) obj2).component2()).getAddedTime()));
            }
        });
    }

    public static ArrayList c() {
        String strD = z().d("pref_routing_ruleset");
        if (strD == null || strD.length() == 0) {
            return null;
        }
        return b.x((Object[]) aj0.a(RulesetItem[].class, strD));
    }

    public static ServerAffiliationInfo d(String str) {
        String strD;
        str.getClass();
        if (g.B(str) || (strD = y().d(str)) == null || g.B(strD)) {
            return null;
        }
        return (ServerAffiliationInfo) aj0.a(ServerAffiliationInfo.class, strD);
    }

    public static ProfileItem e(String str) {
        String strD;
        str.getClass();
        if (g.B(str) || (strD = w().d(str)) == null || g.B(strD)) {
            return null;
        }
        return (ProfileItem) aj0.a(ProfileItem.class, strD);
    }

    public static ArrayList f() {
        String strD = v().d("ANG_CONFIGS");
        return (strD == null || g.B(strD)) ? new ArrayList() : b.x((Object[]) aj0.a(String[].class, strD));
    }

    public static ArrayList g() {
        String strD = v().d("SUB_IDS");
        return (strD == null || g.B(strD)) ? new ArrayList() : b.x((Object[]) aj0.a(String[].class, strD));
    }

    public static SubscriptionItem h(String str) {
        str.getClass();
        String strD = A().d(str);
        if (strD == null) {
            return null;
        }
        return (SubscriptionItem) aj0.a(SubscriptionItem.class, strD);
    }

    public static ArrayList i() {
        ArrayList arrayListG = g();
        if (arrayListG.isEmpty()) {
            String[] strArrA = A().a();
            if (strArrA != null) {
                for (String str : strArrA) {
                    str.getClass();
                    arrayListG.add(str);
                }
            }
            p(arrayListG);
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : g()) {
            String strD = A().d(str2);
            if (strD != null && !g.B(strD)) {
                arrayList.add(new Pair(str2, aj0.a(SubscriptionItem.class, strD)));
            }
        }
        return arrayList;
    }

    public static void j(String str, AssetUrlItem assetUrlItem) {
        str.getClass();
        if (g.B(str)) {
            Regex regex = ul1.a;
            str = ul1.o();
        }
        r().i(str, aj0.a.g(assetUrlItem));
    }

    public static void k(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            z().i("pref_routing_ruleset", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        } else {
            z().i("pref_routing_ruleset", aj0.a.g(arrayList));
        }
    }

    public static String l(String str, ProfileItem profileItem) {
        str.getClass();
        if (g.B(str)) {
            Regex regex = ul1.a;
            str = ul1.o();
        }
        w().i(str, aj0.a.g(profileItem));
        ArrayList arrayListF = f();
        if (!arrayListF.contains(str)) {
            arrayListF.add(0, str);
            m(arrayListF);
            String strX = x();
            if (strX == null || g.B(strX)) {
                v().i("SELECTED_SERVER", str);
            }
        }
        return str;
    }

    public static void m(List list) {
        list.getClass();
        v().i("ANG_CONFIGS", aj0.a.g(list));
    }

    public static void n(String str, String str2) {
        str.getClass();
        str2.getClass();
        ((MMKV) c.getValue()).i(str, str2);
    }

    public static void o(long j, String str) {
        str.getClass();
        if (g.B(str)) {
            return;
        }
        ServerAffiliationInfo serverAffiliationInfoD = d(str);
        if (serverAffiliationInfoD == null) {
            serverAffiliationInfoD = new ServerAffiliationInfo(0L, 1, null);
        }
        serverAffiliationInfoD.setTestDelayMillis(j);
        y().i(str, aj0.a.g(serverAffiliationInfoD));
    }

    public static void p(ArrayList arrayList) {
        v().i("SUB_IDS", aj0.a.g(arrayList));
    }

    public static void q(String str, SubscriptionItem subscriptionItem) {
        str.getClass();
        if (g.B(str)) {
            Regex regex = ul1.a;
            str = ul1.o();
        }
        A().i(str, aj0.a.g(subscriptionItem));
        ArrayList arrayListG = g();
        if (arrayListG.contains(str)) {
            return;
        }
        arrayListG.add(str);
        p(arrayListG);
    }

    public static MMKV r() {
        return (MMKV) f.getValue();
    }

    public static String s() {
        String strD = u().d("BoostedServer");
        return strD == null ? "[]" : strD;
    }

    public static boolean t() {
        return u().b("COnfigSwitch", false);
    }

    public static MMKV u() {
        return (MMKV) h.getValue();
    }

    public static MMKV v() {
        return (MMKV) a.getValue();
    }

    public static MMKV w() {
        return (MMKV) b.getValue();
    }

    public static String x() {
        return v().d("SELECTED_SERVER");
    }

    public static MMKV y() {
        return (MMKV) d.getValue();
    }

    public static MMKV z() {
        return (MMKV) g.getValue();
    }
}
