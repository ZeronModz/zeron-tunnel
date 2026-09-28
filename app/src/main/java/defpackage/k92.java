package defpackage;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k92 {
    public static final ImmutableSet a = ImmutableSet.of("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    public static final ImmutableList b = ImmutableList.of("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    public static final ImmutableList c = ImmutableList.of("auto", "app", "am");
    public static final ImmutableList d = ImmutableList.of("_r", "_dbg");
    public static final ImmutableList e;
    public static final ImmutableList f;

    static {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.c0(cn0.r);
        builder.c0(cn0.s);
        e = builder.f0();
        f = ImmutableList.of("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str) {
        return !c.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(String str, Bundle bundle) {
        if (b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        ImmutableList immutableList = d;
        int size = immutableList.size();
        int i = 0;
        while (i < size) {
            boolean zContainsKey = bundle.containsKey((String) immutableList.get(i));
            i++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (e.contains(str2)) {
            return false;
        }
        ImmutableList immutableList = f;
        int size = immutableList.size();
        int i = 0;
        while (i < size) {
            boolean zMatches = str2.matches((String) immutableList.get(i));
            i++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(String str, Bundle bundle, String str2) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        ImmutableList immutableList = d;
        int size = immutableList.size();
        int i = 0;
        while (i < size) {
            boolean zContainsKey = bundle.containsKey((String) immutableList.get(i));
            i++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals("fiam")) {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            } else if (str.equals("fdl")) {
                bundle.putString("_cis", "fdl_integration");
                return true;
            }
        } else if (str.equals("fcm")) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        return false;
    }
}
