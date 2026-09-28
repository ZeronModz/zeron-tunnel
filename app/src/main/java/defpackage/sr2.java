package defpackage;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzdah;
import com.google.android.gms.internal.ads.zzfav;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class sr2 implements zzfav {
    public final Integer a;

    public sr2(Integer num) {
        this.a = num;
    }

    public static /* synthetic */ sr2 a(VersionInfoParcel versionInfoParcel) {
        if (!((Boolean) zzbd.zzc().a(p32.yb)).booleanValue()) {
            return new sr2(null);
        }
        zzt.zzc();
        int extensionVersion = 0;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
                if (((Boolean) zzbd.zzc().a(p32.Bb)).booleanValue()) {
                    if (versionInfoParcel.clientJarVersion >= ((Integer) zzbd.zzc().a(p32.Ab)).intValue() && i >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                        extensionVersion = SdkExtensions.getExtensionVersion(31);
                    }
                }
            } else {
                extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            }
        } catch (Exception e) {
            zzt.zzh().f("AdUtil.getAdServicesExtensionVersion", e);
        }
        return new sr2(Integer.valueOf(extensionVersion));
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzdah zzdahVar = (zzdah) obj;
        Integer num = this.a;
        if (num != null) {
            zzdahVar.a.putInt("aos", num.intValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final void zzb(Object obj) {
    }
}
