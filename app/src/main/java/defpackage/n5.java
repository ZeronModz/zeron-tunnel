package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import com.sandok.tunnel.service.InjectorService;
import java.nio.file.FileSystemLoopException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class n5 {
    public static /* synthetic */ Notification.Builder a(InjectorService injectorService) {
        return new Notification.Builder(injectorService, InjectorService.NOTIFICATION_CHANNEL_ID);
    }

    public static /* synthetic */ NotificationChannel b() {
        return new NotificationChannel("subscription_update_channel", "Subscription Update Service", 1);
    }

    public static /* synthetic */ OutputConfiguration c(Size size, Class cls) {
        return new OutputConfiguration(size, cls);
    }

    public static /* synthetic */ FileSystemLoopException d(String str) {
        return new FileSystemLoopException(str);
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void f() {
    }
}
