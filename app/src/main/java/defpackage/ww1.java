package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.Topic;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.internal.ads.fb;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzecr;
import com.google.android.gms.internal.ads.zzefg;
import com.google.android.gms.internal.ads.zzete;
import com.google.android.gms.internal.ads.zzeul;
import com.google.android.gms.internal.ads.zzfch;
import com.google.android.gms.internal.ads.zzguf;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ww1 implements zzgyw {
    public static final /* synthetic */ ww1 b = new ww1(0);
    public static final /* synthetic */ ww1 c = new ww1(1);
    public static final /* synthetic */ ww1 d = new ww1(3);
    public static final /* synthetic */ ww1 e = new ww1(4);
    public static final /* synthetic */ ww1 f = new ww1(5);
    public static final /* synthetic */ ww1 g = new ww1(6);
    public static final /* synthetic */ ww1 h = new ww1(7);
    public static final /* synthetic */ ww1 i = new ww1(9);
    public static final /* synthetic */ ww1 j = new ww1(10);
    public static final /* synthetic */ ww1 k = new ww1(11);
    public static final /* synthetic */ ww1 l = new ww1(12);
    public static final /* synthetic */ ww1 m = new ww1(13);
    public static final /* synthetic */ ww1 n = new ww1(14);
    public final /* synthetic */ int a;

    public /* synthetic */ ww1(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final ListenableFuture zza(Object obj) throws IOException {
        switch (this.a) {
            case 0:
                return ((zzac) obj).zza();
            case 1:
                Throwable th = (Throwable) obj;
                if (((Boolean) zzbd.zzc().a(p32.Sb)).booleanValue()) {
                    zzt.zzh().h("GetTopicsApiWithRecordObservationActionHandlerUnsampled", th);
                } else {
                    zzt.zzh().g(th, "GetTopicsApiWithRecordObservationActionHandler");
                }
                return z.j(new GetTopicsResponse(zzguf.zzi()));
            case 2:
                zze.zzb("Error during loading assets.", (Exception) obj);
                return u33.b;
            case 3:
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return z.v(cause);
            case 4:
                return z.v(new zzecr(5));
            case 5:
                return z.j(((zzefg) obj).a);
            case 6:
                return u33.b;
            case 7:
                Throwable cause2 = (ExecutionException) obj;
                if (cause2.getCause() != null) {
                    cause2 = cause2.getCause();
                }
                return z.v(cause2);
            case 8:
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                g3.a.execute(new qj2(12, (InputStream) obj, parcelFileDescriptorArrCreatePipe[1]));
                return z.j(parcelFileDescriptor);
            case 9:
                return ((Throwable) obj) instanceof TimeoutException ? z.j(new zzete(Integer.toString(17))) : z.j(new zzete(null));
            case 10:
                return z.j(new zzete((String) obj));
            case 11:
                AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                return appSetIdInfo == null ? z.j(new zzeul(null, -1)) : z.j(new zzeul(appSetIdInfo.a, appSetIdInfo.b));
            case 12:
                GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
                if (getTopicsResponse == null) {
                    return z.j(new ys2(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 1));
                }
                ae3 ae3VarV = gb.v();
                for (Topic topic : getTopicsResponse.a) {
                    zd3 zd3VarV = fb.v();
                    int i2 = topic.c;
                    zd3VarV.d();
                    ((fb) zd3VarV.b).w(i2);
                    long j2 = topic.b;
                    zd3VarV.d();
                    ((fb) zd3VarV.b).x(j2);
                    long j3 = topic.a;
                    zd3VarV.d();
                    ((fb) zd3VarV.b).y(j3);
                    fb fbVar = (fb) zd3VarV.e();
                    ae3VarV.d();
                    ((gb) ae3VarV.b).w(fbVar);
                }
                return z.j(new ys2(Base64.encodeToString(((gb) ae3VarV.e()).a(), 1), 1));
            case 13:
                AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                return appSetIdInfo2 == null ? z.j(new zzfch(null, -1)) : z.j(new zzfch(appSetIdInfo2.a, appSetIdInfo2.b));
            case 14:
                return u33.b;
            default:
                return z.j(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
    }
}
