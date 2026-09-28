package defpackage;

import androidx.datastore.preferences.protobuf.AnyOrBuilder;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.c;
import androidx.datastore.preferences.protobuf.y1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class g5 extends y1 implements AnyOrBuilder {
    @Override // androidx.datastore.preferences.protobuf.AnyOrBuilder
    public final String getTypeUrl() {
        return ((c) this.b).getTypeUrl();
    }

    @Override // androidx.datastore.preferences.protobuf.AnyOrBuilder
    public final ByteString getTypeUrlBytes() {
        return ((c) this.b).getTypeUrlBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.AnyOrBuilder
    public final ByteString getValue() {
        return ((c) this.b).getValue();
    }
}
