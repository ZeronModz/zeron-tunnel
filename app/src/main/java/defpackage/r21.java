package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r21 {
    private final String zza;
    private Object zzb;

    public r21(String str) {
        this.zza = str;
    }

    public abstract Object getRemoteCreator(IBinder iBinder);

    public final Object getRemoteCreatorInstance(Context context) throws RemoteCreator$RemoteCreatorException {
        Context contextCreatePackageContext;
        Object obj = this.zzb;
        if (obj != null) {
            return obj;
        }
        yg0.m(context);
        int i = yb0.e;
        try {
            contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            contextCreatePackageContext = null;
        }
        if (contextCreatePackageContext == null) {
            throw new RemoteCreator$RemoteCreatorException("Could not get remote context.");
        }
        try {
            Object remoteCreator = getRemoteCreator((IBinder) contextCreatePackageContext.getClassLoader().loadClass(this.zza).newInstance());
            this.zzb = remoteCreator;
            return remoteCreator;
        } catch (ClassNotFoundException e) {
            throw new RemoteCreator$RemoteCreatorException("Could not load creator class.", e);
        } catch (IllegalAccessException e2) {
            throw new RemoteCreator$RemoteCreatorException("Could not access creator.", e2);
        } catch (InstantiationException e3) {
            throw new RemoteCreator$RemoteCreatorException("Could not instantiate creator.", e3);
        }
    }
}
