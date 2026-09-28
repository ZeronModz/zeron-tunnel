package defpackage;

import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;
import androidx.core.content.UnusedAppRestrictionsBackportCallback;
import androidx.core.content.UnusedAppRestrictionsBackportService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fl1 extends IUnusedAppRestrictionsBackportService.Stub {
    public final /* synthetic */ UnusedAppRestrictionsBackportService a;

    public fl1(UnusedAppRestrictionsBackportService unusedAppRestrictionsBackportService) {
        this.a = unusedAppRestrictionsBackportService;
    }

    @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
    public final void isPermissionRevocationEnabledForApp(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
        if (iUnusedAppRestrictionsBackportCallback == null) {
            return;
        }
        new UnusedAppRestrictionsBackportCallback(iUnusedAppRestrictionsBackportCallback);
        this.a.a();
    }
}
