package defpackage;

import androidx.datastore.preferences.protobuf.DescriptorProtos$Edition;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefaultOrBuilder;
import androidx.datastore.preferences.protobuf.n0;
import androidx.datastore.preferences.protobuf.o0;
import androidx.datastore.preferences.protobuf.y1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class uw extends y1 implements DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefaultOrBuilder {
    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefaultOrBuilder
    public final DescriptorProtos$Edition getEdition() {
        return ((o0) this.b).getEdition();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefaultOrBuilder
    public final n0 getFixedFeatures() {
        return ((o0) this.b).getFixedFeatures();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefaultOrBuilder
    public final n0 getOverridableFeatures() {
        return ((o0) this.b).getOverridableFeatures();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefaultOrBuilder
    public final boolean hasEdition() {
        return ((o0) this.b).hasEdition();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefaultOrBuilder
    public final boolean hasFixedFeatures() {
        return ((o0) this.b).hasFixedFeatures();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefaultOrBuilder
    public final boolean hasOverridableFeatures() {
        return ((o0) this.b).hasOverridableFeatures();
    }
}
