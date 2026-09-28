package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.camera.camera2.internal.q0;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CaptureConfig$Builder;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.SessionConfig$Builder;
import androidx.camera.video.h;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.b;
import androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.search.SearchBar;
import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Call;
import okhttp3.EventListener;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q21 implements Deferred.DeferredHandler, AccessibilityManagerCompat$TouchExplorationStateChangeListener, SynchronizationGuard.CriticalSection, EventListener.Factory, Continuation, CallbackToFutureAdapter$Resolver, OnCompleteListener, SupportSQLiteOpenHelper.Factory, ImageReaderProxy.OnImageAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q21(h hVar, SessionConfig$Builder sessionConfig$Builder) {
        this.a = 7;
        this.b = sessionConfig$Builder;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(b bVar) {
        SessionConfig$Builder sessionConfig$Builder = (SessionConfig$Builder) this.b;
        Integer numValueOf = Integer.valueOf(bVar.hashCode());
        CaptureConfig$Builder captureConfig$Builder = sessionConfig$Builder.b;
        captureConfig$Builder.g.a.put("androidx.camera.video.VideoCapture.streamUpdate", numValueOf);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        nm1 nm1Var = new nm1(atomicBoolean, bVar, sessionConfig$Builder);
        bVar.a(new vf(atomicBoolean, 18, sessionConfig$Builder, nm1Var), fy.b());
        captureConfig$Builder.b(nm1Var);
        return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(bVar.hashCode()));
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        Context context = (Context) this.b;
        configuration.getClass();
        SupportSQLiteOpenHelper.Configuration.f.getClass();
        SupportSQLiteOpenHelper.Configuration.Builder builder = new SupportSQLiteOpenHelper.Configuration.Builder(context);
        builder.b = configuration.b;
        SupportSQLiteOpenHelper.Callback callback = configuration.c;
        callback.getClass();
        builder.c = callback;
        builder.d = true;
        builder.e = true;
        return new FrameworkSQLiteOpenHelperFactory().create(builder.a());
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                ((Uploader) obj).i.resetClientMetrics();
                break;
            default:
                kr1 kr1Var = (kr1) obj;
                Iterator<TransportContext> it = kr1Var.b.loadActiveContexts().iterator();
                while (it.hasNext()) {
                    kr1Var.c.schedule(it.next(), 1);
                }
                break;
        }
        return null;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        ((FirebaseRemoteConfigInterop) provider.get()).registerRolloutsStateSubscriber("firebase", (CrashlyticsRemoteConfigListener) this.b);
        Logger.b.a(3);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 8:
                j03.g((Intent) obj);
                break;
            case 9:
                ((dr1) obj).b.d(null);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        q0 q0Var = (q0) this.b;
        try {
            ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (imageProxyAcquireLatestImage != null) {
                q0Var.b.enqueue(imageProxyAcquireLatestImage);
            }
        } catch (IllegalStateException e) {
            e.getMessage();
            km0.b("ZslControlImpl");
        }
    }

    @Override // androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        SearchBar searchBar = (SearchBar) this.b;
        int i = SearchBar.m0;
        searchBar.setFocusableInTouchMode(z);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((CountDownLatch) this.b).countDown();
        return null;
    }

    public /* synthetic */ q21(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        EventListener eventListener = (EventListener) this.b;
        call.getClass();
        return eventListener;
    }
}
