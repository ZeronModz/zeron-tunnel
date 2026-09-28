package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzckr;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cc2 implements Runnable {
    public final /* synthetic */ zzckr a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ cc2(zzckr zzckrVar, int i, int i2, boolean z, boolean z2) {
        this.a = zzckrVar;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i;
        boolean z;
        boolean z2;
        zzeg zzegVar;
        zzeg zzegVar2;
        zzeg zzegVar3;
        zzckr zzckrVar = this.a;
        int i2 = this.b;
        int i3 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        synchronized (zzckrVar.b) {
            try {
                boolean z5 = zzckrVar.g;
                if (z5 || i3 != 1) {
                    i = i3;
                    z = false;
                } else {
                    i3 = 1;
                    i = 1;
                    z = true;
                }
                boolean z6 = i2 != i3;
                if (z6 && i == 1) {
                    z2 = true;
                    i = 1;
                } else {
                    z2 = false;
                }
                boolean z7 = z6 && i == 2;
                boolean z8 = z6 && i == 3;
                zzckrVar.g = z5 || z;
                if (z) {
                    try {
                        zzeg zzegVar4 = zzckrVar.f;
                        if (zzegVar4 != null) {
                            zzegVar4.zze();
                        }
                    } catch (RemoteException e) {
                        zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (z2 && (zzegVar3 = zzckrVar.f) != null) {
                    zzegVar3.zzf();
                }
                if (z7 && (zzegVar2 = zzckrVar.f) != null) {
                    zzegVar2.zzg();
                }
                if (z8) {
                    zzeg zzegVar5 = zzckrVar.f;
                    if (zzegVar5 != null) {
                        zzegVar5.zzh();
                    }
                    zzckrVar.a.zzz();
                }
                if (z3 != z4 && (zzegVar = zzckrVar.f) != null) {
                    zzegVar.zzi(z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
