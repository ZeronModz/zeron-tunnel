package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.os.Bundle;
import androidx.collection.ArraySet;
import androidx.core.provider.FontRequest;
import androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory;
import androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import androidx.savedstate.serialization.SavedStateConfiguration;
import androidx.savedstate.serialization.SavedStateEncoder;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.material.transition.a;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.trilead.ssh2.sftp.AttribFlags;
import com.trilead.ssh2.sftp.Packet;
import io.ktor.http.Parameters;
import io.ktor.http.ParametersBuilderImpl;
import io.ktor.util.StringValues;
import io.ktor.util.StringValuesBuilder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import kotlin.collections.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.g;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonClassDiscriminator;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.JsonEncodingException;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class mu {
    public static final Continuation[] a = new Continuation[0];
    public static final a b = new a(4);
    public static final a c = new a(5);
    public static final int[] d = {1, 2, 3, 6};
    public static final int[] e = {48000, 44100, 32000};
    public static final int[] f = {24000, 22050, 16000};
    public static final int[] g = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] h = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] i = {69, 87, Packet.SSH_FXP_NAME, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final e63 j = new e63(11);

    public static void A(int i2, String str, Throwable th) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 20);
        sb.append("Ad failed to load : ");
        sb.append(i2);
        zzo.zzh(sb.toString());
        zze.zzb(str, th);
        if (i2 == 3) {
            return;
        }
        zzt.zzh().g(th, str);
    }

    public static int B(int i2) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i3 = 0; i3 < 6; i3++) {
            int i4 = iArr[i3];
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i5 == i2) {
                return i4;
            }
        }
        return 1;
    }

    public static void C(Context context, boolean z) {
        if (z) {
            zzo.zzh("This request is sent from a test device.");
            return;
        }
        zzbb.zza();
        String strZzD = zzf.zzD(context);
        StringBuilder sb = new StringBuilder(String.valueOf(strZzD).length() + Packet.SSH_FXP_HANDLE);
        sb.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb.append(strZzD);
        sb.append("\")) to get test ads on this device.");
        zzo.zzh(sb.toString());
    }

    public static void D(zzeq zzeqVar) {
        int iH;
        int iH2 = zzeqVar.h(2);
        if (iH2 == 0) {
            zzeqVar.f(6);
            return;
        }
        int iJ = J(zzeqVar, 5, 8, 16) + 1;
        if (iH2 == 1) {
            zzeqVar.f(iJ * 7);
            return;
        }
        if (iH2 == 2) {
            boolean zG = zzeqVar.g();
            int i2 = true != zG ? 5 : 1;
            int i3 = true == zG ? 7 : 5;
            int i4 = true == zG ? 8 : 6;
            int i5 = 0;
            while (i5 < iJ) {
                if (zzeqVar.g()) {
                    zzeqVar.f(7);
                    iH = 0;
                } else {
                    if (zzeqVar.h(2) == 3 && zzeqVar.h(i3) * i2 != 0) {
                        zzeqVar.e();
                    }
                    iH = zzeqVar.h(i4) * i2;
                    if (iH != 0 && iH != 180) {
                        zzeqVar.e();
                    }
                    zzeqVar.e();
                }
                if (iH != 0 && iH != 180 && zzeqVar.g()) {
                    i5++;
                }
                i5++;
            }
        }
    }

    public static void E(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String strSubstring = str.substring(0, 30);
        throw new NumberFormatException(vh.t(new StringBuilder(strSubstring.length() + 28), "Number string too large: ", strSubstring, "..."));
    }

    public static String F(String str, Object... objArr) {
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
            sb.append(G(objArr[i2]));
            i3 = iIndexOf + 2;
            i2++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i2 < length) {
            String str2 = " [";
            while (i2 < objArr.length) {
                sb.append(str2);
                sb.append(G(objArr[i2]));
                i2++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String G(Object obj) {
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

    public static void H(zzeq zzeqVar) {
        zzeqVar.f(3);
        zzeqVar.f(8);
        boolean zG = zzeqVar.g();
        boolean zG2 = zzeqVar.g();
        if (zG) {
            zzeqVar.f(5);
        }
        if (zG2) {
            zzeqVar.f(6);
        }
    }

    public static int I(int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || (i4 = i3 >> 1) >= 19) {
            return -1;
        }
        int i5 = e[i2];
        if (i5 == 44100) {
            int i6 = i[i4] + (i3 & 1);
            return i6 + i6;
        }
        int i7 = h[i4];
        return i5 == 32000 ? i7 * 6 : i7 * 4;
    }

    public static int J(zzeq zzeqVar, int i2, int i3, int i4) {
        n8.S(Math.max(Math.max(i2, i3), i4) <= 31);
        int i5 = (1 << i2) - 1;
        int i6 = (1 << i3) - 1;
        long j2 = ((long) i5) + ((long) i6);
        long j3 = (int) j2;
        if (j2 != j3) {
            throw new ArithmeticException();
        }
        if (j3 + ((long) (1 << i4)) != ((int) r6)) {
            throw new ArithmeticException();
        }
        if (zzeqVar.b() >= i2) {
            int iH = zzeqVar.h(i2);
            if (iH == i5) {
                if (zzeqVar.b() >= i3) {
                    int iH2 = zzeqVar.h(i3);
                    iH += iH2;
                    if (iH2 == i6) {
                        if (zzeqVar.b() >= i4) {
                            return zzeqVar.h(i4) + iH;
                        }
                    }
                }
            }
            return iH;
        }
        return -1;
    }

    public static final void a(StringValuesBuilder stringValuesBuilder, StringValues stringValues) {
        for (String str : stringValues.names()) {
            List<String> all = stringValues.getAll(str);
            if (all == null) {
                all = EmptyList.INSTANCE;
            }
            String strE = eo.e(str, false);
            ArrayList arrayList = new ArrayList(c.l(all, 10));
            for (String str2 : all) {
                str2.getClass();
                arrayList.add(eo.e(str2, true));
            }
            stringValuesBuilder.appendAll(strE, arrayList);
        }
    }

    public static int b(ByteMatrix byteMatrix, boolean z) {
        int i2 = byteMatrix.b;
        int i3 = byteMatrix.c;
        int i4 = z ? i3 : i2;
        if (!z) {
            i2 = i3;
        }
        byte[][] bArr = byteMatrix.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte b2 = -1;
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                byte b3 = z ? bArr[i6][i8] : bArr[i8][i6];
                if (b3 == b2) {
                    i7++;
                } else {
                    if (i7 >= 5) {
                        i5 += i7 - 2;
                    }
                    i7 = 1;
                    b2 = b3;
                }
            }
            if (i7 >= 5) {
                i5 = (i7 - 2) + i5;
            }
        }
        return i5;
    }

    public static void c(float f2, float[] fArr) {
        if (f2 <= 0.5f) {
            fArr[0] = 1.0f - (f2 * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f2 * 2.0f) - 1.0f;
        }
    }

    public static final SerialDescriptor d(SerialDescriptor serialDescriptor, SerializersModule serializersModule) {
        SerialDescriptor serialDescriptorD;
        KSerializer kSerializerB;
        serialDescriptor.getClass();
        serializersModule.getClass();
        if (!yg0.a(serialDescriptor.getB(), d61.a)) {
            return serialDescriptor.isInline() ? d(serialDescriptor.getElementDescriptor(0), serializersModule) : serialDescriptor;
        }
        KClass kClassA = kotlinx.serialization.descriptors.a.a(serialDescriptor);
        SerialDescriptor descriptor = null;
        if (kClassA != null && (kSerializerB = serializersModule.b(kClassA, EmptyList.INSTANCE)) != null) {
            descriptor = kSerializerB.getB();
        }
        return (descriptor == null || (serialDescriptorD = d(descriptor, serializersModule)) == null) ? serialDescriptor : serialDescriptorD;
    }

    public static final void e(SerialKind serialKind) {
        serialKind.getClass();
        if (serialKind instanceof e61) {
            u7.p("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (serialKind instanceof PrimitiveKind) {
            u7.p("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (serialKind instanceof PolymorphicKind) {
            u7.p("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String f(SerialDescriptor serialDescriptor, Json json) {
        serialDescriptor.getClass();
        json.getClass();
        for (Annotation annotation : serialDescriptor.getD()) {
            if (annotation instanceof JsonClassDiscriminator) {
                return ((JsonClassDiscriminator) annotation).discriminator();
            }
        }
        return json.a.j;
    }

    public static boolean g(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static void h(InputStream inputStream, OutputStream outputStream) throws IOException {
        inputStream.getClass();
        byte[] bArr = new byte[AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT];
        int i2 = inputStream.read(bArr);
        while (i2 >= 0) {
            outputStream.write(bArr, 0, i2);
            i2 = inputStream.read(bArr);
        }
    }

    public static FontRequestEmojiCompatConfig i(Context context) {
        ProviderInfo providerInfoA;
        FontRequest fontRequest;
        ApplicationInfo applicationInfo;
        DefaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory defaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory = new DefaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory(null);
        PackageManager packageManager = context.getPackageManager();
        jx0.f(packageManager, "Package manager required to locate emoji font provider");
        Intent intent = new Intent("androidx.content.action.LOAD_EMOJI_FONT");
        DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper defaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper = defaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory.a;
        Iterator it = defaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper.c(packageManager, intent).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfoA = null;
                break;
            }
            providerInfoA = defaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper.a((ResolveInfo) it.next());
            if (providerInfoA != null && (applicationInfo = providerInfoA.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfoA == null) {
            fontRequest = null;
        } else {
            try {
                String str = providerInfoA.authority;
                String str2 = providerInfoA.packageName;
                Signature[] signatureArrB = defaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper.b(str2, packageManager);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrB) {
                    arrayList.add(signature.toByteArray());
                }
                fontRequest = new FontRequest(str, str2, "emojicompat-emoji-font", (List<List<byte[]>>) Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException unused) {
                fontRequest = null;
            }
        }
        if (fontRequest == null) {
            return null;
        }
        return new FontRequestEmojiCompatConfig(context, fontRequest);
    }

    public static final Parameters j(StringValuesBuilder stringValuesBuilder) {
        ParametersBuilderImpl parametersBuilderImplA = sb2.a();
        for (String str : stringValuesBuilder.names()) {
            List<String> all = stringValuesBuilder.getAll(str);
            if (all == null) {
                all = EmptyList.INSTANCE;
            }
            String strD = eo.d(0, 0, str, 15);
            ArrayList arrayList = new ArrayList(c.l(all, 10));
            Iterator<T> it = all.iterator();
            while (it.hasNext()) {
                arrayList.add(eo.d(0, 0, (String) it.next(), 11));
            }
            parametersBuilderImplA.appendAll(strD, arrayList);
        }
        return parametersBuilderImplA.build();
    }

    public static final Bundle k(SerializationStrategy serializationStrategy, Object obj, SavedStateConfiguration savedStateConfiguration) {
        Pair[] pairArr;
        obj.getClass();
        Map mapA = d.a();
        if (mapA.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapA.size());
            for (Map.Entry entry : mapA.entrySet()) {
                arrayList.add(new Pair((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleB = kf2.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        new SavedStateEncoder(bundleB, savedStateConfiguration).encodeSerializableValue(serializationStrategy, obj);
        return bundleB;
    }

    public static int l(Context context, TypedArray typedArray, int i2, int i3) {
        int resourceId;
        try {
            return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getColor(i2, context.getColor(i3)) : context.getColor(resourceId);
        } catch (Exception unused) {
            return context.getColor(i3);
        }
    }

    public static final String m(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final int n(ArraySet arraySet, Object obj, int i2) {
        int i3 = arraySet.c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iC = w91.c(i3, i2, arraySet.a);
            if (iC < 0 || yg0.a(obj, arraySet.b[iC])) {
                return iC;
            }
            int i4 = iC + 1;
            while (i4 < i3 && arraySet.a[i4] == i2) {
                if (yg0.a(obj, arraySet.b[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iC - 1; i5 >= 0 && arraySet.a[i5] == i2; i5--) {
                if (yg0.a(obj, arraySet.b[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            u7.d();
            return 0;
        }
    }

    public static final Object o(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final byte[] p(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT, inputStream.available()));
        h(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static boolean q(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static final WriteMode r(SerialDescriptor serialDescriptor, Json json) {
        json.getClass();
        SerialKind kind = serialDescriptor.getB();
        if (kind instanceof PolymorphicKind) {
            return WriteMode.POLY_OBJ;
        }
        if (yg0.a(kind, mb1.a)) {
            return WriteMode.LIST;
        }
        if (!yg0.a(kind, nb1.a)) {
            return WriteMode.OBJ;
        }
        SerialDescriptor serialDescriptorD = d(serialDescriptor.getElementDescriptor(0), json.b);
        SerialKind kind2 = serialDescriptorD.getB();
        if ((kind2 instanceof PrimitiveKind) || yg0.a(kind2, e61.a)) {
            return WriteMode.MAP;
        }
        if (json.a.d) {
            return WriteMode.LIST;
        }
        throw qj1.b(serialDescriptorD);
    }

    public static final long s(String str, long j2, long j3, long j4) {
        String property;
        int i2 = md1.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j2;
        }
        Long lB0 = g.b0(property);
        if (lB0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lB0.longValue();
        if (j3 <= jLongValue && jLongValue <= j4) {
            return jLongValue;
        }
        StringBuilder sb = new StringBuilder("System property '");
        sb.append(str);
        sb.append("' should be in range ");
        sb.append(j3);
        hz.G(sb, "..", j4, ", but is '");
        sb.append(jLongValue);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    public static int t(int i2, int i3, String str) {
        return (int) s(str, i2, 1L, (i3 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final void u(String str, JsonElement jsonElement) {
        StringBuilder sbX = vh.x("Class with serial name ", str, " cannot be serialized polymorphically because it is represented as ");
        sbX.append(Reflection.a(jsonElement.getClass()).getSimpleName());
        sbX.append(". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
        throw new JsonEncodingException(sbX.toString());
    }

    public static final String v(Continuation continuation) {
        Object objD;
        if (continuation instanceof DispatchedContinuation) {
            return ((DispatchedContinuation) continuation).toString();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objD = Result.m36constructorimpl(continuation + '@' + m(continuation));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objD = vh.d(th);
        }
        if (Result.m39exceptionOrNullimpl(objD) != null) {
            objD = continuation.getClass().getName() + '@' + m(continuation);
        }
        return (String) objD;
    }

    public static final void w(SerializationStrategy serializationStrategy, SerializationStrategy serializationStrategy2, String str) {
        if (serializationStrategy instanceof SealedClassSerializer) {
            SerialDescriptor descriptor = serializationStrategy2.getB();
            descriptor.getClass();
            if (k02.c(descriptor).contains(str)) {
                StringBuilder sbA = hz.A("Sealed class '", serializationStrategy2.getB().getB(), "' cannot be serialized as base class '", ((SealedClassSerializer) serializationStrategy).getB().getB(), "' because it has property name that conflicts with JSON class discriminator '");
                sbA.append(str);
                sbA.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                throw new IllegalStateException(sbA.toString().toString());
            }
        }
    }

    public static int x(int i2) {
        int[] iArr = {1, 2, 3};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr[i3];
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i5 == i2) {
                return i4;
            }
        }
        return 1;
    }

    public static Object y(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static BigDecimal z(String str) {
        E(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }
}
