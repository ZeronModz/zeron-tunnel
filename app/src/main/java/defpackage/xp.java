package defpackage;

import android.content.Context;
import com.google.firebase.a;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.b;
import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xp implements Provider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xp(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                jp jpVar = (jp) obj;
                return jpVar.f.create(new b(jpVar, (ComponentRuntime) obj2));
            default:
                a aVar = (a) obj2;
                return new DataCollectionConfigStorage((Context) obj, aVar.d(), (Publisher) aVar.d.get(Publisher.class));
        }
    }
}
