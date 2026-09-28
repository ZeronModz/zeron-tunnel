package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.core.provider.FontRequest;
import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import com.google.android.gms.internal.ads.zzcdh;
import java.util.DesugarCollections;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class l80 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l80(zzau zzauVar, zzcdh zzcdhVar, int i, Bundle bundle) {
        this.a = 2;
        this.b = zzauVar;
        this.c = zzcdhVar;
        this.d = i;
        this.e = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Object obj = this.e;
        int i2 = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Object[] objArr = {(FontRequest) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj4 = objArr[0];
                Objects.requireNonNull(obj4);
                arrayList.add(obj4);
                return o80.b((String) obj3, (Context) obj2, DesugarCollections.unmodifiableList(arrayList), i2);
            case 1:
                try {
                    return o80.b((String) obj3, (Context) obj2, (List) obj, i2);
                } catch (Throwable unused) {
                    return new n80(-3);
                }
            default:
                return ((zzau) obj3).zzn((zzcdh) obj2, i2, (Bundle) obj);
        }
    }

    public /* synthetic */ l80(String str, Context context, Object obj, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = context;
        this.e = obj;
        this.d = i;
    }
}
