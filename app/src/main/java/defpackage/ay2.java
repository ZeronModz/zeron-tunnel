package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzaih;
import com.google.android.gms.internal.ads.zzain;
import com.google.android.gms.internal.ads.zzais;
import com.google.android.gms.internal.ads.zzao;
import com.google.android.gms.internal.ads.zzap;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzfs;
import com.google.android.gms.internal.ads.zzgru;
import com.google.android.gms.internal.ads.zzguc;
import com.google.android.gms.internal.ads.zzguf;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.appset.zzr;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.b;
import com.google.android.material.appbar.AppBarLayout;
import com.google.common.collect.s1;
import com.google.firebase.components.DependencyCycleException;
import com.google.firebase.components.Qualified;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import com.trilead.ssh2.sftp.AttribFlags;
import com.v2ray.ang.dto.EConfigType;
import com.v2ray.ang.dto.ProfileItem;
import com.v2ray.ang.dto.SubscriptionItem;
import com.v2ray.ang.fmt.FmtBase;
import io.ktor.util.StringValuesBuilder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.zip.GZIPOutputStream;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;
import kotlin.text.g;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.h;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.io.Sink;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ay2 implements CallbackToFutureAdapter$Resolver {
    public static Task c = null;
    public static zzr d = null;
    public static boolean f = true;
    public static final int[] a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};
    public static final int[] b = {R.attr.stateListAnimator};
    public static final Object e = new Object();

    public static Object A(zzgru zzgruVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzgruVar.mo10zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static String B(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (I(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (I(c2)) {
                        charArray[i] = (char) (c2 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static void C(int i, zzap zzapVar, zzt zztVar, zzap zzapVar2, zzap... zzapVarArr) {
        if (zzapVar2 == null) {
            zzapVar2 = new zzap(-9223372036854775807L, new zzao[0]);
        }
        if (zzapVar != null) {
            int i2 = zzguf.zzd;
            zzguc zzgucVar = new zzguc();
            for (zzao zzaoVar : zzapVar.a) {
                if (zzfs.class.isAssignableFrom(zzaoVar.getClass())) {
                    zzgucVar.a((zzao) zzfs.class.cast(zzaoVar));
                }
            }
            zzguf zzgufVarF = zzgucVar.f();
            int size = zzgufVarF.size();
            for (int i3 = 0; i3 < size; i3++) {
                zzfs zzfsVar = (zzfs) zzgufVarF.get(i3);
                if (!zzfsVar.a.equals("com.android.capture.fps") || i == 2) {
                    zzapVar2 = zzapVar2.b(zzfsVar);
                }
            }
        }
        for (zzap zzapVar3 : zzapVarArr) {
            zzapVar2 = zzapVar2.a(zzapVar3);
        }
        if (zzapVar2.a.length > 0) {
            zztVar.j = zzapVar2;
        }
    }

    public static void D(Context context, boolean z) {
        synchronized (e) {
            try {
                if (d == null) {
                    d = new zzr(context);
                }
                Task task = c;
                if (task == null || ((task.l() && !c.m()) || (z && c.l()))) {
                    try {
                        zzr zzrVar = d;
                        yg0.n(zzrVar, "the appSetIdClient shouldn't be null");
                        c = zzrVar.getAppSetIdInfo();
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        String message = e2.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 31);
                        sb.append("Failed to get app set ID info: ");
                        sb.append(message);
                        zze.zza(sb.toString());
                        c = b.d(e2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static byte[] E(String str) {
        if ((str.length() & 1) != 0) {
            u7.r("Expected a string of even length");
            return null;
        }
        int length = str.length() >> 1;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            int iDigit = Character.digit(str.charAt(i2), 16);
            int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                u7.r("input is not hexadecimal");
                return null;
            }
            bArr[i] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static String F(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i] = (char) (c2 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static int G(SQLiteDatabase sQLiteDatabase, int i) {
        int i2 = 0;
        if (i == 2) {
            return 0;
        }
        Cursor cursorO = O(sQLiteDatabase, i);
        if (cursorO.getCount() > 0) {
            cursorO.moveToNext();
            i2 = cursorO.getInt(cursorO.getColumnIndexOrThrow("value"));
        }
        cursorO.close();
        return i2;
    }

    public static zzais H(int i, String str, zzer zzerVar) {
        int iB = zzerVar.b();
        if (zzerVar.b() == 1684108385) {
            zzerVar.E(8);
            return new zzais(str, null, zzguf.zzj(zzerVar.l(iB - 16)));
        }
        ii2.K("Failed to parse text attribute: ".concat(vu.a(i)));
        return null;
    }

    public static boolean I(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public static zzain J(int i, String str, zzer zzerVar, boolean z, boolean z2) {
        int iN = N(zzerVar);
        if (z2) {
            iN = Math.min(1, iN);
        }
        if (iN >= 0) {
            return z ? new zzais(str, null, zzguf.zzj(Integer.toString(iN))) : new zzaih("und", str, Integer.toString(iN));
        }
        ii2.K("Failed to parse uint8 attribute: ".concat(vu.a(i)));
        return null;
    }

    public static void K(SQLiteDatabase sQLiteDatabase, long j, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static boolean L(byte b2) {
        return b2 > -65;
    }

    public static boolean M(CharSequence charSequence, String str) {
        char c2;
        int length = str.length();
        if (str == charSequence) {
            return true;
        }
        if (length == charSequence.length()) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == charSequence.charAt(i) || ((c2 = (char) ((r3 | ' ') - 97)) < 26 && c2 == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static int N(zzer zzerVar) {
        int iB = zzerVar.b();
        if (zzerVar.b() == 1684108385) {
            zzerVar.E(8);
            int i = iB - 16;
            if (i == 1) {
                return zzerVar.I();
            }
            if (i == 2) {
                return zzerVar.J();
            }
            if (i == 3) {
                return zzerVar.M();
            }
            if (i == 4 && (zzerVar.G() & 128) == 0) {
                return zzerVar.h();
            }
        }
        ii2.K("Failed to parse data atom to int");
        return -1;
    }

    public static Cursor O(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i == 1) {
            strArr2[0] = "total_requests";
        } else if (i != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    public static zzais P(int i, String str, zzer zzerVar) {
        int iB = zzerVar.b();
        if (zzerVar.b() == 1684108385 && iB >= 22) {
            zzerVar.E(10);
            int iJ = zzerVar.J();
            if (iJ > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(iJ).length());
                sb.append(iJ);
                String string = sb.toString();
                int iJ2 = zzerVar.J();
                if (iJ2 > 0) {
                    StringBuilder sb2 = new StringBuilder(string.length() + 1 + String.valueOf(iJ2).length());
                    sb2.append(string);
                    sb2.append("/");
                    sb2.append(iJ2);
                    string = sb2.toString();
                }
                return new zzais(str, null, zzguf.zzj(string));
            }
        }
        ii2.K("Failed to parse index/count attribute: ".concat(vu.a(i)));
        return null;
    }

    public static void Q(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    public static void R(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void a(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            of0.a(imageView, matrix);
            return;
        }
        if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
                return;
            }
            return;
        }
        if (f) {
            try {
                of0.a(imageView, matrix);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }

    public static final void b(StringValuesBuilder stringValuesBuilder, StringValuesBuilder stringValuesBuilder2) {
        stringValuesBuilder.getClass();
        stringValuesBuilder2.getClass();
        Iterator<T> it = stringValuesBuilder2.entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            stringValuesBuilder.appendAll((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static void c(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (xt xtVar : (Set) it2.next()) {
                        for (kw kwVar : xtVar.a.c) {
                            if (kwVar.c == 0) {
                                Set<xt> set = (Set) map.get(new yt(kwVar.a, kwVar.b == 2));
                                if (set != null) {
                                    for (xt xtVar2 : set) {
                                        xtVar.b.add(xtVar2);
                                        xtVar2.c.add(xtVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<xt> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (xt xtVar3 : hashSet) {
                    if (xtVar3.c.isEmpty()) {
                        hashSet2.add(xtVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    xt xtVar4 = (xt) hashSet2.iterator().next();
                    hashSet2.remove(xtVar4);
                    i++;
                    for (xt xtVar5 : xtVar4.b) {
                        xtVar5.c.remove(xtVar4);
                        if (xtVar5.c.isEmpty()) {
                            hashSet2.add(xtVar5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (xt xtVar6 : hashSet) {
                    if (!xtVar6.c.isEmpty() && !xtVar6.b.isEmpty()) {
                        arrayList2.add(xtVar6.a);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
            jp jpVar = (jp) it.next();
            xt xtVar7 = new xt(jpVar);
            for (Qualified qualified : jpVar.b) {
                boolean z = jpVar.e == 0;
                yt ytVar = new yt(qualified, !z);
                if (!map.containsKey(ytVar)) {
                    map.put(ytVar, new HashSet());
                }
                Set set2 = (Set) map.get(ytVar);
                if (!set2.isEmpty() && z) {
                    p60.h("Multiple components provide ", qualified, ".");
                    return;
                }
                set2.add(xtVar7);
            }
        }
    }

    public static void d(BitMatrix bitMatrix, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    bitMatrix.h(i5, i4);
                    bitMatrix.h(i5, i6);
                    bitMatrix.h(i4, i5);
                    bitMatrix.h(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        bitMatrix.h(i7, i7);
        int i8 = i7 + 1;
        bitMatrix.h(i8, i7);
        bitMatrix.h(i7, i8);
        int i9 = i + i2;
        bitMatrix.h(i9, i7);
        bitMatrix.h(i9, i8);
        bitMatrix.h(i9, i9 - 1);
    }

    public static final byte[] e(CharsetEncoder charsetEncoder, CharSequence charSequence, int i, int i2) {
        charsetEncoder.getClass();
        charSequence.getClass();
        if (charSequence instanceof String) {
            if (i == 0) {
                String str = (String) charSequence;
                if (i2 == str.length()) {
                    byte[] bytes = str.getBytes(charsetEncoder.charset());
                    bytes.getClass();
                    return bytes;
                }
            }
            byte[] bytes2 = ((String) charSequence).substring(i, i2).getBytes(charsetEncoder.charset());
            bytes2.getClass();
            return bytes2;
        }
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i, i2));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    public static InvocationHandler f() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = j5.y();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                p60.l(e2);
                return null;
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static BitArray g(int i, int i2, BitArray bitArray) {
        GenericGF genericGF;
        int i3 = bitArray.b / i2;
        if (i2 == 4) {
            genericGF = GenericGF.k;
        } else if (i2 == 6) {
            genericGF = GenericGF.j;
        } else if (i2 == 8) {
            genericGF = GenericGF.n;
        } else if (i2 == 10) {
            genericGF = GenericGF.i;
        } else {
            if (i2 != 12) {
                u7.r(hz.o(i2, "Unsupported word size "));
                return null;
            }
            genericGF = GenericGF.h;
        }
        ReedSolomonEncoder reedSolomonEncoder = new ReedSolomonEncoder(genericGF);
        int i4 = i / i2;
        int[] iArr = new int[i4];
        int i5 = bitArray.b / i2;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                i7 |= bitArray.d((i6 * i2) + i8) ? 1 << ((i2 - i8) - 1) : 0;
            }
            iArr[i6] = i7;
        }
        reedSolomonEncoder.a(i4 - i3, iArr);
        BitArray bitArray2 = new BitArray();
        bitArray2.b(0, i % i2);
        for (int i9 = 0; i9 < i4; i9++) {
            bitArray2.b(iArr[i9], i2);
        }
        return bitArray2;
    }

    public static void h(File file, InputStream inputStream) throws Throwable {
        byte[] bArr = new byte[AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        gZIPOutputStream2.finish();
                        CommonUtils.c(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    CommonUtils.c(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Pair i(String str, String str2, boolean z) {
        str2.getClass();
        Regex regex = ul1.a;
        int iM = m(ul1.b(str), str2, z);
        if (iM <= 0) {
            iM = m(str, str2, z);
        }
        if (iM <= 0) {
            iM = p(str, str2);
        }
        int iN = n(str);
        if (iN <= 0) {
            iN = n(ul1.b(str));
        }
        if (iN > 0) {
            try {
                Iterator it = zq0.i().iterator();
                while (it.hasNext()) {
                    x((Pair) it.next());
                }
            } catch (Exception unused) {
            }
        }
        return new Pair(Integer.valueOf(iM), Integer.valueOf(iN));
    }

    public static int j(String str) {
        Lazy lazy = zq0.a;
        Iterator it = zq0.i().iterator();
        while (it.hasNext()) {
            if (yg0.a(((SubscriptionItem) ((Pair) it.next()).getSecond()).getUrl(), str)) {
                return 0;
            }
        }
        Regex regex = ul1.a;
        URI uri = new URI(ul1.e(str));
        SubscriptionItem subscriptionItem = new SubscriptionItem(null, null, false, 0L, 0L, false, null, null, null, null, false, 2047, null);
        String fragment = uri.getFragment();
        if (fragment == null) {
            fragment = "import sub";
        }
        subscriptionItem.setRemarks(fragment);
        subscriptionItem.setUrl(str);
        Lazy lazy2 = zq0.a;
        zq0.q(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, subscriptionItem);
        return 1;
    }

    public static ArrayList k(Iterable iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? new ArrayList((Collection) iterable) : l(iterable.iterator());
    }

    public static ArrayList l(Iterator it) {
        ArrayList arrayList = new ArrayList();
        s1.a(arrayList, it);
        return arrayList;
    }

    public static int m(String str, String str2, boolean z) {
        if (str != null) {
            try {
                ProfileItem profileItem = null;
                if (!TextUtils.isEmpty(str2) && !z) {
                    Lazy lazy = zq0.a;
                    String strX = zq0.x();
                    if (strX == null) {
                        strX = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    ProfileItem profileItemE = zq0.e(strX);
                    if (profileItemE != null && yg0.a(profileItemE.getSubscriptionId(), str2)) {
                        profileItem = profileItemE;
                    }
                }
                if (!z) {
                    Lazy lazy2 = zq0.a;
                    zq0.G(str2);
                }
                Lazy lazy3 = zq0.a;
                SubscriptionItem subscriptionItemH = zq0.h(str2);
                List listF = kotlin.sequences.b.f(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(str));
                listF.getClass();
                Iterator it = c.J(c.R(c.T(listF))).iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (o((String) it.next(), str2, subscriptionItemH, profileItem) == 0) {
                        i++;
                    }
                }
                return i;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static int n(String str) {
        if (str != null) {
            try {
                List listF = kotlin.sequences.b.f(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(str));
                listF.getClass();
                int iJ = 0;
                for (String str2 : c.R(c.T(listF))) {
                    Regex regex = ul1.a;
                    if (ul1.v(str2)) {
                        iJ += j(str2);
                    }
                }
                return iJ;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static int o(String str, String str2, SubscriptionItem subscriptionItem, ProfileItem profileItem) {
        String filter;
        if (str == null) {
            return dev.zeron.tunnel.R.string.toast_none_data;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return dev.zeron.tunnel.R.string.toast_none_data;
            }
            ProfileItem profileItemE = g.R(str, EConfigType.VMESS.getProtocolScheme(), false) ? lp1.a.e(str) : g.R(str, EConfigType.SHADOWSOCKS.getProtocolScheme(), false) ? m71.a.e(str) : g.R(str, EConfigType.SOCKS.getProtocolScheme(), false) ? d91.a.e(str) : g.R(str, EConfigType.TROJAN.getProtocolScheme(), false) ? yg1.a.e(str) : g.R(str, EConfigType.VLESS.getProtocolScheme(), false) ? jp1.a.e(str) : g.R(str, EConfigType.WIREGUARD.getProtocolScheme(), false) ? br1.a.e(str) : (g.R(str, EConfigType.HYSTERIA2.getProtocolScheme(), false) || g.R(str, "hy2://", false)) ? re0.a.e(str) : null;
            if (profileItemE == null) {
                return dev.zeron.tunnel.R.string.toast_incorrect_protocol;
            }
            if ((subscriptionItem != null ? subscriptionItem.getFilter() : null) != null && (filter = subscriptionItem.getFilter()) != null && filter.length() > 0 && profileItemE.getRemarks().length() > 0) {
                String filter2 = subscriptionItem.getFilter();
                if (filter2 == null) {
                    filter2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                if (!new Regex(filter2).containsMatchIn(profileItemE.getRemarks())) {
                    return -1;
                }
            }
            profileItemE.setSubscriptionId(str2);
            Lazy lazy = zq0.a;
            String strL = zq0.l(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, profileItemE);
            if (profileItem != null && yg0.a(profileItemE.getServer(), profileItem.getServer()) && yg0.a(profileItemE.getServerPort(), profileItem.getServerPort())) {
                zq0.v().i("SELECTED_SERVER", strL);
            }
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static int p(String str, String str2) {
        List listX;
        if (str != null) {
            try {
                if (g.o(str, "inbounds", false) && g.o(str, "outbounds", false) && g.o(str, "routing", false)) {
                    try {
                        Object[] objArr = (Object[]) aj0.a(Object[].class, str);
                        if (objArr.length != 0) {
                            if (objArr.length == 0) {
                                listX = EmptyList.INSTANCE;
                            } else {
                                listX = kotlin.collections.b.x(objArr);
                                Collections.reverse(listX);
                            }
                            int size = listX.size();
                            int i = 0;
                            for (int i2 = 0; i2 < size; i2++) {
                                Object obj = listX.get(i2);
                                ProfileItem profileItemE = vs.a.e(aj0.a.g(obj));
                                profileItemE.setSubscriptionId(str2);
                                Lazy lazy = zq0.a;
                                String strL = zq0.l(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, profileItemE);
                                String strB = aj0.b(obj);
                                if (strB == null) {
                                    strB = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                                }
                                zq0.n(strL, strB);
                                i++;
                            }
                            return i;
                        }
                    } catch (Exception unused) {
                    }
                    ProfileItem profileItemE2 = vs.a.e(str);
                    profileItemE2.setSubscriptionId(str2);
                    Lazy lazy2 = zq0.a;
                    zq0.n(zq0.l(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, profileItemE2), str);
                    return 1;
                }
                if (g.R(str, "[Interface]", false) && g.o(str, "[Peer]", false)) {
                    br1.a.getClass();
                    ProfileItem profileItemF = br1.f(str);
                    Lazy lazy3 = zq0.a;
                    zq0.n(zq0.l(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, profileItemF), str);
                    return 1;
                }
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    public static void q(Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 29) {
            k5.y(theme);
            return;
        }
        synchronized (sb2.g) {
            if (!sb2.i) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                    sb2.h = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                sb2.i = true;
            }
            Method method = sb2.h;
            if (method != null) {
                try {
                    method.invoke(theme, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    sb2.h = null;
                }
            }
        }
    }

    public static void r(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static void s(AppBarLayout appBarLayout, float f2) {
        int integer = appBarLayout.getResources().getInteger(dev.zeron.tunnel.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, dev.zeron.tunnel.R.attr.state_liftable, -2130969749}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f2).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }

    public static String t(String str) {
        ProfileItem profileItemE;
        String strF;
        try {
            Lazy lazy = zq0.a;
            profileItemE = zq0.e(str);
        } catch (Exception unused) {
        }
        if (profileItemE == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        String protocolScheme = profileItemE.getConfigType().getProtocolScheme();
        switch (v4.a[profileItemE.getConfigType().ordinal()]) {
            case 1:
                strF = lp1.a.f(profileItemE);
                break;
            case 2:
            case 5:
                strF = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                break;
            case 3:
                m71.a.getClass();
                String str2 = profileItemE.getMethod() + ":" + profileItemE.getPassword();
                Regex regex = ul1.a;
                strF = FmtBase.d(profileItemE, ul1.c(str2), null);
                break;
            case 4:
                strF = d91.a.f(profileItemE);
                break;
            case 6:
                jp1.a.getClass();
                HashMap mapB = FmtBase.b(profileItemE);
                String method = profileItemE.getMethod();
                if (method == null) {
                    method = "none";
                }
                mapB.put("encryption", method);
                strF = FmtBase.d(profileItemE, profileItemE.getPassword(), mapB);
                break;
            case 7:
                yg1.a.getClass();
                strF = FmtBase.d(profileItemE, profileItemE.getPassword(), FmtBase.b(profileItemE));
                break;
            case 8:
                strF = br1.a.g(profileItemE);
                break;
            case 9:
                strF = re0.a.f(profileItemE);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return protocolScheme + strF;
    }

    public static final Object u(ScopeCoroutine scopeCoroutine, boolean z, ScopeCoroutine scopeCoroutine2, Function2 function2) throws Throwable {
        Object completedExceptionally;
        Object objW;
        xu xuVar = null;
        boolean z2 = false;
        int i = 2;
        try {
            if (function2 instanceof BaseContinuationImpl) {
                TypeIntrinsics.c(2, function2);
                completedExceptionally = function2.invoke(scopeCoroutine2, scopeCoroutine);
            } else {
                completedExceptionally = a.d(function2, scopeCoroutine2, scopeCoroutine);
            }
        } catch (DispatchException e2) {
            scopeCoroutine.v(new CompletedExceptionally(e2.getCause(), z2, i, xuVar));
            throw e2.getCause();
        } catch (Throwable th) {
            completedExceptionally = new CompletedExceptionally(th, z2, i, xuVar);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (completedExceptionally == coroutineSingletons || (objW = scopeCoroutine.w(completedExceptionally)) == h.b) {
            return coroutineSingletons;
        }
        scopeCoroutine.M();
        if (!(objW instanceof CompletedExceptionally)) {
            return h.a(objW);
        }
        if (!z) {
            Throwable th2 = ((CompletedExceptionally) objW).a;
            if ((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).coroutine == scopeCoroutine) {
                if (completedExceptionally instanceof CompletedExceptionally) {
                    throw ((CompletedExceptionally) completedExceptionally).a;
                }
                return completedExceptionally;
            }
        }
        throw ((CompletedExceptionally) objW).a;
    }

    public static BitArray v(int i, BitArray bitArray) {
        BitArray bitArray2 = new BitArray();
        int i2 = bitArray.b;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || bitArray.d(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                bitArray2.b(i8, i);
            } else if (i8 == 0) {
                bitArray2.b(i5 | 1, i);
            } else {
                bitArray2.b(i5, i);
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return bitArray2;
    }

    public static final Throwable w(Throwable th) {
        th.getClass();
        Throwable cause = th;
        while (true) {
            if (!(cause instanceof CancellationException)) {
                if (cause == null) {
                    break;
                }
                return cause;
            }
            CancellationException cancellationException = (CancellationException) cause;
            if (cause.equals(cancellationException.getCause())) {
                break;
            }
            cause = cancellationException.getCause();
        }
        return th;
    }

    public static int x(Pair pair) {
        String strC;
        String strC2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        pair.getClass();
        try {
            if (!TextUtils.isEmpty((CharSequence) pair.getFirst()) && !TextUtils.isEmpty(((SubscriptionItem) pair.getSecond()).getRemarks()) && !TextUtils.isEmpty(((SubscriptionItem) pair.getSecond()).getUrl()) && ((SubscriptionItem) pair.getSecond()).getEnabled()) {
                String url = ((SubscriptionItem) pair.getSecond()).getUrl();
                url.getClass();
                URL url2 = new URL(url);
                String host = url2.getHost();
                String ascii = IDN.toASCII(url2.getHost(), 1);
                if (!yg0.a(host, ascii)) {
                    host.getClass();
                    ascii.getClass();
                    url = g.M(url, host, ascii);
                }
                Regex regex = ul1.a;
                if (ul1.w(url) && (((SubscriptionItem) pair.getSecond()).getAllowInsecureUrl() || ul1.v(url))) {
                    try {
                        Lazy lazy = zq0.a;
                        strC = i60.c(ul1.y(Integer.parseInt("10808"), zq0.z().d("pref_socks_port")), url);
                    } catch (Exception unused) {
                        strC = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    if (strC.length() == 0) {
                        try {
                            strC2 = i60.c(0, url);
                        } catch (Exception unused2) {
                        }
                        strC = strC2;
                    }
                    if (strC.length() != 0) {
                        String str = (String) pair.getFirst();
                        Regex regex2 = ul1.a;
                        int iM = m(ul1.b(strC), str, false);
                        if (iM <= 0) {
                            iM = m(strC, str, false);
                        }
                        return iM <= 0 ? p(strC, str) : iM;
                    }
                }
            }
        } catch (Exception unused3) {
        }
        return 0;
    }

    public static void y(Sink sink, byte[] bArr) {
        int length = bArr.length;
        bArr.getClass();
        sink.write(bArr, 0, length);
    }

    public static byte z(long j) {
        n8.p0(j, "out of range: %s", (j >> 8) == 0);
        return (byte) j;
    }
}
