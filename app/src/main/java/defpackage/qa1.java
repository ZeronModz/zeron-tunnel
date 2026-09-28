package defpackage;

import androidx.camera.core.impl.SessionConfig$ErrorListener;
import androidx.camera.core.impl.SessionConfig$SessionError;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.k;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.camera.core.streamsharing.c;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qa1 implements SessionConfig$ErrorListener {
    public final /* synthetic */ StreamSharing a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ UseCaseConfig d;
    public final /* synthetic */ StreamSpec e;
    public final /* synthetic */ StreamSpec f;

    public /* synthetic */ qa1(StreamSharing streamSharing, String str, String str2, UseCaseConfig useCaseConfig, StreamSpec streamSpec, StreamSpec streamSpec2) {
        this.a = streamSharing;
        this.b = str;
        this.c = str2;
        this.d = useCaseConfig;
        this.e = streamSpec;
        this.f = streamSpec2;
    }

    @Override // androidx.camera.core.impl.SessionConfig$ErrorListener
    public final void onError(v61 v61Var, SessionConfig$SessionError sessionConfig$SessionError) {
        StreamSharing streamSharing = this.a;
        if (streamSharing.b() == null) {
            return;
        }
        streamSharing.D();
        streamSharing.C(streamSharing.E(this.b, this.c, this.d, this.e, this.f));
        streamSharing.o();
        c cVar = streamSharing.p;
        cVar.getClass();
        w91.i();
        Iterator it = cVar.a.iterator();
        while (it.hasNext()) {
            cVar.onUseCaseReset((k) it.next());
        }
    }
}
