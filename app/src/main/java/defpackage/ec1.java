package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Range;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.impl.CaptureConfig$OptionUnpacker;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig$OptionUnpacker;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig$ConfigSize;
import androidx.camera.core.impl.SurfaceConfig$ConfigType;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import coil3.size.Dimension;
import coil3.size.RealViewSizeResolver;
import coil3.size.Size;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.o4;
import com.google.android.gms.internal.ads.zzbre;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzak;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import kotlin.reflect.KClass;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ec1 {
    public static Dimension A(int i, int i2, int i3) {
        if (i == -2) {
            return dy.a;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            if (i4 > 0) {
                return new cy(i4);
            }
            u7.r("px must be > 0.");
            return null;
        }
        int i5 = i2 - i3;
        if (i5 > 0) {
            if (i5 > 0) {
                return new cy(i5);
            }
            u7.r("px must be > 0.");
        }
        return null;
    }

    public static Size B(RealViewSizeResolver realViewSizeResolver) {
        boolean z = realViewSizeResolver.b;
        View view = realViewSizeResolver.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Dimension dimensionA = A(layoutParams != null ? layoutParams.width : -1, view.getWidth(), z ? view.getPaddingRight() + view.getPaddingLeft() : 0);
        if (dimensionA == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        Dimension dimensionA2 = A(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), z ? view.getPaddingBottom() + view.getPaddingTop() : 0);
        if (dimensionA2 == null) {
            return null;
        }
        return new Size(dimensionA, dimensionA2);
    }

    public static int C(String str) {
        str.getClass();
        switch (str) {
            case "easing":
                return 317;
            case "rotationX":
                return 308;
            case "rotationY":
                return 309;
            case "rotationZ":
                return 310;
            case "translationX":
                return 304;
            case "translationY":
                return 305;
            case "translationZ":
                return 306;
            case "progress":
                return 315;
            case "pivotX":
                return 313;
            case "pivotY":
                return 314;
            case "scaleX":
                return 311;
            case "scaleY":
                return 312;
            case "target":
                return 101;
            case "elevation":
                return 307;
            case "alpha":
                return 303;
            case "frame":
                return 100;
            case "curveFit":
                return 301;
            case "pathRotate":
                return TypedValues.AttributesType.TYPE_PATH_ROTATE;
            case "pivotTarget":
                return TypedValues.AttributesType.TYPE_PIVOT_TARGET;
            case "visibility":
                return 302;
            default:
                return -1;
        }
    }

    public static int D(String str) {
        str.getClass();
        switch (str) {
            case "easing":
                return TypedValues.CycleType.TYPE_EASING;
            case "rotationX":
                return 308;
            case "rotationY":
                return 309;
            case "rotationZ":
                return 310;
            case "translationX":
                return 304;
            case "translationY":
                return 305;
            case "translationZ":
                return 306;
            case "progress":
                return 315;
            case "pivotX":
                return 313;
            case "pivotY":
                return 314;
            case "scaleX":
                return 311;
            case "scaleY":
                return 312;
            case "alpha":
                return TypedValues.CycleType.TYPE_ALPHA;
            case "curveFit":
                return TypedValues.CycleType.TYPE_CURVE_FIT;
            case "pathRotate":
                return TypedValues.CycleType.TYPE_PATH_ROTATE;
            case "visibility":
                return TypedValues.CycleType.TYPE_VISIBILITY;
            default:
                return -1;
        }
    }

    public static int E(int i, int i2, int i3) {
        return ed3.b(i) + i2 + i3;
    }

    public static int F(int i, int i2, int i3, int i4) {
        return ((i + i2) - i3) + i4;
    }

    public static int G(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    public static int H(int i, int i2, String str) {
        return str.length() + i + i2;
    }

    public static /* synthetic */ int I(long j) {
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    public static IObjectWrapper J(Parcel parcel) {
        IObjectWrapper iObjectWrapperC = IObjectWrapper.Stub.c(parcel.readStrongBinder());
        parcel.recycle();
        return iObjectWrapperC;
    }

    public static Object K(zzbk zzbkVar, int i, ArrayList arrayList, int i2) {
        n8.R(zzbkVar.name(), i, arrayList);
        return arrayList.get(i2);
    }

    public static String L(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static void M(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void N(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        ii2.K(sb.toString());
    }

    public static void O(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void P(SurfaceConfig$ConfigType surfaceConfig$ConfigType, SurfaceConfig$ConfigSize surfaceConfig$ConfigSize, SurfaceCombination surfaceCombination, SurfaceConfig$ConfigType surfaceConfig$ConfigType2, SurfaceConfig$ConfigSize surfaceConfig$ConfigSize2) {
        surfaceCombination.a(fc1.a(surfaceConfig$ConfigType, surfaceConfig$ConfigSize));
        surfaceCombination.a(fc1.a(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize2));
    }

    public static /* synthetic */ void Q(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            n0.l((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else if (autoCloseable instanceof ContentProviderClient) {
            ((ContentProviderClient) autoCloseable).release();
        } else {
            s31.c();
        }
    }

    public static void R(String str, Bundle bundle) {
        bundle.putLong(str, zzt.zzk().currentTimeMillis());
    }

    public static void S(String str, String str2) {
        ii2.K(str2.concat(String.valueOf(str)));
    }

    public static void T(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
    }

    public static int U(int i, int i2, int i3, int i4) {
        return ed3.b(i) + i2 + i3 + i4;
    }

    public static /* synthetic */ void V(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            n0.l((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else if (autoCloseable instanceof ContentProviderClient) {
            ((ContentProviderClient) autoCloseable).release();
        } else {
            s31.c();
        }
    }

    public static boolean W(Quirks quirks) {
        Iterator it = quirks.c(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).workaroundBySurfaceProcessing()) {
                return true;
            }
        }
        return false;
    }

    public static zzfoe X(Context context, int i) {
        boolean zBooleanValue;
        if (zzfor.a()) {
            int i2 = i - 2;
            if (i2 == 20 || i2 == 21) {
                zBooleanValue = ((Boolean) d42.e.g()).booleanValue();
            } else if (i2 != 110) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) d42.c.g()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) d42.d.g()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) d42.b.g()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) zzbd.zzc().a(p32.ma)).booleanValue();
            }
            if (zBooleanValue) {
                return new o4(context, i);
            }
        }
        return new gv2();
    }

    public static zzfoe Y(Context context, int i, int i2, zzm zzmVar) {
        boolean zMatches;
        zzfoe zzfoeVarX = X(context, i);
        if (zzfoeVarX instanceof o4) {
            o4 o4Var = (o4) zzfoeVarX;
            o4Var.a();
            o4Var.zzp(i2);
            o4Var.zzf(zzaa.zzd(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) zzbd.zzc().a(p32.ea), str);
            }
            if (zMatches) {
                o4Var.zze(str);
            }
        }
        return zzfoeVarX;
    }

    public static zzao Z(zzak zzakVar, zzas zzasVar, zzg zzgVar, List list) {
        String str = zzasVar.a;
        if (zzakVar.zzj(str)) {
            zzao zzaoVarZzk = zzakVar.zzk(str);
            if (zzaoVarZzk instanceof zzai) {
                return ((zzai) zzaoVarZzk).a(zzgVar, list);
            }
            u7.r(str.concat(" is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(str)) {
            n8.R("hasOwnProperty", 1, list);
            return zzakVar.zzj(zzgVar.b.b(zzgVar, (zzao) list.get(0)).zzc()) ? zzao.zzk : zzao.zzl;
        }
        u7.r("Object has no function ".concat(str));
        return null;
    }

    public static ViewModel a(ViewModelProvider.Factory factory, KClass kClass, CreationExtras creationExtras) {
        kClass.getClass();
        creationExtras.getClass();
        return factory.create(k02.l(kClass), creationExtras);
    }

    public static Executor b(ThreadConfig threadConfig, Executor executor) {
        return (Executor) threadConfig.retrieveOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
    }

    public static CaptureConfig$OptionUnpacker c(UseCaseConfig useCaseConfig) {
        return (CaptureConfig$OptionUnpacker) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER);
    }

    public static CaptureConfig$OptionUnpacker d(UseCaseConfig useCaseConfig, CaptureConfig$OptionUnpacker captureConfig$OptionUnpacker) {
        return (CaptureConfig$OptionUnpacker) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, captureConfig$OptionUnpacker);
    }

    public static UseCaseConfigFactory.CaptureType e(UseCaseConfig useCaseConfig) {
        return (UseCaseConfigFactory.CaptureType) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_CAPTURE_TYPE);
    }

    public static el f(UseCaseConfig useCaseConfig) {
        return (el) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG);
    }

    public static el g(UseCaseConfig useCaseConfig, el elVar) {
        return (el) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, elVar);
    }

    public static v61 h(UseCaseConfig useCaseConfig) {
        return (v61) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG);
    }

    public static v61 i(UseCaseConfig useCaseConfig, v61 v61Var) {
        return (v61) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, v61Var);
    }

    public static int j(UseCaseConfig useCaseConfig) {
        return ((Integer) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, 0)).intValue();
    }

    public static SessionConfig$OptionUnpacker k(UseCaseConfig useCaseConfig) {
        return (SessionConfig$OptionUnpacker) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER);
    }

    public static SessionConfig$OptionUnpacker l(UseCaseConfig useCaseConfig, SessionConfig$OptionUnpacker sessionConfig$OptionUnpacker) {
        return (SessionConfig$OptionUnpacker) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, sessionConfig$OptionUnpacker);
    }

    public static int m(UseCaseConfig useCaseConfig) {
        return ((Integer) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY)).intValue();
    }

    public static int n(UseCaseConfig useCaseConfig, int i) {
        return ((Integer) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i))).intValue();
    }

    public static Class o(TargetConfig targetConfig) {
        return (Class) targetConfig.retrieveOption(TargetConfig.OPTION_TARGET_CLASS);
    }

    public static Class p(TargetConfig targetConfig, Class cls) {
        return (Class) targetConfig.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, cls);
    }

    public static Range q(UseCaseConfig useCaseConfig) {
        return (Range) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE);
    }

    public static Range r(UseCaseConfig useCaseConfig, Range range) {
        return (Range) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE, range);
    }

    public static String s(TargetConfig targetConfig) {
        return (String) targetConfig.retrieveOption(TargetConfig.OPTION_TARGET_NAME);
    }

    public static String t(TargetConfig targetConfig, String str) {
        return (String) targetConfig.retrieveOption(TargetConfig.OPTION_TARGET_NAME, str);
    }

    public static int u(UseCaseConfig useCaseConfig) {
        return ((Integer) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, 0)).intValue();
    }

    public static boolean v(UseCaseConfig useCaseConfig, boolean z) {
        return ((Boolean) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean w(VideoEncoderInfo videoEncoderInfo, int i, int i2) {
        if (videoEncoderInfo.isSizeSupported(i, i2)) {
            return true;
        }
        return videoEncoderInfo.canSwapWidthHeight() && videoEncoderInfo.isSizeSupported(i2, i);
    }

    public static boolean x(UseCaseConfig useCaseConfig, boolean z) {
        return ((Boolean) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.valueOf(z))).booleanValue();
    }

    public static void y(zzbre zzbreVar, String str, String str2) {
        zzbreVar.zza(hz.x(new StringBuilder(H(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    public static void z(zzbre zzbreVar, String str, JSONObject jSONObject) {
        StringBuilder sbA = hz.A("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        zzo.zzd("Dispatching AFMA event: ".concat(sbA.toString()));
        zzbreVar.zza(sbA.toString());
    }
}
