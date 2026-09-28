package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import com.google.android.gms.internal.ads.c6;
import com.google.android.gms.internal.ads.d6;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.n1;
import com.google.android.gms.internal.ads.q1;
import com.google.android.gms.internal.ads.q5;
import com.google.android.gms.internal.ads.r5;
import com.google.android.gms.internal.ads.t5;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatt;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.ads.zzbgx;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzcdu;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzclj;
import com.google.android.gms.internal.ads.zzcty;
import com.google.android.gms.internal.ads.zzdsy;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzeiu;
import com.google.android.gms.internal.ads.zzeul;
import com.google.android.gms.internal.ads.zzfch;
import com.google.android.gms.internal.ads.zzfdo;
import com.google.android.gms.internal.ads.zzfli;
import com.google.android.gms.internal.ads.zzfvh;
import com.google.android.gms.internal.ads.zzfwq;
import com.google.android.gms.internal.ads.zzfwv;
import com.google.android.gms.internal.ads.zzgct;
import com.google.android.gms.internal.ads.zzgdv;
import com.google.android.gms.internal.ads.zzgje;
import com.google.android.gms.internal.ads.zzgjg;
import com.google.android.gms.internal.ads.zzgmu;
import com.google.android.gms.internal.ads.zzgqt;
import com.google.android.gms.internal.ads.zzian;
import com.google.android.gms.internal.ads.zzicg;
import com.google.android.gms.internal.ads.zzika;
import com.trilead.ssh2.sftp.AttribFlags;
import java.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ny1 implements zzgqt {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ny1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.google.android.gms.internal.ads.zzgqt
    public final Object apply(Object obj) {
        SharedPreferences sharedPreferences;
        int i = 1;
        boolean zA = false;
        switch (this.a) {
            case 0:
                return zzau.zzQ((Uri) this.b, (String) obj);
            case 1:
                zzbzq zzbzqVar = (zzbzq) this.b;
                JSONObject jSONObject = (JSONObject) obj;
                l32 l32Var = p32.a;
                zzbd.zza();
                Context context = zzbzqVar.b;
                SharedPreferences sharedPreferencesA = zzbgx.a(context);
                if (sharedPreferencesA != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
                    Objects.requireNonNull(zzbd.zzb());
                    for (l32 l32Var2 : zzbd.zzb().a) {
                        if (l32Var2.a == 1) {
                            Object objA = l32Var2.a(jSONObject);
                            switch (l32Var2.e) {
                                case 0:
                                    editorEdit.putBoolean(l32Var2.b, ((Boolean) objA).booleanValue());
                                    break;
                                case 1:
                                    editorEdit.putInt(l32Var2.b, ((Integer) objA).intValue());
                                    break;
                                case 2:
                                    editorEdit.putLong(l32Var2.b, ((Long) objA).longValue());
                                    break;
                                case 3:
                                    editorEdit.putFloat(l32Var2.b, ((Float) objA).floatValue());
                                    break;
                                default:
                                    editorEdit.putString(l32Var2.b, (String) objA);
                                    break;
                            }
                        }
                    }
                    if (jSONObject != null) {
                        editorEdit.putString("flag_configuration", jSONObject.toString());
                    } else {
                        zzo.zzf("Flag Json is null.");
                    }
                    if (((Boolean) k42.o.g()).booleanValue() || ((Boolean) k42.p.g()).booleanValue()) {
                        zzbd.zza();
                        editorEdit.apply();
                    } else {
                        zzbd.zza();
                        editorEdit.commit();
                    }
                    if (((Boolean) k42.e.g()).booleanValue() && !TextUtils.equals(context.getPackageName(), "com.google.android.gms")) {
                        zzbd.zza();
                        try {
                            sharedPreferences = context.getSharedPreferences("google_adapter_flags", 0);
                        } catch (IllegalStateException e) {
                            zzo.zzj(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                            sharedPreferences = null;
                        }
                        if (sharedPreferences != null) {
                            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                            zzbd.zzb();
                            JSONObject jSONObject2 = new JSONObject();
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                if (next.startsWith("adapter:")) {
                                    try {
                                        jSONObject2.put(next, jSONObject.get(next));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            editorEdit2.putString("flag_configuration", jSONObject2.toString());
                            editorEdit2.apply();
                        }
                    }
                    SharedPreferences sharedPreferences2 = zzbzqVar.c;
                    if (sharedPreferences2 != null) {
                        sharedPreferences2.edit().putLong("js_last_update", zzt.zzk().currentTimeMillis()).apply();
                    }
                    break;
                }
                return null;
            case 2:
                yk2 yk2Var = (yk2) this.b;
                zzcjl zzcjlVar = (zzcjl) obj;
                zzcjlVar.zzab("/result", yk2Var.h);
                zzclj zzcljVarZzP = zzcjlVar.zzP();
                zzb zzbVar = new zzb(yk2Var.c, null, null);
                zzeiu zzeiuVar = yk2Var.i;
                mv2 mv2Var = yk2Var.j;
                zzdxz zzdxzVar = yk2Var.d;
                zzdsy zzdsyVar = yk2Var.a;
                zzcljVarZzP.zzab(null, zzdsyVar, zzdsyVar, zzdsyVar, zzdsyVar, false, null, zzbVar, null, null, zzeiuVar, mv2Var, zzdxzVar, null, null, null, null, null, null, null, null, null);
                return zzcjlVar;
            case 3:
                return ((zzcty) this.b).d();
            case 4:
                return ((kr2) this.b).a();
            case 5:
                ((rr2) this.b).a.f("AppSetIdInfoSignal", (Exception) obj);
                return new zzeul(null, -1);
            case 6:
                ((zzcdu) ((ir2) this.b).c).f("AppSetIdInfoGmscoreSignal", (Exception) obj);
                return new zzfch(null, -1);
            case 7:
                ((ft2) this.b).a.f("TrustlessTokenSignal", (Exception) obj);
                return new zzfdo(null);
            case 8:
                zzfli zzfliVar = (zzfli) this.b;
                zzfliVar.c = (jg2) obj;
                return zzfliVar;
            case 9:
                return (zzgdv) this.b;
            case 10:
                zzgdv zzgdvVar = (zzgdv) obj;
                ((t5) this.b).f.set(zzgdvVar);
                return zzgdvVar;
            case 11:
                return new Boolean(((zzgmu) this.b).zza((r5) obj));
            case 12:
                vz2 vz2Var = (vz2) this.b;
                byte[] bArr = (byte[]) obj;
                zzatv zzatvVar = new zzatv();
                r03 r03VarA = vz2Var.e.a(20102);
                try {
                    try {
                        r03VarA.a();
                        synchronized (vz2Var.f) {
                            vz2Var.j = uz2.a(zzatvVar, bArr);
                            break;
                        }
                        r03VarA.c();
                        return null;
                    } catch (Throwable th) {
                        r03VarA.c();
                        throw th;
                    }
                } catch (zzatp e2) {
                    e = e2;
                    r03VarA.b(e);
                    throw new zzgjg(2, e);
                } catch (zzatt e3) {
                    e = e3;
                    r03VarA.b(e);
                    throw new zzgjg(2, e);
                } catch (Throwable th2) {
                    r03VarA.b(th2);
                    throw th2;
                }
            case 13:
                c6 c6Var = (c6) this.b;
                r5 r5Var = (r5) obj;
                zzika zzikaVar = (zzika) c6Var.e;
                String strV = r5Var.v().v();
                String strZzb = r5Var.v().zzb();
                f6 f6Var = c6Var.d;
                r03 r03VarA2 = f6Var.a(15203);
                try {
                    r03VarA2.a();
                    zzfwv zzfwvVarE = z.e(c6Var.b, (zzbch) zzikaVar.zzb(), strV, strZzb, (zzfvh) c6Var.h);
                    int i2 = zzfwvVarE.c;
                    r03VarA2.c();
                    if (i2 == 2) {
                        f6Var.b(15208);
                        return c6.b(4);
                    }
                    byte[] bArr2 = zzfwvVarE.b;
                    if (bArr2 == null || bArr2.length == 0) {
                        f6Var.b(5010);
                        return c6.b(8);
                    }
                    try {
                        n1 n1VarY = n1.y(bArr2, gd3.a());
                        if (n1VarY.v().v().isEmpty() || n1VarY.v().zzb().isEmpty() || n1VarY.zzc().zzy().length == 0) {
                            f6Var.b(15207);
                        } else {
                            if (r5Var.equals(r5.A()) || !TextUtils.equals(r5Var.v().v(), n1VarY.v().v()) || !TextUtils.equals(r5Var.v().zzb(), n1VarY.v().zzb())) {
                                if (i2 == 4) {
                                    zzgje zzgjeVar = (zzgje) c6Var.g;
                                    byte[] bArrZzy = n1VarY.w().zzy();
                                    File file = zzgjeVar.a;
                                    try {
                                        k02.I(file);
                                        k02.D(file, bArrZzy);
                                        zA = zzgjeVar.b.a(file);
                                    } catch (IOException | GeneralSecurityException e4) {
                                        zzgjeVar.c.d(2027, e4);
                                    }
                                    try {
                                        file.delete();
                                        break;
                                    } catch (SecurityException unused2) {
                                    }
                                    if (!zA) {
                                        f6Var.b(15206);
                                        return c6.b(12);
                                    }
                                    i2 = 4;
                                    break;
                                }
                                ky2 ky2VarX = q5.x();
                                if (i2 == 2) {
                                    i = 4;
                                } else if (i2 == 3) {
                                    i = 2;
                                } else if (i2 == 4) {
                                    i = 3;
                                } else if (i2 == 6) {
                                    i = 5;
                                }
                                ky2VarX.d();
                                ((q5) ky2VarX.b).B(i);
                                ly2 ly2VarZ = r5.z();
                                q1 q1VarV = n1VarY.v();
                                ly2VarZ.d();
                                ((r5) ly2VarZ.b).B(q1VarV);
                                zzbch zzbchVar = (zzbch) zzikaVar.zzb();
                                ly2VarZ.d();
                                ((r5) ly2VarZ.b).D(zzbchVar);
                                r5 r5Var2 = (r5) ly2VarZ.e();
                                ky2VarX.d();
                                ((q5) ky2VarX.b).y(r5Var2);
                                zzian zzianVarW = n1VarY.w();
                                ky2VarX.d();
                                ((q5) ky2VarX.b).A(zzianVarW);
                                zzian zzianVarZzc = n1VarY.zzc();
                                ky2VarX.d();
                                ((q5) ky2VarX.b).z(zzianVarZzc);
                                return (q5) ky2VarX.e();
                            }
                            f6Var.b(15209);
                        }
                        return c6.b(11);
                    } catch (zzicg e5) {
                        f6Var.d(15205, e5);
                        return c6.b(9);
                    } catch (NullPointerException unused3) {
                        f6Var.b(15210);
                        return c6.b(10);
                    }
                } catch (Throwable th3) {
                    try {
                        r03VarA2.b(th3);
                        throw th3;
                    } catch (Throwable th4) {
                        r03VarA2.c();
                        throw th4;
                    }
                }
            case 14:
                d6 d6Var = (d6) this.b;
                r5 r5Var3 = (r5) obj;
                if (r5Var3 == null || r5Var3.equals(r5.A())) {
                    return null;
                }
                return new zzfwq(r5Var3.v(), ((zzgct) d6Var.e.zzb()).a, d6Var.c.a, d6Var.g);
            default:
                k03 k03Var = (k03) this.b;
                String str = (String) obj;
                if (!if3.W(str)) {
                    return str;
                }
                File file2 = new File(k03Var.a.getPackageResourcePath());
                if (file2.exists() && file2.canRead()) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        try {
                            byte[] bArr3 = new byte[AttribFlags.SSH_FILEXFER_ATTR_UNTRANSLATED_NAME];
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                            for (int i3 = fileInputStream.read(bArr3); i3 != -1; i3 = fileInputStream.read(bArr3)) {
                                messageDigest.update(bArr3, 0, i3);
                            }
                            n23 n23VarF = n23.f.f();
                            byte[] bArrDigest = messageDigest.digest();
                            String strG = n23VarF.g(bArrDigest.length, bArrDigest);
                            fileInputStream.close();
                            return strG;
                        } finally {
                        }
                    } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused4) {
                    }
                }
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }
}
