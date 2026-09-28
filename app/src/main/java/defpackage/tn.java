package defpackage;

import com.v2ray.ang.util.ClientSocketHandler;
import java.net.Socket;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class tn extends Thread {
    public final /* synthetic */ int a;
    public final /* synthetic */ Socket b;
    public final /* synthetic */ ClientSocketHandler c;

    public /* synthetic */ tn(ClientSocketHandler clientSocketHandler, Socket socket, int i) {
        this.a = i;
        this.c = clientSocketHandler;
        this.b = socket;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i = this.a;
        ClientSocketHandler clientSocketHandler = this.c;
        Socket socket = this.b;
        switch (i) {
            case 0:
                ClientSocketHandler.c(socket, clientSocketHandler.a);
                break;
            default:
                ClientSocketHandler.c(socket, clientSocketHandler.a);
                break;
        }
    }
}
