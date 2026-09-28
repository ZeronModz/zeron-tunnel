package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.a;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zl implements TransportBackend {
    public final rb0 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final Clock e;
    public final Clock f;

    public zl(Context context, Clock clock, Clock clock2) {
        JsonDataEncoderBuilder jsonDataEncoderBuilder = new JsonDataEncoderBuilder();
        i60.c.configure(jsonDataEncoderBuilder);
        jsonDataEncoderBuilder.d = true;
        this.a = new rb0(jsonDataEncoderBuilder, 10);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = a(CCTDestination.c);
        this.e = clock2;
        this.f = clock;
    }

    public static URL a(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(vh.l("Invalid url: ", str), e);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public final EventInternal decorate(EventInternal eventInternal) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        a aVarM = eventInternal.m();
        ((HashMap) aVarM.b()).put("sdk-version", String.valueOf(Build.VERSION.SDK_INT));
        aVarM.a("model", Build.MODEL);
        aVarM.a("hardware", Build.HARDWARE);
        aVarM.a("device", Build.DEVICE);
        aVarM.a("product", Build.PRODUCT);
        aVarM.a("os-uild", Build.ID);
        aVarM.a("manufacturer", Build.MANUFACTURER);
        aVarM.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        ((HashMap) aVarM.b()).put("tz-offset", String.valueOf(TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        ((HashMap) aVarM.b()).put("net-type", String.valueOf(activeNetworkInfo == null ? NetworkConnectionInfo.NetworkType.NONE.getValue() : activeNetworkInfo.getType()));
        int i = -1;
        if (activeNetworkInfo == null) {
            subtype = NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = NetworkConnectionInfo.MobileSubtype.COMBINED.getValue();
            } else if (NetworkConnectionInfo.MobileSubtype.forNumber(subtype) == null) {
                subtype = 0;
            }
        }
        ((HashMap) aVarM.b()).put("mobile-subtype", String.valueOf(subtype));
        aVarM.a("country", Locale.getDefault().getCountry());
        aVarM.a("locale", Locale.getDefault().getLanguage());
        Context context = this.c;
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        aVarM.a("mcc_mnc", simOperator);
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.isLoggable(if3.x("CctTransportBackend"), 6);
        }
        aVarM.a("application_build", Integer.toString(i));
        return aVarM.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x02d3, code lost:
    
        r8.f = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02d7, code lost:
    
        if (r8.a != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02d9, code lost:
    
        r7 = " requestTimeMs";
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02dd, code lost:
    
        if (r8.b != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02df, code lost:
    
        r7 = r7.concat(" requestUptimeMs");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02e9, code lost:
    
        if (r7.isEmpty() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02eb, code lost:
    
        r2.add(new defpackage.ub(r8.a.longValue(), r8.b.longValue(), r8.c, r8.d, r8.e, r8.f, r8.g));
        r1 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0313, code lost:
    
        defpackage.u7.p("Missing required properties:".concat(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x031a, code lost:
    
        return null;
     */
    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.datatransport.runtime.backends.BackendResponse send(com.google.android.datatransport.runtime.backends.BackendRequest r28) {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zl.send(com.google.android.datatransport.runtime.backends.BackendRequest):com.google.android.datatransport.runtime.backends.BackendResponse");
    }
}
