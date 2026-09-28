package defpackage;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class cr1 extends Binder {
    public final a a;

    public cr1(a aVar) {
        this.a = aVar;
    }

    public final void a(dr1 dr1Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Log.isLoggable("FirebaseMessaging", 3);
        this.a.handle(dr1Var.a).b(new s3(0), new q21(dr1Var, 9));
    }
}
