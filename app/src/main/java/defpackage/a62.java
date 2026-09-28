package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbkd;
import com.google.android.gms.internal.ads.zzdrr;
import com.google.android.gms.internal.ads.zzfae;
import com.google.android.gms.internal.ads.zzgqt;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a62 implements zzgqt {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ a62(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    public final /* synthetic */ Object apply(Object obj) {
        int i = this.a;
        String strReplace = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                y52 y52Var = f62.a;
                if (str == null) {
                    return strReplace;
                }
                if (((Boolean) j42.f.g()).booleanValue()) {
                    String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                    String host = Uri.parse(strReplace).getHost();
                    for (int i2 = 0; i2 < 3; i2++) {
                        if (!host.endsWith(strArr[i2])) {
                        }
                    }
                    return strReplace;
                }
                String str2 = (String) j42.a.g();
                String str3 = (String) j42.b.g();
                if (!TextUtils.isEmpty(str2)) {
                    strReplace = strReplace.replace(str2, str);
                }
                if (TextUtils.isEmpty(str3)) {
                    return strReplace;
                }
                Uri uri = Uri.parse(strReplace);
                return TextUtils.isEmpty(uri.getQueryParameter(str3)) ? uri.buildUpon().appendQueryParameter(str3, str).toString() : strReplace;
            case 1:
                Throwable th = (Throwable) obj;
                y52 y52Var2 = f62.a;
                if (((Boolean) j42.i.g()).booleanValue()) {
                    zzt.zzh().f("prepareClickUrl.attestation2", th);
                }
                return strReplace;
            case 2:
                return new zzdrr(strReplace, (zzbkd) obj);
            default:
                Throwable th2 = (Throwable) obj;
                zzfae zzfaeVar = ms2.k;
                zzo.zzf("Error calling adapter: ".concat(String.valueOf(strReplace)));
                if (((Boolean) zzbd.zzc().a(p32.ze)).booleanValue()) {
                    zzt.zzh().g(th2, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(strReplace)));
                    return null;
                }
                zzt.zzh().f("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(strReplace)), th2);
                return null;
        }
    }
}
