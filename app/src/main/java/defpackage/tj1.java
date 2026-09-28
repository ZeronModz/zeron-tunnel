package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.camera2.internal.o;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.b;
import androidx.dynamicanimation.animation.a;
import androidx.startup.Initializer;
import androidx.startup.StartupException;
import androidx.viewbinding.ViewBinding;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.nonagon.signalgeneration.zzab;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import com.google.android.gms.ads.nonagon.signalgeneration.zzay;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbuu;
import com.google.android.gms.internal.ads.zzbvd;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzbvp;
import com.google.android.gms.internal.ads.zzbwf;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzcxl;
import com.google.android.gms.internal.ads.zzczm;
import com.google.android.gms.internal.ads.zzdbf;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdmc;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzdyo;
import com.google.android.gms.internal.ads.zzefx;
import com.google.android.gms.internal.ads.zzegd;
import com.google.android.gms.internal.ads.zzeiu;
import com.google.android.gms.internal.ads.zzelt;
import com.google.android.gms.internal.ads.zzfik;
import com.google.android.gms.internal.ads.zzfil;
import com.google.android.gms.internal.ads.zzfmk;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzika;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import com.google.common.collect.ImmutableList;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.proto.c;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class tj1 implements CallbackToFutureAdapter$Resolver, FutureCallback, ViewBinding, BaseGmsClient$BaseConnectionCallbacks, MediationAdLoadCallback, zzefx, zzfik, zzab, zzdhc, zzfmu, zzdmc {
    public static volatile tj1 e;
    public static final Object f = new Object();
    public static final ds g = new ds(0);
    public static final es h = new es(0);
    public static tj1 i;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public tj1(BitMatrix bitMatrix) throws FormatException {
        int i2;
        int i3;
        this.a = 4;
        int i4 = bitMatrix.b;
        if (i4 < 8 || i4 > 144 || (i2 = i4 & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        int i5 = bitMatrix.a;
        km1[] km1VarArr = km1.h;
        if (i2 != 0 || (i5 & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        km1[] km1VarArr2 = km1.h;
        for (int i6 = 0; i6 < 48; i6++) {
            km1 km1Var = km1VarArr2[i6];
            int i7 = km1Var.b;
            if (i7 == i4 && (i3 = km1Var.c) == i5) {
                this.d = km1Var;
                if (bitMatrix.b != i7) {
                    u7.r("Dimension of bitMatrix must match the version size");
                    throw null;
                }
                int i8 = km1Var.d;
                int i9 = km1Var.e;
                int i10 = i7 / i8;
                int i11 = i3 / i9;
                BitMatrix bitMatrix2 = new BitMatrix(i11 * i9, i10 * i8);
                for (int i12 = 0; i12 < i10; i12++) {
                    int i13 = i12 * i8;
                    for (int i14 = 0; i14 < i11; i14++) {
                        int i15 = i14 * i9;
                        for (int i16 = 0; i16 < i8; i16++) {
                            int i17 = ((i8 + 2) * i12) + 1 + i16;
                            int i18 = i13 + i16;
                            for (int i19 = 0; i19 < i9; i19++) {
                                if (bitMatrix.b(((i9 + 2) * i14) + 1 + i19, i17)) {
                                    bitMatrix2.h(i15 + i19, i18);
                                }
                            }
                        }
                    }
                }
                this.b = bitMatrix2;
                this.c = new BitMatrix(bitMatrix2.a, bitMatrix2.b);
                return;
            }
        }
        throw FormatException.getFormatInstance();
    }

    public static tj1 e(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        tj1 tj1Var = new tj1(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) tj1Var.c)) {
            try {
                ((ArrayDeque) tj1Var.c).clear();
                String string = ((SharedPreferences) tj1Var.b).getString("topic_operation_queue", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                if (!TextUtils.isEmpty(string) && string.contains(",")) {
                    String[] strArrSplit = string.split(",", -1);
                    int length = strArrSplit.length;
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) tj1Var.c).add(str);
                        }
                    }
                    return tj1Var;
                }
                return tj1Var;
            } finally {
            }
        }
    }

    public static tj1 i(Context context) {
        if (e == null) {
            synchronized (f) {
                try {
                    if (e == null) {
                        e = new tj1(context);
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public static void k() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    public void a(long j, String str) {
        d(str, String.valueOf(j));
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(b bVar) {
        bVar.a(new g6(this, 13), fy.b());
        ((ic0) this.d).a.set(bVar);
        return "HandlerScheduledFuture-" + ((Callable) this.c).toString();
    }

    public boolean b(String str) {
        boolean zAdd;
        if (TextUtils.isEmpty(str) || str.contains(",")) {
            return false;
        }
        synchronized (((ArrayDeque) this.c)) {
            zAdd = ((ArrayDeque) this.c).add(str);
            if (zAdd) {
                ((ScheduledThreadPoolExecutor) this.d).execute(new j60(this, 19));
            }
        }
        return zAdd;
    }

    public void c(Object obj, String str) {
        tj1 tj1Var = new tj1(8);
        ((tj1) this.d).d = tj1Var;
        this.d = tj1Var;
        tj1Var.b = obj;
        tj1Var.c = str;
    }

    public void d(String str, String str2) {
        gr0 gr0Var = new gr0(8);
        ((tj1) this.d).d = gr0Var;
        this.d = gr0Var;
        gr0Var.b = str2;
        gr0Var.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r3 = super.equals(r4)
            return r3
        La:
            java.lang.Object r0 = r3.b
            java.lang.reflect.GenericDeclaration r0 = (java.lang.reflect.GenericDeclaration) r0
            java.lang.Object r1 = r3.c
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = defpackage.sj1.a
            if (r2 == 0) goto L55
            if (r4 == 0) goto L71
            java.lang.Class r2 = r4.getClass()
            boolean r2 = java.lang.reflect.Proxy.isProxyClass(r2)
            if (r2 == 0) goto L71
            java.lang.reflect.InvocationHandler r2 = java.lang.reflect.Proxy.getInvocationHandler(r4)
            boolean r2 = r2 instanceof defpackage.uj1
            if (r2 == 0) goto L71
            java.lang.reflect.InvocationHandler r4 = java.lang.reflect.Proxy.getInvocationHandler(r4)
            uj1 r4 = (defpackage.uj1) r4
            tj1 r4 = r4.a
            java.lang.Object r2 = r4.c
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L71
            java.lang.Object r1 = r4.b
            java.lang.reflect.GenericDeclaration r1 = (java.lang.reflect.GenericDeclaration) r1
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            java.lang.Object r3 = r3.d
            com.google.common.collect.ImmutableList r3 = (com.google.common.collect.ImmutableList) r3
            java.lang.Object r4 = r4.d
            com.google.common.collect.ImmutableList r4 = (com.google.common.collect.ImmutableList) r4
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L71
            goto L6f
        L55:
            boolean r3 = r4 instanceof java.lang.reflect.TypeVariable
            if (r3 == 0) goto L71
            java.lang.reflect.TypeVariable r4 = (java.lang.reflect.TypeVariable) r4
            java.lang.String r3 = r4.getName()
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L71
            java.lang.reflect.GenericDeclaration r3 = r4.getGenericDeclaration()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L71
        L6f:
            r3 = 1
            goto L72
        L71:
            r3 = 0
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj1.equals(java.lang.Object):boolean");
    }

    public void f(Bundle bundle) {
        HashSet hashSet = (HashSet) this.c;
        String string = ((Context) this.d).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (Initializer.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    g((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new StartupException(e2);
            }
        }
    }

    public Object g(Class cls, HashSet hashSet) {
        Object objCreate;
        HashMap map = (HashMap) this.b;
        if (k02.r()) {
            try {
                Trace.beginSection(k02.y(cls.getSimpleName()));
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                Initializer initializer = (Initializer) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends Initializer<?>>> listDependencies = initializer.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends Initializer<?>> cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            g(cls2, hashSet);
                        }
                    }
                }
                objCreate = initializer.create((Context) this.d);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th) {
                throw new StartupException(th);
            }
        }
        return objCreate;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return (FrameLayout) this.b;
    }

    public byte[] h(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new c(byteArrayOutputStream, (HashMap) this.b, (HashMap) this.c, (ObjectEncoder) this.d).g(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        switch (this.a) {
            case 0:
                return ((String) this.c).hashCode() ^ ((GenericDeclaration) this.b).hashCode();
            default:
                return super.hashCode();
        }
    }

    public String j() {
        String str;
        synchronized (((ArrayDeque) this.c)) {
            str = (String) ((ArrayDeque) this.c).peek();
        }
        return str;
    }

    public boolean l(int i2, int i3, int i4, int i5) {
        if (i2 < 0) {
            i2 += i4;
            i3 += 4 - ((i4 + 4) & 7);
        }
        if (i3 < 0) {
            i3 += i5;
            i2 += 4 - ((i5 + 4) & 7);
        }
        if (i2 >= i4) {
            i2 -= i4;
        }
        ((BitMatrix) this.c).h(i3, i2);
        return ((BitMatrix) this.b).b(i3, i2);
    }

    public int m(int i2, int i3, int i4, int i5) {
        int i6 = i2 - 2;
        int i7 = i3 - 2;
        int i8 = (l(i6, i7, i4, i5) ? 1 : 0) << 1;
        int i9 = i3 - 1;
        if (l(i6, i9, i4, i5)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        int i11 = i2 - 1;
        if (l(i11, i7, i4, i5)) {
            i10 |= 1;
        }
        int i12 = i10 << 1;
        if (l(i11, i9, i4, i5)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (l(i11, i3, i4, i5)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (l(i2, i7, i4, i5)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (l(i2, i9, i4, i5)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        return l(i2, i3, i4, i5) ? i16 | 1 : i16;
    }

    public boolean n(Object obj) {
        boolean zRemove;
        synchronized (((ArrayDeque) this.c)) {
            zRemove = ((ArrayDeque) this.c).remove(obj);
            if (zRemove) {
                ((ScheduledThreadPoolExecutor) this.d).execute(new j60(this, 19));
            }
        }
        return zRemove;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public void onConnected(Bundle bundle) {
        l00 l00Var = (l00) this.d;
        synchronized (l00Var.c) {
            try {
                if (l00Var.a) {
                    return;
                }
                l00Var.a = true;
                t12 t12Var = (t12) l00Var.b;
                if (t12Var == null) {
                    return;
                }
                ta2 ta2Var = g3.a;
                u12 u12Var = (u12) this.b;
                w12 w12Var = (w12) this.c;
                w12Var.a.addListener(new s33(w12Var, 12, ta2Var.zza(new mu1(this, t12Var, u12Var, w12Var, 7)), false), g3.g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(AdError adError) {
        switch (this.a) {
            case 19:
                try {
                    String canonicalName = ((Adapter) this.c).getClass().getCanonicalName();
                    int code = adError.getCode();
                    String message = adError.getMessage();
                    String domain = adError.getDomain();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(code).length() + 17 + String.valueOf(message).length() + 16 + String.valueOf(domain).length());
                    sb.append(canonicalName);
                    sb.append("failed to load mediation ad: ErrorCode = ");
                    sb.append(code);
                    sb.append(". ErrorMessage = ");
                    sb.append(message);
                    sb.append(". ErrorDomain = ");
                    sb.append(domain);
                    zzo.zzd(sb.toString());
                    zzbtz zzbtzVar = (zzbtz) this.b;
                    zzbtzVar.zzx(adError.zza());
                    zzbtzVar.zzw(adError.getCode(), adError.getMessage());
                    zzbtzVar.zzg(adError.getCode());
                } catch (RemoteException e2) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e2);
                }
                break;
            case 20:
                try {
                    ((zzbvj) this.b).zzg(adError.zza());
                } catch (RemoteException e3) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e3);
                    return;
                }
                break;
            case 21:
                try {
                    ((zzbvd) this.b).zzg(adError.zza());
                } catch (RemoteException e4) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
                    return;
                }
                break;
            default:
                try {
                    ((zzbvp) this.b).zzg(adError.zza());
                } catch (RemoteException e5) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e5);
                    return;
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public /* synthetic */ Object onSuccess(Object obj) {
        int i2 = 25;
        switch (this.a) {
            case 19:
                zzbtz zzbtzVar = (zzbtz) this.b;
                try {
                    ((zzbuu) this.d).j = (MediationInterscrollerAd) obj;
                    zzbtzVar.zzj();
                } catch (RemoteException e2) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e2);
                }
                break;
            case 20:
                zzbvj zzbvjVar = (zzbvj) this.b;
                MediationInterstitialAd mediationInterstitialAd = (MediationInterstitialAd) obj;
                if (mediationInterstitialAd != null) {
                    try {
                        ((zzbwf) this.d).c = mediationInterstitialAd;
                        zzbvjVar.zze();
                    } catch (RemoteException e3) {
                        zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e3);
                    }
                } else {
                    zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        zzbvjVar.zzf("Adapter returned null.");
                    } catch (RemoteException e4) {
                        zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
                        return null;
                    }
                }
                break;
            case 21:
                zzbvd zzbvdVar = (zzbvd) this.b;
                MediationAppOpenAd mediationAppOpenAd = (MediationAppOpenAd) obj;
                if (mediationAppOpenAd != null) {
                    try {
                        ((zzbwf) this.d).e = mediationAppOpenAd;
                        zzbvdVar.zze();
                    } catch (RemoteException e5) {
                        zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e5);
                    }
                } else {
                    zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        zzbvdVar.zzf("Adapter returned null.");
                    } catch (RemoteException e6) {
                        zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
                        return null;
                    }
                }
                break;
            default:
                zzbvp zzbvpVar = (zzbvp) this.b;
                MediationRewardedAd mediationRewardedAd = (MediationRewardedAd) obj;
                if (mediationRewardedAd != null) {
                    try {
                        ((zzbwf) this.d).d = mediationRewardedAd;
                        zzbvpVar.zze();
                    } catch (RemoteException e7) {
                        zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e7);
                    }
                } else {
                    zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        zzbvpVar.zzf("Adapter returned null.");
                    } catch (RemoteException e8) {
                        zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e8);
                        return null;
                    }
                }
                break;
        }
        return new jx2((zzbtz) this.c, i2);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return (String) this.c;
            case 9:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.c);
                sb.append('{');
                tj1 tj1Var = (tj1) ((tj1) this.b).d;
                String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                while (tj1Var != null) {
                    Object obj = tj1Var.b;
                    sb.append(str);
                    String str2 = (String) tj1Var.c;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    tj1Var = (tj1) tj1Var.d;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 10:
                String str3 = (String) this.d;
                String str4 = (String) this.c;
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.b;
                if (uri != null) {
                    sb2.append(" uri=");
                    sb2.append(uri.toString());
                }
                if (str4 != null) {
                    sb2.append(" action=");
                    sb2.append(str4);
                }
                if (str3 != null) {
                    sb2.append(" mimetype=");
                    sb2.append(str3);
                }
                sb2.append(" }");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefx
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public lo2 mo78zza() {
        gd2 gd2Var = (gd2) this.b;
        se3 se3Var = gd2Var.l;
        nc2 nc2Var = gd2Var.b;
        fg2 fg2Var = (fg2) this.d;
        Context context = (Context) nc2Var.c;
        k02.J(context);
        ta2 ta2Var = g3.b;
        k02.J(ta2Var);
        ta2 ta2Var2 = g3.a;
        k02.J(ta2Var2);
        zzika zzikaVarB = se3.b(fg2Var);
        VersionInfoParcel versionInfoParcel = (VersionInfoParcel) nc2Var.b;
        k02.J(versionInfoParcel);
        return new lo2(context, ta2Var, ta2Var2, zzikaVarB, versionInfoParcel, this, (zzdxz) se3Var.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzefx
    public zzegd zzb() {
        return new td2((gd2) this.b, (tj1) this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzfik
    public /* bridge */ /* synthetic */ zzfik zzc(Context context) {
        context.getClass();
        this.d = context;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public /* bridge */ /* synthetic */ zzab zzc(oh2 oh2Var) {
        this.c = oh2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfik
    public /* synthetic */ zzfik zzb(String str) {
        this.c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    /* JADX INFO: renamed from: zzb, reason: collision with other method in class */
    public tt2 mo79zzb() {
        return (tt2) this.c;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public /* bridge */ /* synthetic */ zzab zzb(zzay zzayVar) {
        this.d = zzayVar;
        return this;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public void onConnectionSuspended(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzfik
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public zzfil mo77zza() {
        k02.M(Context.class, (Context) this.d);
        return new i31((gd2) this.b, (Context) this.d, (String) this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    public Object zza(Object obj) {
        zzeiu zzeiuVar = (zzeiu) this.b;
        zzu zzuVar = (zzu) this.d;
        String str = (String) this.c;
        zzeiuVar.getClass();
        zzeiuVar.b.execute(new wq((SQLiteDatabase) obj, 12, str, zzuVar));
        return null;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public zzac zza() {
        k02.M(oh2.class, (oh2) this.c);
        k02.M(zzay.class, (zzay) this.d);
        zzay zzayVar = (zzay) this.d;
        new zzcxl();
        new zzczm();
        new zzdyo();
        return new wd2((gd2) this.b, zzayVar, (oh2) this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo3zza(Object obj) {
        ((zzdbf) obj).zzd((zzcad) this.b, (String) this.c, (String) this.d);
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public void zza(boolean z, Context context, zzdbs zzdbsVar) {
        try {
            zzt.zzb();
            zzn.zza(context, (AdOverlayInfoParcel) ((zzcen) this.b).a.get(), true, ((zzelt) this.d).e);
        } catch (Exception unused) {
        }
    }

    public /* synthetic */ tj1(zzeiu zzeiuVar, zzu zzuVar, String str) {
        this.a = 28;
        this.b = zzeiuVar;
        this.d = zzuVar;
        this.c = str;
    }

    public /* synthetic */ tj1(Object obj, int i2, Object obj2, Object obj3) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ tj1(Object obj, Object obj2, Object obj3, int i2, boolean z) {
        this.a = i2;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public tj1(gd2 gd2Var) {
        this.a = 23;
        this.c = this;
        this.b = gd2Var;
        ee2 ee2Var = new ee2(gd2Var.W, 18);
        sc2 sc2Var = gd2Var.h;
        zzfmk zzfmkVar = pu2.a;
        int i2 = dd2.a;
        xc2 xc2Var = gd2Var.V;
        se3 se3Var = gd2Var.X;
        int i3 = bd2.a;
        this.d = new fg2((zzikp) sc2Var, (zzikp) xc2Var, (zzikg) ee2Var, (zzikp) se3Var, (zzikp) gd2Var.v, 8);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    /* JADX INFO: renamed from: onSuccess */
    public void mo18onSuccess(Object obj) {
        ((androidx.camera.view.c) this.d).e = null;
    }

    public /* synthetic */ tj1(gd2 gd2Var, int i2) {
        this.a = i2;
        this.b = gd2Var;
    }

    public /* synthetic */ tj1(int i2) {
        this.a = i2;
    }

    public tj1(Intent intent) {
        this.a = 10;
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.b = data;
        this.c = action;
        this.d = type;
    }

    public tj1(FileStore fileStore) {
        this.a = 2;
        this.c = null;
        this.d = null;
        this.b = fileStore;
    }

    public tj1(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.a = 15;
        this.c = new ArrayDeque();
        this.b = sharedPreferences;
        this.d = scheduledThreadPoolExecutor;
    }

    public tj1(Context context, LocationManager locationManager) {
        this.a = 16;
        this.d = new dh1();
        this.b = context;
        this.c = locationManager;
    }

    public tj1(Context context) {
        this.a = 1;
        this.d = context.getApplicationContext();
        this.c = new HashSet();
        this.b = new HashMap();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(String str) {
        switch (this.a) {
            case 19:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 20:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 21:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            default:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
        }
    }

    public tj1(String str) {
        this.a = 9;
        tj1 tj1Var = new tj1(8);
        this.b = tj1Var;
        this.d = tj1Var;
        this.c = str;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        ((androidx.camera.view.c) this.d).e = null;
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((CameraInfoInternal) ((CameraInfo) this.c)).removeSessionCaptureCallback((CameraCaptureCallback) it.next());
        }
        arrayList.clear();
    }

    public tj1(nx2 nx2Var) {
        this.a = 3;
        this.b = nx2Var;
        this.c = Choreographer.getInstance();
        this.d = new a(this);
    }

    public tj1(GenericDeclaration genericDeclaration, String str, Type[] typeArr) {
        this.a = 0;
        com.google.common.reflect.b.a(typeArr, "bound for type variable");
        genericDeclaration.getClass();
        this.b = genericDeclaration;
        str.getClass();
        this.c = str;
        this.d = ImmutableList.copyOf(typeArr);
    }

    public tj1(y6 y6Var) {
        this.a = 5;
        this.d = y6Var;
        this.c = new AtomicBoolean(false);
        this.b = ((o) y6Var.c).d.schedule(new w2(this, 6), 2000L, TimeUnit.MILLISECONDS);
    }
}
