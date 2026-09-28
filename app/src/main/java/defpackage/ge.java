package defpackage;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ge implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            message.obj.getClass();
            u7.q();
            return false;
        }
        if (i != 1) {
            return false;
        }
        message.obj.getClass();
        u7.q();
        return false;
    }
}
