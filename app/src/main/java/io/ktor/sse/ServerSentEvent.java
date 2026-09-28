package io.ktor.sse;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import defpackage.o61;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/sse/ServerSentEvent;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "event", "id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "retry", "comments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "ktor-sse"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ServerSentEvent {
    public final String a;
    public final String b;
    public final String c;
    public final Long d;
    public final String e;

    public /* synthetic */ ServerSentEvent(String str, String str2, String str3, Long l, String str4, int i, xu xuVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        o61.a(this.a, Constants$ScionAnalytics$MessageType.DATA_MESSAGE, sb);
        o61.a(this.b, "event", sb);
        o61.a(this.c, "id", sb);
        o61.a(this.d, "retry", sb);
        o61.a(this.e, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, sb);
        return sb.toString();
    }

    public ServerSentEvent(String str, String str2, String str3, Long l, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
        this.e = str4;
    }

    public ServerSentEvent() {
        this(null, null, null, null, null, 31, null);
    }
}
