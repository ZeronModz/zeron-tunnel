package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.internal.ads.aa;
import com.google.android.gms.internal.ads.d9;
import com.google.android.gms.internal.ads.e9;
import com.google.android.gms.internal.ads.f9;
import com.google.android.gms.internal.ads.g9;
import com.google.android.gms.internal.ads.r7;
import com.google.android.gms.internal.ads.x8;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzffx;
import com.google.android.gms.internal.ads.zzgru;
import com.google.android.gms.internal.ads.zzhas;
import com.google.android.gms.internal.ads.zzhaz;
import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhch;
import com.google.android.gms.internal.ads.zzhjc;
import com.google.android.gms.internal.ads.zzhje;
import com.google.android.gms.internal.ads.zzhjh;
import com.google.android.gms.internal.ads.zzhjo;
import com.google.android.gms.internal.ads.zzhkg;
import com.google.android.gms.internal.ads.zzhkj;
import com.google.android.gms.internal.ads.zzhkm;
import com.google.android.gms.internal.ads.zzhkt;
import com.google.android.gms.internal.ads.zzhlg;
import com.google.android.gms.internal.ads.zzhqb;
import com.google.android.gms.internal.ads.zzhqy;
import com.google.android.gms.internal.ads.zzian;
import com.google.android.gms.internal.ads.zzicg;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ot2 implements zzffx, Continuation, zzgru, zzhkt, zzhkj, zzhjh, zzhje, zzhkm {
    public final /* synthetic */ int a;
    public static final /* synthetic */ ot2 b = new ot2(0);
    public static final /* synthetic */ ot2 c = new ot2(1);
    public static final /* synthetic */ ot2 d = new ot2(2);
    public static final /* synthetic */ ot2 e = new ot2(3);
    public static final /* synthetic */ ot2 f = new ot2(6);
    public static final /* synthetic */ ot2 g = new ot2(8);
    public static final /* synthetic */ ot2 h = new ot2(9);
    public static final /* synthetic */ ot2 i = new ot2(10);
    public static final /* synthetic */ ot2 j = new ot2(11);
    public static final /* synthetic */ ot2 k = new ot2(12);
    public static final /* synthetic */ ot2 l = new ot2(13);
    public static final /* synthetic */ ot2 m = new ot2(14);
    public static final /* synthetic */ ot2 n = new ot2(15);
    public static final /* synthetic */ ot2 o = new ot2(16);
    public static final /* synthetic */ ot2 p = new ot2(17);
    public static final /* synthetic */ ot2 q = new ot2(18);
    public static final /* synthetic */ ot2 r = new ot2(19);
    public static final /* synthetic */ ot2 s = new ot2(20);
    public static final /* synthetic */ ot2 t = new ot2(21);
    public static final /* synthetic */ ot2 u = new ot2(22);
    public static final /* synthetic */ ot2 v = new ot2(23);
    public static final /* synthetic */ ot2 w = new ot2(24);
    public static final /* synthetic */ ot2 x = new ot2(25);
    public static final /* synthetic */ ot2 y = new ot2(26);
    public static final /* synthetic */ ot2 z = new ot2(27);
    public static final /* synthetic */ ot2 A = new ot2(28);
    public static final /* synthetic */ ot2 B = new ot2(29);

    public /* synthetic */ ot2(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        return new Boolean(task.m());
    }

    @Override // com.google.android.gms.internal.ads.zzhkt
    public Object zza(zzhaz zzhazVar) throws GeneralSecurityException {
        byte[] bArrB;
        switch (this.a) {
            case 9:
                v53 v53Var = (v53) zzhazVar;
                x63 x63Var = l43.a;
                try {
                    r7.a();
                    return new m63(((hc3) v53Var.b.b).b(), v53Var.c.b(), r7.a().getProvider());
                } catch (GeneralSecurityException unused) {
                    return new aa(((hc3) v53Var.b.b).b(), 1, v53Var.c.b());
                }
            case 10:
                d53 d53Var = (d53) zzhazVar;
                x63 x63Var2 = l43.a;
                try {
                    r7.a();
                    return new r7(((hc3) d53Var.b.b).b(), d53Var.c.b(), r7.a().getProvider());
                } catch (GeneralSecurityException unused2) {
                    return new aa(((hc3) d53Var.b.b).b(), 0, d53Var.c.b());
                }
            case 11:
                return ec3.a((t43) zzhazVar);
            case 12:
                x43 x43Var = (x43) zzhazVar;
                z43 z43Var = x43Var.a;
                return new j63(((hc3) x43Var.b.b).b(), x43Var.c);
            case 13:
                return o63.a((a53) zzhazVar);
            case 14:
                return fc3.a((m43) zzhazVar);
            case 15:
                s53 s53Var = (s53) zzhazVar;
                u53 u53Var = s53Var.a;
                return new k63(((hc3) s53Var.b.b).b(), s53Var.c, s53Var.a.b);
            case 16:
                s73 s73Var = ((zzhjo) zzhazVar).a;
                int i2 = d73.b[s73Var.d.ordinal()];
                zzhas zzhasVar = (zzhas) zzhjc.d.b(zzhas.class, s73Var.a).zza(s73Var.c);
                zzhqy zzhqyVar = s73Var.e;
                int iOrdinal = zzhqyVar.ordinal();
                if (iOrdinal == 1) {
                    bArrB = k73.b(s73Var.f.intValue()).b();
                } else if (iOrdinal == 2) {
                    bArrB = k73.a(s73Var.f.intValue()).b();
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzhqyVar)));
                    }
                    bArrB = k73.a(s73Var.f.intValue()).b();
                } else {
                    bArrB = k73.a.b();
                }
                return new j63(zzhasVar, bArrB);
            case 17:
                return fc3.a((m43) zzhazVar);
            case 18:
                return ec3.a((t43) zzhazVar);
            case 19:
                x43 x43Var2 = (x43) zzhazVar;
                z43 z43Var2 = x43Var2.a;
                return new j63(((hc3) x43Var2.b.b).b(), x43Var2.c);
            case 20:
                return o63.a((a53) zzhazVar);
            case 21:
                d53 d53Var2 = (d53) zzhazVar;
                p73 p73Var = e53.a;
                try {
                    r7.a();
                    return new r7(((hc3) d53Var2.b.b).b(), d53Var2.c.b(), r7.a().getProvider());
                } catch (GeneralSecurityException unused3) {
                    return new aa(((hc3) d53Var2.b.b).b(), 0, d53Var2.c.b());
                }
            case 22:
                j53 j53Var = (j53) zzhazVar;
                p73 p73Var2 = g53.a;
                return new j63(h43.a(j53Var.a.a).zzb(), j53Var.b.b());
            default:
                m53 m53Var = (m53) zzhazVar;
                c73 c73Var = i53.a;
                n53 n53Var = m53Var.a;
                String str = n53Var.b;
                zzhch zzhchVar = n53Var.d;
                zzhas zzhasVarZzb = h43.a(str).zzb();
                byte[] bArr = h53.c;
                try {
                    byte[] bArrA = ((t73) zzhkg.b.h(zzhchVar)).b.a();
                    gd3 gd3Var = gd3.b;
                    int i3 = wc3.a;
                    return new j63(new h53(x8.y(bArrA, gd3.c), zzhasVarZzb), m53Var.b.b());
                } catch (zzicg e2) {
                    throw new GeneralSecurityException(e2);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhkj
    public zzhbp zza(zzhlg zzhlgVar) throws GeneralSecurityException {
        t73 t73Var = (t73) zzhlgVar;
        switch (this.a) {
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                m73 m73Var = l53.a;
                boolean zEquals = t73Var.b.v().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                x8 x8Var = t73Var.b;
                if (zEquals) {
                    try {
                        zzian zzianVarW = x8Var.w();
                        gd3 gd3Var = gd3.b;
                        int i2 = wc3.a;
                        return new k53(e9.w(zzianVarW, gd3.c).v(), l53.a(x8Var.x()));
                    } catch (zzicg e2) {
                        throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e2);
                    }
                }
                u7.r("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(x8Var.v())));
                return null;
            default:
                m73 m73Var2 = q53.a;
                boolean zEquals2 = t73Var.b.v().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                x8 x8Var2 = t73Var.b;
                if (zEquals2) {
                    try {
                        zzian zzianVarW2 = x8Var2.w();
                        gd3 gd3Var2 = gd3.b;
                        int i3 = wc3.a;
                        return q53.b(g9.x(zzianVarW2, gd3.c), x8Var2.x());
                    } catch (zzicg e3) {
                        throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e3);
                    }
                }
                u7.r("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(x8Var2.v())));
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhje
    public zzhaz zza(zzhlg zzhlgVar, i43 i43Var) throws GeneralSecurityException {
        s73 s73Var = (s73) zzhlgVar;
        m73 m73Var = l53.a;
        if (s73Var.a.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                zzian zzianVar = s73Var.c;
                gd3 gd3Var = gd3.b;
                int i2 = wc3.a;
                d9 d9VarX = d9.x(zzianVar, gd3.c);
                if (d9VarX.v() == 0) {
                    return j53.d(new k53(d9VarX.w().v(), l53.a(s73Var.e)), s73Var.f);
                }
                String strValueOf = String.valueOf(d9VarX);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 49);
                sb.append("KmsAeadKey are only accepted with version 0, got ");
                sb.append(strValueOf);
                throw new GeneralSecurityException(sb.toString());
            } catch (zzicg e2) {
                throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e2);
            }
        }
        u7.r("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzffx
    public /* synthetic */ void zza(Object obj) throws RemoteException {
        switch (this.a) {
            case 0:
                ((zzcbg) obj).zze();
                break;
            default:
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhjh
    public zzhlg zza(zzhaz zzhazVar, i43 i43Var) throws GeneralSecurityException {
        zzhqy zzhqyVar;
        zzhqy zzhqyVar2;
        switch (this.a) {
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                j53 j53Var = (j53) zzhazVar;
                m73 m73Var = l53.a;
                ba3 ba3VarY = d9.y();
                ca3 ca3VarX = e9.x();
                String str = j53Var.a.a;
                ca3VarX.d();
                ((e9) ca3VarX.b).z(str);
                e9 e9Var = (e9) ca3VarX.e();
                ba3VarY.d();
                ((d9) ba3VarY.b).A(e9Var);
                zzian zzianVarZzaM = ((d9) ba3VarY.e()).zzaM();
                zzhqb zzhqbVar = zzhqb.REMOTE;
                q43 q43Var = j53Var.a.b;
                if (q43.k == q43Var) {
                    zzhqyVar = zzhqy.TINK;
                } else if (q43.l == q43Var) {
                    zzhqyVar = zzhqy.RAW;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(q43Var.b));
                }
                return s73.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzianVarZzaM, zzhqbVar, zzhqyVar, j53Var.c);
            default:
                m53 m53Var = (m53) zzhazVar;
                m73 m73Var2 = q53.a;
                da3 da3VarY = f9.y();
                g9 g9VarA = q53.a(m53Var.a);
                da3VarY.d();
                ((f9) da3VarY.b).A(g9VarA);
                zzian zzianVarZzaM2 = ((f9) da3VarY.e()).zzaM();
                zzhqb zzhqbVar2 = zzhqb.REMOTE;
                e43 e43Var = m53Var.a.a;
                if (e43.l == e43Var) {
                    zzhqyVar2 = zzhqy.TINK;
                } else {
                    if (e43.m != e43Var) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(e43Var)));
                    }
                    zzhqyVar2 = zzhqy.RAW;
                }
                return s73.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzianVarZzaM2, zzhqbVar2, zzhqyVar2, m53Var.c);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhkm
    public zzhlg zza(zzhbp zzhbpVar) throws GeneralSecurityException {
        zzhqy zzhqyVar;
        k53 k53Var = (k53) zzhbpVar;
        m73 m73Var = l53.a;
        w93 w93VarZ = x8.z();
        w93VarZ.g("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        ca3 ca3VarX = e9.x();
        String str = k53Var.a;
        ca3VarX.d();
        ((e9) ca3VarX.b).z(str);
        w93VarZ.h(((e9) ca3VarX.e()).zzaM());
        q43 q43Var = k53Var.b;
        if (q43.k == q43Var) {
            zzhqyVar = zzhqy.TINK;
        } else if (q43.l == q43Var) {
            zzhqyVar = zzhqy.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: ".concat(q43Var.b));
        }
        w93VarZ.i(zzhqyVar);
        return t73.a((x8) w93VarZ.e());
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ Object mo10zza() {
        switch (this.a) {
            case 3:
                return -1;
            case 4:
                return 265;
            case 5:
                return -1;
            case 6:
                return -1;
            case 7:
                HandlerThread handlerThread = new HandlerThread("OverlayDisplayService", 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            default:
                throw new IllegalStateException();
        }
    }
}
