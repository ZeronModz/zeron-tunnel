package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder;
import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.h1;
import androidx.datastore.preferences.protobuf.j1;
import androidx.datastore.preferences.protobuf.y1;
import java.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dx extends y1 implements DescriptorProtos$ServiceDescriptorProtoOrBuilder {
    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public final b1 getMethod(int i) {
        return ((h1) this.b).getMethod(i);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public final int getMethodCount() {
        return ((h1) this.b).getMethodCount();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public final List getMethodList() {
        return DesugarCollections.unmodifiableList(((h1) this.b).getMethodList());
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public final String getName() {
        return ((h1) this.b).getName();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public final ByteString getNameBytes() {
        return ((h1) this.b).getNameBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public final j1 getOptions() {
        return ((h1) this.b).getOptions();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public final boolean hasName() {
        return ((h1) this.b).hasName();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public final boolean hasOptions() {
        return ((h1) this.b).hasOptions();
    }
}
