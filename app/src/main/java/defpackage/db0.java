package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.concurrent.futures.b;
import androidx.fragment.app.q;
import androidx.fragment.app.s;
import androidx.work.Logger;
import androidx.work.impl.background.greedy.DelayedWorkTracker;
import androidx.work.impl.model.WorkSpec;
import com.android.volley.CacheDispatcher;
import com.android.volley.Request;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzek;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.ads.internal.util.zzat;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface;
import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.j3;
import com.google.android.gms.internal.ads.zzadl;
import com.google.android.gms.internal.ads.zzbda;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzbdv;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbtm;
import com.google.android.gms.internal.ads.zzbtn;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbtw;
import com.google.android.gms.internal.ads.zzbwl;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfs;
import com.google.android.gms.internal.ads.zzcge;
import com.google.android.gms.internal.ads.zzcgw;
import com.google.android.gms.internal.ads.zzcit;
import com.google.android.gms.internal.ads.zzckw;
import com.google.android.gms.internal.ads.zzctc;
import com.google.android.gms.internal.ads.zzdm;
import com.google.android.gms.internal.ads.zzdx;
import com.google.android.gms.internal.ads.zzekj;
import com.google.android.gms.internal.ads.zzelw;
import com.google.android.gms.internal.ads.zzfjr;
import com.google.android.gms.internal.ads.zzfki;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.common.util.concurrent.ListenableFuture;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONObject;

 
 
public final class db0 implements Runnable {
    public final   int a;
    public final Object b;
    public final Object c;

