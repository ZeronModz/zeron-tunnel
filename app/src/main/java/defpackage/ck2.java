package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbsl;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzdqc;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ck2 implements zzboh {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ck2(zzdqc zzdqcVar, View view, WindowManager windowManager) {
        this.b = zzdqcVar;
        this.c = view;
        this.d = windowManager;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [dk2] */
    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        int i;
        switch (this.a) {
            case 0:
                zzdqc zzdqcVar = (zzdqc) this.b;
                WindowManager windowManager = (WindowManager) this.d;
                View view = (View) this.c;
                zzcjl zzcjlVar = (zzcjl) obj;
                zzo.zzd("Hide native ad policy validator overlay.");
                zzcjlVar.zzE().setVisibility(8);
                if (zzcjlVar.zzE().getWindowToken() != null) {
                    windowManager.removeView(zzcjlVar.zzE());
                }
                zzcjlVar.destroy();
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (zzdqcVar.c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                    return;
                }
                viewTreeObserver.removeOnScrollChangedListener(zzdqcVar.c);
                return;
            case 1:
                zzdqc zzdqcVar2 = (zzdqc) this.b;
                final View view2 = (View) this.c;
                final WindowManager windowManager2 = (WindowManager) this.d;
                final zzcjl zzcjlVar2 = (zzcjl) obj;
                int i2 = 0;
                zzcjlVar2.zzP().zzG(new i31((Object) zzdqcVar2, 24, (Object) map, false));
                if (map == null) {
                    return;
                }
                Context context = view2.getContext();
                String str = (String) map.get("validator_width");
                int iIntValue = ((Integer) zzbd.zzc().a(p32.s9)).intValue();
                try {
                    iIntValue = Integer.parseInt(str);
                    break;
                } catch (NumberFormatException unused) {
                }
                zzbb.zza();
                int iZzC = zzf.zzC(context, iIntValue);
                String str2 = (String) map.get("validator_height");
                int iIntValue2 = ((Integer) zzbd.zzc().a(p32.t9)).intValue();
                try {
                    iIntValue2 = Integer.parseInt(str2);
                    break;
                } catch (NumberFormatException unused2) {
                }
                zzbb.zza();
                int iZzC2 = zzf.zzC(context, iIntValue2);
                try {
                    i = Integer.parseInt((String) map.get("validator_x"));
                    break;
                } catch (NumberFormatException unused3) {
                    i = 0;
                }
                zzbb.zza();
                int iZzC3 = zzf.zzC(context, i);
                try {
                    i2 = Integer.parseInt((String) map.get("validator_y"));
                    break;
                } catch (NumberFormatException unused4) {
                }
                zzbb.zza();
                int iZzC4 = zzf.zzC(context, i2);
                zzcjlVar2.zzaf(new jc2(1, iZzC, iZzC2));
                try {
                    zzcjlVar2.zzD().getSettings().setUseWideViewPort(((Boolean) zzbd.zzc().a(p32.u9)).booleanValue());
                    zzcjlVar2.zzD().getSettings().setLoadWithOverviewMode(((Boolean) zzbd.zzc().a(p32.v9)).booleanValue());
                    break;
                } catch (NullPointerException unused5) {
                }
                final WindowManager.LayoutParams layoutParamsZzk = zzbs.zzk();
                layoutParamsZzk.x = iZzC3;
                layoutParamsZzk.y = iZzC4;
                windowManager2.updateViewLayout(zzcjlVar2.zzE(), layoutParamsZzk);
                final String str3 = (String) map.get("orientation");
                Rect rect = new Rect();
                if (view2.getGlobalVisibleRect(rect)) {
                    final int i3 = (("1".equals(str3) || "2".equals(str3)) ? rect.bottom : rect.top) - iZzC4;
                    zzdqcVar2.c = new ViewTreeObserver.OnScrollChangedListener() { // from class: dk2
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final /* synthetic */ void onScrollChanged() {
                            Rect rect2 = new Rect();
                            if (view2.getGlobalVisibleRect(rect2)) {
                                zzcjl zzcjlVar3 = zzcjlVar2;
                                if (zzcjlVar3.zzE().getWindowToken() == null) {
                                    return;
                                }
                                String str4 = str3;
                                boolean zEquals = "1".equals(str4);
                                int i4 = i3;
                                WindowManager.LayoutParams layoutParams = layoutParamsZzk;
                                if (zEquals || "2".equals(str4)) {
                                    layoutParams.y = rect2.bottom - i4;
                                } else {
                                    layoutParams.y = rect2.top - i4;
                                }
                                windowManager2.updateViewLayout(zzcjlVar3.zzE(), layoutParams);
                            }
                        }
                    };
                    ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                    if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                        viewTreeObserver2.addOnScrollChangedListener(zzdqcVar2.c);
                    }
                }
                String str4 = (String) map.get("overlay_url");
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                zzcjlVar2.loadUrl(str4);
                return;
            default:
                zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
                zzbsl zzbslVar = (zzbsl) this.c;
                synchronized (zzbslVar.a) {
                    try {
                        zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
                        zzo.zzh("JS Engine is requesting an update");
                        if (zzbslVar.i == 0) {
                            zzo.zzh("Starting reload.");
                            zzbslVar.i = 2;
                            zzbslVar.a();
                        }
                        ((zzbro) this.b).zzn("/requestReload", (zzboh) ((zzbv) this.d).zza());
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
                return;
        }
    }

    public /* synthetic */ ck2(zzdqc zzdqcVar, WindowManager windowManager, View view) {
        this.b = zzdqcVar;
        this.d = windowManager;
        this.c = view;
    }

    public ck2(zzbsl zzbslVar, zzbro zzbroVar, zzbv zzbvVar) {
        this.b = zzbroVar;
        this.d = zzbvVar;
        this.c = zzbslVar;
    }
}
