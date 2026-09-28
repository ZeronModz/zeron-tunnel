package defpackage;

import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import androidx.lifecycle.viewmodel.internal.SynchronizedObject;
import com.v2ray.ang.viewmodel.MainViewModel;
import kotlin.NotImplementedError;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rn1 {
    public static final SynchronizedObject a = new SynchronizedObject();

    public static final CloseableCoroutineScope a(MainViewModel mainViewModel) {
        CloseableCoroutineScope closeableCoroutineScope;
        CoroutineContext coroutineContextE;
        synchronized (a) {
            closeableCoroutineScope = (CloseableCoroutineScope) mainViewModel.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (closeableCoroutineScope == null) {
                try {
                    lv lvVar = oy.a;
                    coroutineContextE = bn0.a.e();
                } catch (IllegalStateException unused) {
                    coroutineContextE = EmptyCoroutineContext.INSTANCE;
                } catch (NotImplementedError unused2) {
                    coroutineContextE = EmptyCoroutineContext.INSTANCE;
                }
                CloseableCoroutineScope closeableCoroutineScope2 = new CloseableCoroutineScope(coroutineContextE.plus(a.c()));
                mainViewModel.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", closeableCoroutineScope2);
                closeableCoroutineScope = closeableCoroutineScope2;
            }
        }
        return closeableCoroutineScope;
    }
}
