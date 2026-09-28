package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import coil3.EventListener;
import coil3.request.ImageRequest;
import com.google.android.datatransport.Transformer;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent$VersionExtractor;
import com.google.firebase.sessions.EventGDTLogger;
import com.google.firebase.sessions.SessionEvent;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.security.spec.InvalidParameterSpecException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hy implements Transformer, EventListener.Factory, ComponentFactory, Continuation, LibraryVersionComponent$VersionExtractor, OnFailureListener {
    public final /* synthetic */ int a;

    public static /* bridge */ /* synthetic */ FileVisitResult b(Object obj) {
        return (FileVisitResult) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(int i, String str) {
        throw new IllegalArgumentException(str + ((char) i));
    }

    public static /* synthetic */ void e(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void g(Object obj, String str) throws InvalidParameterSpecException {
        throw new InvalidParameterSpecException(str + obj);
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        SessionEvent sessionEvent = (SessionEvent) obj;
        int i = EventGDTLogger.b;
        String strEncode = z61.b.encode(sessionEvent);
        strEncode.getClass();
        sessionEvent.a.name();
        byte[] bytes = strEncode.getBytes(xm.a);
        bytes.getClass();
        return bytes;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object create(ComponentContainer componentContainer) {
        switch (this.a) {
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 17:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 18:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 19:
                Lazy lazy = ExecutorsRegistrar.a;
                return UiExecutor.INSTANCE;
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
        }
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent$VersionExtractor
    public String extract(Object obj) {
        Context context = (Context) obj;
        switch (this.a) {
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                return FirebaseCommonRegistrar.a(context);
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "embedded";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.b(installerPackageName) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Logger.b.b();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i;
        switch (this.a) {
            case 20:
                i = TypedValues.CycleType.TYPE_ALPHA;
                break;
            default:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }

    public /* synthetic */ hy(int i) {
        this.a = i;
    }

    @Override // coil3.EventListener.Factory
    public EventListener create(ImageRequest imageRequest) {
        int i = j30.a;
        return EventListener.a;
    }
}
