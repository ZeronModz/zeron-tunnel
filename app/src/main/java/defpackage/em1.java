package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.NullValue;
import androidx.datastore.preferences.protobuf.Value$KindCase;
import androidx.datastore.preferences.protobuf.ValueOrBuilder;
import androidx.datastore.preferences.protobuf.f2;
import androidx.datastore.preferences.protobuf.g3;
import androidx.datastore.preferences.protobuf.n3;
import androidx.datastore.preferences.protobuf.y1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class em1 extends y1 implements ValueOrBuilder {
    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final boolean getBoolValue() {
        return ((n3) this.b).getBoolValue();
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final Value$KindCase getKindCase() {
        return ((n3) this.b).getKindCase();
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final f2 getListValue() {
        return ((n3) this.b).getListValue();
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final NullValue getNullValue() {
        return ((n3) this.b).getNullValue();
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final int getNullValueValue() {
        return ((n3) this.b).getNullValueValue();
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final double getNumberValue() {
        return ((n3) this.b).getNumberValue();
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final String getStringValue() {
        return ((n3) this.b).getStringValue();
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final ByteString getStringValueBytes() {
        return ((n3) this.b).getStringValueBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final g3 getStructValue() {
        return ((n3) this.b).getStructValue();
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final boolean hasBoolValue() {
        return ((n3) this.b).hasBoolValue();
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final boolean hasListValue() {
        return ((n3) this.b).hasListValue();
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final boolean hasNullValue() {
        return ((n3) this.b).hasNullValue();
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final boolean hasNumberValue() {
        return ((n3) this.b).hasNumberValue();
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final boolean hasStringValue() {
        return ((n3) this.b).hasStringValue();
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final boolean hasStructValue() {
        return ((n3) this.b).hasStructValue();
    }
}
