package defpackage;

import android.os.IBinder;
import com.google.android.gms.internal.ads.zzgqg;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.coroutines.SafeContinuation;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class s21 implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s21(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.a) {
            case 0:
                SafeContinuation safeContinuation = (SafeContinuation) this.b;
                Result.Companion companion = Result.INSTANCE;
                safeContinuation.resumeWith(Result.m36constructorimpl(new Result.Failure(new RuntimeException("Binder died"))));
                return;
            default:
                lp2 lp2Var = (lp2) this.b;
                ((zzgqg) lp2Var.d).a("%s : Binder has died.", "OverlayDisplayService");
                ArrayList arrayList = (ArrayList) lp2Var.e;
                synchronized (arrayList) {
                    arrayList.clear();
                    break;
                }
                return;
        }
    }
}
