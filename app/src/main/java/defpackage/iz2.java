package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.ads.f1;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.i1;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.zzgfe;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class iz2 {
    public final Context a;
    public final f6 b;
    public final zzgfe c;
    public final String d;

    public iz2(Context context, f6 f6Var, zzgfe zzgfeVar, k5 k5Var) {
        this.a = context;
        this.b = f6Var;
        this.c = zzgfeVar;
        this.d = k5Var.zzb();
    }

    public final String a(long j) {
        String string;
        r03 r03VarA = this.b.a(55);
        try {
            try {
                r03VarA.a();
                a02 a02VarV = f1.v();
                String str = this.d;
                a02VarV.d();
                ((f1) a02VarV.b).x(str);
                a02VarV.d();
                ((f1) a02VarV.b).w("0.825731049");
                Context context = this.a;
                String packageName = context.getPackageName();
                a02VarV.d();
                ((f1) a02VarV.b).z(packageName);
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                a02VarV.d();
                ((f1) a02VarV.b).y(jCurrentTimeMillis);
                long jCurrentTimeMillis2 = (System.currentTimeMillis() - j) / 1000;
                a02VarV.d();
                ((f1) a02VarV.b).B(jCurrentTimeMillis2);
                try {
                    long j2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    a02VarV.d();
                    ((f1) a02VarV.b).A(j2);
                } catch (PackageManager.NameNotFoundException unused) {
                    a02VarV.d();
                    ((f1) a02VarV.b).A(-1L);
                }
                zzgfe zzgfeVar = this.c;
                if (!zzgfeVar.b()) {
                    zzgfeVar.a();
                }
                b02 b02VarE = zzgfeVar.e(null, ((f1) a02VarV.e()).a());
                b02VarE.d();
                ((i1) b02VarE.b).y(5);
                b02VarE.d();
                ((i1) b02VarE.b).z(2);
                byte[] bArrA = ((i1) b02VarE.e()).a();
                m23 m23Var = n23.e;
                if (m23Var.b != null) {
                    m23Var = new m23(m23Var.a, (Character) null);
                }
                string = m23Var.g(bArrA.length, bArrA);
            } catch (Throwable th) {
                r03VarA.c();
                throw th;
            }
        } catch (UnsupportedEncodingException e) {
            r03VarA.b(e);
            string = Integer.toString(7);
        } catch (Throwable th2) {
            r03VarA.b(th2);
            throw th2;
        }
        r03VarA.c();
        return string;
    }
}
