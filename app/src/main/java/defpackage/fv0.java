package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.OptionOrBuilder;
import androidx.datastore.preferences.protobuf.c;
import androidx.datastore.preferences.protobuf.w2;
import androidx.datastore.preferences.protobuf.y1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fv0 extends y1 implements OptionOrBuilder {
    @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public final String getName() {
        return ((w2) this.b).getName();
    }

    @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public final ByteString getNameBytes() {
        return ((w2) this.b).getNameBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public final c getValue() {
        return ((w2) this.b).getValue();
    }

    @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public final boolean hasValue() {
        return ((w2) this.b).hasValue();
    }
}
