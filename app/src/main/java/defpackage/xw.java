package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.DescriptorProtos$Edition;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$EditionDefaultOrBuilder;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.y1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xw extends y1 implements DescriptorProtos$FieldOptions$EditionDefaultOrBuilder {
    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$EditionDefaultOrBuilder
    public final DescriptorProtos$Edition getEdition() {
        return ((s0) this.b).getEdition();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$EditionDefaultOrBuilder
    public final String getValue() {
        return ((s0) this.b).getValue();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$EditionDefaultOrBuilder
    public final ByteString getValueBytes() {
        return ((s0) this.b).getValueBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$EditionDefaultOrBuilder
    public final boolean hasEdition() {
        return ((s0) this.b).hasEdition();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$EditionDefaultOrBuilder
    public final boolean hasValue() {
        return ((s0) this.b).hasValue();
    }
}
