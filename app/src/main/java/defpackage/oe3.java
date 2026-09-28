package defpackage;

import com.google.android.gms.internal.ads.zzatg;
import com.google.android.gms.internal.ads.zzatj;
import com.google.android.gms.internal.ads.zzijs;
import com.google.android.gms.internal.ads.zzijy;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oe3 implements zzatj {
    public static final zzijy h = zzijy.b(oe3.class);
    public final String a;
    public ByteBuffer d;
    public long e;
    public zzijs g;
    public long f = -1;
    public boolean c = true;
    public boolean b = true;

    public oe3(String str) {
        this.a = str;
    }

    public final synchronized void a() {
        try {
            if (this.c) {
                return;
            }
            try {
                zzijy zzijyVar = h;
                String str = this.a;
                zzijyVar.a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.d = this.g.zze(this.e, this.f);
                this.c = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void b(ByteBuffer byteBuffer);

    public final synchronized void c() {
        try {
            a();
            zzijy zzijyVar = h;
            String str = this.a;
            zzijyVar.a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.d;
            if (byteBuffer != null) {
                this.b = true;
                byteBuffer.rewind();
                b(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.d = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatj
    public final String zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzatj
    public final void zzb(zzijs zzijsVar, ByteBuffer byteBuffer, long j, zzatg zzatgVar) throws IOException {
        this.e = zzijsVar.zzc();
        byteBuffer.remaining();
        this.f = j;
        this.g = zzijsVar;
        zzijsVar.zzd(zzijsVar.zzc() + j);
        this.c = false;
        this.b = false;
        c();
    }
}
