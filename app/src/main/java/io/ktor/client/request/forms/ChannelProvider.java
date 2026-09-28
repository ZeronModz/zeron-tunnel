package io.ktor.client.request.forms;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/client/request/forms/ChannelProvider;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "size", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "block", "<init>", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function0;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChannelProvider {
    public final Function0 a;

    public ChannelProvider(Long l, Function0<? extends ByteReadChannel> function0) {
        function0.getClass();
        this.a = function0;
    }

    public /* synthetic */ ChannelProvider(Long l, Function0 function0, int i, xu xuVar) {
        this((i & 1) != 0 ? null : l, function0);
    }
}
