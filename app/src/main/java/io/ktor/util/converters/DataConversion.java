package io.ktor.util.converters;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.yu;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.KtorDsl;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.d;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lio/ktor/util/converters/DataConversion;", "Lio/ktor/util/converters/ConversionService;", "Lio/ktor/util/converters/DataConversion$Configuration;", "configuration", "<init>", "(Lio/ktor/util/converters/DataConversion$Configuration;)V", "Configuration", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataConversion implements ConversionService {
    public final Map a;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @KtorDsl
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/util/converters/DataConversion$Configuration;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Configuration {
        public final LinkedHashMap a = new LinkedHashMap();
    }

    public DataConversion(Configuration configuration) {
        configuration.getClass();
        this.a = d.i(configuration.a);
    }

    @Override // io.ktor.util.converters.ConversionService
    public final Object fromValues(List list, TypeInfo typeInfo) {
        list.getClass();
        typeInfo.getClass();
        if (list.isEmpty()) {
            return null;
        }
        ConversionService conversionService = (ConversionService) this.a.get(typeInfo.a);
        if (conversionService == null) {
            conversionService = yu.a;
        }
        return conversionService.fromValues(list, typeInfo);
    }

    @Override // io.ktor.util.converters.ConversionService
    public final List toValues(Object obj) {
        if (obj == null) {
            return EmptyList.INSTANCE;
        }
        ConversionService conversionService = (ConversionService) this.a.get(Reflection.a(obj.getClass()));
        if (conversionService == null) {
            conversionService = yu.a;
        }
        return conversionService.toValues(obj);
    }
}
