package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.zag;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gt1 extends zag {
    public final /* synthetic */ int a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gt1(Intent intent, Object obj, int i) {
        this.a = i;
        this.b = intent;
        this.c = obj;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        Intent intent = this.b;
        switch (i) {
            case 0:
                if (intent != null) {
                    ((GoogleApiActivity) obj).startActivityForResult(intent, 2);
                }
                break;
            default:
                if (intent != null) {
                    ((LifecycleFragment) obj).startActivityForResult(intent, 2);
                }
                break;
        }
    }
}
