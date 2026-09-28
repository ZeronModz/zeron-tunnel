package defpackage;

import androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.y1;
import java.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ay0 extends y1 implements PreferencesProto$StringSetOrBuilder {
    @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
    public final String getStrings(int i) {
        return ((by0) this.b).getStrings(i);
    }

    @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
    public final ByteString getStringsBytes(int i) {
        return ((by0) this.b).getStringsBytes(i);
    }

    @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
    public final int getStringsCount() {
        return ((by0) this.b).getStringsCount();
    }

    @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
    public final List getStringsList() {
        return DesugarCollections.unmodifiableList(((by0) this.b).getStringsList());
    }
}
