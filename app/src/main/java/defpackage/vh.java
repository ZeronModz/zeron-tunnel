package defpackage;

import android.widget.EditText;
import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.l;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import androidx.camera.core.resolutionselector.ResolutionSelector$Builder;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import com.google.firebase.encoders.proto.a;
import java.util.DesugarCollections;
import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class vh implements CallbackToFutureAdapter$Resolver {
    public static void A(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static l B(Config config, Config config2) {
        if (config == null && config2 == null) {
            return l.c;
        }
        k kVarC = config2 != null ? k.c(config2) : k.b();
        if (config != null) {
            Iterator<jq> it = config.listOptions().iterator();
            while (it.hasNext()) {
                C(kVarC, config2, config, it.next());
            }
        }
        return l.a(kVarC);
    }

    public static void C(k kVar, Config config, Config config2, jq jqVar) {
        if (!Objects.equals(jqVar, ImageOutputConfig.OPTION_RESOLUTION_SELECTOR)) {
            kVar.insertOption(jqVar, config2.getOptionPriority(jqVar), config2.retrieveOption(jqVar));
            return;
        }
        l31 l31VarA = (l31) config2.retrieveOption(jqVar, null);
        l31 l31Var = (l31) config.retrieveOption(jqVar, null);
        Config.OptionPriority optionPriority = config2.getOptionPriority(jqVar);
        if (l31VarA == null) {
            l31VarA = l31Var;
        } else if (l31Var != null) {
            ResolutionSelector$Builder resolutionSelector$Builder = new ResolutionSelector$Builder();
            AspectRatioStrategy aspectRatioStrategy = AspectRatioStrategy.c;
            resolutionSelector$Builder.a = l31Var.a;
            resolutionSelector$Builder.b = l31Var.b;
            resolutionSelector$Builder.c = l31Var.c;
            AspectRatioStrategy aspectRatioStrategy2 = l31VarA.a;
            if (aspectRatioStrategy2 != null) {
                resolutionSelector$Builder.a = aspectRatioStrategy2;
            }
            ResolutionStrategy resolutionStrategy = l31VarA.b;
            if (resolutionStrategy != null) {
                resolutionSelector$Builder.b = resolutionStrategy;
            }
            ResolutionFilter resolutionFilter = l31VarA.c;
            if (resolutionFilter != null) {
                resolutionSelector$Builder.c = resolutionFilter;
            }
            l31VarA = resolutionSelector$Builder.a();
        }
        kVar.insertOption(jqVar, optionPriority, l31VarA);
    }

    public static void D(EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        nn nnVar = new nn(editTextArr, 1);
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(nnVar);
        }
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new df(1, editText2), 100L);
    }

    public static void a(CameraCaptureResult cameraCaptureResult, b40 b40Var) {
        int i;
        CameraCaptureMetaData$FlashState flashState = cameraCaptureResult.getFlashState();
        b40Var.getClass();
        ArrayList arrayList = b40Var.a;
        if (flashState == CameraCaptureMetaData$FlashState.UNKNOWN) {
            return;
        }
        int i2 = y30.a[flashState.ordinal()];
        if (i2 == 1) {
            i = 0;
        } else if (i2 == 2) {
            i = 32;
        } else {
            if (i2 != 3) {
                flashState.toString();
                km0.g("ExifData");
                return;
            }
            i = 1;
        }
        if ((i & 1) == 1) {
            b40Var.c("LightSource", String.valueOf(4), arrayList);
        }
        b40Var.c("Flash", String.valueOf(i), arrayList);
    }

    public static int b(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    public static int c(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static Object d(Throwable th) {
        return Result.m36constructorimpl(new Result.Failure(th));
    }

    public static Object e(ArrayList arrayList, int i) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String f(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String g(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String h(int i, String str, int i2, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String i(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String j(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String k(Object obj, String str, StringBuilder sb) {
        sb.append(obj);
        sb.append(str);
        return sb.toString();
    }

    public static String l(String str, String str2) {
        return str + str2;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String n(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    public static String o(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String p(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String q(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String r(StringBuilder sb, String str, int i, String str2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb.toString();
    }

    public static String s(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String t(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder u(int i, String str, int i2, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder v(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder w(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder x(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static HashMap y(Class cls, a aVar) {
        HashMap map = new HashMap();
        map.put(cls, aVar);
        return map;
    }

    public static Map z(HashMap map) {
        return DesugarCollections.unmodifiableMap(new HashMap(map));
    }
}
