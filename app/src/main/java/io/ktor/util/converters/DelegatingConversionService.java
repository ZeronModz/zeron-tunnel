package io.ktor.util.converters;

import com.google.android.gms.ads.RequestConfiguration;
import io.ktor.util.reflect.TypeInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010Bm\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012+\u0010\u000b\u001a'\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0004\u0012+\u0010\r\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/ktor/util/converters/DelegatingConversionService;", "Lio/ktor/util/converters/ConversionService;", "Lkotlin/reflect/KClass;", "klass", "Lkotlin/Function1;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlin/ParameterName;", "name", "values", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "decoder", "value", "encoder", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Configuration", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DelegatingConversionService implements ConversionService {
    public final KClass a;
    public final Function1 b;
    public final Function1 c;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/util/converters/DelegatingConversionService$Configuration;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/reflect/KClass;", "klass", "<init>", "(Lkotlin/reflect/KClass;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Configuration<T> {
        public final KClass a;

        public Configuration(KClass<T> kClass) {
            kClass.getClass();
            this.a = kClass;
        }
    }

    public DelegatingConversionService(KClass<?> kClass, Function1<? super List<String>, ? extends Object> function1, Function1<Object, ? extends List<String>> function12) {
        kClass.getClass();
        this.a = kClass;
        this.b = function1;
        this.c = function12;
    }

    @Override // io.ktor.util.converters.ConversionService
    public final Object fromValues(List list, TypeInfo typeInfo) {
        list.getClass();
        typeInfo.getClass();
        Function1 function1 = this.b;
        if (function1 != null) {
            return function1.invoke(list);
        }
        throw new IllegalStateException("Decoder was not specified for type '" + this.a + '\'');
    }

    @Override // io.ktor.util.converters.ConversionService
    public final List toValues(Object obj) {
        Function1 function1 = this.c;
        if (function1 != null) {
            return (List) function1.invoke(obj);
        }
        throw new IllegalStateException("Encoder was not specified for type '" + this.a + '\'');
    }
}
