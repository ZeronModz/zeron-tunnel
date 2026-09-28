package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Camera;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.FocusMeteringAction$Builder;
import androidx.camera.core.impl.SessionProcessor;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.internal.ads.zzaev;
import com.google.android.gms.internal.ads.zzafb;
import com.google.android.gms.internal.ads.zzafh;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzgup;
import com.google.android.gms.internal.ads.zzgxj;
import com.google.common.hash.Funnel;
import com.google.common.hash.Hasher;
import com.google.common.hash.PrimitiveSink;
import com.trilead.ssh2.sftp.AttribFlags;
import java.util.DesugarCollections;
import java.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.CachedNames;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k02 implements Hasher {
    public static wl0 a;
    public static final byte[] b = {53, 54, 43, 44, 45, 46, 47, 48, 37, 38};
    public static final byte[] c = {55, 56, 57, 58, 59, 60, 49, 50, 51, 52};
    public static final byte[] d = {39, 40, 41, 42, 31, 32};
    public static final byte[] e = {33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2};
    public static final byte[][] f = {new byte[]{39, 40, 41, 42, 31, 32}, new byte[]{33, 34, 35, 36, 25, 26}, new byte[]{27, 28, 29, 30, 19, 20}, new byte[]{21, 22, 23, 24, 13, 14}, new byte[]{15, 16, 17, 18, 7, 8}, new byte[]{9, 10, 11, 12, 1, 2}};
    public static final String[] g = {"\rABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001e\ufffbÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8"};
    public static final SerialDescriptor[] h = new SerialDescriptor[0];
    public static final byte[] i = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] j = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};
    public static long k;
    public static Method l;
    public static Method m;
    public static Method n;
    public static Method o;

    public static int A(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static String B(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static String C(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strL;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length) {
                break;
            }
            Object obj = objArr[i3];
            if (obj == null) {
                strL = "null";
            } else {
                try {
                    strL = obj.toString();
                } catch (Exception e2) {
                    String strM = vh.m(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM), (Throwable) e2);
                    strL = ec1.L("<", strM, " threw ", e2.getClass().getName(), ">");
                }
            }
            objArr[i3] = strL;
            i3++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i4 = 0;
        while (true) {
            length2 = objArr.length;
            if (i2 >= length2 || (iIndexOf = str.indexOf("%s", i4)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i4, iIndexOf);
            sb.append(objArr[i2]);
            i2++;
            i4 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i4, str.length());
        if (i2 < length2) {
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

    public static void D(File file, byte[] bArr) throws IOException {
        file.getClass();
        zzgup zzgupVarZzp = zzgup.zzp(new zzgxj[0]);
        bArr.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file, zzgupVarZzp.contains(zzgxj.APPEND));
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void E(Object obj, String str) {
        if (obj != null) {
            return;
        }
        io0.e(str);
    }

    public static void F(long[] jArr, long[] jArr2, int i2) {
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = (int) jArr[i3];
            jArr[i3] = ((-i2) & (((int) jArr2[i3]) ^ i4)) ^ i4;
        }
    }

    public static boolean G(zzaev zzaevVar) throws IOException {
        zzer zzerVar = new zzer(8);
        int i2 = k31.e(zzaevVar, zzerVar).a;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        zzaevVar.zzi(zzerVar.a, 0, 4);
        zzerVar.D(0);
        int iB = zzerVar.b();
        if (iB == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iB).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(iB);
        ii2.Q(sb.toString());
        return false;
    }

    public static boolean H(zzer zzerVar, zzafh zzafhVar, int i2, zzafb zzafbVar) {
        long jN = zzerVar.N();
        long j2 = jN >>> 16;
        if (j2 != i2) {
            return false;
        }
        boolean z = (j2 & 1) == 1;
        long j3 = jN >> 12;
        long j4 = jN >> 8;
        long j5 = jN >> 4;
        long j6 = jN >> 1;
        long j7 = jN & 1;
        int i3 = (int) (j5 & 15);
        if (i3 <= 7) {
            if (i3 != zzafhVar.g - 1) {
                return false;
            }
        } else if (i3 > 10 || zzafhVar.g != 2) {
            return false;
        }
        int i4 = (int) (j6 & 7);
        if ((i4 != 0 && i4 != zzafhVar.i) || j7 == 1 || !O(zzerVar, zzafhVar, z, zzafbVar)) {
            return false;
        }
        long j8 = zzafbVar.a;
        int iK = K((int) (j3 & 15), zzerVar);
        long j9 = zzafhVar.j;
        boolean z2 = j9 == 0 || j8 + ((long) iK) >= j9;
        if (iK == -1) {
            return false;
        }
        if ((!z2 && iK < zzafhVar.a) || iK > zzafhVar.b) {
            return false;
        }
        int i5 = zzafhVar.e;
        int i6 = (int) (j4 & 15);
        if (i6 != 0) {
            if (i6 <= 11) {
                if (i6 != zzafhVar.f) {
                    return false;
                }
            } else if (i6 != 12) {
                if (i6 > 14) {
                    return false;
                }
                int iJ = zzerVar.J();
                if (i6 == 14) {
                    iJ *= 10;
                }
                if (iJ != i5) {
                    return false;
                }
            } else if (zzerVar.I() * 1000 != i5) {
                return false;
            }
        }
        int I = zzerVar.I();
        int i7 = zzerVar.b;
        byte[] bArr = zzerVar.a;
        int i8 = i7 - 1;
        int i9 = 0;
        for (int i10 = zzerVar.b; i10 < i8; i10++) {
            i9 = wt2.i[i9 ^ (bArr[i10] & 255)];
        }
        String str = wt2.a;
        if (I != i9) {
            return false;
        }
        if (zzerVar.B() != 0) {
            int iG = zzerVar.G();
            if ((iG & 128) != 0) {
                return false;
            }
            int i11 = (iG & 126) >> 1;
            if ((i11 >= 2 && i11 <= 7) || (i11 >= 13 && i11 <= 31)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 57);
                sb.append("Ignoring frame where first subframe has a reserved type: ");
                sb.append(i11);
                ii2.H(sb.toString());
                return false;
            }
        }
        return true;
    }

    public static void I(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        p60.f("Unable to create parent directories of ".concat(file.toString()));
    }

    public static void J(Object obj) {
        if (obj != null) {
            return;
        }
        io0.e("Cannot return null from a non-@Nullable @Provides method");
    }

    public static int K(int i2, zzer zzerVar) {
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return zzerVar.I() + 1;
            case 7:
                return zzerVar.J() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }

    public static void L(File file, File file2) throws IOException {
        file.getClass();
        file2.getClass();
        if (file.equals(file2)) {
            u7.r(mu.F("Source %s and destination %s must be different", file, file2));
            return;
        }
        if (file.renameTo(file2)) {
            return;
        }
        if (file.equals(file2)) {
            u7.r(mu.F("Source %s and destination %s must be different", file, file2));
            return;
        }
        zzgup zzgupVarZzp = zzgup.zzp(new zzgxj[0]);
        r23 r23Var = new r23();
        ArrayDeque arrayDeque = r23Var.a;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            arrayDeque.addFirst(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(file2, zzgupVarZzp.contains(zzgxj.APPEND));
            arrayDeque.addFirst(fileOutputStream);
            int i2 = p23.a;
            byte[] bArr = new byte[AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT];
            while (true) {
                int i3 = fileInputStream.read(bArr);
                if (i3 == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, i3);
                }
            }
            r23Var.close();
            if (file.delete()) {
                return;
            }
            if (file2.delete()) {
                p60.f("Unable to delete ".concat(file.toString()));
            } else {
                p60.f("Unable to delete ".concat(file2.toString()));
            }
        } catch (Throwable th) {
            try {
                r23Var.b = th;
                Object obj = o13.a;
                if (IOException.class.isInstance(th)) {
                    throw ((Throwable) IOException.class.cast(th));
                }
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                if (!(th instanceof Error)) {
                    throw new RuntimeException(th);
                }
                throw ((Error) th);
            } catch (Throwable th2) {
                r23Var.close();
                throw th2;
            }
        }
    }

    public static void M(Class cls, Object obj) {
        if (obj != null) {
            return;
        }
        u7.p(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }

    public static k31 N(int i2, zzaev zzaevVar, zzer zzerVar) throws IOException {
        k31 k31VarE = k31.e(zzaevVar, zzerVar);
        while (true) {
            int i3 = k31VarE.a;
            if (i3 == i2) {
                return k31VarE;
            }
            ec1.N(i3, "Ignoring unknown WAV chunk: ", new StringBuilder(String.valueOf(i3).length() + 28));
            long j2 = k31VarE.b;
            long j3 = 8 + j2;
            if ((1 & j2) != 0) {
                j3 = 9 + j2;
            }
            if (j3 > 2147483647L) {
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 40);
                sb.append("Chunk is too large (~2GB+) to skip; id: ");
                sb.append(i3);
                throw zzat.zzc(sb.toString());
            }
            zzaevVar.zzf((int) j3);
            k31VarE = k31.e(zzaevVar, zzerVar);
        }
    }

    public static boolean O(zzer zzerVar, zzafh zzafhVar, boolean z, zzafb zzafbVar) {
        try {
            long jO = zzerVar.o();
            if (!z) {
                jO *= (long) zzafhVar.b;
            }
            long j2 = zzafhVar.j;
            if (j2 != 0 && jO > j2) {
                return false;
            }
            zzafbVar.a = jO;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void a(String str, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            ag1.a(y(str), i2);
            return;
        }
        String strY = y(str);
        try {
            Method method = m;
            if (method == null) {
                method = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                m = method;
            }
            method.invoke(null, Long.valueOf(k), strY, Integer.valueOf(i2));
        } catch (Exception e2) {
            q(e2);
        }
    }

    public static final void b(int i2) {
        new Integer(i2);
    }

    public static final Set c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof CachedNames) {
            return ((CachedNames) serialDescriptor).getC();
        }
        HashSet hashSet = new HashSet(serialDescriptor.getC());
        int elementsCount = serialDescriptor.getC();
        for (int i2 = 0; i2 < elementsCount; i2++) {
            hashSet.add(serialDescriptor.getElementName(i2));
        }
        return hashSet;
    }

    public static int d(int i2, double d2) {
        int iMax = Math.max(i2, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d2 * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i3 = iHighestOneBit << 1;
        if (i3 > 0) {
            return i3;
        }
        return 1073741824;
    }

    public static final SerialDescriptor[] e(List list) {
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? h : serialDescriptorArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (defpackage.n8.k(r0.getWidth(), r0.getHeight(), (int) (r4 >> 32), (int) (r4 & 4294967295L), r11) == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap f(android.graphics.drawable.Drawable r8, android.graphics.Bitmap.Config r9, coil3.size.Size r10, coil3.size.Scale r11, boolean r12) {
        /*
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 32
            if (r0 == 0) goto L4e
            r0 = r8
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            android.graphics.Bitmap$Config r4 = r0.getConfig()
            if (r9 == 0) goto L21
            boolean r5 = defpackage.i5.k(r9)
            if (r5 == 0) goto L1f
            goto L21
        L1f:
            r5 = r9
            goto L23
        L21:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
        L23:
            if (r4 != r5) goto L4e
            if (r12 == 0) goto L28
            goto L4d
        L28:
            int r12 = r0.getWidth()
            int r4 = r0.getHeight()
            coil3.size.Size r5 = coil3.size.Size.c
            long r4 = defpackage.n8.j(r12, r4, r10, r11, r5)
            long r6 = r4 >> r3
            int r12 = (int) r6
            long r4 = r4 & r1
            int r4 = (int) r4
            int r5 = r0.getWidth()
            int r6 = r0.getHeight()
            double r4 = defpackage.n8.k(r5, r6, r12, r4, r11)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 != 0) goto L4e
        L4d:
            return r0
        L4e:
            android.graphics.drawable.Drawable r8 = r8.mutate()
            int r12 = coil3.util.f.b(r8)
            r0 = 512(0x200, float:7.17E-43)
            if (r12 <= 0) goto L5b
            goto L5c
        L5b:
            r12 = r0
        L5c:
            int r4 = coil3.util.f.a(r8)
            if (r4 <= 0) goto L63
            r0 = r4
        L63:
            coil3.size.Size r4 = coil3.size.Size.c
            long r4 = defpackage.n8.j(r12, r0, r10, r11, r4)
            long r6 = r4 >> r3
            int r10 = (int) r6
            long r1 = r1 & r4
            int r1 = (int) r1
            double r10 = defpackage.n8.k(r12, r0, r10, r1, r11)
            double r1 = (double) r12
            double r1 = r1 * r10
            int r12 = kotlin.math.a.a(r1)
            double r0 = (double) r0
            double r10 = r10 * r0
            int r10 = kotlin.math.a.a(r10)
            if (r9 == 0) goto L86
            boolean r11 = defpackage.i5.k(r9)
            if (r11 == 0) goto L88
        L86:
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
        L88:
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r12, r10, r9)
            android.graphics.Rect r11 = r8.getBounds()
            int r0 = r11.left
            int r1 = r11.top
            int r2 = r11.right
            int r11 = r11.bottom
            r3 = 0
            r8.setBounds(r3, r3, r12, r10)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r9)
            r8.draw(r10)
            r8.setBounds(r0, r1, r2, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k02.f(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, coil3.size.Size, coil3.size.Scale, boolean):android.graphics.Bitmap");
    }

    public static CameraUnavailableException g(CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int reason = cameraAccessExceptionCompat.getReason();
        int i2 = 1;
        if (reason != 1) {
            i2 = 2;
            if (reason != 2) {
                i2 = 3;
                if (reason != 3) {
                    i2 = 4;
                    if (reason != 4) {
                        i2 = 5;
                        if (reason != 5) {
                            i2 = reason != 10001 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return new CameraUnavailableException(i2, cameraAccessExceptionCompat);
    }

    public static void h(String str, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            ag1.b(y(str), i2);
            return;
        }
        String strY = y(str);
        try {
            Method method = n;
            if (method == null) {
                method = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                n = method;
            }
            method.invoke(null, Long.valueOf(k), strY, Integer.valueOf(i2));
        } catch (Exception e2) {
            q(e2);
        }
    }

    public static Context i(Context context) {
        int iH;
        Context applicationContext = context.getApplicationContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34 && (iH = w1.h(context)) != w1.h(applicationContext)) {
            applicationContext = w1.a(applicationContext, iH);
        }
        if (i2 >= 30) {
            String strF = u1.f(context);
            if (!Objects.equals(strF, u1.f(applicationContext))) {
                return u1.a(applicationContext, strF);
            }
        }
        return applicationContext;
    }

    public static int j(int i2) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            return -1;
        }
        boolean z = i2 >= 0;
        if (!z) {
            i2 = 0;
            while (i2 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i2, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i2++;
            }
        }
        return i2 < numberOfCameras ? i2 : z ? -1 : 0;
    }

    public static int k(byte[] bArr, byte[] bArr2) {
        int length = 0;
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            int i3 = bArr2[i2] - 1;
            length += (((1 << (5 - (i3 % 6))) & bArr[i3 / 6]) == 0 ? 0 : 1) << ((bArr2.length - i2) - 1);
        }
        return length;
    }

    public static final Class l(KClass kClass) {
        kClass.getClass();
        Class<?> jClass = ((ClassBasedDeclarationContainer) kClass).getA();
        jClass.getClass();
        return jClass;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class m(KClass kClass) {
        kClass.getClass();
        Class<?> jClass = ((ClassBasedDeclarationContainer) kClass).getA();
        if (jClass.isPrimitive()) {
            String name = jClass.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals(TypedValues.Custom.S_FLOAT)) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return jClass;
    }

    public static String n(int i2, int i3, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int i4 = i2;
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        while (i4 < i2 + i3) {
            char cCharAt = g[i6].charAt(bArr[i4]);
            switch (cCharAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i7 = i6;
                    i6 = cCharAt - 65520;
                    i5 = 1;
                    break;
                case 65525:
                    i5 = 2;
                    i7 = i6;
                    i6 = 0;
                    break;
                case 65526:
                    i5 = 3;
                    i7 = i6;
                    i6 = 0;
                    break;
                case 65527:
                    i5 = -1;
                    i6 = 0;
                    break;
                case 65528:
                    i5 = -1;
                    i6 = 1;
                    break;
                case 65529:
                    i5 = -1;
                    break;
                case 65530:
                default:
                    sb.append(cCharAt);
                    break;
                case 65531:
                    int i8 = (bArr[i4 + 1] << 24) + (bArr[i4 + 2] << 18) + (bArr[i4 + 3] << 12) + (bArr[i4 + 4] << 6);
                    i4 += 5;
                    sb.append(new DecimalFormat("000000000").format(i8 + bArr[i4]));
                    break;
            }
            int i9 = i5 - 1;
            if (i5 == 0) {
                i6 = i7;
            }
            i4++;
            i5 = i9;
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == 65532) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static x70 o(SessionProcessor sessionProcessor, x70 x70Var) {
        boolean z;
        if (sessionProcessor == null) {
            return x70Var;
        }
        FocusMeteringAction$Builder focusMeteringAction$Builder = new FocusMeteringAction$Builder(x70Var);
        boolean z2 = true;
        if (x70Var.a.isEmpty() || s(sessionProcessor, 1, 2)) {
            z = false;
        } else {
            focusMeteringAction$Builder.a(1);
            z = true;
        }
        if (!x70Var.b.isEmpty() && !s(sessionProcessor, 3)) {
            focusMeteringAction$Builder.a(2);
            z = true;
        }
        if (x70Var.c.isEmpty() || s(sessionProcessor, 4)) {
            z2 = z;
        } else {
            focusMeteringAction$Builder.a(4);
        }
        if (!z2) {
            return x70Var;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(focusMeteringAction$Builder.a);
        List listUnmodifiableList2 = DesugarCollections.unmodifiableList(focusMeteringAction$Builder.b);
        List listUnmodifiableList3 = DesugarCollections.unmodifiableList(focusMeteringAction$Builder.c);
        if (listUnmodifiableList.isEmpty() && listUnmodifiableList2.isEmpty() && listUnmodifiableList3.isEmpty()) {
            return null;
        }
        return new x70(focusMeteringAction$Builder);
    }

    public static SharedPreferences p(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static void q(Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            p60.l(cause);
        }
    }

    public static boolean r() {
        if (Build.VERSION.SDK_INT >= 29) {
            return ag1.c();
        }
        try {
            Method method = l;
            if (method == null) {
                k = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                l = method;
            }
            return ((Boolean) method.invoke(null, Long.valueOf(k))).booleanValue();
        } catch (Exception e2) {
            q(e2);
            return false;
        }
    }

    public static boolean s(SessionProcessor sessionProcessor, int... iArr) {
        if (sessionProcessor == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        return sessionProcessor.getSupportedCameraOperations().containsAll(arrayList);
    }

    public static void t(float f2, float[] fArr) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f2, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void u(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }

    public static void v(int i2, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            ag1.d(i2, y(str));
            return;
        }
        String strY = y(str);
        try {
            Method method = o;
            if (method == null) {
                method = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
                o = method;
            }
            method.invoke(null, Long.valueOf(k), strY, Integer.valueOf(i2));
        } catch (Exception e2) {
            q(e2);
        }
    }

    public static int w(int i2) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i2) * (-862048943)), 15)) * 461845907);
    }

    public static int x(Object obj) {
        return w(obj == null ? 0 : obj.hashCode());
    }

    public static String y(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static final void z(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byteBuffer2.getClass();
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
        int iRemaining = byteBufferSlice2.remaining();
        int iRemaining2 = byteBufferSlice.remaining();
        for (int i2 = 0; i2 < iRemaining2; i2++) {
            byteBufferSlice.put(i2, (byte) (byteBufferSlice.get(i2) ^ byteBufferSlice2.get(i2 % iRemaining)));
        }
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBoolean(boolean z) {
        return putByte(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(byte[] bArr) {
        return putBytes(bArr, 0, bArr.length);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putDouble(double d2) {
        return putLong(Double.doubleToRawLongBits(d2));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putFloat(float f2) {
        return putInt(Float.floatToRawIntBits(f2));
    }

    @Override // com.google.common.hash.Hasher
    public Hasher putObject(Object obj, Funnel funnel) {
        funnel.funnel(obj, this);
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putShort(short s) {
        putByte((byte) s);
        putByte((byte) (s >>> 8));
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putString(CharSequence charSequence, Charset charset) {
        return putBytes(charSequence.toString().getBytes(charset));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putUnencodedChars(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            putChar(charSequence.charAt(i2));
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public PrimitiveSink putBoolean(boolean z) {
        return putByte(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ PrimitiveSink putUnencodedChars(CharSequence charSequence) {
        putUnencodedChars(charSequence);
        return this;
    }
}