    public   db0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

     
     
     
     
     
     
     
     
     
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String str;
        DataOutputStream dataOutputStream;
        MediaPlayer.TrackInfo[] trackInfoArr;
        int i;
        MediaFormat format;
        zzfjr zzfjrVar;
        zzfjr zzfjrVar2;
        int i2 = 2;
        int r3 = 0;
        DataOutputStream r3ds = null;
        DataOutputStream dataOutputStream2 = null;
        int i3 = 0;
        int i4 = 1;
        try {
            switch (this.a) {
                case 0:
                    FutureCallback futureCallback = (FutureCallback) this.c;
                    try {
                        futureCallback.mo18onSuccess(xg0.h((Future) this.b));
                        return;
                    } catch (Error e) {
                        e = e;
                        futureCallback.onFailure(e);
                        return;
                    } catch (RuntimeException e2) {
                        e = e2;
                        futureCallback.onFailure(e);
                        return;
                    } catch (ExecutionException e3) {
                        Throwable cause = e3.getCause();
                        if (cause == null) {
                            futureCallback.onFailure(e3);
                            return;
                        } else {
                            futureCallback.onFailure(cause);
                            return;
                        }
                    }
                case 1:
                    ((a3) this.b).a = this.c;
                    return;
                case 2:
                    Object obj = this.c;
                    Object obj2 = this.b;
                    try {
                        Method method = b3.d;
                        if (method != null) {
                            method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                        } else {
                            b3.e.invoke(obj2, obj, Boolean.FALSE);
                        }
                        return;
                    } catch (RuntimeException e4) {
                        if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                            throw e4;
                        }
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                case 3:
                    try {
                        ((CacheDispatcher) this.c).b.put((Request) this.b);
                        return;
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                case 4:
                    try {
                        am amVar = (am) this.c;
                        Object objL = xg0.l((ListenableFuture) this.b);
                        b bVar = amVar.b;
                        if (bVar != null) {
                            bVar.b(objL);
                        }
                        break;
                    } catch (CancellationException unused3) {
                        ((am) this.c).cancel(false);
                    } catch (ExecutionException e5) {
                        am amVar2 = (am) this.c;
                        Throwable cause2 = e5.getCause();
                        b bVar2 = amVar2.b;
                        if (bVar2 != null) {
                            bVar2.d(cause2);
                        }
                    }
                    return;
                case 5:
                    Logger loggerA = Logger.a();
                    int i5 = DelayedWorkTracker.e;
                    WorkSpec workSpec = (WorkSpec) this.b;
                    loggerA.getClass();
                    ((DelayedWorkTracker) this.c).a.schedule(workSpec);
                    return;
                case 6:
                    View view = (View) this.b;
                    int left = view.getLeft();
                    ScrollingTabContainerView scrollingTabContainerView = (ScrollingTabContainerView) this.c;
                    scrollingTabContainerView.smoothScrollTo(left - ((scrollingTabContainerView.getWidth() - view.getWidth()) / 2), 0);
                    scrollingTabContainerView.a = null;
                    return;
                case 7:
                    s sVar = (s) this.c;
                    ArrayList arrayList = sVar.b;
                    q qVar = (q) this.b;
                    arrayList.remove(qVar);
                    sVar.c.remove(qVar);
                    return;
                case 8:
                    if (((au1) this.c).b) {
                        ConnectionResult connectionResult = ((vt1) this.b).b;
                        boolean zA = connectionResult.a();
                        au1 au1Var = (au1) this.c;
                        if (zA) {
                            LifecycleFragment lifecycleFragment = au1Var.a;
                            Activity activityA = au1Var.a();
                            PendingIntent pendingIntent = connectionResult.c;
                            yg0.m(pendingIntent);
                            int i6 = ((vt1) this.b).a;
                            int i7 = GoogleApiActivity.b;
                            Intent intent = new Intent(activityA, (Class<?>) GoogleApiActivity.class);
                            intent.putExtra("pending_intent", pendingIntent);
                            intent.putExtra("failing_client_id", i6);
                            intent.putExtra("notify_manager", false);
                            lifecycleFragment.startActivityForResult(intent, 1);
                            return;
                        }
                        if (au1Var.e.a(au1Var.a(), connectionResult.b, null) != null) {
                            au1 au1Var2 = (au1) this.c;
                            au1Var2.e.h(au1Var2.a(), au1Var2.a, connectionResult.b, (au1) this.c);
                            return;
                        }
                        int i8 = connectionResult.b;
                        au1 au1Var3 = (au1) this.c;
                        if (i8 != 18) {
                            au1Var3.d(connectionResult, ((vt1) this.b).a);
                            return;
                        }
                        GoogleApiAvailability googleApiAvailability = au1Var3.e;
                        Activity activityA2 = au1Var3.a();
                        googleApiAvailability.getClass();
                        ProgressBar progressBar = new ProgressBar(activityA2, null, R.attr.progressBarStyleLarge);
                        progressBar.setIndeterminate(true);
                        progressBar.setVisibility(0);
                        AlertDialog.Builder builder = new AlertDialog.Builder(activityA2);
                        builder.setView(progressBar);
                        builder.setMessage(at1.b(activityA2, 18));
                        builder.setPositiveButton(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (DialogInterface.OnClickListener) null);
                        AlertDialog alertDialogCreate = builder.create();
                        GoogleApiAvailability.f(activityA2, alertDialogCreate, "GooglePlayServicesUpdatingDialog", au1Var3);
                        au1 au1Var4 = (au1) this.c;
                        Context applicationContext = au1Var4.a().getApplicationContext();
                        xt1 xt1Var = new xt1(this, alertDialogCreate);
                        au1Var4.e.getClass();
                        GoogleApiAvailability.e(applicationContext, xt1Var);
                        return;
                    }
                    return;
                case 9:
                    ((AdLoader) this.b).zza((zzek) this.c);
                    return;
                case 10:
                    zzadl zzadlVar = (zzadl) this.b;
                    String str2 = (String) this.c;
                    zzadlVar.getClass();
                    String str3 = wt2.a;
                    zzadlVar.b.zzh(str2);
                    return;
                case 11:
                    zzadl zzadlVar2 = (zzadl) this.b;
                    Exception exc = (Exception) this.c;
                    zzadlVar2.getClass();
                    String str4 = wt2.a;
                    zzadlVar2.b.zzk(exc);
                    return;
                case 12:
                    ((zzau) this.b).zzv((yk2[]) this.c);
                    return;
                case 13:
                    ((zzat) this.b).zzm((zzgzy) this.c);
                    return;
                case 14:
                    zzbee zzbeeVar = (zzbee) this.c;
                    View view2 = (View) this.b;
                    try {
                        zzbdu zzbduVar = new zzbdu(zzbeeVar.f, zzbeeVar.g, zzbeeVar.h, zzbeeVar.i, zzbeeVar.j, zzbeeVar.k, zzbeeVar.l, zzbeeVar.o);
                        Application applicationE = zzt.zzg().e();
                        if (applicationE != null) {
                            String str5 = zzbeeVar.m;
                            if (!TextUtils.isEmpty(str5) && (str = (String) view2.getTag(applicationE.getResources().getIdentifier((String) zzbd.zzc().a(p32.F0), "id", applicationE.getPackageName()))) != null && str.equals(str5)) {
                                return;
                            }
                        }
                        l01 l01VarB = zzbeeVar.b(view2, zzbduVar);
                        zzbduVar.d();
                        if (l01VarB.b == 0 && l01VarB.c == 0) {
                            return;
                        }
                        int i9 = l01VarB.c;
                        if (i9 != 0) {
                            if (i9 == 0) {
                            }
                            zzbeeVar.d.b(zzbduVar);
                            return;
                        } else if (zzbduVar.k == 0) {
                            return;
                        }
                        zzbdv zzbdvVar = zzbeeVar.d;
                        synchronized (zzbdvVar.a) {
                            try {
                                if (zzbdvVar.c.contains(zzbduVar)) {
                                    return;
                                }
                                zzbeeVar.d.b(zzbduVar);
                                return;
                            } finally {
                            }
                        }
                    } catch (Exception e6) {
                        zzo.zzg("Exception in fetchContentOnUIThread", e6);
                        zzt.zzh().f("ContentFetchTask.fetchContent", e6);
                        return;
                    }
                case 15:
                    boolean zBooleanValue = ((Boolean) zzbd.zzc().a(p32.d6)).booleanValue();
                    Context context = (Context) this.c;
                    zzbgi zzbgiVar = (zzbgi) this.b;
                    if (zBooleanValue) {
                        try {
                            zzbgiVar.a = (zzbda) zzs.zza(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", ed1.q);
                            zzbgiVar.a.zze(new a(context), "GMA_SDK");
                            zzbgiVar.b = true;
                            return;
                        } catch (RemoteException | zzr | NullPointerException unused4) {
                            zzo.zzd("Cannot dynamite load clearcut");
                            return;
                        }
                    }
                    return;
                case 16:
                    ((TaggingLibraryJsInterface) ((u32) this.b).c).zzc().evaluateJavascript((String) this.c, null);
                    return;
                case 17:
                    ((TaggingLibraryJsInterface) this.b).zzb((String) this.c);
                    return;
                case 18:
                    zzt.zzb();
                    zzn.zza(((zzbwl) this.c).a, (AdOverlayInfoParcel) this.b, true, null);
                    return;
                case 19:
                    Parcelable.Creator<zzbzs> creator = zzbzs.CREATOR;
                    byte[] bArr = (byte[]) this.c;
                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = (ParcelFileDescriptor.AutoCloseOutputStream) this.b;
                    try {
                        try {
                            dataOutputStream = new DataOutputStream(autoCloseOutputStream);
                        } catch (Throwable th) {
                            th = th;
                        }
                        break;
                    } catch (IOException e7) {
                        e = e7;
                    }
                    try {
                        int length = bArr.length;
                        dataOutputStream.writeInt(length);
                        dataOutputStream.write(bArr);
                        mc2.i(dataOutputStream);
                        r3 = length;
                    } catch (IOException e8) {
                        e = e8;
                        dataOutputStream2 = dataOutputStream;
                        zzo.zzg("Error transporting the ad response", e);
                        zzt.zzh().f("LargeParcelTeleporter.pipeData.1", e);
                        if (dataOutputStream2 == null) {
                            mc2.i(autoCloseOutputStream);
                            r3ds = dataOutputStream2;
                        } else {
                            mc2.i(dataOutputStream2);
                            r3ds = dataOutputStream2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r3ds = dataOutputStream;
                        if (r3ds == null) {
                            mc2.i(autoCloseOutputStream);
                        } else {
                            mc2.i(r3ds);
                        }
                        throw th;
                    }
                    return;
                case 20:
                    zzcfi zzcfiVar = (zzcfi) this.c;
                    MediaPlayer mediaPlayer = (MediaPlayer) this.b;
                    zzcge zzcgeVar = zzcfiVar.c;
                    if (((Boolean) zzbd.zzc().a(p32.w2)).booleanValue() && zzcgeVar != null && mediaPlayer != null) {
                        try {
                            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
                            if (trackInfo != null) {
                                HashMap map = new HashMap();
                                while (i3 < trackInfo.length) {
                                    MediaPlayer.TrackInfo trackInfo2 = trackInfo[i3];
                                    if (trackInfo2 == null) {
                                        trackInfoArr = trackInfo;
                                    } else {
                                        int trackType = trackInfo2.getTrackType();
                                        trackInfoArr = trackInfo;
                                        if (trackType == i4) {
                                            i = i2;
                                            MediaFormat format2 = trackInfo2.getFormat();
                                            if (format2 != null) {
                                                if (format2.containsKey("frame-rate")) {
                                                    try {
                                                        map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                                    } catch (ClassCastException unused5) {
                                                        map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                                    }
                                                }
                                                if (format2.containsKey("bitrate")) {
                                                    Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                                    zzcfiVar.s = numValueOf;
                                                    map.put("bitRate", String.valueOf(numValueOf));
                                                }
                                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                                    int integer = format2.getInteger("width");
                                                    int integer2 = format2.getInteger("height");
                                                    StringBuilder sb = new StringBuilder(wd3.a(integer, i4) + String.valueOf(integer2).length());
                                                    sb.append(integer);
                                                    sb.append("x");
                                                    sb.append(integer2);
                                                    map.put("resolution", sb.toString());
                                                }
                                                if (format2.containsKey("mime")) {
                                                    map.put("videoMime", format2.getString("mime"));
                                                }
                                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                                    map.put("videoCodec", format2.getString("codecs-string"));
                                                }
                                                break;
                                            }
                                        } else if (trackType == i2 && (format = trackInfo2.getFormat()) != null) {
                                            if (format.containsKey("mime")) {
                                                i = i2;
                                                map.put("audioMime", format.getString("mime"));
                                            } else {
                                                i = i2;
                                            }
                                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                                map.put("audioCodec", format.getString("codecs-string"));
                                            }
                                        }
                                        i3++;
                                        trackInfo = trackInfoArr;
                                        i2 = i;
                                        i4 = 1;
                                    }
                                    i = i2;
                                    i3++;
                                    trackInfo = trackInfoArr;
                                    i2 = i;
                                    i4 = 1;
                                }
                                if (!map.isEmpty()) {
                                    zzcgeVar.zze("onMetadataEvent", map);
                                }
                            }
                        } catch (RuntimeException e9) {
                            zzt.zzh().f("AdMediaPlayerView.reportMetadata", e9);
                        }
                    }
                    zzcfs zzcfsVar = zzcfiVar.q;
                    if (zzcfsVar != null) {
                        zzcfsVar.zzb();
                        return;
                    }
                    return;
                case 21:
                    zzcgw zzcgwVar = (zzcgw) this.b;
                    String str6 = (String) this.c;
                    zzcfs zzcfsVar2 = zzcgwVar.g;
                    if (zzcfsVar2 != null) {
                        zzcfsVar2.zzf("ExoPlayerAdapter error", str6);
                        return;
                    }
                    return;
                case 22:
                    int i10 = zzcit.w;
                    ((zzcge) this.b).zze("onGcacheInfoEvent", (HashMap) this.c);
                    return;
                case 23:
                    ((j3) this.b).i((String) this.c);
                    return;
                case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY  :
                    ((zzckw) this.b).a.zza(Uri.parse((String) this.c));
                    return;
                case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT  :
                    be2 be2Var = (be2) this.b;
                    Runnable runnable = (Runnable) this.c;
                    yg0.i("Adapters must be initialized on the main thread.");
                    HashMap map2 = zzt.zzh().i().zzi().c;
                    if (map2.isEmpty()) {
                        return;
                    }
                    if (runnable != null) {
                        try {
                            runnable.run();
                        } catch (Throwable th3) {
                            zzo.zzj("Could not initialize rewarded ads.", th3);
                            return;
                        }
                        break;
                    }
                    if (((zzbtt) be2Var.c.a.c.get()) != null) {
                        HashMap map3 = new HashMap();
                        Iterator it = map2.values().iterator();
                        while (it.hasNext()) {
                            for (zzbtm zzbtmVar : ((zzbtn) it.next()).a) {
                                String str7 = zzbtmVar.b;
                                for (String str8 : zzbtmVar.a) {
                                    if (!map3.containsKey(str8)) {
                                        map3.put(str8, new ArrayList());
                                    }
                                    if (str7 != null) {
                                        ((List) map3.get(str8)).add(str7);
                                    }
                                }
                            }
                        }
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : map3.entrySet()) {
                            String str9 = (String) entry.getKey();
                            try {
                                zzekj zzekjVarZza = be2Var.d.zza(str9, jSONObject);
                                if (zzekjVarZza != null) {
                                    zzfki zzfkiVar = (zzfki) zzekjVarZza.b;
                                    boolean zA2 = zzfkiVar.a();
                                    zzbtw zzbtwVar = zzfkiVar.a;
                                    if (!zA2) {
                                        try {
                                            if (zzbtwVar.zzx()) {
                                                try {
                                                    zzbtwVar.zzy(new a(be2Var.a), (zzelw) zzekjVarZza.c, (List) entry.getValue());
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str9).length() + 45);
                                                    sb2.append("Initialized rewarded video mediation adapter ");
                                                    sb2.append(str9);
                                                    zzo.zzd(sb2.toString());
                                                } finally {
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } catch (zzfjr e10) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(str9).length() + 56);
                                sb3.append("Failed to initialize rewarded video mediation adapter \"");
                                sb3.append(str9);
                                sb3.append("\"");
                                zzo.zzj(sb3.toString(), e10);
                            }
                        }
                        return;
                    }
                    return;
                case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED  :
                    ve2 ve2Var = (ve2) this.b;
                    Throwable th4 = (Throwable) this.c;
                    boolean zBooleanValue2 = ((Boolean) zzbd.zzc().a(p32.Mb)).booleanValue();
                    Context context2 = ve2Var.a;
                    if (zBooleanValue2) {
                        zzbyr zzbyrVarC = z82.c(context2);
                        ve2Var.i = zzbyrVarC;
                        zzbyrVarC.zzh(th4, "AttributionReporting.getUpdatedUrlAndRegisterSource");
                        return;
                    } else {
                        zzbyr zzbyrVarA = z82.a(context2);
                        ve2Var.h = zzbyrVarA;
                        zzbyrVarA.zzh(th4, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
                        return;
                    }
                case 27:
                    zzctc zzctcVar = (zzctc) this.b;
                    JSONObject jSONObject2 = (JSONObject) this.c;
                    String string = jSONObject2.toString();
                    StringBuilder sb4 = new StringBuilder(string.length() + 31);
                    sb4.append("Calling AFMA_updateActiveView(");
                    sb4.append(string);
                    sb4.append(")");
                    zzo.zzd(sb4.toString());
                    zzctcVar.a.zzb("AFMA_updateActiveView", jSONObject2);
                    return;
                case ErrorCodes.SSH_FX_FILE_CORRUPT  :
                    zzdm zzdmVar = (zzdm) this.b;
                    Integer num = (Integer) this.c;
                    if (zzdmVar.f == 0) {
                        Object obj3 = zzdmVar.d;
                        zzdmVar.d = num;
                        if (obj3.equals(num)) {
                            return;
                        }
                        zzdmVar.c.zza(obj3, num);
                        return;
                    }
                    return;
                default:
                    zzdm zzdmVar2 = (zzdm) this.b;
                    Object objApply = ((jf3) this.c).apply(zzdmVar2.e);
                    zzdmVar2.e = objApply;
                    s33 s33Var = new s33(25, zzdmVar2, objApply);
                    zzdx zzdxVar = zzdmVar2.b;
                    if (zzdxVar.zza().getThread().isAlive()) {
                        zzdxVar.zzn(s33Var);
                        return;
                    }
                    return;
            }
        } finally {
            ((am) this.c).g = null;
        }
        ((am) this.c).g = null;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return db0.class.getSimpleName() + "," + ((FutureCallback) this.c);
            default:
                return super.toString();
        }
    }

    public   db0(Object obj, int i, Object obj2, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
