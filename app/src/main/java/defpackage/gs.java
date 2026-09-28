package defpackage;

import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.settings.d;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CrashlyticsCore b;
    public final /* synthetic */ d c;

    public /* synthetic */ gs(CrashlyticsCore crashlyticsCore, d dVar, int i) {
        this.a = i;
        this.b = crashlyticsCore;
        this.c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        d dVar = this.c;
        CrashlyticsCore crashlyticsCore = this.b;
        switch (i) {
            case 0:
                crashlyticsCore.a(dVar);
                break;
            default:
                crashlyticsCore.a(dVar);
                break;
        }
    }
}
