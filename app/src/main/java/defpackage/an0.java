package defpackage;

import android.os.AsyncTask;
import java.net.ServerSocket;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class an0 extends AsyncTask {
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            new ServerSocket(((Integer[]) objArr)[0].intValue()).close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }
}
