package defpackage;

import android.adservices.adselection.GetAdSelectionDataRequest;
import android.adservices.adselection.ReportEventRequest;
import android.adservices.adselection.ReportImpressionRequest;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class r3 {
    public static /* synthetic */ GetAdSelectionDataRequest.Builder a() {
        return new GetAdSelectionDataRequest.Builder();
    }

    public static /* synthetic */ ReportEventRequest.Builder b(long j, String str, String str2, int i) {
        return new ReportEventRequest.Builder(j, str, str2, i);
    }

    public static /* synthetic */ ReportImpressionRequest c(long j) {
        return new ReportImpressionRequest(j);
    }

    public static /* synthetic */ void d() {
    }
}
