package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzdoc;
import com.google.android.gms.internal.ads.zzdqe;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jf implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ View e;

    public /* synthetic */ jf(zzdoc zzdocVar, View view, boolean z, int i) {
        this.d = zzdocVar;
        this.e = view;
        this.b = z;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((ActionMenuView) obj).setTranslationX(((BottomAppBar) this.e).C(r1, this.c, this.b));
                break;
            default:
                zzdoc zzdocVar = (zzdoc) obj;
                zzdqe zzdqeVar = zzdocVar.w;
                if (zzdqeVar != null) {
                    zzdocVar.n.zzf(this.e, zzdqeVar.zzdE(), zzdocVar.w.zzj(), zzdocVar.w.zzk(), this.b, zzdocVar.n(), this.c);
                } else {
                    zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                }
                break;
        }
    }

    public jf(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.e = bottomAppBar;
        this.d = actionMenuView;
        this.c = i;
        this.b = z;
    }
}
