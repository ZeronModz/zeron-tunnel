package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.DescriptorProtos$Edition;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$FeatureSupportOrBuilder;
import androidx.datastore.preferences.protobuf.t0;
import androidx.datastore.preferences.protobuf.y1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yw extends y1 implements DescriptorProtos$FieldOptions$FeatureSupportOrBuilder {
    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$FeatureSupportOrBuilder
    public final String getDeprecationWarning() {
        return ((t0) this.b).getDeprecationWarning();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$FeatureSupportOrBuilder
    public final ByteString getDeprecationWarningBytes() {
        return ((t0) this.b).getDeprecationWarningBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$FeatureSupportOrBuilder
    public final DescriptorProtos$Edition getEditionDeprecated() {
        return ((t0) this.b).getEditionDeprecated();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$FeatureSupportOrBuilder
    public final DescriptorProtos$Edition getEditionIntroduced() {
        return ((t0) this.b).getEditionIntroduced();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$FeatureSupportOrBuilder
    public final DescriptorProtos$Edition getEditionRemoved() {
        return ((t0) this.b).getEditionRemoved();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$FeatureSupportOrBuilder
    public final boolean hasDeprecationWarning() {
        return ((t0) this.b).hasDeprecationWarning();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$FeatureSupportOrBuilder
    public final boolean hasEditionDeprecated() {
        return ((t0) this.b).hasEditionDeprecated();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$FeatureSupportOrBuilder
    public final boolean hasEditionIntroduced() {
        return ((t0) this.b).hasEditionIntroduced();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$FeatureSupportOrBuilder
    public final boolean hasEditionRemoved() {
        return ((t0) this.b).hasEditionRemoved();
    }
}
