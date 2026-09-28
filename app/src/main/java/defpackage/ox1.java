package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.internal.ads.c7;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzalc;
import com.google.android.gms.internal.ads.zzbkd;
import com.google.android.gms.internal.ads.zzcbz;
import com.google.android.gms.internal.ads.zzcwn;
import com.google.android.gms.internal.ads.zzcz;
import com.google.android.gms.internal.ads.zzdoc;
import com.google.android.gms.internal.ads.zzdrr;
import com.google.android.gms.internal.ads.zzeuf;
import com.google.android.gms.internal.ads.zzeul;
import com.google.android.gms.internal.ads.zzfcd;
import com.google.android.gms.internal.ads.zzfda;
import com.google.android.gms.internal.ads.zzfdo;
import com.google.android.gms.internal.ads.zzfjd;
import com.google.android.gms.internal.ads.zzgqt;
import com.google.android.gms.internal.ads.zzx;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ox1 implements zzgqt {
    public final /* synthetic */ int a;
    public static final /* synthetic */ ox1 b = new ox1(1);
    public static final /* synthetic */ ox1 c = new ox1(2);
    public static final /* synthetic */ ox1 d = new ox1(3);
    public static final /* synthetic */ ox1 e = new ox1(4);
    public static final /* synthetic */ ox1 f = new ox1(5);
    public static final /* synthetic */ ox1 g = new ox1(6);
    public static final /* synthetic */ ox1 h = new ox1(7);
    public static final /* synthetic */ ox1 i = new ox1(8);
    public static final /* synthetic */ ox1 j = new ox1(9);
    public static final /* synthetic */ ox1 k = new ox1(10);
    public static final /* synthetic */ ox1 l = new ox1(11);
    public static final /* synthetic */ ox1 m = new ox1(12);
    public static final /* synthetic */ ox1 n = new ox1(13);
    public static final /* synthetic */ ox1 o = new ox1(14);
    public static final /* synthetic */ ox1 p = new ox1(15);
    public static final /* synthetic */ ox1 q = new ox1(16);
    public static final /* synthetic */ ox1 r = new ox1(17);
    public static final /* synthetic */ ox1 s = new ox1(19);
    public static final /* synthetic */ ox1 t = new ox1(20);
    public static final /* synthetic */ ox1 u = new ox1(21);
    public static final /* synthetic */ ox1 v = new ox1(22);
    public static final /* synthetic */ ox1 w = new ox1(23);
    public static final /* synthetic */ ox1 x = new ox1(24);
    public static final /* synthetic */ ox1 y = new ox1(25);
    public static final /* synthetic */ ox1 z = new ox1(26);
    public static final /* synthetic */ ox1 A = new ox1(27);
    public static final /* synthetic */ ox1 B = new ox1(28);
    public static final /* synthetic */ ox1 C = new ox1(29);

    public /* synthetic */ ox1(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return (zzalc) obj;
            case 1:
                return (zzalc) obj;
            case 2:
                int i2 = zzau.zze;
                return ((JSONObject) obj).optString("nas");
            case 3:
                int i3 = zzau.zze;
                zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (Exception) obj);
                return null;
            case 4:
                Throwable th = (Throwable) obj;
                y52 y52Var = f62.a;
                if (((Boolean) j42.i.g()).booleanValue()) {
                    zzt.zzh().f("prepareClickUrl.attestation1", th);
                }
                return "failure_click_attok";
            case 5:
                List list = zzcbz.l;
                return null;
            case 6:
                return "failure_click_attok";
            case 7:
                return new zzcwn((jg2) obj);
            case 8:
                return new zzcwn((List) obj);
            case 9:
                c7 c7Var = zzcz.a;
                return Integer.valueOf(((og2) obj).p);
            case 10:
                ArrayList arrayList = new ArrayList();
                for (zzbkd zzbkdVar : (List) obj) {
                    if (zzbkdVar != null) {
                        arrayList.add(zzbkdVar);
                    }
                }
                return arrayList;
            case 11:
                ArrayList arrayList2 = new ArrayList();
                for (zzdrr zzdrrVar : (List) obj) {
                    if (zzdrrVar != null) {
                        arrayList2.add(zzdrrVar);
                    }
                }
                return arrayList2;
            case 12:
                return Collections.singletonList(z.j((zzdoc) obj));
            case 13:
                ArrayList arrayList3 = (ArrayList) obj;
                return new zzeuf(true != arrayList3.isEmpty() ? arrayList3 : null);
            case 14:
                AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                return new zzeul(appSetIdInfo.a, appSetIdInfo.b);
            case 15:
                return new zzfcd((String) obj);
            case 16:
                return new zzfda((Bundle) obj);
            case 17:
                return new zzfdo((String) obj);
            case 18:
                return null;
            case 19:
                return (lt2) obj;
            case 20:
                String str = ((zzfjd) obj).b;
                return TextUtils.isEmpty(str) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzl.zzj() ? "fakeForAdDebugLog" : str;
            case 21:
                String str2 = ((zzfjd) obj).a;
                return TextUtils.isEmpty(str2) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzl.zzj() ? "fakeForAdDebugLog" : str2;
            case 22:
                return null;
            case 23:
                return null;
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                return Boolean.FALSE;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                return null;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                return null;
            case 27:
                return null;
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                return null;
            default:
                zzx zzxVar = (zzx) obj;
                int i4 = yk3.N;
                String str3 = zzxVar.a;
                String str4 = zzxVar.b;
                return vh.t(new StringBuilder(String.valueOf(str3).length() + 2 + String.valueOf(str4).length()), str3, ": ", str4);
        }
    }
}
