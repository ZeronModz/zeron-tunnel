package defpackage;

import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ya extends CrashlyticsReportWithSessionId {
    public final CrashlyticsReport a;
    public final String b;
    public final File c;

    public ya(CrashlyticsReport crashlyticsReport, String str, File file) {
        if (crashlyticsReport == null) {
            io0.e("Null report");
            throw null;
        }
        this.a = crashlyticsReport;
        if (str == null) {
            io0.e("Null sessionId");
            throw null;
        }
        this.b = str;
        if (file != null) {
            this.c = file;
        } else {
            io0.e("Null reportFile");
            throw null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public final CrashlyticsReport a() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public final File b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReportWithSessionId)) {
            return false;
        }
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj;
        return this.a.equals(crashlyticsReportWithSessionId.a()) && this.b.equals(crashlyticsReportWithSessionId.c()) && this.c.equals(crashlyticsReportWithSessionId.b());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
