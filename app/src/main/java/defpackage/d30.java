package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.EnumValueOrBuilder;
import androidx.datastore.preferences.protobuf.q1;
import androidx.datastore.preferences.protobuf.w2;
import androidx.datastore.preferences.protobuf.y1;
import java.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class d30 extends y1 implements EnumValueOrBuilder {
    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public final String getName() {
        return ((q1) this.b).getName();
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public final ByteString getNameBytes() {
        return ((q1) this.b).getNameBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public final int getNumber() {
        return ((q1) this.b).getNumber();
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public final w2 getOptions(int i) {
        return ((q1) this.b).getOptions(i);
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public final int getOptionsCount() {
        return ((q1) this.b).getOptionsCount();
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public final List getOptionsList() {
        return DesugarCollections.unmodifiableList(((q1) this.b).getOptionsList());
    }
}
