package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bt1 implements OnCompleteListener {
    public final b a;
    public final int b;
    public final s5 c;
    public final long d;
    public final long e;

    public bt1(b bVar, int i, s5 s5Var, long j, long j2) {
        this.a = bVar;
        this.b = i;
        this.c = s5Var;
        this.d = j;
        this.e = j2;
    }

    public static ConnectionTelemetryConfiguration a(zabq zabqVar, com.google.android.gms.common.internal.b bVar, int i) {
        ConnectionTelemetryConfiguration telemetryConfiguration = bVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.b) {
            return null;
        }
        int[] iArr = telemetryConfiguration.d;
        int i2 = 0;
        if (iArr != null) {
            while (i2 < iArr.length) {
                if (iArr[i2] != i) {
                    i2++;
                }
            }
            return null;
        }
        int[] iArr2 = telemetryConfiguration.f;
        if (iArr2 != null) {
            while (i2 < iArr2.length) {
                if (iArr2[i2] == i) {
                    return null;
                }
                i2++;
            }
        }
        if (zabqVar.l < telemetryConfiguration.e) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        b bVar = this.a;
        if (bVar.b()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = a41.a().a;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.b) {
                zabq zabqVar = (zabq) bVar.j.get(this.c);
                if (zabqVar != null) {
                    Object obj = zabqVar.b;
                    if (obj instanceof com.google.android.gms.common.internal.b) {
                        com.google.android.gms.common.internal.b bVar2 = (com.google.android.gms.common.internal.b) obj;
                        long j3 = this.d;
                        boolean z = j3 > 0;
                        int gCoreServiceId = bVar2.getGCoreServiceId();
                        if (rootTelemetryConfiguration != null) {
                            z &= rootTelemetryConfiguration.c;
                            int i7 = rootTelemetryConfiguration.d;
                            int i8 = rootTelemetryConfiguration.e;
                            i = rootTelemetryConfiguration.a;
                            if (bVar2.hasConnectionInfo() && !bVar2.isConnecting()) {
                                ConnectionTelemetryConfiguration connectionTelemetryConfigurationA = a(zabqVar, bVar2, this.b);
                                if (connectionTelemetryConfigurationA == null) {
                                    return;
                                }
                                boolean z2 = connectionTelemetryConfigurationA.c && j3 > 0;
                                i8 = connectionTelemetryConfigurationA.e;
                                z = z2;
                            }
                            i3 = i7;
                            i2 = i8;
                        } else {
                            i = 0;
                            i2 = 100;
                            i3 = 5000;
                        }
                        int iElapsedRealtime = -1;
                        if (task.m()) {
                            i6 = 0;
                            i5 = 0;
                        } else if (task.k()) {
                            i5 = -1;
                            i6 = 100;
                        } else {
                            Exception excH = task.h();
                            if (excH instanceof ApiException) {
                                Status status = ((ApiException) excH).getStatus();
                                i4 = status.a;
                                ConnectionResult connectionResult = status.d;
                                if (connectionResult != null) {
                                    i5 = connectionResult.b;
                                }
                                i6 = i4;
                            } else {
                                i4 = 101;
                            }
                            i5 = -1;
                            i6 = i4;
                        }
                        if (z) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.e);
                            j = j3;
                            j2 = jCurrentTimeMillis;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        ct1 ct1Var = new ct1(new MethodInvocation(this.b, i6, i5, j, j2, null, null, gCoreServiceId, iElapsedRealtime), i, i3, i2);
                        zau zauVar = bVar.n;
                        zauVar.sendMessage(zauVar.obtainMessage(18, ct1Var));
                    }
                }
            }
        }
    }
}
