package defpackage;

import coil3.fetch.Fetcher;
import com.google.android.gms.ads.RequestConfiguration;
import io.ktor.http.Url;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.c;
import kotlin.collections.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ClassReference;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.g;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonNames;
import kotlinx.serialization.json.JsonNamingStrategy;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class up implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ up(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlinx.serialization.descriptors.SerialDescriptor] */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlinx.serialization.internal.EnumDescriptor, kotlinx.serialization.internal.PluginGeneratedSerialDescriptor] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String[] strArrNames;
        int iY;
        int i = this.a;
        int i2 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return c.z(new Pair((Fetcher.Factory) obj2, (ClassReference) obj));
            case 1:
                EnumSerializer enumSerializer = (EnumSerializer) obj2;
                String str = (String) obj;
                Object enumDescriptor = enumSerializer.b;
                if (enumDescriptor == 0) {
                    Enum[] enumArr = enumSerializer.a;
                    enumDescriptor = new EnumDescriptor(str, enumArr.length);
                    for (Enum r0 : enumArr) {
                        enumDescriptor.a(r0.name(), false);
                    }
                }
                return enumDescriptor;
            case 2:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
                Json json = (Json) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                boolean z = json.a.n && yg0.a(serialDescriptor.getB(), e61.a);
                JsonNamingStrategy jsonNamingStrategyF = kotlinx.serialization.json.internal.c.f(serialDescriptor, json);
                int c = serialDescriptor.getC();
                for (int i3 = 0; i3 < c; i3++) {
                    List<Annotation> elementAnnotations = serialDescriptor.getElementAnnotations(i3);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : elementAnnotations) {
                        if (obj3 instanceof JsonNames) {
                            arrayList.add(obj3);
                        }
                    }
                    String strSerialNameForJson = null;
                    JsonNames jsonNames = (JsonNames) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (jsonNames != null && (strArrNames = jsonNames.names()) != null) {
                        for (String lowerCase : strArrNames) {
                            if (z) {
                                lowerCase = lowerCase.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            }
                            kotlinx.serialization.json.internal.c.a(linkedHashMap, serialDescriptor, lowerCase, i3);
                        }
                    }
                    if (z) {
                        strSerialNameForJson = serialDescriptor.getElementName(i3).toLowerCase(Locale.ROOT);
                        strSerialNameForJson.getClass();
                    } else if (jsonNamingStrategyF != null) {
                        strSerialNameForJson = jsonNamingStrategyF.serialNameForJson(serialDescriptor, i3, serialDescriptor.getElementName(i3));
                    }
                    if (strSerialNameForJson != null) {
                        kotlinx.serialization.json.internal.c.a(linkedHashMap, serialDescriptor, strSerialNameForJson, i3);
                    }
                }
                return linkedHashMap.isEmpty() ? d.a() : linkedHashMap;
            case 3:
                SerialDescriptor serialDescriptor2 = (SerialDescriptor) obj2;
                JsonNamingStrategy jsonNamingStrategy = (JsonNamingStrategy) obj;
                int c2 = serialDescriptor2.getC();
                String[] strArr = new String[c2];
                while (i2 < c2) {
                    strArr[i2] = jsonNamingStrategy.serialNameForJson(serialDescriptor2, i2, serialDescriptor2.getElementName(i2));
                    i2++;
                }
                return strArr;
            case 4:
                return qj1.h((String) obj2, ob1.a, new SerialDescriptor[0], new t((ObjectSerializer) obj, 18));
            case 5:
                return qj1.h((String) obj2, ex0.a, new SerialDescriptor[0], new l51((SealedClassSerializer) obj, i2));
            default:
                Url url = (Url) obj;
                String str2 = url.g;
                int i4 = Url.s;
                if (((List) obj2).isEmpty() || (iY = g.y(str2, '/', url.l.a.length() + 3, 4)) == -1) {
                    return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                int iF = StringsKt__StringsKt.f(str2, new char[]{'?', '#'}, iY, false);
                return iF == -1 ? str2.substring(iY) : str2.substring(iY, iF);
        }
    }
}
