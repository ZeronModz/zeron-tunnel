package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import androidx.appcompat.app.k;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class q6 extends s6 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ k d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(k kVar, Context context) {
        super(kVar);
        this.d = kVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.s6
    public final IntentFilter b() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    @Override // defpackage.s6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c() {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q6.c():int");
    }

    @Override // defpackage.s6
    public final void d() {
        int i = this.c;
        k kVar = this.d;
        switch (i) {
            case 0:
                kVar.m(true, true);
                break;
            default:
                kVar.m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(k kVar, tj1 tj1Var) {
        super(kVar);
        this.d = kVar;
        this.e = tj1Var;
    }
}
