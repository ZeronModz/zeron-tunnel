package defpackage;

import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.ExperimentIds;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class tb extends LogEvent {
    public final long a;
    public final Integer b;
    public final ComplianceData c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final NetworkConnectionInfo h;
    public final ExperimentIds i;

    public tb(long j, Integer num, ComplianceData complianceData, long j2, byte[] bArr, String str, long j3, NetworkConnectionInfo networkConnectionInfo, ExperimentIds experimentIds) {
        this.a = j;
        this.b = num;
        this.c = complianceData;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = networkConnectionInfo;
        this.i = experimentIds;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final ComplianceData a() {
        return this.c;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final Integer b() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final long c() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final long d() {
        return this.d;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final ExperimentIds e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogEvent)) {
            return false;
        }
        LogEvent logEvent = (LogEvent) obj;
        if (this.a != logEvent.c()) {
            return false;
        }
        Integer num = this.b;
        if (num == null) {
            if (logEvent.b() != null) {
                return false;
            }
        } else if (!num.equals(logEvent.b())) {
            return false;
        }
        ComplianceData complianceData = this.c;
        if (complianceData == null) {
            if (logEvent.a() != null) {
                return false;
            }
        } else if (!complianceData.equals(logEvent.a())) {
            return false;
        }
        if (this.d != logEvent.d()) {
            return false;
        }
        if (!Arrays.equals(this.e, logEvent instanceof tb ? ((tb) logEvent).e : logEvent.g())) {
            return false;
        }
        String str = this.f;
        if (str == null) {
            if (logEvent.h() != null) {
                return false;
            }
        } else if (!str.equals(logEvent.h())) {
            return false;
        }
        if (this.g != logEvent.i()) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = this.h;
        if (networkConnectionInfo == null) {
            if (logEvent.f() != null) {
                return false;
            }
        } else if (!networkConnectionInfo.equals(logEvent.f())) {
            return false;
        }
        ExperimentIds experimentIds = this.i;
        return experimentIds == null ? logEvent.e() == null : experimentIds.equals(logEvent.e());
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final NetworkConnectionInfo f() {
        return this.h;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final byte[] g() {
        return this.e;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        ComplianceData complianceData = this.c;
        int iHashCode2 = (iHashCode ^ (complianceData == null ? 0 : complianceData.hashCode())) * 1000003;
        long j2 = this.d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (iHashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.h;
        int iHashCode5 = (i2 ^ (networkConnectionInfo == null ? 0 : networkConnectionInfo.hashCode())) * 1000003;
        ExperimentIds experimentIds = this.i;
        return iHashCode5 ^ (experimentIds != null ? experimentIds.hashCode() : 0);
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final long i() {
        return this.g;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
