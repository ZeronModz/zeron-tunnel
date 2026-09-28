package io.ktor.http.content;

import defpackage.le0;
import defpackage.qc0;
import defpackage.ro;
import defpackage.so;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OutgoingContent b;

    public /* synthetic */ b(OutgoingContent outgoingContent, int i) {
        this.a = i;
        this.b = outgoingContent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        OutgoingContent outgoingContent = this.b;
        switch (i) {
            case 0:
                CompressedReadChannelResponse compressedReadChannelResponse = (CompressedReadChannelResponse) outgoingContent;
                qc0 qc0Var = Headers.Companion;
                HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
                Headers headersC = compressedReadChannelResponse.a.c();
                so soVar = new so(1);
                headersC.getClass();
                headersC.forEach(new ro(1, headersBuilder, soVar));
                List list = le0.a;
                headersBuilder.append("Content-Encoding", compressedReadChannelResponse.c.getName());
                return headersBuilder.build();
            default:
                CompressedWriteChannelResponse compressedWriteChannelResponse = (CompressedWriteChannelResponse) outgoingContent;
                qc0 qc0Var2 = Headers.Companion;
                HeadersBuilder headersBuilder2 = new HeadersBuilder(0, 1, null);
                Headers headersC2 = compressedWriteChannelResponse.a.c();
                so soVar2 = new so(2);
                headersC2.getClass();
                headersC2.forEach(new ro(1, headersBuilder2, soVar2));
                List list2 = le0.a;
                headersBuilder2.append("Content-Encoding", compressedWriteChannelResponse.b.getName());
                return headersBuilder2.build();
        }
    }
}
