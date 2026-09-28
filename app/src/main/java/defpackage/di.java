package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Trace;
import android.util.Range;
import android.view.Surface;
import androidx.camera.camera2.internal.l0;
import androidx.camera.camera2.internal.u;
import androidx.camera.camera2.internal.z;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.processing.OpenGlRenderer;
import androidx.camera.core.processing.util.GLUtils$InputFormat;
import androidx.camera.core.streamsharing.a;
import androidx.camera.core.streamsharing.d;
import androidx.camera.view.n;
import androidx.collection.ArrayMap;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.b;
import androidx.fragment.app.FragmentActivity;
import androidx.work.DirectExecutor;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzaw;
import com.google.android.gms.internal.consent_sdk.zzbq;
import com.google.android.gms.internal.consent_sdk.zzg;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadFailureListener;
import com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadSuccessListener;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.messaging.EnhancedIntentService;
import com.google.firebase.platforminfo.LibraryVersionComponent$VersionExtractor;
import com.v2ray.ang.util.GoogleMobileAdsConsentManager;
import java.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class di implements AsyncFunction, Config.OptionMatcher, ComponentFactory, SurfaceRequest.TransformationInfoListener, OnCompleteListener, ConsentInformation.OnConsentInfoUpdateSuccessListener, ImageReaderProxy.OnImageAvailableListener, Deferred.DeferredHandler, Continuation, CallbackToFutureAdapter$Resolver, SynchronizationGuard.CriticalSection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ di(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                z zVar = (z) obj3;
                zVar.close();
                ((ImmediateSurface) obj2).a();
                return zVar.release(false);
            case 1:
                return yg0.x(new ya0((oh) obj2, ((u) obj3).c, 3000L, 1));
            case 13:
                List list = (List) obj2;
                List list2 = (List) obj;
                ((l0) obj3).toString();
                Objects.toString(list2);
                km0.a("SyncCaptureSessionBase");
                return list2.isEmpty() ? new rf0(new IllegalArgumentException("Unable to open capture session without surfaces"), 1) : list2.contains(null) ? new rf0(new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) list.get(list2.indexOf(null))), 1) : xg0.m(list2);
            default:
                List list3 = (List) obj2;
                a aVar = ((d) obj3).b;
                Object objRetrieveOption = 100;
                try {
                    objRetrieveOption = ((el) list3.get(0)).b.retrieveOption(el.j);
                    break;
                } catch (IllegalArgumentException unused) {
                }
                Integer num = (Integer) objRetrieveOption;
                Objects.requireNonNull(num);
                int iIntValue = num.intValue();
                Object objRetrieveOption2 = 0;
                try {
                    objRetrieveOption2 = ((el) list3.get(0)).b.retrieveOption(el.i);
                    break;
                } catch (IllegalArgumentException unused2) {
                }
                Integer num2 = (Integer) objRetrieveOption2;
                Objects.requireNonNull(num2);
                return aVar.jpegSnapshot(iIntValue, num2.intValue());
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(b bVar) {
        int i = this.a;
        int i2 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 12:
                Range range = SurfaceRequest.p;
                ((AtomicReference) obj).set(bVar);
                return "SurfaceRequest-surface-recreation(" + ((SurfaceRequest) obj2).hashCode() + ")";
            case 13:
            default:
                bVar.getClass();
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                bVar.a(new hl0(atomicBoolean, 1), DirectExecutor.INSTANCE);
                ((Executor) obj2).execute(new il0(atomicBoolean, bVar, (Function0) obj, 1));
                return mk1.a;
            case 14:
                n nVar = (n) obj2;
                Surface surface = (Surface) obj;
                km0.a("TextureViewImpl");
                SurfaceRequest surfaceRequest = nVar.h;
                fy fyVarB = fy.b();
                Objects.requireNonNull(bVar);
                surfaceRequest.b(surface, fyVarB, new nc1(bVar, i2));
                return "provideSurface[request=" + nVar.h + " surface=" + surface + "]";
        }
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object create(ComponentContainer componentContainer) {
        int i = this.a;
        Object obj = this.c;
        String str = (String) this.b;
        switch (i) {
            case 3:
                jp jpVar = (jp) obj;
                try {
                    Trace.beginSection(str);
                    return jpVar.f.create(componentContainer);
                } finally {
                    Trace.endSection();
                }
            default:
                return new rb(str, ((LibraryVersionComponent$VersionExtractor) obj).extract((Context) componentContainer.get(Context.class)));
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        int i = this.a;
        Object obj = this.c;
        Uploader uploader = (Uploader) this.b;
        switch (i) {
            case 15:
                uploader.c.recordSuccess((Iterable) obj);
                break;
            default:
                Iterator it = ((HashMap) obj).entrySet().iterator();
                while (it.hasNext()) {
                    uploader.i.recordLogEventDropped(((Integer) r2.getValue()).intValue(), LogEventDropped$Reason.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        Deferred.DeferredHandler deferredHandler = (Deferred.DeferredHandler) this.b;
        Deferred.DeferredHandler deferredHandler2 = (Deferred.DeferredHandler) this.c;
        deferredHandler.handle(provider);
        deferredHandler2.handle(provider);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.b;
        Intent intent = (Intent) this.c;
        int i = EnhancedIntentService.f;
        enhancedIntentService.a(intent);
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
    public void onConsentInfoUpdateSuccess() {
        final FragmentActivity fragmentActivity = (FragmentActivity) this.b;
        final GoogleMobileAdsConsentManager.OnConsentGatheringCompleteListener onConsentGatheringCompleteListener = (GoogleMobileAdsConsentManager.OnConsentGatheringCompleteListener) this.c;
        GoogleMobileAdsConsentManager.Companion companion = GoogleMobileAdsConsentManager.b;
        final ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = new ConsentForm.OnConsentFormDismissedListener() { // from class: xb0
            @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
            public final void onConsentFormDismissed(FormError formError) {
                GoogleMobileAdsConsentManager.Companion companion2 = GoogleMobileAdsConsentManager.b;
                onConsentGatheringCompleteListener.consentGatheringComplete(formError);
            }
        };
        if (zza.a(fragmentActivity).b().canRequestAds()) {
            onConsentFormDismissedListener.onConsentFormDismissed(null);
            return;
        }
        b62 b62Var = (b62) ((yw1) zza.a(fragmentActivity)).f.zza();
        af2.a();
        UserMessagingPlatform$OnConsentFormLoadSuccessListener userMessagingPlatform$OnConsentFormLoadSuccessListener = new UserMessagingPlatform$OnConsentFormLoadSuccessListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbm
            @Override // com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                consentForm.show(fragmentActivity, onConsentFormDismissedListener);
            }
        };
        UserMessagingPlatform$OnConsentFormLoadFailureListener userMessagingPlatform$OnConsentFormLoadFailureListener = new UserMessagingPlatform$OnConsentFormLoadFailureListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbn
            @Override // com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(FormError formError) {
                onConsentFormDismissedListener.onConsentFormDismissed(formError);
            }
        };
        b62Var.getClass();
        af2.a();
        zzbq zzbqVar = (zzbq) b62Var.c.get();
        if (zzbqVar == null) {
            userMessagingPlatform$OnConsentFormLoadFailureListener.onConsentFormLoadFailure(new zzg(3, "No available form can be built.").zza());
        } else {
            ((zzaw) b62Var.a.zza()).zza(zzbqVar).zzb().zza().a(userMessagingPlatform$OnConsentFormLoadSuccessListener, userMessagingPlatform$OnConsentFormLoadFailureListener);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 8:
                ((ImageReaderProxy.OnImageAvailableListener) obj).onImageAvailable((mt0) obj2);
                break;
            default:
                ((ImageReaderProxy.OnImageAvailableListener) obj).onImageAvailable((SafeCloseImageReaderProxy) obj2);
                break;
        }
    }

    @Override // androidx.camera.core.impl.Config.OptionMatcher
    public boolean onOptionMatched(jq jqVar) {
        CaptureRequestOptions.Builder builder = (CaptureRequestOptions.Builder) this.b;
        Config config = (Config) this.c;
        builder.a.insertOption(jqVar, config.getOptionPriority(jqVar), config.retrieveOption(jqVar));
        return true;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(qc1 qc1Var) {
        tv tvVar = (tv) this.b;
        SurfaceRequest surfaceRequest = (SurfaceRequest) this.c;
        GLUtils$InputFormat gLUtils$InputFormat = GLUtils$InputFormat.DEFAULT;
        if (surfaceRequest.c.a() && ((xc) qc1Var).d) {
            gLUtils$InputFormat = GLUtils$InputFormat.YUV;
        }
        OpenGlRenderer openGlRenderer = tvVar.a;
        hb0.d(openGlRenderer.a, true);
        hb0.c(openGlRenderer.c);
        if (openGlRenderer.l != gLUtils$InputFormat) {
            openGlRenderer.l = gLUtils$InputFormat;
            openGlRenderer.k(openGlRenderer.m);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        i31 i31Var = (i31) this.b;
        String str = (String) this.c;
        synchronized (i31Var) {
            ((ArrayMap) i31Var.c).remove(str);
        }
        return task;
    }
}
