package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.r5;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.ads.zzian;
import com.google.android.gms.internal.ads.zzicg;
import com.google.android.gms.internal.ads.zzika;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class rz2 {
    public final File a;
    public final File b;
    public final SharedPreferences c;
    public final zzika d;
    public final f6 e;

    public rz2(Context context, SharedPreferences sharedPreferences, zzika zzikaVar, f6 f6Var) {
        this.c = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        sb2.K(dir, false);
        this.a = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        sb2.K(dir2, true);
        this.b = dir2;
        this.d = zzikaVar;
        this.e = f6Var;
    }

    public final void a(r5 r5Var, byte[] bArr, byte[] bArr2) {
        String strV = r5Var.v().v();
        boolean zIsEmpty = TextUtils.isEmpty(strV);
        f6 f6Var = this.e;
        if (!zIsEmpty && bArr2.length != 0) {
            File file = this.b;
            sb2.L(file);
            file.mkdirs();
            File fileJ = sb2.J(file, strV);
            fileJ.getClass();
            fileJ.mkdirs();
            File fileA = sb2.A(strV, file, "pcam.jar");
            fileA.getClass();
            if (bArr == null || bArr.length <= 0 || sb2.H(fileA, bArr)) {
                File fileA2 = sb2.A(strV, file, "pcbc");
                fileA2.getClass();
                if (sb2.H(fileA2, bArr2)) {
                    String strV2 = r5Var.v().v();
                    if (!TextUtils.isEmpty(strV2)) {
                        File fileA3 = sb2.A(strV2, file, "pcam.jar");
                        fileA3.getClass();
                        File fileA4 = sb2.A(strV2, file, "pcbc");
                        fileA4.getClass();
                        File fileA5 = sb2.A(strV2, c(), "pcam.jar");
                        fileA5.getClass();
                        File fileA6 = sb2.A(strV2, c(), "pcbc");
                        fileA6.getClass();
                        if (fileA3.exists() && !fileA3.renameTo(fileA5)) {
                            f6Var.b(15318);
                        } else if (fileA4.exists() && fileA4.renameTo(fileA6)) {
                            r5 r5VarB = b(1);
                            SharedPreferences.Editor editorEdit = this.c.edit();
                            if (r5VarB != null && !r5Var.v().v().equals(r5VarB.v().v())) {
                                editorEdit.putString(d(), Hex.a(r5VarB.a()));
                            }
                            editorEdit.putString(e(), Hex.a(r5Var.a()));
                            if (!editorEdit.commit()) {
                                f6Var.b(15320);
                            }
                        } else {
                            f6Var.b(15319);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    r5 r5VarB2 = b(1);
                    if (r5VarB2 != null) {
                        hashSet.add(r5VarB2.v().v());
                    }
                    r5 r5VarB3 = b(2);
                    if (r5VarB3 != null) {
                        hashSet.add(r5VarB3.v().v());
                    }
                    File[] fileArrListFiles = c().listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            String name = file2.getName();
                            if (!hashSet.contains(name)) {
                                File fileJ2 = sb2.J(c(), name);
                                fileJ2.getClass();
                                sb2.L(fileJ2);
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        f6Var.b(15316);
    }

    public final r5 b(int i) {
        SharedPreferences sharedPreferences = this.c;
        String string = i == 1 ? sharedPreferences.getString(e(), null) : sharedPreferences.getString(d(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] bArrB = Hex.b(string);
                r5 r5VarY = r5.y(zzian.zzs(bArrB, 0, bArrB.length));
                String strV = r5VarY.v().v();
                File fileA = sb2.A(strV, c(), "pcam.jar");
                if (fileA == null) {
                    throw null;
                }
                if (!fileA.exists() && (fileA = sb2.A(strV, c(), "pcam")) == null) {
                    throw null;
                }
                File fileA2 = sb2.A(strV, c(), "pcbc");
                if (fileA2 == null) {
                    throw null;
                }
                if (fileA.exists() && fileA2.exists()) {
                    return r5VarY;
                }
            } catch (zzicg unused) {
                this.e.b(15317);
                return null;
            }
        }
        return null;
    }

    public final File c() {
        File file = new File(this.a, Integer.toString(((zzbch) this.d.zzb()).zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final String d() {
        int iZza = ((zzbch) this.d.zzb()).zza();
        return vh.i(iZza, "FBAMTD", new StringBuilder(String.valueOf(iZza).length() + 6));
    }

    public final String e() {
        int iZza = ((zzbch) this.d.zzb()).zza();
        return vh.i(iZza, "LATMTD", new StringBuilder(String.valueOf(iZza).length() + 6));
    }
}
