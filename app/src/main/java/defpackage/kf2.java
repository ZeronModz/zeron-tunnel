package defpackage;

import android.R;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.drawable.IconCompat;
import coil3.request.ViewTargetRequestManager;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import io.ktor.http.ParametersBuilderImpl;
import io.ktor.http.URLBuilder;
import io.ktor.http.UrlDecodedParametersBuilder;
import io.ktor.http.parsing.Grammar;
import io.ktor.http.parsing.OrGrammar;
import io.ktor.http.parsing.SequenceGrammar;
import io.ktor.utils.io.jvm.javaio.RawSourceChannel;
import java.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.b;
import kotlin.collections.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ConflatedBufferedChannel;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import kotlinx.io.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kf2 {
    public static Boolean a;
    public static final int[] b = {0, 4, 1, 5};
    public static final int[] c = {6, 2, 7, 3};
    public static final int[] d = {8, 1, 1, 1, 1, 1, 1, 3};
    public static final int[] e = {7, 1, 1, 3, 1, 1, 1, 2, 1};
    public static final int[] f = {0, 180, 270, 90};
    public static final int[] g = {R.attr.interpolator, R.attr.duration, R.attr.startDelay, R.attr.matchOrder};
    public static final int[] h = {R.attr.resizeClip};
    public static final int[] i = {R.attr.transitionVisibilityMode};
    public static final int[] j = {R.attr.fadingMode};
    public static final int[] k = {R.attr.reparent, R.attr.reparentWithOverlay};
    public static final int[] l = {R.attr.slideEdge};
    public static final int[] m = {R.attr.transitionOrdering};
    public static final int[] n = {R.attr.minimumHorizontalAngle, R.attr.minimumVerticalAngle, R.attr.maximumAngle};
    public static final int[] o = {R.attr.patternPathData};
    public static final c22 p = new c22(14);

    public static void A(OutputStream outputStream, long j2, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void B(ByteArrayOutputStream byteArrayOutputStream, int i2) throws IOException {
        A(byteArrayOutputStream, i2, 2);
    }

    public static Bundle C(Pair... pairArr) {
        Bundle bundle = new Bundle();
        if (((Boolean) zzbd.zzc().a(p32.K2)).booleanValue()) {
            for (int i2 = 0; i2 < 2; i2++) {
                Pair pair = pairArr[i2];
                if (!TextUtils.isEmpty((CharSequence) pair.first) && ((Long) pair.second).longValue() > 0) {
                    bundle.putLong((String) pair.first, ((Long) pair.second).longValue());
                }
            }
        }
        return bundle;
    }

    public static String D(Context context, String str) {
        yg0.m(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = mc2.K(context);
        }
        int identifier = resources.getIdentifier("google_app_id", TypedValues.Custom.S_STRING, str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static void E(long j2, String str) {
        if (j2 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 17);
        sb.append(str);
        sb.append(" (");
        sb.append(j2);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static void F(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                io0.e(vh.i(i3, "at index ", new StringBuilder(String.valueOf(i3).length() + 9)));
                return;
            }
        }
    }

    public static byte[] G(byte[]... bArr) throws GeneralSecurityException {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= bArr.length) {
                byte[] bArr2 = new byte[i3];
                int i4 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i4, length);
                    i4 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i2].length;
            if (i3 > Integer.MAX_VALUE - length2) {
                zg1.m("exceeded size limit");
                return null;
            }
            i3 += length2;
            i2++;
        }
    }

    public static Object H(Object obj) {
        Throwable th;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        try {
            if (obj != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                        try {
                            Object object = objectInputStream.readObject();
                            objectOutputStream.close();
                            objectInputStream.close();
                            return object;
                        } catch (Throwable th2) {
                            th = th2;
                            if (objectOutputStream != null) {
                                objectOutputStream.close();
                            }
                            if (objectInputStream == null) {
                                throw th;
                            }
                            objectInputStream.close();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        objectInputStream = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    objectInputStream = null;
                    objectOutputStream = null;
                }
            }
        } catch (IOException | ClassNotFoundException unused) {
        }
        return null;
    }

    public static void I(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static byte[] J(String str, boolean z) {
        m23 m23Var;
        if (z) {
            m23Var = n23.e;
            if (m23Var.b != null) {
                m23Var = new m23(m23Var.a, (Character) null);
            }
        } else {
            m23Var = n23.d;
        }
        byte[] bArrH = m23Var.h(str);
        if (bArrH.length != 0 || str.length() <= 0) {
            return bArrH;
        }
        u7.r("Unable to decode ".concat(str));
        return null;
    }

    public static final byte[] K(byte[] bArr, int i2, byte[] bArr2) {
        if (bArr.length - 16 < i2) {
            u7.r("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return null;
        }
        byte[] bArr3 = new byte[16];
        for (int i3 = 0; i3 < 16; i3++) {
            bArr3[i3] = (byte) (bArr[i3 + i2] ^ bArr2[i3]);
        }
        return bArr3;
    }

    public static String L(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i2 = 0; i2 < iMin; i2++) {
            String str2 = strArr[i2];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i2];
            }
        }
        return null;
    }

    public static final void M(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2) {
        if (i2 < 0 || byteBuffer2.remaining() < i2 || byteBuffer3.remaining() < i2 || byteBuffer.remaining() < i2) {
            u7.r("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static void N(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt("init_without_write", 0).putInt("crash_without_write", 0).commit();
    }

    public static int O(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return 0;
        }
        try {
            return sharedPreferences.getInt(str, 0);
        } catch (ClassCastException unused) {
            return 0;
        }
    }

    public static BufferedChannel a(int i2, int i3, BufferOverflow bufferOverflow) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if (i2 == -2) {
            if (bufferOverflow != BufferOverflow.SUSPEND) {
                return new ConflatedBufferedChannel(1, bufferOverflow, null);
            }
            Channel.Factory.getClass();
            return new BufferedChannel(jm.b, null);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(i2, null) : new ConflatedBufferedChannel(i2, bufferOverflow, null) : new BufferedChannel(Integer.MAX_VALUE, null) : bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(0, null) : new ConflatedBufferedChannel(1, bufferOverflow, null);
        }
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            return new ConflatedBufferedChannel(1, BufferOverflow.DROP_OLDEST, null);
        }
        u7.r("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static final Bundle b(kotlin.Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (kotlin.Pair pair : pairArr) {
            String str = (String) pair.component1();
            Object objComponent2 = pair.component2();
            if (objComponent2 == null) {
                bundle.putString(str, null);
            } else if (objComponent2 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) objComponent2).booleanValue());
            } else if (objComponent2 instanceof Byte) {
                bundle.putByte(str, ((Number) objComponent2).byteValue());
            } else if (objComponent2 instanceof Character) {
                bundle.putChar(str, ((Character) objComponent2).charValue());
            } else if (objComponent2 instanceof Double) {
                bundle.putDouble(str, ((Number) objComponent2).doubleValue());
            } else if (objComponent2 instanceof Float) {
                bundle.putFloat(str, ((Number) objComponent2).floatValue());
            } else if (objComponent2 instanceof Integer) {
                bundle.putInt(str, ((Number) objComponent2).intValue());
            } else if (objComponent2 instanceof Long) {
                bundle.putLong(str, ((Number) objComponent2).longValue());
            } else if (objComponent2 instanceof Short) {
                bundle.putShort(str, ((Number) objComponent2).shortValue());
            } else if (objComponent2 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) objComponent2);
            } else if (objComponent2 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) objComponent2);
            } else if (objComponent2 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) objComponent2);
            } else if (objComponent2 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) objComponent2);
            } else if (objComponent2 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) objComponent2);
            } else if (objComponent2 instanceof char[]) {
                bundle.putCharArray(str, (char[]) objComponent2);
            } else if (objComponent2 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) objComponent2);
            } else if (objComponent2 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) objComponent2);
            } else if (objComponent2 instanceof int[]) {
                bundle.putIntArray(str, (int[]) objComponent2);
            } else if (objComponent2 instanceof long[]) {
                bundle.putLongArray(str, (long[]) objComponent2);
            } else if (objComponent2 instanceof short[]) {
                bundle.putShortArray(str, (short[]) objComponent2);
            } else if (objComponent2 instanceof Object[]) {
                Class<?> componentType = objComponent2.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) objComponent2);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) objComponent2);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) objComponent2);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) objComponent2);
                }
            } else if (objComponent2 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) objComponent2);
            } else if (objComponent2 instanceof IBinder) {
                bundle.putBinder(str, (IBinder) objComponent2);
            } else if (objComponent2 instanceof Size) {
                bundle.putSize(str, (Size) objComponent2);
            } else {
                if (!(objComponent2 instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objComponent2.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) objComponent2);
            }
        }
        return bundle;
    }

    public static final void c(int i2) {
        if (i2 >= 1) {
            return;
        }
        zu0.e(hz.o(i2, "Expected positive parallelism level, but got "));
    }

    public static byte[] d(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static IconCompat e(Icon icon) {
        icon.getClass();
        int iL = l(icon);
        if (iL == 2) {
            return IconCompat.c(null, k(icon), j(icon));
        }
        if (iL == 4) {
            Uri uriM = m(icon);
            PorterDuff.Mode mode = IconCompat.k;
            uriM.getClass();
            String string = uriM.toString();
            string.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.b = string;
            return iconCompat;
        }
        if (iL != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.b = icon;
            return iconCompat2;
        }
        Uri uriM2 = m(icon);
        PorterDuff.Mode mode2 = IconCompat.k;
        uriM2.getClass();
        String string2 = uriM2.toString();
        string2.getClass();
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.b = string2;
        return iconCompat3;
    }

    public static int[] f(BitMatrix bitMatrix, int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i5 = 0;
        while (bitMatrix.b(i2, i3) && i2 > 0) {
            int i6 = i5 + 1;
            if (i5 >= 3) {
                break;
            }
            i2--;
            i5 = i6;
        }
        int length = iArr.length;
        int i7 = i2;
        int i8 = 0;
        boolean z = false;
        while (i2 < i4) {
            if (bitMatrix.b(i2, i3) != z) {
                iArr2[i8] = iArr2[i8] + 1;
            } else {
                if (i8 != length - 1) {
                    i8++;
                } else {
                    if (r(iArr2, iArr) < 0.42f) {
                        return new int[]{i7, i2};
                    }
                    i7 += iArr2[0] + iArr2[1];
                    int i9 = i8 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i9);
                    iArr2[i9] = 0;
                    iArr2[i8] = 0;
                    i8--;
                }
                iArr2[i8] = 1;
                z = !z;
            }
            i2++;
        }
        if (i8 != length - 1 || r(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i2 - 1};
    }

    public static ResultPoint[] g(BitMatrix bitMatrix, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        int i7;
        boolean z;
        int[] iArrF;
        ResultPoint[] resultPointArr = new ResultPoint[4];
        int[] iArr2 = iArr;
        int[] iArr3 = new int[iArr2.length];
        int i8 = i4;
        while (true) {
            if (i8 >= i2) {
                i7 = i8;
                z = false;
                break;
            }
            int[] iArrF2 = f(bitMatrix, i5, i8, i3, iArr2, iArr3);
            if (iArrF2 != null) {
                int[] iArr4 = iArrF2;
                while (true) {
                    i7 = i8;
                    if (i7 <= 0 || (iArrF = f(bitMatrix, i5, i7 - 1, i3, iArr, iArr3)) == null) {
                        break;
                    }
                    iArr4 = iArrF;
                }
                float f2 = i7;
                resultPointArr[0] = new ResultPoint(iArr4[0], f2);
                resultPointArr[1] = new ResultPoint(iArr4[1], f2);
                z = true;
            } else {
                i8 += 5;
                iArr2 = iArr;
            }
        }
        int i9 = i7 + 1;
        if (z) {
            int[] iArr5 = {(int) resultPointArr[0].a, (int) resultPointArr[1].a};
            int i10 = i9;
            int i11 = 0;
            while (i10 < i2) {
                int[] iArrF3 = f(bitMatrix, iArr5[0], i10, i3, iArr, iArr3);
                if (iArrF3 != null && Math.abs(iArr5[0] - iArrF3[0]) < 5 && Math.abs(iArr5[1] - iArrF3[1]) < 5) {
                    iArr5 = iArrF3;
                    i11 = 0;
                } else {
                    if (i11 > 25) {
                        break;
                    }
                    i11++;
                }
                i10++;
            }
            i9 = i10 - (i11 + 1);
            float f3 = i9;
            resultPointArr[2] = new ResultPoint(iArr5[0], f3);
            resultPointArr[3] = new ResultPoint(iArr5[1], f3);
        }
        if (i9 - i7 < i6) {
            Arrays.fill(resultPointArr, (Object) null);
        }
        return resultPointArr;
    }

    public static float h(int i2, String[] strArr) {
        float f2 = Float.parseFloat(strArr[i2]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
    }

    public static final ViewTargetRequestManager i(View view) {
        ViewTargetRequestManager viewTargetRequestManager;
        Object tag = view.getTag(dev.zeron.tunnel.R.id.coil3_request_manager);
        ViewTargetRequestManager viewTargetRequestManager2 = tag instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag : null;
        if (viewTargetRequestManager2 != null) {
            return viewTargetRequestManager2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(dev.zeron.tunnel.R.id.coil3_request_manager);
                viewTargetRequestManager = tag2 instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag2 : null;
                if (viewTargetRequestManager == null) {
                    viewTargetRequestManager = new ViewTargetRequestManager(view);
                    view.addOnAttachStateChangeListener(viewTargetRequestManager);
                    view.setTag(dev.zeron.tunnel.R.id.coil3_request_manager, viewTargetRequestManager);
                }
            } finally {
            }
        }
        return viewTargetRequestManager;
    }

    public static int j(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return j5.m(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    public static String k(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return j5.n(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static int l(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return j5.w(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException unused) {
            Objects.toString(obj);
            return -1;
        } catch (NoSuchMethodException unused2) {
            Objects.toString(obj);
            return -1;
        } catch (InvocationTargetException unused3) {
            Objects.toString(obj);
            return -1;
        }
    }

    public static Uri m(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return j5.x(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final void n(CoroutineContext coroutineContext, Throwable th) {
        Throwable runtimeException;
        Iterator it = wr.a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(coroutineContext, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    b.a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            b.a(th, new DiagnosticCoroutineContextException(coroutineContext));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static boolean o(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static final OrGrammar p(Grammar grammar, Grammar grammar2) {
        return new OrGrammar(c.A(grammar, grammar2));
    }

    public static JsonElement q(JsonReader jsonReader) {
        boolean z;
        try {
            try {
                jsonReader.w();
                z = false;
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
            try {
                return (JsonElement) ki1.z.b(jsonReader);
            } catch (EOFException e3) {
                e = e3;
                if (z) {
                    return JsonNull.a;
                }
                throw new JsonSyntaxException(e);
            }
        } catch (MalformedJsonException e4) {
            throw new JsonSyntaxException(e4);
        } catch (IOException e5) {
            throw new JsonIOException(e5);
        } catch (NumberFormatException e6) {
            throw new JsonSyntaxException(e6);
        }
    }

    public static float r(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            i2 += iArr[i4];
            i3 += iArr2[i4];
        }
        if (i2 < i3) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i2;
        float f3 = f2 / i3;
        float f4 = 0.8f * f3;
        float f5 = 0.0f;
        for (int i5 = 0; i5 < length; i5++) {
            float f6 = iArr2[i5] * f3;
            float f7 = iArr[i5];
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    public static byte[] s(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                u7.p(hz.o(i2, "Not enough bytes to read: "));
                return null;
            }
            i3 += i4;
        }
        return bArr;
    }

    public static byte[] t(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int i5 = fileInputStream.read(bArr2);
                if (i5 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, i5);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i3 - iInflate);
                    i4 += i5;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i4 == i2) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static long u(InputStream inputStream, int i2) throws IOException {
        byte[] bArrS = s(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += ((long) (bArrS[i3] & 255)) << (i3 * 8);
        }
        return j2;
    }

    public static TimeInterpolator v(Context context, int i2, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            u7.r("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!o(strValueOf, "cubic-bezier") && !o(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!o(strValueOf, "cubic-bezier")) {
            if (o(strValueOf, "path")) {
                return new PathInterpolator(iw0.d(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            u7.r("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(h(0, strArrSplit), h(1, strArrSplit), h(2, strArrSplit), h(3, strArrSplit));
        }
        zu0.c(strArrSplit.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
        return null;
    }

    public static final void w(URLBuilder uRLBuilder, URLBuilder uRLBuilder2) {
        uRLBuilder.getClass();
        uRLBuilder2.getClass();
        uRLBuilder.d = uRLBuilder2.d;
        String str = uRLBuilder2.a;
        str.getClass();
        uRLBuilder.a = str;
        uRLBuilder.e(uRLBuilder2.c);
        uRLBuilder.d(uRLBuilder2.h);
        uRLBuilder.e = uRLBuilder2.e;
        uRLBuilder.f = uRLBuilder2.f;
        ParametersBuilderImpl parametersBuilderImplA = sb2.a();
        ay2.b(parametersBuilderImplA, uRLBuilder2.i);
        uRLBuilder.i = parametersBuilderImplA;
        uRLBuilder.j = new UrlDecodedParametersBuilder(parametersBuilderImplA);
        String str2 = uRLBuilder2.g;
        str2.getClass();
        uRLBuilder.g = str2;
        uRLBuilder.b = uRLBuilder2.b;
    }

    public static final SequenceGrammar x(Grammar grammar, Grammar grammar2) {
        return new SequenceGrammar(c.A(grammar, grammar2));
    }

    public static RawSourceChannel y(InputStream inputStream) {
        lv lvVar = oy.a;
        hv hvVar = hv.c;
        hg hgVar = ig.a;
        inputStream.getClass();
        hvVar.getClass();
        hgVar.getClass();
        return new RawSourceChannel(a.a(inputStream), hvVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.drawable.Icon z(androidx.core.graphics.drawable.IconCompat r6, android.content.Context r7) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kf2.z(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
    }
}
