package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzcit;
import com.google.android.gms.internal.ads.zzhf;
import com.google.android.gms.internal.ads.zzhq;
import com.google.android.gms.internal.ads.zzht;
import com.google.android.gms.internal.ads.zzhu;
import com.trilead.ssh2.sftp.AttribFlags;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nb2 extends u13 implements zzhu {
    public static final Pattern u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference v = new AtomicReference();
    public final mb2 e;
    public final int f;
    public final int g;
    public final String h;
    public final zzht i;
    public zzhf j;
    public HttpURLConnection k;
    public InputStream l;
    public boolean m;
    public int n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public final HashSet t;

    public nb2(String str, zzcit zzcitVar, int i, int i2, int i3) {
        super(true);
        this.e = new mb2(this);
        this.t = new HashSet();
        n8.S(true ^ TextUtils.isEmpty(str));
        this.h = str;
        this.i = new zzht();
        this.f = i;
        this.g = i2;
        this.s = i3;
        if (zzcitVar != null) {
            zze(zzcitVar);
        }
    }

    public final void e() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzo.zzg("Unexpected error while disconnecting", e);
            }
            this.k = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws zzhq {
        try {
            if (this.q != this.o) {
                AtomicReference atomicReference = v;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE];
                }
                while (true) {
                    long j = this.q;
                    long j2 = this.o;
                    if (j == j2) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i3 = this.l.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i3 == -1) {
                        throw new EOFException();
                    }
                    this.q += (long) i3;
                    c(i3);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.p;
            if (j3 != -1) {
                long j4 = j3 - this.r;
                if (j4 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j4);
            }
            int i4 = this.l.read(bArr, i, i2);
            if (i4 == -1) {
                if (this.p == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.r += (long) i4;
            c(i4);
            return i4;
        } catch (IOException e) {
            throw new zzhq(e, this.j, 2000, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x027a A[Catch: IOException -> 0x003f, TryCatch #2 {IOException -> 0x003f, blocks: (B:3:0x000e, B:4:0x0020, B:6:0x0026, B:8:0x0036, B:11:0x0042, B:12:0x005a, B:14:0x0060, B:22:0x008b, B:24:0x00ae, B:26:0x00d4, B:27:0x00d9, B:40:0x010f, B:90:0x026d, B:92:0x027a, B:94:0x028b, B:97:0x0294, B:98:0x02a1, B:100:0x02aa, B:101:0x02b1, B:102:0x02b2, B:103:0x02cf), top: B:110:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(com.google.android.gms.internal.ads.zzhf r25) throws com.google.android.gms.internal.ads.zzhq {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb2.zzb(com.google.android.gms.internal.ads.zzhf):long");
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        HashSet hashSet = this.t;
        try {
            InputStream inputStream = this.l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzhq(e, this.j, 2000, 3);
                }
            }
        } finally {
            this.l = null;
            e();
            if (this.m) {
                this.m = false;
                d();
            }
            hashSet.clear();
        }
    }

    @Override // defpackage.u13, com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
