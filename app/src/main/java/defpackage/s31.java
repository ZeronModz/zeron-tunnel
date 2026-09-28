package defpackage;

import android.adservices.topics.TopicsManager;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.common.base.Function;
import com.google.common.collect.TreeBasedTable;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.DependencyException;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.datatransport.TransportRegistrar;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.io.File;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s31 implements Continuation, OnApplyWindowInsetsListener, TextInputLayout.LengthCounter, TransportScheduleCallback, ComponentFactory, Function {
    public final /* synthetic */ int a;

    public static /* bridge */ /* synthetic */ TopicsManager a(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* synthetic */ void c() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void d(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void f(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void g(String str, Object obj, Object obj2) {
        throw new DependencyException(str + obj + obj2);
    }

    public static /* synthetic */ void h(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* bridge */ /* synthetic */ Class i() {
        return TopicsManager.class;
    }

    public static /* synthetic */ void j(int i, String str) throws InvalidObjectException {
        throw new InvalidObjectException(str + i + '.');
    }

    public static /* synthetic */ void k(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2) throws IOException {
        throw new IOException(str + obj + obj2);
    }

    public static /* synthetic */ void m(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void n(int i, String str) {
        throw new IllegalArgumentException((str + i + '.').toString());
    }

    @Override // com.google.common.base.Function, androidx.camera.core.impl.utils.futures.AsyncFunction
    public Object apply(Object obj) {
        return TreeBasedTable.lambda$createColumnKeyIterator$0((Map) obj);
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public int countLength(Editable editable) {
        int[][] iArr = TextInputLayout.C0;
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object create(ComponentContainer componentContainer) {
        switch (this.a) {
            case 23:
                return TransportRegistrar.lambda$getComponents$0(componentContainer);
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                return TransportRegistrar.lambda$getComponents$1(componentContainer);
            default:
                return TransportRegistrar.lambda$getComponents$2(componentContainer);
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        view.getClass();
        windowInsetsCompat.getClass();
        og0 og0VarG = windowInsetsCompat.a.g(2);
        og0VarG.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int i = og0VarG.d;
        layoutParams2.height = i;
        view.setLayoutParams(layoutParams2);
        view.setVisibility(i > 0 ? 0 : 8);
        return windowInsetsCompat;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z;
        if (task.m()) {
            CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) task.i();
            Logger logger = Logger.b;
            crashlyticsReportWithSessionId.getClass();
            logger.a(3);
            File fileB = crashlyticsReportWithSessionId.b();
            if (fileB.delete()) {
                fileB.getPath();
                logger.a(3);
            } else {
                fileB.getPath();
                logger.a(5);
            }
            z = true;
        } else {
            Logger logger2 = Logger.b;
            task.h();
            logger2.a(5);
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public /* synthetic */ s31(int i) {
        this.a = i;
    }

    @Override // com.google.android.datatransport.TransportScheduleCallback
    public void onSchedule(Exception exc) {
    }
}
