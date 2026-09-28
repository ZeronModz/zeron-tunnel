package defpackage;

import androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder;
import androidx.datastore.preferences.protobuf.k1;
import androidx.datastore.preferences.protobuf.l1;
import androidx.datastore.preferences.protobuf.y1;
import java.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ex extends y1 implements DescriptorProtos$SourceCodeInfoOrBuilder {
    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
    public final k1 getLocation(int i) {
        return ((l1) this.b).getLocation(i);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
    public final int getLocationCount() {
        return ((l1) this.b).getLocationCount();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
    public final List getLocationList() {
        return DesugarCollections.unmodifiableList(((l1) this.b).getLocationList());
    }
}
