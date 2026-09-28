package defpackage;

import android.os.Process;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.datastorage.JavaDataStorage;
import com.google.firebase.sessions.settings.a;
import com.trilead.ssh2.sftp.ErrorCodes;
import io.github.g00fy2.quickie.QROverlayView;
import io.ktor.client.HttpClient;
import io.ktor.client.engine.HttpClientEngineConfig;
import io.ktor.client.engine.okhttp.OkHttpEngine;
import io.ktor.client.plugins.f;
import io.ktor.events.EventDefinition;
import io.ktor.http.ContentType;
import io.ktor.util.CaseInsensitiveString;
import io.ktor.util.internal.LockFreeLinkedListHead;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z3 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ z3(JavaDataStorage javaDataStorage) {
        this.a = 21;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Map map = null;
        Object[] objArr = 0;
        mk1 mk1Var = mk1.a;
        boolean z = true;
        char c = 1;
        switch (i) {
            case 0:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02X", Arrays.copyOf(new Object[]{b}, 1));
            case 1:
                Byte b2 = (Byte) obj;
                b2.byteValue();
                return String.format("%02X", Arrays.copyOf(new Object[]{b2}, 1));
            case 2:
                Byte b3 = (Byte) obj;
                b3.byteValue();
                return String.format("%02X", Arrays.copyOf(new Object[]{b3}, 1));
            case 3:
                CaseInsensitiveString caseInsensitiveString = (CaseInsensitiveString) obj;
                caseInsensitiveString.getClass();
                return caseInsensitiveString.a;
            case 4:
                String str = (String) obj;
                str.getClass();
                return new CaseInsensitiveString(str);
            case 5:
                return Boolean.valueOf(l02.x(((Character) obj).charValue()));
            case 6:
                return Boolean.valueOf(l02.A(((Character) obj).charValue()));
            case 7:
                return Boolean.valueOf(l02.x(((Character) obj).charValue()));
            case 8:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                MatchGroup matchGroup = matchResult.getGroups().get(2);
                String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                String str3 = matchGroup != null ? matchGroup.a : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                MatchGroup matchGroup2 = matchResult.getGroups().get(4);
                if (matchGroup2 != null) {
                    str2 = matchGroup2.a;
                }
                return new Pair(str3, str2);
            case 9:
                Pair pair = (Pair) obj;
                pair.getClass();
                if (!g.R((String) pair.getSecond(), "\"", false) || !g.u((String) pair.getSecond(), "\"", false)) {
                    return pair;
                }
                String str4 = (String) pair.getSecond();
                str4.getClass();
                return Pair.copy$default(pair, null, g.K(str4, "\"", "\""), 1, null);
            case 10:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof CoroutineDispatcher) {
                    return (CoroutineDispatcher) element;
                }
                return null;
            case 11:
                ((EventDefinition) obj).getClass();
                return new LockFreeLinkedListHead();
            case 12:
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj;
                if (element2 instanceof ExecutorCoroutineDispatcher) {
                    return (ExecutorCoroutineDispatcher) element2;
                }
                return null;
            case 13:
                Pair pair2 = (Pair) obj;
                pair2.getClass();
                return new Pair((ContentType) pair2.component2(), (String) pair2.component1());
            case 14:
                ((CorruptionException) obj).getClass();
                return a.b;
            case 15:
                return obj;
            case 16:
                Pair pair3 = (Pair) obj;
                pair3.getClass();
                Object first = pair3.getFirst();
                Regex regex = ul1.a;
                return first + "=" + ul1.D((String) pair3.getSecond());
            case 17:
                HttpClient httpClient = (HttpClient) obj;
                int i2 = HttpClient.m;
                httpClient.getClass();
                f.a(httpClient);
                return mk1Var;
            case 18:
                ((HttpClientEngineConfig) obj).getClass();
                return mk1Var;
            case 19:
                obj.getClass();
                return mk1Var;
            case 20:
                Pair pair4 = (Pair) obj;
                pair4.getClass();
                String strE = eo.e((String) pair4.getFirst(), true);
                if (pair4.getSecond() == null) {
                    return strE;
                }
                return strE + '=' + eo.e(String.valueOf(pair4.getSecond()), true);
            case 21:
                KProperty[] kPropertyArr = JavaDataStorage.d;
                ((CorruptionException) obj).getClass();
                Reflection.a(JavaDataStorage.class).getSimpleName();
                Process.myPid();
                return new MutablePreferences(map, z, c == true ? 1 : 0, objArr == true ? 1 : 0);
            case 22:
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder = (ClassSerialDescriptorBuilder) obj;
                classSerialDescriptorBuilder.getClass();
                ClassSerialDescriptorBuilder.a(classSerialDescriptorBuilder, "JsonPrimitive", new li0(new o0(19)));
                ClassSerialDescriptorBuilder.a(classSerialDescriptorBuilder, "JsonNull", new li0(new o0(20)));
                ClassSerialDescriptorBuilder.a(classSerialDescriptorBuilder, "JsonLiteral", new li0(new o0(21)));
                ClassSerialDescriptorBuilder.a(classSerialDescriptorBuilder, "JsonObject", new li0(new o0(22)));
                ClassSerialDescriptorBuilder.a(classSerialDescriptorBuilder, "JsonArray", new li0(new o0(23)));
                return mk1Var;
            case 23:
                Map.Entry entry = (Map.Entry) obj;
                JsonObject.Companion companion = JsonObject.INSTANCE;
                entry.getClass();
                String str5 = (String) entry.getKey();
                JsonElement jsonElement = (JsonElement) entry.getValue();
                StringBuilder sb = new StringBuilder();
                ab1.a(str5, sb);
                sb.append(':');
                sb.append(jsonElement);
                return sb.toString();
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                String str6 = (String) obj;
                str6.getClass();
                String string = g.c0(str6).toString();
                if (string.length() == 0) {
                    return null;
                }
                int iY = g.y(string, ',', 0, 6);
                String strSubstring = string.substring(0, iY);
                String strSubstring2 = string.substring(iY + 1);
                String strJ = dn0.J(g.I(strSubstring, "."));
                Lazy lazy = io.ktor.http.a.a;
                try {
                    ContentType.f.getClass();
                    return new Pair(strJ, ContentType.Companion.a(strSubstring2));
                } catch (Throwable th) {
                    throw new IllegalArgumentException("Failed to parse ".concat(strSubstring2), th);
                }
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                OkHttpClient.Builder builder = (OkHttpClient.Builder) obj;
                builder.getClass();
                builder.h = false;
                builder.i = false;
                builder.f = true;
                return mk1Var;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                OkHttpEngine.Companion companion2 = OkHttpEngine.k;
                ((OkHttpClient) obj).getClass();
                return mk1Var;
            case 27:
                ((Boolean) obj).getClass();
                int i3 = QROverlayView.r;
                return mk1Var;
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                List list = (List) obj;
                list.getClass();
                return new SparseArraySerializer((KSerializer) c.r(list));
            default:
                return Boolean.valueOf(obj == null);
        }
    }

    public /* synthetic */ z3(int i) {
        this.a = i;
    }
}
