package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.f0;
import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.y1;
import java.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qw extends y1 implements DescriptorProtos$EnumDescriptorProtoOrBuilder {
    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final String getName() {
        return ((d0) this.b).getName();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final ByteString getNameBytes() {
        return ((d0) this.b).getNameBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final f0 getOptions() {
        return ((d0) this.b).getOptions();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final String getReservedName(int i) {
        return ((d0) this.b).getReservedName(i);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final ByteString getReservedNameBytes(int i) {
        return ((d0) this.b).getReservedNameBytes(i);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final int getReservedNameCount() {
        return ((d0) this.b).getReservedNameCount();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final List getReservedNameList() {
        return DesugarCollections.unmodifiableList(((d0) this.b).getReservedNameList());
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final c0 getReservedRange(int i) {
        return ((d0) this.b).getReservedRange(i);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final int getReservedRangeCount() {
        return ((d0) this.b).getReservedRangeCount();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final List getReservedRangeList() {
        return DesugarCollections.unmodifiableList(((d0) this.b).getReservedRangeList());
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final g0 getValue(int i) {
        return ((d0) this.b).getValue(i);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final int getValueCount() {
        return ((d0) this.b).getValueCount();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final List getValueList() {
        return DesugarCollections.unmodifiableList(((d0) this.b).getValueList());
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final boolean hasName() {
        return ((d0) this.b).hasName();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final boolean hasOptions() {
        return ((d0) this.b).hasOptions();
    }
}
