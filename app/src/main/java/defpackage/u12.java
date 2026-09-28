package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.zzbfq;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class u12 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<u12> CREATOR = new zzbfq();
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final Bundle f;
    public final boolean g;
    public long h;
    public String i;
    public int j;

    public u12(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2, String str5, int i) {
        this.a = str;
        this.b = j;
        this.c = str2 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str2;
        this.d = str3 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str3;
        this.e = str4 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str4;
        this.f = bundle == null ? new Bundle() : bundle;
        this.g = z;
        this.h = j2;
        this.i = str5;
        this.j = i;
    }

    public static u12 a(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 51);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                zzo.zzi(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new u12(queryParameter, j, host, str, str2, bundle, zEquals, 0L, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0);
        } catch (NullPointerException e) {
            e = e;
            zzo.zzj("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e2) {
            e = e2;
            zzo.zzj("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = n8.V(20293, parcel);
        n8.G(parcel, 2, this.a);
        n8.P(parcel, 3, 8);
        parcel.writeLong(this.b);
        n8.G(parcel, 4, this.c);
        n8.G(parcel, 5, this.d);
        n8.G(parcel, 6, this.e);
        n8.A(parcel, 7, this.f);
        n8.P(parcel, 8, 4);
        parcel.writeInt(this.g ? 1 : 0);
        long j = this.h;
        n8.P(parcel, 9, 8);
        parcel.writeLong(j);
        n8.G(parcel, 10, this.i);
        int i2 = this.j;
        n8.P(parcel, 11, 4);
        parcel.writeInt(i2);
        n8.e0(iV, parcel);
    }
}
