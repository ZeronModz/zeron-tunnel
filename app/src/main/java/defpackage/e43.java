package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdin;
import com.google.android.gms.internal.ads.zzfxz;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.zxing.common.ECIInput;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class e43 implements ECIInput, zzgzl, zzfxz, zzdhc {
    public static final e43 c;
    public static final e43 d;
    public static final e43 e;
    public static final e43 f;
    public static final e43 g;
    public static final e43 h;
    public static final e43 i;
    public static final e43 j;
    public static final e43 k;
    public static final e43 l;
    public static final e43 m;
    public static final e43 n;
    public static final e43 o;
    public static final e43 p;
    public static final e43 q;
    public static final e43 r;
    public static final e43 s;
    public static final e43 t;
    public static final e43 u;
    public final /* synthetic */ int a;
    public String b;

    static {
        int i2 = 0;
        c = new e43("ENABLED", i2);
        d = new e43("DISABLED", i2);
        e = new e43("DESTROYED", i2);
        int i3 = 1;
        f = new e43("TINK", i3);
        g = new e43("CRUNCHY", i3);
        h = new e43("NO_PREFIX", i3);
        int i4 = 2;
        i = new e43("TINK", i4);
        j = new e43("CRUNCHY", i4);
        k = new e43("NO_PREFIX", i4);
        int i5 = 3;
        l = new e43("TINK", i5);
        m = new e43("NO_PREFIX", i5);
        int i6 = 4;
        n = new e43("TINK", i6);
        o = new e43("CRUNCHY", i6);
        p = new e43("LEGACY", i6);
        q = new e43("NO_PREFIX", i6);
        int i7 = 5;
        r = new e43("TINK", i7);
        s = new e43("CRUNCHY", i7);
        t = new e43("LEGACY", i7);
        u = new e43("NO_PREFIX", i7);
    }

    public /* synthetic */ e43(String str, int i2) {
        this.a = i2;
        this.b = str;
    }

    @Override // com.google.zxing.common.ECIInput
    public char charAt(int i2) {
        return this.b.charAt(i2);
    }

    @Override // com.google.zxing.common.ECIInput
    public int getECIValue(int i2) {
        return -1;
    }

    @Override // com.google.zxing.common.ECIInput
    public boolean haveNCharacters(int i2, int i3) {
        return i2 + i3 <= this.b.length();
    }

    @Override // com.google.zxing.common.ECIInput
    public boolean isECI(int i2) {
        return false;
    }

    @Override // com.google.zxing.common.ECIInput
    public int length() {
        return this.b.length();
    }

    @Override // com.google.zxing.common.ECIInput
    public CharSequence subSequence(int i2, int i3) {
        return this.b.subSequence(i2, i3);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            case 3:
                return this.b;
            case 4:
                return this.b;
            case 5:
                return this.b;
            case 6:
                return this.b;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxz
    public /* synthetic */ URLConnection zza() throws IOException {
        Set set = zzchu.f;
        zzt.zzq();
        int iIntValue = ((Integer) zzbd.zzc().a(p32.j0)).intValue();
        URL url = new URL(this.b);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 > 20) {
                p60.f("Too many redirects (20)");
                return null;
            }
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
            uRLConnectionOpenConnection.setReadTimeout(iIntValue);
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                p60.f("Invalid protocol.");
                return null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            zzl zzlVar = new zzl(null);
            zzlVar.zza(httpURLConnection, null);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            zzlVar.zzc(httpURLConnection, responseCode);
            if (responseCode / 100 != 3) {
                return httpURLConnection;
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                p60.f("Missing Location header in redirect");
                return null;
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (protocol == null) {
                p60.f("Protocol is null");
                return null;
            }
            if (!protocol.equals("http") && !protocol.equals("https")) {
                p60.f("Unsupported scheme: ".concat(protocol));
                return null;
            }
            zzo.zzd("Redirecting to ".concat(headerField));
            httpURLConnection.disconnect();
            url = url2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public void mo5zzb(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo3zza(Object obj) {
        ((zzdin) obj).zzb(this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public void zza(Throwable th) {
        zzt.zzh().f(this.b, th);
    }
}
