package defpackage;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g30 implements Subscriber, Publisher {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public g30(Executor executor) {
        this.c = executor;
    }

    public final synchronized Set a(Event event) {
        Map map;
        try {
            map = (Map) this.a.get(event.a);
        } catch (Throwable th) {
            throw th;
        }
        return map == null ? Collections.EMPTY_SET : map.entrySet();
    }

    @Override // com.google.firebase.events.Publisher
    public final void publish(Event event) {
        event.getClass();
        synchronized (this) {
            try {
                ArrayDeque arrayDeque = this.b;
                if (arrayDeque != null) {
                    arrayDeque.add(event);
                    return;
                }
                for (Map.Entry entry : a(event)) {
                    ((Executor) entry.getValue()).execute(new f20(10, entry, event));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public final synchronized void subscribe(Class cls, Executor executor, EventHandler eventHandler) {
        try {
            cls.getClass();
            eventHandler.getClass();
            executor.getClass();
            if (!this.a.containsKey(cls)) {
                this.a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(cls)).put(eventHandler, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public final synchronized void unsubscribe(Class cls, EventHandler eventHandler) {
        cls.getClass();
        eventHandler.getClass();
        if (this.a.containsKey(cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a.get(cls);
            concurrentHashMap.remove(eventHandler);
            if (concurrentHashMap.isEmpty()) {
                this.a.remove(cls);
            }
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public final void subscribe(Class cls, EventHandler eventHandler) {
        subscribe(cls, this.c, eventHandler);
    }
}
