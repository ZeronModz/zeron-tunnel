package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.drawable.WrappedDrawable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzaev;
import com.google.android.gms.internal.ads.zzagc;
import com.google.android.gms.internal.ads.zzajv;
import com.google.android.gms.internal.ads.zzalg;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.measurement.zzca;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.g;
import com.sandok.tunnel.service.OpenVPNService;
import com.trilead.ssh2.sftp.Packet;
import io.ktor.http.HttpMessageBuilder;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.math.a;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;
import kotlinx.serialization.json.internal.AbstractJsonLexer;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qj1 {
    public static final s3 a = new s3(0);
    public static final int[][] b = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, 562, 232, 755, 599, 524, 801, 132, 295, 116, 442, 428, 295, 42, 176, 65}, new int[]{361, 575, 922, 525, 176, 586, 640, 321, 536, 742, 677, 742, 687, 284, 193, 517, 273, 494, 263, 147, 593, 800, 571, 320, 803, 133, 231, 390, 685, 330, 63, 410}, new int[]{539, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 6, 93, 862, 771, 453, 106, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 287, 107, TypedValues.PositionType.TYPE_SIZE_PERCENT, 733, 877, 381, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, 723, 476, 462, 172, 430, TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 858, 822, 543, 376, 511, 400, 672, 762, 283, 184, 440, 35, 519, 31, 460, 594, 225, 535, 517, 352, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 158, 651, Packet.SSH_FXP_EXTENDED_REPLY, 488, TypedValues.PositionType.TYPE_DRAWPATH, 648, 733, 717, 83, 404, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, 543}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, 415, 822, 93, 217, 208, 928, 244, 583, 620, 246, 148, 447, 631, 292, 908, 490, TypedValues.TransitionType.TYPE_AUTO_TRANSITION, 516, 258, 457, 907, 594, 723, 674, 292, 272, 96, 684, 432, 686, TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO, 860, 569, 193, 219, 129, 186, 236, 287, 192, 775, 278, 173, 40, 379, 712, 463, 646, 776, 171, 491, 297, 763, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_GCM_SHA256, 732, 95, 270, 447, 90, TypedValues.PositionType.TYPE_PERCENT_Y, 48, 228, 821, 808, 898, 784, 663, 627, 378, 382, 262, 380, TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE, 754, 336, 89, 614, 87, 432, 670, 616, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_GCM_SHA384, 374, 242, 726, 600, 269, 375, 898, 845, 454, 354, 130, 814, 587, 804, 34, 211, 330, 539, 297, 827, 865, 37, 517, 834, 315, 550, 86, 801, 4, 108, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, OpenVPNService.log_deque_max, TypedValues.Custom.TYPE_DIMENSION, 786, 138, 720, 858, 194, 311, 913, 275, 190, 375, 850, 438, 733, 194, 280, Packet.SSH_FXP_EXTENDED_REPLY, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 540, 913, 801, TypedValues.TransitionType.TYPE_DURATION, 799, 137, 439, 418, 592, 668, 353, 859, 370, 694, 325, 240, 216, 257, 284, 549, 209, 884, 315, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, 712, 19, 358, 399, 908, Packet.SSH_FXP_DATA, 511, 51, 8, 517, 225, 289, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, 136, 538, TypedValues.Custom.TYPE_REFERENCE, 90, 2, 290, 743, 199, 655, TypedValues.Custom.TYPE_STRING, 329, 49, 802, 580, 355, 588, 188, 462, 10, 134, 628, 320, 479, 130, 739, 71, 263, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 374, 601, 192, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 142, 673, 687, 234, 722, 384, 177, 752, TypedValues.MotionType.TYPE_PATHMOTION_ARC, 640, 455, 193, 689, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, 697, 755, 756, 60, 231, 773, 434, TypedValues.CycleType.TYPE_WAVE_SHAPE, 726, 528, TypedValues.PositionType.TYPE_PERCENT_WIDTH, 118, 49, 795, 32, 144, 500, 238, 836, 394, 280, 566, 319, 9, 647, 550, 73, 914, 342, 126, 32, 681, 331, 792, 620, 60, TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 441, 180, 791, 893, 754, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 383, 228, 749, 760, 213, 54, 297, 134, 54, 834, 299, 922, 191, 910, 532, TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 829, 189, 20, 167, 29, 872, 449, 83, TypedValues.CycleType.TYPE_VISIBILITY, 41, 656, TypedValues.PositionType.TYPE_SIZE_PERCENT, 579, 481, 173, 404, 251, 688, 95, 497, 555, 642, 543, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, 35, 599, 428, 207, 409, 574, 118, 498, 285, 380, 350, 492, 197, 265, 920, ModuleDescriptor.MODULE_VERSION, 914, 299, 229, 643, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, 520, 435, 543, 203, 666, 249, 346, 781, 621, 640, 268, 794, 534, 539, 781, 408, 390, 644, Packet.SSH_FXP_HANDLE, 476, 499, 290, 632, 545, 37, 858, 916, 552, 41, 542, 289, 122, 272, 383, 800, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, 290, 204, 681, 407, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, 142, 808, 684, 287, 536, 561, 76, 653, 899, 729, 567, 744, 390, 513, 192, 516, 258, 240, 518, 794, 395, 768, 848, 51, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 384, 168, 190, 826, 328, 596, 786, 303, 570, 381, 415, 641, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_GCM_SHA256, 237, 151, 429, 531, 207, 676, 710, 89, 168, 304, TypedValues.CycleType.TYPE_VISIBILITY, 40, 708, 575, 162, 864, 229, 65, 861, 841, 512, 164, 477, 221, 92, 358, 785, 288, 357, 850, 836, 827, 736, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, 94, 8, 494, 114, 521, 2, 499, 851, 543, 152, 729, 771, 95, 248, 361, 578, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, TypedValues.Custom.TYPE_COLOR, 452, 167, 342, 244, 173, 35, 463, 651, 51, 699, 591, 452, 578, 37, 124, 298, 332, 552, 43, 427, 119, 662, 777, 475, 850, 764, 364, 578, 911, 283, 711, 472, TypedValues.CycleType.TYPE_EASING, 245, 288, 594, 394, 511, 327, 589, 777, 699, 688, 43, 408, 842, 383, 721, 521, 560, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, 624, 59, 193, 417, 158, 209, 563, 564, 343, 693, 109, TypedValues.MotionType.TYPE_DRAW_PATH, 563, 365, 181, 772, 677, 310, 248, 353, 708, 410, 579, 870, 617, 841, 632, 860, 289, 536, 35, 777, 618, 586, TypedValues.CycleType.TYPE_WAVE_OFFSET, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, 184, 45, 787, 680, 18, 66, 407, 369, 54, 492, 228, 613, 830, 922, 437, 519, 644, TypedValues.Custom.TYPE_DIMENSION, 789, TypedValues.CycleType.TYPE_EASING, 305, 441, 207, 300, 892, 827, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA, 537, 381, 662, 513, 56, 252, 341, 242, 797, 838, 837, 720, 224, 307, 631, 61, 87, 560, 310, 756, 665, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, TypedValues.CycleType.TYPE_WAVE_PHASE, 216, 548, 249, 321, 881, 699, 535, 673, 782, 210, 815, TypedValues.Custom.TYPE_DIMENSION, 303, 843, 922, 281, 73, 469, 791, 660, 162, 498, 308, ModuleDescriptor.MODULE_VERSION, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 907, 817, 187, 62, 16, TypedValues.CycleType.TYPE_WAVE_PHASE, 535, 336, 286, 437, 375, 273, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 296, 183, 923, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, 923, 311, TypedValues.CycleType.TYPE_WAVE_OFFSET, 242, 749, 321, 54, 669, TypedValues.AttributesType.TYPE_PATH_ROTATE, 342, 299, 534, Packet.SSH_FXP_ATTRS, 667, 488, 640, 672, 576, 540, TypedValues.AttributesType.TYPE_PATH_ROTATE, 486, 721, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 46, 656, 447, 171, 616, 464, 190, 531, 297, 321, 762, 752, 533, 175, 134, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, 138, 646, 411, 877, 669, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA, 919, 45, 780, 407, 164, 332, 899, 165, 726, 600, 325, 498, 655, 357, 752, 768, 223, 849, 647, 63, 310, 863, 251, 366, 304, 282, 738, 675, 410, 389, 244, 31, 121, 303, 263}};
    public static final int[] c = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static int d = 2;

    public static g A(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.a);
        ls lsVar = new ls(taskCompletionSource, 0, new AtomicBoolean(false), cancellationTokenSource);
        s3 s3Var = a;
        task.g(s3Var, lsVar);
        task2.g(s3Var, lsVar);
        return taskCompletionSource.a;
    }

    public static void B(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            of1.a(view, charSequence);
            return;
        }
        qf1 qf1Var = qf1.k;
        if (qf1Var != null && qf1Var.a == view) {
            qf1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new qf1(view, charSequence);
            return;
        }
        qf1 qf1Var2 = qf1.l;
        if (qf1Var2 != null && qf1Var2.a == view) {
            qf1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static final void C(AbstractJsonLexer abstractJsonLexer, Number number) {
        abstractJsonLexer.getClass();
        AbstractJsonLexer.t(abstractJsonLexer, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String D(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) x(-1, str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable E(Drawable drawable) {
        return drawable instanceof WrappedDrawable ? ((WrappedDrawable) drawable).getWrappedDrawable() : drawable;
    }

    public static void F(int i, int i2) {
        String strC;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strC = k02.C("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    u7.r(hz.o(i2, "negative size: "));
                    return;
                }
                strC = k02.C("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc A[Catch: SQLiteException -> 0x00b7, LOOP:1: B:38:0x00bc->B:43:0x00ce, LOOP_START, PHI: r1
      0x00bc: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:37:0x00ba, B:43:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void G(com.google.android.gms.measurement.internal.m r10, android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj1.G(com.google.android.gms.measurement.internal.m, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static void H(String str, boolean z) throws zzat {
        if (!z) {
            throw zzat.zzb(str, null);
        }
    }

    public static void I(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            K(i2, objArr[i2]);
        }
    }

    public static byte[] J(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        u7.r("n must not be negative");
        return null;
    }

    public static void K(int i, Object obj) {
        if (obj != null) {
            return;
        }
        io0.e(vh.i(i, "at index ", new StringBuilder(String.valueOf(i).length() + 9)));
    }

    public static void L(m mVar, SQLiteDatabase sQLiteDatabase) {
        if (mVar == null) {
            u7.r("Monitor must not be null");
            return;
        }
        p13 p13Var = mVar.i;
        String path = sQLiteDatabase.getPath();
        int i = zzca.a;
        File file = new File(path);
        if (!file.setReadable(false, false)) {
            p13Var.a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            p13Var.a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            p13Var.a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        p13Var.a("Failed to turn on database write permission for owner");
    }

    public static byte[] M(BigInteger bigInteger, int i) throws GeneralSecurityException {
        if (bigInteger.signum() == -1) {
            u7.r("integer must be nonnegative");
            return null;
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        if (length > i2) {
            zg1.m("integer too large");
            return null;
        }
        if (length != i2) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, 0, bArr, i - length, length);
            return bArr;
        }
        if (byteArray[0] == 0) {
            return Arrays.copyOfRange(byteArray, 1, length);
        }
        zg1.m("integer too large");
        return null;
    }

    public static zzagc N(zzaev zzaevVar, boolean z, boolean z2) throws IOException {
        zzagc zzagcVar;
        long j;
        zzer zzerVar;
        int i;
        int i2;
        long j2;
        int i3;
        int i4;
        int[] iArr;
        long jZzo = zzaevVar.zzo();
        long j3 = -1;
        long j4 = 4096;
        if (jZzo != -1 && jZzo <= 4096) {
            j4 = jZzo;
        }
        zzer zzerVar2 = new zzer(64);
        int i5 = (int) j4;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i5) {
            zzerVar2.y(8);
            if (!zzaevVar.zzh(zzerVar2.a, i6, 8, true)) {
                break;
            }
            long jN = zzerVar2.N();
            int iB = zzerVar2.b();
            if (jN == 1) {
                j = j3;
                zzaevVar.zzi(zzerVar2.a, 8, 8);
                i = 16;
                zzerVar2.C(16);
                jN = zzerVar2.d();
                zzerVar = zzerVar2;
            } else {
                j = j3;
                if (jN == 0) {
                    long jZzo2 = zzaevVar.zzo();
                    if (jZzo2 != j) {
                        jN = (jZzo2 - zzaevVar.zzm()) + 8;
                    }
                }
                zzerVar = zzerVar2;
                i = 8;
            }
            long j5 = jN;
            zzagcVar = null;
            long j6 = i;
            if (j5 < j6) {
                i2 = 1;
                if (iB == 1718773093) {
                    if (i == 8) {
                        j5 = 8;
                        iB = 1718773093;
                    } else {
                        iB = 1718773093;
                    }
                }
                return new zzajv(iB, j5, i);
            }
            i2 = 1;
            i7 += i;
            if (iB == 1836019574) {
                i5 += (int) j5;
                if (jZzo != -1 && i5 > jZzo) {
                    i5 = (int) jZzo;
                }
                zzerVar2 = zzerVar;
                j3 = j;
                i6 = 0;
            } else {
                if (iB == 1953653099 || iB == 1835297121 || iB == 1835626086) {
                    j2 = jZzo;
                    i3 = 0;
                } else {
                    if (iB == 1836019558 || iB == 1836475768) {
                        i6 = i2;
                        break;
                    }
                    i8 |= (iB == 1835295092 ? 0 : i2) ^ 1;
                    if (iB == 1937007212) {
                        if (j5 > 1000000) {
                            i6 = 0;
                            break;
                        }
                        iB = 1937007212;
                    }
                    j2 = jZzo;
                    if ((((long) i7) + j5) - j6 >= i5) {
                        i6 = 0;
                        break;
                    }
                    int i9 = (int) (j5 - j6);
                    i7 += i9;
                    if (iB != 1718909296) {
                        i3 = 0;
                        if (i9 != 0) {
                            zzaevVar.zzk(i9);
                        }
                    } else {
                        if (i9 < 8) {
                            return new zzajv(1718909296, i9, 8);
                        }
                        zzerVar.y(i9);
                        i3 = 0;
                        zzaevVar.zzi(zzerVar.a, 0, i9);
                        int iB2 = zzerVar.b();
                        int i10 = (R(iB2, z2) ? 1 : 0) | i8;
                        zzerVar.E(4);
                        int iB3 = zzerVar.B() / 4;
                        if (i10 == 0 && iB3 > 0) {
                            iArr = new int[iB3];
                            int i11 = 0;
                            while (true) {
                                if (i11 >= iB3) {
                                    i4 = i10;
                                    break;
                                }
                                int iB4 = zzerVar.b();
                                iArr[i11] = iB4;
                                if (R(iB4, z2)) {
                                    i4 = i2;
                                    break;
                                }
                                i11++;
                            }
                        } else {
                            i4 = i10;
                            iArr = null;
                        }
                        if (i4 == 0) {
                            return new zzalg(iB2, iArr);
                        }
                        i8 = i4;
                    }
                }
                i6 = i3;
                zzerVar2 = zzerVar;
                jZzo = j2;
                j3 = j;
            }
        }
        zzagcVar = null;
        return i8 == 0 ? i60.l : z != i6 ? i6 != 0 ? px1.c : px1.d : zzagcVar;
    }

    public static LinkedHashMap O(int i) {
        return new LinkedHashMap(i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public static void P(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? Q(i, i3, "start index") : (i2 < 0 || i2 > i3) ? Q(i2, i3, "end index") : k02.C("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String Q(int i, int i2, String str) {
        if (i < 0) {
            return k02.C("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return k02.C("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        u7.r(hz.o(i2, "negative size: "));
        return null;
    }

    public static boolean R(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z) {
                return true;
            }
            i = 1751476579;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (c[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public static int S(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static final JsonEncodingException a(Number number, String str) {
        str.getClass();
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) x(-1, str)));
    }

    public static final JsonEncodingException b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return new JsonEncodingException("Value of type '" + serialDescriptor.getB() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.getB() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException c(int i, CharSequence charSequence, String str) {
        charSequence.getClass();
        return d(i, str + "\nJSON input: " + ((Object) x(i, charSequence)));
    }

    public static final JsonDecodingException d(int i, String str) {
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        return new JsonDecodingException(str);
    }

    public static final PrimitiveSerialDescriptor e(String str, PrimitiveKind primitiveKind) {
        primitiveKind.getClass();
        if (kotlin.text.g.B(str)) {
            u7.r("Blank serial names are prohibited");
            return null;
        }
        for (KSerializer kSerializer : uy0.a.values()) {
            if (str.equals(kSerializer.getB().getB())) {
                StringBuilder sbX = vh.x("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbX.append(Reflection.a(kSerializer.getClass()).getSimpleName());
                sbX.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                u7.r(kotlin.text.g.f0(sbX.toString()));
                return null;
            }
        }
        return new PrimitiveSerialDescriptor(str, primitiveKind);
    }

    public static final SerialDescriptorImpl f(String str, SerialDescriptor[] serialDescriptorArr, Function1 function1) {
        if (kotlin.text.g.B(str)) {
            u7.r("Blank serial names are prohibited");
            return null;
        }
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder(str);
        function1.invoke(classSerialDescriptorBuilder);
        return new SerialDescriptorImpl(str, lb1.a, classSerialDescriptorBuilder.c.size(), b.w(serialDescriptorArr), classSerialDescriptorBuilder);
    }

    public static SerialDescriptorImpl g(String str, SerialDescriptor[] serialDescriptorArr) {
        if (kotlin.text.g.B(str)) {
            u7.r("Blank serial names are prohibited");
            return null;
        }
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder(str);
        return new SerialDescriptorImpl(str, lb1.a, classSerialDescriptorBuilder.c.size(), b.w(serialDescriptorArr), classSerialDescriptorBuilder);
    }

    public static final SerialDescriptorImpl h(String str, SerialKind serialKind, SerialDescriptor[] serialDescriptorArr, Function1 function1) {
        serialKind.getClass();
        if (kotlin.text.g.B(str)) {
            u7.r("Blank serial names are prohibited");
            return null;
        }
        if (serialKind.equals(lb1.a)) {
            u7.r("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder(str);
        function1.invoke(classSerialDescriptorBuilder);
        return new SerialDescriptorImpl(str, serialKind, classSerialDescriptorBuilder.c.size(), b.w(serialDescriptorArr), classSerialDescriptorBuilder);
    }

    public static SerialDescriptorImpl i(String str, SerialKind serialKind, SerialDescriptor[] serialDescriptorArr) {
        serialKind.getClass();
        if (kotlin.text.g.B(str)) {
            u7.r("Blank serial names are prohibited");
            return null;
        }
        if (serialKind.equals(lb1.a)) {
            u7.r("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder(str);
        return new SerialDescriptorImpl(str, serialKind, classSerialDescriptorBuilder.c.size(), b.w(serialDescriptorArr), classSerialDescriptorBuilder);
    }

    public static final void j(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        UndeliveredElementException undeliveredElementExceptionK = k(function1, obj, null);
        if (undeliveredElementExceptionK != null) {
            xr.a(coroutineContext, undeliveredElementExceptionK);
        }
    }

    public static final UndeliveredElementException k(Function1 function1, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            function1.invoke(obj);
            return undeliveredElementException;
        } catch (Throwable th) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th) {
                kotlin.b.a(undeliveredElementException, th);
                return undeliveredElementException;
            }
            return new UndeliveredElementException("Exception in undelivered element handler for " + obj, th);
        }
    }

    public static float o(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static int p(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static final float q(Context context, float f) {
        context.getResources().getClass();
        return a.b(f * r0.getDisplayMetrics().density);
    }

    public static String r(ik ikVar, Integer num, List list) {
        if (num != null && list.contains("0") && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) ikVar.b("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0 && ((Integer) ikVar.b("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return "0";
            }
        }
        return null;
    }

    public static boolean s(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = s(file2) && z;
        }
        return z;
    }

    public static final int t(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                u7.r("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static final void u(HttpMessageBuilder httpMessageBuilder, String str, Object obj) {
        httpMessageBuilder.getClass();
        if (obj != null) {
            httpMessageBuilder.getC().append(str, obj.toString());
        }
    }

    public static final void v(AbstractJsonLexer abstractJsonLexer, String str) {
        abstractJsonLexer.getClass();
        abstractJsonLexer.s(abstractJsonLexer.a - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final int w(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    public static final CharSequence x(int i, CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : ".....";
                String str2 = i3 >= charSequence.length() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : ".....";
                StringBuilder sb = new StringBuilder(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sb.append(charSequence.subSequence(i2, i3).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public abstract boolean l(l0 l0Var, b0 b0Var, b0 b0Var2);

    public abstract boolean m(l0 l0Var, Object obj, Object obj2);

    public abstract boolean n(l0 l0Var, k0 k0Var, k0 k0Var2);

    public abstract void y(k0 k0Var, k0 k0Var2);

    public abstract void z(k0 k0Var, Thread thread);
}
