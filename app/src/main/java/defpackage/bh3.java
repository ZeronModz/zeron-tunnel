package defpackage;

import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.appupdate.internal.zzn;
import com.google.android.play.core.appupdate.internal.zzx;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class bh3 extends zzn {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh3(xj3 xj3Var, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.b = 0;
        this.e = xj3Var;
        this.d = str;
        this.c = taskCompletionSource2;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzn
    public final void a() {
        switch (this.b) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.c;
                xj3 xj3Var = (xj3) this.e;
                String str = (String) this.d;
                try {
                    xj3Var.a.m.zzd(xj3Var.b, xj3.a(xj3Var, str), new mj3(xj3Var, taskCompletionSource, str));
                    return;
                } catch (RemoteException e) {
                    xj3.e.b(e, "requestUpdateInfo(%s)", str);
                    taskCompletionSource.c(new RuntimeException(e));
                    return;
                }
            case 1:
                TaskCompletionSource taskCompletionSource2 = this.c;
                xj3 xj3Var2 = (xj3) this.e;
                try {
                    xj3Var2.a.m.zzc(xj3Var2.b, xj3.b(), new si3(xj3Var2, new zzm("OnCompleteUpdateCallback"), taskCompletionSource2));
                    return;
                } catch (RemoteException e2) {
                    xj3.e.b(e2, "completeUpdate(%s)", (String) this.d);
                    taskCompletionSource2.c(new RuntimeException(e2));
                    return;
                }
            default:
                synchronized (((zzx) this.e).f) {
                    try {
                        final zzx zzxVar = (zzx) this.e;
                        final TaskCompletionSource taskCompletionSource3 = this.c;
                        zzxVar.e.add(taskCompletionSource3);
                        taskCompletionSource3.a.o(new OnCompleteListener() { // from class: com.google.android.play.core.appupdate.internal.zzo
                            @Override // com.google.android.gms.tasks.OnCompleteListener
                            public final void onComplete(Task task) {
                                zzx zzxVar2 = zzxVar;
                                TaskCompletionSource taskCompletionSource4 = taskCompletionSource3;
                                synchronized (zzxVar2.f) {
                                    zzxVar2.e.remove(taskCompletionSource4);
                                }
                            }
                        });
                        if (((zzx) this.e).k.getAndIncrement() > 0) {
                            ((zzx) this.e).b.c("Already connected to the service.", new Object[0]);
                        }
                        zzx.b((zzx) this.e, (zzn) this.d);
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bh3(Object obj, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, Object obj2, int i) {
        super(taskCompletionSource);
        this.b = i;
        this.e = obj;
        this.c = taskCompletionSource2;
        this.d = obj2;
    }
}
