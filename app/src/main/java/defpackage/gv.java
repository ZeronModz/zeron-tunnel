package defpackage;

import android.content.Context;
import com.google.firebase.a;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.HeartBeatConsumer;
import com.google.firebase.heartbeatinfo.c;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gv implements ComponentFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Qualified b;

    public /* synthetic */ gv(Qualified qualified, int i) {
        this.a = i;
        this.b = qualified;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        int i = this.a;
        Qualified qualified = this.b;
        switch (i) {
            case 0:
                return new c((Context) componentContainer.get(Context.class), ((a) componentContainer.get(a.class)).d(), componentContainer.setOf(HeartBeatConsumer.class), componentContainer.getProvider(UserAgentPublisher.class), (Executor) componentContainer.get(qualified));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(qualified, componentContainer);
        }
    }
}
