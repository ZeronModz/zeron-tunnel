package defpackage;

import android.app.AppOpsManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.MediaFormat;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.h;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzguc;
import com.google.android.gms.internal.ads.zzguf;
import com.google.android.gms.internal.ads.zzhww;
import com.google.android.gms.internal.measurement.zzlh;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.a;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.SharedSessionRepository;
import io.ktor.util.StringValues;
import io.ktor.utils.io.SourceByteReadChannel;
import java.util.Objects;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.io.Buffer;
import kotlinx.io.Sink;
import kotlinx.io.Source;
import kotlinx.io.bytestring.ByteString;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ii2 {
    public static ExecutorService a = null;
    public static final ns1 b = new ns1(5);
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static SharedSessionRepository e = null;
    public static boolean f = true;
    public static Field g;
    public static boolean h;

    public static String A(zzlh zzlhVar) {
        StringBuilder sb = new StringBuilder(zzlhVar.zzc());
        for (int i = 0; i < zzlhVar.zzc(); i++) {
            byte bZza = zzlhVar.zza(i);
            if (bZza == 34) {
                sb.append("\\\"");
            } else if (bZza == 39) {
                sb.append("\\'");
            } else if (bZza != 92) {
                switch (bZza) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bZza < 32 || bZza > 126) {
                            sb.append('\\');
                            sb.append((char) (((bZza >>> 6) & 3) + 48));
                            sb.append((char) (((bZza >>> 3) & 7) + 48));
                            sb.append((char) ((bZza & 7) + 48));
                        } else {
                            sb.append((char) bZza);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static synchronized Executor B() {
        ExecutorService executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor = a;
        if (executorServiceNewSingleThreadExecutor == null) {
            String str = wt2.a;
            executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new v30(2, "ExoPlayer:BackgroundExecutor"));
            a = executorServiceNewSingleThreadExecutor;
        }
        return executorServiceNewSingleThreadExecutor;
    }

    public static void C(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(vh.i(i, "csd-", new StringBuilder(String.valueOf(i).length() + 4)), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void D(String str) {
        synchronized (d) {
            U(str, null);
        }
    }

    public static long[] E(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i = (int) length;
        n8.p0(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i));
        long[] jArr3 = new long[i];
        int i2 = 0;
        for (long[] jArr4 : jArr) {
            int length2 = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i2, length2);
            i2 += length2;
        }
        return jArr3;
    }

    public static ECParameterSpec F(zzhww zzhwwVar) throws NoSuchAlgorithmException {
        int iOrdinal = zzhwwVar.ordinal();
        if (iOrdinal == 0) {
            return w63.a;
        }
        if (iOrdinal == 1) {
            return w63.b;
        }
        if (iOrdinal == 2) {
            return w63.c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(zzhwwVar.toString()));
    }

    public static void G(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void H(String str) {
        synchronized (d) {
            U(str, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean I(com.google.android.gms.internal.ads.zzer r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r1.b
        L6:
            int r3 = r1.B()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r23
            if (r3 < r5) goto La5
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.b()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.N()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.J()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto La9
        L23:
            int r7 = r1.M()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.M()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L20
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L39
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L39
            if (r10 != 0) goto L39
            goto La5
        L39:
            r7 = 4
            if (r0 != r7) goto L69
            if (r24 != 0) goto L69
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L49
        L46:
            r4 = r6
            goto La5
        L49:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L69:
            if (r0 != r7) goto L79
            r3 = r10 & 64
            if (r3 == 0) goto L70
            goto L71
        L70:
            r4 = r6
        L71:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L8b
        L79:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L81
            r3 = r4
            goto L82
        L81:
            r3 = r6
        L82:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L87
            goto L8b
        L87:
            r4 = r6
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L20
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L95
            goto L46
        L95:
            int r3 = r1.B()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L20
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L9f
            goto L46
        L9f:
            int r3 = (int) r8     // Catch: java.lang.Throwable -> L20
            r1.E(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        La5:
            r1.D(r2)
            return r4
        La9:
            r1.D(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii2.I(com.google.android.gms.internal.ads.zzer, int, int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x025c, code lost:
    
        if (r8 == 67) goto L149;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzain J(int r33, com.google.android.gms.internal.ads.zzer r34, boolean r35, com.google.android.gms.internal.ads.zzaij r36) {
        /*
            Method dump skipped, instruction units count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii2.J(int, com.google.android.gms.internal.ads.zzer, boolean, com.google.android.gms.internal.ads.zzaij):com.google.android.gms.internal.ads.zzain");
    }

    public static void K(String str) {
        synchronized (d) {
            U(str, null);
        }
    }

    public static void L(ArrayList arrayList, x40 x40Var) {
        String str = (String) x40Var.g();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    public static byte[] M(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length || bArr[i] != 0) {
                break;
            }
            i++;
        }
        if (i == length) {
            i = length - 1;
        }
        int i2 = (bArr[i] & 128) == 128 ? 1 : 0;
        int i3 = length - i;
        byte[] bArr2 = new byte[i3 + i2];
        System.arraycopy(bArr, i, bArr2, i2, i3);
        return bArr2;
    }

    public static zzguf N(int i, int i2, byte[] bArr) {
        if (i2 >= bArr.length) {
            return zzguf.zzj(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
        int i3 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        int iV = V(i2, i, bArr);
        while (i2 < iV) {
            zzgucVar.a(new String(bArr, i2, iV - i2, R(i)));
            i2 = X(i) + iV;
            iV = V(i2, i, bArr);
        }
        zzguf zzgufVarF = zzgucVar.f();
        return zzgufVarF.isEmpty() ? zzguf.zzj(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) : zzgufVarF;
    }

    public static void O(String str, Throwable th) {
        synchronized (d) {
            U(str, th);
        }
    }

    public static int P(int i, zzer zzerVar) {
        byte[] bArr = zzerVar.a;
        int i2 = zzerVar.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    public static void Q(String str) {
        synchronized (d) {
            U(str, null);
        }
    }

    public static Charset R(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static void S(String str, Throwable th) {
        synchronized (d) {
            U(str, th);
        }
    }

    public static String T(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static void U(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (d) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return;
        }
        String strReplace2 = strReplace.replace("\n", "\n  ");
        int length = str.length();
        new StringBuilder(String.valueOf(strReplace2).length() + length + 3 + 1);
    }

    public static int V(int i, int i2, byte[] bArr) {
        int iW = W(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iW;
        }
        while (true) {
            int length = bArr.length;
            if (iW >= length - 1) {
                return length;
            }
            int i3 = iW + 1;
            if ((iW - i) % 2 == 0 && bArr[i3] == 0) {
                return iW;
            }
            iW = W(i3, bArr);
        }
    }

    public static int W(int i, byte[] bArr) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    public static int X(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static String Y(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : new String(bArr, i, i2 - i, charset);
    }

    public static SourceByteReadChannel a(byte[] bArr) {
        int length = bArr.length;
        bArr.getClass();
        Buffer buffer = new Buffer();
        buffer.write(bArr, 0, length);
        return new SourceByteReadChannel(buffer);
    }

    public static void b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final void c(ReceiveChannel receiveChannel, Throwable th) {
        CancellationException cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationExceptionA == null) {
            cancellationExceptionA = j03.a("Channel was consumed, consumer had failed", th);
        }
        receiveChannel.cancel(cancellationExceptionA);
    }

    public static int d(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, k5.o(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static ImageView.ScaleType e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static final String f(CharsetDecoder charsetDecoder, Source source) {
        charsetDecoder.getClass();
        source.getClass();
        StringBuilder sb = new StringBuilder((int) Math.min(2147483647L, source.getC().c));
        Charset charset = charsetDecoder.charset();
        charset.getClass();
        if (charset.equals(xm.a)) {
            sb.append((CharSequence) w91.y(source));
        } else {
            int i = sg.a;
            long j = source.getC().c;
            byte[] bArrD = mc2.D(source, -1);
            ByteString.c.getClass();
            xu xuVar = null;
            ByteString byteString = new ByteString(bArrD, xuVar, xuVar);
            Charset charset2 = charsetDecoder.charset();
            charset2.getClass();
            sb.append((CharSequence) new String(byteString.a, charset2));
        }
        return sb.toString();
    }

    public static final void g(CharsetEncoder charsetEncoder, Sink sink, CharSequence charSequence, int i, int i2) {
        charsetEncoder.getClass();
        sink.getClass();
        charSequence.getClass();
        if (i >= i2) {
            return;
        }
        do {
            byte[] bArrE = ay2.e(charsetEncoder, charSequence, i, i2);
            sink.write(bArrE, 0, bArrE.length);
            int length = bArrE.length;
            if (length < 0) {
                u7.p("Check failed.");
                return;
            }
            i += length;
        } while (i < i2);
    }

    public static void h(StringValues stringValues, Function2 function2) {
        function2.getClass();
        Iterator<T> it = stringValues.entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            function2.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static boolean m(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 1;
    }

    public static final int o(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i) {
        byteBuffer.getClass();
        byteBuffer2.getClass();
        int iMin = Math.min(i, Math.min(byteBuffer.remaining(), byteBuffer2.remaining()));
        if (iMin == byteBuffer.remaining()) {
            byteBuffer2.put(byteBuffer);
            return iMin;
        }
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer2.put(byteBuffer);
        byteBuffer.limit(iLimit);
        return iMin;
    }

    public static final byte[] p(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static final void q() {
        try {
            SharedSessionRepository sharedSessionRepository = e;
            if (sharedSessionRepository == null) {
                SharedSessionRepository.Companion.getClass();
                sharedSessionRepository = ((FirebaseSessionsComponent) a.c().b(FirebaseSessionsComponent.class)).getSharedSessionRepository();
                sharedSessionRepository.getClass();
                e = sharedSessionRepository;
            }
            if (sharedSessionRepository == null) {
                yg0.N("sharedSessionRepository");
                throw null;
            }
            if (sharedSessionRepository.getI()) {
                SharedSessionRepository sharedSessionRepository2 = e;
                if (sharedSessionRepository2 != null) {
                    sharedSessionRepository2.appBackground();
                } else {
                    yg0.N("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void r(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static final void s(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static void t(Context context, boolean z) {
        try {
            Intent intent = new Intent("android.intent.action.AIRPLANE_MODE");
            intent.putExtra("state", z);
            context.sendBroadcast(intent);
            Intent intent2 = new Intent("android.intent.action.AIRPLANE_MODE");
            intent2.putExtra("state", z);
            context.sendBroadcast(intent2);
            Intent intent3 = new Intent("com.android.internal.intent.action.AIRPLANE_MODE");
            intent3.putExtra("state", z);
            context.sendBroadcast(intent3);
            String[] strArr = {"com.miui.intent.action.AIRPLANE_MODE", "com.huawei.intent.action.AIRPLANE_MODE", "com.samsung.intent.action.AIRPLANE_MODE", "com.oppo.intent.action.AIRPLANE_MODE", "com.vivo.intent.action.AIRPLANE_MODE"};
            for (int i = 0; i < 5; i++) {
                try {
                    Intent intent4 = new Intent(strArr[i]);
                    intent4.putExtra("state", z);
                    context.sendBroadcast(intent4);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public static void u(Context context, boolean z) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (Settings.Global.putInt(contentResolver, "airplane_mode_on", z ? 1 : 0)) {
                t(context, z);
                new Handler(Looper.getMainLooper()).postDelayed(new i4(context, 0, contentResolver, z), 1500L);
            }
        } catch (Throwable unused) {
        }
    }

    public static void v(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = h.a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static final String x(Object[] objArr, int i, int i2, w0 w0Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == w0Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static boolean y(Context context, int i, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) Wrappers.a(context).a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static int z(int i) {
        switch (i) {
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
            default:
                return 0;
        }
    }

    public abstract Method i(Class cls, Field field);

    public abstract Constructor j(Class cls);

    public abstract String[] k(Class cls);

    public float l(View view) {
        if (f) {
            try {
                return yo1.a(view);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
        return view.getAlpha();
    }

    public abstract boolean n(Class cls);

    public void w(View view, float f2) {
        if (f) {
            try {
                yo1.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
        view.setAlpha(f2);
    }
}
