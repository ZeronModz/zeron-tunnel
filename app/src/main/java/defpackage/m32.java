package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbju;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class m32 implements zzbju {
    public final /* synthetic */ SharedPreferences a;

    public m32(zzbhc zzbhcVar, SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final Boolean zza(String str, boolean z) {
        SharedPreferences sharedPreferences = this.a;
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, z));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(z)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final Long zzb(String str, long j) {
        SharedPreferences sharedPreferences = this.a;
        try {
            return Long.valueOf(sharedPreferences.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf(sharedPreferences.getInt(str, (int) j));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final Double zzc(String str, double d) {
        SharedPreferences sharedPreferences = this.a;
        try {
            return Double.valueOf(sharedPreferences.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(d)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final String zzd(String str, String str2) {
        return this.a.getString(str, str2);
    }
}
