package io.ktor.client.request.forms;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.io.Source;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/request/forms/PreparedPart;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "InputPart", "ChannelPart", "Lio/ktor/client/request/forms/PreparedPart$ChannelPart;", "Lio/ktor/client/request/forms/PreparedPart$InputPart;", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
abstract class PreparedPart {
    public final byte[] a;
    public final Long b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/client/request/forms/PreparedPart$ChannelPart;", "Lio/ktor/client/request/forms/PreparedPart;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "headers", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "provider", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "size", "<init>", "([BLkotlin/jvm/functions/Function0;Ljava/lang/Long;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChannelPart extends PreparedPart {
        public final Function0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChannelPart(byte[] bArr, Function0<? extends ByteReadChannel> function0, Long l) {
            super(bArr, l, null);
            bArr.getClass();
            function0.getClass();
            this.c = function0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/client/request/forms/PreparedPart$InputPart;", "Lio/ktor/client/request/forms/PreparedPart;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "headers", "Lkotlin/Function0;", "Lkotlinx/io/Source;", "Lio/ktor/utils/io/core/Input;", "provider", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "size", "<init>", "([BLkotlin/jvm/functions/Function0;Ljava/lang/Long;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InputPart extends PreparedPart {
        public final Function0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InputPart(byte[] bArr, Function0<? extends Source> function0, Long l) {
            super(bArr, l, null);
            bArr.getClass();
            function0.getClass();
            this.c = function0;
        }
    }

    public PreparedPart(byte[] bArr, Long l, xu xuVar) {
        this.a = bArr;
        this.b = l;
    }
}
