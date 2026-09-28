package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.b;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.h;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.x8;
import com.google.android.gms.internal.ads.zzccq;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhjp;
import com.google.android.gms.internal.ads.zzhkg;
import com.google.android.gms.internal.measurement.o0;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.internal.measurement.zzaf;
import com.google.android.gms.internal.measurement.zzah;
import com.google.android.gms.internal.measurement.zzal;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzap;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.tasks.Task;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.CutCornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.common.util.concurrent.ListenableFuture;
import com.sandok.tunnel.core.Connection;
import com.sandok.tunnel.service.OpenVPNService;
import com.trilead.ssh2.sftp.Packet;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.observer.DelegatedCall;
import io.ktor.http.Headers;
import io.ktor.utils.io.ByteReadChannel;
import java.util.Objects;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.zip.ZipException;
import junit.framework.AssertionFailedError;
import kotlin.UninitializedPropertyAccessException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yg0 {
    public static boolean d;
    public static int e;
    public static final int[][] a = {new int[]{121, Connection.CONNECTION_DEFAULT_TIMEOUT, 127, 126, 133, 132, 139, 138, 145, 144, 151, 150, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_GCM_SHA384, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_GCM_SHA256, 163, 162, 169, 168, 175, 174, 181, 180, 187, 186, 193, 192, 199, 198, -2, -2}, new int[]{123, 122, 129, 128, 135, 134, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA, 147, 146, 153, 152, 159, 158, 165, 164, 171, 170, 177, 176, 183, 182, 189, 188, 195, 194, Packet.SSH_FXP_EXTENDED_REPLY, 200, 816, -3}, new int[]{125, 124, 131, 130, 137, 136, 143, 142, 149, 148, ModuleDescriptor.MODULE_VERSION, 154, 161, 160, 167, 166, 173, 172, 179, 178, 185, 184, 191, 190, 197, 196, 203, 202, 818, 817}, new int[]{283, 282, 277, 276, 271, 270, 265, 264, 259, 258, 253, 252, 247, 246, 241, 240, 235, 234, 229, 228, 223, 222, 217, 216, 211, 210, 205, 204, 819, -3}, new int[]{285, 284, 279, 278, 273, 272, 267, 266, 261, 260, 255, 254, 249, 248, 243, 242, 237, 236, 231, 230, 225, 224, 219, 218, 213, 212, 207, 206, 821, 820}, new int[]{287, 286, 281, 280, 275, 274, 269, 268, 263, 262, 257, 256, 251, OpenVPNService.log_deque_max, 245, 244, 239, 238, 233, 232, 227, 226, 221, 220, 215, 214, 209, 208, 822, -3}, new int[]{289, 288, 295, 294, 301, 300, 307, 306, 313, 312, 319, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 325, 324, 331, 330, 337, 336, 343, 342, 349, 348, 355, 354, 361, 360, 367, 366, 824, 823}, new int[]{291, 290, 297, 296, 303, 302, 309, 308, 315, 314, 321, 320, 327, 326, 333, 332, 339, 338, 345, 344, 351, 350, 357, 356, 363, 362, 369, 368, 825, -3}, new int[]{293, 292, 299, 298, 305, 304, 311, 310, 317, TypedValues.AttributesType.TYPE_PATH_ROTATE, 323, 322, 329, 328, 335, 334, 341, 340, 347, 346, 353, 352, 359, 358, 365, 364, 371, 370, 827, 826}, new int[]{409, 408, TypedValues.CycleType.TYPE_ALPHA, TypedValues.CycleType.TYPE_VISIBILITY, 397, 396, 391, 390, 79, 78, -2, -2, 13, 12, 37, 36, 2, -1, 44, 43, 109, 108, 385, 384, 379, 378, 373, 372, 828, -3}, new int[]{411, 410, 405, 404, 399, 398, 393, 392, 81, 80, 40, -2, 15, 14, 39, 38, 3, -1, -1, 45, 111, 110, 387, 386, 381, 380, 375, 374, 830, 829}, new int[]{413, 412, 407, 406, TypedValues.CycleType.TYPE_CURVE_FIT, 400, 395, 394, 83, 82, 41, -3, -3, -3, -3, -3, 5, 4, 47, 46, 113, 112, 389, 388, 383, 382, 377, 376, 831, -3}, new int[]{415, 414, TypedValues.CycleType.TYPE_WAVE_SHAPE, TypedValues.CycleType.TYPE_EASING, 427, 426, Packet.SSH_FXP_DATA, Packet.SSH_FXP_HANDLE, 55, 54, 16, -3, -3, -3, -3, -3, -3, -3, 20, 19, 85, 84, 433, 432, 439, 438, 445, 444, 833, 832}, new int[]{417, TypedValues.CycleType.TYPE_PATH_ROTATE, TypedValues.CycleType.TYPE_WAVE_PERIOD, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 429, 428, Packet.SSH_FXP_ATTRS, Packet.SSH_FXP_NAME, 57, 56, -3, -3, -3, -3, -3, -3, -3, -3, 22, 21, 87, 86, 435, 434, 441, 440, 447, 446, 834, -3}, new int[]{419, 418, TypedValues.CycleType.TYPE_WAVE_PHASE, TypedValues.CycleType.TYPE_WAVE_OFFSET, 431, 430, 107, 106, 59, 58, -3, -3, -3, -3, -3, -3, -3, -3, -3, 23, 89, 88, 437, 436, 443, 442, 449, 448, 836, 835}, new int[]{481, 480, 475, 474, 469, 468, 48, -2, 30, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 0, 53, 52, 463, 462, 457, 456, 451, 450, 837, -3}, new int[]{483, 482, 477, 476, 471, 470, 49, -1, -2, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -2, -1, 465, 464, 459, 458, 453, 452, 839, 838}, new int[]{485, 484, 479, 478, 473, 472, 51, 50, 31, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 1, -2, 42, 467, 466, 461, 460, 455, 454, 840, -3}, new int[]{487, 486, 493, 492, 499, 498, 97, 96, 61, 60, -3, -3, -3, -3, -3, -3, -3, -3, -3, 26, 91, 90, TypedValues.PositionType.TYPE_SIZE_PERCENT, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, 511, TypedValues.PositionType.TYPE_POSITION_TYPE, 517, 516, 842, 841}, new int[]{489, 488, 495, 494, TypedValues.PositionType.TYPE_TRANSITION_EASING, 500, 99, 98, 63, 62, -3, -3, -3, -3, -3, -3, -3, -3, 28, 27, 93, 92, TypedValues.PositionType.TYPE_PERCENT_Y, TypedValues.PositionType.TYPE_PERCENT_X, 513, 512, 519, 518, 843, -3}, new int[]{491, 490, 497, 496, TypedValues.PositionType.TYPE_PERCENT_WIDTH, TypedValues.PositionType.TYPE_DRAWPATH, 101, 100, 65, 64, 17, -3, -3, -3, -3, -3, -3, -3, 18, 29, 95, 94, 509, TypedValues.PositionType.TYPE_CURVE_FIT, 515, 514, 521, 520, 845, 844}, new int[]{559, 558, 553, 552, 547, 546, 541, 540, 73, 72, 32, -3, -3, -3, -3, -3, -3, 10, 67, 66, 115, 114, 535, 534, 529, 528, 523, 522, 846, -3}, new int[]{561, 560, 555, 554, 549, 548, 543, 542, 75, 74, -2, -1, 7, 6, 35, 34, 11, -2, 69, 68, 117, 116, 537, 536, 531, 530, 525, 524, 848, 847}, new int[]{563, 562, 557, 556, 551, 550, 545, 544, 77, 76, -2, 33, 9, 8, 25, 24, -1, -2, 71, 70, 119, 118, 539, 538, 533, 532, 527, 526, 849, -3}, new int[]{565, 564, 571, 570, 577, 576, 583, 582, 589, 588, 595, 594, 601, 600, TypedValues.MotionType.TYPE_PATHMOTION_ARC, TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO, 613, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, 619, 618, 625, 624, 631, 630, 637, 636, 643, 642, 851, 850}, new int[]{567, 566, 573, 572, 579, 578, 585, 584, 591, 590, 597, 596, TypedValues.MotionType.TYPE_EASING, TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE, TypedValues.MotionType.TYPE_POLAR_RELATIVETO, TypedValues.MotionType.TYPE_DRAW_PATH, 615, 614, 621, 620, 627, 626, 633, 632, 639, 638, 645, 644, 852, -3}, new int[]{569, 568, 575, 574, 581, 580, 587, 586, 593, 592, 599, 598, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 617, 616, 623, 622, 629, 628, 635, 634, 641, 640, 647, 646, 854, 853}, new int[]{727, 726, 721, 720, 715, 714, 709, 708, 703, TypedValues.TransitionType.TYPE_TO, 697, 696, 691, 690, 685, 684, 679, 678, 673, 672, 667, 666, 661, 660, 655, 654, 649, 648, 855, -3}, new int[]{729, 728, 723, 722, 717, 716, 711, 710, TypedValues.TransitionType.TYPE_INTERPOLATOR, TypedValues.TransitionType.TYPE_AUTO_TRANSITION, 699, 698, 693, 692, 687, 686, 681, 680, 675, 674, 669, 668, 663, 662, 657, 656, 651, 650, 857, 856}, new int[]{731, 730, 725, 724, 719, 718, 713, 712, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, TypedValues.TransitionType.TYPE_STAGGERED, TypedValues.TransitionType.TYPE_FROM, TypedValues.TransitionType.TYPE_DURATION, 695, 694, 689, 688, 683, 682, 677, 676, 671, 670, 665, 664, 659, 658, 653, 652, 858, -3}, new int[]{733, 732, 739, 738, 745, 744, 751, 750, 757, 756, 763, 762, 769, 768, 775, 774, 781, 780, 787, 786, 793, 792, 799, 798, 805, 804, 811, 810, 860, 859}, new int[]{735, 734, 741, 740, 747, 746, 753, 752, 759, 758, 765, 764, 771, 770, 777, 776, 783, 782, 789, 788, 795, 794, 801, 800, 807, 806, 813, 812, 861, -3}, new int[]{737, 736, 743, 742, 749, 748, 755, 754, 761, 760, 767, 766, 773, 772, 779, 778, 785, 784, 791, 790, 797, 796, 803, 802, 809, 808, 815, 814, 863, 862}};
    public static final Object b = new Object();
    public static final Object c = new Object();
    public static final String[] f = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_type", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};
    public static final String[] g = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_ct", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
    public static final String[] h = {"items"};
    public static final String[] i = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "_ct", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    public static void A(byte b2, byte b3, byte b4, char[] cArr, int i2) {
        if (D(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || D(b4)))) {
            u7.r("Invalid UTF-8");
        } else {
            cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
        }
    }

    public static void B(byte b2, byte b3, char[] cArr, int i2) {
        if (b2 < -62) {
            u7.r("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        } else if (D(b3)) {
            u7.r("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        } else {
            cArr[i2] = (char) (((b2 & 31) << 6) | (b3 & 63));
        }
    }

    public static boolean C(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            if ((i3 > i4 || rect.left >= i4) && rect.left > rect2.left) {
                return true;
            }
        } else if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if ((i5 > i6 || rect.top >= i6) && rect.top > rect2.top) {
                return true;
            }
        } else if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i2 != 130) {
                u7.r("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i9 = rect.top;
            int i10 = rect2.top;
            if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    public static boolean D(byte b2) {
        return b2 > -65;
    }

    public static final void E(String str) {
        str.getClass();
        throw new IllegalArgumentException(vh.m("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static int F(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                u7.r("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    public static int G(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        u7.r("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static void H(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static void I(ViewGroup viewGroup, float f2) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).l(f2);
        }
    }

    public static void J(View view, MaterialShapeDrawable materialShapeDrawable) {
        ElevationOverlayProvider elevationOverlayProvider = materialShapeDrawable.a.b;
        if (elevationOverlayProvider == null || !elevationOverlayProvider.a) {
            return;
        }
        float fE = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = h.a;
            fE += cn1.e((View) parent);
        }
        MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = materialShapeDrawable.a;
        if (materialShapeDrawableState.l != fE) {
            materialShapeDrawableState.l = fE;
            materialShapeDrawable.w();
        }
    }

    public static void K(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            J(viewGroup, (MaterialShapeDrawable) background);
        }
    }

    public static String L(Object obj, String str) {
        return str + obj;
    }

    public static void M() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void N(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(vh.m("lateinit property ", str, " has not been initialized"));
        H(uninitializedPropertyAccessException, yg0.class.getName());
        throw uninitializedPropertyAccessException;
    }

    public static Object[] O(Collection collection, Object[] objArr) {
        int size = collection.size();
        if (objArr.length < size) {
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        }
        u(collection, objArr);
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    public static final DelegatedCall P(HttpClientCall httpClientCall, ByteReadChannel byteReadChannel) {
        httpClientCall.getClass();
        byteReadChannel.getClass();
        return new DelegatedCall(httpClientCall.a, byteReadChannel, httpClientCall, (Headers) null, 8, (xu) null);
    }

    public static zzao Q(Object obj) {
        if (obj == null) {
            return zzao.zzg;
        }
        if (obj instanceof String) {
            return new zzas((String) obj);
        }
        if (obj instanceof Double) {
            return new zzah((Double) obj);
        }
        if (obj instanceof Long) {
            return new zzah(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new zzah(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new zzaf((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                u7.r("Invalid value type");
                return null;
            }
            zzae zzaeVar = new zzae();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzaeVar.e(zzaeVar.c(), Q(it.next()));
            }
            return zzaeVar;
        }
        zzal zzalVar = new zzal();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            zzao zzaoVarQ = Q(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                zzalVar.zzm((String) string, zzaoVarQ);
            }
        }
        return zzalVar;
    }

    public static Object R(int i2) {
        if (i2 >= 2 && i2 <= 1073741824 && Integer.highestOneBit(i2) == i2) {
            return i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
        }
        u7.r(vh.i(i2, "must be power of 2 between 2^1 and 2^30: ", new StringBuilder(String.valueOf(i2).length() + 41)));
        return null;
    }

    public static String S(String str, Context context, boolean z, Map map) {
        String strD;
        if ((((Boolean) zzbd.zzc().a(p32.X0)).booleanValue() && !z) || !zzt.zzD().a(context) || TextUtils.isEmpty(str) || (strD = zzt.zzD().d(context)) == null) {
            return str;
        }
        String str2 = (String) zzbd.zzc().a(p32.Q0);
        if (((Boolean) zzbd.zzc().a(p32.P0)).booleanValue() && str.contains(str2)) {
            if (zzt.zzc().zzi(str)) {
                zzccq zzccqVarZzD = zzt.zzD();
                Map map2 = (Map) map.get("_ac");
                zzccqVarZzD.getClass();
                zzccqVarZzD.h(context, "_ac", strD, zzccq.f(map2));
                return b0(context, str).replace(str2, strD);
            }
            if (!zzt.zzc().zzj(str)) {
                return str;
            }
            zzccq zzccqVarZzD2 = zzt.zzD();
            Map map3 = (Map) map.get("_ai");
            zzccqVarZzD2.getClass();
            zzccqVarZzD2.h(context, "_ai", strD, zzccq.f(map3));
            return b0(context, str).replace(str2, strD);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((Boolean) zzbd.zzc().a(p32.O0)).booleanValue()) {
            return str;
        }
        if (zzt.zzc().zzi(str)) {
            zzccq zzccqVarZzD3 = zzt.zzD();
            Map map4 = (Map) map.get("_ac");
            zzccqVarZzD3.getClass();
            zzccqVarZzD3.h(context, "_ac", strD, zzccq.f(map4));
            return Z(b0(context, str), "fbs_aeid", strD).toString();
        }
        if (!zzt.zzc().zzj(str)) {
            return str;
        }
        zzccq zzccqVarZzD4 = zzt.zzD();
        Map map5 = (Map) map.get("_ai");
        zzccqVarZzD4.getClass();
        zzccqVarZzD4.h(context, "_ai", strD, zzccq.f(map5));
        return Z(b0(context, str), "fbs_aeid", strD).toString();
    }

    public static void T() {
        Log.isLoggable("InstallReferrerClient", 2);
    }

    public static int U(int i2, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i2] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i2] : ((int[]) obj)[i2];
    }

    public static zzhbp V(byte[] bArr) throws GeneralSecurityException {
        try {
            gd3 gd3Var = gd3.b;
            int i2 = wc3.a;
            x8 x8VarY = x8.y(bArr, gd3.c);
            zzhkg zzhkgVar = zzhkg.b;
            hc3 hc3VarB = z73.b(x8VarY.v());
            t73 t73Var = new t73(x8VarY, hc3VarB);
            y73 y73Var = (y73) zzhkgVar.a.get();
            y73Var.getClass();
            return !y73Var.d.containsKey(new w73(t73.class, hc3VarB)) ? new zzhjp(t73Var) : zzhkgVar.g(t73Var);
        } catch (IOException e2) {
            throw new GeneralSecurityException("Failed to parse proto", e2);
        }
    }

    public static zzao W(o0 o0Var) {
        if (o0Var == null) {
            return zzao.zzf;
        }
        int iV = o0Var.v() - 1;
        if (iV == 1) {
            return o0Var.p() ? new zzas(o0Var.q()) : zzao.zzm;
        }
        if (iV == 2) {
            return o0Var.t() ? new zzah(Double.valueOf(o0Var.u())) : new zzah(null);
        }
        if (iV == 3) {
            return o0Var.r() ? new zzaf(Boolean.valueOf(o0Var.s())) : new zzaf(null);
        }
        if (iV != 4) {
            u7.r("Unknown type found. Cannot convert entity");
            return null;
        }
        List listN = o0Var.n();
        ArrayList arrayList = new ArrayList();
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            arrayList.add(W((o0) it.next()));
        }
        return new zzap(o0Var.o(), arrayList);
    }

    public static void X() {
        Log.isLoggable("InstallReferrerClient", 5);
    }

    public static void Y(ListenableFuture listenableFuture, zzfoe zzfoeVar) {
        if (((Boolean) d42.c.g()).booleanValue()) {
            q33 q33VarQ = q33.q(listenableFuture);
            uh2 uh2Var = new uh2(zzfoeVar, 18);
            q33VarQ.addListener(new s33(0, q33VarQ, uh2Var), g3.g);
        }
    }

    public static Uri Z(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i2 = iIndexOf + 1;
        StringBuilder sb = new StringBuilder(str.substring(0, i2));
        hz.H(sb, str2, "=", str3, "&");
        sb.append(str.substring(i2));
        return Uri.parse(sb.toString());
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void a0(int i2, int i3, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    public static final Object b(Task task, Continuation continuation) throws Exception {
        if (!task.l()) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(a.c(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            task.b(fy.c, new nx2(cancellableContinuationImpl, 14));
            Object objM = cancellableContinuationImpl.m();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return objM;
        }
        Exception excH = task.h();
        if (excH != null) {
            throw excH;
        }
        if (!task.k()) {
            return task.i();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static String b0(Context context, String str) {
        String strB = zzt.zzD().b(context);
        String strC = zzt.zzD().c(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strB)) {
            str = Z(str, "gmp_app_id", strB).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strC)) ? str : Z(str, "fbs_aiid", strC).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = d(r9, r10, r11)
            boolean r1 = d(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L72
            if (r0 != 0) goto Lf
            goto L72
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3b
            if (r9 == r3) goto L34
            if (r9 == r4) goto L2d
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L71
            goto L41
        L29:
            defpackage.u7.r(r0)
            return r2
        L2d:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L71
            goto L41
        L34:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L71
            goto L41
        L3b:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L71
        L41:
            if (r9 == r5) goto L71
            if (r9 != r4) goto L46
            goto L71
        L46:
            int r11 = F(r9, r10, r11)
            if (r9 == r5) goto L66
            if (r9 == r3) goto L61
            if (r9 == r4) goto L5c
            if (r9 != r1) goto L58
            int r9 = r12.bottom
            int r10 = r10.bottom
        L56:
            int r9 = r9 - r10
            goto L6b
        L58:
            defpackage.u7.r(r0)
            return r2
        L5c:
            int r9 = r12.right
            int r10 = r10.right
            goto L56
        L61:
            int r9 = r10.top
            int r10 = r12.top
            goto L56
        L66:
            int r9 = r10.left
            int r10 = r12.left
            goto L56
        L6b:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L72
        L71:
            return r6
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg0.c(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static int c0(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i3;
        int i4;
        int iP = dn0.P(obj);
        int i5 = iP & i2;
        int iU = U(i5, obj3);
        if (iU != 0) {
            int i6 = ~i2;
            int i7 = iP & i6;
            int i8 = -1;
            while (true) {
                i3 = iU - 1;
                int i9 = iArr[i3];
                i4 = i9 & i2;
                if ((i9 & i6) != i7 || !Objects.equals(obj, objArr[i3]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i3]))) {
                    if (i4 == 0) {
                        break;
                    }
                    i8 = i3;
                    iU = i4;
                } else {
                    break;
                }
            }
            if (i8 == -1) {
                a0(i5, i4, obj3);
                return i3;
            }
            iArr[i8] = (iArr[i8] & i6) | (i4 & i2);
            return i3;
        }
        return -1;
    }

    public static boolean d(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        u7.r("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
                if (rect2.bottom < rect.top) {
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
        } else if (rect2.bottom < rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public static int d0(cu2 cu2Var) {
        int iZzg = zzaa.zzg(cu2Var) - 1;
        return (iZzg == 0 || iZzg == 1) ? 7 : 23;
    }

    public static void e(boolean z) {
        if (z) {
            return;
        }
        s31.c();
    }

    public static void e0(ListenableFuture listenableFuture, bv2 bv2Var, zzfoe zzfoeVar, boolean z) {
        if (((Boolean) d42.c.g()).booleanValue()) {
            q33 q33VarQ = q33.q(listenableFuture);
            l00 l00Var = new l00(bv2Var, zzfoeVar, z);
            q33VarQ.addListener(new s33(0, q33VarQ, l00Var), g3.g);
        }
    }

    public static void f(boolean z, String str) {
        if (z) {
            return;
        }
        u7.r(str);
    }

    public static void g(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                io0.e(hz.o(i3, "at index "));
                return;
            }
        }
    }

    public static void h(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            hz.H(sb, "Must be called on ", name2, " thread, but got ", name);
            io0.i(sb, ".");
        }
    }

    public static void i(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        u7.p(str);
    }

    public static void j(String str) {
        if (TextUtils.isEmpty(str)) {
            u7.r("Given String is empty or null");
        }
    }

    public static void k(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            u7.r(str2);
        }
    }

    public static void l(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        u7.p(str);
    }

    public static void m(Object obj) {
        if (obj != null) {
            return;
        }
        io0.e("null reference");
    }

    public static void n(Object obj, String str) {
        if (obj != null) {
            return;
        }
        io0.e(str);
    }

    public static void o(String str, boolean z) {
        if (z) {
            return;
        }
        u7.p(str);
    }

    public static void p(boolean z) {
        if (z) {
            return;
        }
        zg1.h();
    }

    public static int q(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static long r(int i2, int i3) {
        return (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }

    public static CornerTreatment s(int i2) {
        return i2 != 0 ? i2 != 1 ? new RoundedCornerTreatment() : new CutCornerTreatment() : new RoundedCornerTreatment();
    }

    public static void t(String str) {
        throw new AssertionFailedError(str);
    }

    public static void u(Collection collection, Object[] objArr) {
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
    }

    public static rm0 v(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length();
        long j = length - 22;
        if (j < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j2 = length - 65558;
        long j3 = j2 >= 0 ? j2 : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(j);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                rm0 rm0Var = new rm0();
                rm0Var.c = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                rm0Var.b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return rm0Var;
            }
            j--;
        } while (j >= j3);
        throw new ZipException("End Of Central Directory signature not found");
    }

    public static String w(String str, String str2, String str3) {
        return ((str == null || str.length() <= 0) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str.concat(" ")) + "expected:<" + ((Object) str2) + "> but was:<" + ((Object) str3) + ">";
    }

    public static oh x(CallbackToFutureAdapter$Resolver callbackToFutureAdapter$Resolver) {
        b bVar = new b();
        bVar.c = new n31();
        oh ohVar = new oh(bVar);
        bVar.b = ohVar;
        bVar.a = callbackToFutureAdapter$Resolver.getClass();
        try {
            Object objAttachCompleter = callbackToFutureAdapter$Resolver.attachCompleter(bVar);
            if (objAttachCompleter == null) {
                return ohVar;
            }
            bVar.a = objAttachCompleter;
            return ohVar;
        } catch (Exception e2) {
            ohVar.a(e2);
            return ohVar;
        }
    }

    public static String y(int i2) {
        switch (i2) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return vh.i(i2, "unknown status code: ", new StringBuilder(String.valueOf(i2).length() + 21));
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static void z(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) {
        if (!D(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !D(b4) && !D(b5)) {
                int i3 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i2] = (char) ((i3 >>> 10) + 55232);
                cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
                return;
            }
        }
        u7.r("Invalid UTF-8");
    }
}
