package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder;
import androidx.datastore.preferences.protobuf.m1;
import androidx.datastore.preferences.protobuf.n1;
import androidx.datastore.preferences.protobuf.y1;
import java.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gx extends y1 implements DescriptorProtos$UninterpretedOptionOrBuilder {
    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final String getAggregateValue() {
        return ((n1) this.b).getAggregateValue();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final ByteString getAggregateValueBytes() {
        return ((n1) this.b).getAggregateValueBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final double getDoubleValue() {
        return ((n1) this.b).getDoubleValue();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final String getIdentifierValue() {
        return ((n1) this.b).getIdentifierValue();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final ByteString getIdentifierValueBytes() {
        return ((n1) this.b).getIdentifierValueBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final m1 getName(int i) {
        return ((n1) this.b).getName(i);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final int getNameCount() {
        return ((n1) this.b).getNameCount();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final List getNameList() {
        return DesugarCollections.unmodifiableList(((n1) this.b).getNameList());
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final long getNegativeIntValue() {
        return ((n1) this.b).getNegativeIntValue();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final long getPositiveIntValue() {
        return ((n1) this.b).getPositiveIntValue();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final ByteString getStringValue() {
        return ((n1) this.b).getStringValue();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final boolean hasAggregateValue() {
        return ((n1) this.b).hasAggregateValue();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final boolean hasDoubleValue() {
        return ((n1) this.b).hasDoubleValue();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final boolean hasIdentifierValue() {
        return ((n1) this.b).hasIdentifierValue();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final boolean hasNegativeIntValue() {
        return ((n1) this.b).hasNegativeIntValue();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final boolean hasPositiveIntValue() {
        return ((n1) this.b).hasPositiveIntValue();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final boolean hasStringValue() {
        return ((n1) this.b).hasStringValue();
    }
}
