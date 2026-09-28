package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.le0;
import defpackage.xu;
import defpackage.yg0;
import io.ktor.util.StringValuesBuilderImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/http/HeadersBuilder;", "Lio/ktor/util/StringValuesBuilderImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "size", "<init>", "(I)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HeadersBuilder extends StringValuesBuilderImpl {
    public /* synthetic */ HeadersBuilder(int i, int i2, xu xuVar) {
        this((i2 & 1) != 0 ? 8 : i);
    }

    @Override // io.ktor.util.StringValuesBuilderImpl
    public final void b(String str) {
        List list = le0.a;
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (yg0.q(cCharAt, 32) <= 0 || g.p("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                throw new IllegalHeaderNameException(str, i2);
            }
            i++;
            i2 = i3;
        }
    }

    @Override // io.ktor.util.StringValuesBuilderImpl
    public final void c(String str) {
        str.getClass();
        List list = le0.a;
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (yg0.q(cCharAt, 32) < 0 && cCharAt != '\t') {
                throw new IllegalHeaderValueException(str, i2);
            }
            i++;
            i2 = i3;
        }
    }

    @Override // io.ktor.util.StringValuesBuilderImpl, io.ktor.util.StringValuesBuilder
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final HeadersImpl build() {
        return new HeadersImpl(this.b);
    }

    public HeadersBuilder(int i) {
        super(true, i);
    }

    public HeadersBuilder() {
        this(0, 1, null);
    }
}
