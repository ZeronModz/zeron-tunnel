package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.LongSparseArray;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import coil3.BitmapImage;
import coil3.DrawableImage;
import coil3.Image;
import coil3.ImageDrawable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.f0;
import com.google.android.gms.internal.ads.f7;
import com.google.android.gms.internal.ads.g7;
import com.google.android.gms.internal.ads.zzalf;
import com.google.android.gms.internal.ads.zzbhq;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzffx;
import com.google.android.gms.internal.ads.zzga;
import com.google.android.gms.internal.ads.zzgb;
import com.google.android.gms.internal.ads.zzgn;
import com.google.android.gms.internal.ads.zzguc;
import com.google.android.gms.internal.ads.zzguf;
import com.google.android.gms.internal.ads.zzhnp;
import com.google.android.gms.stats.WakeLock;
import com.google.android.material.transition.platform.a;
import io.ktor.utils.io.ByteReadChannel;
import java.util.Objects;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import javax.crypto.Mac;
import org.slf4j.Logger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class j03 implements CallbackToFutureAdapter$Resolver, zzhnp {
    public static WakeLock d;
    public static Field i;
    public static boolean j;
    public static Class k;
    public static boolean l;
    public static Field m;
    public static boolean n;
    public static Field o;
    public static boolean p;
    public static final a a = new a(0);
    public static final a b = new a(1);
    public static final Object c = new Object();
    public static final byte[] e = {0, 0, 0, 1};
    public static final float[] f = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object g = new Object();
    public static int[] h = new int[10];

    public static void A(zzbht zzbhtVar, zzbhq zzbhqVar, String... strArr) {
        if (zzbhqVar == null) {
            return;
        }
        zzbhtVar.a(zzbhqVar, zzt.zzk().elapsedRealtime(), strArr);
    }

    public static void B(AtomicReference atomicReference, zzffx zzffxVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzffxVar.zza(obj);
        } catch (RemoteException e2) {
            zzo.zzl("#007 Could not call remote method.", e2);
        } catch (NullPointerException e3) {
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e3);
        }
    }

    public static zzhnp D(r83 r83Var) {
        ic3 ic3Var = r83Var.b;
        t83 t83Var = new t83(((hc3) ic3Var.b).b());
        try {
            Provider providerR = if3.R();
            if (providerR == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance("AESCMAC", providerR);
            return new mo2(18, t83Var, new mo2(((hc3) ic3Var.b).b(), providerR));
        } catch (GeneralSecurityException unused) {
            return t83Var;
        }
    }

    public static void E(int i2, int i3) {
        String strN;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strN = n8.N("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    u7.r(vh.i(i3, "negative size: ", new StringBuilder(String.valueOf(i3).length() + 15)));
                    return;
                }
                strN = n8.N("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strN);
        }
    }

    public static int G(yk3 yk3Var) {
        String strZ = Z(yk3Var);
        if (Objects.equals(strZ, "video/avc")) {
            return 1;
        }
        return Objects.equals(strZ, "video/hevc") ? 2 : 0;
    }

    public static final void H(StringBuilder sb, Iterator it, String str) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) str);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e2) {
            u7.g(e2);
        }
    }

    public static void J(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? N(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? N(i3, i4, "end index") : n8.N("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static boolean L(byte[] bArr, int i2, yk3 yk3Var) {
        int i3;
        String str = yk3Var.m;
        if (Objects.equals(str, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i3 = b2 & 31) == 1 || i3 == 9 || i3 == 14)) {
                return false;
            }
        } else if (Objects.equals(str, "video/hevc")) {
            zzga zzgaVarW = W(new zzgn(bArr, 4, i2 + 4));
            int i4 = zzgaVarW.a;
            if (i4 == 35) {
                return false;
            }
            if (i4 <= 14 && i4 % 2 == 0 && zzgaVarW.c == yk3Var.D - 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016c A[PHI: r2
      0x016c: PHI (r2v6 int) = (r2v4 int), (r2v3 int) binds: [B:87:0x0171, B:83:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016f A[PHI: r2
      0x016f: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v7 int) binds: [B:74:0x0156, B:76:0x015a, B:78:0x015e, B:80:0x0162, B:82:0x0166, B:84:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzgl M(int r32, int r33, byte[] r34) {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j03.M(int, int, byte[]):com.google.android.gms.internal.ads.zzgl");
    }

    public static String N(int i2, int i3, String str) {
        if (i2 < 0) {
            return n8.N("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return n8.N("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        u7.r(vh.i(i3, "negative size: ", new StringBuilder(String.valueOf(i3).length() + 15)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzgj P(int r36, int r37, byte[] r38) {
        /*
            Method dump skipped, instruction units count: 2161
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j03.P(int, int, byte[]):com.google.android.gms.internal.ads.zzgj");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzgg R(byte[] r35, int r36, int r37, com.google.android.gms.internal.ads.zzgj r38) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j03.R(byte[], int, int, com.google.android.gms.internal.ads.zzgj):com.google.android.gms.internal.ads.zzgg");
    }

    public static int T(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        n8.A0(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            U(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            U(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            U(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    U(zArr);
                    return i7;
                }
                i6 = i7;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    public static void U(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String V(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = (byte[]) list.get(i2);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i3 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                int i4 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i4 >= length2) {
                        break;
                    }
                    int iT = T(bArr, i4, length2, zArr);
                    if (iT != length2) {
                        zzgucVar.a(Integer.valueOf(iT));
                    }
                    i4 = iT + 3;
                }
                zzguf zzgufVarF = zzgucVar.f();
                for (int i5 = 0; i5 < zzgufVarF.size(); i5++) {
                    if (((Integer) zzgufVarF.get(i5)).intValue() + 3 < length) {
                        zzgn zzgnVar = new zzgn(bArr, ((Integer) zzgufVarF.get(i5)).intValue() + 3, length);
                        zzga zzgaVarW = W(zzgnVar);
                        if (zzgaVarW.a == 33 && zzgaVarW.b == 0) {
                            zzgnVar.b(4);
                            int iE = zzgnVar.e(3);
                            zzgnVar.a();
                            zzgb zzgbVarX = X(zzgnVar, true, iE, null);
                            return rj2.a(zzgbVarX.a, zzgbVarX.b, zzgbVarX.c, zzgbVarX.d, zzgbVarX.e, zzgbVarX.f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static zzga W(zzgn zzgnVar) {
        zzgnVar.a();
        return new zzga(zzgnVar.e(6), zzgnVar.e(6), zzgnVar.e(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzgb X(com.google.android.gms.internal.ads.zzgn r18, boolean r19, int r20, com.google.android.gms.internal.ads.zzgb r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L41
            r2 = 2
            int r2 = r0.e(r2)
            boolean r7 = r0.d()
            r8 = 5
            int r8 = r0.e(r8)
            r9 = r6
            r10 = r9
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r0.d()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = r6
        L2f:
            if (r9 >= r3) goto L3a
            int r11 = r0.e(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            r12 = r2
        L3b:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L55
        L41:
            if (r2 == 0) goto L4f
            int r3 = r2.a
            boolean r7 = r2.b
            int r8 = r2.c
            int r10 = r2.d
            int[] r4 = r2.e
            r12 = r3
            goto L3b
        L4f:
            r16 = r4
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L55:
            int r17 = r0.e(r5)
            r2 = r6
        L5a:
            if (r6 >= r1) goto L6f
            boolean r3 = r0.d()
            if (r3 == 0) goto L64
            int r2 = r2 + 88
        L64:
            boolean r3 = r0.d()
            if (r3 == 0) goto L6c
            int r2 = r2 + 8
        L6c:
            int r6 = r6 + 1
            goto L5a
        L6f:
            r0.b(r2)
            if (r1 <= 0) goto L79
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.b(r5)
        L79:
            com.google.android.gms.internal.ads.zzgb r11 = new com.google.android.gms.internal.ads.zzgb
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j03.X(com.google.android.gms.internal.ads.zzgn, boolean, int, com.google.android.gms.internal.ads.zzgb):com.google.android.gms.internal.ads.zzgb");
    }

    public static void Y(zzgn zzgnVar) {
        int iG = zzgnVar.g() + 1;
        zzgnVar.b(8);
        for (int i2 = 0; i2 < iG; i2++) {
            zzgnVar.g();
            zzgnVar.g();
            zzgnVar.a();
        }
        zzgnVar.b(20);
    }

    public static String Z(yk3 yk3Var) {
        String str;
        String str2 = yk3Var.m;
        if (Objects.equals(str2, "video/dolby-vision") && (str = yk3Var.j) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return "video/avc";
            }
            if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return str2;
    }

    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final Drawable b(Image image, Resources resources) {
        return image instanceof DrawableImage ? ((DrawableImage) image).a : image instanceof BitmapImage ? new BitmapDrawable(resources, ((BitmapImage) image).a) : new ImageDrawable(image);
    }

    public static final Image c(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new BitmapImage(((BitmapDrawable) drawable).getBitmap(), true) : new DrawableImage(drawable, false);
    }

    public static final void e(ByteReadChannel byteReadChannel) {
        byteReadChannel.getClass();
        byteReadChannel.cancel(new IOException("Channel was cancelled"));
    }

    public static void f(Context context) {
        if (d == null) {
            WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            d = wakeLock;
            synchronized (wakeLock.a) {
                wakeLock.g = true;
            }
        }
    }

    public static void g(Intent intent) {
        synchronized (c) {
            try {
                if (d != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    d.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final File h(Context context, String str) {
        context.getClass();
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static void i(Object obj) {
        LongSparseArray longSparseArray;
        if (!l) {
            try {
                k = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            l = true;
        }
        Class cls = k;
        if (cls == null) {
            return;
        }
        if (!n) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                m = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            n = true;
        }
        Field field = m;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static Intent j(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strL = l(context, componentName);
        if (strL == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strL);
        return l(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static Intent k(AppCompatActivity appCompatActivity) {
        Intent parentActivityIntent = appCompatActivity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strL = l(appCompatActivity, appCompatActivity.getComponentName());
            if (strL == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(appCompatActivity, strL);
            try {
                return l(appCompatActivity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String l(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2 >= 29 ? 269222528 : i2 >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static Object m(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static boolean n() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean o() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static final boolean p(Logger logger) {
        logger.getClass();
        return logger.isTraceEnabled();
    }

    public static String q(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i2 = 0;
        for (int i3 = 0; i3 < objArr.length; i3++) {
            Object obj = objArr[i3];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    java.util.logging.Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e2);
                    StringBuilder sbX = vh.x("<", str2, " threw ");
                    sbX.append(e2.getClass().getName());
                    sbX.append(">");
                    string = sbX.toString();
                }
            }
            objArr[i3] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i4 = 0;
        while (i2 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i4)) != -1) {
            sb.append((CharSequence) strValueOf, i4, iIndexOf);
            sb.append(objArr[i2]);
            i4 = iIndexOf + 2;
            i2++;
        }
        sb.append((CharSequence) strValueOf, i4, strValueOf.length());
        if (i2 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void s(Context context, er1 er1Var, Intent intent) {
        synchronized (c) {
            try {
                f(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    d.a();
                }
                er1Var.b(intent).o(new q21(intent, 8));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void t(Window window, boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            u1.n(window, z);
        } else {
            if (i2 >= 30) {
                u1.m(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static ComponentName v(Context context, Intent intent) {
        synchronized (c) {
            try {
                f(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    d.a();
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final char[] x(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = str.charAt(i2);
        }
        return cArr;
    }

    public static int y(int i2, byte[] bArr) {
        int i3;
        synchronized (g) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    try {
                        if (i4 >= i2 - 2) {
                            i4 = i2;
                            break;
                        }
                        int i6 = i4 + 1;
                        if (bArr[i4] == 0 && bArr[i6] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4 = i6;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArrCopyOf = h;
                    int length = iArrCopyOf.length;
                    if (length <= i5) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, length + length);
                        h = iArrCopyOf;
                    }
                    iArrCopyOf[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = h[i9] - i7;
                System.arraycopy(bArr, i7, bArr, i8, i10);
                int i11 = i8 + i10;
                int i12 = i11 + 1;
                bArr[i11] = 0;
                i8 = i11 + 2;
                bArr[i12] = 0;
                i7 += i10 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i8, i3 - i8);
        }
        return i3;
    }

    public static String z(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        String str = null;
        boolean z = false;
        while (it.hasNext()) {
            String str2 = ((zzalf) it.next()).a.g.m;
            if (f0.b(str2)) {
                return "video/mp4";
            }
            if (f0.a(str2)) {
                z = true;
            } else if (f0.c(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    public abstract void C(h33 h33Var, Thread thread);

    public abstract void F(h33 h33Var, h33 h33Var2);

    public abstract boolean I(g7 g7Var, h33 h33Var, h33 h33Var2);

    public abstract boolean K(f7 f7Var, d33 d33Var, d33 d33Var2);

    public abstract h33 O(f7 f7Var);

    public abstract d33 Q(f7 f7Var);

    public abstract boolean S(g7 g7Var, Object obj, Object obj2);

    public boolean d() {
        return false;
    }

    public abstract void u();

    public abstract void w();

    public void r() {
    }
}
