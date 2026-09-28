package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.TrafficStats;
import androidx.webkit.internal.JavaScriptReplyProxyImpl;
import androidx.webkit.internal.WebViewRenderProcessImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;
import androidx.work.impl.utils.IdGenerator;
import com.google.firebase.a;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.c;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.local.b;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k60 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k60(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws FirebaseInstallationsException {
        int responseCode;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                c cVar = (c) obj;
                a aVar = cVar.a;
                cVar.k(null);
                PersistedInstallationEntry persistedInstallationEntryD = cVar.d();
                if (persistedInstallationEntryD.f() == PersistedInstallation.RegistrationStatus.REGISTERED) {
                    FirebaseInstallationServiceClient firebaseInstallationServiceClient = cVar.b;
                    aVar.a();
                    String str = aVar.c.a;
                    b bVar = (b) persistedInstallationEntryD;
                    String str2 = bVar.b;
                    aVar.a();
                    String str3 = aVar.c.g;
                    String str4 = bVar.e;
                    URL urlA = FirebaseInstallationServiceClient.a("projects/" + str3 + "/installations/" + str2);
                    while (i <= 1) {
                        TrafficStats.setThreadStatsTag(32770);
                        HttpURLConnection httpURLConnectionC = firebaseInstallationServiceClient.c(urlA, str);
                        try {
                            httpURLConnectionC.setRequestMethod("DELETE");
                            httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                            responseCode = httpURLConnectionC.getResponseCode();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            throw th;
                        }
                        if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                            FirebaseInstallationServiceClient.b(httpURLConnectionC, null);
                            if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                                throw new FirebaseInstallationsException("Bad config while trying to delete FID", FirebaseInstallationsException.Status.BAD_CONFIG);
                            }
                            i++;
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
                }
                com.google.firebase.installations.local.a aVarH = persistedInstallationEntryD.h();
                aVarH.c(PersistedInstallation.RegistrationStatus.NOT_GENERATED);
                cVar.e(aVarH.a());
                return null;
            case 1:
                WorkDatabase workDatabase = ((IdGenerator) obj).a;
                Long longValue = workDatabase.r().getLongValue("next_alarm_manager_id");
                int iLongValue = longValue != null ? (int) longValue.longValue() : 0;
                workDatabase.r().insertPreference(new Preference("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            case 2:
                return new JavaScriptReplyProxyImpl((JsReplyProxyBoundaryInterface) obj);
            case 3:
                return (AssetFileDescriptor) obj;
            default:
                return new WebViewRenderProcessImpl((WebViewRendererBoundaryInterface) obj);
        }
    }
}
