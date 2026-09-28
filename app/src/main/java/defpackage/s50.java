package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.Field$Cardinality;
import androidx.datastore.preferences.protobuf.Field$Kind;
import androidx.datastore.preferences.protobuf.FieldOrBuilder;
import androidx.datastore.preferences.protobuf.t1;
import androidx.datastore.preferences.protobuf.w2;
import androidx.datastore.preferences.protobuf.y1;
import java.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class s50 extends y1 implements FieldOrBuilder {
    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final Field$Cardinality getCardinality() {
        return ((t1) this.b).getCardinality();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final int getCardinalityValue() {
        return ((t1) this.b).getCardinalityValue();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final String getDefaultValue() {
        return ((t1) this.b).getDefaultValue();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final ByteString getDefaultValueBytes() {
        return ((t1) this.b).getDefaultValueBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final String getJsonName() {
        return ((t1) this.b).getJsonName();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final ByteString getJsonNameBytes() {
        return ((t1) this.b).getJsonNameBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final Field$Kind getKind() {
        return ((t1) this.b).getKind();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final int getKindValue() {
        return ((t1) this.b).getKindValue();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final String getName() {
        return ((t1) this.b).getName();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final ByteString getNameBytes() {
        return ((t1) this.b).getNameBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final int getNumber() {
        return ((t1) this.b).getNumber();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final int getOneofIndex() {
        return ((t1) this.b).getOneofIndex();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final w2 getOptions(int i) {
        return ((t1) this.b).getOptions(i);
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final int getOptionsCount() {
        return ((t1) this.b).getOptionsCount();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final List getOptionsList() {
        return DesugarCollections.unmodifiableList(((t1) this.b).getOptionsList());
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final boolean getPacked() {
        return ((t1) this.b).getPacked();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final String getTypeUrl() {
        return ((t1) this.b).getTypeUrl();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final ByteString getTypeUrlBytes() {
        return ((t1) this.b).getTypeUrlBytes();
    }
}
