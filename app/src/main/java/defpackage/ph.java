package defpackage;

import android.content.Context;
import androidx.core.content.res.ResourcesCompat$FontCallback;
import androidx.core.graphics.TypefaceCompat$ResourcesCallbackAdapter;
import androidx.emoji2.text.EmojiCompat$InitCallback;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.internal.ads.a6;
import com.google.android.gms.internal.ads.b1;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfs;
import com.google.android.gms.internal.ads.zzcgw;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzrb;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.navigation.NavigationBarItemView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ph implements Runnable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;

    public ph(List list, int i, Throwable th) {
        this.a = 1;
        jx0.f(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b1 b1VarD;
        int i = 0;
        switch (this.a) {
            case 0:
                TypefaceCompat$ResourcesCallbackAdapter typefaceCompat$ResourcesCallbackAdapter = (TypefaceCompat$ResourcesCallbackAdapter) this.c;
                int i2 = this.b;
                ResourcesCompat$FontCallback resourcesCompat$FontCallback = typefaceCompat$ResourcesCallbackAdapter.a;
                if (resourcesCompat$FontCallback != null) {
                    resourcesCompat$FontCallback.b(i2);
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                if (this.b == 1) {
                    while (i < size) {
                        ((EmojiCompat$InitCallback) arrayList.get(i)).b();
                        i++;
                    }
                } else {
                    while (i < size) {
                        ((EmojiCompat$InitCallback) arrayList.get(i)).a();
                        i++;
                    }
                }
                break;
            case 2:
                ((MaterialCalendar) this.c).h0.k0(this.b);
                break;
            case 3:
                NavigationBarItemView navigationBarItemView = (NavigationBarItemView) this.c;
                int i3 = this.b;
                int[] iArr = NavigationBarItemView.G;
                navigationBarItemView.h(i3);
                break;
            case 4:
                ((RecyclerView) this.c).k0(this.b);
                break;
            case 5:
                ((zabq) this.c).f(this.b);
                break;
            case 6:
                int i4 = this.b;
                t02 t02Var = (t02) this.c;
                if (i4 > 0) {
                    try {
                        Thread.sleep(i4 * 1000);
                        break;
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    Context context = t02Var.a;
                    b1VarD = z.d(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    b1VarD = null;
                }
                t02 t02Var2 = (t02) this.c;
                t02Var2.h = b1VarD;
                int i5 = this.b;
                if (i5 < 4) {
                    if (b1VarD == null || !b1VarD.zza() || b1VarD.zzb().equals("0000000000000000000000000000000000000000000000000000000000000000") || !b1VarD.zzg() || !b1VarD.s0().zza() || b1VarD.s0().zzb() == -2) {
                        int i6 = i5 + 1;
                        if (t02Var2.l) {
                            Future<?> futureSubmit = t02Var2.b.submit(new ph(t02Var2, i6, 6));
                            if (i6 == 0) {
                                t02Var2.i = futureSubmit;
                            }
                            break;
                        }
                    }
                }
                break;
            case 7:
                zzbid zzbidVar = (zzbid) this.c;
                int i7 = this.b;
                zzdxz zzdxzVar = zzbidVar.d;
                if (zzdxzVar != null) {
                    i31 i31VarA = zzdxzVar.a();
                    i31VarA.c("action", "cct_nav");
                    i31VarA.c("cct_navs", String.valueOf(i7));
                    i31VarA.d();
                }
                break;
            case 8:
                ((ab2) this.c).b.onAudioFocusChange(this.b);
                break;
            case 9:
                zzcfi zzcfiVar = (zzcfi) this.c;
                int i8 = this.b;
                zzcfs zzcfsVar = zzcfiVar.q;
                if (zzcfsVar != null) {
                    zzcfsVar.onWindowVisibilityChanged(i8);
                }
                break;
            case 10:
                zzcgw zzcgwVar = (zzcgw) this.c;
                int i9 = this.b;
                zzcfs zzcfsVar2 = zzcgwVar.g;
                if (zzcfsVar2 != null) {
                    zzcfsVar2.onWindowVisibilityChanged(i9);
                }
                break;
            case 11:
                ((a6) this.c).b(this.b + 1);
                break;
            default:
                zzrb zzrbVar = (zzrb) this.c;
                int i10 = this.b;
                zzrbVar.getClass();
                String str = wt2.a;
                zzrbVar.b.zzx(i10);
                break;
        }
    }

    public ph(int i, go1 go1Var) {
        this.a = 4;
        this.b = i;
        this.c = go1Var;
    }

    public /* synthetic */ ph(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
