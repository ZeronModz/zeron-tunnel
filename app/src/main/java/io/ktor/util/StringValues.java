package io.ktor.util;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.eb1;
import defpackage.mk1;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dJ\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\f0\tH&¢\u0006\u0004\b\r\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0012J/\u0010\u0016\u001a\u00020\u00142\u001e\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH&¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001e"}, d2 = {"Lio/ktor/util/StringValues;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "name", "get", "(Ljava/lang/String;)Ljava/lang/String;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "getAll", "(Ljava/lang/String;)Ljava/util/List;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "names", "()Ljava/util/Set;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "entries", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "contains", "(Ljava/lang/String;)Z", "value", "(Ljava/lang/String;Ljava/lang/String;)Z", "Lkotlin/Function2;", "Lmk1;", "body", "forEach", "(Lkotlin/jvm/functions/Function2;)V", "isEmpty", "()Z", "getCaseInsensitiveName", "caseInsensitiveName", "Companion", "eb1", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface StringValues {
    public static final eb1 Companion = eb1.a;

    boolean contains(String name);

    boolean contains(String name, String value);

    Set<Map.Entry<String, List<String>>> entries();

    void forEach(Function2<? super String, ? super List<String>, mk1> body);

    String get(String name);

    List<String> getAll(String name);

    /* JADX INFO: renamed from: getCaseInsensitiveName */
    boolean getA();

    boolean isEmpty();

    Set<String> names();
}
