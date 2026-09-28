package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.b1;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.z0;
import com.google.android.gms.internal.ads.zzgcc;
import com.google.android.gms.internal.ads.zzger;
import com.google.android.gms.internal.ads.zzges;
import com.google.android.gms.internal.ads.zzgfx;
import com.google.android.gms.internal.ads.zzghb;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gz2 extends zzghb {
    public final /* synthetic */ int f = 0;
    public final Map g;
    public final Object h;
    public final Object i;

    public gz2(vz1 vz1Var, zzgfx zzgfxVar, zzgcc zzgccVar, Context context, Map map, f6 f6Var) {
        super("cNPndN+EzA0ppawmtlMhouOhZ8up9MCZv7/NNjE52JSJNgkl5UKlR5xuXAGt5rDT", "maxrbwgAVilcsYV2zOy8o/EZWuXXlpXIbHDx2rc0DB0=", vz1Var, zzgfxVar, f6Var.a(121));
        this.h = zzgccVar;
        this.i = context;
        this.g = map;
    }

    private final void b(Method method, vz1 vz1Var) {
        zzgcc zzgccVar = (zzgcc) this.h;
        Integer numValueOf = Integer.valueOf(zzgccVar.ordinal());
        Context context = (Context) this.i;
        Object obj = this.g.get("up");
        Boolean bool = Boolean.TRUE;
        if (obj == null) {
            obj = bool;
        }
        Object[] objArr = (Object[]) method.invoke(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, numValueOf, context, obj);
        objArr.getClass();
        synchronized (vz1Var) {
            try {
                if (zzgccVar == zzgcc.QUERY) {
                    Object obj2 = objArr[0];
                    if (obj2 == null) {
                        obj2 = obj;
                    }
                    long jLongValue = ((Long) obj2).longValue();
                    vz1Var.d();
                    ((b1) vz1Var.b).w(jLongValue);
                    Object obj3 = objArr[1];
                    long jLongValue2 = ((Long) (obj3 != null ? obj3 : -1L)).longValue();
                    vz1Var.d();
                    ((b1) vz1Var.b).x(jLongValue2);
                }
                long jLongValue3 = ((Long) objArr[2]).longValue();
                vz1Var.d();
                ((b1) vz1Var.b).C0(jLongValue3);
                long jLongValue4 = ((Long) objArr[3]).longValue();
                vz1Var.d();
                ((b1) vz1Var.b).V(jLongValue4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    public final void a(Method method, vz1 vz1Var) {
        Object[] objArr;
        switch (this.f) {
            case 0:
                b(method, vz1Var);
                return;
            default:
                Map map = this.g;
                Object obj = (MotionEvent) map.get("nv");
                DisplayMetrics displayMetrics = (DisplayMetrics) this.i;
                boolean z = true;
                Object[] objArr2 = (Object[]) method.invoke(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, obj, displayMetrics);
                objArr2.getClass();
                xz1 xz1VarV = z0.v();
                Object obj2 = objArr2[0];
                if (obj2 != null && objArr2[1] != null) {
                    long jLongValue = ((Long) obj2).longValue();
                    xz1VarV.d();
                    ((z0) xz1VarV.b).w(jLongValue);
                    long jLongValue2 = ((Long) objArr2[1]).longValue();
                    xz1VarV.d();
                    ((z0) xz1VarV.b).x(jLongValue2);
                }
                Object obj3 = objArr2[2];
                if (obj3 != null) {
                    long jLongValue3 = ((Long) obj3).longValue();
                    xz1VarV.d();
                    ((z0) xz1VarV.b).D(jLongValue3);
                }
                Object obj4 = objArr2[3];
                if (obj4 != null) {
                    long jLongValue4 = ((Long) obj4).longValue();
                    xz1VarV.d();
                    ((z0) xz1VarV.b).B(jLongValue4);
                }
                Object obj5 = objArr2[4];
                if (obj5 != null) {
                    long jLongValue5 = ((Long) obj5).longValue();
                    xz1VarV.d();
                    ((z0) xz1VarV.b).y(jLongValue5);
                }
                Object obj6 = objArr2[5];
                if (obj6 != null) {
                    int i = ((Long) obj6).longValue() != 0 ? 2 : 1;
                    xz1VarV.d();
                    ((z0) xz1VarV.b).O(i);
                }
                Object obj7 = objArr2[6];
                if (obj7 != null) {
                    long jLongValue6 = ((Long) obj7).longValue();
                    xz1VarV.d();
                    ((z0) xz1VarV.b).F(jLongValue6);
                }
                Object obj8 = objArr2[7];
                if (obj8 != null) {
                    long jLongValue7 = ((Long) obj8).longValue();
                    xz1VarV.d();
                    ((z0) xz1VarV.b).E(jLongValue7);
                }
                Object obj9 = objArr2[8];
                if (obj9 != null) {
                    int i2 = ((Long) obj9).longValue() != 0 ? 2 : 1;
                    xz1VarV.d();
                    ((z0) xz1VarV.b).P(i2);
                }
                synchronized (vz1Var) {
                    try {
                        Method methodZzc = ((zzgfx) this.h).zzc("LTqeYOkKjRvgMVLXGWwl9QUpPl0hs86RILvnzsnpkgBkbbANt+0KM6wwB7tA8s8M", "qJFn6bhMeF50E1eku7tYH88ZkNeM8ctWC3me80VkO1s=");
                        if (methodZzc == null || (objArr = (Object[]) methodZzc.invoke(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (MotionEvent) map.get("nv"), displayMetrics)) == null) {
                            throw null;
                        }
                        Object obj10 = objArr[0];
                        if (obj10 != null) {
                            long jLongValue8 = ((Long) obj10).longValue();
                            vz1Var.d();
                            ((b1) vz1Var.b).D0(jLongValue8);
                        }
                        Object obj11 = objArr[1];
                        if (obj11 != null) {
                            long jLongValue9 = ((Long) obj11).longValue();
                            vz1Var.d();
                            ((b1) vz1Var.b).E0(jLongValue9);
                        }
                        Object obj12 = objArr[2];
                        if (obj12 != null) {
                            long jLongValue10 = ((Long) obj12).longValue();
                            vz1Var.d();
                            ((b1) vz1Var.b).F0(jLongValue10);
                        }
                        Object obj13 = objArr[3];
                        if (obj13 != null) {
                            long jLongValue11 = ((Long) obj13).longValue();
                            vz1Var.d();
                            ((b1) vz1Var.b).B(jLongValue11);
                        }
                        Object obj14 = objArr[4];
                        if (obj14 != null) {
                            long jLongValue12 = ((Long) obj14).longValue();
                            vz1Var.d();
                            ((b1) vz1Var.b).C(jLongValue12);
                        }
                        zzger zzgerVar = (zzger) map.get("oe");
                        if (zzgerVar != null) {
                            long j = zzgerVar.a;
                            if (j > 0) {
                                vz1Var.d();
                                ((b1) vz1Var.b).F(j);
                            }
                            long j2 = zzgerVar.b;
                            if (j2 > 0) {
                                vz1Var.d();
                                ((b1) vz1Var.b).E(j2);
                            }
                            long j3 = zzgerVar.c;
                            if (j3 > 0) {
                                vz1Var.d();
                                ((b1) vz1Var.b).D(j3);
                            }
                            long j4 = zzgerVar.d;
                            if (j4 > 0) {
                                vz1Var.d();
                                ((b1) vz1Var.b).G(j4);
                            }
                        }
                        zzger zzgerVar2 = (zzger) map.get("oe");
                        if (zzgerVar2 != null && zzgerVar2.a != 0) {
                            if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                                double d = zzgerVar2.g;
                                if (displayMetrics == null) {
                                    throw null;
                                }
                                long jRound = Math.round(d / ((double) displayMetrics.density));
                                xz1VarV.d();
                                ((z0) xz1VarV.b).H(jRound);
                                long jRound2 = Math.round(((double) (zzgerVar2.j - zzgerVar2.h)) / ((double) displayMetrics.density));
                                xz1VarV.d();
                                ((z0) xz1VarV.b).I(jRound2);
                                long jRound3 = Math.round(((double) (zzgerVar2.k - zzgerVar2.i)) / ((double) displayMetrics.density));
                                xz1VarV.d();
                                ((z0) xz1VarV.b).J(jRound3);
                                long jRound4 = Math.round(((double) zzgerVar2.h) / ((double) displayMetrics.density));
                                xz1VarV.d();
                                ((z0) xz1VarV.b).M(jRound4);
                                long jRound5 = Math.round(((double) zzgerVar2.i) / ((double) displayMetrics.density));
                                xz1VarV.d();
                                ((z0) xz1VarV.b).N(jRound5);
                                MotionEvent motionEvent = (MotionEvent) map.get("nv");
                                if (motionEvent != null) {
                                    long jRound6 = Math.round(((double) (((zzgerVar2.h - zzgerVar2.j) + motionEvent.getRawX()) - motionEvent.getX())) / ((double) displayMetrics.density));
                                    if (jRound6 != 0) {
                                        xz1VarV.d();
                                        ((z0) xz1VarV.b).K(jRound6);
                                    }
                                    long jRound7 = Math.round(((double) (((zzgerVar2.i - zzgerVar2.k) + motionEvent.getRawY()) - motionEvent.getY())) / ((double) displayMetrics.density));
                                    if (jRound7 != 0) {
                                        xz1VarV.d();
                                        ((z0) xz1VarV.b).L(jRound7);
                                    }
                                }
                            }
                        }
                        vz1Var.d();
                        ((b1) vz1Var.b).O((z0) xz1VarV.e());
                        zzges[] zzgesVarArr = (zzges[]) map.get("ro");
                        if (zzgesVarArr != null) {
                            if (displayMetrics == null || displayMetrics.density == 0.0f) {
                                z = false;
                            }
                            if (z) {
                                for (int i3 = 0; i3 <= zzgesVarArr.length - 2; i3++) {
                                    zzges zzgesVar = zzgesVarArr[i3];
                                    xz1 xz1VarV2 = z0.v();
                                    double d2 = zzgesVar.a;
                                    if (displayMetrics == null) {
                                        throw null;
                                    }
                                    long jRound8 = Math.round(d2 / ((double) displayMetrics.density));
                                    xz1VarV2.d();
                                    ((z0) xz1VarV2.b).w(jRound8);
                                    long jRound9 = Math.round(((double) zzgesVar.b) / ((double) displayMetrics.density));
                                    xz1VarV2.d();
                                    ((z0) xz1VarV2.b).x(jRound9);
                                    z0 z0Var = (z0) xz1VarV2.e();
                                    vz1Var.d();
                                    ((b1) vz1Var.b).P(z0Var);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public gz2(vz1 vz1Var, zzgfx zzgfxVar, Map map, DisplayMetrics displayMetrics, f6 f6Var) {
        super("HAMf3XP8KIibPGIFc5yJF+oNVlSUbFLkUHSZdrZ2Dhl4Bh9ge4/6z6Usrb+mfprj", "vYv0JfNJ2rw4TIvbzqBhbKW0tXWLxxqXfI+gpZUSK1Y=", vz1Var, zzgfxVar, f6Var.a(123));
        this.h = zzgfxVar;
        this.g = map;
        this.i = displayMetrics;
    }
}
