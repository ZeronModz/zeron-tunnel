package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import io.ktor.websocket.Frame;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeReference;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.text.g;
import okio.internal.ZipEntry;
import org.slf4j.Marker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ni1 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ni1(TypeReference typeReference) {
        this.a = 0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                KTypeProjection kTypeProjection = (KTypeProjection) obj;
                int i = TypeReference.e;
                kTypeProjection.getClass();
                KVariance kVariance = kTypeProjection.a;
                if (kVariance == null) {
                    return Marker.ANY_MARKER;
                }
                KType kType = kTypeProjection.b;
                TypeReference typeReference = kType instanceof TypeReference ? (TypeReference) kType : null;
                String strA = typeReference != null ? typeReference.a(true) : String.valueOf(kType);
                int i2 = oi1.a[kVariance.ordinal()];
                if (i2 == 1) {
                    return strA;
                }
                if (i2 == 2) {
                    return "in ".concat(strA);
                }
                if (i2 == 3) {
                    return "out ".concat(strA);
                }
                p60.b();
                return null;
            case 1:
                Pair pair = (Pair) obj;
                pair.getClass();
                String str = (String) pair.getFirst();
                if (pair.getSecond() == null) {
                    return str;
                }
                return str + '=' + String.valueOf(pair.getSecond());
            case 2:
                ((List) obj).getClass();
                return mk1.a;
            case 3:
                ((Frame) obj).getClass();
                return Boolean.TRUE;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                int iY = g.y(str2, '=', 0, 6);
                String strSubstring = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                if (iY < 0) {
                    return new Pair(str2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                }
                IntRange intRangeD = a.d(0, iY);
                intRangeD.getClass();
                String strSubstring2 = str2.substring(intRangeD.a, intRangeD.b + 1);
                int i3 = iY + 1;
                if (i3 < str2.length()) {
                    strSubstring = str2.substring(i3);
                }
                return new Pair(strSubstring2, strSubstring);
            default:
                ((ZipEntry) obj).getClass();
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ ni1(int i) {
        this.a = i;
    }
}
