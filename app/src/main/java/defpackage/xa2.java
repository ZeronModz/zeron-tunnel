package defpackage;

import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzcfs;
import com.google.android.gms.internal.ads.zzfyn;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xa2 implements Runnable {
    public final /* synthetic */ int a;
    public final zzcfs b;
    public boolean c;

    public xa2(zzcfs zzcfsVar) {
        this.a = 2;
        this.c = false;
        this.b = zzcfsVar;
    }

    public void a() {
        this.c = true;
        this.b.b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzcfs zzcfsVar = this.b;
        switch (i) {
            case 0:
                zzcfsVar.c("windowVisibilityChanged", "isVisible", String.valueOf(this.c));
                break;
            case 1:
                zzcfsVar.c("windowFocusChanged", "hasWindowFocus", String.valueOf(this.c));
                break;
            default:
                if (!this.c) {
                    zzcfsVar.b();
                    zzfyn zzfynVar = zzs.zza;
                    zzfynVar.removeCallbacks(this);
                    zzfynVar.postDelayed(this, 250L);
                }
                break;
        }
    }

    public /* synthetic */ xa2(zzcfs zzcfsVar, boolean z, int i) {
        this.a = i;
        this.c = z;
        this.b = zzcfsVar;
    }
}
