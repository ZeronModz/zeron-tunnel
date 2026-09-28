package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import io.ktor.util.StringValuesBuilderImpl;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/http/ParametersBuilderImpl;", "Lio/ktor/util/StringValuesBuilderImpl;", "Lio/ktor/http/ParametersBuilder;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "size", "<init>", "(I)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ParametersBuilderImpl extends StringValuesBuilderImpl implements ParametersBuilder {
    public /* synthetic */ ParametersBuilderImpl(int i, int i2, xu xuVar) {
        this((i2 & 1) != 0 ? 8 : i);
    }

    @Override // io.ktor.util.StringValuesBuilderImpl, io.ktor.util.StringValuesBuilder
    public final Parameters build() {
        return new ParametersImpl(this.b);
    }

    public ParametersBuilderImpl() {
        this(0, 1, null);
    }

    public ParametersBuilderImpl(int i) {
        super(true, i);
    }
}
