package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.content.res.ResourcesCompat$FontCallback;
import androidx.core.graphics.TypefaceCompat$ResourcesCallbackAdapter;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.BatchingListUpdateCallback;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.p;
import androidx.work.impl.constraints.b;
import androidx.work.impl.foreground.a;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.SerialExecutorImpl;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbj;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbl;
import com.google.android.gms.internal.ads.ec;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.g7;
import com.google.android.gms.internal.ads.la;
import com.google.android.gms.internal.ads.xb;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzadl;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzary;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzbsl;
import com.google.android.gms.internal.ads.zzbv;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzcbz;
import com.google.android.gms.internal.ads.zzcfs;
import com.google.android.gms.internal.ads.zzcgw;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzckh;
import com.google.android.gms.internal.ads.zzckr;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdm;
import com.google.android.gms.internal.ads.zzdoc;
import com.google.android.gms.internal.ads.zzdq;
import com.google.android.gms.internal.ads.zzdqe;
import com.google.android.gms.internal.ads.zzdye;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.android.gms.internal.ads.zzian;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class s33 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ s33(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        WorkSpec workSpecC = ((a) this.c).a.g.c((String) this.b);
        if (workSpecC == null || !workSpecC.c()) {
            return;
        }
        synchronized (((a) this.c).c) {
            ((a) this.c).f.put(if3.w(workSpecC), workSpecC);
            a aVar = (a) this.c;
            ((a) this.c).g.put(if3.w(workSpecC), b.a(aVar.h, workSpecC, aVar.b.getTaskCoroutineDispatcher(), (a) this.c));
        }
    }

    private final void b() {
        zzcbz zzcbzVar = (zzcbz) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        la laVarZzA = zzian.zzA();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, laVarZzA);
        synchronized (zzcbzVar.h) {
            ce3 ce3Var = zzcbzVar.a;
            ie3 ie3VarV = xb.v();
            zzian zzianVarA = laVarZzA.a();
            ie3VarV.d();
            ((xb) ie3VarV.b).x(zzianVarA);
            ie3VarV.d();
            ((xb) ie3VarV.b).w("image/png");
            ie3VarV.d();
            ((xb) ie3VarV.b).y(2);
            xb xbVar = (xb) ie3VarV.e();
            ce3Var.d();
            ((ec) ce3Var.b).F(xbVar);
        }
    }

    private final void c() {
        zzcjl zzcjlVar;
        ca2 ca2Var = new ca2((zzckh) this.b, 3);
        fp2 fp2Var = (fp2) this.c;
        synchronized (fp2Var) {
            aw2 aw2Var = fp2Var.f;
            if (aw2Var == null || (zzcjlVar = fp2Var.d) == null) {
                return;
            }
            zzt.zzu().zzj(aw2Var, ca2Var);
            fp2Var.f = null;
            zzcjlVar.zzal(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d() {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s33.d():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thB;
        p pVar;
        int i;
        Object[] objArr;
        int i2;
        int i3;
        int i4 = 1;
        switch (this.a) {
            case 0:
                zzgzl zzgzlVar = (zzgzl) this.c;
                Future future = (Future) this.b;
                if ((future instanceof g7) && (thB = ((g7) future).b()) != null) {
                    zzgzlVar.zza(thB);
                    return;
                }
                try {
                    zzgzlVar.mo5zzb(z.n0(future));
                    return;
                } catch (ExecutionException e) {
                    zzgzlVar.zza(e.getCause());
                    return;
                } catch (Throwable th) {
                    zzgzlVar.zza(th);
                    return;
                }
            case 1:
                ((Application) this.b).unregisterActivityLifecycleCallbacks((a3) this.c);
                return;
            case 2:
                androidx.recyclerview.widget.b bVar = (androidx.recyclerview.widget.b) this.c;
                AsyncListDiffer asyncListDiffer = bVar.d;
                if (asyncListDiffer.g == bVar.c) {
                    List list = bVar.b;
                    p pVar2 = (p) this.b;
                    List list2 = asyncListDiffer.f;
                    asyncListDiffer.e = list;
                    asyncListDiffer.f = DesugarCollections.unmodifiableList(list);
                    ListUpdateCallback listUpdateCallback = asyncListDiffer.a;
                    int[] iArr = pVar2.b;
                    ArrayList arrayList = pVar2.a;
                    int i5 = pVar2.e;
                    r8 r8Var = pVar2.d;
                    BatchingListUpdateCallback batchingListUpdateCallback = listUpdateCallback instanceof BatchingListUpdateCallback ? (BatchingListUpdateCallback) listUpdateCallback : new BatchingListUpdateCallback(listUpdateCallback);
                    ArrayDeque arrayDeque = new ArrayDeque();
                    int i6 = pVar2.f;
                    int size = arrayList.size() - 1;
                    int i7 = i6;
                    int i8 = i5;
                    while (size >= 0) {
                        xx xxVar = (xx) arrayList.get(size);
                        int i9 = xxVar.a;
                        int i10 = xxVar.c;
                        int i11 = i4;
                        int i12 = i9 + i10;
                        int i13 = xxVar.b;
                        int[] iArr2 = iArr;
                        int i14 = i13 + i10;
                        ArrayList arrayList2 = arrayList;
                        while (true) {
                            int i15 = 0;
                            if (i8 > i12) {
                                i8--;
                                int i16 = iArr2[i8];
                                if ((i16 & 12) != 0) {
                                    i2 = i12;
                                    int i17 = i16 >> 4;
                                    yx yxVarA = p.a(arrayDeque, i17, false);
                                    if (yxVarA != null) {
                                        int i18 = (i5 - yxVarA.b) - 1;
                                        batchingListUpdateCallback.onMoved(i8, i18);
                                        if ((i16 & 4) != 0) {
                                            i3 = i5;
                                            batchingListUpdateCallback.onChanged(i18, i11, r8Var.c(i8, i17));
                                        } else {
                                            i3 = i5;
                                        }
                                    } else {
                                        i3 = i5;
                                        boolean z = i11;
                                        arrayDeque.add(new yx(i8, (i3 - i8) - (z ? 1 : 0), z));
                                    }
                                    i5 = i3;
                                } else {
                                    i2 = i12;
                                    batchingListUpdateCallback.onRemoved(i8, i11);
                                    i5--;
                                }
                                i12 = i2;
                                i11 = 1;
                            } else {
                                while (i7 > i14) {
                                    i7--;
                                    int i19 = pVar2.c[i7];
                                    if ((i19 & 12) != 0) {
                                        int i20 = i19 >> 4;
                                        pVar = pVar2;
                                        if (p.a(arrayDeque, i20, true) == null) {
                                            objArr = true;
                                            i = 0;
                                            arrayDeque.add(new yx(i7, i5 - i8, false));
                                        } else {
                                            objArr = true;
                                            i = 0;
                                            batchingListUpdateCallback.onMoved((i5 - r2.b) - 1, i8);
                                            if ((i19 & 4) != 0) {
                                                batchingListUpdateCallback.onChanged(i8, 1, r8Var.c(i20, i7));
                                            }
                                        }
                                    } else {
                                        pVar = pVar2;
                                        i = i15;
                                        batchingListUpdateCallback.onInserted(i8, 1);
                                        i5++;
                                    }
                                    i15 = i;
                                    pVar2 = pVar;
                                }
                                p pVar3 = pVar2;
                                int i21 = i13;
                                int i22 = i9;
                                while (i15 < i10) {
                                    if ((iArr2[i22] & 15) == 2) {
                                        batchingListUpdateCallback.onChanged(i22, 1, r8Var.c(i22, i21));
                                    }
                                    i22++;
                                    i21++;
                                    i15++;
                                }
                                size--;
                                iArr = iArr2;
                                i4 = 1;
                                i7 = i13;
                                i8 = i9;
                                arrayList = arrayList2;
                                pVar2 = pVar3;
                            }
                        }
                    }
                    batchingListUpdateCallback.a();
                    asyncListDiffer.a(list2);
                    return;
                }
                return;
            case 3:
                TypefaceCompat$ResourcesCallbackAdapter typefaceCompat$ResourcesCallbackAdapter = (TypefaceCompat$ResourcesCallbackAdapter) this.b;
                Typeface typeface = (Typeface) this.c;
                ResourcesCompat$FontCallback resourcesCompat$FontCallback = typefaceCompat$ResourcesCallbackAdapter.a;
                if (resourcesCompat$FontCallback != null) {
                    resourcesCompat$FontCallback.c(typeface);
                    return;
                }
                return;
            case 4:
                DefaultItemAnimator defaultItemAnimator = (DefaultItemAnimator) this.c;
                ArrayList<n> arrayList3 = (ArrayList) this.b;
                for (n nVar : arrayList3) {
                    ArrayList arrayList4 = defaultItemAnimator.r;
                    long j = defaultItemAnimator.f;
                    RecyclerView.ViewHolder viewHolder = nVar.a;
                    View view = viewHolder == null ? null : viewHolder.a;
                    RecyclerView.ViewHolder viewHolder2 = nVar.b;
                    View view2 = viewHolder2 != null ? viewHolder2.a : null;
                    if (view != null) {
                        ViewPropertyAnimator duration = view.animate().setDuration(j);
                        arrayList4.add(nVar.a);
                        duration.translationX(nVar.e - nVar.c);
                        duration.translationY(nVar.f - nVar.d);
                        duration.alpha(0.0f).setListener(new l(defaultItemAnimator, nVar, duration, view)).start();
                    }
                    if (view2 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                        arrayList4.add(nVar.b);
                        viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new m(defaultItemAnimator, nVar, viewPropertyAnimatorAnimate, view2)).start();
                    }
                }
                arrayList3.clear();
                defaultItemAnimator.n.remove(arrayList3);
                return;
            case 5:
                ((m80) this.b).accept(this.c);
                return;
            case 6:
                try {
                    ((Runnable) this.c).run();
                    synchronized (((SerialExecutorImpl) this.b).d) {
                        ((SerialExecutorImpl) this.b).a();
                        break;
                    }
                    return;
                } catch (Throwable th2) {
                    synchronized (((SerialExecutorImpl) this.b).d) {
                        ((SerialExecutorImpl) this.b).a();
                        throw th2;
                    }
                }
            case 7:
                a();
                return;
            case 8:
                ((AdManagerAdView) this.b).zzb((AdManagerAdRequest) this.c);
                return;
            case 9:
                zzadl zzadlVar = (zzadl) this.b;
                zzbv zzbvVar = (zzbv) this.c;
                String str = wt2.a;
                zzadlVar.b.zzf(zzbvVar);
                return;
            case 10:
                ((zzat) this.b).zzk((zzgzy) this.c);
                return;
            case 11:
                try {
                    ((zzark) this.c).b.put((zzary) this.b);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 12:
                if (((w12) this.c).isCancelled()) {
                    ((Future) this.b).cancel(true);
                    return;
                }
                return;
            case 13:
                ((zzbl) this.b).zza((zzbj) this.c);
                return;
            case 14:
                ((TaggingLibraryJsInterface) ((u32) this.b).c).zzc().evaluateJavascript((String) this.c, null);
                return;
            case 15:
                zzbsk zzbskVar = (zzbsk) this.c;
                zzbsl zzbslVar = (zzbsl) this.b;
                Context context = zzbslVar.b;
                long jCurrentTimeMillis = zzt.zzk().currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                try {
                    zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
                    zzbro zzbroVar = new zzbro(context, zzbslVar.d, null, null);
                    zze.zza("loadJavascriptEngine > After createJavascriptEngine");
                    zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
                    zzbroVar.zzi(new e72(zzbslVar, arrayList5, jCurrentTimeMillis, zzbskVar, zzbroVar));
                    zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
                    zzbroVar.zzm("/jsLoaded", new a72(zzbslVar, jCurrentTimeMillis, zzbskVar, zzbroVar));
                    com.google.android.gms.ads.internal.util.zzbv zzbvVar2 = new com.google.android.gms.ads.internal.util.zzbv();
                    ck2 ck2Var = new ck2(zzbslVar, zzbroVar, zzbvVar2);
                    zzbvVar2.zzb(ck2Var);
                    zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
                    if (!((Boolean) k42.d.g()).booleanValue() || TextUtils.equals(context.getPackageName(), "com.google.android.gms")) {
                        zzbroVar.zzm("/requestReload", ck2Var);
                    }
                    String str2 = zzbslVar.c;
                    zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str2)));
                    if (str2.endsWith(".js")) {
                        zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                        zzbroVar.zzf(str2);
                        zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
                    } else if (str2.startsWith("<html>")) {
                        zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                        zzbroVar.zzh(str2);
                        zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
                    } else {
                        zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                        zzbroVar.zzg(str2);
                        zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
                    }
                    zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
                    zzs.zza.postDelayed(new c72(zzbslVar, zzbskVar, zzbroVar, arrayList5, jCurrentTimeMillis, 0), ((Integer) zzbd.zzc().a(p32.e)).intValue());
                    return;
                } catch (Throwable th3) {
                    zzo.zzg("Error creating webview.", th3);
                    if (((Boolean) zzbd.zzc().a(p32.K8)).booleanValue()) {
                        zzbskVar.c(th3, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                        return;
                    } else if (((Boolean) zzbd.zzc().a(p32.M8)).booleanValue()) {
                        zzt.zzh().g(th3, "SdkJavascriptFactory.loadJavascriptEngine");
                        zzbskVar.b();
                        return;
                    } else {
                        zzt.zzh().f("SdkJavascriptFactory.loadJavascriptEngine", th3);
                        zzbskVar.b();
                        return;
                    }
                }
            case 16:
                ((zzu) this.b).zzc((String) this.c, null);
                return;
            case 17:
                b();
                return;
            case 18:
                zzcgw zzcgwVar = (zzcgw) this.b;
                String str3 = (String) this.c;
                zzcfs zzcfsVar = zzcgwVar.g;
                if (zzcfsVar != null) {
                    zzcfsVar.zzg("ExoPlayerAdapter exception", str3);
                    return;
                }
                return;
            case 19:
                Context context2 = (Context) this.b;
                zzdq zzdqVar = (zzdq) this.c;
                sb2.a = (AudioManager) context2.getSystemService("audio");
                zzdqVar.a();
                return;
            case 20:
                c();
                return;
            case 21:
                ((zzckr) this.b).a.zze("pubVideoCmd", (HashMap) this.c);
                return;
            case 22:
                g3.f.execute(new db0(25, (be2) this.b, (Runnable) this.c));
                return;
            case 23:
                ve2 ve2Var = (ve2) this.b;
                Throwable th4 = (Throwable) this.c;
                boolean zBooleanValue = ((Boolean) zzbd.zzc().a(p32.Mb)).booleanValue();
                Context context3 = ve2Var.a;
                if (zBooleanValue) {
                    zzbyr zzbyrVarC = z82.c(context3);
                    ve2Var.i = zzbyrVarC;
                    zzbyrVarC.zzh(th4, "AttributionReporting");
                    return;
                } else {
                    zzbyr zzbyrVarA = z82.a(context3);
                    ve2Var.h = zzbyrVarA;
                    zzbyrVarA.zzh(th4, "AttributionReportingSampled");
                    return;
                }
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                try {
                    ((zzdhc) this.b).mo3zza(this.c);
                    return;
                } catch (Throwable th5) {
                    zzt.zzh().g(th5, "EventEmitter.notify");
                    zze.zzb("Event emitter exception.", th5);
                    return;
                }
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                zzdm zzdmVar = (zzdm) this.b;
                Object obj = this.c;
                int i23 = zzdmVar.f - 1;
                zzdmVar.f = i23;
                if (i23 == 0) {
                    Object obj2 = zzdmVar.d;
                    zzdmVar.d = obj;
                    if (obj2.equals(obj)) {
                        return;
                    }
                    zzdmVar.c.zza(obj2, obj);
                    return;
                }
                return;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                ((zzdoc) this.b).i((zzdqe) this.c);
                return;
            case 27:
                d();
                return;
            default:
                ((zzdye) this.b).d.zzc((String) this.c, null);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                wp2 wp2Var = new wp2(s33.class.getSimpleName());
                zzgzl zzgzlVar = (zzgzl) this.c;
                mo2 mo2Var = new mo2(11, false);
                ((mo2) wp2Var.d).c = mo2Var;
                wp2Var.d = mo2Var;
                mo2Var.b = zzgzlVar;
                return wp2Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s33(Object obj, int i, Object obj2, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
