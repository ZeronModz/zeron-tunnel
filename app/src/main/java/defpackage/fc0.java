package defpackage;

import androidx.datastore.core.MulticastFileObserver;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.android.HandlerContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fc0 implements DisposableHandle {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fc0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        switch (this.a) {
            case 0:
                HandlerContext handlerContext = (HandlerContext) this.b;
                handlerContext.c.removeCallbacks((Runnable) this.c);
                return;
            default:
                String str = (String) this.b;
                Function1 function1 = (Function1) this.c;
                synchronized (MulticastFileObserver.c) {
                    MulticastFileObserver.b.getClass();
                    LinkedHashMap linkedHashMap = MulticastFileObserver.d;
                    MulticastFileObserver multicastFileObserver = (MulticastFileObserver) linkedHashMap.get(str);
                    if (multicastFileObserver != null) {
                        multicastFileObserver.a.remove(function1);
                        if (multicastFileObserver.a.isEmpty()) {
                            linkedHashMap.remove(str);
                            multicastFileObserver.stopWatching();
                        }
                    }
                    break;
                }
                return;
        }
    }
}
