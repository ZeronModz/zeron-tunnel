package defpackage;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.internal.ads.q3;
import com.google.android.gms.internal.ads.zzbgj$zzaf$zzd;
import com.google.android.gms.internal.ads.zzbgj$zzq;
import com.google.android.gms.internal.ads.zzehn;
import com.google.android.gms.internal.ads.zzehr;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class uo2 extends x {
    public static final SparseArray h;
    public final Context c;
    public final q3 d;
    public final TelephonyManager e;
    public final zzehr f;
    public zzbgj$zzq g;

    static {
        SparseArray sparseArray = new SparseArray();
        h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbgj$zzaf$zzd.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbgj$zzaf$zzd zzbgj_zzaf_zzd = zzbgj$zzaf$zzd.CONNECTING;
        sparseArray.put(iOrdinal, zzbgj_zzaf_zzd);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbgj_zzaf_zzd);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbgj_zzaf_zzd);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbgj$zzaf$zzd.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbgj$zzaf$zzd zzbgj_zzaf_zzd2 = zzbgj$zzaf$zzd.DISCONNECTED;
        sparseArray.put(iOrdinal2, zzbgj_zzaf_zzd2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbgj_zzaf_zzd2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbgj_zzaf_zzd2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbgj_zzaf_zzd2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbgj_zzaf_zzd2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbgj$zzaf$zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbgj_zzaf_zzd);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbgj_zzaf_zzd);
    }

    public uo2(Context context, q3 q3Var, zzehr zzehrVar, zzehn zzehnVar, zzj zzjVar) {
        super(zzehnVar, zzjVar);
        this.c = context;
        this.d = q3Var;
        this.f = zzehrVar;
        this.e = (TelephonyManager) context.getSystemService("phone");
    }
}
