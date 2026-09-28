package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.a1;
import com.google.android.gms.internal.ads.b1;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.zzgcc;
import com.google.android.gms.internal.ads.zzgfx;
import com.google.android.gms.internal.ads.zzghb;
import com.google.common.util.concurrent.ListenableFuture;
import com.sandok.tunnel.core.Connection;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wy2 extends zzghb {
    public final /* synthetic */ int f = 3;
    public final Object g;
    public final Object h;

    public wy2(vz1 vz1Var, zzgfx zzgfxVar, DisplayMetrics displayMetrics, View view, f6 f6Var) {
        super("QtFUhprc0s9rDonjH5m4IrigIFuqmp02TDnBB8cCDzOGBvtX+nN2RsZyZRWOgPcG", "ANcskOtBFoz5qdvK1HjqJ5/70uPKH1zreYbosxrVnAY=", vz1Var, zzgfxVar, f6Var.a(124));
        this.g = displayMetrics;
        this.h = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b(Method method, vz1 vz1Var) {
        Long lValueOf = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l = (Long) method.invoke(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (Context) this.g);
                if (l == null) {
                    throw null;
                }
                lValueOf = l;
            } else {
                ListenableFuture listenableFuture = (ListenableFuture) ((Map) this.h).get("gs");
                if (listenableFuture != null && listenableFuture.isDone()) {
                    lValueOf = Long.valueOf(((b1) listenableFuture.get()).r0());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (vz1Var) {
            long jLongValue = lValueOf.longValue();
            vz1Var.d();
            ((b1) vz1Var.b).W(jLongValue);
        }
    }

    private final void c(Method method, vz1 vz1Var) {
        Long[] lArr = new Long[9];
        Arrays.fill((Object[]) lArr, (Object) (-1L));
        Map map = (Map) this.g;
        Long l = (Long) map.get("tcq");
        if (l == null) {
            l = -1L;
        }
        lArr[0] = l;
        Long l2 = (Long) map.get("tpq");
        if (l2 == null) {
            l2 = -1L;
        }
        lArr[1] = l2;
        Long l3 = (Long) map.get("tcv");
        if (l3 == null) {
            l3 = -1L;
        }
        lArr[2] = l3;
        Long l4 = (Long) map.get("tpv");
        if (l4 == null) {
            l4 = -1L;
        }
        lArr[3] = l4;
        Long l5 = (Long) map.get("tchv");
        if (l5 == null) {
            l5 = -1L;
        }
        lArr[4] = l5;
        Long l6 = (Long) map.get("tphv");
        if (l6 == null) {
            l6 = -1L;
        }
        lArr[5] = l6;
        Long l7 = (Long) map.get("tcc");
        if (l7 == null) {
            l7 = -1L;
        }
        lArr[6] = l7;
        Long l8 = (Long) map.get("tpc");
        if (l8 == null) {
            l8 = -1L;
        }
        lArr[7] = l8;
        Long l9 = (Long) map.get("tst");
        if (l9 == null) {
            l9 = -1L;
        }
        lArr[8] = l9;
        for (int i = 0; i < 9; i++) {
            if (lArr[i] == null) {
                lArr[i] = -1L;
            }
        }
        Long[] lArr2 = (Long[]) method.invoke(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, lArr, Integer.valueOf(((zzgcc) this.h).ordinal()));
        lArr2.getClass();
        synchronized (vz1Var) {
            long jLongValue = lArr2[0].longValue();
            vz1Var.d();
            ((b1) vz1Var.b).h0(jLongValue);
            long jLongValue2 = lArr2[1].longValue();
            vz1Var.d();
            ((b1) vz1Var.b).y(jLongValue2);
            long jLongValue3 = lArr2[2].longValue();
            vz1Var.d();
            ((b1) vz1Var.b).J0(jLongValue3);
            long jLongValue4 = lArr2[3].longValue();
            vz1Var.d();
            ((b1) vz1Var.b).G0(jLongValue4);
            long jLongValue5 = lArr2[4].longValue();
            vz1Var.d();
            ((b1) vz1Var.b).d0(jLongValue5);
            long jLongValue6 = lArr2[5].longValue();
            vz1Var.d();
            ((b1) vz1Var.b).e0(jLongValue6);
            long jLongValue7 = lArr2[6].longValue();
            vz1Var.d();
            ((b1) vz1Var.b).L(jLongValue7);
            long jLongValue8 = lArr2[7].longValue();
            vz1Var.d();
            ((b1) vz1Var.b).M(jLongValue8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    public final void a(Method method, vz1 vz1Var) throws IllegalAccessException, InvocationTargetException {
        switch (this.f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (View) this.h, (Activity) this.g);
                objArr.getClass();
                synchronized (vz1Var) {
                    long jLongValue = ((Long) objArr[0]).longValue();
                    vz1Var.d();
                    ((b1) vz1Var.b).X(jLongValue);
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    vz1Var.d();
                    ((b1) vz1Var.b).Y(jLongValue2);
                    String str = (String) objArr[2];
                    vz1Var.d();
                    ((b1) vz1Var.b).Z(str);
                    break;
                }
                return;
            case 1:
                b(method, vz1Var);
                return;
            case 2:
                c(method, vz1Var);
                return;
            default:
                View view = (View) this.h;
                if (view == null) {
                    return;
                }
                Object objInvoke = method.invoke(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (DisplayMetrics) this.g, view);
                objInvoke.getClass();
                Long[] lArr = (Long[]) objInvoke;
                yz1 yz1VarV = a1.v();
                long jLongValue3 = lArr[2].longValue();
                yz1VarV.d();
                ((a1) yz1VarV.b).x(jLongValue3);
                long jLongValue4 = lArr[1].longValue();
                yz1VarV.d();
                ((a1) yz1VarV.b).y(jLongValue4);
                long jLongValue5 = lArr[0].longValue();
                yz1VarV.d();
                ((a1) yz1VarV.b).z(jLongValue5);
                long jLongValue6 = lArr[3].longValue();
                yz1VarV.d();
                ((a1) yz1VarV.b).w(jLongValue6);
                long jLongValue7 = lArr[4].longValue();
                yz1VarV.d();
                ((a1) yz1VarV.b).A(jLongValue7);
                a1 a1Var = (a1) yz1VarV.e();
                vz1Var.d();
                ((b1) vz1Var.b).R(a1Var);
                return;
        }
    }

    public wy2(vz1 vz1Var, zzgfx zzgfxVar, View view, Activity activity, f6 f6Var) {
        super("bnVSgdPP2gLWa4hBN3KENgNw/HH5/Lu+gCRQEGIHMH/zN0uabg0EmprGntHqQpss", "4mb2wE47WPzlH8QFuj7X929jGLgzTiMr8Iu3TogjJ0U=", vz1Var, zzgfxVar, f6Var.a(111));
        this.h = view;
        this.g = activity;
    }

    public wy2(vz1 vz1Var, zzgfx zzgfxVar, zzgcc zzgccVar, Map map, f6 f6Var) {
        super("+PmnicIB6Ggxqdcyc5KXYWsM1j/GXRihAyryrcphzvI3AMIT+uhHMqbkBoIk/Q9k", "+zCNZC90FxKlnODut7cZO0wgbMEddS2/rBQzUBv6at4=", vz1Var, zzgfxVar, f6Var.a(122));
        this.g = map;
        this.h = zzgccVar;
    }

    public wy2(vz1 vz1Var, zzgfx zzgfxVar, Map map, Context context, f6 f6Var) {
        super("4E5LGVIWQ1GEduvP5TN/xg9UMJg1ApPRTsJapm6hD1tpcLj2ORRJ8msrY4RVPfxM", "Dj3g22+8PSWa8Tetil7hQ1gD69SNesarbyARD9M1zvc=", vz1Var, zzgfxVar, f6Var.a(Connection.CONNECTION_DEFAULT_TIMEOUT));
        this.g = context;
        this.h = map;
    }
}
