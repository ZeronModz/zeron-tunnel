package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView;
import androidx.camera.camera2.internal.r;
import androidx.camera.camera2.internal.t;
import androidx.camera.camera2.internal.z;
import androidx.camera.core.CameraX;
import androidx.camera.core.ImageAnalysis$Analyzer;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.video.h;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.OutputConfig;
import androidx.camera.view.LifecycleCameraController;
import androidx.camera.view.PreviewView;
import androidx.camera.view.RotationProvider;
import androidx.camera.view.c;
import androidx.camera.view.impl.ZoomGestureDetector;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.b;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.datatransport.cct.internal.LogResponse;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.google.common.base.Function;
import com.google.common.graph.AbstractNetwork;
import com.google.common.graph.Network;
import com.google.common.graph.ValueGraph;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.a;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.BuildIdInfo;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.d;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.UnsafeAllocator;
import com.trilead.ssh2.sftp.ErrorCodes;
import com.v2ray.ang.Hometab;
import com.v2ray.ang.ui.HomeFragment;
import com.v2ray.ang.ui.LogcatActivity;
import com.v2ray.ang.util.GoogleMobileAdsConsentManager;
import io.github.g00fy2.quickie.QRCodeAnalyzer;
import java.util.Objects;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b1 implements Function, AccessibilityViewCommand, AsyncFunction, RotationProvider.Listener, CallbackToFutureAdapter$Resolver, ImageReaderProxy.OnImageAvailableListener, com.google.android.datatransport.runtime.retries.Function, ObjectConstructor, Deferred.DeferredHandler, ComponentFactory, Continuation, AccessibilityManagerCompat$TouchExplorationStateChangeListener, OutputConfig, ConsentInformation.OnConsentInfoUpdateFailureListener, TabLayoutMediator.TabConfigurationStrategy, OnSuccessListener, ImageAnalysis$Analyzer, SearchView.OnCloseListener, ZoomGestureDetector.OnZoomGestureListener, Encoder.SurfaceInput.OnSurfaceUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final Object a(b bVar) {
        String str;
        z zVar = (z) this.b;
        synchronized (zVar.a) {
            jx0.g("Release completer expected to be null", zVar.k == null);
            zVar.k = bVar;
            str = "Release[session=" + zVar + "]";
        }
        return str;
    }

    @Override // androidx.camera.core.ImageAnalysis$Analyzer
    public void analyze(ImageProxy imageProxy) {
        ((QRCodeAnalyzer) this.b).analyze(imageProxy);
    }

    @Override // com.google.common.base.Function, androidx.camera.core.impl.utils.futures.AsyncFunction
    public Object apply(Object obj) throws IOException {
        yl ylVar;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((Network) obj2).incidentNodes(obj);
            case 1:
                return ((AbstractNetwork) ((d1) ((c1) obj2).b).b).incidentNodes(obj);
            case 2:
                t20 t20Var = (t20) obj;
                Object objEdgeValueOrDefault = ((ValueGraph) obj2).edgeValueOrDefault(t20Var.a, t20Var.b, null);
                Objects.requireNonNull(objEdgeValueOrDefault);
                return objEdgeValueOrDefault;
            case 9:
                zl zlVar = (zl) obj2;
                xl xlVar = (xl) obj;
                URL url = xlVar.a;
                if (Log.isLoggable(if3.x("CctTransportBackend"), 4)) {
                    String.format("Making request to: %s", url);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) xlVar.a.openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(130000);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                String str = xlVar.c;
                if (str != null) {
                    httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
                }
                try {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                        try {
                            zlVar.a.encode(xlVar.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                            gZIPOutputStream.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            Integer numValueOf = Integer.valueOf(responseCode);
                            if (Log.isLoggable(if3.x("CctTransportBackend"), 4)) {
                                String.format("Status Code: %d", numValueOf);
                            }
                            if3.r("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                            if3.r("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                            if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                                return new yl(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                            }
                            if (responseCode != 200) {
                                return new yl(responseCode, null, 0L);
                            }
                            InputStream inputStream = httpURLConnection.getInputStream();
                            try {
                                InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                                try {
                                    yl ylVar2 = new yl(responseCode, null, LogResponse.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                                    if (gZIPInputStream != null) {
                                        gZIPInputStream.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    return ylVar2;
                                } finally {
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (EncodingException | IOException unused) {
                    Log.isLoggable(if3.x("CctTransportBackend"), 6);
                    ylVar = new yl(400, null, 0L);
                    return ylVar;
                } catch (ConnectException | UnknownHostException unused2) {
                    Log.isLoggable(if3.x("CctTransportBackend"), 6);
                    ylVar = new yl(500, null, 0L);
                    return ylVar;
                }
            default:
                return ((yr0) ((ln0) obj2).d).d.get(obj);
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(b bVar) {
        ListenableFuture listenableFuture;
        switch (this.a) {
            case 6:
                CameraX cameraX = (CameraX) this.b;
                Object obj = CameraX.o;
                CameraRepository cameraRepository = cameraX.a;
                synchronized (cameraRepository.a) {
                    try {
                        boolean zIsEmpty = cameraRepository.b.isEmpty();
                        oh ohVar = cameraRepository.d;
                        ListenableFuture listenableFuture2 = ohVar;
                        oh ohVar2 = ohVar;
                        if (!zIsEmpty) {
                            if (ohVar == null) {
                                b bVar2 = new b();
                                bVar2.c = new n31();
                                oh ohVar3 = new oh(bVar2);
                                bVar2.b = ohVar3;
                                bVar2.a = vh.class;
                                try {
                                    synchronized (cameraRepository.a) {
                                        cameraRepository.e = bVar2;
                                        break;
                                    }
                                    bVar2.a = "CameraRepository-deinit";
                                } catch (Exception e) {
                                    ohVar3.a(e);
                                }
                                cameraRepository.d = ohVar3;
                                ohVar2 = ohVar3;
                            }
                            cameraRepository.c.addAll(cameraRepository.b.values());
                            for (CameraInternal cameraInternal : cameraRepository.b.values()) {
                                cameraInternal.release().addListener(new r4(12, cameraRepository, cameraInternal), fy.b());
                            }
                            cameraRepository.b.clear();
                            listenableFuture = ohVar2;
                        } else if (ohVar == null) {
                            listenableFuture2 = rf0.c;
                        }
                    } finally {
                    }
                }
                listenableFuture.addListener(new r4(13, cameraX, bVar), cameraX.d);
                return "CameraX shutdownInternal";
            case 7:
            default:
                LiveDataObservable liveDataObservable = (LiveDataObservable) this.b;
                ((jc0) dn0.r()).execute(new f20(20, liveDataObservable, bVar));
                return liveDataObservable + " [fetch@" + SystemClock.uptimeMillis() + "]";
            case 8:
                return a(bVar);
        }
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 10:
                Class cls = (Class) obj;
                try {
                    return UnsafeAllocator.a.a(cls);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
                }
            default:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e2) {
                    ii2 ii2Var = g21.a;
                    zu0.l("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
                    return null;
                } catch (InstantiationException e3) {
                    throw new RuntimeException("Failed to invoke constructor '" + g21.b(constructor) + "' with no args", e3);
                } catch (InvocationTargetException e4) {
                    zu0.l("Failed to invoke constructor '" + g21.b(constructor) + "' with no args", e4.getCause());
                    return null;
                }
        }
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object create(ComponentContainer componentContainer) {
        long j;
        int i;
        int i2;
        int i3;
        Logger logger;
        i60 i60Var;
        int i4;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.b;
        int i5 = CrashlyticsRegistrar.d;
        CrashlyticsWorkers.d.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        a aVar = (a) componentContainer.get(a.class);
        FirebaseInstallationsApi firebaseInstallationsApi = (FirebaseInstallationsApi) componentContainer.get(FirebaseInstallationsApi.class);
        Deferred deferred = componentContainer.getDeferred(CrashlyticsNativeComponent.class);
        Deferred deferred2 = componentContainer.getDeferred(AnalyticsConnector.class);
        Deferred deferred3 = componentContainer.getDeferred(FirebaseRemoteConfigInterop.class);
        ExecutorService executorService = (ExecutorService) componentContainer.get(crashlyticsRegistrar.a);
        ExecutorService executorService2 = (ExecutorService) componentContainer.get(crashlyticsRegistrar.b);
        ExecutorService executorService3 = (ExecutorService) componentContainer.get(crashlyticsRegistrar.c);
        aVar.a();
        Context context = aVar.a;
        String packageName = context.getPackageName();
        Logger logger2 = Logger.b;
        logger2.a(4);
        CrashlyticsWorkers crashlyticsWorkers = new CrashlyticsWorkers(executorService, executorService2);
        FileStore fileStore = new FileStore(context);
        DataCollectionArbiter dataCollectionArbiter = new DataCollectionArbiter(aVar);
        IdManager idManager = new IdManager(context, packageName, firebaseInstallationsApi, dataCollectionArbiter);
        CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy = new CrashlyticsNativeComponentDeferredProxy(deferred);
        AnalyticsDeferredProxy analyticsDeferredProxy = new AnalyticsDeferredProxy(deferred2);
        CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber = new CrashlyticsAppQualitySessionsSubscriber(dataCollectionArbiter, fileStore);
        com.google.firebase.sessions.api.a.d(crashlyticsAppQualitySessionsSubscriber);
        CrashlyticsCore crashlyticsCore = new CrashlyticsCore(aVar, idManager, crashlyticsNativeComponentDeferredProxy, dataCollectionArbiter, new o4(analyticsDeferredProxy), new o4(analyticsDeferredProxy), fileStore, crashlyticsAppQualitySessionsSubscriber, new RemoteConfigDeferredProxy(deferred3), crashlyticsWorkers);
        aVar.a();
        String str = aVar.c.b;
        int iE = CommonUtils.e(context, "com.google.firebase.crashlytics.mapping_file_id", TypedValues.Custom.S_STRING);
        if (iE == 0) {
            iE = CommonUtils.e(context, "com.crashlytics.android.build_id", TypedValues.Custom.S_STRING);
        }
        String string = iE != 0 ? context.getResources().getString(iE) : null;
        ArrayList<BuildIdInfo> arrayList = new ArrayList();
        int iE2 = CommonUtils.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iE3 = CommonUtils.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iE4 = CommonUtils.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (iE2 == 0 || iE3 == 0 || iE4 == 0) {
            j = jCurrentTimeMillis;
            i = 3;
            i2 = 2;
            i3 = 0;
            String.format("Could not find resources: %d %d %d", Integer.valueOf(iE2), Integer.valueOf(iE3), Integer.valueOf(iE4));
            logger2.a(3);
        } else {
            i2 = 2;
            String[] stringArray = context.getResources().getStringArray(iE2);
            String[] stringArray2 = context.getResources().getStringArray(iE3);
            String[] stringArray3 = context.getResources().getStringArray(iE4);
            i3 = 0;
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                int i6 = 0;
                while (i6 < stringArray3.length) {
                    arrayList.add(new BuildIdInfo(stringArray[i6], stringArray2[i6], stringArray3[i6]));
                    i6++;
                    jCurrentTimeMillis = jCurrentTimeMillis;
                }
                j = jCurrentTimeMillis;
                i = 3;
            } else {
                j = jCurrentTimeMillis;
                i = 3;
                String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                logger2.a(3);
            }
        }
        Logger.b.a(i);
        for (BuildIdInfo buildIdInfo : arrayList) {
            Logger logger3 = Logger.b;
            String str2 = buildIdInfo.a;
            logger3.a(i);
        }
        DevelopmentPlatformProvider developmentPlatformProvider = new DevelopmentPlatformProvider(context);
        int i7 = i2;
        try {
            AppData appDataA = AppData.a(context, idManager, str, string, arrayList, developmentPlatformProvider);
            logger = Logger.b;
            logger.a(i7);
            d dVarA = d.a(context, str, idManager, new HttpRequestFactory(), appDataA.f, appDataA.g, fileStore, dataCollectionArbiter);
            dVarA.c(crashlyticsWorkers).c(executorService3, new hy(28));
            if (crashlyticsCore.d(appDataA, dVarA)) {
                i4 = i3;
                crashlyticsCore.o.a.a(new gs(crashlyticsCore, dVarA, i4));
            } else {
                i4 = i3;
            }
            i60Var = new i60(i4);
        } catch (PackageManager.NameNotFoundException unused) {
            logger = Logger.b;
            logger.b();
            i60Var = null;
        }
        if (System.currentTimeMillis() - j > 16) {
            logger.a(3);
        }
        return i60Var;
    }

    @Override // androidx.camera.core.ImageAnalysis$Analyzer
    public Size getDefaultTargetResolution() {
        return null;
    }

    @Override // androidx.camera.video.internal.encoder.OutputConfig
    public MediaFormat getMediaFormat() {
        return (MediaFormat) this.b;
    }

    @Override // androidx.camera.core.ImageAnalysis$Analyzer
    public int getTargetCoordinateSystem() {
        return 0;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy = (CrashlyticsNativeComponentDeferredProxy) this.b;
        Logger.b.a(3);
        crashlyticsNativeComponentDeferredProxy.b.set((CrashlyticsNativeComponent) provider.get());
    }

    @Override // androidx.appcompat.widget.SearchView.OnCloseListener
    public boolean onClose() {
        LogcatActivity logcatActivity = (LogcatActivity) this.b;
        int i = LogcatActivity.g;
        logcatActivity.h(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        return false;
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i) {
        List list = (List) this.b;
        int i2 = HomeFragment.f2;
        tab.getClass();
        tab.a((CharSequence) list.get(i));
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
    public void onConsentInfoUpdateFailure(FormError formError) {
        GoogleMobileAdsConsentManager.OnConsentGatheringCompleteListener onConsentGatheringCompleteListener = (GoogleMobileAdsConsentManager.OnConsentGatheringCompleteListener) this.b;
        GoogleMobileAdsConsentManager.Companion companion = GoogleMobileAdsConsentManager.b;
        onConsentGatheringCompleteListener.consentGatheringComplete(formError);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 7:
                ml mlVar = (ml) obj;
                try {
                    ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
                    if (imageProxyAcquireLatestImage != null) {
                        if (mlVar.a == null) {
                            km0.g("CaptureNode");
                            imageProxyAcquireLatestImage.close();
                        } else {
                            ec ecVar = mlVar.d;
                            Objects.requireNonNull(ecVar);
                            ecVar.b.accept(new fc(mlVar.a, imageProxyAcquireLatestImage));
                        }
                    }
                    return;
                } catch (IllegalStateException unused) {
                    km0.c("CaptureNode");
                    return;
                }
            default:
                MetadataImageReader metadataImageReader = (MetadataImageReader) obj;
                synchronized (metadataImageReader.a) {
                    metadataImageReader.c++;
                    break;
                }
                metadataImageReader.c(imageReaderProxy);
                return;
        }
    }

    @Override // androidx.camera.view.RotationProvider.Listener
    public void onRotationChanged(int i) {
        CameraInternal cameraInternalB;
        LifecycleCameraController lifecycleCameraController = (LifecycleCameraController) this.b;
        we0 we0Var = lifecycleCameraController.d;
        if (we0Var.z(i) && (cameraInternalB = we0Var.b()) != null) {
            we0Var.o.b = we0Var.g(cameraInternalB, false);
        }
        ef0 ef0Var = lifecycleCameraController.c;
        int targetRotation = ((ImageOutputConfig) ef0Var.f).getTargetRotation(0);
        if (ef0Var.z(i) && ef0Var.s != null) {
            ef0Var.s = androidx.camera.core.internal.utils.a.b(ef0Var.s, Math.abs(dn0.F(i) - dn0.F(targetRotation)));
        }
        h hVar = lifecycleCameraController.e;
        if (hVar.z(i)) {
            hVar.N();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        t tVar = (t) this.b;
        Hometab.Companion companion = Hometab.n;
        tVar.invoke(obj);
    }

    @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener
    public void onSurfaceUpdate(Surface surface) {
        ((androidx.camera.video.d) this.b).i(surface);
    }

    @Override // androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        b00 b00Var = (b00) this.b;
        AutoCompleteTextView autoCompleteTextView = b00Var.h;
        if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
            return;
        }
        CheckableImageButton checkableImageButton = b00Var.d;
        int i = z ? 2 : 1;
        WeakHashMap weakHashMap = androidx.core.view.h.a;
        checkableImageButton.setImportantForAccessibility(i);
    }

    @Override // androidx.camera.view.impl.ZoomGestureDetector.OnZoomGestureListener
    public boolean onZoomEvent(ZoomGestureDetector.ZoomEvent zoomEvent) {
        PreviewView previewView = (PreviewView) this.b;
        PreviewView.ImplementationMode implementationMode = PreviewView.p;
        if (!(zoomEvent instanceof ZoomGestureDetector.ZoomEvent.Move) || previewView.h == null) {
            return true;
        }
        km0.g("CameraController");
        return true;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.b;
        int i = BottomSheetDragHandleView.m;
        return bottomSheetDragHandleView.a();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 14:
                ((Runnable) obj).run();
                return com.google.android.gms.tasks.b.e(null);
            default:
                return (Task) ((com.google.firebase.crashlytics.internal.common.d) obj).call();
        }
    }

    @Override // androidx.camera.core.ImageAnalysis$Analyzer
    public void updateTransform(Matrix matrix) {
    }

    @Override // com.google.common.base.Function, androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 4:
                ti tiVar = (ti) obj2;
                if (Boolean.TRUE.equals((Boolean) obj)) {
                    long j = tiVar.g;
                    jc0 jc0Var = tiVar.c;
                    androidx.camera.camera2.internal.b bVar = tiVar.d;
                    long j2 = j / 1000000;
                    t tVar = new t(new r(0));
                    bVar.a(tVar);
                    r4 r4Var = new r4(10, bVar, tVar);
                    androidx.camera.core.impl.utils.executor.b bVar2 = bVar.b;
                    oh ohVar = tVar.b;
                    ohVar.b.addListener(r4Var, bVar2);
                    return yg0.x(new ya0(ohVar, jc0Var, j2, 1));
                }
                return rf0.c;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                return ((c) obj2).d.g();
            default:
                return (ListenableFuture) ((Function1) obj2).invoke(obj);
        }
    }
}
