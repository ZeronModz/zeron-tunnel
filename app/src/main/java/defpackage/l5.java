package defpackage;

import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioRecord;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l5 {
    public static int[] a(NetworkRequest networkRequest) {
        networkRequest.getClass();
        int[] capabilities = networkRequest.getCapabilities();
        capabilities.getClass();
        return capabilities;
    }

    public static EncoderProfiles b(int i, String str) {
        return CamcorderProfile.getAll(str, i);
    }

    public static int c(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        int i = SystemJobService.e;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static boolean d(Notification.Action action) {
        return action.isAuthenticationRequired();
    }

    public static void e(Notification.Action.Builder builder, boolean z) {
        builder.setAuthenticationRequired(z);
    }

    public static void f(AudioRecord.Builder builder, Context context) {
        builder.setContext(context);
    }

    public static int[] g(NetworkRequest networkRequest) {
        networkRequest.getClass();
        int[] transportTypes = networkRequest.getTransportTypes();
        transportTypes.getClass();
        return transportTypes;
    }

    public static String h(Context context, String str, ArrayList arrayList) throws PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        b43 b43Var = new b43();
        context.getPackageManager().requestChecksums(str, false, 8, arrayList, new z02(b43Var, 0));
        return (String) b43Var.get();
    }
}
