package defpackage;

import io.ktor.client.plugins.HttpRequestRetryConfig;
import io.ktor.client.plugins.HttpRetryDelayContext;
import io.ktor.client.plugins.HttpRetryModifyRequestContext;
import io.ktor.client.request.HttpRequestBuilder;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.a;
import kotlin.jvm.functions.Function2;
import kotlin.random.Random;
import kotlinx.coroutines.CopyableThreadContextElement;
import kotlinx.coroutines.ThreadContextElement;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class so implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ so(HttpRequestRetryConfig httpRequestRetryConfig) {
        this.a = 9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CombinedContext combinedContext;
        boolean z = true;
        switch (this.a) {
            case 0:
                return CombinedContext.toString$lambda$2((String) obj, (CoroutineContext.Element) obj2);
            case 1:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                List list = le0.a;
                return Boolean.valueOf(!r4.equalsIgnoreCase("Content-Length"));
            case 2:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                List list2 = le0.a;
                return Boolean.valueOf(!r4.equalsIgnoreCase("Content-Length"));
            case 3:
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ConcurrentWeakMap.b;
                return obj;
            case 4:
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                coroutineContext.getClass();
                element.getClass();
                CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(element.getA());
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                if (coroutineContextMinusKey == emptyCoroutineContext) {
                    return element;
                }
                a aVar = ContinuationInterceptor.Key;
                ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContextMinusKey.get(aVar);
                if (continuationInterceptor == null) {
                    combinedContext = new CombinedContext(coroutineContextMinusKey, element);
                } else {
                    CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(aVar);
                    if (coroutineContextMinusKey2 == emptyCoroutineContext) {
                        return new CombinedContext(element, continuationInterceptor);
                    }
                    combinedContext = new CombinedContext(new CombinedContext(coroutineContextMinusKey2, element), continuationInterceptor);
                }
                return combinedContext;
            case 5:
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                if (!((Boolean) obj).booleanValue() && !(element2 instanceof CopyableThreadContextElement)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                CoroutineContext coroutineContext2 = (CoroutineContext) obj;
                CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                return element3 instanceof CopyableThreadContextElement ? coroutineContext2.plus(((CopyableThreadContextElement) element3).copyForChild()) : coroutineContext2.plus(element3);
            case 7:
                return Boolean.valueOf(yg0.a(obj, obj2));
            case 8:
                ((HttpRetryModifyRequestContext) obj).getClass();
                ((HttpRequestBuilder) obj2).getClass();
                return mk1.a;
            case 9:
                int iIntValue = ((Integer) obj2).intValue();
                ((HttpRetryDelayContext) obj).getClass();
                return Long.valueOf(Random.INSTANCE.nextLong(1000L) + Math.min((long) (Math.pow(2.0d, iIntValue - 1) * 1000.0d), 60000L));
            case 10:
                return Integer.valueOf(SafeCollector.collectContextSize$lambda$0(((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            case 11:
                CoroutineContext.Element element4 = (CoroutineContext.Element) obj2;
                if (!(element4 instanceof ThreadContextElement)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue2 = num != null ? num.intValue() : 1;
                return iIntValue2 == 0 ? element4 : Integer.valueOf(iIntValue2 + 1);
            default:
                ThreadContextElement threadContextElement = (ThreadContextElement) obj;
                CoroutineContext.Element element5 = (CoroutineContext.Element) obj2;
                if (threadContextElement != null) {
                    return threadContextElement;
                }
                if (element5 instanceof ThreadContextElement) {
                    return (ThreadContextElement) element5;
                }
                return null;
        }
    }

    public /* synthetic */ so(int i) {
        this.a = i;
    }
}
