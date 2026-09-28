package defpackage;

import android.app.ApplicationExitInfo;
import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.g;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.ClampedCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.android.ump.FormError;
import com.google.common.base.Function;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.v2ray.ang.Hometab;
import com.v2ray.ang.util.GoogleMobileAdsConsentManager;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p60 implements SuccessContinuation, ComponentFactory, Function, Continuation, OnCompleteListener, TabLayoutMediator.TabConfigurationStrategy, GoogleMobileAdsConsentManager.OnConsentGatheringCompleteListener, ShapeAppearanceModel.CornerSizeUnaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ p60(vb0 vb0Var) {
        this.a = 9;
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo a(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ void b() {
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void c(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void d(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void f(String str) throws IOException {
        throw new IOException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void g(String str, int i, Object obj) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4 + obj5);
    }

    public static /* synthetic */ void k(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void l(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void m() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void n(String str) throws InvalidKeyException {
        throw new InvalidKeyException(str);
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2) {
        throw new NoSuchElementException(str + obj + obj2);
    }

    public static /* synthetic */ void p() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.base.Function, androidx.camera.core.impl.utils.futures.AsyncFunction
    public Object apply(Object obj) {
        switch (this.a) {
            case 6:
                return Boolean.valueOf(((List) obj).contains(String.class));
            case 7:
                return Boolean.valueOf(((List) obj).contains(Throwable.class));
            default:
                return Arrays.asList(((Constructor) obj).getParameterTypes());
        }
    }

    @Override // com.v2ray.ang.util.GoogleMobileAdsConsentManager.OnConsentGatheringCompleteListener
    public void consentGatheringComplete(FormError formError) {
        Hometab.Companion companion = Hometab.n;
        if (formError != null) {
            String.format("%s: %s", Arrays.copyOf(new Object[]{Integer.valueOf(formError.a), formError.b}, 2));
        }
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object create(ComponentContainer componentContainer) {
        switch (this.a) {
            case 1:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(componentContainer);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(componentContainer);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Hometab.Companion companion = Hometab.n;
        task.getClass();
        task.m();
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i) {
        Hometab.Companion companion = Hometab.n;
        tab.getClass();
        tab.a(i == 0 ? "Home" : "Logs");
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws IOException {
        Bundle bundle = (Bundle) task.j();
        if (bundle == null) {
            f("SERVICE_NOT_AVAILABLE");
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            f("INSTANCE_ID_RESET");
            return null;
        }
        if (string3 != null) {
            f(string3);
            return null;
        }
        bundle.toString();
        new Throwable();
        f("SERVICE_NOT_AVAILABLE");
        return null;
    }

    public /* synthetic */ p60(int i) {
        this.a = i;
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public CornerSize apply(CornerSize cornerSize) {
        int i = MaskableFrameLayout.g;
        return cornerSize instanceof AbsoluteCornerSize ? new ClampedCornerSize(((AbsoluteCornerSize) cornerSize).a) : cornerSize;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        wf1 wf1Var = (wf1) obj;
        wf1Var.getClass();
        tf1 tf1Var = new tf1("S", "all_users");
        uf1 uf1Var = wf1Var.h;
        synchronized (uf1Var) {
            uf1Var.b.b(tf1Var.c);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        wf1Var.a(tf1Var, taskCompletionSource);
        g gVar = taskCompletionSource.a;
        wf1Var.g();
        return gVar;
    }
}
