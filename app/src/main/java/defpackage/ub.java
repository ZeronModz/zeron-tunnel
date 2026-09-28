package defpackage;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.QosTier;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ub extends LogRequest {
    public final long a;
    public final long b;
    public final ClientInfo c;
    public final Integer d;
    public final String e;
    public final List f;
    public final QosTier g;

    public ub(long j, long j2, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier) {
        this.a = j;
        this.b = j2;
        this.c = clientInfo;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = qosTier;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final ClientInfo a() {
        return this.c;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final List b() {
        return this.f;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final Integer c() {
        return this.d;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final String d() {
        return this.e;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final QosTier e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogRequest)) {
            return false;
        }
        LogRequest logRequest = (LogRequest) obj;
        if (this.a != logRequest.f() || this.b != logRequest.g()) {
            return false;
        }
        ClientInfo clientInfo = this.c;
        if (clientInfo == null) {
            if (logRequest.a() != null) {
                return false;
            }
        } else if (!clientInfo.equals(logRequest.a())) {
            return false;
        }
        Integer num = this.d;
        if (num == null) {
            if (logRequest.c() != null) {
                return false;
            }
        } else if (!num.equals(logRequest.c())) {
            return false;
        }
        String str = this.e;
        if (str == null) {
            if (logRequest.d() != null) {
                return false;
            }
        } else if (!str.equals(logRequest.d())) {
            return false;
        }
        List list = this.f;
        if (list == null) {
            if (logRequest.b() != null) {
                return false;
            }
        } else if (!list.equals(logRequest.b())) {
            return false;
        }
        QosTier qosTier = this.g;
        return qosTier == null ? logRequest.e() == null : qosTier.equals(logRequest.e());
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final long f() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final long g() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        ClientInfo clientInfo = this.c;
        int iHashCode = (i ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.g;
        return iHashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
