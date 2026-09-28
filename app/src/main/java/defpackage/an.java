package defpackage;

import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.w1;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class an implements zzfmu, OnFailureListener {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public an(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = new ArrayList();
                break;
            default:
                this.b = 0L;
                break;
        }
    }

    public void a(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        an anVar = (an) this.c;
        if (anVar != null) {
            anVar.a(i - 64);
        }
    }

    public int b(int i) {
        an anVar = (an) this.c;
        if (anVar == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        }
        return Long.bitCount(this.b) + anVar.b(i - 64);
    }

    public void c() {
        if (((an) this.c) == null) {
            this.c = new an(0);
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return ((1 << i) & this.b) != 0;
        }
        c();
        return ((an) this.c).d(i - 64);
    }

    public void e(int i, boolean z) {
        if (i >= 64) {
            c();
            ((an) this.c).e(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            h(i);
        } else {
            a(i);
        }
        if (z2 || ((an) this.c) != null) {
            c();
            ((an) this.c).e(0, z2);
        }
    }

    public boolean f(int i) {
        if (i >= 64) {
            c();
            return ((an) this.c).f(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        an anVar = (an) this.c;
        if (anVar != null) {
            if (anVar.d(0)) {
                h(63);
            }
            ((an) this.c).f(0);
        }
        return z;
    }

    public void g() {
        this.b = 0L;
        an anVar = (an) this.c;
        if (anVar != null) {
            anVar.g();
        }
    }

    public void h(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            c();
            ((an) this.c).h(i - 64);
        }
    }

    public void i() {
        f63 f63Var = (f63) this.c;
        f63Var.a();
        f63Var.a.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = f63Var.e().edit();
        editorEdit.remove("health_monitor:count");
        editorEdit.remove("health_monitor:value");
        editorEdit.putLong("health_monitor:start", jCurrentTimeMillis);
        editorEdit.apply();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public /* synthetic */ void onFailure(Exception exc) {
        wp2 wp2Var = (wp2) this.c;
        ((AtomicLong) wp2Var.d).set(this.b);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((an) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((an) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    public Object zza(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((zzg) ((so2) this.c).a).zzx()) {
            return null;
        }
        long j = this.b;
        e22 e22VarK = w1.K();
        e22VarK.d();
        ((w1) e22VarK.b).I(j);
        byte[] bArrA = ((w1) e22VarK.e()).a();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
        ay2.K(sQLiteDatabase, j, bArrA);
        return null;
    }

    public /* synthetic */ an(f63 f63Var, long j) {
        this.a = 4;
        this.c = f63Var;
        yg0.j("health_monitor");
        yg0.e(j > 0);
        this.b = j;
    }

    public /* synthetic */ an(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
