package defpackage;

import com.google.firebase.heartbeatinfo.HeartBeatResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class lb extends HeartBeatResult {
    public final String a;
    public final ArrayList b;

    public lb(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public final List a() {
        return this.b;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeartBeatResult)) {
            return false;
        }
        HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
        return this.a.equals(heartBeatResult.b()) && this.b.equals(heartBeatResult.a());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
