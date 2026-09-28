package defpackage;

import com.google.android.play.core.appupdate.AppUpdateOptions;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class hl3 extends AppUpdateOptions {
    public final int a;

    public /* synthetic */ hl3(int i) {
        this.a = i;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions
    public final boolean a() {
        return false;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppUpdateOptions)) {
            return false;
        }
        AppUpdateOptions appUpdateOptions = (AppUpdateOptions) obj;
        return this.a == appUpdateOptions.b() && !appUpdateOptions.a();
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return hz.p(this.a, "AppUpdateOptions{appUpdateType=", ", allowAssetPackDeletion=false}");
    }
}
