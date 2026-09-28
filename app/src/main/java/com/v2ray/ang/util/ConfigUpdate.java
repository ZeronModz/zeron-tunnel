package com.v2ray.ang.util;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hv;
import defpackage.lv;
import defpackage.oy;
import defpackage.zq0;
import defpackage.zr;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.c;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/v2ray/ang/util/ConfigUpdate;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcom/v2ray/ang/util/ConfigUpdate$UpdateAvailable;", "onUpdate", "<init>", "(Lcom/v2ray/ang/util/ConfigUpdate$UpdateAvailable;)V", "UpdateAvailable", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConfigUpdate {
    public final UpdateAvailable a;
    public boolean b;
    public final ContextScope c;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/v2ray/ang/util/ConfigUpdate$UpdateAvailable;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lmk1;", "onUpdateAvailable", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface UpdateAvailable {
        void onUpdateAvailable();
    }

    public ConfigUpdate(UpdateAvailable updateAvailable) {
        updateAvailable.getClass();
        this.a = updateAvailable;
        Job jobC = kotlinx.coroutines.a.c();
        lv lvVar = oy.a;
        this.c = zr.a(kotlin.coroutines.b.d(hv.c, (JobSupport) jobC));
    }

    public final void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        Lazy lazy = zq0.a;
        String strD = zq0.u().d("CurrentConfigVersion");
        if (strD == null) {
            strD = "1.01";
        }
        c.d(this.c, null, null, new ConfigUpdate$configUpdate$1(strD, this, null), 3);
    }
}
