package defpackage;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.concurrent.futures.b;
import com.google.android.gms.internal.ads.h7;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class f7 implements Runnable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;
    public final Object d;

    public /* synthetic */ f7(h7 h7Var, int i, ListenableFuture listenableFuture) {
        this.a = 5;
        this.c = h7Var;
        this.b = i;
        this.d = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        ArrayList arrayList;
        int iDecrementAndGet;
        int i = this.a;
        Object obj = this.d;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((TextView) obj2).setTypeface((Typeface) obj, i2);
                return;
            case 1:
                ((BottomSheetBehavior) obj).I((View) obj2, i2, false);
                return;
            case 2:
                ((dt) obj).b.g(i2, (Bundle) obj2);
                return;
            case 3:
                zk0 zk0Var = (zk0) obj;
                ListenableFuture listenableFuture = (ListenableFuture) obj2;
                boolean z = zk0Var.c;
                AtomicInteger atomicInteger = zk0Var.d;
                ArrayList arrayList2 = zk0Var.b;
                if (zk0Var.isDone() || arrayList2 == null) {
                    jx0.g("Future was done before all dependencies completed", z);
                    return;
                }
                try {
                    try {
                        try {
                            jx0.g("Tried to set value from future which is not done", listenableFuture.isDone());
                            arrayList2.set(i2, xg0.l(listenableFuture));
                            iDecrementAndGet = atomicInteger.decrementAndGet();
                            jx0.g("Less than 0 remaining futures", iDecrementAndGet >= 0);
                        } catch (Error e) {
                            zk0Var.f.d(e);
                            int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                            jx0.g("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
                            if (iDecrementAndGet2 == 0) {
                                ArrayList arrayList3 = zk0Var.b;
                                if (arrayList3 != null) {
                                    bVar = zk0Var.f;
                                    arrayList = new ArrayList(arrayList3);
                                }
                                jx0.g(null, zk0Var.isDone());
                                return;
                            }
                            return;
                        } catch (CancellationException unused) {
                            if (z) {
                                zk0Var.cancel(false);
                            }
                            int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                            jx0.g("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
                            if (iDecrementAndGet3 == 0) {
                                ArrayList arrayList4 = zk0Var.b;
                                if (arrayList4 != null) {
                                    bVar = zk0Var.f;
                                    arrayList = new ArrayList(arrayList4);
                                }
                                jx0.g(null, zk0Var.isDone());
                                return;
                            }
                            return;
                        }
                    } catch (RuntimeException e2) {
                        if (z) {
                            zk0Var.f.d(e2);
                        }
                        int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                        jx0.g("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
                        if (iDecrementAndGet4 == 0) {
                            ArrayList arrayList5 = zk0Var.b;
                            if (arrayList5 != null) {
                                bVar = zk0Var.f;
                                arrayList = new ArrayList(arrayList5);
                            }
                            jx0.g(null, zk0Var.isDone());
                            return;
                        }
                        return;
                    } catch (ExecutionException e3) {
                        if (z) {
                            zk0Var.f.d(e3.getCause());
                        }
                        int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                        jx0.g("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
                        if (iDecrementAndGet5 == 0) {
                            ArrayList arrayList6 = zk0Var.b;
                            if (arrayList6 != null) {
                                bVar = zk0Var.f;
                                arrayList = new ArrayList(arrayList6);
                            }
                            jx0.g(null, zk0Var.isDone());
                            return;
                        }
                        return;
                    }
                    if (iDecrementAndGet == 0) {
                        ArrayList arrayList7 = zk0Var.b;
                        if (arrayList7 != null) {
                            bVar = zk0Var.f;
                            arrayList = new ArrayList(arrayList7);
                            bVar.b(arrayList);
                            return;
                        }
                        jx0.g(null, zk0Var.isDone());
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                    jx0.g("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
                    if (iDecrementAndGet6 == 0) {
                        ArrayList arrayList8 = zk0Var.b;
                        if (arrayList8 != null) {
                            zk0Var.f.b(new ArrayList(arrayList8));
                        } else {
                            jx0.g(null, zk0Var.isDone());
                        }
                    }
                    throw th;
                }
            case 4:
                ((hd1) obj2).a(i2, (Intent) obj);
                return;
            default:
                ((h7) obj2).r(i2, (ListenableFuture) obj);
                return;
        }
    }

    public /* synthetic */ f7(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = i;
        this.c = obj2;
    }

    public /* synthetic */ f7(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public f7(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.a = 1;
        this.d = bottomSheetBehavior;
        this.c = view;
        this.b = i;
    }
}
