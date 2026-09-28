package defpackage;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzu;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class l92 extends Thread {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public l92(zzf zzfVar, Context context, String str) {
        this.b = context;
        this.c = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                new zzu((Context) obj, null).zzc((String) obj2, null);
                break;
            default:
                Process.setThreadPriority(((gc2) obj2).b);
                ((Runnable) obj).run();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l92(gc2 gc2Var, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.b = runnable2;
        this.c = gc2Var;
    }
}
