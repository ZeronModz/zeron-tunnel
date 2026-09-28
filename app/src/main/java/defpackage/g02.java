package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.b1;
import com.google.android.gms.internal.ads.j1;
import com.google.android.gms.internal.ads.z0;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazc;
import com.google.android.gms.internal.ads.zzaze;
import com.google.android.gms.internal.ads.zzazk;
import com.google.android.gms.internal.ads.zzbaa;
import com.google.android.gms.internal.ads.zzbab;
import com.google.android.gms.internal.ads.zzbac;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbau;
import com.google.android.gms.internal.ads.zzbav;
import com.google.android.gms.internal.ads.zzbaw;
import com.google.android.gms.internal.ads.zzbax;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbaz;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbbb;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbbe;
import com.google.android.gms.internal.ads.zzbbf;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.ads.zzbbh;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbj;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbbl;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbo;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbbq;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.ads.zzbbt;
import com.google.android.gms.internal.ads.zzbbu;
import com.google.android.gms.internal.ads.zzbbv;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class g02 implements zzazc {
    public static long A = 0;
    public static h02 B = null;
    public static v02 C = null;
    public static zzbal D = null;
    public static zzaye E = null;
    public static zzazk F = null;
    public static volatile t02 x = null;
    public static final Object y = new Object();
    public static boolean z = false;
    public MotionEvent a;
    public double j;
    public double k;
    public double l;
    public float m;
    public float n;
    public float o;
    public float p;
    public final DisplayMetrics s;
    public final zzbac t;
    public final zzaze u;
    public zzbar v;
    public final HashMap w;
    public final LinkedList b = new LinkedList();
    public long c = 0;
    public long d = 0;
    public long e = 0;
    public long f = 0;
    public long g = 0;
    public long h = 0;
    public long i = 0;
    public boolean q = false;
    public boolean r = false;

    public g02(Context context, zzaze zzazeVar) {
        try {
            j1.a();
            this.s = context.getResources().getDisplayMetrics();
            if (((Boolean) zzbd.zzc().a(p32.B3)).booleanValue()) {
                this.t = new zzbac();
            }
        } catch (Throwable unused) {
        }
        this.w = new HashMap();
        this.u = zzazeVar;
    }

    public static t02 h(Context context, boolean z2) {
        if (x == null) {
            synchronized (y) {
                try {
                    if (x == null) {
                        t02 t02VarA = t02.a(context, z2, F);
                        if (t02VarA.n) {
                            try {
                                if (((Boolean) zzbd.zzc().a(p32.f4)).booleanValue()) {
                                    t02VarA.c("EG2NhqmkZH3IzxVQRUhlLPeSdGNOmVVMlZvdVRoPMeBX1YRu4M6S9HAWzARuGlrt", "rJ+3epX9GIWpiD23zEqB2nJ57HosctKKCexIQaNPOnU=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            t02VarA.c("mKTuB4d9zL2gk2O79XsYpNB+aKHwN1U9hkAKPABelEWUf6fdcG0P932Axqt06R0v", "IhWvFwVDz7+S2dgPUyZdbvNgcZm/v4DQbcD3M8nxqCg=", Context.class);
                            if (((Boolean) zzbd.zzc().a(p32.n4)).booleanValue()) {
                                t02VarA.c("r3bKg5w0nz7IjZtWNMiPOsvB0VlHAYkN7VnU6Stu7HeDf3C1E2T8lLdAdxjkOACh", "v3VfjQtThhKzeCR8emHmzxqnaN2SnNbSp/OAufPeGKA=", new Class[0]);
                            }
                            t02VarA.c("BJ0iIx7YCr6PyW+pyNNozQaB62BBi5nixFl6WJUaFdU4X2GlfptGfOLgFJ7ri6Ag", "ovMA5nrmsfMPPc1p4911nPRjAFxE4I+3QWZwZMrn+uQ=", Context.class);
                            t02VarA.c("t0O1yTkaf8U85RYVI/Iw764S7xVo2UnzoC6xqdKHezEduB25T+k9NlupfapwCNk2", "NAFu5DHVi3o3yaFx1OCpv/KBsMCIhscKWxn1MzThPRk=", Context.class);
                            t02VarA.c("1zgOnWB50YTfrYi7hohk1+6dBIPxt34hX6y8yjUFyxGuxbHgbh6iUx1TaFIrLKll", "2AwwIe7av6W3pdyOMr9aVntj24MOb2beINimmdYpluE=", Context.class);
                            t02VarA.c("KMUeaeNiUI6XsUYhfNNPM5hdqwDfiAVXu+jtj2XrbalwiO+unml0DNmATqQtDmlU", "B4oRQazYGo5C2idQuGW+PTqNOD34GvbDXi8fMMTvLXo=", Context.class);
                            Class cls = Boolean.TYPE;
                            t02VarA.c("Vt16THtmezzLb1zgD4XzuhSMrHLGIQcDJNqtzF8G+1UgPRnrYaZemyLPsebqTPQi", "+oRdA7B1eJk1uXzj6xFlex4QQoiHLhoEiFmCoqVQP54=", Context.class, cls);
                            t02VarA.c("WAcniJw/GaiqIp9OLpCOBQZL84JUYDjTztoPXXS1J2Z88XAmBTXkRw892qBHqVl7", "XsRFkPGR/9DtQdRlTgBn2CYNiaiyrwSr5Bve6m5X61U=", Context.class);
                            t02VarA.c("YcvOy2Y9scoLzd9aO/r1q51CuRDPgptfjUczBG/4u9TSMf5O8lCrtIMZ2+ctDcs+", "6V7/ExCl9vngHnxEtX1goXpmDP9bA02eRvmHfr0qsgM=", Context.class);
                            t02VarA.c("VBBl/RSrrbh4NuoCpwv4Ff9uwlR+nIgvPASME/UcMSWtAZ4zziFv8sIkhiXD3JGh", "adtakVLQMMHz1yZrv+u5ZZiabjtFTP38FJEsPLAtvHE=", MotionEvent.class, DisplayMetrics.class);
                            t02VarA.c("cyl6+Nm7z/4AUMU9zZ2TYBK+lMXXrSwSgLNSZTdnB4C/ax/Gmzarui2kcSD53JXu", "gJiy+5nUzzsm5alaQ5ciO1Z43m3zAJgcxxPvmvUS+Vo=", MotionEvent.class, DisplayMetrics.class);
                            t02VarA.c("KS95o7MbZWIdKuBkGY5EucArwEmarpDzvrPJlr4r6NTEwXHZ52g0Gof8SUaYNmWh", "sZhcPfATNezp7ZcisFX7I2sqsKQPBRrUcm6y3tpw6ig=", new Class[0]);
                            t02VarA.c("R0KTYl+9Bi7RshEQmYhK/YeVyfjIkHliDPJVeC+XBbAz0q1EMlAcoZ8JeP0fdmTX", "AARE3CI7+7Fq5atzy8wcVAJTjdNJGGNM3rGztRoG23E=", new Class[0]);
                            t02VarA.c("yZXKjkpxohkfNrA4/dntjy5UGv8pEqMsOsdSv+5n+sZgEYNlImB4QjlGv7rNs0BZ", "qPvuYJ0m6OwVM7zFkNMQ820WzknyvHgBl013Si7b8nM=", new Class[0]);
                            t02VarA.c("FynI9c5fEiMzQz2B7twhubBCGA6OmnD4m4mZd8FrJbuEtgSrrhq+E+F7XsfWYfqR", "1Y9Pw3JU+olt+lWU2l7rblcsXGsm1mQtokTJIYT27m0=", new Class[0]);
                            t02VarA.c("iVzH00FGTIijHIZ0HS5SItMsN9AyuHOn1xXwzbhHf6Eq/l9FiFSlfrw2j7G806j4", "RyZVSwEZZgeTR1V/DRrjgM5Yqk49vWkiFPpVljbz9Uo=", new Class[0]);
                            t02VarA.c("WpK2JUF8iJ/BvX1YbpvZEg/OwGEi7DqWo1w6qvQxAhqdLxv0KDJfeHynFcOHsF/r", "eAfiSXYP9RekAEzlsFTPbe7e0Y1hgLoRWRhxsNjDqkg=", new Class[0]);
                            t02VarA.c("ZQJAB1msowxCz8mqmvl8OKnBprztAFjM8nst6XEIBWdYMrqlQRx5Smd7STWtlGuv", "xxbBAKX4fynezd8sgu9AN42lCipqUqelmvdX3g0EV6w=", Context.class, cls, String.class);
                            t02VarA.c("TnO68f+IpvRRkyv0ANYwkK+/mU2YJddrRcZ9TNokdmi5eEzcRJBPehtgPhuxRZAE", "PILFsXLzYdqBxxfwB9b+jT5mnzLC4LU5UXMk7tC1zw8=", StackTraceElement[].class);
                            t02VarA.c("FW20C8Ai9koIlsaxQSE6ztByFAH2b9HaWXnzViOGstPwi5iqItbLmay/ubT2VSsg", "WvzwBqCGqiupQVgrtkQ81CPfk2zDbRT3OzniCOJeuxU=", View.class, DisplayMetrics.class, cls, cls);
                            t02VarA.c("bor0O3H3y0qG5UIppgg8bI1z9WuHvZ9oSRl8MpYl5RU5HMZyWKOlyAU+eSAgxME2", "IUDkN9+rDzK4GSONwoR6w/25ruQD7QnRgetY7oPkg7w=", Context.class, cls);
                            t02VarA.c("v55I7GonHWsamYbBtyIFKaZFQR/sofAKKTQsUzMKV1C6iCJ1v6Vqzq9x9meUl2ez", "Z7zWno+0eCAtcsPK71T7clKp8ZTgICQrdpeo5cTQYQo=", View.class, Activity.class, cls);
                            t02VarA.c("X3d3ekEggpPfZcTTuZPSKX+MUCnQGNsbyccHnkW7iVTfczCTjKoxcgVjpAE8Uhyz", "I4rncSeVGoKv0gEJ8Xd0rq9G0kL2Ky2ley3iuTG83Dg=", Long.TYPE);
                            t02VarA.c("x/S3A4n6lbyzTdn/kz8tPqUf3a1YB5vAd5r7wQYCBb3DYPiGQZB67fbWL/+XFcZ5", "kB0lJ6HHV2i/5ncg76cGz3oLPH/Yq3P6CviApgv8Ipc=", new Class[0]);
                            try {
                                if (((Boolean) zzbd.zzc().a(p32.i4)).booleanValue()) {
                                    t02VarA.c("EHHl2bnow3CY535hCiXXbLjuydxFlVXitu9AIkBq9ZFdEOrgtrbiSayxFpjmKRmo", "ioEU79oGVeaIBBGOjKcBP85gZ/aumGq7/t+0LJZeQ5M=", Context.class);
                                }
                            } catch (IllegalStateException unused2) {
                            }
                            t02VarA.c("9zQJNYPRQu7M2PxsR2X5pUd2hUmUxo++JOxzNqkh3zn646wyxpHEbvjQqLWoAge2", "vZPGoOEoDBpprn4Bn8baCi1LGHgj6zo4y/AsLq2W9n8=", Context.class);
                            try {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    if (((Boolean) zzbd.zzc().a(p32.j4)).booleanValue()) {
                                        Class cls2 = Long.TYPE;
                                        t02VarA.c("MHYgRB9ZLJ711MlDBgDgyPDdkDVVlHwuqDeF/1i1ByNixJnhURH1lj12DYAv6vPJ", "+dsC4zlVzClLb/gffysp/RM/1OAwcqKcuzzXTv3qmQk=", NetworkCapabilities.class, cls2, cls2);
                                    }
                                }
                            } catch (IllegalStateException unused3) {
                            }
                            try {
                                if (((Boolean) zzbd.zzc().a(p32.B3)).booleanValue()) {
                                    t02VarA.c("mt+WJZ1rsk0A64GmF9v+ldp/SXHcK6tYIctDM1+NeYG+QzoGvdHV21P9oFWIcCVk", "JGpzBcqG4jzyQyzoEbT5NvLNZXRWAW3o2QUKET83n6Q=", List.class);
                                }
                            } catch (IllegalStateException unused4) {
                            }
                            if (((Boolean) zzbd.zzc().a(p32.s3)).booleanValue()) {
                                Class cls3 = Long.TYPE;
                                t02VarA.c("uAqKAtpzCVdzsQfO3VsjAegcR1bzJIPV7WnBpdLTTlepVA45FMcx2CHHUDw9JuIC", "/PvocKqER/fglRgbozHO01MU+uyxr0WG8/b5JQrvhOY=", cls3, cls3, cls3, cls3);
                            } else {
                                try {
                                    if (((Boolean) zzbd.zzc().a(p32.r3)).booleanValue()) {
                                        t02VarA.c("mWKvHkCTlhia7UFG1tX8rmkp9AizD6H5C2Y+fxk0U+Y2fZze528QNyV6FTMftwOj", "NhSpQvE4PaXaFqOsSIcuQESqMAyvT+VdhFhpwrR61iU=", long[].class, Context.class, View.class);
                                    }
                                } catch (IllegalStateException unused5) {
                                }
                            }
                        }
                        x = t02VarA;
                    }
                } finally {
                }
            }
        }
        return x;
    }

    public static zzbam i(t02 t02Var, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws zzbaa {
        Method methodD = t02Var.d("VBBl/RSrrbh4NuoCpwv4Ff9uwlR+nIgvPASME/UcMSWtAZ4zziFv8sIkhiXD3JGh", "adtakVLQMMHz1yZrv+u5ZZiabjtFTP38FJEsPLAtvHE=");
        if (methodD == null || motionEvent == null) {
            throw new zzbaa();
        }
        try {
        } catch (IllegalAccessException | InvocationTargetException e) {
            e = e;
        }
        try {
            return new zzbam((String) methodD.invoke(null, motionEvent, displayMetrics));
        } catch (InvocationTargetException e2) {
            e = e2;
            throw new zzbaa(e);
        }
    }

    public static final void k(List list) {
        ExecutorService executorService;
        if (x == null || (executorService = x.b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) zzbd.zzc().a(p32.n3)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            stringWriter.toString();
        }
    }

    public final vz1 a(Context context) {
        long j;
        long j2;
        v02 v02Var = C;
        if (v02Var != null && v02Var.d) {
            v02Var.b = System.currentTimeMillis();
        }
        if (((Boolean) zzbd.zzc().a(p32.s3)).booleanValue()) {
            zzbal zzbalVar = D;
            zzbalVar.b = zzbalVar.a;
            zzbalVar.a = SystemClock.uptimeMillis();
        }
        vz1 vz1VarU0 = b1.u0();
        zzaze zzazeVar = this.u;
        String str = zzazeVar.b;
        if (!TextUtils.isEmpty(str)) {
            vz1VarU0.d();
            ((b1) vz1VarU0.b).x0(str);
        }
        t02 t02VarH = h(context, zzazeVar.a);
        if (t02VarH.b == null) {
            return vz1VarU0;
        }
        int iE = t02VarH.e();
        ArrayList arrayList = new ArrayList();
        if (t02VarH.n) {
            arrayList.add(new zzbay(t02VarH, "ZQJAB1msowxCz8mqmvl8OKnBprztAFjM8nst6XEIBWdYMrqlQRx5Smd7STWtlGuv", "xxbBAKX4fynezd8sgu9AN42lCipqUqelmvdX3g0EV6w=", vz1VarU0, iE, 27, context, null, zzazeVar.c, E));
            arrayList.add(new zzbbb(t02VarH, "KS95o7MbZWIdKuBkGY5EucArwEmarpDzvrPJlr4r6NTEwXHZ52g0Gof8SUaYNmWh", "sZhcPfATNezp7ZcisFX7I2sqsKQPBRrUcm6y3tpw6ig=", vz1VarU0, A, iE, 25));
            arrayList.add(new zzbbl(t02VarH, "yZXKjkpxohkfNrA4/dntjy5UGv8pEqMsOsdSv+5n+sZgEYNlImB4QjlGv7rNs0BZ", "qPvuYJ0m6OwVM7zFkNMQ820WzknyvHgBl013Si7b8nM=", vz1VarU0, iE, 1));
            arrayList.add(new zzbbo(t02VarH, "t0O1yTkaf8U85RYVI/Iw764S7xVo2UnzoC6xqdKHezEduB25T+k9NlupfapwCNk2", "NAFu5DHVi3o3yaFx1OCpv/KBsMCIhscKWxn1MzThPRk=", vz1VarU0, iE, 31, context));
            arrayList.add(new zzbbt(t02VarH, "R0KTYl+9Bi7RshEQmYhK/YeVyfjIkHliDPJVeC+XBbAz0q1EMlAcoZ8JeP0fdmTX", "AARE3CI7+7Fq5atzy8wcVAJTjdNJGGNM3rGztRoG23E=", vz1VarU0, iE, 33));
            arrayList.add(new zzbax(t02VarH, "BJ0iIx7YCr6PyW+pyNNozQaB62BBi5nixFl6WJUaFdU4X2GlfptGfOLgFJ7ri6Ag", "ovMA5nrmsfMPPc1p4911nPRjAFxE4I+3QWZwZMrn+uQ=", vz1VarU0, iE, 29, context));
            arrayList.add(new zzbaz(t02VarH, "1zgOnWB50YTfrYi7hohk1+6dBIPxt34hX6y8yjUFyxGuxbHgbh6iUx1TaFIrLKll", "2AwwIe7av6W3pdyOMr9aVntj24MOb2beINimmdYpluE=", vz1VarU0, iE, 5));
            arrayList.add(new zzbbk(t02VarH, "KMUeaeNiUI6XsUYhfNNPM5hdqwDfiAVXu+jtj2XrbalwiO+unml0DNmATqQtDmlU", "B4oRQazYGo5C2idQuGW+PTqNOD34GvbDXi8fMMTvLXo=", vz1VarU0, iE, 12));
            arrayList.add(new zzbbm(t02VarH, "Vt16THtmezzLb1zgD4XzuhSMrHLGIQcDJNqtzF8G+1UgPRnrYaZemyLPsebqTPQi", "+oRdA7B1eJk1uXzj6xFlex4QQoiHLhoEiFmCoqVQP54=", vz1VarU0, iE, 3));
            arrayList.add(new zzbba(t02VarH, "FynI9c5fEiMzQz2B7twhubBCGA6OmnD4m4mZd8FrJbuEtgSrrhq+E+F7XsfWYfqR", "1Y9Pw3JU+olt+lWU2l7rblcsXGsm1mQtokTJIYT27m0=", vz1VarU0, iE, 44));
            arrayList.add(new zzbbg(t02VarH, "iVzH00FGTIijHIZ0HS5SItMsN9AyuHOn1xXwzbhHf6Eq/l9FiFSlfrw2j7G806j4", "RyZVSwEZZgeTR1V/DRrjgM5Yqk49vWkiFPpVljbz9Uo=", vz1VarU0, iE, 22));
            arrayList.add(new zzbbu(t02VarH, "WAcniJw/GaiqIp9OLpCOBQZL84JUYDjTztoPXXS1J2Z88XAmBTXkRw892qBHqVl7", "XsRFkPGR/9DtQdRlTgBn2CYNiaiyrwSr5Bve6m5X61U=", vz1VarU0, iE, 48));
            arrayList.add(new zzbaw(t02VarH, "YcvOy2Y9scoLzd9aO/r1q51CuRDPgptfjUczBG/4u9TSMf5O8lCrtIMZ2+ctDcs+", "6V7/ExCl9vngHnxEtX1goXpmDP9bA02eRvmHfr0qsgM=", vz1VarU0, iE, 49));
            arrayList.add(new zzbbr(t02VarH, "WpK2JUF8iJ/BvX1YbpvZEg/OwGEi7DqWo1w6qvQxAhqdLxv0KDJfeHynFcOHsF/r", "eAfiSXYP9RekAEzlsFTPbe7e0Y1hgLoRWRhxsNjDqkg=", vz1VarU0, iE, 51));
            arrayList.add(new zzbbp(t02VarH, "bor0O3H3y0qG5UIppgg8bI1z9WuHvZ9oSRl8MpYl5RU5HMZyWKOlyAU+eSAgxME2", "IUDkN9+rDzK4GSONwoR6w/25ruQD7QnRgetY7oPkg7w=", vz1VarU0, iE, 61));
            if (Build.VERSION.SDK_INT >= 24) {
                if (((Boolean) zzbd.zzc().a(p32.j4)).booleanValue()) {
                    v02 v02Var2 = C;
                    if (v02Var2 != null) {
                        long j3 = v02Var2.d ? v02Var2.b - v02Var2.a : -1L;
                        long j4 = v02Var2.c;
                        v02Var2.c = -1L;
                        j = j3;
                        j2 = j4;
                    } else {
                        j = -1;
                        j2 = -1;
                    }
                    arrayList.add(new zzbbj(t02VarH, "MHYgRB9ZLJ711MlDBgDgyPDdkDVVlHwuqDeF/1i1ByNixJnhURH1lj12DYAv6vPJ", "+dsC4zlVzClLb/gffysp/RM/1OAwcqKcuzzXTv3qmQk=", vz1VarU0, iE, 11, B, j, j2));
                }
            }
            if (((Boolean) zzbd.zzc().a(p32.i4)).booleanValue()) {
                arrayList.add(new zzbbn(t02VarH, "EHHl2bnow3CY535hCiXXbLjuydxFlVXitu9AIkBq9ZFdEOrgtrbiSayxFpjmKRmo", "ioEU79oGVeaIBBGOjKcBP85gZ/aumGq7/t+0LJZeQ5M=", vz1VarU0, iE, 73));
            }
            arrayList.add(new zzbbh(t02VarH, "9zQJNYPRQu7M2PxsR2X5pUd2hUmUxo++JOxzNqkh3zn646wyxpHEbvjQqLWoAge2", "vZPGoOEoDBpprn4Bn8baCi1LGHgj6zo4y/AsLq2W9n8=", vz1VarU0, iE, 76));
            if (((Boolean) zzbd.zzc().a(p32.m4)).booleanValue()) {
                arrayList.add(new zzbav(t02VarH, "x/S3A4n6lbyzTdn/kz8tPqUf3a1YB5vAd5r7wQYCBb3DYPiGQZB67fbWL/+XFcZ5", "kB0lJ6HHV2i/5ncg76cGz3oLPH/Yq3P6CviApgv8Ipc=", vz1VarU0, iE, 89));
            }
            if (((Boolean) zzbd.zzc().a(p32.n4)).booleanValue()) {
                arrayList.add(new zzbbc(t02VarH, "r3bKg5w0nz7IjZtWNMiPOsvB0VlHAYkN7VnU6Stu7HeDf3C1E2T8lLdAdxjkOACh", "v3VfjQtThhKzeCR8emHmzxqnaN2SnNbSp/OAufPeGKA=", vz1VarU0, iE, 82));
            }
        } else {
            vz1VarU0.h(16384L);
        }
        k(arrayList);
        return vz1VarU0;
    }

    public final vz1 b(Context context, View view, Activity activity) {
        v02 v02Var = C;
        if (v02Var != null && v02Var.d) {
            v02Var.b = System.currentTimeMillis();
        }
        if (((Boolean) zzbd.zzc().a(p32.s3)).booleanValue()) {
            zzbal zzbalVar = D;
            zzbalVar.h = zzbalVar.g;
            zzbalVar.g = SystemClock.uptimeMillis();
        }
        vz1 vz1VarU0 = b1.u0();
        zzaze zzazeVar = this.u;
        String str = zzazeVar.b;
        if (!TextUtils.isEmpty(str)) {
            vz1VarU0.d();
            ((b1) vz1VarU0.b).x0(str);
        }
        j(h(context, zzazeVar.a), vz1VarU0, view, activity, true, context);
        return vz1VarU0;
    }

    public final vz1 c(Context context, View view, Activity activity) {
        v02 v02Var = C;
        if (v02Var != null && v02Var.d) {
            v02Var.b = System.currentTimeMillis();
        }
        if (((Boolean) zzbd.zzc().a(p32.s3)).booleanValue()) {
            D.a(context, view);
        }
        vz1 vz1VarU0 = b1.u0();
        zzaze zzazeVar = this.u;
        String str = zzazeVar.b;
        vz1VarU0.d();
        ((b1) vz1VarU0.b).x0(str);
        j(h(context, zzazeVar.a), vz1VarU0, view, activity, false, context);
        return vz1VarU0;
    }

    public final zzbam d(MotionEvent motionEvent) throws zzbaa {
        Method methodD = x.d("cyl6+Nm7z/4AUMU9zZ2TYBK+lMXXrSwSgLNSZTdnB4C/ax/Gmzarui2kcSD53JXu", "gJiy+5nUzzsm5alaQ5ciO1Z43m3zAJgcxxPvmvUS+Vo=");
        if (methodD == null || motionEvent == null) {
            throw new zzbaa();
        }
        try {
            try {
                return new zzbam((String) methodD.invoke(null, motionEvent, this.s));
            } catch (InvocationTargetException e) {
                e = e;
                throw new zzbaa(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            e = e2;
        }
    }

    public final long e(StackTraceElement[] stackTraceElementArr) throws zzbaa {
        Method methodD = x.d("TnO68f+IpvRRkyv0ANYwkK+/mU2YJddrRcZ9TNokdmi5eEzcRJBPehtgPhuxRZAE", "PILFsXLzYdqBxxfwB9b+jT5mnzLC4LU5UXMk7tC1zw8=");
        if (methodD == null || stackTraceElementArr == null) {
            throw new zzbaa();
        }
        try {
            try {
                return new zzbab((String) methodD.invoke(null, stackTraceElementArr)).a.longValue();
            } catch (InvocationTargetException e) {
                e = e;
                throw new zzbaa(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            e = e2;
        }
    }

    public final void f() {
        this.g = 0L;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.h = 0L;
        this.i = 0L;
        LinkedList linkedList = this.b;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.a;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String g(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g02.g(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity):java.lang.String");
    }

    public final void j(t02 t02Var, vz1 vz1Var, View view, Activity activity, boolean z2, Context context) {
        List listAsList;
        long j;
        long j2;
        MotionEvent motionEvent;
        t02 t02Var2 = t02Var;
        vz1 vz1Var2 = vz1Var;
        if (t02Var2.n) {
            synchronized (this) {
                try {
                    try {
                        zzbam zzbamVarI = i(t02Var2, this.a, this.s);
                        Long l = zzbamVarI.a;
                        if (l != null) {
                            long jLongValue = l.longValue();
                            vz1Var2.d();
                            ((b1) vz1Var2.b).D0(jLongValue);
                        }
                        Long l2 = zzbamVarI.b;
                        if (l2 != null) {
                            long jLongValue2 = l2.longValue();
                            vz1Var2.d();
                            ((b1) vz1Var2.b).E0(jLongValue2);
                        }
                        Long l3 = zzbamVarI.c;
                        if (l3 != null) {
                            long jLongValue3 = l3.longValue();
                            vz1Var2.d();
                            ((b1) vz1Var2.b).F0(jLongValue3);
                        }
                        if (this.r) {
                            Long l4 = zzbamVarI.d;
                            if (l4 != null) {
                                long jLongValue4 = l4.longValue();
                                vz1Var2.d();
                                ((b1) vz1Var2.b).B(jLongValue4);
                            }
                            Long l5 = zzbamVarI.e;
                            if (l5 != null) {
                                long jLongValue5 = l5.longValue();
                                vz1Var2.d();
                                ((b1) vz1Var2.b).C(jLongValue5);
                            }
                        }
                    } catch (zzbaa unused) {
                    }
                    xz1 xz1VarV = z0.v();
                    if (this.c > 0) {
                        DisplayMetrics displayMetrics = this.s;
                        if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                            long jD0 = l02.d0(this.j, displayMetrics);
                            xz1VarV.d();
                            ((z0) xz1VarV.b).H(jD0);
                            long jD02 = l02.d0(this.o - this.m, this.s);
                            xz1VarV.d();
                            ((z0) xz1VarV.b).I(jD02);
                            long jD03 = l02.d0(this.p - this.n, this.s);
                            xz1VarV.d();
                            ((z0) xz1VarV.b).J(jD03);
                            long jD04 = l02.d0(this.m, this.s);
                            xz1VarV.d();
                            ((z0) xz1VarV.b).M(jD04);
                            long jD05 = l02.d0(this.n, this.s);
                            xz1VarV.d();
                            ((z0) xz1VarV.b).N(jD05);
                            if (this.r && (motionEvent = this.a) != null) {
                                long jD06 = l02.d0(((this.m - this.o) + motionEvent.getRawX()) - this.a.getX(), this.s);
                                if (jD06 != 0) {
                                    xz1VarV.d();
                                    ((z0) xz1VarV.b).K(jD06);
                                }
                                long jD07 = l02.d0(((this.n - this.p) + this.a.getRawY()) - this.a.getY(), this.s);
                                if (jD07 != 0) {
                                    xz1VarV.d();
                                    ((z0) xz1VarV.b).L(jD07);
                                }
                            }
                        }
                    }
                    try {
                        zzbam zzbamVarD = d(this.a);
                        Long l6 = zzbamVarD.a;
                        if (l6 != null) {
                            long jLongValue6 = l6.longValue();
                            xz1VarV.d();
                            ((z0) xz1VarV.b).w(jLongValue6);
                        }
                        Long l7 = zzbamVarD.b;
                        if (l7 != null) {
                            long jLongValue7 = l7.longValue();
                            xz1VarV.d();
                            ((z0) xz1VarV.b).x(jLongValue7);
                        }
                        long jLongValue8 = zzbamVarD.c.longValue();
                        xz1VarV.d();
                        ((z0) xz1VarV.b).D(jLongValue8);
                        if (this.r) {
                            Long l8 = zzbamVarD.e;
                            if (l8 != null) {
                                long jLongValue9 = l8.longValue();
                                xz1VarV.d();
                                ((z0) xz1VarV.b).y(jLongValue9);
                            }
                            Long l9 = zzbamVarD.d;
                            if (l9 != null) {
                                long jLongValue10 = l9.longValue();
                                xz1VarV.d();
                                ((z0) xz1VarV.b).B(jLongValue10);
                            }
                            Long l10 = zzbamVarD.f;
                            if (l10 != null) {
                                int i = l10.longValue() != 0 ? 2 : 1;
                                xz1VarV.d();
                                ((z0) xz1VarV.b).O(i);
                            }
                            long j3 = this.d;
                            if (j3 > 0) {
                                DisplayMetrics displayMetrics2 = this.s;
                                Long lValueOf = displayMetrics2 != null && (displayMetrics2.density > 0.0f ? 1 : (displayMetrics2.density == 0.0f ? 0 : -1)) != 0 ? Long.valueOf(Math.round(this.i / j3)) : null;
                                if (lValueOf != null) {
                                    long jLongValue11 = lValueOf.longValue();
                                    xz1VarV.d();
                                    ((z0) xz1VarV.b).z(jLongValue11);
                                } else {
                                    xz1VarV.d();
                                    ((z0) xz1VarV.b).A();
                                }
                                long jRound = Math.round(this.h / this.d);
                                xz1VarV.d();
                                ((z0) xz1VarV.b).C(jRound);
                            }
                            Long l11 = zzbamVarD.i;
                            if (l11 != null) {
                                long jLongValue12 = l11.longValue();
                                xz1VarV.d();
                                ((z0) xz1VarV.b).F(jLongValue12);
                            }
                            Long l12 = zzbamVarD.j;
                            if (l12 != null) {
                                long jLongValue13 = l12.longValue();
                                xz1VarV.d();
                                ((z0) xz1VarV.b).E(jLongValue13);
                            }
                            Long l13 = zzbamVarD.k;
                            if (l13 != null) {
                                int i2 = l13.longValue() != 0 ? 2 : 1;
                                xz1VarV.d();
                                ((z0) xz1VarV.b).P(i2);
                            }
                        }
                    } catch (zzbaa unused2) {
                    }
                    long j4 = this.g;
                    if (j4 > 0) {
                        xz1VarV.d();
                        ((z0) xz1VarV.b).G(j4);
                    }
                    z0 z0Var = (z0) xz1VarV.e();
                    vz1Var2.d();
                    ((b1) vz1Var2.b).O(z0Var);
                    long j5 = this.c;
                    if (j5 > 0) {
                        vz1Var2.d();
                        ((b1) vz1Var2.b).F(j5);
                    }
                    long j6 = this.d;
                    if (j6 > 0) {
                        vz1Var2.d();
                        ((b1) vz1Var2.b).E(j6);
                    }
                    long j7 = this.e;
                    if (j7 > 0) {
                        vz1Var2.d();
                        ((b1) vz1Var2.b).D(j7);
                    }
                    long j8 = this.f;
                    if (j8 > 0) {
                        vz1Var2.d();
                        ((b1) vz1Var2.b).G(j8);
                    }
                    try {
                        LinkedList linkedList = this.b;
                        int size = linkedList.size() - 1;
                        if (size > 0) {
                            vz1Var2.d();
                            ((b1) vz1Var2.b).Q();
                            for (int i3 = 0; i3 < size; i3++) {
                                zzbam zzbamVarI2 = i(x, (MotionEvent) linkedList.get(i3), this.s);
                                xz1 xz1VarV2 = z0.v();
                                long jLongValue14 = zzbamVarI2.a.longValue();
                                xz1VarV2.d();
                                ((z0) xz1VarV2.b).w(jLongValue14);
                                long jLongValue15 = zzbamVarI2.b.longValue();
                                xz1VarV2.d();
                                ((z0) xz1VarV2.b).x(jLongValue15);
                                z0 z0Var2 = (z0) xz1VarV2.e();
                                vz1Var2.d();
                                ((b1) vz1Var2.b).P(z0Var2);
                            }
                        }
                    } catch (zzbaa unused3) {
                        vz1Var2.d();
                        ((b1) vz1Var2.b).Q();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList();
            if (t02Var2.b != null) {
                int iE = t02Var2.e();
                if (((Boolean) zzbd.zzc().a(p32.A3)).booleanValue()) {
                    arrayList.add(new zzbay(t02Var2, "ZQJAB1msowxCz8mqmvl8OKnBprztAFjM8nst6XEIBWdYMrqlQRx5Smd7STWtlGuv", "xxbBAKX4fynezd8sgu9AN42lCipqUqelmvdX3g0EV6w=", vz1Var2, iE, 27, context, null, this.u.c, E));
                    arrayList.add(new zzbax(t02Var, "BJ0iIx7YCr6PyW+pyNNozQaB62BBi5nixFl6WJUaFdU4X2GlfptGfOLgFJ7ri6Ag", "ovMA5nrmsfMPPc1p4911nPRjAFxE4I+3QWZwZMrn+uQ=", vz1Var, iE, 29, context));
                    arrayList.add(new zzbbo(t02Var, "t0O1yTkaf8U85RYVI/Iw764S7xVo2UnzoC6xqdKHezEduB25T+k9NlupfapwCNk2", "NAFu5DHVi3o3yaFx1OCpv/KBsMCIhscKWxn1MzThPRk=", vz1Var, iE, 31, context));
                    arrayList.add(new zzbbt(t02Var, "R0KTYl+9Bi7RshEQmYhK/YeVyfjIkHliDPJVeC+XBbAz0q1EMlAcoZ8JeP0fdmTX", "AARE3CI7+7Fq5atzy8wcVAJTjdNJGGNM3rGztRoG23E=", vz1Var, iE, 33));
                    v02 v02Var = C;
                    if (v02Var != null) {
                        long j9 = v02Var.d ? v02Var.b - v02Var.a : -1L;
                        long j10 = v02Var.c;
                        v02Var.c = -1L;
                        j = j9;
                        j2 = j10;
                    } else {
                        j = -1;
                        j2 = -1;
                    }
                    t02Var2 = t02Var;
                    vz1Var2 = vz1Var;
                    arrayList.add(new zzbbj(t02Var2, "MHYgRB9ZLJ711MlDBgDgyPDdkDVVlHwuqDeF/1i1ByNixJnhURH1lj12DYAv6vPJ", "+dsC4zlVzClLb/gffysp/RM/1OAwcqKcuzzXTv3qmQk=", vz1Var2, iE, 11, B, j, j2));
                    arrayList.add(new zzbbn(t02Var2, "EHHl2bnow3CY535hCiXXbLjuydxFlVXitu9AIkBq9ZFdEOrgtrbiSayxFpjmKRmo", "ioEU79oGVeaIBBGOjKcBP85gZ/aumGq7/t+0LJZeQ5M=", vz1Var2, iE, 73));
                }
                arrayList.add(new zzbbd(t02Var2, vz1Var2));
                arrayList.add(new zzbbl(t02Var2, "yZXKjkpxohkfNrA4/dntjy5UGv8pEqMsOsdSv+5n+sZgEYNlImB4QjlGv7rNs0BZ", "qPvuYJ0m6OwVM7zFkNMQ820WzknyvHgBl013Si7b8nM=", vz1Var2, iE, 1));
                arrayList.add(new zzbbb(t02Var, "KS95o7MbZWIdKuBkGY5EucArwEmarpDzvrPJlr4r6NTEwXHZ52g0Gof8SUaYNmWh", "sZhcPfATNezp7ZcisFX7I2sqsKQPBRrUcm6y3tpw6ig=", vz1Var, A, iE, 25));
                arrayList.add(new zzbba(t02Var, "FynI9c5fEiMzQz2B7twhubBCGA6OmnD4m4mZd8FrJbuEtgSrrhq+E+F7XsfWYfqR", "1Y9Pw3JU+olt+lWU2l7rblcsXGsm1mQtokTJIYT27m0=", vz1Var, iE, 44));
                arrayList.add(new zzbbk(t02Var, "KMUeaeNiUI6XsUYhfNNPM5hdqwDfiAVXu+jtj2XrbalwiO+unml0DNmATqQtDmlU", "B4oRQazYGo5C2idQuGW+PTqNOD34GvbDXi8fMMTvLXo=", vz1Var, iE, 12));
                arrayList.add(new zzbbm(t02Var, "Vt16THtmezzLb1zgD4XzuhSMrHLGIQcDJNqtzF8G+1UgPRnrYaZemyLPsebqTPQi", "+oRdA7B1eJk1uXzj6xFlex4QQoiHLhoEiFmCoqVQP54=", vz1Var, iE, 3));
                arrayList.add(new zzbbg(t02Var, "iVzH00FGTIijHIZ0HS5SItMsN9AyuHOn1xXwzbhHf6Eq/l9FiFSlfrw2j7G806j4", "RyZVSwEZZgeTR1V/DRrjgM5Yqk49vWkiFPpVljbz9Uo=", vz1Var, iE, 22));
                arrayList.add(new zzbaz(t02Var, "1zgOnWB50YTfrYi7hohk1+6dBIPxt34hX6y8yjUFyxGuxbHgbh6iUx1TaFIrLKll", "2AwwIe7av6W3pdyOMr9aVntj24MOb2beINimmdYpluE=", vz1Var, iE, 5));
                arrayList.add(new zzbbu(t02Var, "WAcniJw/GaiqIp9OLpCOBQZL84JUYDjTztoPXXS1J2Z88XAmBTXkRw892qBHqVl7", "XsRFkPGR/9DtQdRlTgBn2CYNiaiyrwSr5Bve6m5X61U=", vz1Var, iE, 48));
                arrayList.add(new zzbaw(t02Var, "YcvOy2Y9scoLzd9aO/r1q51CuRDPgptfjUczBG/4u9TSMf5O8lCrtIMZ2+ctDcs+", "6V7/ExCl9vngHnxEtX1goXpmDP9bA02eRvmHfr0qsgM=", vz1Var, iE, 49));
                arrayList.add(new zzbbr(t02Var, "WpK2JUF8iJ/BvX1YbpvZEg/OwGEi7DqWo1w6qvQxAhqdLxv0KDJfeHynFcOHsF/r", "eAfiSXYP9RekAEzlsFTPbe7e0Y1hgLoRWRhxsNjDqkg=", vz1Var, iE, 51));
                arrayList.add(new zzbbq(t02Var, "TnO68f+IpvRRkyv0ANYwkK+/mU2YJddrRcZ9TNokdmi5eEzcRJBPehtgPhuxRZAE", "PILFsXLzYdqBxxfwB9b+jT5mnzLC4LU5UXMk7tC1zw8=", vz1Var, iE, 45, new Throwable().getStackTrace()));
                arrayList.add(new zzbbv(t02Var, "FW20C8Ai9koIlsaxQSE6ztByFAH2b9HaWXnzViOGstPwi5iqItbLmay/ubT2VSsg", "WvzwBqCGqiupQVgrtkQ81CPfk2zDbRT3OzniCOJeuxU=", vz1Var, iE, 57, view));
                arrayList.add(new zzbbp(t02Var, "bor0O3H3y0qG5UIppgg8bI1z9WuHvZ9oSRl8MpYl5RU5HMZyWKOlyAU+eSAgxME2", "IUDkN9+rDzK4GSONwoR6w/25ruQD7QnRgetY7oPkg7w=", vz1Var, iE, 61));
                if (((Boolean) zzbd.zzc().a(p32.o3)).booleanValue()) {
                    arrayList.add(new zzbau(t02Var, "v55I7GonHWsamYbBtyIFKaZFQR/sofAKKTQsUzMKV1C6iCJ1v6Vqzq9x9meUl2ez", "Z7zWno+0eCAtcsPK71T7clKp8ZTgICQrdpeo5cTQYQo=", vz1Var, iE, 62, view, activity));
                }
                if (((Boolean) zzbd.zzc().a(p32.m4)).booleanValue()) {
                    arrayList.add(new zzbav(t02Var, "x/S3A4n6lbyzTdn/kz8tPqUf3a1YB5vAd5r7wQYCBb3DYPiGQZB67fbWL/+XFcZ5", "kB0lJ6HHV2i/5ncg76cGz3oLPH/Yq3P6CviApgv8Ipc=", vz1Var, iE, 89));
                }
                if (!z2) {
                    try {
                        if (((Boolean) zzbd.zzc().a(p32.r3)).booleanValue()) {
                            arrayList.add(new zzbbf(t02Var, "mWKvHkCTlhia7UFG1tX8rmkp9AizD6H5C2Y+fxk0U+Y2fZze528QNyV6FTMftwOj", "NhSpQvE4PaXaFqOsSIcuQESqMAyvT+VdhFhpwrR61iU=", vz1Var, iE, 85, this.w, view, context));
                        }
                    } catch (IllegalStateException unused4) {
                    }
                    try {
                        if (((Boolean) zzbd.zzc().a(p32.s3)).booleanValue()) {
                            arrayList.add(new zzbbe(t02Var, "uAqKAtpzCVdzsQfO3VsjAegcR1bzJIPV7WnBpdLTTlepVA45FMcx2CHHUDw9JuIC", "/PvocKqER/fglRgbozHO01MU+uyxr0WG8/b5JQrvhOY=", vz1Var, iE, 85, D));
                        }
                    } catch (IllegalStateException unused5) {
                    }
                    if (((Boolean) zzbd.zzc().a(p32.B3)).booleanValue()) {
                        arrayList.add(new zzbbi(t02Var, "mt+WJZ1rsk0A64GmF9v+ldp/SXHcK6tYIctDM1+NeYG+QzoGvdHV21P9oFWIcCVk", "JGpzBcqG4jzyQyzoEbT5NvLNZXRWAW3o2QUKET83n6Q=", vz1Var, iE, 94, this.t));
                    }
                } else if (((Boolean) zzbd.zzc().a(p32.q3)).booleanValue()) {
                    arrayList.add(new zzbbs(t02Var, "X3d3ekEggpPfZcTTuZPSKX+MUCnQGNsbyccHnkW7iVTfczCTjKoxcgVjpAE8Uhyz", "I4rncSeVGoKv0gEJ8Xd0rq9G0kL2Ky2ley3iuTG83Dg=", vz1Var, iE, 53, this.v));
                }
            }
            listAsList = arrayList;
        } else {
            vz1Var2.h(16384L);
            listAsList = Arrays.asList(new zzbbd(t02Var2, vz1Var2));
        }
        k(listAsList);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final synchronized void zzd(MotionEvent motionEvent) {
        Long l;
        try {
            if (this.q) {
                f();
                this.q = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.j = 0.0d;
                this.k = motionEvent.getRawX();
                this.l = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d = rawX - this.k;
                double d2 = rawY - this.l;
                this.j += Math.sqrt((d2 * d2) + (d * d));
                this.k = rawX;
                this.l = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.a = motionEventObtain;
                        LinkedList linkedList = this.b;
                        linkedList.add(motionEventObtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.e++;
                        this.g = e(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.d += (long) (motionEvent.getHistorySize() + 1);
                        zzbam zzbamVarD = d(motionEvent);
                        Long l2 = zzbamVarD.d;
                        if (l2 != null && zzbamVarD.g != null) {
                            this.h = l2.longValue() + zzbamVarD.g.longValue() + this.h;
                        }
                        if (this.s != null && (l = zzbamVarD.e) != null && zzbamVarD.h != null) {
                            this.i = l.longValue() + zzbamVarD.h.longValue() + this.i;
                        }
                    } else if (action2 == 3) {
                        this.f++;
                    }
                } catch (zzbaa unused) {
                }
            } else {
                this.m = motionEvent.getX();
                this.n = motionEvent.getY();
                this.o = motionEvent.getRawX();
                this.p = motionEvent.getRawY();
                this.c++;
            }
            this.r = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final synchronized void zze(int i, int i2, int i3) {
        try {
            if (this.a != null) {
                if (((Boolean) zzbd.zzc().a(p32.k3)).booleanValue()) {
                    f();
                } else {
                    this.a.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.s;
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                this.a = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.a = null;
            }
            this.r = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzf(Context context, String str, View view, Activity activity) {
        return g(context, str, 3, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzg(Context context, String str, View view) {
        return g(context, str, 3, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzh(View view) {
        if (((Boolean) zzbd.zzc().a(p32.q3)).booleanValue()) {
            zzbar zzbarVar = this.v;
            if (zzbarVar == null) {
                t02 t02Var = x;
                zzbar zzbarVar2 = new zzbar(t02Var.a, t02Var.o);
                this.v = zzbarVar2;
                zzbarVar = zzbarVar2;
            }
            zzbarVar.a(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzbac zzbacVar;
        if (!((Boolean) zzbd.zzc().a(p32.B3)).booleanValue() || (zzbacVar = this.t) == null) {
            return;
        }
        zzbacVar.a = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzj(Context context, View view, Activity activity) {
        return g(context, null, 2, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzl(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return g(context, null, 1, null, null);
        }
        u7.p("The caller must not be called from the UI thread.");
        return null;
    }
}
