package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import androidx.camera.view.RotationProvider;
import androidx.camera.view.j;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class c41 extends OrientationEventListener {
    public int a;
    public final /* synthetic */ RotationProvider b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c41(RotationProvider rotationProvider, Context context) {
        super(context);
        this.b = rotationProvider;
        this.a = -1;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        ArrayList<j> arrayList;
        if (i == -1) {
            return;
        }
        int i2 = (i >= 315 || i < 45) ? 0 : i >= 225 ? 1 : i >= 135 ? 2 : 3;
        if (this.a != i2) {
            this.a = i2;
            synchronized (this.b.a) {
                arrayList = new ArrayList(this.b.c.values());
            }
            if (arrayList.isEmpty()) {
                return;
            }
            for (j jVar : arrayList) {
                jVar.b.execute(new wf(jVar, i2, 6));
            }
        }
    }
}
