package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ea2 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final Context a;
    public final SharedPreferences b;
    public final zzg c;
    public String d = "-1";
    public int e = -1;

    public ea2(Context context, zzg zzgVar) {
        this.b = PreferenceManager.getDefaultSharedPreferences(context);
        this.c = zzgVar;
        this.a = context;
    }

    public final void a(int i, String str) {
        Context context;
        boolean z = true;
        if (!((Boolean) zzbd.zzc().a(p32.f1)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z = false;
        }
        this.c.zzw(z);
        if (((Boolean) zzbd.zzc().a(p32.f7)).booleanValue() && z && (context = this.a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            if (((Boolean) zzbd.zzc().a(p32.h1)).booleanValue()) {
                boolean zEquals = Objects.equals(str, "gad_has_consent_for_cookies");
                Context context = this.a;
                zzg zzgVar = this.c;
                if (zEquals) {
                    int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    if (i != zzgVar.zzD()) {
                        zzgVar.zzw(true);
                        zzac.zza(context);
                    }
                    zzgVar.zzC(i);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    if (!Objects.equals(string, zzgVar.zzB())) {
                        zzgVar.zzw(true);
                        zzac.zza(context);
                    }
                    zzgVar.zzA(string);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i2 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String strValueOf = String.valueOf(str);
            int iHashCode = strValueOf.hashCode();
            if (iHashCode == -2004976699) {
                if (!strValueOf.equals("IABTCF_PurposeConsents") || string2.equals("-1") || this.d.equals(string2)) {
                    return;
                }
                this.d = string2;
                a(i2, string2);
                return;
            }
            if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
                if (!((Boolean) zzbd.zzc().a(p32.f1)).booleanValue() || i2 == -1 || this.e == i2) {
                    return;
                }
                this.e = i2;
                a(i2, string2);
            }
        } catch (Throwable th) {
            zzt.zzh().f("AdMobPlusIdlessListener.onSharedPreferenceChanged", th);
            zze.zzb("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }
}
