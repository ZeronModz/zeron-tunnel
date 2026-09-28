package io.ktor.serialization;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import io.ktor.http.ContentType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JD\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/serialization/Configuration;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/serialization/ContentConverter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lio/ktor/http/ContentType;", "contentType", "converter", "Lkotlin/Function1;", "Lmk1;", "Lkotlin/ExtensionFunctionType;", "configuration", "register", "(Lio/ktor/http/ContentType;Lio/ktor/serialization/ContentConverter;Lkotlin/jvm/functions/Function1;)V", "ktor-serialization"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Configuration {
    <T extends ContentConverter> void register(ContentType contentType, T converter, Function1<? super T, mk1> configuration);
}
