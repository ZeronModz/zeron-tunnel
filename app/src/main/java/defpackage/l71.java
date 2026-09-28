package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.dto.Language;
import com.v2ray.ang.dto.ProfileItem;
import com.v2ray.ang.dto.RoutingType;
import com.v2ray.ang.dto.RulesetItem;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.collections.b;
import kotlin.collections.c;
import kotlin.text.Regex;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l71 {
    public static List a() {
        Lazy lazy = zq0.a;
        String strD = zq0.z().d("pref_domestic_dns");
        if (strD == null) {
            strD = "223.5.5.5";
        }
        List listO = g.O(strD, new String[]{","}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO) {
            String str = (String) obj;
            Regex regex = ul1.a;
            if (ul1.u(str) || ul1.q(str)) {
                arrayList.add(obj);
            }
        }
        return arrayList.isEmpty() ? c.z("223.5.5.5") : arrayList;
    }

    public static Locale b() {
        Lazy lazy = zq0.a;
        String strD = zq0.z().d("pref_language");
        if (strD == null) {
            strD = Language.AUTO.getCode();
        }
        switch (k71.a[Language.INSTANCE.fromCode(strD).ordinal()]) {
            case 1:
                Regex regex = ul1.a;
                return ul1.n();
            case 2:
                Locale locale = Locale.ENGLISH;
                locale.getClass();
                return locale;
            case 3:
                Locale locale2 = Locale.CHINA;
                locale2.getClass();
                return locale2;
            case 4:
                Locale locale3 = Locale.TRADITIONAL_CHINESE;
                locale3.getClass();
                return locale3;
            case 5:
                return new Locale("vi");
            case 6:
                return new Locale("ru");
            case 7:
                return new Locale("fa");
            case 8:
                return new Locale("ar");
            case 9:
                return new Locale("bn");
            case 10:
                return new Locale("bqi", "IR");
            default:
                p60.b();
                return null;
        }
    }

    public static ArrayList c(Context context, int i) {
        String fileName = RoutingType.INSTANCE.fromIndex(i).getFileName();
        Regex regex = ul1.a;
        String strZ = ul1.z(context, fileName);
        if (TextUtils.isEmpty(strZ)) {
            return null;
        }
        return b.x((Object[]) aj0.a(RulesetItem[].class, strZ));
    }

    public static List d() {
        Lazy lazy = zq0.a;
        String strD = zq0.z().d("pref_remote_dns");
        if (strD == null) {
            strD = "1.1.1.1";
        }
        List listO = g.O(strD, new String[]{","}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO) {
            String str = (String) obj;
            Regex regex = ul1.a;
            if (ul1.u(str) || ul1.q(str)) {
                arrayList.add(obj);
            }
        }
        return arrayList.isEmpty() ? c.z("1.1.1.1") : arrayList;
    }

    public static ProfileItem e(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Lazy lazy = zq0.a;
        for (String str2 : zq0.f()) {
            Lazy lazy2 = zq0.a;
            ProfileItem profileItemE = zq0.e(str2);
            if (profileItemE != null && yg0.a(profileItemE.getRemarks(), str)) {
                return profileItemE;
            }
        }
        return null;
    }

    public static void f(Context context, AssetManager assetManager) {
        context.getClass();
        assetManager.getClass();
        Regex regex = ul1.a;
        String strE = ul1.E(context);
        try {
            String[] strArr = {"geosite.dat", "geoip.dat"};
            String[] list = assetManager.list(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    if (b.c(str, strArr)) {
                        arrayList.add(str);
                    }
                }
                ArrayList<String> arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!new File(strE, (String) obj).exists()) {
                        arrayList2.add(obj);
                    }
                }
                for (String str2 : arrayList2) {
                    File file = new File(strE, str2);
                    InputStream inputStreamOpen = assetManager.open(str2);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            inputStreamOpen.getClass();
                            mu.h(inputStreamOpen, fileOutputStream);
                            fileOutputStream.close();
                            inputStreamOpen.close();
                            file.getAbsolutePath();
                        } finally {
                        }
                    } finally {
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static boolean g(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            ArrayList arrayListX = b.x((Object[]) aj0.a(RulesetItem[].class, str));
            if (arrayListX.isEmpty()) {
                return false;
            }
            h(arrayListX);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Lazy lazy = zq0.a;
        ArrayList<RulesetItem> arrayListC = zq0.c();
        if (arrayListC != null) {
            for (RulesetItem rulesetItem : arrayListC) {
                if (yg0.a(rulesetItem.getLocked(), Boolean.TRUE)) {
                    arrayList2.add(rulesetItem);
                }
            }
        }
        arrayList2.addAll(arrayList);
        Lazy lazy2 = zq0.a;
        zq0.k(arrayList2);
    }
}
