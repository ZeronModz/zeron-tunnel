package defpackage;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import androidx.concurrent.futures.b;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z02 implements PackageManager$OnChecksumsReadyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z02(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onChecksumsReady(List list) {
        int size;
        int i = this.a;
        Object obj = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                b43 b43Var = (b43) obj;
                if (list == null) {
                    b43Var.c(null);
                } else {
                    try {
                        int size2 = list.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            ApkChecksum apkChecksumB = zg1.b(list.get(i3));
                            if (apkChecksumB.getType() == 8) {
                                byte[] value = apkChecksumB.getValue();
                                int length = value.length;
                                char[] cArr = new char[length + length];
                                while (i2 < value.length) {
                                    byte b = value[i2];
                                    char[] cArr2 = l02.e;
                                    int i4 = i2 + i2;
                                    cArr[i4] = cArr2[(b & 255) >>> 4];
                                    cArr[i4 + 1] = cArr2[b & 15];
                                    i2++;
                                }
                                b43Var.c(new String(cArr));
                            }
                            break;
                        }
                        b43Var.c(null);
                    } catch (Throwable unused) {
                        b43Var.c(null);
                        return;
                    }
                }
                break;
            default:
                b bVar = (b) obj;
                if (list == null) {
                    bVar.b(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                } else {
                    try {
                        size = list.size();
                    } catch (Throwable unused2) {
                    }
                    while (i2 < size) {
                        ApkChecksum apkChecksumB2 = zg1.b(list.get(i2));
                        if (apkChecksumB2.getType() == 8) {
                            n23 n23VarF = n23.f.f();
                            byte[] value2 = apkChecksumB2.getValue();
                            bVar.b(n23VarF.g(value2.length, value2));
                        } else {
                            i2++;
                        }
                        bVar.b(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        break;
                    }
                    bVar.b(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                }
                break;
        }
    }
}
