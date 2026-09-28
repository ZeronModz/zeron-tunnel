package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcx;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbtt;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gu2 {
    public static gu2 d;
    public final Context a;
    public final zzcy b;
    public final AtomicReference c = new AtomicReference();

    public gu2(Context context, zzcy zzcyVar) {
        this.a = context;
        this.b = zzcyVar;
    }

    public static gu2 a(Context context) {
        synchronized (gu2.class) {
            try {
                gu2 gu2Var = d;
                if (gu2Var != null) {
                    return gu2Var;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) l42.b.g()).longValue();
                zzcy zzcyVarAsInterface = null;
                if (jLongValue > 0 && jLongValue <= 254715000) {
                    try {
                        zzcyVarAsInterface = zzcx.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                        zzo.zzg("Failed to retrieve lite SDK info.", e);
                    }
                }
                gu2 gu2Var2 = new gu2(applicationContext, zzcyVarAsInterface);
                d = gu2Var2;
                return gu2Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(zzbtt zzbttVar) {
        zzbtt adapterCreator;
        boolean zBooleanValue = ((Boolean) l42.a.g()).booleanValue();
        AtomicReference atomicReference = this.c;
        if (!zBooleanValue) {
            while (!atomicReference.compareAndSet(null, zzbttVar) && atomicReference.get() == null) {
            }
            return;
        }
        zzcy zzcyVar = this.b;
        if (zzcyVar == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = zzcyVar.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        if (adapterCreator == null) {
            adapterCreator = zzbttVar;
        }
        while (!atomicReference.compareAndSet(null, adapterCreator) && atomicReference.get() == null) {
        }
    }
}
