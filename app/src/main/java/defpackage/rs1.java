package defpackage;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class rs1 extends zau {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rs1(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                zabe zabeVar = (zabe) this.b;
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    zabe.c(zabeVar);
                    return;
                }
                Lock lock = zabeVar.a;
                lock.lock();
                try {
                    if (zabeVar.d()) {
                        zabeVar.b.e = true;
                        yg0.m(null);
                        throw null;
                    }
                    return;
                } finally {
                    lock.unlock();
                }
            default:
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 == 2) {
                        throw ((RuntimeException) message.obj);
                    }
                    return;
                }
                ts1 ts1Var = (ts1) message.obj;
                zabi zabiVar = (zabi) this.b;
                ts1Var.getClass();
                zabiVar.a.lock();
                try {
                    if (zabiVar.k == ts1Var.a) {
                        ts1Var.a();
                        break;
                    }
                    return;
                } finally {
                    zabiVar.a.unlock();
                }
        }
    }
}
