package defpackage;

import android.content.Intent;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ReadableConfig;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig$ConfigSize;
import androidx.camera.core.impl.SurfaceConfig$ConfigType;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.fragment.app.Fragment;
import com.trilead.ssh2.packets.TypesWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import okio.Path;
import org.conscrypt.OpenSSLProvider;
import org.slf4j.Logger;
import org.slf4j.event.Level;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class hz {
    public static StringBuilder A(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static StringBuilder B(OpenSSLProvider openSSLProvider, String str, String str2, String str3, String str4) {
        openSSLProvider.put(str, str2);
        openSSLProvider.put(str3, str4);
        return new StringBuilder();
    }

    public static void C(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
    }

    public static void D(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, u50.b(i));
        map.put(str2, u50.b(i2));
    }

    public static void E(SurfaceConfig$ConfigType surfaceConfig$ConfigType, SurfaceConfig$ConfigSize surfaceConfig$ConfigSize, long j, SurfaceCombination surfaceCombination) {
        surfaceCombination.a(new uc(surfaceConfig$ConfigType, surfaceConfig$ConfigSize, j));
    }

    public static /* synthetic */ void F(Object obj) {
        if (obj == null) {
            return;
        }
        u7.q();
    }

    public static void G(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    public static void H(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static void I(StringBuilder sb, String str, String str2, OpenSSLProvider openSSLProvider, String str3) {
        sb.append(str);
        sb.append(str2);
        openSSLProvider.put(str3, sb.toString());
    }

    public static /* synthetic */ boolean J(Object obj) {
        return obj != null;
    }

    public static boolean a(ReadableConfig readableConfig, jq jqVar) {
        return readableConfig.getConfig().containsOption(jqVar);
    }

    public static void b(ReadableConfig readableConfig, String str, Config.OptionMatcher optionMatcher) {
        readableConfig.getConfig().findOptions(str, optionMatcher);
    }

    public static DynamicRange c(UseCaseConfig useCaseConfig) {
        DynamicRange dynamicRange = (DynamicRange) useCaseConfig.retrieveOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, DynamicRange.c);
        dynamicRange.getClass();
        return dynamicRange;
    }

    public static Config.OptionPriority d(ReadableConfig readableConfig, jq jqVar) {
        return readableConfig.getConfig().getOptionPriority(jqVar);
    }

    public static Set e(ReadableConfig readableConfig, jq jqVar) {
        return readableConfig.getConfig().getPriorities(jqVar);
    }

    public static boolean f(Logger logger, Level level) {
        int i = level.toInt();
        if (i == 0) {
            return logger.isTraceEnabled();
        }
        if (i == 10) {
            return logger.isDebugEnabled();
        }
        if (i == 20) {
            return logger.isInfoEnabled();
        }
        if (i == 30) {
            return logger.isWarnEnabled();
        }
        if (i == 40) {
            return logger.isErrorEnabled();
        }
        p60.h("Level [", level, "] not recognized.");
        return false;
    }

    public static Set g(ReadableConfig readableConfig) {
        return readableConfig.getConfig().listOptions();
    }

    public static Object h(ReadableConfig readableConfig, jq jqVar) {
        return readableConfig.getConfig().retrieveOption(jqVar);
    }

    public static Object i(ReadableConfig readableConfig, jq jqVar, Object obj) {
        return readableConfig.getConfig().retrieveOption(jqVar, obj);
    }

    public static Object j(ReadableConfig readableConfig, jq jqVar, Config.OptionPriority optionPriority) {
        return readableConfig.getConfig().retrieveOptionWithPriority(jqVar, optionPriority);
    }

    public static float k(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static SurfaceCombination l(ArrayList arrayList, SurfaceCombination surfaceCombination) {
        arrayList.add(surfaceCombination);
        return new SurfaceCombination();
    }

    public static TypesWriter m(int i) {
        TypesWriter typesWriter = new TypesWriter();
        typesWriter.writeByte(i);
        return typesWriter;
    }

    public static String n(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        return sb.toString();
    }

    public static String o(int i, String str) {
        return str + i;
    }

    public static String p(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String q(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String r(long j, String str) {
        return str + j;
    }

    public static String s(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String t(String str, String str2) {
        return str + str2;
    }

    public static String u(String str, String str2, Intent intent) {
        return intent.getStringExtra(str + str2);
    }

    public static String v(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String w(String str, Path path) {
        return str + path;
    }

    public static String x(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static StringBuilder y(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder z(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        return sb;
    }
}
