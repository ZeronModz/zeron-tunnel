package defpackage;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.zaad;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fs1 implements PendingResult.StatusListener {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ zaad b;

    public fs1(zaad zaadVar, BasePendingResult basePendingResult) {
        this.b = zaadVar;
        this.a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        this.b.a.remove(this.a);
    }
}
