package defpackage;

import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.internal.d;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class wk0 extends d {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wk0(LinkedTreeMap linkedTreeMap, int i) {
        super(linkedTreeMap);
        this.e = i;
    }

    @Override // com.google.gson.internal.d, java.util.Iterator
    public Object next() {
        switch (this.e) {
            case 1:
                return a().f;
            default:
                return super.next();
        }
    }
}
