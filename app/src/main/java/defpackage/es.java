package defpackage;

import android.util.Size;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class es implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ es(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 1:
                Charset charset = CrashlyticsReportPersistence.e;
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 2:
                Charset charset2 = CrashlyticsReportPersistence.e;
                String name = ((File) obj).getName();
                int i = CrashlyticsReportPersistence.f;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            case 3:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    byte b = bArr[i2];
                    byte b2 = bArr2[i2];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 4:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            case 5:
                return ((xa) ((jq) obj)).a.compareTo(((xa) ((jq) obj2)).a);
            case 6:
                return ((CrashlyticsReport.CustomAttribute) obj).a().compareTo(((CrashlyticsReport.CustomAttribute) obj2).a());
            default:
                return ((Double) obj).compareTo((Double) obj2);
        }
    }
}
