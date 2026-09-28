package defpackage;

import androidx.datastore.preferences.protobuf.ListValueOrBuilder;
import androidx.datastore.preferences.protobuf.f2;
import androidx.datastore.preferences.protobuf.n3;
import androidx.datastore.preferences.protobuf.y1;
import java.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gl0 extends y1 implements ListValueOrBuilder {
    @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public final n3 getValues(int i) {
        return ((f2) this.b).getValues(i);
    }

    @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public final int getValuesCount() {
        return ((f2) this.b).getValuesCount();
    }

    @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public final List getValuesList() {
        return DesugarCollections.unmodifiableList(((f2) this.b).getValuesList());
    }
}
