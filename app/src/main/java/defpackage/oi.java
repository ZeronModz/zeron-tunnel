package defpackage;

import androidx.arch.core.util.Function;
import androidx.camera.lifecycle.b;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.view.i;
import androidx.work.impl.model.WorkSpec;
import androidx.work.multiprocess.RemoteWorkManagerClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oi implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ oi(int i) {
        this.a = i;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return null;
            case 2:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
            case 3:
                return Boolean.FALSE;
            case 4:
                return new i((b) obj);
            case 5:
                return null;
            case 6:
                oi oiVar = RemoteWorkManagerClient.i;
                return null;
            case 7:
                return null;
            case 8:
                try {
                    return sm1.a(rm1.c((cd) obj), null);
                } catch (InvalidConfigException unused) {
                    km0.h("VideoEncoderInfoImpl");
                    return null;
                }
            default:
                List list = (List) obj;
                WorkSpec.Companion companion = WorkSpec.y;
                if (list != null) {
                    arrayList = new ArrayList(c.l(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((WorkSpec.WorkInfoPojo) it.next()).a());
                    }
                }
                return arrayList;
        }
    }
}
