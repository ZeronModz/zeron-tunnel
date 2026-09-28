package defpackage;

import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.analytics.connector.b;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uu1 implements EventHandler {
    public static final /* synthetic */ uu1 a = new uu1();

    @Override // com.google.firebase.events.EventHandler
    public final void handle(Event event) {
        boolean z = ((DataCollectionDefaultChange) event.b).a;
        synchronized (b.class) {
            b bVar = b.c;
            yg0.m(bVar);
            ss2 ss2Var = bVar.a.a;
            ss2Var.getClass();
            ss2Var.c(new cp2(ss2Var, z));
        }
    }
}
