package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.ads.zzba;
import com.google.android.gms.internal.ads.zzdr;
import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zzmy;
import com.google.android.gms.internal.ads.zzna;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwg;
import com.google.android.gms.internal.ads.zzwu;
import com.google.android.gms.internal.ads.zzwv;
import com.google.android.gms.tasks.g;
import com.google.zxing.ResultPoint;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Formatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zk3 implements zzdy, zzdr {
    public static zk3 f;
    public static zk3 g;
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public zk3(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.a = 0;
        this.e = new ui3(this);
        this.b = 1;
        this.d = scheduledExecutorService;
        this.c = context.getApplicationContext();
    }

    public static synchronized zk3 e(Context context) {
        zk3 zk3Var;
        zk3Var = f;
        if (zk3Var == null) {
            zk3Var = new zk3(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            f = zk3Var;
        }
        return zk3Var;
    }

    public void a(y6 y6Var) {
        if (y6Var != null) {
            ix ixVar = (ix) y6Var;
            qd qdVar = (qd) this.c;
            qd[] qdVarArr = (qd[]) ixVar.c;
            for (qd qdVar2 : qdVarArr) {
                if (qdVar2 != null) {
                    qdVar2.c();
                }
            }
            ixVar.B(qdVarArr, qdVar);
            pf pfVar = (pf) ixVar.b;
            boolean z = ixVar.f;
            ResultPoint resultPoint = z ? pfVar.b : pfVar.d;
            ResultPoint resultPoint2 = z ? pfVar.c : pfVar.e;
            int iM = ixVar.m((int) resultPoint.b);
            int iM2 = ixVar.m((int) resultPoint2.b);
            int i = -1;
            int iMax = 1;
            int i2 = 0;
            while (iM < iM2) {
                qd qdVar3 = qdVarArr[iM];
                if (qdVar3 != null) {
                    int i3 = qdVar3.f;
                    int i4 = i3 - i;
                    if (i4 == 0) {
                        i2++;
                    } else {
                        if (i4 == 1) {
                            iMax = Math.max(iMax, i2);
                            i = qdVar3.f;
                        } else if (i4 < 0 || i3 >= qdVar.f || i4 > iM) {
                            qdVarArr[iM] = null;
                        } else {
                            if (iMax > 2) {
                                i4 *= iMax - 2;
                            }
                            boolean z2 = i4 >= iM;
                            for (int i5 = 1; i5 <= i4 && !z2; i5++) {
                                z2 = qdVarArr[iM - i5] != null;
                            }
                            if (z2) {
                                qdVarArr[iM] = null;
                            } else {
                                i = qdVar3.f;
                            }
                        }
                        i2 = 1;
                    }
                }
                iM++;
            }
        }
    }

    public void b() {
        synchronized (this.e) {
            try {
                if (((Handler) this.c) == null) {
                    if (this.b <= 0) {
                        throw new IllegalStateException("CameraThread is not open");
                    }
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.d = handlerThread;
                    handlerThread.start();
                    this.c = new Handler(((HandlerThread) this.d).getLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(Runnable runnable) {
        synchronized (this.e) {
            b();
            ((Handler) this.c).post(runnable);
        }
    }

    public void d() {
        synchronized (this.e) {
            ((HandlerThread) this.d).quit();
            this.d = null;
            this.c = null;
        }
    }

    public synchronized g f(ek3 ek3Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(ek3Var.toString());
            }
            if (!((ui3) this.e).d(ek3Var)) {
                ui3 ui3Var = new ui3(this);
                this.e = ui3Var;
                ui3Var.d(ek3Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return ek3Var.b.a;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                int i = this.b;
                y6[] y6VarArr = (y6[]) this.d;
                y6 y6Var = y6VarArr[0];
                if (y6Var == null) {
                    y6Var = y6VarArr[i + 1];
                }
                Formatter formatter = new Formatter();
                for (int i2 = 0; i2 < ((qd[]) y6Var.c).length; i2++) {
                    try {
                        formatter.format("CW %3d:", Integer.valueOf(i2));
                        for (int i3 = 0; i3 < i + 2; i3++) {
                            y6 y6Var2 = y6VarArr[i3];
                            if (y6Var2 == null) {
                                formatter.format("    |   ", new Object[0]);
                            } else {
                                qd qdVar = ((qd[]) y6Var2.c)[i2];
                                if (qdVar == null) {
                                    formatter.format("    |   ", new Object[0]);
                                } else {
                                    formatter.format(" %3d|%3d", Integer.valueOf(qdVar.f), Integer.valueOf(qdVar.e));
                                }
                            }
                        }
                        formatter.format("%n", new Object[0]);
                    } finally {
                        try {
                        } catch (Throwable th) {
                            try {
                                break;
                            } catch (Throwable th2) {
                            }
                        }
                    }
                }
                String string = formatter.toString();
                formatter.close();
                return string;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo9zza(Object obj) {
        switch (this.a) {
            case 4:
                ((zzna) obj).zzde((zzmy) this.c, (zzba) this.d, (zzba) this.e, this.b);
                break;
            default:
                ((zzwv) obj).zzai(0, ((zzwu) this.c).a, (zzwb) this.d, (zzwg) this.e, this.b);
                break;
        }
    }

    public /* synthetic */ zk3(zzwu zzwuVar, zzwb zzwbVar, zzwg zzwgVar, int i) {
        this.a = 5;
        this.c = zzwuVar;
        this.d = zzwbVar;
        this.e = zzwgVar;
        this.b = i;
    }

    public /* synthetic */ zk3(zzmy zzmyVar, zzba zzbaVar, zzba zzbaVar2, int i) {
        this.a = 4;
        this.c = zzmyVar;
        this.b = i;
        this.d = zzbaVar;
        this.e = zzbaVar2;
    }

    public zk3() {
        this.a = 1;
        this.b = 0;
        this.e = new Object();
    }

    public zk3(qd qdVar, pf pfVar) {
        this.a = 2;
        this.c = qdVar;
        int i = qdVar.b;
        this.b = i;
        this.e = pfVar;
        this.d = new y6[i + 2];
    }

    public zk3(int i, DataOutputStream dataOutputStream) {
        this.a = 3;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.c = byteArrayOutputStream;
        this.d = new DataOutputStream(byteArrayOutputStream);
        this.b = i;
        this.e = dataOutputStream;
    }
}
