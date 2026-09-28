package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.internal.view.SupportMenu;
import androidx.core.util.Consumer;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.h;
import androidx.core.view.u;
import androidx.work.WorkerExceptionInfo;
import androidx.work.impl.utils.d;
import coil3.Uri;
import coil3.size.Dimension;
import coil3.size.Scale;
import coil3.size.Size;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzhxn;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.internal.measurement.zzaf;
import com.google.android.gms.internal.measurement.zzah;
import com.google.android.gms.internal.measurement.zzal;
import com.google.android.gms.internal.measurement.zzam;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.material.transition.platform.a;
import com.trilead.ssh2.sftp.AttribFlags;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import kotlin.text.g;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt$special$$inlined$Iterable$1;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.InlineClassDescriptor;
import okio.Path;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n8 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final a b = new a(4);
    public static final a c = new a(5);
    public static final int[] d = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] e = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final int[] f = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    public static final int[] g = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    public static final int[] h = {67108863, 33554431};
    public static final int[] i = {26, 25};

    public static void A(Parcel parcel, int i2, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iV = V(i2, parcel);
        parcel.writeBundle(bundle);
        e0(iV, parcel);
    }

    public static void A0(boolean z) {
        if (z) {
            return;
        }
        zg1.h();
    }

    public static void B(Parcel parcel, int i2, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iV = V(i2, parcel);
        parcel.writeByteArray(bArr);
        e0(iV, parcel);
    }

    public static Object B0(zzao zzaoVar) {
        if (zzao.zzg.equals(zzaoVar)) {
            return null;
        }
        if (zzao.zzf.equals(zzaoVar)) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (zzaoVar instanceof zzal) {
            return D0((zzal) zzaoVar);
        }
        if (!(zzaoVar instanceof zzae)) {
            return !zzaoVar.zzd().isNaN() ? zzaoVar.zzd() : zzaoVar.zzc();
        }
        ArrayList arrayList = new ArrayList();
        zzae zzaeVar = (zzae) zzaoVar;
        int i2 = 0;
        while (i2 < zzaeVar.c()) {
            if (i2 >= zzaeVar.c()) {
                s31.k(vh.i(i2, "Out of bounds index: ", new StringBuilder(String.valueOf(i2).length() + 21)));
                return null;
            }
            int i3 = i2 + 1;
            Object objB0 = B0(zzaeVar.d(i2));
            if (objB0 != null) {
                arrayList.add(objB0);
            }
            i2 = i3;
        }
        return arrayList;
    }

    public static void C(Parcel parcel, int i2, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iV = V(i2, parcel);
        parcel.writeStrongBinder(iBinder);
        e0(iV, parcel);
    }

    public static void C0(String str, boolean z) {
        if (z) {
            return;
        }
        u7.p(str);
    }

    public static void D(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int iV = V(i2, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(((Integer) list.get(i3)).intValue());
        }
        e0(iV, parcel);
    }

    public static HashMap D0(zzal zzalVar) {
        HashMap map = new HashMap();
        for (String str : new ArrayList(zzalVar.a.keySet())) {
            Object objB0 = B0(zzalVar.zzk(str));
            if (objB0 != null) {
                map.put(str, objB0);
            }
        }
        return map;
    }

    public static void E(Parcel parcel, int i2, Long l) {
        if (l == null) {
            return;
        }
        P(parcel, i2, 8);
        parcel.writeLong(l.longValue());
    }

    public static void E0(Object obj, String str) {
        if (obj != null) {
            return;
        }
        io0.e(str);
    }

    public static void F(Parcel parcel, int i2, Parcelable parcelable, int i3) {
        if (parcelable == null) {
            return;
        }
        int iV = V(i2, parcel);
        parcelable.writeToParcel(parcel, i3);
        e0(iV, parcel);
    }

    public static void F0(zzg zzgVar) {
        int iV0 = v0(zzgVar.g("runtime.counter").zzd().doubleValue() + 1.0d);
        if (iV0 <= 1000000) {
            zzgVar.e("runtime.counter", new zzah(Double.valueOf(iV0)));
        } else {
            u7.p("Instructions allowed exceeded");
        }
    }

    public static void G(Parcel parcel, int i2, String str) {
        if (str == null) {
            return;
        }
        int iV = V(i2, parcel);
        parcel.writeString(str);
        e0(iV, parcel);
    }

    public static void G0(int i2, int i3) {
        String strF;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strF = mu.F("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    u7.r(vh.i(i3, "negative size: ", new StringBuilder(String.valueOf(i3).length() + 15)));
                    return;
                }
                strF = mu.F("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strF);
        }
    }

    public static void H(Parcel parcel, int i2, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iV = V(i2, parcel);
        parcel.writeStringArray(strArr);
        e0(iV, parcel);
    }

    public static void H0(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            u7.i(J0(i2, i3, "index"));
        }
    }

    public static void I(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int iV = V(i2, parcel);
        parcel.writeStringList(list);
        e0(iV, parcel);
    }

    public static void I0(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? J0(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? J0(i3, i4, "end index") : mu.F("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static void J(Parcel parcel, int i2, Parcelable[] parcelableArr, int i3) {
        if (parcelableArr == null) {
            return;
        }
        int iV = V(i2, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i3);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        e0(iV, parcel);
    }

    public static String J0(int i2, int i3, String str) {
        if (i2 < 0) {
            return mu.F("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return mu.F("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        u7.r(vh.i(i3, "negative size: ", new StringBuilder(String.valueOf(i3).length() + 15)));
        return null;
    }

    public static void K(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int iV = V(i2, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Parcelable parcelable = (Parcelable) list.get(i3);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        e0(iV, parcel);
    }

    public static long L(String str) {
        String str2 = wt2.a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                u7.r("Expected 3 decimal places, got: ".concat(strTrim));
                return 0L;
            }
            j2 += Long.parseLong(strTrim);
        }
        return j2 * 1000;
    }

    public static Bundle M(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static String N(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(W(objArr[i2]));
            i3 = iIndexOf + 2;
            i2++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i2 < length) {
            String str2 = " [";
            while (i2 < objArr.length) {
                sb.append(str2);
                sb.append(W(objArr[i2]));
                i2++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void O(int i2) throws InvalidAlgorithmParameterException {
        if (i2 != 16 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i2 * 8)));
        }
    }

    public static void P(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    public static void Q(IObjectWrapper iObjectWrapper, Throwable th, String str) {
        z82.a((Context) com.google.android.gms.dynamic.a.d(iObjectWrapper)).zzi(th, str, ((Double) t42.f.g()).floatValue());
    }

    public static void R(String str, int i2, List list) {
        if (list.size() == i2) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i2 + " parameters found " + list.size());
    }

    public static void S(boolean z) {
        if (z) {
            return;
        }
        s31.c();
    }

    public static void T(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] + jArr3[i2];
        }
    }

    public static float U(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static int V(int i2, Parcel parcel) {
        parcel.writeInt(i2 | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static String W(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strT = vh.t(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strT), (Throwable) e2);
            String name2 = e2.getClass().getName();
            StringBuilder sb = new StringBuilder(strT.length() + 8 + name2.length() + 1);
            hz.H(sb, "<", strT, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d4, code lost:
    
        if (r12 != 3) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.cw1 X(com.google.android.gms.internal.ads.zzeq r12, boolean r13) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n8.X(com.google.android.gms.internal.ads.zzeq, boolean):cw1");
    }

    public static void Y(Bundle bundle, String str, String str2, boolean z) {
        if (!z || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static void Z(zzhxn zzhxnVar) throws GeneralSecurityException {
        int iOrdinal = zzhxnVar.ordinal();
        if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(zzhxnVar.name())));
        }
    }

    public static final InlineClassDescriptor a(String str, KSerializer kSerializer) {
        return new InlineClassDescriptor(str, new kg0(kSerializer));
    }

    public static void a0(String str, int i2, List list) {
        if (list.size() >= i2) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i2 + " parameters found " + list.size());
    }

    public static Uri b(String str) {
        String str2 = Path.c;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        return new Uri(sb.toString(), str2, "file", null, str, null, null);
    }

    public static void b0(String str, boolean z) {
        if (z) {
            return;
        }
        u7.r(str);
    }

    public static void c(AppCompatActivity appCompatActivity) {
        FrameLayout frameLayout = (FrameLayout) appCompatActivity.findViewById(R.id.content);
        if (frameLayout == null) {
            return;
        }
        View viewFindViewWithTag = frameLayout.findViewWithTag("navigation_bar_color_scrim");
        if (viewFindViewWithTag == null) {
            viewFindViewWithTag = new View(appCompatActivity);
            viewFindViewWithTag.setTag("navigation_bar_color_scrim");
            viewFindViewWithTag.setImportantForAccessibility(2);
            frameLayout.addView(viewFindViewWithTag, new FrameLayout.LayoutParams(-1, 0, 80));
        }
        viewFindViewWithTag.setBackgroundColor(appCompatActivity.getColor(dev.zeron.tunnel.R.color.navbar));
        s31 s31Var = new s31(10);
        WeakHashMap weakHashMap = h.a;
        cn1.m(viewFindViewWithTag, s31Var);
        an1.c(viewFindViewWithTag);
        appCompatActivity.getWindow().setNavigationBarColor(appCompatActivity.getColor(dev.zeron.tunnel.R.color.navbar));
        u uVar = new WindowInsetsControllerCompat(appCompatActivity.getWindow(), appCompatActivity.getWindow().getDecorView()).a;
        uVar.d(false);
        uVar.c(false);
    }

    public static void c0(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] - jArr3[i2];
        }
    }

    public static void d(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void d0(int i2) throws GeneralSecurityException {
        if (i2 < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", Integer.valueOf(i2)));
        }
        if (q63.a() && i2 != 2048 && i2 != 3072) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", Integer.valueOf(i2)));
        }
    }

    public static void e(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i2);
    }

    public static void e0(int i2, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(iDataPosition - i2);
        parcel.setDataPosition(iDataPosition);
    }

    public static void f(long j) {
        if (j >= 0) {
            return;
        }
        u7.r(hz.r(j, "distance cannot be negative but was: "));
    }

    public static void f0(Bundle bundle, String str, int i2, boolean z) {
        if (z) {
            bundle.putInt(str, i2);
        }
    }

    public static void g(int i2, String str) {
        if (i2 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " must be positive but was: " + i2);
    }

    public static void g0(String str, int i2, List list) {
        if (list.size() <= i2) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i2 + " parameters found " + list.size());
    }

    public static void h(boolean z) {
        cn0.s("no calls to next() since the last call to remove()", z);
    }

    public static void h0(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        long j = jArr[8];
        long j2 = jArr[18];
        long j3 = j + (j2 << 4);
        jArr[8] = j3;
        long j4 = j2 + j2 + j3;
        jArr[8] = j4;
        jArr[8] = j4 + j2;
        long j5 = jArr[7];
        long j6 = jArr[17];
        long j7 = j5 + (j6 << 4);
        jArr[7] = j7;
        long j8 = j6 + j6 + j7;
        jArr[7] = j8;
        jArr[7] = j8 + j6;
        long j9 = jArr[6];
        long j10 = jArr[16];
        long j11 = j9 + (j10 << 4);
        jArr[6] = j11;
        long j12 = j10 + j10 + j11;
        jArr[6] = j12;
        jArr[6] = j12 + j10;
        long j13 = jArr[5];
        long j14 = jArr[15];
        long j15 = j13 + (j14 << 4);
        jArr[5] = j15;
        long j16 = j14 + j14 + j15;
        jArr[5] = j16;
        jArr[5] = j16 + j14;
        long j17 = jArr[4];
        long j18 = jArr[14];
        long j19 = j17 + (j18 << 4);
        jArr[4] = j19;
        long j20 = j18 + j18 + j19;
        jArr[4] = j20;
        jArr[4] = j20 + j18;
        long j21 = jArr[3];
        long j22 = jArr[13];
        long j23 = j21 + (j22 << 4);
        jArr[3] = j23;
        long j24 = j22 + j22 + j23;
        jArr[3] = j24;
        jArr[3] = j24 + j22;
        long j25 = jArr[2];
        long j26 = jArr[12];
        long j27 = j25 + (j26 << 4);
        jArr[2] = j27;
        long j28 = j26 + j26 + j27;
        jArr[2] = j28;
        jArr[2] = j28 + j26;
        long j29 = jArr[1];
        long j30 = jArr[11];
        long j31 = j29 + (j30 << 4);
        jArr[1] = j31;
        long j32 = j30 + j30 + j31;
        jArr[1] = j32;
        jArr[1] = j32 + j30;
        long j33 = jArr[0];
        long j34 = jArr[10];
        long j35 = j33 + (j34 << 4);
        jArr[0] = j35;
        long j36 = j34 + j34 + j35;
        jArr[0] = j36;
        jArr[0] = j36 + j34;
        m0(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static byte[] i(ArrayDeque arrayDeque, int i2) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i2 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static int i0(zzeq zzeqVar) throws zzat {
        int iH = zzeqVar.h(4);
        if (iH == 15) {
            if (zzeqVar.b() >= 24) {
                return zzeqVar.h(24);
            }
            throw zzat.zzb("AAC header insufficient data", null);
        }
        if (iH < 13) {
            return d[iH];
        }
        throw zzat.zzb("AAC header wrong Sampling Frequency Index", null);
    }

    public static final long j(int i2, int i3, Size size, Scale scale, Size size2) {
        int i4;
        int i5;
        if (!yg0.a(size, Size.c)) {
            i2 = y(size.a, scale);
            i3 = y(size.b, scale);
        }
        Dimension dimension = size2.a;
        Dimension dimension2 = size2.b;
        if ((dimension instanceof cy) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i5 = ((cy) dimension).a)) {
            i2 = i5;
        }
        if ((dimension2 instanceof cy) && i3 != Integer.MIN_VALUE && i3 != Integer.MAX_VALUE && i3 > (i4 = ((cy) dimension2).a)) {
            i3 = i4;
        }
        return yg0.r(i2, i3);
    }

    public static void j0(int i2, String str, boolean z) {
        if (z) {
            return;
        }
        u7.r(mu.F(str, Integer.valueOf(i2)));
    }

    public static final double k(int i2, int i3, int i4, int i5, Scale scale) {
        double d2 = ((double) i4) / ((double) i2);
        double d3 = ((double) i5) / ((double) i3);
        int i6 = qu.a[scale.ordinal()];
        if (i6 == 1) {
            return Math.max(d2, d3);
        }
        if (i6 == 2) {
            return Math.min(d2, d3);
        }
        p60.b();
        return 0.0d;
    }

    public static void k0(Bundle bundle, String str, boolean z, boolean z2) {
        if (z2) {
            bundle.putBoolean(str, z);
        }
    }

    public static final int l(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        hy.c(c2, "Unexpected hex digit: ");
        return 0;
    }

    public static void l0(BigInteger bigInteger) throws GeneralSecurityException {
        if (!bigInteger.testBit(0)) {
            zg1.m("Public exponent must be odd.");
        } else {
            if (bigInteger.compareTo(BigInteger.valueOf(65536L)) > 0) {
                return;
            }
            zg1.m("Public exponent must be greater than 65536.");
        }
    }

    public static long m(byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9) {
        return ((((long) b3) & 255) << 48) | ((((long) b2) & 255) << 56) | ((((long) b4) & 255) << 40) | ((((long) b5) & 255) << 32) | ((((long) b6) & 255) << 24) | ((((long) b7) & 255) << 16) | ((((long) b8) & 255) << 8) | (((long) b9) & 255);
    }

    public static void m0(long[] jArr) {
        jArr[10] = 0;
        int i2 = 0;
        while (i2 < 10) {
            long j = jArr[i2];
            long j2 = j / 67108864;
            jArr[i2] = j - (j2 << 26);
            int i3 = i2 + 1;
            long j3 = jArr[i3] + j2;
            jArr[i3] = j3;
            long j4 = j3 / 33554432;
            jArr[i3] = j3 - (j4 << 25);
            i2 += 2;
            jArr[i2] = jArr[i2] + j4;
        }
        long j5 = jArr[0];
        long j6 = jArr[10];
        long j7 = j5 + (j6 << 4);
        jArr[0] = j7;
        long j8 = j6 + j6 + j7;
        jArr[0] = j8;
        long j9 = j8 + j6;
        jArr[0] = j9;
        jArr[10] = 0;
        long j10 = j9 / 67108864;
        jArr[0] = j9 - (j10 << 26);
        jArr[1] = jArr[1] + j10;
    }

    public static final int n(TextView textView) {
        textView.getClass();
        if (textView.getLayout() == null || textView.getLineHeight() == 0) {
            return 0;
        }
        int lineForVertical = textView.getLayout().getLineForVertical(textView.getHeight() + textView.getScrollY());
        if (lineForVertical < 0) {
            return 0;
        }
        return lineForVertical >= textView.getLineCount() ? textView.getLineCount() - 1 : lineForVertical;
    }

    public static boolean n0(zzao zzaoVar) {
        if (zzaoVar == null) {
            return false;
        }
        Double dZzd = zzaoVar.zzd();
        return !dZzd.isNaN() && dZzd.doubleValue() >= 0.0d && dZzd.equals(Double.valueOf(Math.floor(dZzd.doubleValue())));
    }

    public static final int[] o(NetworkRequest networkRequest) {
        networkRequest.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            return l5.a(networkRequest);
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 29; i2++) {
            int i3 = iArr[i2];
            if (d.b(networkRequest, i3)) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        return c.Q(arrayList);
    }

    public static zzbk o0(String str) {
        zzbk zzbkVarZza = (str == null || str.isEmpty()) ? null : zzbk.zza(Integer.parseInt(str));
        if (zzbkVarZza != null) {
            return zzbkVarZza;
        }
        u7.r(vh.l("Unsupported commandId ", str));
        return null;
    }

    public static Drawable p(Context context, int i2) {
        return ResourceManagerInternal.c().e(context, i2);
    }

    public static void p0(long j, String str, boolean z) {
        if (z) {
            return;
        }
        u7.r(mu.F(str, Long.valueOf(j)));
    }

    public static final String q(Uri uri) {
        List listR = r(uri);
        String str = uri.b;
        if (listR.isEmpty()) {
            return null;
        }
        String str2 = uri.e;
        str2.getClass();
        if (!g.R(str2, str, false)) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return c.w(listR, uri.b, str, null, null, 60);
    }

    public static void q0(String str, Bundle bundle, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static final List r(Uri uri) {
        String str = uri.e;
        if (str == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = -1;
        while (i2 < str.length()) {
            int i3 = i2 + 1;
            int iY = g.y(str, '/', i3, 4);
            if (iY == -1) {
                iY = str.length();
            }
            String strSubstring = str.substring(i3, iY);
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i2 = iY;
        }
        return arrayList;
    }

    public static void r0(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr2[0];
        long j2 = jArr3[0];
        long j3 = j * j2;
        long j4 = jArr3[1];
        long j5 = jArr2[1];
        long j6 = (j5 * j2) + (j * j4);
        long j7 = jArr3[2];
        long j8 = jArr2[2];
        long j9 = ((j5 + j5) * j4) + (j * j7) + (j8 * j2);
        long j10 = jArr3[3];
        long j11 = jArr2[3];
        long j12 = (j5 * j7) + (j8 * j4) + (j * j10) + (j11 * j2);
        long j13 = jArr3[4];
        long j14 = jArr2[4];
        long j15 = (j5 * j10) + (j11 * j4);
        long j16 = j15 + j15 + (j8 * j7) + (j * j13) + (j14 * j2);
        long j17 = jArr3[5];
        long j18 = jArr2[5];
        long j19 = (j8 * j10) + (j11 * j7) + (j5 * j13) + (j14 * j4) + (j * j17) + (j18 * j2);
        long j20 = jArr3[6];
        long j21 = jArr2[6];
        long j22 = (j11 * j10) + (j5 * j17) + (j18 * j4);
        long j23 = j22 + j22 + (j8 * j13) + (j14 * j7) + (j * j20) + (j21 * j2);
        long j24 = jArr3[7];
        long j25 = jArr2[7];
        long j26 = (j11 * j13) + (j14 * j10) + (j8 * j17) + (j18 * j7) + (j5 * j20) + (j21 * j4) + (j * j24) + (j25 * j2);
        long j27 = jArr3[8];
        long j28 = jArr2[8];
        long j29 = (j11 * j17) + (j18 * j10) + (j5 * j24) + (j25 * j4);
        long j30 = j29 + j29 + (j14 * j13) + (j8 * j20) + (j21 * j7) + (j * j27) + (j28 * j2);
        long j31 = jArr3[9];
        long j32 = jArr2[9];
        long j33 = (j14 * j17) + (j18 * j13) + (j11 * j20) + (j21 * j10) + (j8 * j24) + (j25 * j7) + (j5 * j27) + (j28 * j4) + (j * j31) + (j2 * j32);
        long j34 = (j18 * j17) + (j11 * j24) + (j25 * j10) + (j5 * j31) + (j4 * j32);
        long j35 = (j18 * j24) + (j25 * j17) + (j11 * j31) + (j10 * j32);
        long j36 = (j25 * j24) + (j18 * j31) + (j17 * j32);
        long j37 = (j25 * j27) + (j28 * j24) + (j21 * j31) + (j20 * j32);
        long j38 = (j24 * j32) + (j25 * j31);
        h0(new long[]{j3, j6, j9, j12, j16, j19, j23, j26, j30, j33, j34 + j34 + (j14 * j20) + (j21 * j13) + (j8 * j27) + (j28 * j7), (j18 * j20) + (j21 * j17) + (j14 * j24) + (j25 * j13) + (j11 * j27) + (j28 * j10) + (j8 * j31) + (j7 * j32), j35 + j35 + (j21 * j20) + (j14 * j27) + (j28 * j13), (j21 * j24) + (j25 * j20) + (j18 * j27) + (j28 * j17) + (j14 * j31) + (j13 * j32), j36 + j36 + (j21 * j27) + (j28 * j20), j37, j38 + j38 + (j28 * j27), (j27 * j32) + (j28 * j31), (j32 + j32) * j31}, jArr);
    }

    public static final int s(TextView textView) {
        int lineForVertical;
        textView.getClass();
        if (textView.getLayout() == null || textView.getLineHeight() == 0 || (lineForVertical = textView.getLayout().getLineForVertical(textView.getScrollY())) < 0) {
            return 0;
        }
        return lineForVertical >= textView.getLineCount() ? textView.getLineCount() - 1 : lineForVertical;
    }

    public static void s0(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        u7.r(mu.F(str, obj));
    }

    public static final int[] t(NetworkRequest networkRequest) {
        networkRequest.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            return l5.g(networkRequest);
        }
        int[] iArr = {2, 0, 3, 6, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = iArr[i2];
            if (d.c(networkRequest, i3)) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        return c.Q(arrayList);
    }

    public static void t0(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = j * j;
        long j3 = jArr2[1];
        long j4 = (j + j) * j3;
        long j5 = jArr2[2];
        long j6 = (j * j5) + (j3 * j3);
        long j7 = jArr2[3];
        long j8 = (j * j7) + (j3 * j5);
        long j9 = jArr2[4];
        long j10 = (j5 * j5) + (j3 * 4 * j7) + ((j + j) * j9);
        long j11 = jArr2[5];
        long j12 = (j5 * j7) + (j3 * j9) + (j * j11);
        long j13 = jArr2[6];
        long j14 = (j7 * j7) + (j5 * j9) + (j * j13) + ((j3 + j3) * j11);
        long j15 = jArr2[7];
        long j16 = (j7 * j9) + (j5 * j11) + (j3 * j13) + (j * j15);
        long j17 = jArr2[8];
        long j18 = (j7 * j11) + (j3 * j15);
        long j19 = j18 + j18 + (j5 * j13) + (j * j17);
        long j20 = j19 + j19 + (j9 * j9);
        long j21 = jArr2[9];
        long j22 = (j9 * j11) + (j7 * j13) + (j5 * j15) + (j3 * j17) + (j * j21);
        long j23 = (j3 * j21) + (j7 * j15);
        long j24 = j23 + j23 + (j11 * j11) + (j9 * j13) + (j5 * j17);
        long j25 = (j11 * j13) + (j9 * j15) + (j7 * j17) + (j5 * j21);
        long j26 = (j7 * j21) + (j11 * j15);
        long j27 = j26 + j26 + (j9 * j17);
        long j28 = j27 + j27 + (j13 * j13);
        long j29 = (j13 * j15) + (j11 * j17) + (j9 * j21);
        long j30 = (j15 * j15) + (j13 * j17) + ((j11 + j11) * j21);
        long j31 = (j13 * j21) + (j15 * j17);
        h0(new long[]{j2, j4, j6 + j6, j8 + j8, j10, j12 + j12, j14 + j14, j16 + j16, j20, j22 + j22, j24 + j24, j25 + j25, j28, j29 + j29, j30 + j30, j31 + j31, (j15 * 4 * j21) + (j17 * j17), (j17 + j17) * j21, (j21 + j21) * j21}, jArr);
    }

    public static final int u(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        serialDescriptorArr.getClass();
        int iHashCode = (serialDescriptor.getB().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        SerialDescriptorKt$special$$inlined$Iterable$1 serialDescriptorKt$special$$inlined$Iterable$1 = new SerialDescriptorKt$special$$inlined$Iterable$1(serialDescriptor);
        Iterator<SerialDescriptor> it = serialDescriptorKt$special$$inlined$Iterable$1.iterator();
        int iHashCode2 = 1;
        int i2 = 1;
        while (true) {
            c61 c61Var = (c61) it;
            int iHashCode3 = 0;
            if (!c61Var.hasNext()) {
                break;
            }
            int i3 = i2 * 31;
            String serialName = ((SerialDescriptor) c61Var.next()).getB();
            if (serialName != null) {
                iHashCode3 = serialName.hashCode();
            }
            i2 = i3 + iHashCode3;
        }
        Iterator<SerialDescriptor> it2 = serialDescriptorKt$special$$inlined$Iterable$1.iterator();
        while (true) {
            c61 c61Var2 = (c61) it2;
            if (!c61Var2.hasNext()) {
                return (((iHashCode * 31) + i2) * 31) + iHashCode2;
            }
            int i4 = iHashCode2 * 31;
            SerialKind kind = ((SerialDescriptor) c61Var2.next()).getB();
            iHashCode2 = i4 + (kind != null ? kind.hashCode() : 0);
        }
    }

    public static boolean u0(zzao zzaoVar, zzao zzaoVar2) {
        if (!zzaoVar.getClass().equals(zzaoVar2.getClass())) {
            return false;
        }
        if ((zzaoVar instanceof com.google.android.gms.internal.measurement.zzat) || (zzaoVar instanceof zzam)) {
            return true;
        }
        if (!(zzaoVar instanceof zzah)) {
            return zzaoVar instanceof zzas ? ((zzas) zzaoVar).a.equals(zzaoVar2.zzc()) : zzaoVar instanceof zzaf ? Boolean.valueOf(((zzaf) zzaoVar).a).equals(zzaoVar2.zze()) : zzaoVar == zzaoVar2;
        }
        Double d2 = ((zzah) zzaoVar).a;
        if (Double.isNaN(d2.doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue())) {
            return false;
        }
        return d2.equals(zzaoVar2.zzd());
    }

    public static final String v(String str, byte[] bArr) {
        int length = str.length();
        int i2 = 0;
        int iMax = Math.max(0, length - 2);
        int i3 = 0;
        while (true) {
            if (i2 >= iMax) {
                if (i2 == i3) {
                    return str;
                }
                if (i2 >= length) {
                    return g.r(i3, 5, bArr);
                }
            } else if (str.charAt(i2) == '%') {
                int i4 = i2 + 3;
                try {
                    String strSubstring = str.substring(i2 + 1, i4);
                    kotlin.text.a.b(16);
                    bArr[i3] = (byte) Integer.parseInt(strSubstring, 16);
                    i3++;
                    i2 = i4;
                } catch (NumberFormatException unused) {
                    bArr[i3] = (byte) str.charAt(i2);
                    i3++;
                    i2++;
                }
            }
            bArr[i3] = (byte) str.charAt(i2);
            i3++;
            i2++;
        }
    }

    public static int v0(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2) || d2 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d2 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d2))) % 4.294967296E9d);
    }

    public static final void w(Consumer consumer, WorkerExceptionInfo workerExceptionInfo, String str) {
        consumer.getClass();
        str.getClass();
        try {
            consumer.accept(workerExceptionInfo);
        } catch (Throwable unused) {
            androidx.work.Logger.a().getClass();
        }
    }

    public static void w0(Bundle bundle, String str, List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    public static byte[] x(vg vgVar) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT, Math.max(128, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i2);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < iMin2) {
                int i4 = vgVar.read(bArr, i3, iMin2 - i3);
                if (i4 == -1) {
                    return i(arrayDeque, i2);
                }
                i3 += i4;
                i2 += i4;
            }
            long j = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            iMin = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? AttribFlags.SSH_FILEXFER_ATTR_EXTENDED : (int) j;
        }
        if (vgVar.read() == -1) {
            return i(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static long[] x0(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i2 = 0; i2 < 10; i2++) {
            int i3 = f[i2];
            int i4 = bArr[i3] & 255;
            int i5 = bArr[i3 + 1] & 255;
            long j = ((long) i4) | (((long) i5) << 8);
            jArr[i2] = (((j | (((long) (bArr[i3 + 2] & 255)) << 16)) | (((long) (bArr[i3 + 3] & 255)) << 24)) >> g[i2]) & ((long) h[i2 & 1]);
        }
        return jArr;
    }

    public static int y(Dimension dimension, Scale scale) {
        if (dimension instanceof cy) {
            return ((cy) dimension).a;
        }
        int i2 = qu.a[scale.ordinal()];
        if (i2 == 1) {
            return AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        }
        if (i2 == 2) {
            return Integer.MAX_VALUE;
        }
        p60.b();
        return 0;
    }

    public static byte[] y0(long[] jArr) {
        long j;
        int[] iArr;
        int i2;
        int[] iArr2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            j = 19;
            iArr = i;
            if (i4 >= 2) {
                break;
            }
            int i5 = 0;
            while (i5 < 9) {
                long j2 = jArrCopyOf[i5];
                int i6 = iArr[i5 & 1];
                int i7 = -((int) (((j2 >> 31) & j2) >> i6));
                jArrCopyOf[i5] = j2 + ((long) (i7 << i6));
                i5++;
                jArrCopyOf[i5] = jArrCopyOf[i5] - ((long) i7);
            }
            long j3 = jArrCopyOf[9];
            int i8 = -((int) (((j3 >> 31) & j3) >> 25));
            jArrCopyOf[9] = j3 + ((long) (i8 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i8) * 19);
            i4++;
        }
        long j4 = jArrCopyOf[0];
        int i9 = -((int) (((j4 >> 31) & j4) >> 26));
        jArrCopyOf[0] = j4 + ((long) (i9 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i9);
        int i10 = 0;
        while (true) {
            iArr2 = h;
            if (i10 >= 2) {
                break;
            }
            int i11 = i3;
            while (i11 < 9) {
                long j5 = jArrCopyOf[i11];
                int i12 = i11 & 1;
                int i13 = i3;
                long j6 = j5 >> iArr[i12];
                jArrCopyOf[i11] = ((long) iArr2[i12]) & j5;
                i11++;
                jArrCopyOf[i11] = jArrCopyOf[i11] + ((long) ((int) j6));
                i3 = i13;
                i10 = i10;
                j = j;
            }
            i10++;
        }
        int i14 = i3;
        long j7 = jArrCopyOf[9];
        jArrCopyOf[9] = j7 & 33554431;
        jArrCopyOf[i14] = (((long) ((int) (j7 >> 25))) * j) + jArrCopyOf[i14];
        int i15 = ~((((int) r4) - 67108845) >> 31);
        for (int i16 = 1; i16 < 10; i16++) {
            int i17 = ~(((int) jArrCopyOf[i16]) ^ iArr2[i16 & 1]);
            int i18 = i17 & (i17 << 16);
            int i19 = i18 & (i18 << 8);
            int i20 = i19 & (i19 << 4);
            int i21 = i20 & (i20 << 2);
            i15 &= (i21 & (i21 + i21)) >> 31;
        }
        jArrCopyOf[i14] = jArrCopyOf[i14] - ((long) (67108845 & i15));
        long j8 = 33554431 & i15;
        jArrCopyOf[1] = jArrCopyOf[1] - j8;
        for (i2 = 2; i2 < 10; i2 += 2) {
            jArrCopyOf[i2] = jArrCopyOf[i2] - ((long) (67108863 & i15));
            int i22 = i2 + 1;
            jArrCopyOf[i22] = jArrCopyOf[i22] - j8;
        }
        for (int i23 = i14; i23 < 10; i23++) {
            jArrCopyOf[i23] = jArrCopyOf[i23] << g[i23];
        }
        byte[] bArr = new byte[32];
        for (int i24 = i14; i24 < 10; i24++) {
            int i25 = f[i24];
            long j9 = bArr[i25];
            long j10 = jArrCopyOf[i24];
            bArr[i25] = (byte) (j9 | (j10 & 255));
            bArr[i25 + 1] = (byte) (((long) bArr[r5]) | ((j10 >> 8) & 255));
            bArr[i25 + 2] = (byte) (((long) bArr[r5]) | ((j10 >> 16) & 255));
            bArr[i25 + 3] = (byte) (((long) bArr[r4]) | ((j10 >> 24) & 255));
        }
        return bArr;
    }

    public static Uri z(String str) {
        String strSubstring;
        String strSubstring2;
        String str2 = Path.c;
        String strM = !yg0.a(str2, "/") ? g.M(str, str2, "/") : str;
        int i2 = 0;
        boolean z = true;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (i2 < strM.length()) {
            char cCharAt = strM.charAt(i2);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i5 == -1 && i3 == -1) {
                            i5 = i2 + 1;
                        }
                    } else if (z && i5 == -1 && i3 == -1) {
                        int i8 = i2 + 2;
                        if (i8 < str.length() && str.charAt(i2 + 1) == '/' && str.charAt(i8) == '/') {
                            i6 = i2 + 3;
                            z = false;
                            i7 = i2;
                            i2 = i8;
                        } else if (strM.equals(str)) {
                            i4 = i2 + 1;
                            i7 = i2;
                            i2 = i4;
                            i6 = i2;
                        }
                    }
                } else if (i4 == -1 && i5 == -1 && i3 == -1) {
                    i4 = i6 == -1 ? 0 : i2;
                    z = false;
                }
            } else if (i3 == -1) {
                i3 = i2 + 1;
            }
            i2++;
        }
        int iMin = Math.min(i3 == -1 ? Integer.MAX_VALUE : i3 - 1, strM.length());
        int iMin2 = Math.min(i5 == -1 ? Integer.MAX_VALUE : i5 - 1, iMin);
        if (i6 != -1) {
            strSubstring2 = strM.substring(0, i7);
            strSubstring = strM.substring(i6, Math.min(i4 != -1 ? i4 : Integer.MAX_VALUE, iMin2));
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        String strSubstring3 = i4 != -1 ? strM.substring(i4, iMin2) : null;
        String strSubstring4 = i5 != -1 ? strM.substring(i5, iMin) : null;
        String strSubstring5 = i3 != -1 ? strM.substring(i3, strM.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        return new Uri(strM, str2, strSubstring2 != null ? v(strSubstring2, bArr) : null, strSubstring != null ? v(strSubstring, bArr) : null, strSubstring3 != null ? v(strSubstring3, bArr) : null, strSubstring4 != null ? v(strSubstring4, bArr) : null, strSubstring5 != null ? v(strSubstring5, bArr) : null);
    }

    public static double z0(double d2) {
        if (Double.isNaN(d2)) {
            return 0.0d;
        }
        if (Double.isInfinite(d2) || d2 == 0.0d || d2 == 0.0d) {
            return d2;
        }
        return ((double) (d2 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d2));
    }
}
