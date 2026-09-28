package defpackage;

import com.google.firebase.messaging.reporting.MessagingClientEvent$Event;
import com.google.firebase.messaging.reporting.MessagingClientEvent$MessageType;
import com.google.firebase.messaging.reporting.MessagingClientEvent$SDKPlatform;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class wp0 {
    public static final /* synthetic */ int n = 0;
    public final long a;
    public final String b;
    public final String c;
    public final MessagingClientEvent$MessageType d;
    public final MessagingClientEvent$SDKPlatform e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final String j;
    public final MessagingClientEvent$Event k;
    public final String l;
    public final String m;

    static {
        MessagingClientEvent$MessageType messagingClientEvent$MessageType = MessagingClientEvent$MessageType.UNKNOWN;
        MessagingClientEvent$SDKPlatform messagingClientEvent$SDKPlatform = MessagingClientEvent$SDKPlatform.UNKNOWN_OS;
        MessagingClientEvent$Event messagingClientEvent$Event = MessagingClientEvent$Event.UNKNOWN_EVENT;
    }

    public wp0(long j, String str, String str2, MessagingClientEvent$MessageType messagingClientEvent$MessageType, MessagingClientEvent$SDKPlatform messagingClientEvent$SDKPlatform, String str3, String str4, int i, int i2, String str5, MessagingClientEvent$Event messagingClientEvent$Event, String str6, String str7) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = messagingClientEvent$MessageType;
        this.e = messagingClientEvent$SDKPlatform;
        this.f = str3;
        this.g = str4;
        this.h = i;
        this.i = i2;
        this.j = str5;
        this.k = messagingClientEvent$Event;
        this.l = str6;
        this.m = str7;
    }
}
