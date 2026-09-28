package defpackage;

import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dk0 {
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayDeque d = new ArrayDeque();
    public CameraCoordinator e;

    public final void a(ak0 ak0Var, io1 io1Var, List list, List list2, CameraCoordinator cameraCoordinator) {
        synchronized (this.a) {
            try {
                jx0.a(!list2.isEmpty());
                this.e = cameraCoordinator;
                LifecycleOwner lifecycleOwnerB = ak0Var.b();
                ck0 ck0VarC = c(lifecycleOwnerB);
                if (ck0VarC == null) {
                    return;
                }
                Set set = (Set) this.c.get(ck0VarC);
                CameraCoordinator cameraCoordinator2 = this.e;
                if (cameraCoordinator2 == null || cameraCoordinator2.getCameraOperatingMode() != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ak0 ak0Var2 = (ak0) this.b.get((bk0) it.next());
                        ak0Var2.getClass();
                        if (!ak0Var2.equals(ak0Var) && !ak0Var2.c().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    ak0Var.c.x(io1Var);
                    ak0Var.c.v(list);
                    ak0Var.a(list2);
                    if (lifecycleOwnerB.getLifecycle().getD().isAtLeast(Lifecycle.State.STARTED)) {
                        g(lifecycleOwnerB);
                    }
                } catch (CameraUseCaseAdapter.CameraException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ak0 b(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter) {
        synchronized (this.a) {
            try {
                jx0.b(this.b.get(new sb(lifecycleOwner, cameraUseCaseAdapter.e)) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                ak0 ak0Var = new ak0(lifecycleOwner, cameraUseCaseAdapter);
                if (((ArrayList) cameraUseCaseAdapter.n()).isEmpty()) {
                    ak0Var.e();
                }
                if (lifecycleOwner.getLifecycle().getD() == Lifecycle.State.DESTROYED) {
                    return ak0Var;
                }
                f(ak0Var);
                return ak0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ck0 c(LifecycleOwner lifecycleOwner) {
        synchronized (this.a) {
            try {
                for (ck0 ck0Var : this.c.keySet()) {
                    if (lifecycleOwner.equals(ck0Var.b)) {
                        return ck0Var;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Collection d() {
        Collection collectionUnmodifiableCollection;
        synchronized (this.a) {
            collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(this.b.values());
        }
        return collectionUnmodifiableCollection;
    }

    public final boolean e(LifecycleOwner lifecycleOwner) {
        synchronized (this.a) {
            try {
                ck0 ck0VarC = c(lifecycleOwner);
                if (ck0VarC == null) {
                    return false;
                }
                Iterator it = ((Set) this.c.get(ck0VarC)).iterator();
                while (it.hasNext()) {
                    ak0 ak0Var = (ak0) this.b.get((bk0) it.next());
                    ak0Var.getClass();
                    if (!ak0Var.c().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(ak0 ak0Var) {
        synchronized (this.a) {
            try {
                LifecycleOwner lifecycleOwnerB = ak0Var.b();
                CameraUseCaseAdapter cameraUseCaseAdapter = ak0Var.c;
                sb sbVar = new sb(lifecycleOwnerB, CameraUseCaseAdapter.j(cameraUseCaseAdapter.r, cameraUseCaseAdapter.s));
                ck0 ck0VarC = c(lifecycleOwnerB);
                Set hashSet = ck0VarC != null ? (Set) this.c.get(ck0VarC) : new HashSet();
                hashSet.add(sbVar);
                this.b.put(sbVar, ak0Var);
                if (ck0VarC == null) {
                    ck0 ck0Var = new ck0(lifecycleOwnerB, this);
                    this.c.put(ck0Var, hashSet);
                    lifecycleOwnerB.getLifecycle().a(ck0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(LifecycleOwner lifecycleOwner) {
        synchronized (this.a) {
            try {
                if (e(lifecycleOwner)) {
                    if (this.d.isEmpty()) {
                        this.d.push(lifecycleOwner);
                    } else {
                        CameraCoordinator cameraCoordinator = this.e;
                        if (cameraCoordinator == null || cameraCoordinator.getCameraOperatingMode() != 2) {
                            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) this.d.peek();
                            if (!lifecycleOwner.equals(lifecycleOwner2)) {
                                i(lifecycleOwner2);
                                this.d.remove(lifecycleOwner);
                                this.d.push(lifecycleOwner);
                            }
                        }
                    }
                    m(lifecycleOwner);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(LifecycleOwner lifecycleOwner) {
        synchronized (this.a) {
            try {
                this.d.remove(lifecycleOwner);
                i(lifecycleOwner);
                if (!this.d.isEmpty()) {
                    m((LifecycleOwner) this.d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(LifecycleOwner lifecycleOwner) {
        synchronized (this.a) {
            try {
                ck0 ck0VarC = c(lifecycleOwner);
                if (ck0VarC == null) {
                    return;
                }
                Iterator it = ((Set) this.c.get(ck0VarC)).iterator();
                while (it.hasNext()) {
                    ak0 ak0Var = (ak0) this.b.get((bk0) it.next());
                    ak0Var.getClass();
                    ak0Var.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(List list) {
        synchronized (this.a) {
            try {
                Iterator it = this.b.keySet().iterator();
                while (it.hasNext()) {
                    ak0 ak0Var = (ak0) this.b.get((bk0) it.next());
                    boolean zIsEmpty = ak0Var.c().isEmpty();
                    ak0Var.f(list);
                    if (!zIsEmpty && ak0Var.c().isEmpty()) {
                        h(ak0Var.b());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (this.a) {
            try {
                Iterator it = this.b.keySet().iterator();
                while (it.hasNext()) {
                    ak0 ak0Var = (ak0) this.b.get((bk0) it.next());
                    ak0Var.g();
                    h(ak0Var.b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(LifecycleOwner lifecycleOwner) {
        synchronized (this.a) {
            try {
                ck0 ck0VarC = c(lifecycleOwner);
                if (ck0VarC == null) {
                    return;
                }
                h(lifecycleOwner);
                Iterator it = ((Set) this.c.get(ck0VarC)).iterator();
                while (it.hasNext()) {
                    this.b.remove((bk0) it.next());
                }
                this.c.remove(ck0VarC);
                ck0VarC.b.getLifecycle().c(ck0VarC);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(LifecycleOwner lifecycleOwner) {
        synchronized (this.a) {
            try {
                Iterator it = ((Set) this.c.get(c(lifecycleOwner))).iterator();
                while (it.hasNext()) {
                    ak0 ak0Var = (ak0) this.b.get((bk0) it.next());
                    ak0Var.getClass();
                    if (!ak0Var.c().isEmpty()) {
                        ak0Var.h();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
