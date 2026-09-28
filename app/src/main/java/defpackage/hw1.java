package defpackage;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzgzl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hw1 implements zzgzl {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbyh b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ zzau d;

    public /* synthetic */ hw1(zzau zzauVar, zzbyh zzbyhVar, boolean z, int i) {
        this.a = i;
        this.b = zzbyhVar;
        this.c = z;
        this.d = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        int i = this.a;
        zzbyh zzbyhVar = this.b;
        switch (i) {
            case 0:
                try {
                    String message = th.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                    sb.append("Internal error: ");
                    sb.append(message);
                    zzbyhVar.zzf(sb.toString());
                } catch (RemoteException e) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                }
                break;
            default:
                try {
                    String message2 = th.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 16);
                    sb2.append("Internal error: ");
                    sb2.append(message2);
                    zzbyhVar.zzf(sb2.toString());
                } catch (RemoteException e2) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e2);
                    return;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public final /* bridge */ /* synthetic */ void mo5zzb(Object obj) {
        int i = this.a;
        boolean z = this.c;
        zzbyh zzbyhVar = this.b;
        zzau zzauVar = this.d;
        switch (i) {
            case 0:
                ArrayList<Uri> arrayList = (ArrayList) obj;
                try {
                    zzbyhVar.zze(arrayList);
                    if (zzauVar.zzC() || z) {
                        for (Uri uri : arrayList) {
                            if (zzauVar.zzc(uri)) {
                                zzauVar.zzB().b(zzau.zzZ(uri, zzauVar.zzM(), "1").toString(), null, null, null);
                            } else {
                                if (((Boolean) zzbd.zzc().a(p32.u8)).booleanValue()) {
                                    zzauVar.zzB().b(uri.toString(), null, null, null);
                                }
                            }
                            break;
                        }
                    }
                } catch (RemoteException e) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                    return;
                }
                break;
            default:
                List<Uri> list = (List) obj;
                try {
                    zzauVar.zzw(list);
                    zzbyhVar.zze(list);
                    if (zzauVar.zzD() || z) {
                        for (Uri uri2 : list) {
                            if (zzauVar.zzd(uri2)) {
                                zzauVar.zzB().b(zzau.zzZ(uri2, zzauVar.zzM(), "1").toString(), null, null, null);
                            } else {
                                if (((Boolean) zzbd.zzc().a(p32.u8)).booleanValue()) {
                                    zzauVar.zzB().b(uri2.toString(), null, null, null);
                                }
                            }
                            break;
                        }
                    }
                } catch (RemoteException e2) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e2);
                }
                break;
        }
    }
}
