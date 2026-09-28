package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbdy;
import com.google.android.gms.internal.ads.zzfyn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class l12 implements Application.ActivityLifecycleCallbacks {
    public Activity a;
    public Application b;
    public vn1 h;
    public long j;
    public final Object c = new Object();
    public final AtomicBoolean d = new AtomicBoolean(true);
    public boolean e = false;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public boolean i = false;

    public final void a(zzbdy zzbdyVar) {
        synchronized (this.c) {
            this.f.add(zzbdyVar);
        }
    }

    public final void b(zzbdy zzbdyVar) {
        synchronized (this.c) {
            this.f.remove(zzbdyVar);
        }
    }

    public final void c(ml2 ml2Var) {
        synchronized (this.c) {
            this.g.add(ml2Var);
        }
    }

    public final void d(Activity activity) {
        synchronized (this.c) {
            try {
                if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                    this.a = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.c) {
            try {
                Activity activity2 = this.a;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.a = null;
                }
                for (ml2 ml2Var : this.g) {
                    try {
                        if (ml2Var.b.getAndSet(false)) {
                            ml2Var.a.zzf();
                        }
                    } catch (Exception e) {
                        zzt.zzh().f("AppActivityTracker.ActivityListener.onActivityDestroyed", e);
                        zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        d(activity);
        synchronized (this.c) {
            try {
                for (ml2 ml2Var : this.g) {
                    try {
                        if (ml2Var.b.get()) {
                            ml2Var.a.zzc();
                        }
                    } catch (Exception e) {
                        zzt.zzh().f("AppActivityTracker.ActivityListener.onActivityPaused", e);
                        zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e = true;
        vn1 vn1Var = this.h;
        if (vn1Var != null) {
            zzs.zza.removeCallbacks(vn1Var);
        }
        zzfyn zzfynVar = zzs.zza;
        vn1 vn1Var2 = new vn1(this, 12);
        this.h = vn1Var2;
        zzfynVar.postDelayed(vn1Var2, this.j);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(activity);
        this.e = false;
        boolean andSet = this.d.getAndSet(true);
        vn1 vn1Var = this.h;
        if (vn1Var != null) {
            zzs.zza.removeCallbacks(vn1Var);
        }
        synchronized (this.c) {
            try {
                for (ml2 ml2Var : this.g) {
                    try {
                        if (ml2Var.b.get()) {
                            ml2Var.a.zzd();
                        }
                    } catch (Exception e) {
                        zzt.zzh().f("AppActivityTracker.ActivityListener.onActivityResumed", e);
                        zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                    }
                }
                if (andSet) {
                    zzo.zzd("App is still foreground.");
                } else {
                    Iterator it = this.f.iterator();
                    while (it.hasNext()) {
                        try {
                            ((zzbdy) it.next()).zza(true);
                        } catch (Exception e2) {
                            zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        d(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
